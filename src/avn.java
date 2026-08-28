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

public abstract class avn {
   public static final File a = new File("banned-players.json");
   public static final File b = new File("banned-ips.json");
   public static final File c = new File("ops.json");
   public static final File d = new File("whitelist.json");
   public static final xh e = xh.c("chat.filtered_full");
   public static final xh f = xh.c("multiplayer.disconnect.duplicate_login");
   private static final Logger h = LogUtils.getLogger();
   private static final int i = 600;
   private static final SimpleDateFormat j = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
   private final MinecraftServer k;
   private final List<arn> l = Lists.newArrayList();
   private final Map<UUID, arn> m = Maps.newHashMap();
   private final avt n = new avt(a);
   private final avk o = new avk(b);
   private final avo p = new avo(c);
   private final avv q = new avv(d);
   private final Map<UUID, awq> r = Maps.newHashMap();
   private final Map<UUID, alp> s = Maps.newHashMap();
   private final etn t;
   private boolean u;
   private final jw<alq> v;
   protected final int g;
   private int w;
   private int x;
   private boolean y;
   private static final boolean z = false;
   private int A;

   public avn(MinecraftServer $$0, jw<alq> $$1, etn $$2, int $$3) {
      this.k = $$0;
      this.v = $$1;
      this.g = $$3;
      this.t = $$2;
   }

   public void a(wb $$0, arn $$1, asc $$2) {
      GameProfile $$3 = $$1.gj();
      avj $$4 = this.k.at();
      String $$6;
      if ($$4 != null) {
         Optional<GameProfile> $$5 = $$4.a($$3.getId());
         $$6 = $$5.<String>map(GameProfile::getName).orElse($$3.getName());
         $$4.a($$3);
      } else {
         $$6 = $$3.getName();
      }

      Optional<uj> $$8 = this.a($$1);
      alg<dev> $$9 = $$8.<alg<dev>>flatMap($$0x -> dyz.a(new Dynamic(ux.a, $$0x.c("Dimension"))).resultOrPartial(h::error)).orElse(dev.i);
      arm $$10 = this.k.a($$9);
      arm $$11;
      if ($$10 == null) {
         h.warn("Unknown respawn dimension {}, defaulting to overworld", $$9);
         $$11 = this.k.J();
      } else {
         $$11 = $$10;
      }

      $$1.a($$11);
      String $$13 = $$0.a(this.k.bm());
      h.info("{}[{}] logged in with entity id {} at ({}, {}, {})", new Object[]{$$1.al().getString(), $$13, $$1.ar(), $$1.dC(), $$1.dE(), $$1.dI()});
      etg $$14 = $$11.A_();
      $$1.c($$8.orElse(null));
      asp $$15 = new asp(this.k, $$0, $$1, $$2);
      $$0.a(agt.a.a(ws.a(this.k.bb())), $$15);
      der $$16 = $$11.ac();
      boolean $$17 = $$16.b(der.D);
      boolean $$18 = $$16.b(der.q);
      boolean $$19 = $$16.b(der.w);
      $$15.b(new adu($$1.ar(), $$14.l(), this.k.K(), this.n(), this.w, this.x, $$18, !$$17, $$19, $$1.b($$11), this.k.aA()));
      $$15.b(new acq($$14.q(), $$14.r()));
      $$15.b(new aee($$1.gl()));
      $$15.b(new afp($$1.gk().j));
      $$15.b(new ago(this.k.aI().e()));
      this.e($$1);
      $$1.J().c();
      $$1.K().a($$1);
      this.a($$11.f(), $$1);
      this.k.av();
      xv $$20;
      if ($$1.gj().getName().equalsIgnoreCase($$6)) {
         $$20 = xh.a("multiplayer.player.joined", $$1.S_());
      } else {
         $$20 = xh.a("multiplayer.player.joined.renamed", $$1.S_(), $$6);
      }

      this.a($$20.a(n.o), false);
      $$15.a($$1.dC(), $$1.dE(), $$1.dI(), $$1.dN(), $$1.dP());
      ake $$22 = this.k.au();
      if ($$22 != null && !$$2.d()) {
         $$1.a($$22);
      }

      $$1.d.b(aek.a(this.l));
      this.l.add($$1);
      this.m.put($$1.cH(), $$1);
      this.a(aek.a(List.of($$1)));
      this.a($$1, $$11);
      $$11.a($$1);
      this.k.aM().a($$1);
      this.d($$1);
      if ($$8.isPresent() && $$8.get().b("RootVehicle", 10)) {
         uj $$23 = $$8.get().p("RootVehicle");
         btz $$24 = bug.a($$23.p("Entity"), $$11, buf.r, $$1x -> !$$11.c($$1x) ? null : $$1x);
         if ($$24 != null) {
            UUID $$25;
            if ($$23.b("Attach")) {
               $$25 = $$23.a("Attach");
            } else {
               $$25 = null;
            }

            if ($$24.cH().equals($$25)) {
               $$1.a($$24, true);
            } else {
               for (btz $$27 : $$24.de()) {
                  if ($$27.cH().equals($$25)) {
                     $$1.a($$27, true);
                     break;
                  }
               }
            }

            if (!$$1.ca()) {
               h.warn("Couldn't reattach entity to player");
               $$24.au();

               for (btz $$28 : $$24.de()) {
                  $$28.au();
               }
            }
         }
      }

      $$1.h();
   }

