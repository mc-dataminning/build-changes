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

public abstract class avq {
   public static final File a = new File("banned-players.json");
   public static final File b = new File("banned-ips.json");
   public static final File c = new File("ops.json");
   public static final File d = new File("whitelist.json");
   public static final xj e = xj.c("chat.filtered_full");
   public static final xj f = xj.c("multiplayer.disconnect.duplicate_login");
   private static final Logger h = LogUtils.getLogger();
   private static final int i = 600;
   private static final SimpleDateFormat j = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
   private final MinecraftServer k;
   private final List<arq> l = Lists.newArrayList();
   private final Map<UUID, arq> m = Maps.newHashMap();
   private final avw n = new avw(a);
   private final avn o = new avn(b);
   private final avr p = new avr(c);
   private final avy q = new avy(d);
   private final Map<UUID, awt> r = Maps.newHashMap();
   private final Map<UUID, alr> s = Maps.newHashMap();
   private final eue t;
   private boolean u;
   private final jx<als> v;
   protected final int g;
   private int w;
   private int x;
   private boolean y;
   private static final boolean z = false;
   private int A;

   public avq(MinecraftServer $$0, jx<als> $$1, eue $$2, int $$3) {
      this.k = $$0;
      this.v = $$1;
      this.g = $$3;
      this.t = $$2;
   }

   public void a(wd $$0, arq $$1, asf $$2) {
      GameProfile $$3 = $$1.gf();
      avm $$4 = this.k.at();
      String $$6;
      if ($$4 != null) {
         Optional<GameProfile> $$5 = $$4.a($$3.getId());
         $$6 = $$5.<String>map(GameProfile::getName).orElse($$3.getName());
         $$4.a($$3);
      } else {
         $$6 = $$3.getName();
      }

      Optional<ul> $$8 = this.a($$1);
      ali<dfm> $$9 = $$8.<ali<dfm>>flatMap($$0x -> dzq.a(new Dynamic(uz.a, $$0x.c("Dimension"))).resultOrPartial(h::error)).orElse(dfm.i);
      arp $$10 = this.k.a($$9);
      arp $$11;
      if ($$10 == null) {
         h.warn("Unknown respawn dimension {}, defaulting to overworld", $$9);
         $$11 = this.k.J();
      } else {
         $$11 = $$10;
      }

      $$1.a($$11);
      String $$13 = $$0.a(this.k.bl());
      h.info("{}[{}] logged in with entity id {} at ({}, {}, {})", new Object[]{$$1.al().getString(), $$13, $$1.ar(), $$1.dA(), $$1.dC(), $$1.dG()});
      etx $$14 = $$11.C_();
      $$1.c($$8.orElse(null));
      ass $$15 = new ass(this.k, $$0, $$1, $$2);
      $$0.a(agv.a.a(wu.a(this.k.ba())), $$15);
      dfi $$16 = $$11.N();
      boolean $$17 = $$16.b(dfi.D);
      boolean $$18 = $$16.b(dfi.q);
      boolean $$19 = $$16.b(dfi.w);
      $$15.b(new adw($$1.ar(), $$14.l(), this.k.K(), this.n(), this.w, this.x, $$18, !$$17, $$19, $$1.b($$11), this.k.aA()));
      $$15.b(new acs($$14.q(), $$14.r()));
      $$15.b(new aeg($$1.gh()));
      $$15.b(new afr($$1.gg().j));
      $$15.b(new agq(this.k.aI().e()));
      this.e($$1);
      $$1.I().c();
      $$1.J().a($$1);
      this.a($$11.g(), $$1);
      this.k.av();
      xx $$20;
      if ($$1.gf().getName().equalsIgnoreCase($$6)) {
         $$20 = xj.a("multiplayer.player.joined", $$1.o_());
      } else {
         $$20 = xj.a("multiplayer.player.joined.renamed", $$1.o_(), $$6);
      }

      this.a($$20.a(n.o), false);
      $$15.a($$1.dA(), $$1.dC(), $$1.dG(), $$1.dL(), $$1.dN());
      akg $$22 = this.k.au();
      if ($$22 != null && !$$2.d()) {
         $$1.a($$22);
      }

      $$1.f.b(aem.a(this.l));
      this.l.add($$1);
      this.m.put($$1.cG(), $$1);
      this.a(aem.a(List.of($$1)));
      this.a($$1, $$11);
      $$11.a($$1);
      this.k.aM().a($$1);
      this.d($$1);
      $$1.b($$8);
      $$1.a($$8);
      $$1.d();
   }

