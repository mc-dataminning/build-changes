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

public abstract class awi {
   public static final File a = new File("banned-players.json");
   public static final File b = new File("banned-ips.json");
   public static final File c = new File("ops.json");
   public static final File d = new File("whitelist.json");
   public static final xv e = xv.c("chat.filtered_full");
   public static final xv f = xv.c("multiplayer.disconnect.duplicate_login");
   private static final Logger h = LogUtils.getLogger();
   private static final int i = 600;
   private static final SimpleDateFormat j = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
   private final MinecraftServer k;
   private final List<asi> l = Lists.newArrayList();
   private final Map<UUID, asi> m = Maps.newHashMap();
   private final awo n = new awo(a);
   private final awf o = new awf(b);
   private final awj p = new awj(c);
   private final awq q = new awq(d);
   private final Map<UUID, axl> r = Maps.newHashMap();
   private final Map<UUID, amh> s = Maps.newHashMap();
   private final ewf t;
   private boolean u;
   private final jx<ami> v;
   protected final int g;
   private int w;
   private int x;
   private boolean y;
   private static final boolean z = false;
   private int A;

   public awi(MinecraftServer $$0, jx<ami> $$1, ewf $$2, int $$3) {
      this.k = $$0;
      this.v = $$1;
      this.g = $$3;
      this.t = $$2;
   }

   public void a(wp $$0, asi $$1, asx $$2) {
      GameProfile $$3 = $$1.gh();
      awe $$4 = this.k.at();
      String $$6;
      if ($$4 != null) {
         Optional<GameProfile> $$5 = $$4.a($$3.getId());
         $$6 = $$5.<String>map(GameProfile::getName).orElse($$3.getName());
         $$4.a($$3);
      } else {
         $$6 = $$3.getName();
      }

      Optional<ux> $$8 = this.a($$1);
      aly<dhh> $$9 = $$8.<aly<dhh>>flatMap($$0x -> ebp.a(new Dynamic(vl.a, $$0x.c("Dimension"))).resultOrPartial(h::error)).orElse(dhh.i);
      ash $$10 = this.k.a($$9);
      ash $$11;
      if ($$10 == null) {
         h.warn("Unknown respawn dimension {}, defaulting to overworld", $$9);
         $$11 = this.k.J();
      } else {
         $$11 = $$10;
      }

      $$1.a($$11);
      String $$13 = $$0.a(this.k.bl());
      h.info("{}[{}] logged in with entity id {} at ({}, {}, {})", new Object[]{$$1.al().getString(), $$13, $$1.ar(), $$1.dB(), $$1.dD(), $$1.dH()});
      evy $$14 = $$11.D_();
      $$1.c($$8.orElse(null));
      atk $$15 = new atk(this.k, $$0, $$1, $$2);
      $$0.a(ahl.a.a(xg.a(this.k.ba())), $$15);
      dhd $$16 = $$11.N();
      boolean $$17 = $$16.b(dhd.E);
      boolean $$18 = $$16.b(dhd.q);
      boolean $$19 = $$16.b(dhd.x);
      $$15.b(new aej($$1.ar(), $$14.l(), this.k.K(), this.n(), this.w, this.x, $$18, !$$17, $$19, $$1.b($$11), this.k.aA()));
      $$15.b(new ade($$14.q(), $$14.r()));
      $$15.b(new aet($$1.gj()));
      $$15.b(new agh($$1.gi().j));
      dck $$20 = this.k.aI();
      $$15.b(new ahg($$20.b(), $$20.d()));
      this.e($$1);
      $$1.I().c();
      $$1.J().a($$1);
      this.a($$11.g(), $$1);
      this.k.av();
      yj $$21;
      if ($$1.gh().getName().equalsIgnoreCase($$6)) {
         $$21 = xv.a("multiplayer.player.joined", $$1.p_());
      } else {
         $$21 = xv.a("multiplayer.player.joined.renamed", $$1.p_(), $$6);
      }

      this.a($$21.a(n.o), false);
      $$15.a($$1.dB(), $$1.dD(), $$1.dH(), $$1.dM(), $$1.dO());
      akw $$23 = this.k.au();
      if ($$23 != null && !$$2.d()) {
         $$1.a($$23);
      }

      $$1.f.b(aez.a(this.l));
      this.l.add($$1);
      this.m.put($$1.cG(), $$1);
      this.a(aez.a(List.of($$1)));
      this.a($$1, $$11);
      $$11.a($$1);
      this.k.aM().a($$1);
      this.d($$1);
      $$1.b($$8);
      $$1.a($$8);
      $$1.d();
   }

