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

public abstract class avc {
   public static final File a = new File("banned-players.json");
   public static final File b = new File("banned-ips.json");
   public static final File c = new File("ops.json");
   public static final File d = new File("whitelist.json");
   public static final wo e = wo.c("chat.filtered_full");
   public static final wo f = wo.c("multiplayer.disconnect.duplicate_login");
   private static final Logger h = LogUtils.getLogger();
   private static final int i = 600;
   private static final SimpleDateFormat j = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
   private final MinecraftServer k;
   private final List<ard> l = Lists.newArrayList();
   private final Map<UUID, ard> m = Maps.newHashMap();
   private final avi n = new avi(a);
   private final auz o = new auz(b);
   private final avd p = new avd(c);
   private final avk q = new avk(d);
   private final Map<UUID, awf> r = Maps.newHashMap();
   private final Map<UUID, alc> s = Maps.newHashMap();
   private final evg t;
   private boolean u;
   private final jy<ald> v;
   protected final int g;
   private int w;
   private int x;
   private boolean y;
   private static final boolean z = false;
   private int A;

   public avc(MinecraftServer $$0, jy<ald> $$1, evg $$2, int $$3) {
      this.k = $$0;
      this.v = $$1;
      this.g = $$3;
      this.t = $$2;
   }

   public void a(vi $$0, ard $$1, ars $$2) {
      GameProfile $$3 = $$1.gh();
      auy $$4 = this.k.at();
      String $$6;
      if ($$4 != null) {
         Optional<GameProfile> $$5 = $$4.a($$3.getId());
         $$6 = $$5.<String>map(GameProfile::getName).orElse($$3.getName());
         $$4.a($$3);
      } else {
         $$6 = $$3.getName();
      }

      Optional<tq> $$8 = this.a($$1);
      akt<dgg> $$9 = $$8.<akt<dgg>>flatMap($$0x -> eaq.a(new Dynamic(ue.a, $$0x.c("Dimension"))).resultOrPartial(h::error)).orElse(dgg.i);
      arc $$10 = this.k.a($$9);
      arc $$11;
      if ($$10 == null) {
         h.warn("Unknown respawn dimension {}, defaulting to overworld", $$9);
         $$11 = this.k.J();
      } else {
         $$11 = $$10;
      }

      $$1.a($$11);
      String $$13 = $$0.a(this.k.bl());
      h.info("{}[{}] logged in with entity id {} at ({}, {}, {})", new Object[]{$$1.al().getString(), $$13, $$1.ar(), $$1.dB(), $$1.dD(), $$1.dH()});
      euz $$14 = $$11.D_();
      $$1.c($$8.orElse(null));
      asf $$15 = new asf(this.k, $$0, $$1, $$2);
      $$0.a(age.a.a(vz.a(this.k.ba())), $$15);
      dgc $$16 = $$11.O();
      boolean $$17 = $$16.b(dgc.E);
      boolean $$18 = $$16.b(dgc.q);
      boolean $$19 = $$16.b(dgc.x);
      $$15.b(new adc($$1.ar(), $$14.l(), this.k.K(), this.n(), this.w, this.x, $$18, !$$17, $$19, $$1.b($$11), this.k.aA()));
      $$15.b(new abx($$14.q(), $$14.r()));
      $$15.b(new adm($$1.gj()));
      $$15.b(new afa($$1.gi().j));
      dbj $$20 = this.k.aI();
      $$15.b(new afz($$20.b(), $$20.d()));
      this.e($$1);
      $$1.I().c();
      $$1.J().a($$1);
      this.a($$11.g(), $$1);
      this.k.av();
      xc $$21;
      if ($$1.gh().getName().equalsIgnoreCase($$6)) {
         $$21 = wo.a("multiplayer.player.joined", $$1.p_());
      } else {
         $$21 = wo.a("multiplayer.player.joined.renamed", $$1.p_(), $$6);
      }

      this.a($$21.a(n.o), false);
      $$15.a($$1.dB(), $$1.dD(), $$1.dH(), $$1.dM(), $$1.dO());
      ajr $$23 = this.k.au();
      if ($$23 != null && !$$2.d()) {
         $$1.a($$23);
      }

      $$1.f.b(ads.a(this.l));
      this.l.add($$1);
      this.m.put($$1.cG(), $$1);
      this.a(ads.a(List.of($$1)));
      this.a($$1, $$11);
      $$11.a($$1);
      this.k.aM().a($$1);
      this.d($$1);
      $$1.b($$8);
      $$1.a($$8);
      $$1.d();
   }