   protected void a(amc $$0, arq $$1) {
      Set<fav> $$2 = Sets.newHashSet();

      for (fay $$3 : $$0.g()) {
         $$1.f.b(afv.a($$3, true));
      }

      for (fau $$4 : fau.values()) {
         fav $$5 = $$0.a($$4);
         if ($$5 != null && !$$2.contains($$5)) {
            for (zq<?> $$7 : $$0.d($$5)) {
               $$1.f.b($$7);
            }

            $$2.add($$5);
         }
      }
   }

   public void a(arp $$0) {
      $$0.E_().a(new dxj() {
         @Override
         public void a(dxl $$0, double $$1) {
            avq.this.a(new afc($$0));
         }

         @Override
         public void a(dxl $$0, double $$1, double $$2, long $$3) {
            avq.this.a(new afb($$0));
         }

         @Override
         public void a(dxl $$0, double $$1, double $$2) {
            avq.this.a(new afa($$0));
         }

         @Override
         public void a(dxl $$0, int $$1) {
            avq.this.a(new afd($$0));
         }

         @Override
         public void b(dxl $$0, int $$1) {
            avq.this.a(new afe($$0));
         }

         @Override
         public void b(dxl $$0, double $$1) {
         }

         @Override
         public void c(dxl $$0, double $$1) {
         }
      });
   }

   public Optional<ul> a(arq $$0) {
      ul $$1 = this.k.aZ().w();
      Optional<ul> $$2;
      if (this.k.a($$0.gf()) && $$1 != null) {
         $$2 = Optional.of($$1);
         $$0.g($$1);
         h.debug("loading single player");
      } else {
         $$2 = this.t.b($$0);
      }

      return $$2;
   }

   protected void b(arq $$0) {
      this.t.a($$0);
      awt $$1 = this.r.get($$0.cG());
      if ($$1 != null) {
         $$1.a();
      }

      alr $$2 = this.s.get($$0.cG());
      if ($$2 != null) {
         $$2.b();
      }
   }

   public void c(arq $$0) {
      arp $$1 = $$0.y();
      $$0.a(awx.j);
      this.b($$0);
      if ($$0.bZ()) {
         bul $$2 = $$0.dg();
         if ($$2.df()) {
            h.debug("Removing player mount");
            $$0.ae();
            $$2.dc().forEach($$0x -> $$0x.b(bul.c.d));
         }
      }

      $$0.ao();

      for (cpx $$3 : $$0.ak()) {
         $$3.b(bul.c.d);
      }

      $$1.a($$0, bul.c.d);
      $$0.S().a();
      this.l.remove($$0);
      this.k.aM().b($$0);
      UUID $$4 = $$0.cG();
      arq $$5 = this.m.get($$4);
      if ($$5 == $$0) {
         this.m.remove($$4);
         this.r.remove($$4);
         this.s.remove($$4);
      }

      this.a(new ael(List.of($$0.cG())));
   }