   protected void a(ama $$0, arn $$1) {
      Set<fae> $$2 = Sets.newHashSet();

      for (fah $$3 : $$0.g()) {
         $$1.d.b(aft.a($$3, true));
      }

      for (fad $$4 : fad.values()) {
         fae $$5 = $$0.a($$4);
         if ($$5 != null && !$$2.contains($$5)) {
            for (zo<?> $$7 : $$0.d($$5)) {
               $$1.d.b($$7);
            }

            $$2.add($$5);
         }
      }
   }

   public void a(arm $$0) {
      $$0.C_().a(new dws() {
         @Override
         public void a(dwu $$0, double $$1) {
            avn.this.a(new afa($$0));
         }

         @Override
         public void a(dwu $$0, double $$1, double $$2, long $$3) {
            avn.this.a(new aez($$0));
         }

         @Override
         public void a(dwu $$0, double $$1, double $$2) {
            avn.this.a(new aey($$0));
         }

         @Override
         public void a(dwu $$0, int $$1) {
            avn.this.a(new afb($$0));
         }

         @Override
         public void b(dwu $$0, int $$1) {
            avn.this.a(new afc($$0));
         }

         @Override
         public void b(dwu $$0, double $$1) {
         }

         @Override
         public void c(dwu $$0, double $$1) {
         }
      });
   }

   public Optional<uj> a(arn $$0) {
      uj $$1 = this.k.ba().w();
      Optional<uj> $$2;
      if (this.k.a($$0.gj()) && $$1 != null) {
         $$2 = Optional.of($$1);
         $$0.g($$1);
         h.debug("loading single player");
      } else {
         $$2 = this.t.b($$0);
      }

      return $$2;
   }

   protected void b(arn $$0) {
      this.t.a($$0);
      awq $$1 = this.r.get($$0.cH());
      if ($$1 != null) {
         $$1.a();
      }

      alp $$2 = this.s.get($$0.cH());
      if ($$2 != null) {
         $$2.b();
      }
   }

   public void c(arn $$0) {
      arm $$1 = $$0.B();
      $$0.a(awu.j);
      this.b($$0);
      if ($$0.ca()) {
         btz $$2 = $$0.dh();
         if ($$2.dg()) {
            h.debug("Removing player mount");
            $$0.af();
            $$2.dd().forEach($$0x -> $$0x.b(btz.c.d));
         }
      }

      $$0.ao();
      $$1.a($$0, btz.c.d);
      $$0.T().a();
      this.l.remove($$0);
      this.k.aM().b($$0);
      UUID $$3 = $$0.cH();
      arn $$4 = this.m.get($$3);
      if ($$4 == $$0) {
         this.m.remove($$3);
         this.r.remove($$3);
         this.s.remove($$3);
      }

      this.a(new aej(List.of($$0.cH())));
   }

