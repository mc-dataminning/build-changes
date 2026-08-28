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

public abstract class avh {
   public static final File a = new File("banned-players.json");
   public static final File b = new File("banned-ips.json");
   public static final File c = new File("ops.json");
   public static final File d = new File("whitelist.json");
   public static final xd e = xd.c("chat.filtered_full");
   public static final xd f = xd.c("multiplayer.disconnect.duplicate_login");
   private static final Logger h = LogUtils.getLogger();
   private static final int i = 600;
   private static final SimpleDateFormat j = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
   private final MinecraftServer k;
   private final List<ari> l = Lists.newArrayList();
   private final Map<UUID, ari> m = Maps.newHashMap();
   private final avn n = new avn(a);
   private final ave o = new ave(b);
   private final avi p = new avi(c);
   private final avp q = new avp(d);
   private final Map<UUID, awk> r = Maps.newHashMap();
   private final Map<UUID, alk> s = Maps.newHashMap();
   private final esy t;
   private boolean u;
   private final ju<all> v;
   protected final int g;
   private int w;
   private int x;
   private boolean y;
   private static final boolean z = false;
   private int A;

   public avh(MinecraftServer $$0, ju<all> $$1, esy $$2, int $$3) {
      this.k = $$0;
      this.v = $$1;
      this.g = $$3;
      this.t = $$2;
   }

   public void a(vx $$0, ari $$1, arw $$2) {
      GameProfile $$3 = $$1.gb();
      avd $$4 = this.k.at();
      String $$6;
      if ($$4 != null) {
         Optional<GameProfile> $$5 = $$4.a($$3.getId());
         $$6 = $$5.<String>map(GameProfile::getName).orElse($$3.getName());
         $$4.a($$3);
      } else {
         $$6 = $$3.getName();
      }

      Optional<uf> $$8 = this.a($$1);
      alb<deg> $$9 = $$8.<alb<deg>>flatMap($$0x -> dyk.a(new Dynamic(ut.a, $$0x.c("Dimension"))).resultOrPartial(h::error)).orElse(deg.h);
      arh $$10 = this.k.a($$9);
      arh $$11;
      if ($$10 == null) {
         h.warn("Unknown respawn dimension {}, defaulting to overworld", $$9);
         $$11 = this.k.J();
      } else {
         $$11 = $$10;
      }

      $$1.a($$11);
      String $$13 = $$0.a(this.k.bm());
      h.info("{}[{}] logged in with entity id {} at ({}, {}, {})", new Object[]{$$1.aj().getString(), $$13, $$1.ap(), $$1.dx(), $$1.dz(), $$1.dD()});
      esr $$14 = $$11.y_();
      $$1.c($$8.orElse(null));
      asj $$15 = new asj(this.k, $$0, $$1, $$2);
      $$0.a(agp.a.a(wo.a(this.k.bb())), $$15);
      dec $$16 = $$11.ac();
      boolean $$17 = $$16.b(dec.D);
      boolean $$18 = $$16.b(dec.q);
      boolean $$19 = $$16.b(dec.w);
      $$15.b(new adq($$1.ap(), $$14.l(), this.k.K(), this.n(), this.w, this.x, $$18, !$$17, $$19, $$1.b($$11), this.k.aA()));
      $$15.b(new acm($$14.q(), $$14.r()));
      $$15.b(new aea($$1.gd()));
      $$15.b(new afl($$1.gc().j));
      $$15.b(new agk(this.k.aI().e()));
      this.e($$1);
      $$1.J().c();
      $$1.K().a($$1);
      this.a($$11.f(), $$1);
      this.k.av();
      xr $$20;
      if ($$1.gb().getName().equalsIgnoreCase($$6)) {
         $$20 = xd.a("multiplayer.player.joined", $$1.Q_());
      } else {
         $$20 = xd.a("multiplayer.player.joined.renamed", $$1.Q_(), $$6);
      }

      this.a($$20.a(n.o), false);
      $$15.a($$1.dx(), $$1.dz(), $$1.dD(), $$1.dI(), $$1.dK());
      aka $$22 = this.k.au();
      if ($$22 != null && !$$2.d()) {
         $$1.a($$22);
      }

      $$1.c.b(aeg.a(this.l));
      this.l.add($$1);
      this.m.put($$1.cD(), $$1);
      this.a(aeg.a(List.of($$1)));
      this.a($$1, $$11);
      $$11.a($$1);
      this.k.aM().a($$1);
      this.d($$1);
      if ($$8.isPresent() && $$8.get().b("RootVehicle", 10)) {
         uf $$23 = $$8.get().p("RootVehicle");
         bto $$24 = btv.a($$23.p("Entity"), $$11, btu.r, $$1x -> !$$11.c($$1x) ? null : $$1x);
         if ($$24 != null) {
            UUID $$25;
            if ($$23.b("Attach")) {
               $$25 = $$23.a("Attach");
            } else {
               $$25 = null;
            }

            if ($$24.cD().equals($$25)) {
               $$1.a($$24, true);
            } else {
               for (bto $$27 : $$24.da()) {
                  if ($$27.cD().equals($$25)) {
                     $$1.a($$27, true);
                     break;
                  }
               }
            }

            if (!$$1.bW()) {
               h.warn("Couldn't reattach entity to player");
               $$24.as();

               for (bto $$28 : $$24.da()) {
                  $$28.as();
               }
            }
         }
      }

      $$1.h();
   }