   @Nullable
   public xj a(SocketAddress $$0, GameProfile $$1) {
      if (this.n.a($$1)) {
         avx $$2 = this.n.b($$1);
         xx $$3 = xj.a("multiplayer.disconnect.banned.reason", $$2.d());
         if ($$2.c() != null) {
            $$3.b(xj.a("multiplayer.disconnect.banned.expiration", j.format($$2.c())));
         }

         return $$3;
      } else if (!this.c($$1)) {
         return xj.c("multiplayer.disconnect.not_whitelisted");
      } else if (this.o.a($$0)) {
         avo $$4 = this.o.b($$0);
         xx $$5 = xj.a("multiplayer.disconnect.banned_ip.reason", $$4.d());
         if ($$4.c() != null) {
            $$5.b(xj.a("multiplayer.disconnect.banned_ip.expiration", j.format($$4.c())));
         }

         return $$5;
      } else {
         return this.l.size() >= this.g && !this.d($$1) ? xj.c("multiplayer.disconnect.server_full") : null;
      }
   }

   public arq a(GameProfile $$0, ara $$1) {
      return new arq(this.k, this.k.J(), $$0, $$1);
   }

   public boolean e(GameProfile $$0) {
      UUID $$1 = $$0.getId();
      Set<arq> $$2 = Sets.newIdentityHashSet();

      for (arq $$3 : this.l) {
         if ($$3.cG().equals($$1)) {
            $$2.add($$3);
         }
      }

      arq $$4 = this.m.get($$0.getId());
      if ($$4 != null) {
         $$2.add($$4);
      }

      for (arq $$5 : $$2) {
         $$5.f.a(f);
      }

      return !$$2.isEmpty();
   }

   public arq a(arq $$0, boolean $$1, bul.c $$2) {
      this.l.remove($$0);
      $$0.y().a($$0, $$2);
      est $$3 = $$0.a(!$$1, est.a);
      arp $$4 = $$3.a();
      arq $$5 = new arq(this.k, $$4, $$0.gf(), $$0.C());
      $$5.f = $$0.f;
      $$5.a($$0, $$1);
      $$5.e($$0.ar());
      $$5.b($$0.fw());
      if (!$$3.f()) {
         $$5.b($$0);
      }

      for (String $$6 : $$0.as()) {
         $$5.a($$6);
      }

      ezy $$7 = $$3.b();
      $$5.b($$7.d, $$7.e, $$7.f, $$3.d(), $$3.e());
      if ($$3.f()) {
         $$5.f.b(new adm(adm.b, 0.0F));
      }

      byte $$8 = (byte)($$1 ? 1 : 0);
      arp $$9 = $$5.y();
      etx $$10 = $$9.C_();
      $$5.f.b(new aeu($$5.b($$9), $$8));
      $$5.f.a($$5.dA(), $$5.dC(), $$5.dG(), $$5.dL(), $$5.dN());
      $$5.f.b(new afj($$4.X(), $$4.Y()));
      $$5.f.b(new acs($$10.q(), $$10.r()));
      $$5.f.b(new afp($$5.cr, $$5.cq, $$5.cp));
      this.d($$5);
      this.a($$5, $$4);
      this.e($$5);
      $$4.b($$5);
      this.l.add($$5);
      this.m.put($$5.cG(), $$5);
      $$5.d();
      $$5.x($$5.eD());
      jh $$11 = $$5.T();
      arp $$12 = this.k.a($$5.V());
      if (!$$1 && $$11 != null && $$12 != null) {
         dvv $$13 = $$12.a_($$11);
         if ($$13.a(dis.pl)) {
            $$5.f.b(new agd(awn.vx, awo.e, (double)$$11.u(), (double)$$11.v(), (double)$$11.w(), 1.0F, 1.0F, $$4.G_().g()));
         }
      }

      return $$5;
   }

   public void d(arq $$0) {
      this.a($$0, $$0.f);
   }

   public void a(bvh $$0, ass $$1) {
      for (btq $$2 : $$0.eA()) {
         $$1.b(new agp($$0.ar(), $$2, false));
      }
   }

   public void e(arq $$0) {
      GameProfile $$1 = $$0.gf();
      int $$2 = this.k.c($$1);
      this.a($$0, $$2);
   }

   public void d() {
      if (++this.A > 600) {
         this.a(new aem(EnumSet.of(aem.a.e), this.l));
         this.A = 0;
      }
   }

