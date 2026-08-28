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

public abstract class auq {
   public static final File a = new File("banned-players.json");
   public static final File b = new File("banned-ips.json");
   public static final File c = new File("ops.json");
   public static final File d = new File("whitelist.json");
   public static final wy e = wy.c("chat.filtered_full");
   public static final wy f = wy.c("multiplayer.disconnect.duplicate_login");
   private static final Logger h = LogUtils.getLogger();
   private static final int i = 600;
   private static final SimpleDateFormat j = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
   private final MinecraftServer k;
   private final List<aqu> l = Lists.newArrayList();
   private final Map<UUID, aqu> m = Maps.newHashMap();
   private final auw n = new auw(a);
   private final aun o = new aun(b);
   private final aur p = new aur(c);
   private final auz q = new auz(d);
   private final Map<UUID, avu> r = Maps.newHashMap();
   private final Map<UUID, aky> s = Maps.newHashMap();
   private final erc t;
   private boolean u;
   private final jt<akz> v;
   protected final int g;
   private int w;
   private int x;
   private boolean y;
   private static final boolean z = false;
   private int A;

   public auq(MinecraftServer $$0, jt<akz> $$1, erc $$2, int $$3) {
      this.k = $$0;
      this.v = $$1;
      this.g = $$3;
      this.t = $$2;
   }

   public void a(vs $$0, aqu $$1, ari $$2) {
      GameProfile $$3 = $$1.fY();
      aum $$4 = this.k.au();
      String $$6;
      if ($$4 != null) {
         Optional<GameProfile> $$5 = $$4.a($$3.getId());
         $$6 = $$5.<String>map(GameProfile::getName).orElse($$3.getName());
         $$4.a($$3);
      } else {
         $$6 = $$3.getName();
      }

      Optional<ua> $$8 = this.a($$1);
      akp<dcu> $$9 = $$8.<akp<dcu>>flatMap($$0x -> dwv.a(new Dynamic(uo.a, $$0x.c("Dimension"))).resultOrPartial(h::error)).orElse(dcu.h);
      aqt $$10 = this.k.a($$9);
      aqt $$11;
      if ($$10 == null) {
         h.warn("Unknown respawn dimension {}, defaulting to overworld", $$9);
         $$11 = this.k.I();
      } else {
         $$11 = $$10;
      }

      $$1.a($$11);
      String $$13 = $$0.a(this.k.bn());
      h.info("{}[{}] logged in with entity id {} at ({}, {}, {})", new Object[]{$$1.ah().getString(), $$13, $$1.an(), $$1.dv(), $$1.dx(), $$1.dB()});
      eqv $$14 = $$11.A_();
      $$1.c($$8.orElse(null));
      art $$15 = new art(this.k, $$0, $$1, $$2);
      $$0.a(agg.a.bind(wj.a(this.k.bc())), $$15);
      dcq $$16 = $$11.ab();
      boolean $$17 = $$16.b(dcq.D);
      boolean $$18 = $$16.b(dcq.q);
      boolean $$19 = $$16.b(dcq.w);
      $$15.b(new adk($$1.an(), $$14.l(), this.k.J(), this.n(), this.w, this.x, $$18, !$$17, $$19, $$1.b($$11), this.k.aB()));
      $$15.b(new acg($$14.q(), $$14.r()));
      $$15.b(new adt($$1.ga()));
      $$15.b(new aet($$1.fZ().k));
      $$15.b(new agb(this.k.aJ().b()));
      this.e($$1);
      $$1.I().c();
      $$1.J().a($$1);
      this.a($$11.f(), $$1);
      this.k.aw();
      xm $$20;
      if ($$1.fY().getName().equalsIgnoreCase($$6)) {
         $$20 = wy.a("multiplayer.player.joined", $$1.O_());
      } else {
         $$20 = wy.a("multiplayer.player.joined.renamed", $$1.O_(), $$6);
      }

      this.a($$20.a(n.o), false);
      $$15.a($$1.dv(), $$1.dx(), $$1.dB(), $$1.dG(), $$1.dI());
      ajp $$22 = this.k.av();
      if ($$22 != null && !$$2.d()) {
         $$1.a($$22);
      }

      $$1.c.b(adz.a(this.l));
      this.l.add($$1);
      this.m.put($$1.cA(), $$1);
      this.a(adz.a(List.of($$1)));
      this.a($$1, $$11);
      $$11.a($$1);
      this.k.aN().a($$1);
      this.d($$1);
      if ($$8.isPresent() && $$8.get().b("RootVehicle", 10)) {
         ua $$23 = $$8.get().p("RootVehicle");
         bsq $$24 = bsw.a($$23.p("Entity"), $$11, $$1x -> !$$11.c($$1x) ? null : $$1x);
         if ($$24 != null) {
            UUID $$25;
            if ($$23.b("Attach")) {
               $$25 = $$23.a("Attach");
            } else {
               $$25 = null;
            }

            if ($$24.cA().equals($$25)) {
               $$1.a($$24, true);
            } else {
               for (bsq $$27 : $$24.cX()) {
                  if ($$27.cA().equals($$25)) {
                     $$1.a($$27, true);
                     break;
                  }
               }
            }

            if (!$$1.bS()) {
               h.warn("Couldn't reattach entity to player");
               $$24.aq();

               for (bsq $$28 : $$24.cX()) {
                  $$28.aq();
               }
            }
         }
      }

      $$1.h();
   }