   protected void a(ams $$0, asi $$1) {
      Set<fcu> $$2 = Sets.newHashSet();

      for (fcx $$3 : $$0.g()) {
         $$1.f.b(agl.a($$3, true));
      }

      for (fct $$4 : fct.values()) {
         fcu $$5 = $$0.a($$4);
         if ($$5 != null && !$$2.contains($$5)) {
            for (aac<?> $$7 : $$0.d($$5)) {
               $$1.f.b($$7);
            }

            $$2.add($$5);
         }
      }
   }

   public void a(ash $$0) {
      $$0.F_().a(new dzi() {
         @Override
         public void a(dzk $$0, double $$1) {
            awi.this.a(new afs($$0));
         }

         @Override
         public void a(dzk $$0, double $$1, double $$2, long $$3) {
            awi.this.a(new afr($$0));
         }

         @Override
         public void a(dzk $$0, double $$1, double $$2) {
            awi.this.a(new afq($$0));
         }

         @Override
         public void a(dzk $$0, int $$1) {
            awi.this.a(new aft($$0));
         }

         @Override
         public void b(dzk $$0, int $$1) {
            awi.this.a(new afu($$0));
         }

         @Override
         public void b(dzk $$0, double $$1) {
         }

         @Override
         public void c(dzk $$0, double $$1) {
         }
      });
   }

   public Optional<ux> a(asi $$0) {
      ux $$1 = this.k.aZ().w();
      Optional<ux> $$2;
      if (this.k.a($$0.gh()) && $$1 != null) {
         $$2 = Optional.of($$1);
         $$0.g($$1);
         h.debug("loading single player");
      } else {
         $$2 = this.t.b($$0);
      }

      return $$2;
   }

   protected void b(asi $$0) {
      this.t.a($$0);
      axl $$1 = this.r.get($$0.cG());
      if ($$1 != null) {
         $$1.a();
      }

      amh $$2 = this.s.get($$0.cG());
      if ($$2 != null) {
         $$2.b();
      }
   }

   public void c(asi $$0) {
      ash $$1 = $$0.y();
      $$0.a(axp.j);
      this.b($$0);
      if ($$0.bZ()) {
         bvj $$2 = $$0.dg();
         if ($$2.df()) {
            h.debug("Removing player mount");
            $$0.ae();
            $$2.dc().forEach($$0x -> $$0x.c(bvj.d.d));
         }
      }

      $$0.ao();

      for (cqz $$3 : $$0.ak()) {
         $$3.c(bvj.d.d);
      }

      $$1.a($$0, bvj.d.d);
      $$0.S().a();
      this.l.remove($$0);
      this.k.aM().b($$0);
      UUID $$4 = $$0.cG();
      asi $$5 = this.m.get($$4);
      if ($$5 == $$0) {
         this.m.remove($$4);
         this.r.remove($$4);
         this.s.remove($$4);
      }

      this.a(new aey(List.of($$0.cG())));
   }

   @Nullable
   public xv a(SocketAddress $$0, GameProfile $$1) {
      if (this.n.a($$1)) {
         awp $$2 = this.n.b($$1);
         yj $$3 = xv.a("multiplayer.disconnect.banned.reason", $$2.d());
         if ($$2.c() != null) {
            $$3.b(xv.a("multiplayer.disconnect.banned.expiration", j.format($$2.c())));
         }

         return $$3;
      } else if (!this.c($$1)) {
         return xv.c("multiplayer.disconnect.not_whitelisted");
      } else if (this.o.a($$0)) {
         awg $$4 = this.o.b($$0);
         yj $$5 = xv.a("multiplayer.disconnect.banned_ip.reason", $$4.d());
         if ($$4.c() != null) {
            $$5.b(xv.a("multiplayer.disconnect.banned_ip.expiration", j.format($$4.c())));
         }

         return $$5;
      } else {
         return this.l.size() >= this.g && !this.d($$1) ? xv.c("multiplayer.disconnect.server_full") : null;
      }
   }