   protected void a(aln $$0, ard $$1) {
      Set<fbv> $$2 = Sets.newHashSet();

      for (fby $$3 : $$0.g()) {
         $$1.f.b(afe.a($$3, true));
      }

      for (fbu $$4 : fbu.values()) {
         fbv $$5 = $$0.a($$4);
         if ($$5 != null && !$$2.contains($$5)) {
            for (yv<?> $$7 : $$0.d($$5)) {
               $$1.f.b($$7);
            }

            $$2.add($$5);
         }
      }
   }

   public void a(arc $$0) {
      $$0.F_().a(new dyj() {
         @Override
         public void a(dyl $$0, double $$1) {
            avc.this.a(new ael($$0));
         }

         @Override
         public void a(dyl $$0, double $$1, double $$2, long $$3) {
            avc.this.a(new aek($$0));
         }

         @Override
         public void a(dyl $$0, double $$1, double $$2) {
            avc.this.a(new aej($$0));
         }

         @Override
         public void a(dyl $$0, int $$1) {
            avc.this.a(new aem($$0));
         }

         @Override
         public void b(dyl $$0, int $$1) {
            avc.this.a(new aen($$0));
         }

         @Override
         public void b(dyl $$0, double $$1) {
         }

         @Override
         public void c(dyl $$0, double $$1) {
         }
      });
   }

   public Optional<tq> a(ard $$0) {
      tq $$1 = this.k.aZ().w();
      Optional<tq> $$2;
      if (this.k.a($$0.gh()) && $$1 != null) {
         $$2 = Optional.of($$1);
         $$0.g($$1);
         h.debug("loading single player");
      } else {
         $$2 = this.t.b($$0);
      }

      return $$2;
   }

   protected void b(ard $$0) {
      this.t.a($$0);
      awf $$1 = this.r.get($$0.cG());
      if ($$1 != null) {
         $$1.a();
      }

      alc $$2 = this.s.get($$0.cG());
      if ($$2 != null) {
         $$2.b();
      }
   }

   public void c(ard $$0) {
      arc $$1 = $$0.y();
      $$0.a(awj.j);
      this.b($$0);
      if ($$0.bZ()) {
         buj $$2 = $$0.dg();
         if ($$2.df()) {
            h.debug("Removing player mount");
            $$0.ae();
            $$2.dc().forEach($$0x -> $$0x.c(buj.d.d));
         }
      }

      $$0.ao();

      for (cpy $$3 : $$0.ak()) {
         $$3.c(buj.d.d);
      }

      $$1.a($$0, buj.d.d);
      $$0.S().a();
      this.l.remove($$0);
      this.k.aM().b($$0);
      UUID $$4 = $$0.cG();
      ard $$5 = this.m.get($$4);
      if ($$5 == $$0) {
         this.m.remove($$4);
         this.r.remove($$4);
         this.s.remove($$4);
      }

      this.a(new adr(List.of($$0.cG())));
   }

   @Nullable
   public wo a(SocketAddress $$0, GameProfile $$1) {
      if (this.n.a($$1)) {
         avj $$2 = this.n.b($$1);
         xc $$3 = wo.a("multiplayer.disconnect.banned.reason", $$2.d());
         if ($$2.c() != null) {
            $$3.b(wo.a("multiplayer.disconnect.banned.expiration", j.format($$2.c())));
         }

         return $$3;
      } else if (!this.c($$1)) {
         return wo.c("multiplayer.disconnect.not_whitelisted");
      } else if (this.o.a($$0)) {
         ava $$4 = this.o.b($$0);
         xc $$5 = wo.a("multiplayer.disconnect.banned_ip.reason", $$4.d());
         if ($$4.c() != null) {
            $$5.b(wo.a("multiplayer.disconnect.banned_ip.expiration", j.format($$4.c())));
         }

         return $$5;
      } else {
         return this.l.size() >= this.g && !this.d($$1) ? wo.c("multiplayer.disconnect.server_full") : null;
      }
   }

   public ard a(GameProfile $$0, aqn $$1) {
      return new ard(this.k, this.k.J(), $$0, $$1);
   }

   public boolean e(GameProfile $$0) {
      UUID $$1 = $$0.getId();
      Set<ard> $$2 = Sets.newIdentityHashSet();

      for (ard $$3 : this.l) {
         if ($$3.cG().equals($$1)) {
            $$2.add($$3);
         }
      }

      ard $$4 = this.m.get($$0.getId());
      if ($$4 != null) {
         $$2.add($$4);
      }

      for (ard $$5 : $$2) {
         $$5.f.a(f);
      }

      return !$$2.isEmpty();
   }