   protected void a(alv $$0, ari $$1) {
      Set<ezp> $$2 = Sets.newHashSet();

      for (ezs $$3 : $$0.g()) {
         $$1.c.b(afp.a($$3, true));
      }

      for (ezo $$4 : ezo.values()) {
         ezp $$5 = $$0.a($$4);
         if ($$5 != null && !$$2.contains($$5)) {
            for (zk<?> $$7 : $$0.d($$5)) {
               $$1.c.b($$7);
            }

            $$2.add($$5);
         }
      }
   }

   public void a(arh $$0) {
      $$0.A_().a(new dwd() {
         @Override
         public void a(dwf $$0, double $$1) {
            avh.this.a(new aew($$0));
         }

         @Override
         public void a(dwf $$0, double $$1, double $$2, long $$3) {
            avh.this.a(new aev($$0));
         }

         @Override
         public void a(dwf $$0, double $$1, double $$2) {
            avh.this.a(new aeu($$0));
         }

         @Override
         public void a(dwf $$0, int $$1) {
            avh.this.a(new aex($$0));
         }

         @Override
         public void b(dwf $$0, int $$1) {
            avh.this.a(new aey($$0));
         }

         @Override
         public void b(dwf $$0, double $$1) {
         }

         @Override
         public void c(dwf $$0, double $$1) {
         }
      });
   }

   public Optional<uf> a(ari $$0) {
      uf $$1 = this.k.ba().w();
      Optional<uf> $$2;
      if (this.k.a($$0.gb()) && $$1 != null) {
         $$2 = Optional.of($$1);
         $$0.g($$1);
         h.debug("loading single player");
      } else {
         $$2 = this.t.b($$0);
      }

      return $$2;
   }

   protected void b(ari $$0) {
      this.t.a($$0);
      awk $$1 = this.r.get($$0.cD());
      if ($$1 != null) {
         $$1.a();
      }

      alk $$2 = this.s.get($$0.cD());
      if ($$2 != null) {
         $$2.b();
      }
   }

   public void c(ari $$0) {
      arh $$1 = $$0.B();
      $$0.a(awo.j);
      this.b($$0);
      if ($$0.bW()) {
         bto $$2 = $$0.dd();
         if ($$2.dc()) {
            h.debug("Removing player mount");
            $$0.af();
            $$2.cZ().forEach($$0x -> $$0x.b(bto.c.d));
         }
      }

      $$0.am();
      $$1.a($$0, bto.c.d);
      $$0.T().a();
      this.l.remove($$0);
      this.k.aM().b($$0);
      UUID $$3 = $$0.cD();
      ari $$4 = this.m.get($$3);
      if ($$4 == $$0) {
         this.m.remove($$3);
         this.r.remove($$3);
         this.s.remove($$3);
      }

      this.a(new aef(List.of($$0.cD())));
   }