   protected void a(alj $$0, aqu $$1) {
      Set<exs> $$2 = Sets.newHashSet();

      for (exv $$3 : $$0.g()) {
         $$1.c.b(afg.a($$3, true));
      }

      for (exr $$4 : exr.values()) {
         exs $$5 = $$0.a($$4);
         if ($$5 != null && !$$2.contains($$5)) {
            for (zf<?> $$7 : $$0.d($$5)) {
               $$1.c.b($$7);
            }

            $$2.add($$5);
         }
      }
   }

   public void a(aqt $$0) {
      $$0.C_().a(new dup() {
         @Override
         public void a(dur $$0, double $$1) {
            auq.this.a(new aep($$0));
         }

         @Override
         public void a(dur $$0, double $$1, double $$2, long $$3) {
            auq.this.a(new aeo($$0));
         }

         @Override
         public void a(dur $$0, double $$1, double $$2) {
            auq.this.a(new aen($$0));
         }

         @Override
         public void a(dur $$0, int $$1) {
            auq.this.a(new aeq($$0));
         }

         @Override
         public void b(dur $$0, int $$1) {
            auq.this.a(new aer($$0));
         }

         @Override
         public void b(dur $$0, double $$1) {
         }

         @Override
         public void c(dur $$0, double $$1) {
         }
      });
   }

   public Optional<ua> a(aqu $$0) {
      ua $$1 = this.k.bb().w();
      Optional<ua> $$2;
      if (this.k.a($$0.fY()) && $$1 != null) {
         $$2 = Optional.of($$1);
         $$0.g($$1);
         h.debug("loading single player");
      } else {
         $$2 = this.t.b($$0);
      }

      return $$2;
   }

   protected void b(aqu $$0) {
      this.t.a($$0);
      avu $$1 = this.r.get($$0.cA());
      if ($$1 != null) {
         $$1.a();
      }

      aky $$2 = this.s.get($$0.cA());
      if ($$2 != null) {
         $$2.b();
      }
   }

   public void c(aqu $$0) {
      aqt $$1 = $$0.A();
      $$0.a(avy.j);
      this.b($$0);
      if ($$0.bS()) {
         bsq $$2 = $$0.da();
         if ($$2.cZ()) {
            h.debug("Removing player mount");
            $$0.ad();
            $$2.cW().forEach($$0x -> $$0x.b(bsq.c.d));
         }
      }

      $$0.ak();
      $$1.a($$0, bsq.c.d);
      $$0.R().a();
      this.l.remove($$0);
      this.k.aN().b($$0);
      UUID $$3 = $$0.cA();
      aqu $$4 = this.m.get($$3);
      if ($$4 == $$0) {
         this.m.remove($$3);
         this.r.remove($$3);
         this.s.remove($$3);
      }

      this.a(new ady(List.of($$0.cA())));
   }