   public void a(zq<?> $$0) {
      for (arq $$1 : this.l) {
         $$1.f.b($$0);
      }
   }

   public void a(zq<?> $$0, ali<dfm> $$1) {
      for (arq $$2 : this.l) {
         if ($$2.dV().ag() == $$1) {
            $$2.f.b($$0);
         }
      }
   }

   public void a(cou $$0, xj $$1) {
      fbf $$2 = $$0.cr();
      if ($$2 != null) {
         for (String $$4 : $$2.g()) {
            arq $$5 = this.a($$4);
            if ($$5 != null && $$5 != $$0) {
               $$5.a($$1);
            }
         }
      }
   }

   public void b(cou $$0, xj $$1) {
      fbf $$2 = $$0.cr();
      if ($$2 == null) {
         this.a($$1, false);
      } else {
         for (int $$3 = 0; $$3 < this.l.size(); $$3++) {
            arq $$4 = this.l.get($$3);
            if ($$4.cr() != $$2) {
               $$4.a($$1);
            }
         }
      }
   }

   public String[] e() {
      String[] $$0 = new String[this.l.size()];

      for (int $$1 = 0; $$1 < this.l.size(); $$1++) {
         $$0[$$1] = this.l.get($$1).gf().getName();
      }

      return $$0;
   }

   public avw f() {
      return this.n;
   }

   public avn g() {
      return this.o;
   }