   @Nullable
   public xh a(SocketAddress $$0, GameProfile $$1) {
      if (this.n.a($$1)) {
         avu $$2 = this.n.b($$1);
         xv $$3 = xh.a("multiplayer.disconnect.banned.reason", $$2.d());
         if ($$2.c() != null) {
            $$3.b(xh.a("multiplayer.disconnect.banned.expiration", j.format($$2.c())));
         }

         return $$3;
      } else if (!this.c($$1)) {
         return xh.c("multiplayer.disconnect.not_whitelisted");
      } else if (this.o.a($$0)) {
         avl $$4 = this.o.b($$0);
         xv $$5 = xh.a("multiplayer.disconnect.banned_ip.reason", $$4.d());
         if ($$4.c() != null) {
            $$5.b(xh.a("multiplayer.disconnect.banned_ip.expiration", j.format($$4.c())));
         }

         return $$5;
      } else {
         return this.l.size() >= this.g && !this.d($$1) ? xh.c("multiplayer.disconnect.server_full") : null;
      }
   }

   public arn a(GameProfile $$0, aqy $$1) {
      return new arn(this.k, this.k.J(), $$0, $$1);
   }

   public boolean e(GameProfile $$0) {
      UUID $$1 = $$0.getId();
      Set<arn> $$2 = Sets.newIdentityHashSet();

      for (arn $$3 : this.l) {
         if ($$3.cH().equals($$1)) {
            $$2.add($$3);
         }
      }

      arn $$4 = this.m.get($$0.getId());
      if ($$4 != null) {
         $$2.add($$4);
      }

      for (arn $$5 : $$2) {
         $$5.d.a(f);
      }

      return !$$2.isEmpty();
   }

   public arn a(arn $$0, boolean $$1, btz.c $$2) {
      this.l.remove($$0);
      $$0.B().a($$0, $$2);
      esc $$3 = $$0.a(!$$1, esc.a);
      arm $$4 = $$3.a();
      arn $$5 = new arn(this.k, $$4, $$0.gj(), $$0.D());
      $$5.d = $$0.d;
      $$5.a($$0, $$1);
      $$5.e($$0.ar());
      $$5.b($$0.fA());
      if (!$$3.f()) {
         $$5.b($$0);
      }

      for (String $$6 : $$0.as()) {
         $$5.a($$6);
      }

      ezh $$7 = $$3.b();
      $$5.b($$7.d, $$7.e, $$7.f, $$3.d(), $$3.e());
      if ($$3.f()) {
         $$5.d.b(new adk(adk.b, 0.0F));
      }

      byte $$8 = (byte)($$1 ? 1 : 0);
      arm $$9 = $$5.B();
      etg $$10 = $$9.A_();
      $$5.d.b(new aes($$5.b($$9), $$8));
      $$5.d.a($$5.dC(), $$5.dE(), $$5.dI(), $$5.dN(), $$5.dP());
      $$5.d.b(new afh($$4.W(), $$4.X()));
      $$5.d.b(new acq($$10.q(), $$10.r()));
      $$5.d.b(new afn($$5.cp, $$5.co, $$5.cn));
      this.d($$5);
      this.a($$5, $$4);
      this.e($$5);
      $$4.b($$5);
      this.l.add($$5);
      this.m.put($$5.cH(), $$5);
      $$5.h();
      $$5.x($$5.eG());
      jg $$11 = $$5.U();
      arm $$12 = this.k.a($$5.W());
      if (!$$1 && $$11 != null && $$12 != null) {
         dvd $$13 = $$12.a_($$11);
         if ($$13.a(dia.pl)) {
            $$5.d.b(new agb(awk.vx, awl.e, (double)$$11.u(), (double)$$11.v(), (double)$$11.w(), 1.0F, 1.0F, $$4.E_().g()));
         }
      }

      return $$5;
   }

   public void d(arn $$0) {
      this.a($$0, $$0.d);
   }

   public void a(buv $$0, asp $$1) {
      for (bte $$2 : $$0.eD()) {
         $$1.b(new agn($$0.ar(), $$2, false));
      }
   }

   public void e(arn $$0) {
      GameProfile $$1 = $$0.gj();
      int $$2 = this.k.c($$1);
      this.a($$0, $$2);
   }