   public ard a(ard $$0, boolean $$1, buj.d $$2) {
      this.l.remove($$0);
      $$0.y().a($$0, $$2);
      etx $$3 = $$0.a(!$$1, etx.a);
      arc $$4 = $$3.b();
      ard $$5 = new ard(this.k, $$4, $$0.gh(), $$0.C());
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

      fay $$7 = $$3.c();
      $$5.b($$7.d, $$7.e, $$7.f, $$3.e(), $$3.f());
      if ($$3.g()) {
         $$5.f.b(new acs(acs.b, 0.0F));
      }

      byte $$8 = (byte)($$1 ? 1 : 0);
      arc $$9 = $$5.y();
      euz $$10 = $$9.D_();
      $$5.f.b(new aed($$5.b($$9), $$8));
      $$5.f.a($$5.dB(), $$5.dD(), $$5.dH(), $$5.dM(), $$5.dO());
      $$5.f.b(new aes($$4.Z(), $$4.aa()));
      $$5.f.b(new abx($$10.q(), $$10.r()));
      $$5.f.b(new aey($$5.ct, $$5.cs, $$5.cr));
      this.d($$5);
      this.a($$5, $$4);
      this.e($$5);
      $$4.b($$5);
      this.l.add($$5);
      this.m.put($$5.cG(), $$5);
      $$5.d();
      $$5.x($$5.eE());
      ji $$11 = $$5.T();
      arc $$12 = this.k.a($$5.V());
      if (!$$1 && $$11 != null && $$12 != null) {
         dwv $$13 = $$12.a_($$11);
         if ($$13.a(djm.pN)) {
            $$5.f.b(new afm(avz.vY, awa.e, (double)$$11.u(), (double)$$11.v(), (double)$$11.w(), 1.0F, 1.0F, $$4.H_().g()));
         }
      }

      return $$5;
   }

   public void d(ard $$0) {
      this.a($$0, $$0.f);
   }

   public void a(bvf $$0, asf $$1) {
      for (bto $$2 : $$0.eB()) {
         $$1.b(new afy($$0.ar(), $$2, false));
      }
   }

   public void e(ard $$0) {
      GameProfile $$1 = $$0.gh();
      int $$2 = this.k.c($$1);
      this.a($$0, $$2);
   }

   public void d() {
      if (++this.A > 600) {
         this.a(new ads(EnumSet.of(ads.a.e), this.l));
         this.A = 0;
      }
   }

   public void a(yv<?> $$0) {
      for (ard $$1 : this.l) {
         $$1.f.b($$0);
      }
   }

   public void a(yv<?> $$0, akt<dgg> $$1) {
      for (ard $$2 : this.l) {
         if ($$2.dW().ai() == $$1) {
            $$2.f.b($$0);
         }
      }
   }

   public void a(cov $$0, wo $$1) {
      fcf $$2 = $$0.cr();
      if ($$2 != null) {
         for (String $$4 : $$2.g()) {
            ard $$5 = this.a($$4);
            if ($$5 != null && $$5 != $$0) {
               $$5.a($$1);
            }
         }
      }
   }

