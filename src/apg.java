import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.io.File;
import java.net.SocketAddress;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public abstract class apg {
   public static final File b = new File("banned-players.json");
   public static final File c = new File("banned-ips.json");
   public static final File d = new File("ops.json");
   public static final File e = new File("whitelist.json");
   public static final ui f = ui.c("chat.filtered_full");
   public static final ui g = ui.c("multiplayer.disconnect.duplicate_login");
   private static final Logger a = LogUtils.getLogger();
   private static final int i = 600;
   private static final SimpleDateFormat j = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
   private final MinecraftServer k;
   private final List<alr> l = Lists.newArrayList();
   private final Map<UUID, alr> m = Maps.newHashMap();
   private final apm n = new apm(b);
   private final apd o = new apd(c);
   private final aph p = new aph(d);
   private final apo q = new apo(e);
   private final Map<UUID, aqj> r = Maps.newHashMap();
   private final Map<UUID, age> s = Maps.newHashMap();
   private final edb t;
   private boolean u;
   private final ij<agf> v;
   protected final int h;
   private int w;
   private int x;
   private boolean y;
   private static final boolean z = false;
   private int A;

   public apg(MinecraftServer $$0, ij<agf> $$1, edb $$2, int $$3) {
      this.k = $$0;
      this.v = $$1;
      this.h = $$3;
      this.t = $$2;
   }

   public void a(tj $$0, alr $$1, amf $$2) {
      GameProfile $$3 = $$1.fR();
      apc $$4 = this.k.ap();
      String $$6;
      if ($$4 != null) {
         Optional<GameProfile> $$5 = $$4.a($$3.getId());
         $$6 = $$5.<String>map(GameProfile::getName).orElse($$3.getName());
         $$4.a($$3);
      } else {
         $$6 = $$3.getName();
      }

      rt $$8 = this.a($$1);
      afv<cqz> $$9 = $$8 != null ? djk.a(new Dynamic(sf.a, $$8.c("Dimension"))).resultOrPartial(a::error).orElse(cqz.h) : cqz.h;
      alq $$10 = this.k.a($$9);
      alq $$11;
      if ($$10 == null) {
         a.warn("Unknown respawn dimension {}, defaulting to overworld", $$9);
         $$11 = this.k.D();
      } else {
         $$11 = $$10;
      }

      $$1.c($$11);
      String $$13 = $$0.a(this.k.be());
      a.info("{}[{}] logged in with entity id {} at ({}, {}, {})", new Object[]{$$1.ab().getString(), $$13, $$1.ah(), $$1.dq(), $$1.ds(), $$1.dw()});
      ecv $$14 = $$11.A_();
      $$1.c($$8);
      amp $$15 = new amp(this.k, $$0, $$1, $$2);
      cqv $$16 = $$11.X();
      boolean $$17 = $$16.b(cqv.C);
      boolean $$18 = $$16.b(cqv.p);
      boolean $$19 = $$16.b(cqv.v);
      $$15.b(new zj($$1.ah(), $$14.n(), this.k.E(), this.n(), this.w, this.x, $$18, !$$17, $$19, $$1.d($$11)));
      $$15.b(new yg($$14.s(), $$14.t()));
      $$15.b(new zs($$1.fT()));
      $$15.b(new aaq($$1.fS().l));
      $$15.b(new abw(this.k.aE().b()));
      this.d($$1);
      $$1.F().c();
      $$1.G().a($$1);
      this.a($$11.f(), $$1);
      this.k.ar();
      uw $$20;
      if ($$1.fR().getName().equalsIgnoreCase($$6)) {
         $$20 = ui.a("multiplayer.player.joined", $$1.O_());
      } else {
         $$20 = ui.a("multiplayer.player.joined.renamed", $$1.O_(), $$6);
      }

      this.a($$20.a(n.o), false);
      $$15.a($$1.dq(), $$1.ds(), $$1.dw(), $$1.dB(), $$1.dD());
      aex $$22 = this.k.aq();
      if ($$22 != null) {
         $$1.a($$22);
      }

      $$1.c.b(zy.a(this.l));
      this.l.add($$1);
      this.m.put($$1.cv(), $$1);
      this.a(zy.a(List.of($$1)));
      this.a($$1, $$11);
      $$11.c($$1);
      this.k.aJ().a($$1);

      for (bjg $$23 : $$1.er()) {
         $$15.b(new abv($$1.ah(), $$23));
      }

      if ($$8 != null && $$8.b("RootVehicle", 10)) {
         rt $$24 = $$8.p("RootVehicle");
         bjt $$25 = bjx.a($$24.p("Entity"), $$11, $$1x -> !$$11.c($$1x) ? null : $$1x);
         if ($$25 != null) {
            UUID $$26;
            if ($$24.b("Attach")) {
               $$26 = $$24.a("Attach");
            } else {
               $$26 = null;
            }

            if ($$25.cv().equals($$26)) {
               $$1.a($$25, true);
            } else {
               for (bjt $$28 : $$25.cT()) {
                  if ($$28.cv().equals($$26)) {
                     $$1.a($$28, true);
                     break;
                  }
               }
            }

            if (!$$1.bN()) {
               a.warn("Couldn't reattach entity to player");
               $$25.ak();

               for (bjt $$29 : $$25.cT()) {
                  $$29.ak();
               }
            }
         }
      }

      $$1.h();
   }

   protected void a(agn $$0, alr $$1) {
      Set<ejb> $$2 = Sets.newHashSet();

      for (ejc $$3 : $$0.g()) {
         $$1.c.b(abd.a($$3, true));
      }

      for (eja $$4 : eja.values()) {
         ejb $$5 = $$0.a($$4);
         if ($$5 != null && !$$2.contains($$5)) {
            for (wb<?> $$7 : $$0.d($$5)) {
               $$1.c.b($$7);
            }

            $$2.add($$5);
         }
      }
   }

   public void a(alq $$0) {
      $$0.C_().a(new dhq() {
         @Override
         public void a(dhs $$0, double $$1) {
            apg.this.a(new aam($$0));
         }

         @Override
         public void a(dhs $$0, double $$1, double $$2, long $$3) {
            apg.this.a(new aal($$0));
         }

         @Override
         public void a(dhs $$0, double $$1, double $$2) {
            apg.this.a(new aak($$0));
         }

         @Override
         public void a(dhs $$0, int $$1) {
            apg.this.a(new aan($$0));
         }

         @Override
         public void b(dhs $$0, int $$1) {
            apg.this.a(new aao($$0));
         }

         @Override
         public void b(dhs $$0, double $$1) {
         }

         @Override
         public void c(dhs $$0, double $$1) {
         }
      });
   }

   @Nullable
   public rt a(alr $$0) {
      rt $$1 = this.k.aT().y();
      rt $$2;
      if (this.k.a($$0.fR()) && $$1 != null) {
         $$2 = $$1;
         $$0.g($$1);
         a.debug("loading single player");
      } else {
         $$2 = this.t.b($$0);
      }

      return $$2;
   }

   protected void b(alr $$0) {
      this.t.a($$0);
      aqj $$1 = this.r.get($$0.cv());
      if ($$1 != null) {
         $$1.a();
      }

      age $$2 = this.s.get($$0.cv());
      if ($$2 != null) {
         $$2.b();
      }
   }

   public void c(alr $$0) {
      alq $$1 = $$0.x();
      $$0.a(aqn.j);
      this.b($$0);
      if ($$0.bN()) {
         bjt $$2 = $$0.cV();
         if ($$2.cU()) {
            a.debug("Removing player mount");
            $$0.aa();
            $$2.cS().forEach($$0x -> $$0x.b(bjt.c.d));
         }
      }

      $$0.ae();
      $$1.a($$0, bjt.c.d);
      $$0.O().a();
      this.l.remove($$0);
      this.k.aJ().b($$0);
      UUID $$3 = $$0.cv();
      alr $$4 = this.m.get($$3);
      if ($$4 == $$0) {
         this.m.remove($$3);
         this.r.remove($$3);
         this.s.remove($$3);
      }

      this.a(new zx(List.of($$0.cv())));
   }

   @Nullable
   public ui a(SocketAddress $$0, GameProfile $$1) {
      if (this.n.a($$1)) {
         apn $$2 = this.n.b($$1);
         uw $$3 = ui.a("multiplayer.disconnect.banned.reason", $$2.d());
         if ($$2.c() != null) {
            $$3.b(ui.a("multiplayer.disconnect.banned.expiration", j.format($$2.c())));
         }

         return $$3;
      } else if (!this.c($$1)) {
         return ui.c("multiplayer.disconnect.not_whitelisted");
      } else if (this.o.a($$0)) {
         ape $$4 = this.o.b($$0);
         uw $$5 = ui.a("multiplayer.disconnect.banned_ip.reason", $$4.d());
         if ($$4.c() != null) {
            $$5.b(ui.a("multiplayer.disconnect.banned_ip.expiration", j.format($$4.c())));
         }

         return $$5;
      } else {
         return this.l.size() >= this.h && !this.d($$1) ? ui.c("multiplayer.disconnect.server_full") : null;
      }
   }

   public alr a(GameProfile $$0, alf $$1) {
      return new alr(this.k, this.k.D(), $$0, $$1);
   }

   public boolean e(GameProfile $$0) {
      UUID $$1 = $$0.getId();
      Set<alr> $$2 = Sets.newIdentityHashSet();

      for (alr $$3 : this.l) {
         if ($$3.cv().equals($$1)) {
            $$2.add($$3);
         }
      }

      alr $$4 = this.m.get($$0.getId());
      if ($$4 != null) {
         $$2.add($$4);
      }

      for (alr $$5 : $$2) {
         $$5.c.b(g);
      }

      return !$$2.isEmpty();
   }

   public alr a(alr $$0, boolean $$1) {
      this.l.remove($$0);
      $$0.x().a($$0, bjt.c.b);
      ht $$2 = $$0.P();
      float $$3 = $$0.Q();
      boolean $$4 = $$0.S();
      alq $$5 = this.k.a($$0.R());
      Optional<eif> $$6;
      if ($$5 != null && $$2 != null) {
         $$6 = ccx.a($$5, $$2, $$3, $$4, $$1);
      } else {
         $$6 = Optional.empty();
      }

      alq $$8 = $$5 != null && $$6.isPresent() ? $$5 : this.k.D();
      alr $$9 = new alr(this.k, $$8, $$0.fR(), $$0.z());
      $$9.c = $$0.c;
      $$9.a($$0, $$1);
      $$9.e($$0.ah());
      $$9.a($$0.fm());

      for (String $$10 : $$0.ai()) {
         $$9.a($$10);
      }

      boolean $$11 = false;
      if ($$6.isPresent()) {
         dgb $$12 = $$8.a_($$2);
         boolean $$13 = $$12.a(cuc.pl);
         eif $$14 = $$6.get();
         float $$17;
         if (!$$12.a(aqs.R) && !$$13) {
            $$17 = $$3;
         } else {
            eif $$15 = eif.c($$2).d($$14).d();
            $$17 = (float)asy.d(asy.d($$15.e, $$15.c) * 180.0F / (float)Math.PI - 90.0);
         }

         $$9.b($$14.c, $$14.d, $$14.e, $$17, 0.0F);
         $$9.a($$8.ac(), $$2, $$3, $$4, false);
         $$11 = !$$1 && $$13;
      } else if ($$2 != null) {
         $$9.c.b(new yz(yz.a, 0.0F));
      }

      while (!$$8.g($$9) && $$9.ds() < (double)$$8.aj()) {
         $$9.e($$9.dq(), $$9.ds() + 1.0, $$9.dw());
      }

      byte $$18 = (byte)($$1 ? 1 : 0);
      alq $$19 = $$9.x();
      ecv $$20 = $$19.A_();
      $$9.c.b(new aae($$9.d($$19), $$18));
      $$9.c.a($$9.dq(), $$9.ds(), $$9.dw(), $$9.dB(), $$9.dD());
      $$9.c.b(new aat($$8.R(), $$8.S()));
      $$9.c.b(new yg($$20.s(), $$20.t()));
      $$9.c.b(new aaz($$9.ch, $$9.cg, $$9.cf));
      this.a($$9, $$8);
      this.d($$9);
      $$8.d($$9);
      this.l.add($$9);
      this.m.put($$9.cv(), $$9);
      $$9.h();
      $$9.c($$9.eu());
      if ($$11) {
         $$9.c.b(new abl(aqd.tN, aqe.e, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0F, 1.0F, $$8.E_().g()));
      }

      return $$9;
   }

   public void d(alr $$0) {
      GameProfile $$1 = $$0.fR();
      int $$2 = this.k.c($$1);
      this.a($$0, $$2);
   }

   public void d() {
      if (++this.A > 600) {
         this.a(new zy(EnumSet.of(zy.a.e), this.l));
         this.A = 0;
      }
   }

   public void a(wb<?> $$0) {
      for (alr $$1 : this.l) {
         $$1.c.b($$0);
      }
   }

   public void a(wb<?> $$0, afv<cqz> $$1) {
      for (alr $$2 : this.l) {
         if ($$2.dL().ac() == $$1) {
            $$2.c.b($$0);
         }
      }
   }

   public void a(ccx $$0, ui $$1) {
      ejg $$2 = $$0.cf();
      if ($$2 != null) {
         for (String $$4 : $$2.g()) {
            alr $$5 = this.a($$4);
            if ($$5 != null && $$5 != $$0) {
               $$5.a($$1);
            }
         }
      }
   }

   public void b(ccx $$0, ui $$1) {
      ejg $$2 = $$0.cf();
      if ($$2 == null) {
         this.a($$1, false);
      } else {
         for (int $$3 = 0; $$3 < this.l.size(); $$3++) {
            alr $$4 = this.l.get($$3);
            if ($$4.cf() != $$2) {
               $$4.a($$1);
            }
         }
      }
   }

   public String[] e() {
      String[] $$0 = new String[this.l.size()];

      for (int $$1 = 0; $$1 < this.l.size(); $$1++) {
         $$0[$$1] = this.l.get($$1).fR().getName();
      }

      return $$0;
   }

   public apm f() {
      return this.n;
   }

   public apd g() {
      return this.o;
   }

   public void a(GameProfile $$0) {
      this.p.a(new api($$0, this.k.i(), this.p.a($$0)));
      alr $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.d($$1);
      }
   }

   public void b(GameProfile $$0) {
      this.p.c($$0);
      alr $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.d($$1);
      }
   }

   private void a(alr $$0, int $$1) {
      if ($$0.c != null) {
         byte $$2;
         if ($$1 <= 0) {
            $$2 = 24;
         } else if ($$1 >= 4) {
            $$2 = 28;
         } else {
            $$2 = (byte)(24 + $$1);
         }

         $$0.c.b(new yw($$0, $$2));
      }

      this.k.aC().a($$0);
   }

   public boolean c(GameProfile $$0) {
      return !this.u || this.p.d($$0) || this.q.d($$0);
   }

   public boolean f(GameProfile $$0) {
      return this.p.d($$0) || this.k.a($$0) && this.k.aT().o() || this.y;
   }

   @Nullable
   public alr a(String $$0) {
      for (alr $$1 : this.l) {
         if ($$1.fR().getName().equalsIgnoreCase($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(@Nullable ccx $$0, double $$1, double $$2, double $$3, double $$4, afv<cqz> $$5, wb<?> $$6) {
      for (int $$7 = 0; $$7 < this.l.size(); $$7++) {
         alr $$8 = this.l.get($$7);
         if ($$8 != $$0 && $$8.dL().ac() == $$5) {
            double $$9 = $$1 - $$8.dq();
            double $$10 = $$2 - $$8.ds();
            double $$11 = $$3 - $$8.dw();
            if ($$9 * $$9 + $$10 * $$10 + $$11 * $$11 < $$4 * $$4) {
               $$8.c.b($$6);
            }
         }
      }
   }

   public void h() {
      for (int $$0 = 0; $$0 < this.l.size(); $$0++) {
         this.b(this.l.get($$0));
      }
   }

   public apo i() {
      return this.q;
   }

   public String[] j() {
      return this.q.a();
   }

   public aph k() {
      return this.p;
   }

   public String[] l() {
      return this.p.a();
   }

   public void a() {
   }

   public void a(alr $$0, alq $$1) {
      dhs $$2 = this.k.D().C_();
      $$0.c.b(new zc($$2));
      $$0.c.b(new abh($$1.V(), $$1.W(), $$1.X().b(cqv.k)));
      $$0.c.b(new aat($$1.R(), $$1.S()));
      if ($$1.Z()) {
         $$0.c.b(new yz(yz.b, 0.0F));
         $$0.c.b(new yz(yz.h, $$1.d(1.0F)));
         $$0.c.b(new yz(yz.i, $$1.b(1.0F)));
      }

      $$0.c.b(new yz(yz.n, 0.0F));
   }

   public void e(alr $$0) {
      $$0.bR.b();
      $$0.u();
      $$0.c.b(new aaq($$0.fS().l));
   }

   public int m() {
      return this.l.size();
   }

   public int n() {
      return this.h;
   }

   public boolean o() {
      return this.u;
   }

   public void a(boolean $$0) {
      this.u = $$0;
   }

   public List<alr> b(String $$0) {
      List<alr> $$1 = Lists.newArrayList();

      for (alr $$2 : this.l) {
         if ($$2.y().equals($$0)) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public int p() {
      return this.w;
   }

   public int q() {
      return this.x;
   }

   public MinecraftServer c() {
      return this.k;
   }

   @Nullable
   public rt r() {
      return null;
   }

   public void b(boolean $$0) {
      this.y = $$0;
   }

   public void s() {
      for (int $$0 = 0; $$0 < this.l.size(); $$0++) {
         this.l.get($$0).c.b(ui.c("multiplayer.disconnect.server_shutdown"));
      }
   }

   public void a(ui $$0, boolean $$1) {
      this.a($$0, $$1x -> $$0, $$1);
   }

   public void a(ui $$0, Function<alr, ui> $$1, boolean $$2) {
      this.k.a($$0);

      for (alr $$3 : this.l) {
         ui $$4 = $$1.apply($$3);
         if ($$4 != null) {
            $$3.b($$4, $$2);
         }
      }
   }

   public void a(uy $$0, du $$1, ue.a $$2) {
      this.a($$0, $$1::a, $$1.j(), $$2);
   }

   public void a(uy $$0, alr $$1, ue.a $$2) {
      this.a($$0, $$1::b, $$1, $$2);
   }

   private void a(uy $$0, Predicate<alr> $$1, @Nullable alr $$2, ue.a $$3) {
      boolean $$4 = this.a($$0);
      this.k.a($$0.c(), $$3, $$4 ? null : "Not Secure");
      ux $$5 = ux.a($$0);
      boolean $$6 = false;

      for (alr $$7 : this.l) {
         boolean $$8 = $$1.test($$7);
         $$7.a($$5, $$8, $$3);
         $$6 |= $$8 && $$0.i();
      }

      if ($$6 && $$2 != null) {
         $$2.a(f);
      }
   }

   private boolean a(uy $$0) {
      return $$0.h() && !$$0.a(Instant.now());
   }

   public aqj a(ccx $$0) {
      UUID $$1 = $$0.cv();
      aqj $$2 = this.r.get($$1);
      if ($$2 == null) {
         File $$3 = this.k.a(ecw.b).toFile();
         File $$4 = new File($$3, $$1 + ".json");
         if (!$$4.exists()) {
            File $$5 = new File($$3, $$0.ab().getString() + ".json");
            Path $$6 = $$5.toPath();
            if (v.a($$6) && v.b($$6) && $$6.startsWith($$3.getPath()) && $$5.isFile()) {
               $$5.renameTo($$4);
            }
         }

         $$2 = new aqj(this.k, $$4);
         this.r.put($$1, $$2);
      }

      return $$2;
   }

   public age f(alr $$0) {
      UUID $$1 = $$0.cv();
      age $$2 = this.s.get($$1);
      if ($$2 == null) {
         Path $$3 = this.k.a(ecw.a).resolve($$1 + ".json");
         $$2 = new age(this.k.ay(), this, this.k.az(), $$3, $$0);
         this.s.put($$1, $$2);
      }

      $$2.a($$0);
      return $$2;
   }

   public void a(int $$0) {
      this.w = $$0;
      this.a(new aas($$0));

      for (alq $$1 : this.k.F()) {
         if ($$1 != null) {
            $$1.k().a($$0);
         }
      }
   }

   public void b(int $$0) {
      this.x = $$0;
      this.a(new abf($$0));

      for (alq $$1 : this.k.F()) {
         if ($$1 != null) {
            $$1.k().b($$0);
         }
      }
   }

   public List<alr> t() {
      return this.l;
   }

   @Nullable
   public alr a(UUID $$0) {
      return this.m.get($$0);
   }

   public boolean d(GameProfile $$0) {
      return false;
   }

   public void u() {
      for (age $$0 : this.s.values()) {
         $$0.a(this.k.az());
      }

      this.a(new wk(ark.a(this.v)));
      abw $$1 = new abw(this.k.aE().b());

      for (alr $$2 : this.l) {
         $$2.c.b($$1);
         $$2.G().a($$2);
      }
   }

   public boolean v() {
      return this.y;
   }
}