   public void a(GameProfile $$0) {
      this.p.a(new avs($$0, this.k.k(), this.p.a($$0)));
      arq $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.e($$1);
      }
   }

   public void b(GameProfile $$0) {
      this.p.c($$0);
      arq $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.e($$1);
      }
   }

   private void a(arq $$0, int $$1) {
      if ($$0.f != null) {
         byte $$2;
         if ($$1 <= 0) {
            $$2 = 24;
         } else if ($$1 >= 4) {
            $$2 = 28;
         } else {
            $$2 = (byte)(24 + $$1);
         }

         $$0.f.b(new adj($$0, $$2));
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
   public arq a(String $$0) {
      int $$1 = this.l.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         arq $$3 = this.l.get($$2);
         if ($$3.gf().getName().equalsIgnoreCase($$0)) {
            return $$3;
         }
      }

      return null;
   }

   public void a(@Nullable cou $$0, double $$1, double $$2, double $$3, double $$4, ali<dfm> $$5, zq<?> $$6) {
      for (int $$7 = 0; $$7 < this.l.size(); $$7++) {
         arq $$8 = this.l.get($$7);
         if ($$8 != $$0 && $$8.dV().ag() == $$5) {
            double $$9 = $$1 - $$8.dA();
            double $$10 = $$2 - $$8.dC();
            double $$11 = $$3 - $$8.dG();
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

   public avy i() {
      return this.q;
   }

   public String[] j() {
      return this.q.a();
   }

   public avr k() {
      return this.p;
   }

   public String[] l() {
      return this.p.a();
   }

   public void a() {
   }

   public void a(arq $$0, arp $$1) {
      dxl $$2 = this.k.J().E_();
      $$0.f.b(new adp($$2));
      $$0.f.b(new afz($$1.ab(), $$1.ac(), $$1.N().b(dfi.l)));
      $$0.f.b(new afj($$1.X(), $$1.Y()));
      if ($$1.ae()) {
         $$0.f.b(new adm(adm.c, 0.0F));
         $$0.f.b(new adm(adm.i, $$1.d(1.0F)));
         $$0.f.b(new adm(adm.j, $$1.b(1.0F)));
      }

      $$0.f.b(new adm(adm.o, 0.0F));
      this.k.aP().a($$0);
   }

   public void f(arq $$0) {
      $$0.cb.b();
      $$0.v();
      $$0.f.b(new afr($$0.gg().j));
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

   public List<arq> b(String $$0) {
      List<arq> $$1 = Lists.newArrayList();

      for (arq $$2 : this.l) {
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
   public ul r() {
      return null;
   }

   public void b(boolean $$0) {
      this.y = $$0;
   }

   public void s() {
      for (int $$0 = 0; $$0 < this.l.size(); $$0++) {
         this.l.get($$0).f.a(xj.c("multiplayer.disconnect.server_shutdown"));
      }
   }

   public void a(xj $$0, boolean $$1) {
      this.a($$0, $$1x -> $$0, $$1);
   }

   public void a(xj $$0, Function<arq, xj> $$1, boolean $$2) {
      this.k.a($$0);

      for (arq $$3 : this.l) {
         xj $$4 = $$1.apply($$3);
         if ($$4 != null) {
            $$3.b($$4, $$2);
         }
      }
   }

   public void a(xz $$0, ew $$1, xf.a $$2) {
      this.a($$0, $$1::a, $$1.i(), $$2);
   }

   public void a(xz $$0, arq $$1, xf.a $$2) {
      this.a($$0, $$1::c, $$1, $$2);
   }

   private void a(xz $$0, Predicate<arq> $$1, @Nullable arq $$2, xf.a $$3) {
      boolean $$4 = this.a($$0);
      this.k.a($$0.d(), $$3, $$4 ? null : "Not Secure");
      xy $$5 = xy.a($$0);
      boolean $$6 = false;

      for (arq $$7 : this.l) {
         boolean $$8 = $$1.test($$7);
         $$7.a($$5, $$8, $$3);
         $$6 |= $$8 && $$0.j();
      }

      if ($$6 && $$2 != null) {
         $$2.a(e);
      }
   }

   private boolean a(xz $$0) {
      return $$0.i() && !$$0.a(Instant.now());
   }

   public awt a(cou $$0) {
      UUID $$1 = $$0.cG();
      awt $$2 = this.r.get($$1);
      if ($$2 == null) {
         File $$3 = this.k.a(etz.b).toFile();
         File $$4 = new File($$3, $$1 + ".json");
         if (!$$4.exists()) {
            File $$5 = new File($$3, $$0.al().getString() + ".json");
            Path $$6 = $$5.toPath();
            if (v.a($$6) && v.b($$6) && $$6.startsWith($$3.getPath()) && $$5.isFile()) {
               $$5.renameTo($$4);
            }
         }

         $$2 = new awt(this.k, $$4);
         this.r.put($$1, $$2);
      }

      return $$2;
   }

   public alr g(arq $$0) {
      UUID $$1 = $$0.cG();
      alr $$2 = this.s.get($$1);
      if ($$2 == null) {
         Path $$3 = this.k.a(etz.a).resolve($$1 + ".json");
         $$2 = new alr(this.k.aC(), this, this.k.aD(), $$3, $$0);
         this.s.put($$1, $$2);
      }

      $$2.a($$0);
      return $$2;
   }

   public void a(int $$0) {
      this.w = $$0;
      this.a(new afh($$0));

      for (arp $$1 : this.k.L()) {
         if ($$1 != null) {
            $$1.m().a($$0);
         }
      }
   }

   public void b(int $$0) {
      this.x = $$0;
      this.a(new afx($$0));

      for (arp $$1 : this.k.L()) {
         if ($$1 != null) {
            $$1.m().b($$0);
         }
      }
   }

   public List<arq> t() {
      return this.l;
   }

   @Nullable
   public arq a(UUID $$0) {
      return this.m.get($$0);
   }

   public boolean d(GameProfile $$0) {
      return false;
   }

   public void u() {
      for (alr $$0 : this.s.values()) {
         $$0.a(this.k.aD());
      }

      this.a(new aah(axu.a(this.v)));
      agq $$1 = new agq(this.k.aI().e());

      for (arq $$2 : this.l) {
         $$2.f.b($$1);
         $$2.J().a($$2);
      }
   }

   public boolean v() {
      return this.y;
   }
}