   public void b(cov $$0, wo $$1) {
      fcf $$2 = $$0.cr();
      if ($$2 == null) {
         this.a($$1, false);
      } else {
         for (int $$3 = 0; $$3 < this.l.size(); $$3++) {
            ard $$4 = this.l.get($$3);
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

   public avi f() {
      return this.n;
   }

   public auz g() {
      return this.o;
   }

   public void a(GameProfile $$0) {
      this.p.a(new ave($$0, this.k.k(), this.p.a($$0)));
      ard $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.e($$1);
      }
   }

   public void b(GameProfile $$0) {
      this.p.c($$0);
      ard $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.e($$1);
      }
   }

   private void a(ard $$0, int $$1) {
      if ($$0.f != null) {
         byte $$2;
         if ($$1 <= 0) {
            $$2 = 24;
         } else if ($$1 >= 4) {
            $$2 = 28;
         } else {
            $$2 = (byte)(24 + $$1);
         }

         $$0.f.b(new aco($$0, $$2));
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
   public ard a(String $$0) {
      int $$1 = this.l.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         ard $$3 = this.l.get($$2);
         if ($$3.gh().getName().equalsIgnoreCase($$0)) {
            return $$3;
         }
      }

      return null;
   }

   public void a(@Nullable cov $$0, double $$1, double $$2, double $$3, double $$4, akt<dgg> $$5, yv<?> $$6) {
      for (int $$7 = 0; $$7 < this.l.size(); $$7++) {
         ard $$8 = this.l.get($$7);
         if ($$8 != $$0 && $$8.dW().ai() == $$5) {
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

   public avk i() {
      return this.q;
   }

   public String[] j() {
      return this.q.a();
   }

   public avd k() {
      return this.p;
   }

   public String[] l() {
      return this.p.a();
   }

   public void a() {
   }

   public void a(ard $$0, arc $$1) {
      dyl $$2 = this.k.J().F_();
      $$0.f.b(new acv($$2));
      $$0.f.b(new afi($$1.ad(), $$1.ae(), $$1.O().b(dgc.l)));
      $$0.f.b(new aes($$1.Z(), $$1.aa()));
      if ($$1.ag()) {
         $$0.f.b(new acs(acs.c, 0.0F));
         $$0.f.b(new acs(acs.i, $$1.d(1.0F)));
         $$0.f.b(new acs(acs.j, $$1.b(1.0F)));
      }

      $$0.f.b(new acs(acs.o, 0.0F));
      this.k.aP().a($$0);
   }

   public void f(ard $$0) {
      $$0.cc.b();
      $$0.v();
      $$0.f.b(new afa($$0.gi().j));
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

   public List<ard> b(String $$0) {
      List<ard> $$1 = Lists.newArrayList();

      for (ard $$2 : this.l) {
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
   public tq r() {
      return null;
   }

   public void b(boolean $$0) {
      this.y = $$0;
   }

   public void s() {
      for (int $$0 = 0; $$0 < this.l.size(); $$0++) {
         this.l.get($$0).f.a(wo.c("multiplayer.disconnect.server_shutdown"));
      }
   }

   public void a(wo $$0, boolean $$1) {
      this.a($$0, $$1x -> $$0, $$1);
   }

   public void a(wo $$0, Function<ard, wo> $$1, boolean $$2) {
      this.k.a($$0);

      for (ard $$3 : this.l) {
         wo $$4 = $$1.apply($$3);
         if ($$4 != null) {
            $$3.b($$4, $$2);
         }
      }
   }

   public void a(xe $$0, ex $$1, wk.a $$2) {
      this.a($$0, $$1::a, $$1.i(), $$2);
   }

   public void a(xe $$0, ard $$1, wk.a $$2) {
      this.a($$0, $$1::c, $$1, $$2);
   }

   private void a(xe $$0, Predicate<ard> $$1, @Nullable ard $$2, wk.a $$3) {
      boolean $$4 = this.a($$0);
      this.k.a($$0.d(), $$3, $$4 ? null : "Not Secure");
      xd $$5 = xd.a($$0);
      boolean $$6 = false;

      for (ard $$7 : this.l) {
         boolean $$8 = $$1.test($$7);
         $$7.a($$5, $$8, $$3);
         $$6 |= $$8 && $$0.j();
      }

      if ($$6 && $$2 != null) {
         $$2.a(e);
      }
   }

   private boolean a(xe $$0) {
      return $$0.i() && !$$0.a(Instant.now());
   }

   public awf a(cov $$0) {
      UUID $$1 = $$0.cG();
      awf $$2 = this.r.get($$1);
      if ($$2 == null) {
         File $$3 = this.k.a(evb.b).toFile();
         File $$4 = new File($$3, $$1 + ".json");
         if (!$$4.exists()) {
            File $$5 = new File($$3, $$0.al().getString() + ".json");
            Path $$6 = $$5.toPath();
            if (v.a($$6) && v.b($$6) && $$6.startsWith($$3.getPath()) && $$5.isFile()) {
               $$5.renameTo($$4);
            }
         }

         $$2 = new awf(this.k, $$4);
         this.r.put($$1, $$2);
      }

      return $$2;
   }

   public alc g(ard $$0) {
      UUID $$1 = $$0.cG();
      alc $$2 = this.s.get($$1);
      if ($$2 == null) {
         Path $$3 = this.k.a(evb.a).resolve($$1 + ".json");
         $$2 = new alc(this.k.aC(), this, this.k.aD(), $$3, $$0);
         this.s.put($$1, $$2);
      }

      $$2.a($$0);
      return $$2;
   }

   public void a(int $$0) {
      this.w = $$0;
      this.a(new aeq($$0));

      for (arc $$1 : this.k.L()) {
         if ($$1 != null) {
            $$1.m().a($$0);
         }
      }
   }

   public void b(int $$0) {
      this.x = $$0;
      this.a(new afg($$0));

      for (arc $$1 : this.k.L()) {
         if ($$1 != null) {
            $$1.m().b($$0);
         }
      }
   }

   public List<ard> t() {
      return this.l;
   }

   @Nullable
   public ard a(UUID $$0) {
      return this.m.get($$0);
   }

   public boolean d(GameProfile $$0) {
      return false;
   }

   public void u() {
      for (alc $$0 : this.s.values()) {
         $$0.a(this.k.aD());
      }

      this.a(new zm(axg.a(this.v)));
      dbj $$1 = this.k.aI();
      afz $$2 = new afz($$1.b(), $$1.d());

      for (ard $$3 : this.l) {
         $$3.f.b($$2);
         $$3.J().a($$3);
      }
   }

   public boolean v() {
      return this.y;
   }
}