   @Nullable
   public xd a(SocketAddress $$0, GameProfile $$1) {
      if (this.n.a($$1)) {
         avo $$2 = this.n.b($$1);
         xr $$3 = xd.a("multiplayer.disconnect.banned.reason", $$2.d());
         if ($$2.c() != null) {
            $$3.b(xd.a("multiplayer.disconnect.banned.expiration", j.format($$2.c())));
         }

         return $$3;
      } else if (!this.c($$1)) {
         return xd.c("multiplayer.disconnect.not_whitelisted");
      } else if (this.o.a($$0)) {
         avf $$4 = this.o.b($$0);
         xr $$5 = xd.a("multiplayer.disconnect.banned_ip.reason", $$4.d());
         if ($$4.c() != null) {
            $$5.b(xd.a("multiplayer.disconnect.banned_ip.expiration", j.format($$4.c())));
         }

         return $$5;
      } else {
         return this.l.size() >= this.g && !this.d($$1) ? xd.c("multiplayer.disconnect.server_full") : null;
      }
   }

   public ari a(GameProfile $$0, aqt $$1) {
      return new ari(this.k, this.k.J(), $$0, $$1);
   }

   public boolean e(GameProfile $$0) {
      UUID $$1 = $$0.getId();
      Set<ari> $$2 = Sets.newIdentityHashSet();

      for (ari $$3 : this.l) {
         if ($$3.cD().equals($$1)) {
            $$2.add($$3);
         }
      }

      ari $$4 = this.m.get($$0.getId());
      if ($$4 != null) {
         $$2.add($$4);
      }

      for (ari $$5 : $$2) {
         $$5.c.a(f);
      }

      return !$$2.isEmpty();
   }

   public ari a(ari $$0, boolean $$1, bto.c $$2) {
      this.l.remove($$0);
      $$0.B().a($$0, $$2);
      ern $$3 = $$0.a(!$$1, ern.a);
      arh $$4 = $$3.a();
      ari $$5 = new ari(this.k, $$4, $$0.gb(), $$0.D());
      $$5.c = $$0.c;
      $$5.a($$0, $$1);
      $$5.e($$0.ap());
      $$5.b($$0.fu());
      if (!$$3.f()) {
         $$5.b($$0);
      }

      for (String $$6 : $$0.aq()) {
         $$5.a($$6);
      }

      eys $$7 = $$3.b();
      $$5.b($$7.d, $$7.e, $$7.f, $$3.d(), $$3.e());
      if ($$3.f()) {
         $$5.c.b(new adg(adg.b, 0.0F));
      }

      byte $$8 = (byte)($$1 ? 1 : 0);
      arh $$9 = $$5.B();
      esr $$10 = $$9.y_();
      $$5.c.b(new aeo($$5.b($$9), $$8));
      $$5.c.a($$5.dx(), $$5.dz(), $$5.dD(), $$5.dI(), $$5.dK());
      $$5.c.b(new afd($$4.W(), $$4.X()));
      $$5.c.b(new acm($$10.q(), $$10.r()));
      $$5.c.b(new afj($$5.co, $$5.cn, $$5.cm));
      this.d($$5);
      this.a($$5, $$4);
      this.e($$5);
      $$4.b($$5);
      this.l.add($$5);
      this.m.put($$5.cD(), $$5);
      $$5.h();
      $$5.x($$5.eA());
      je $$11 = $$5.U();
      arh $$12 = this.k.a($$5.W());
      if (!$$1 && $$11 != null && $$12 != null) {
         duo $$13 = $$12.a_($$11);
         if ($$13.a(dhl.pl)) {
            $$5.c.b(new afx(awe.vz, awf.e, (double)$$11.u(), (double)$$11.v(), (double)$$11.w(), 1.0F, 1.0F, $$4.C_().g()));
         }
      }

      return $$5;
   }

   public void d(ari $$0) {
      this.a($$0, $$0.c);
   }

   public void a(buk $$0, asj $$1) {
      for (bsv $$2 : $$0.ex()) {
         $$1.b(new agj($$0.ap(), $$2, false));
      }
   }

   public void e(ari $$0) {
      GameProfile $$1 = $$0.gb();
      int $$2 = this.k.c($$1);
      this.a($$0, $$2);
   }

   public void d() {
      if (++this.A > 600) {
         this.a(new aeg(EnumSet.of(aeg.a.e), this.l));
         this.A = 0;
      }
   }