   public asi a(GameProfile $$0, ars $$1) {
      return new asi(this.k, this.k.J(), $$0, $$1);
   }

   public boolean e(GameProfile $$0) {
      UUID $$1 = $$0.getId();
      Set<asi> $$2 = Sets.newIdentityHashSet();

      for (asi $$3 : this.l) {
         if ($$3.cG().equals($$1)) {
            $$2.add($$3);
         }
      }

      asi $$4 = this.m.get($$0.getId());
      if ($$4 != null) {
         $$2.add($$4);
      }

      for (asi $$5 : $$2) {
         $$5.f.a(f);
      }

      return !$$2.isEmpty();
   }

   public asi a(asi $$0, boolean $$1, bvj.d $$2) {
      this.l.remove($$0);
      $$0.y().a($$0, $$2);
      euw $$3 = $$0.a(!$$1, euw.a);
      ash $$4 = $$3.b();
      asi $$5 = new asi(this.k, $$4, $$0.gh(), $$0.C());
      $$5.f = $$0.f;
      $$5.a($$0, $$1);
      $$5.e($$0.ar());
      $$5.b($$0.fy());
      if (!$$3.g()) {
         $$5.b($$0);
      }

      for (String $$6 : $$0.as()) {
         $$5.a($$6);
      }

      fbx $$7 = $$3.c();
      $$5.b($$7.d, $$7.e, $$7.f, $$3.e(), $$3.f());
      if ($$3.g()) {
         $$5.f.b(new adz(adz.b, 0.0F));
      }

      byte $$8 = (byte)($$1 ? 1 : 0);
      ash $$9 = $$5.y();
      evy $$10 = $$9.D_();
      $$5.f.b(new afk($$5.b($$9), $$8));
      $$5.f.a($$5.dB(), $$5.dD(), $$5.dH(), $$5.dM(), $$5.dO());
      $$5.f.b(new afz($$4.Y(), $$4.Z()));
      $$5.f.b(new ade($$10.q(), $$10.r()));
      $$5.f.b(new agf($$5.cs, $$5.cr, $$5.cq));
      this.d($$5);
      this.a($$5, $$4);
      this.e($$5);
      $$4.b($$5);
      this.l.add($$5);
      this.m.put($$5.cG(), $$5);
      $$5.d();
      $$5.x($$5.eE());
      jh $$11 = $$5.T();
      ash $$12 = this.k.a($$5.V());
      if (!$$1 && $$11 != null && $$12 != null) {
         dxu $$13 = $$12.a_($$11);
         if ($$13.a(dkn.pG)) {
            $$5.f.b(new agt(axf.vS, axg.e, (double)$$11.u(), (double)$$11.v(), (double)$$11.w(), 1.0F, 1.0F, $$4.H_().g()));
         }
      }

      return $$5;
   }

   public void d(asi $$0) {
      this.a($$0, $$0.f);
   }

   public void a(bwf $$0, atk $$1) {
      for (buo $$2 : $$0.eB()) {
         $$1.b(new ahf($$0.ar(), $$2, false));
      }
   }

   public void e(asi $$0) {
      GameProfile $$1 = $$0.gh();
      int $$2 = this.k.c($$1);
      this.a($$0, $$2);
   }

   public void d() {
      if (++this.A > 600) {
         this.a(new aez(EnumSet.of(aez.a.e), this.l));
         this.A = 0;
      }
   }

   public void a(aac<?> $$0) {
      for (asi $$1 : this.l) {
         $$1.f.b($$0);
      }
   }

   public void a(aac<?> $$0, aly<dhh> $$1) {
      for (asi $$2 : this.l) {
         if ($$2.dW().ah() == $$1) {
            $$2.f.b($$0);
         }
      }
   }