   public void d() {
      if (++this.A > 600) {
         this.a(new aek(EnumSet.of(aek.a.e), this.l));
         this.A = 0;
      }
   }

   public void a(zo<?> $$0) {
      for (arn $$1 : this.l) {
         $$1.d.b($$0);
      }
   }

   public void a(zo<?> $$0, alg<dev> $$1) {
      for (arn $$2 : this.l) {
         if ($$2.dX().ag() == $$1) {
            $$2.d.b($$0);
         }
      }
   }

   public void a(coh $$0, xh $$1) {
      fao $$2 = $$0.cs();
      if ($$2 != null) {
         for (String $$4 : $$2.g()) {
            arn $$5 = this.a($$4);
            if ($$5 != null && $$5 != $$0) {
               $$5.a($$1);
            }
         }
      }
   }

   public void b(coh $$0, xh $$1) {
      fao $$2 = $$0.cs();
      if ($$2 == null) {
         this.a($$1, false);
      } else {
         for (int $$3 = 0; $$3 < this.l.size(); $$3++) {
            arn $$4 = this.l.get($$3);
            if ($$4.cs() != $$2) {
               $$4.a($$1);
            }
         }
      }
   }

   public String[] e() {
      String[] $$0 = new String[this.l.size()];

      for (int $$1 = 0; $$1 < this.l.size(); $$1++) {
         $$0[$$1] = this.l.get($$1).gj().getName();
      }

      return $$0;
   }

   public avt f() {
      return this.n;
   }

   public avk g() {
      return this.o;
   }