   @Nullable
   public wy a(SocketAddress $$0, GameProfile $$1) {
      if (this.n.a($$1)) {
         auy $$2 = this.n.b($$1);
         xm $$3 = wy.a("multiplayer.disconnect.banned.reason", $$2.d());
         if ($$2.c() != null) {
            $$3.b(wy.a("multiplayer.disconnect.banned.expiration", j.format($$2.c())));
         }

         return $$3;
      } else if (!this.c($$1)) {
         return wy.c("multiplayer.disconnect.not_whitelisted");
      } else if (this.o.a($$0)) {
         auo $$4 = this.o.b($$0);
         xm $$5 = wy.a("multiplayer.disconnect.banned_ip.reason", $$4.d());
         if ($$4.c() != null) {
            $$5.b(wy.a("multiplayer.disconnect.banned_ip.expiration", j.format($$4.c())));
         }

         return $$5;
      } else {
         return this.l.size() >= this.g && !this.d($$1) ? wy.c("multiplayer.disconnect.server_full") : null;
      }
   }

   public aqu a(GameProfile $$0, aqg $$1) {
      return new aqu(this.k, this.k.I(), $$0, $$1);
   }

   public boolean e(GameProfile $$0) {
      UUID $$1 = $$0.getId();
      Set<aqu> $$2 = Sets.newIdentityHashSet();

      for (aqu $$3 : this.l) {
         if ($$3.cA().equals($$1)) {
            $$2.add($$3);
         }
      }

      aqu $$4 = this.m.get($$0.getId());
      if ($$4 != null) {
         $$2.add($$4);
      }

      for (aqu $$5 : $$2) {
         $$5.c.a(f);
      }

      return !$$2.isEmpty();
   }

   public aqu a(aqu $$0, boolean $$1, bsq.c $$2) {
      this.l.remove($$0);
      $$0.A().a($$0, $$2);
      epw $$3 = $$0.a($$1);
      aqt $$4 = $$3.a();
      aqu $$5 = new aqu(this.k, $$4, $$0.fY(), $$0.C());
      $$5.c = $$0.c;
      $$5.a($$0, $$1);
      $$5.e($$0.an());
      $$5.a($$0.fr());
      if (!$$3.f()) {
         $$5.b($$0);
      }

      for (String $$6 : $$0.ao()) {
         $$5.a($$6);
      }

      eww $$7 = $$3.b();
      $$5.b($$7.c, $$7.d, $$7.e, $$3.d(), $$3.e());
      if ($$3.f()) {
         $$5.c.b(new ada(ada.b, 0.0F));
      }

      byte $$8 = (byte)($$1 ? 1 : 0);
      aqt $$9 = $$5.A();
      eqv $$10 = $$9.A_();
      $$5.c.b(new aeh($$5.b($$9), $$8));
      $$5.c.a($$5.dv(), $$5.dx(), $$5.dB(), $$5.dG(), $$5.dI());
      $$5.c.b(new aew($$4.V(), $$4.W()));
      $$5.c.b(new acg($$10.q(), $$10.r()));
      $$5.c.b(new afc($$5.cs, $$5.cr, $$5.cq));
      this.d($$5);
      this.a($$5, $$4);
      this.e($$5);
      $$4.b($$5);
      this.l.add($$5);
      this.m.put($$5.cA(), $$5);
      $$5.h();
      $$5.u($$5.ex());
      if (!$$1) {
         jd $$11 = jd.a((jw)$$3.b());
         dta $$12 = $$4.a_($$11);
         if ($$12.a(dfy.pl)) {
            $$5.c.b(new afo(avo.vy, avp.e, (double)$$11.u(), (double)$$11.v(), (double)$$11.w(), 1.0F, 1.0F, $$4.E_().g()));
         }
      }

      return $$5;
   }

   public void d(aqu $$0) {
      this.a($$0, $$0.c);
   }

   public void a(btl $$0, art $$1) {
      for (bry $$2 : $$0.eu()) {
         $$1.b(new aga($$0.an(), $$2, false));
      }
   }

   public void e(aqu $$0) {
      GameProfile $$1 = $$0.fY();
      int $$2 = this.k.c($$1);
      this.a($$0, $$2);
   }