   public void a(zk<?> $$0) {
      for (ari $$1 : this.l) {
         $$1.c.b($$0);
      }
   }

   public void a(zk<?> $$0, alb<deg> $$1) {
      for (ari $$2 : this.l) {
         if ($$2.dS().ag() == $$1) {
            $$2.c.b($$0);
         }
      }
   }

   public void a(cnu $$0, xd $$1) {
      ezz $$2 = $$0.co();
      if ($$2 != null) {
         for (String $$4 : $$2.g()) {
            ari $$5 = this.a($$4);
            if ($$5 != null && $$5 != $$0) {
               $$5.a($$1);
            }
         }
      }
   }

   public void b(cnu $$0, xd $$1) {
      ezz $$2 = $$0.co();
      if ($$2 == null) {
         this.a($$1, false);
      } else {
         for (int $$3 = 0; $$3 < this.l.size(); $$3++) {
            ari $$4 = this.l.get($$3);
            if ($$4.co() != $$2) {
               $$4.a($$1);
            }
         }
      }
   }

   public String[] e() {
      String[] $$0 = new String[this.l.size()];

      for (int $$1 = 0; $$1 < this.l.size(); $$1++) {
         $$0[$$1] = this.l.get($$1).gb().getName();
      }

      return $$0;
   }

   public avn f() {
      return this.n;
   }

   public ave g() {
      return this.o;
   }