   public void a(cpw $$0, xv $$1) {
      fde $$2 = $$0.cr();
      if ($$2 != null) {
         for (String $$4 : $$2.g()) {
            asi $$5 = this.a($$4);
            if ($$5 != null && $$5 != $$0) {
               $$5.a($$1);
            }
         }
      }
   }

   public void b(cpw $$0, xv $$1) {
      fde $$2 = $$0.cr();
      if ($$2 == null) {
         this.a($$1, false);
      } else {
         for (int $$3 = 0; $$3 < this.l.size(); $$3++) {
            asi $$4 = this.l.get($$3);
            if ($$4.cr() != $$2) {
               $$4.a($$1);
            }
         }
      }
   }

   public String[] e() {
      String[] $$0 = new String[this.l.size()];

      for (int $$1 = 0; $$1 < this.l.size(); $$1++) {
         $$0[$$1] = this.l.get($$1).gh().getName();
      }

      return $$0;
   }

   public awo f() {
      return this.n;
   }

   public awf g() {
      return this.o;
   }

   public void a(GameProfile $$0) {
      this.p.a(new awk($$0, this.k.k(), this.p.a($$0)));
      asi $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.e($$1);
      }
   }

   public void b(GameProfile $$0) {
      this.p.c($$0);
      asi $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.e($$1);
      }
   }

   private void a(asi $$0, int $$1) {
      if ($$0.f != null) {
         byte $$2;
         if ($$1 <= 0) {
            $$2 = 24;
         } else if ($$1 >= 4) {
            $$2 = 28;
         } else {
            $$2 = (byte)(24 + $$1);
         }

         $$0.f.b(new adv($$0, $$2));
      }

      this.k.aG().a($$0);
   }

   public boolean c(GameProfile $$0) {
      return !this.u || this.p.d($$0) || this.q.d($$0);
   }

   public boolean f(GameProfile $$0) {
      return this.p.d($$0) || this.k.a($$0) && this.k.aZ().m() || this.y;
   }

   @Nullable
   public asi a(String $$0) {
      int $$1 = this.l.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         asi $$3 = this.l.get($$2);
         if ($$3.gh().getName().equalsIgnoreCase($$0)) {
            return $$3;
         }
      }

      return null;
   }

   public void a(@Nullable cpw $$0, double $$1, double $$2, double $$3, double $$4, aly<dhh> $$5, aac<?> $$6) {
      for (int $$7 = 0; $$7 < this.l.size(); $$7++) {
         asi $$8 = this.l.get($$7);
         if ($$8 != $$0 && $$8.dW().ah() == $$5) {
            double $$9 = $$1 - $$8.dB();
            double $$10 = $$2 - $$8.dD();
            double $$11 = $$3 - $$8.dH();
            if ($$9 * $$9 + $$10 * $$10 + $$11 * $$11 < $$4 * $$4) {
               $$8.f.b($$6);
            }
         }
      }
   }

   public void h() {
      for (int $$0 = 0; $$0 < this.l.size(); $$0++) {
         this.b(this.l.get($$0));
      }
   }

   public awq i() {
      return this.q;
   }

   public String[] j() {
      return this.q.a();
   }

   public awj k() {
      return this.p;
   }

   public String[] l() {
      return this.p.a();
   }

   public void a() {
   }

   public void a(asi $$0, ash $$1) {
      dzk $$2 = this.k.J().F_();
      $$0.f.b(new aec($$2));
      $$0.f.b(new agp($$1.ac(), $$1.ad(), $$1.N().b(dhd.l)));
      $$0.f.b(new afz($$1.Y(), $$1.Z()));
      if ($$1.af()) {
         $$0.f.b(new adz(adz.c, 0.0F));
         $$0.f.b(new adz(adz.i, $$1.d(1.0F)));
         $$0.f.b(new adz(adz.j, $$1.b(1.0F)));
      }

      $$0.f.b(new adz(adz.o, 0.0F));
      this.k.aP().a($$0);
   }

   public void f(asi $$0) {
      $$0.cc.b();
      $$0.v();
      $$0.f.b(new agh($$0.gi().j));
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

   public List<asi> b(String $$0) {
      List<asi> $$1 = Lists.newArrayList();

      for (asi $$2 : this.l) {
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
   public ux r() {
      return null;
   }

   public void b(boolean $$0) {
      this.y = $$0;
   }

   public void s() {
      for (int $$0 = 0; $$0 < this.l.size(); $$0++) {
         this.l.get($$0).f.a(xv.c("multiplayer.disconnect.server_shutdown"));
      }
   }

   public void a(xv $$0, boolean $$1) {
      this.a($$0, $$1x -> $$0, $$1);
   }

   public void a(xv $$0, Function<asi, xv> $$1, boolean $$2) {
      this.k.a($$0);

      for (asi $$3 : this.l) {
         xv $$4 = $$1.apply($$3);
         if ($$4 != null) {
            $$3.b($$4, $$2);
         }
      }
   }

   public void a(yl $$0, ew $$1, xr.a $$2) {
      this.a($$0, $$1::a, $$1.i(), $$2);
   }

   public void a(yl $$0, asi $$1, xr.a $$2) {
      this.a($$0, $$1::c, $$1, $$2);
   }

   private void a(yl $$0, Predicate<asi> $$1, @Nullable asi $$2, xr.a $$3) {
      boolean $$4 = this.a($$0);
      this.k.a($$0.d(), $$3, $$4 ? null : "Not Secure");
      yk $$5 = yk.a($$0);
      boolean $$6 = false;

      for (asi $$7 : this.l) {
         boolean $$8 = $$1.test($$7);
         $$7.a($$5, $$8, $$3);
         $$6 |= $$8 && $$0.j();
      }

      if ($$6 && $$2 != null) {
         $$2.a(e);
      }
   }

   private boolean a(yl $$0) {
      return $$0.i() && !$$0.a(Instant.now());
   }

   public axl a(cpw $$0) {
      UUID $$1 = $$0.cG();
      axl $$2 = this.r.get($$1);
      if ($$2 == null) {
         File $$3 = this.k.a(ewa.b).toFile();
         File $$4 = new File($$3, $$1 + ".json");
         if (!$$4.exists()) {
            File $$5 = new File($$3, $$0.al().getString() + ".json");
            Path $$6 = $$5.toPath();
            if (v.a($$6) && v.b($$6) && $$6.startsWith($$3.getPath()) && $$5.isFile()) {
               $$5.renameTo($$4);
            }
         }

         $$2 = new axl(this.k, $$4);
         this.r.put($$1, $$2);
      }

      return $$2;
   }

   public amh g(asi $$0) {
      UUID $$1 = $$0.cG();
      amh $$2 = this.s.get($$1);
      if ($$2 == null) {
         Path $$3 = this.k.a(ewa.a).resolve($$1 + ".json");
         $$2 = new amh(this.k.aC(), this, this.k.aD(), $$3, $$0);
         this.s.put($$1, $$2);
      }

      $$2.a($$0);
      return $$2;
   }

   public void a(int $$0) {
      this.w = $$0;
      this.a(new afx($$0));

      for (ash $$1 : this.k.L()) {
         if ($$1 != null) {
            $$1.m().a($$0);
         }
      }
   }

   public void b(int $$0) {
      this.x = $$0;
      this.a(new agn($$0));

      for (ash $$1 : this.k.L()) {
         if ($$1 != null) {
            $$1.m().b($$0);
         }
      }
   }

   public List<asi> t() {
      return this.l;
   }

   @Nullable
   public asi a(UUID $$0) {
      return this.m.get($$0);
   }

   public boolean d(GameProfile $$0) {
      return false;
   }

   public void u() {
      for (amh $$0 : this.s.values()) {
         $$0.a(this.k.aD());
      }

      this.a(new aat(aym.a(this.v)));
      dck $$1 = this.k.aI();
      ahg $$2 = new ahg($$1.b(), $$1.d());

      for (asi $$3 : this.l) {
         $$3.f.b($$2);
         $$3.J().a($$3);
      }
   }

   public boolean v() {
      return this.y;
   }
}