   public void d() {
      if (++this.A > 600) {
         this.a(new adz(EnumSet.of(adz.a.e), this.l));
         this.A = 0;
      }
   }

   public void a(zf<?> $$0) {
      for (aqu $$1 : this.l) {
         $$1.c.b($$0);
      }
   }

   public void a(zf<?> $$0, akp<dcu> $$1) {
      for (aqu $$2 : this.l) {
         if ($$2.dQ().af() == $$1) {
            $$2.c.b($$0);
         }
      }
   }

   public void a(cmv $$0, wy $$1) {
      eyc $$2 = $$0.ck();
      if ($$2 != null) {
         for (String $$4 : $$2.g()) {
            aqu $$5 = this.a($$4);
            if ($$5 != null && $$5 != $$0) {
               $$5.a($$1);
            }
         }
      }
   }

   public void b(cmv $$0, wy $$1) {
      eyc $$2 = $$0.ck();
      if ($$2 == null) {
         this.a($$1, false);
      } else {
         for (int $$3 = 0; $$3 < this.l.size(); $$3++) {
            aqu $$4 = this.l.get($$3);
            if ($$4.ck() != $$2) {
               $$4.a($$1);
            }
         }
      }
   }

   public String[] e() {
      String[] $$0 = new String[this.l.size()];

      for (int $$1 = 0; $$1 < this.l.size(); $$1++) {
         $$0[$$1] = this.l.get($$1).fY().getName();
      }

      return $$0;
   }

   public auw f() {
      return this.n;
   }

   public aun g() {
      return this.o;
   }