   public void a(GameProfile $$0) {
      this.p.a(new avj($$0, this.k.k(), this.p.a($$0)));
      ari $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.e($$1);
      }
   }

   public void b(GameProfile $$0) {
      this.p.c($$0);
      ari $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.e($$1);
      }
   }

   private void a(ari $$0, int $$1) {
      if ($$0.c != null) {
         byte $$2;
         if ($$1 <= 0) {
            $$2 = 24;
         } else if ($$1 >= 4) {
            $$2 = 28;
         } else {
            $$2 = (byte)(24 + $$1);
         }

         $$0.c.b(new add($$0, $$2));
      }

      this.k.aG().a($$0);
   }

   public boolean c(GameProfile $$0) {
      return !this.u || this.p.d($$0) || this.q.d($$0);
   }

   public boolean f(GameProfile $$0) {
      return this.p.d($$0) || this.k.a($$0) && this.k.ba().m() || this.y;
   }

   @Nullable
   public ari a(String $$0) {
      int $$1 = this.l.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         ari $$3 = this.l.get($$2);
         if ($$3.gb().getName().equalsIgnoreCase($$0)) {
            return $$3;
         }
      }

      return null;
   }

   public void a(@Nullable cnu $$0, double $$1, double $$2, double $$3, double $$4, alb<deg> $$5, zk<?> $$6) {
      for (int $$7 = 0; $$7 < this.l.size(); $$7++) {
         ari $$8 = this.l.get($$7);
         if ($$8 != $$0 && $$8.dS().ag() == $$5) {
            double $$9 = $$1 - $$8.dx();
            double $$10 = $$2 - $$8.dz();
            double $$11 = $$3 - $$8.dD();
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

   public avp i() {
      return this.q;
   }

   public String[] j() {
      return this.q.a();
   }

   public avi k() {
      return this.p;
   }

   public String[] l() {
      return this.p.a();
   }

   public void a() {
   }

   public void a(ari $$0, arh $$1) {
      dwf $$2 = this.k.J().A_();
      $$0.c.b(new adj($$2));
      $$0.c.b(new aft($$1.aa(), $$1.ab(), $$1.ac().b(dec.l)));
      $$0.c.b(new afd($$1.W(), $$1.X()));
      if ($$1.ae()) {
         $$0.c.b(new adg(adg.c, 0.0F));
         $$0.c.b(new adg(adg.i, $$1.d(1.0F)));
         $$0.c.b(new adg(adg.j, $$1.b(1.0F)));
      }

      $$0.c.b(new adg(adg.o, 0.0F));
      this.k.aP().a($$0);
   }

   public void f(ari $$0) {
      $$0.bY.b();
      $$0.y();
      $$0.c.b(new afl($$0.gc().j));
   }

   public int m() {
      return this.l.size();
   }

   public int n() {
      return this.g;
   }

   public boolean o() {
      return this.u;
   }

   public void a(boolean $$0) {
      this.u = $$0;
   }

   public List<ari> b(String $$0) {
      List<ari> $$1 = Lists.newArrayList();

      for (ari $$2 : this.l) {
         if ($$2.C().equals($$0)) {
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
   public uf r() {
      return null;
   }

   public void b(boolean $$0) {
      this.y = $$0;
   }

   public void s() {
      for (int $$0 = 0; $$0 < this.l.size(); $$0++) {
         this.l.get($$0).c.a(xd.c("multiplayer.disconnect.server_shutdown"));
      }
   }

   public void a(xd $$0, boolean $$1) {
      this.a($$0, $$1x -> $$0, $$1);
   }

   public void a(xd $$0, Function<ari, xd> $$1, boolean $$2) {
      this.k.a($$0);

      for (ari $$3 : this.l) {
         xd $$4 = $$1.apply($$3);
         if ($$4 != null) {
            $$3.b($$4, $$2);
         }
      }
   }

   public void a(xt $$0, et $$1, wz.a $$2) {
      this.a($$0, $$1::a, $$1.i(), $$2);
   }

   public void a(xt $$0, ari $$1, wz.a $$2) {
      this.a($$0, $$1::c, $$1, $$2);
   }

   private void a(xt $$0, Predicate<ari> $$1, @Nullable ari $$2, wz.a $$3) {
      boolean $$4 = this.a($$0);
      this.k.a($$0.d(), $$3, $$4 ? null : "Not Secure");
      xs $$5 = xs.a($$0);
      boolean $$6 = false;

      for (ari $$7 : this.l) {
         boolean $$8 = $$1.test($$7);
         $$7.a($$5, $$8, $$3);
         $$6 |= $$8 && $$0.j();
      }

      if ($$6 && $$2 != null) {
         $$2.a(e);
      }
   }

   private boolean a(xt $$0) {
      return $$0.i() && !$$0.a(Instant.now());
   }

   public awk a(cnu $$0) {
      UUID $$1 = $$0.cD();
      awk $$2 = this.r.get($$1);
      if ($$2 == null) {
         File $$3 = this.k.a(est.b).toFile();
         File $$4 = new File($$3, $$1 + ".json");
         if (!$$4.exists()) {
            File $$5 = new File($$3, $$0.aj().getString() + ".json");
            Path $$6 = $$5.toPath();
            if (v.a($$6) && v.b($$6) && $$6.startsWith($$3.getPath()) && $$5.isFile()) {
               $$5.renameTo($$4);
            }
         }

         $$2 = new awk(this.k, $$4);
         this.r.put($$1, $$2);
      }

      return $$2;
   }

   public alk g(ari $$0) {
      UUID $$1 = $$0.cD();
      alk $$2 = this.s.get($$1);
      if ($$2 == null) {
         Path $$3 = this.k.a(est.a).resolve($$1 + ".json");
         $$2 = new alk(this.k.aC(), this, this.k.aD(), $$3, $$0);
         this.s.put($$1, $$2);
      }

      $$2.a($$0);
      return $$2;
   }

   public void a(int $$0) {
      this.w = $$0;
      this.a(new afb($$0));

      for (arh $$1 : this.k.L()) {
         if ($$1 != null) {
            $$1.l().a($$0);
         }
      }
   }

   public void b(int $$0) {
      this.x = $$0;
      this.a(new afr($$0));

      for (arh $$1 : this.k.L()) {
         if ($$1 != null) {
            $$1.l().b($$0);
         }
      }
   }

   public List<ari> t() {
      return this.l;
   }

   @Nullable
   public ari a(UUID $$0) {
      return this.m.get($$0);
   }

   public boolean d(GameProfile $$0) {
      return false;
   }

   public void u() {
      for (alk $$0 : this.s.values()) {
         $$0.a(this.k.aD());
      }

      this.a(new aab(axl.a(this.v)));
      agk $$1 = new agk(this.k.aI().e());

      for (ari $$2 : this.l) {
         $$2.c.b($$1);
         $$2.K().a($$2);
      }
   }

   public boolean v() {
      return this.y;
   }
}