   public void a(GameProfile $$0) {
      this.p.a(new avp($$0, this.k.k(), this.p.a($$0)));
      arn $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.e($$1);
      }
   }

   public void b(GameProfile $$0) {
      this.p.c($$0);
      arn $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.e($$1);
      }
   }

   private void a(arn $$0, int $$1) {
      if ($$0.d != null) {
         byte $$2;
         if ($$1 <= 0) {
            $$2 = 24;
         } else if ($$1 >= 4) {
            $$2 = 28;
         } else {
            $$2 = (byte)(24 + $$1);
         }

         $$0.d.b(new adh($$0, $$2));
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
   public arn a(String $$0) {
      int $$1 = this.l.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         arn $$3 = this.l.get($$2);
         if ($$3.gj().getName().equalsIgnoreCase($$0)) {
            return $$3;
         }
      }

      return null;
   }

   public void a(@Nullable coh $$0, double $$1, double $$2, double $$3, double $$4, alg<dev> $$5, zo<?> $$6) {
      for (int $$7 = 0; $$7 < this.l.size(); $$7++) {
         arn $$8 = this.l.get($$7);
         if ($$8 != $$0 && $$8.dX().ag() == $$5) {
            double $$9 = $$1 - $$8.dC();
            double $$10 = $$2 - $$8.dE();
            double $$11 = $$3 - $$8.dI();
            if ($$9 * $$9 + $$10 * $$10 + $$11 * $$11 < $$4 * $$4) {
               $$8.d.b($$6);
            }
         }
      }
   }

   public void h() {
      for (int $$0 = 0; $$0 < this.l.size(); $$0++) {
         this.b(this.l.get($$0));
      }
   }

   public avv i() {
      return this.q;
   }

   public String[] j() {
      return this.q.a();
   }

   public avo k() {
      return this.p;
   }

   public String[] l() {
      return this.p.a();
   }

   public void a() {
   }

   public void a(arn $$0, arm $$1) {
      dwu $$2 = this.k.J().C_();
      $$0.d.b(new adn($$2));
      $$0.d.b(new afx($$1.aa(), $$1.ab(), $$1.ac().b(der.l)));
      $$0.d.b(new afh($$1.W(), $$1.X()));
      if ($$1.ae()) {
         $$0.d.b(new adk(adk.c, 0.0F));
         $$0.d.b(new adk(adk.i, $$1.d(1.0F)));
         $$0.d.b(new adk(adk.j, $$1.b(1.0F)));
      }

      $$0.d.b(new adk(adk.o, 0.0F));
      this.k.aP().a($$0);
   }

   public void f(arn $$0) {
      $$0.bZ.b();
      $$0.y();
      $$0.d.b(new afp($$0.gk().j));
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

   public List<arn> b(String $$0) {
      List<arn> $$1 = Lists.newArrayList();

      for (arn $$2 : this.l) {
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
   public uj r() {
      return null;
   }

   public void b(boolean $$0) {
      this.y = $$0;
   }

   public void s() {
      for (int $$0 = 0; $$0 < this.l.size(); $$0++) {
         this.l.get($$0).d.a(xh.c("multiplayer.disconnect.server_shutdown"));
      }
   }

   public void a(xh $$0, boolean $$1) {
      this.a($$0, $$1x -> $$0, $$1);
   }

   public void a(xh $$0, Function<arn, xh> $$1, boolean $$2) {
      this.k.a($$0);

      for (arn $$3 : this.l) {
         xh $$4 = $$1.apply($$3);
         if ($$4 != null) {
            $$3.b($$4, $$2);
         }
      }
   }

   public void a(xx $$0, ev $$1, xd.a $$2) {
      this.a($$0, $$1::a, $$1.i(), $$2);
   }

   public void a(xx $$0, arn $$1, xd.a $$2) {
      this.a($$0, $$1::c, $$1, $$2);
   }

   private void a(xx $$0, Predicate<arn> $$1, @Nullable arn $$2, xd.a $$3) {
      boolean $$4 = this.a($$0);
      this.k.a($$0.d(), $$3, $$4 ? null : "Not Secure");
      xw $$5 = xw.a($$0);
      boolean $$6 = false;

      for (arn $$7 : this.l) {
         boolean $$8 = $$1.test($$7);
         $$7.a($$5, $$8, $$3);
         $$6 |= $$8 && $$0.j();
      }

      if ($$6 && $$2 != null) {
         $$2.a(e);
      }
   }

   private boolean a(xx $$0) {
      return $$0.i() && !$$0.a(Instant.now());
   }

   public awq a(coh $$0) {
      UUID $$1 = $$0.cH();
      awq $$2 = this.r.get($$1);
      if ($$2 == null) {
         File $$3 = this.k.a(eti.b).toFile();
         File $$4 = new File($$3, $$1 + ".json");
         if (!$$4.exists()) {
            File $$5 = new File($$3, $$0.al().getString() + ".json");
            Path $$6 = $$5.toPath();
            if (v.a($$6) && v.b($$6) && $$6.startsWith($$3.getPath()) && $$5.isFile()) {
               $$5.renameTo($$4);
            }
         }

         $$2 = new awq(this.k, $$4);
         this.r.put($$1, $$2);
      }

      return $$2;
   }

   public alp g(arn $$0) {
      UUID $$1 = $$0.cH();
      alp $$2 = this.s.get($$1);
      if ($$2 == null) {
         Path $$3 = this.k.a(eti.a).resolve($$1 + ".json");
         $$2 = new alp(this.k.aC(), this, this.k.aD(), $$3, $$0);
         this.s.put($$1, $$2);
      }

      $$2.a($$0);
      return $$2;
   }

   public void a(int $$0) {
      this.w = $$0;
      this.a(new aff($$0));

      for (arm $$1 : this.k.L()) {
         if ($$1 != null) {
            $$1.l().a($$0);
         }
      }
   }

   public void b(int $$0) {
      this.x = $$0;
      this.a(new afv($$0));

      for (arm $$1 : this.k.L()) {
         if ($$1 != null) {
            $$1.l().b($$0);
         }
      }
   }

   public List<arn> t() {
      return this.l;
   }

   @Nullable
   public arn a(UUID $$0) {
      return this.m.get($$0);
   }

   public boolean d(GameProfile $$0) {
      return false;
   }

   public void u() {
      for (alp $$0 : this.s.values()) {
         $$0.a(this.k.aD());
      }

      this.a(new aaf(axr.a(this.v)));
      ago $$1 = new ago(this.k.aI().e());

      for (arn $$2 : this.l) {
         $$2.d.b($$1);
         $$2.K().a($$2);
      }
   }

   public boolean v() {
      return this.y;
   }
}