   public void a(GameProfile $$0) {
      this.p.a(new aus($$0, this.k.k(), this.p.a($$0)));
      aqu $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.e($$1);
      }
   }

   public void b(GameProfile $$0) {
      this.p.c($$0);
      aqu $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.e($$1);
      }
   }

   private void a(aqu $$0, int $$1) {
      if ($$0.c != null) {
         byte $$2;
         if ($$1 <= 0) {
            $$2 = 24;
         } else if ($$1 >= 4) {
            $$2 = 28;
         } else {
            $$2 = (byte)(24 + $$1);
         }

         $$0.c.b(new acx($$0, $$2));
      }

      this.k.aH().a($$0);
   }

   public boolean c(GameProfile $$0) {
      return !this.u || this.p.d($$0) || this.q.d($$0);
   }

   public boolean f(GameProfile $$0) {
      return this.p.d($$0) || this.k.a($$0) && this.k.bb().m() || this.y;
   }

   @Nullable
   public aqu a(String $$0) {
      int $$1 = this.l.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         aqu $$3 = this.l.get($$2);
         if ($$3.fY().getName().equalsIgnoreCase($$0)) {
            return $$3;
         }
      }

      return null;
   }

   public void a(@Nullable cmv $$0, double $$1, double $$2, double $$3, double $$4, akp<dcu> $$5, zf<?> $$6) {
      for (int $$7 = 0; $$7 < this.l.size(); $$7++) {
         aqu $$8 = this.l.get($$7);
         if ($$8 != $$0 && $$8.dQ().af() == $$5) {
            double $$9 = $$1 - $$8.dv();
            double $$10 = $$2 - $$8.dx();
            double $$11 = $$3 - $$8.dB();
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

   public auz i() {
      return this.q;
   }

   public String[] j() {
      return this.q.a();
   }

   public aur k() {
      return this.p;
   }

   public String[] l() {
      return this.p.a();
   }

   public void a() {
   }

   public void a(aqu $$0, aqt $$1) {
      dur $$2 = this.k.I().C_();
      $$0.c.b(new add($$2));
      $$0.c.b(new afk($$1.Z(), $$1.aa(), $$1.ab().b(dcq.l)));
      $$0.c.b(new aew($$1.V(), $$1.W()));
      if ($$1.ad()) {
         $$0.c.b(new ada(ada.c, 0.0F));
         $$0.c.b(new ada(ada.i, $$1.d(1.0F)));
         $$0.c.b(new ada(ada.j, $$1.b(1.0F)));
      }

      $$0.c.b(new ada(ada.o, 0.0F));
      this.k.aQ().a($$0);
   }

   public void f(aqu $$0) {
      $$0.cc.b();
      $$0.x();
      $$0.c.b(new aet($$0.fZ().k));
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

   public List<aqu> b(String $$0) {
      List<aqu> $$1 = Lists.newArrayList();

      for (aqu $$2 : this.l) {
         if ($$2.B().equals($$0)) {
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
   public ua r() {
      return null;
   }

   public void b(boolean $$0) {
      this.y = $$0;
   }

   public void s() {
      for (int $$0 = 0; $$0 < this.l.size(); $$0++) {
         this.l.get($$0).c.a(wy.c("multiplayer.disconnect.server_shutdown"));
      }
   }

   public void a(wy $$0, boolean $$1) {
      this.a($$0, $$1x -> $$0, $$1);
   }

   public void a(wy $$0, Function<aqu, wy> $$1, boolean $$2) {
      this.k.a($$0);

      for (aqu $$3 : this.l) {
         wy $$4 = $$1.apply($$3);
         if ($$4 != null) {
            $$3.b($$4, $$2);
         }
      }
   }

   public void a(xo $$0, et $$1, wu.a $$2) {
      this.a($$0, $$1::a, $$1.i(), $$2);
   }

   public void a(xo $$0, aqu $$1, wu.a $$2) {
      this.a($$0, $$1::c, $$1, $$2);
   }

   private void a(xo $$0, Predicate<aqu> $$1, @Nullable aqu $$2, wu.a $$3) {
      boolean $$4 = this.a($$0);
      this.k.a($$0.d(), $$3, $$4 ? null : "Not Secure");
      xn $$5 = xn.a($$0);
      boolean $$6 = false;

      for (aqu $$7 : this.l) {
         boolean $$8 = $$1.test($$7);
         $$7.a($$5, $$8, $$3);
         $$6 |= $$8 && $$0.j();
      }

      if ($$6 && $$2 != null) {
         $$2.a(e);
      }
   }

   private boolean a(xo $$0) {
      return $$0.i() && !$$0.a(Instant.now());
   }

   public avu a(cmv $$0) {
      UUID $$1 = $$0.cA();
      avu $$2 = this.r.get($$1);
      if ($$2 == null) {
         File $$3 = this.k.a(eqx.b).toFile();
         File $$4 = new File($$3, $$1 + ".json");
         if (!$$4.exists()) {
            File $$5 = new File($$3, $$0.ah().getString() + ".json");
            Path $$6 = $$5.toPath();
            if (v.a($$6) && v.b($$6) && $$6.startsWith($$3.getPath()) && $$5.isFile()) {
               $$5.renameTo($$4);
            }
         }

         $$2 = new avu(this.k, $$4);
         this.r.put($$1, $$2);
      }

      return $$2;
   }

   public aky g(aqu $$0) {
      UUID $$1 = $$0.cA();
      aky $$2 = this.s.get($$1);
      if ($$2 == null) {
         Path $$3 = this.k.a(eqx.a).resolve($$1 + ".json");
         $$2 = new aky(this.k.aD(), this, this.k.aE(), $$3, $$0);
         this.s.put($$1, $$2);
      }

      $$2.a($$0);
      return $$2;
   }

   public void a(int $$0) {
      this.w = $$0;
      this.a(new aev($$0));

      for (aqt $$1 : this.k.K()) {
         if ($$1 != null) {
            $$1.l().a($$0);
         }
      }
   }

   public void b(int $$0) {
      this.x = $$0;
      this.a(new afi($$0));

      for (aqt $$1 : this.k.K()) {
         if ($$1 != null) {
            $$1.l().b($$0);
         }
      }
   }

   public List<aqu> t() {
      return this.l;
   }

   @Nullable
   public aqu a(UUID $$0) {
      return this.m.get($$0);
   }

   public boolean d(GameProfile $$0) {
      return false;
   }

   public void u() {
      for (aky $$0 : this.s.values()) {
         $$0.a(this.k.aE());
      }

      this.a(new zw(aww.a(this.v)));
      agb $$1 = new agb(this.k.aJ().b());

      for (aqu $$2 : this.l) {
         $$2.c.b($$1);
         $$2.J().a($$2);
      }
   }

   public boolean v() {
      return this.y;
   }
}
