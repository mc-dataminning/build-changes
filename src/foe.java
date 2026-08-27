import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class foe extends ctx {
   private static final Logger a = LogUtils.getLogger();
   private static final double b = 0.05;
   private static final int c = 10;
   private static final int d = 1000;
   final dnm e = new dnm();
   private final dns<blw> f = new dns<>(blw.class, new foe.b());
   private final fof D;
   private final ftr E;
   private final foe.a F;
   private final fti G;
   private final bkn H;
   private final evr I = evr.O();
   final List<fss> J = Lists.newArrayList();
   private final Map<String, egj> K = Maps.newHashMap();
   private static final long L = 16777215L;
   private int M;
   private final Object2ObjectArrayMap<cti, eww> N = ac.a(new Object2ObjectArrayMap(3), $$0x -> {
      $$0x.put(ftf.a, new eww($$0xx -> this.b($$0xx, ftf.a)));
      $$0x.put(ftf.b, new eww($$0xx -> this.b($$0xx, ftf.b)));
      $$0x.put(ftf.c, new eww($$0xx -> this.b($$0xx, ftf.c)));
   });
   private final foa O;
   private final Deque<Runnable> P = Queues.newArrayDeque();
   private int Q;
   private final fpm R = new fpm();
   private static final Set<cnb> S = Set.of(cnj.hA, cnj.hB);

   public void b(int $$0) {
      this.R.a($$0, this);
   }

   public void b(hx $$0, djp $$1, int $$2) {
      if (!this.R.a($$0, $$1)) {
         super.a($$0, $$1, $$2, 512);
      }
   }

   public void a(hx $$0, djp $$1, emc $$2) {
      djp $$3 = this.a_($$0);
      if ($$3 != $$1) {
         this.a($$0, $$1, 19);
         cfq $$4 = this.I.s;
         if (this == $$4.dL() && $$4.a($$0, $$1)) {
            $$4.h($$2.c, $$2.d, $$2.e);
         }
      }
   }

   fpm a() {
      return this.R;
   }

   @Override
   public boolean a(hx $$0, djp $$1, int $$2, int $$3) {
      if (this.R.c()) {
         djp $$4 = this.a_($$0);
         boolean $$5 = super.a($$0, $$1, $$2, $$3);
         if ($$5) {
            this.R.a($$0, $$4, this.I.s);
         }

         return $$5;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   public foe(fof $$0, foe.a $$1, ahg<ctx> $$2, ih<dmy> $$3, int $$4, int $$5, Supplier<bgt> $$6, ftr $$7, boolean $$8, long $$9) {
      super($$1, $$2, $$0.f(), $$3, $$6, true, $$8, $$9, 1000000);
      this.D = $$0;
      this.O = new foa(this, $$4);
      this.H = new bkn();
      this.F = $$1;
      this.E = $$7;
      this.G = fti.a($$3.a());
      this.a(new hx(8, 64, 8), 0.0F);
      this.Q = $$5;
      this.S();
      this.V();
   }

   public void a(Runnable $$0) {
      this.P.add($$0);
   }

   public void b() {
      int $$0 = this.P.size();
      int $$1 = $$0 < 1000 ? Math.max(10, $$0 / 10) : $$0;

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Runnable $$3 = this.P.poll();
         if ($$3 == null) {
            break;
         }

         $$3.run();
      }
   }

   public boolean c() {
      return this.P.isEmpty();
   }

   public fti d() {
      return this.G;
   }

   public void a(BooleanSupplier $$0) {
      this.D_().s();
      if (this.s().i()) {
         this.n();
      }

      if (this.M > 0) {
         this.c(this.M - 1);
      }

      this.af().a("blocks");
      this.O.a($$0, true);
      this.af().c();
   }

   private void n() {
      this.b(this.A.e() + 1L);
      if (this.A.q().b(ctt.l)) {
         this.c(this.A.f() + 1L);
      }
   }

   public void b(long $$0) {
      this.F.a($$0);
   }

   public void c(long $$0) {
      if ($$0 < 0L) {
         $$0 = -$$0;
         this.Z().a(ctt.l).a(false, null);
      } else {
         this.Z().a(ctt.l).a(true, null);
      }

      this.F.b($$0);
   }

   public Iterable<blw> e() {
      return this.G().a();
   }

   public void f() {
      bgt $$0 = this.af();
      $$0.a("entities");
      this.e.a($$0x -> {
         if (!$$0x.dG() && !$$0x.bO() && !this.H.a($$0x)) {
            this.a(this::a, $$0x);
         }
      });
      $$0.c();
      this.R();
   }

   @Override
   public boolean h(blw $$0) {
      return $$0.dn().a(this.I.s.dn()) <= this.Q;
   }

   public void a(blw $$0) {
      $$0.bp();
      $$0.ah++;
      this.af().a(() -> kd.g.b($$0.ai()).toString());
      $$0.l();
      this.af().c();

      for (blw $$1 : $$0.cP()) {
         this.a($$0, $$1);
      }
   }

   private void a(blw $$0, blw $$1) {
      if ($$1.dG() || $$1.cZ() != $$0) {
         $$1.ac();
      } else if ($$1 instanceof cfq || this.e.c($$1)) {
         $$1.bp();
         $$1.ah++;
         $$1.t();

         for (blw $$2 : $$1.cP()) {
            this.a($$1, $$2);
         }
      }
   }

   public void a(dlw $$0) {
      $$0.I();
      this.O.p().a($$0.f(), false);
      this.f.b($$0.f());
   }

   public void a(cte $$0) {
      this.N.forEach(($$1, $$2) -> $$2.a($$0.e, $$0.f));
      this.f.a($$0);
      this.E.a($$0);
   }

   public void g() {
      this.N.forEach(($$0, $$1) -> $$1.a());
   }

   @Override
   public boolean b(int $$0, int $$1) {
      return true;
   }

   public int h() {
      return this.f.b();
   }

   public void c(blw $$0) {
      this.a($$0.aj(), blw.c.b);
      this.f.a($$0);
   }

   public void a(int $$0, blw.c $$1) {
      blw $$2 = this.G().a($$0);
      if ($$2 != null) {
         $$2.b($$1);
         $$2.ao();
      }
   }

   @Nullable
   @Override
   public blw a(int $$0) {
      return this.G().a($$0);
   }

   @Override
   public void W() {
      this.D.m().a(vg.c("multiplayer.status.quitting"));
   }

   public void b(int $$0, int $$1, int $$2) {
      int $$3 = 32;
      auw $$4 = auw.a();
      cwy $$5 = this.p();
      hx.a $$6 = new hx.a();

      for (int $$7 = 0; $$7 < 667; $$7++) {
         this.a($$0, $$1, $$2, 16, $$4, $$5, $$6);
         this.a($$0, $$1, $$2, 32, $$4, $$5, $$6);
      }
   }

   @Nullable
   private cwy p() {
      if (this.I.q.j() == ctu.b) {
         cng $$0 = this.I.s.eT();
         cnb $$1 = $$0.d();
         if (S.contains($$1) && $$1 instanceof cla $$2) {
            return $$2.e();
         }
      }

      return null;
   }

   public void a(int $$0, int $$1, int $$2, int $$3, auw $$4, @Nullable cwy $$5, hx.a $$6) {
      int $$7 = $$0 + this.z.a($$3) - this.z.a($$3);
      int $$8 = $$1 + this.z.a($$3) - this.z.a($$3);
      int $$9 = $$2 + this.z.a($$3) - this.z.a($$3);
      $$6.d($$7, $$8, $$9);
      djp $$10 = this.a_($$6);
      $$10.b().a($$10, this, $$6, $$4);
      eez $$11 = this.b_($$6);
      if (!$$11.c()) {
         $$11.a(this, $$6, $$4);
         jv $$12 = $$11.h();
         if ($$12 != null && this.z.a(10) == 0) {
            boolean $$13 = $$10.d(this, $$6, ic.a);
            hx $$14 = $$6.d();
            this.a($$14, this.a_($$14), $$12, $$13);
         }
      }

      if ($$5 == $$10.b()) {
         this.a(new jp(jx.d, $$10), (double)$$7 + 0.5, (double)$$8 + 0.5, (double)$$9 + 0.5, 0.0, 0.0, 0.0);
      }

      if (!$$10.r(this, $$6)) {
         this.t($$6).a().k().ifPresent($$1x -> {
            if ($$1x.a(this.z)) {
               this.a($$1x.a(), (double)$$6.u() + this.z.j(), (double)$$6.v() + this.z.j(), (double)$$6.w() + this.z.j(), 0.0, 0.0, 0.0);
            }
         });
      }
   }

   private void a(hx $$0, djp $$1, jv $$2, boolean $$3) {
      if ($$1.u().c()) {
         emv $$4 = $$1.k(this, $$0);
         double $$5 = $$4.c(ic.a.b);
         if ($$5 < 1.0) {
            if ($$3) {
               this.a((double)$$0.u(), (double)($$0.u() + 1), (double)$$0.w(), (double)($$0.w() + 1), (double)($$0.v() + 1) - 0.05, $$2);
            }
         } else if (!$$1.a(asi.an)) {
            double $$6 = $$4.b(ic.a.b);
            if ($$6 > 0.0) {
               this.a($$0, $$2, $$4, (double)$$0.v() + $$6 - 0.05);
            } else {
               hx $$7 = $$0.d();
               djp $$8 = this.a_($$7);
               emv $$9 = $$8.k(this, $$7);
               double $$10 = $$9.c(ic.a.b);
               if ($$10 < 1.0 && $$8.u().c()) {
                  this.a($$0, $$2, $$4, (double)$$0.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(hx $$0, jv $$1, emv $$2, double $$3) {
      this.a((double)$$0.u() + $$2.b(ic.a.a), (double)$$0.u() + $$2.c(ic.a.a), (double)$$0.w() + $$2.b(ic.a.c), (double)$$0.w() + $$2.c(ic.a.c), $$3, $$1);
   }

   private void a(double $$0, double $$1, double $$2, double $$3, double $$4, jv $$5) {
      this.a($$5, aup.d(this.z.j(), $$0, $$1), $$4, aup.d(this.z.j(), $$2, $$3), 0.0, 0.0, 0.0);
   }

   @Override
   public p a(o $$0) {
      p $$1 = super.a($$0);
      $$1.a("Server brand", () -> this.I.s.cr.h());
      $$1.a("Server type", () -> this.I.T() == null ? "Non-integrated multiplayer server" : "Integrated singleplayer server");
      $$1.a("Tracked entity count", () -> String.valueOf(this.h()));
      return $$1;
   }

   @Override
   public void a(@Nullable cfq $$0, double $$1, double $$2, double $$3, ih<ars> $$4, aru $$5, float $$6, float $$7, long $$8) {
      if ($$0 == this.I.s) {
         this.a($$1, $$2, $$3, $$4.a(), $$5, $$6, $$7, false, $$8);
      }
   }

   @Override
   public void a(@Nullable cfq $$0, blw $$1, ih<ars> $$2, aru $$3, float $$4, float $$5, long $$6) {
      if ($$0 == this.I.s) {
         this.I.ai().a((gio)(new gif($$2.a(), $$3, $$4, $$5, $$1, $$6)));
      }
   }

   @Override
   public void a(blw $$0, ars $$1, aru $$2, float $$3, float $$4) {
      this.I.ai().a((gio)(new gif($$1, $$2, $$3, $$4, $$0, this.z.g())));
   }

   @Override
   public void a(double $$0, double $$1, double $$2, ars $$3, aru $$4, float $$5, float $$6, boolean $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.z.g());
   }

   private void a(double $$0, double $$1, double $$2, ars $$3, aru $$4, float $$5, float $$6, boolean $$7, long $$8) {
      double $$9 = this.I.j.m().b().c($$0, $$1, $$2);
      gij $$10 = new gij($$3, $$4, $$5, $$6, auw.a($$8), $$0, $$1, $$2);
      if ($$7 && $$9 > 100.0) {
         double $$11 = Math.sqrt($$9) / 40.0;
         this.I.ai().a($$10, (int)($$11 * 20.0));
      } else {
         this.I.ai().a($$10);
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, @Nullable so $$6) {
      this.I.g.a(new fqs.e(this, $$0, $$1, $$2, $$3, $$4, $$5, this.I.g, $$6));
   }

   @Override
   public void a(xg<?> $$0) {
      this.D.b($$0);
   }

   @Override
   public cqn r() {
      return this.D.l();
   }

   @Override
   public bkn s() {
      return this.H;
   }

   @Override
   public enp<cwy> N() {
      return enm.b();
   }

   @Override
   public enp<eey> M() {
      return enm.b();
   }

   public foa i() {
      return this.O;
   }

   @Nullable
   @Override
   public egj a(String $$0) {
      return this.K.get($$0);
   }

   public void b(String $$0, egj $$1) {
      this.K.put($$0, $$1);
   }

   @Override
   public void a(String $$0, egj $$1) {
   }

   @Override
   public int v() {
      return 0;
   }

   @Override
   public eng K() {
      return this.D.z();
   }

   @Override
   public void a(hx $$0, djp $$1, djp $$2, int $$3) {
      this.E.a(this, $$0, $$1, $$2, $$3);
   }

   @Override
   public void b(hx $$0, djp $$1, djp $$2) {
      this.E.a($$0, $$1, $$2);
   }

   public void c(int $$0, int $$1, int $$2) {
      this.E.a($$0, $$1, $$2);
   }

   @Override
   public void a(int $$0, hx $$1, int $$2) {
      this.E.c($$0, $$1, $$2);
   }

   @Override
   public void b(int $$0, hx $$1, int $$2) {
      this.E.a($$0, $$1, $$2);
   }

   @Override
   public void a(@Nullable cfq $$0, int $$1, hx $$2, int $$3) {
      try {
         this.E.b($$1, $$2, $$3);
      } catch (Throwable var8) {
         o $$5 = o.a(var8, "Playing level event");
         p $$6 = $$5.a("Level event being played");
         $$6.a("Block coordinates", p.a(this, $$2));
         $$6.a("Event source", $$0);
         $$6.a("Event type", $$1);
         $$6.a("Event data", $$3);
         throw new y($$5);
      }
   }

   @Override
   public void a(jv $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.E.a($$0, $$0.b().c(), $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public void a(jv $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.E.a($$0, $$0.b().c() || $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void b(jv $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.E.a($$0, false, true, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public void b(jv $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.E.a($$0, $$0.b().c() || $$1, true, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public List<fss> x() {
      return this.J;
   }

   @Override
   public ih<cuw> a(int $$0, int $$1, int $$2) {
      return this.I_().d(ke.at).f(cvd.b);
   }

   public float g(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = 1.0F - (aup.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.2F);
      $$2 = aup.a($$2, 0.0F, 1.0F);
      $$2 = 1.0F - $$2;
      $$2 *= 1.0F - this.d($$0) * 5.0F / 16.0F;
      $$2 *= 1.0F - this.b($$0) * 5.0F / 16.0F;
      return $$2 * 0.8F + 0.2F;
   }

   public emc a(emc $$0, float $$1) {
      float $$2 = this.f($$1);
      emc $$3 = $$0.a(2.0, 2.0, 2.0).a(0.25);
      cuy $$4 = this.G_();
      emc $$5 = atq.a($$3, ($$1x, $$2x, $$3x) -> emc.a($$4.a($$1x, $$2x, $$3x).a().a()));
      float $$6 = aup.b($$2 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      $$6 = aup.a($$6, 0.0F, 1.0F);
      float $$7 = (float)$$5.c * $$6;
      float $$8 = (float)$$5.d * $$6;
      float $$9 = (float)$$5.e * $$6;
      float $$10 = this.d($$1);
      if ($$10 > 0.0F) {
         float $$11 = ($$7 * 0.3F + $$8 * 0.59F + $$9 * 0.11F) * 0.6F;
         float $$12 = 1.0F - $$10 * 0.75F;
         $$7 = $$7 * $$12 + $$11 * (1.0F - $$12);
         $$8 = $$8 * $$12 + $$11 * (1.0F - $$12);
         $$9 = $$9 * $$12 + $$11 * (1.0F - $$12);
      }

      float $$13 = this.b($$1);
      if ($$13 > 0.0F) {
         float $$14 = ($$7 * 0.3F + $$8 * 0.59F + $$9 * 0.11F) * 0.2F;
         float $$15 = 1.0F - $$13 * 0.75F;
         $$7 = $$7 * $$15 + $$14 * (1.0F - $$15);
         $$8 = $$8 * $$15 + $$14 * (1.0F - $$15);
         $$9 = $$9 * $$15 + $$14 * (1.0F - $$15);
      }

      int $$16 = this.j();
      if ($$16 > 0) {
         float $$17 = (float)$$16 - $$1;
         if ($$17 > 1.0F) {
            $$17 = 1.0F;
         }

         $$17 *= 0.45F;
         $$7 = $$7 * (1.0F - $$17) + 0.8F * $$17;
         $$8 = $$8 * (1.0F - $$17) + 0.8F * $$17;
         $$9 = $$9 * (1.0F - $$17) + 1.0F * $$17;
      }

      return new emc((double)$$7, (double)$$8, (double)$$9);
   }

   public emc h(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = aup.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      $$2 = aup.a($$2, 0.0F, 1.0F);
      float $$3 = 1.0F;
      float $$4 = 1.0F;
      float $$5 = 1.0F;
      float $$6 = this.d($$0);
      if ($$6 > 0.0F) {
         float $$7 = ($$3 * 0.3F + $$4 * 0.59F + $$5 * 0.11F) * 0.6F;
         float $$8 = 1.0F - $$6 * 0.95F;
         $$3 = $$3 * $$8 + $$7 * (1.0F - $$8);
         $$4 = $$4 * $$8 + $$7 * (1.0F - $$8);
         $$5 = $$5 * $$8 + $$7 * (1.0F - $$8);
      }

      $$3 *= $$2 * 0.9F + 0.1F;
      $$4 *= $$2 * 0.9F + 0.1F;
      $$5 *= $$2 * 0.85F + 0.15F;
      float $$9 = this.b($$0);
      if ($$9 > 0.0F) {
         float $$10 = ($$3 * 0.3F + $$4 * 0.59F + $$5 * 0.11F) * 0.2F;
         float $$11 = 1.0F - $$9 * 0.95F;
         $$3 = $$3 * $$11 + $$10 * (1.0F - $$11);
         $$4 = $$4 * $$11 + $$10 * (1.0F - $$11);
         $$5 = $$5 * $$11 + $$10 * (1.0F - $$11);
      }

      return new emc((double)$$3, (double)$$4, (double)$$5);
   }

   public float i(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = 1.0F - (aup.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.25F);
      $$2 = aup.a($$2, 0.0F, 1.0F);
      return $$2 * $$2 * 0.5F;
   }

   public int j() {
      return this.I.m.b().c() ? 0 : this.M;
   }

   @Override
   public void c(int $$0) {
      this.M = $$0;
   }

   @Override
   public float a(ic $$0, boolean $$1) {
      boolean $$2 = this.d().e();
      if (!$$1) {
         return $$2 ? 0.9F : 1.0F;
      } else {
         switch ($$0) {
            case a:
               return $$2 ? 0.9F : 0.5F;
            case b:
               return $$2 ? 0.9F : 1.0F;
            case c:
            case d:
               return 0.8F;
            case e:
            case f:
               return 0.6F;
            default:
               return 1.0F;
         }
      }
   }

   @Override
   public int a(hx $$0, cti $$1) {
      eww $$2 = (eww)this.N.get($$1);
      return $$2.a($$0);
   }

   public int b(hx $$0, cti $$1) {
      int $$2 = evr.O().m.C().c();
      if ($$2 == 0) {
         return $$1.getColor(this.t($$0).a(), (double)$$0.u(), (double)$$0.w());
      } else {
         int $$3 = ($$2 * 2 + 1) * ($$2 * 2 + 1);
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         hz $$7 = new hz($$0.u() - $$2, $$0.v(), $$0.w() - $$2, $$0.u() + $$2, $$0.v(), $$0.w() + $$2);
         hx.a $$8 = new hx.a();

         while ($$7.a()) {
            $$8.d($$7.b(), $$7.c(), $$7.d());
            int $$9 = $$1.getColor(this.t($$8).a(), (double)$$8.u(), (double)$$8.w());
            $$4 += ($$9 & 0xFF0000) >> 16;
            $$5 += ($$9 & 0xFF00) >> 8;
            $$6 += $$9 & 0xFF;
         }

         return ($$4 / $$3 & 0xFF) << 16 | ($$5 / $$3 & 0xFF) << 8 | $$6 / $$3 & 0xFF;
      }
   }

   public void a(hx $$0, float $$1) {
      this.A.a($$0, $$1);
   }

   @Override
   public String toString() {
      return "ClientLevel";
   }

   public foe.a k() {
      return this.F;
   }

   @Override
   public void a(ih<dnz> $$0, emc $$1, dnz.a $$2) {
   }

   protected Map<String, egj> l() {
      return ImmutableMap.copyOf(this.K);
   }

   protected void a(Map<String, egj> $$0) {
      this.K.putAll($$0);
   }

   @Override
   protected dnp<blw> G() {
      return this.f.a();
   }

   @Override
   public String H() {
      return "Chunks[C] W: " + this.O.e() + " E: " + this.f.c();
   }

   @Override
   public void a(hx $$0, djp $$1) {
      this.I.g.a($$0, $$1);
   }

   public void h(int $$0) {
      this.Q = $$0;
   }

   public int m() {
      return this.Q;
   }

   @Override
   public cia I() {
      return this.D.y();
   }

   public static class a implements ehc {
      private final boolean a;
      private final ctt b;
      private final boolean c;
      private int d;
      private int e;
      private int f;
      private float g;
      private long h;
      private long i;
      private boolean j;
      private bjz k;
      private boolean l;

      public a(bjz $$0, boolean $$1, boolean $$2) {
         this.k = $$0;
         this.a = $$1;
         this.c = $$2;
         this.b = new ctt();
      }

      @Override
      public int a() {
         return this.d;
      }

      @Override
      public int b() {
         return this.e;
      }

      @Override
      public int c() {
         return this.f;
      }

      @Override
      public float d() {
         return this.g;
      }

      @Override
      public long e() {
         return this.h;
      }

      @Override
      public long f() {
         return this.i;
      }

      @Override
      public void b(int $$0) {
         this.d = $$0;
      }

      @Override
      public void c(int $$0) {
         this.e = $$0;
      }

      @Override
      public void d(int $$0) {
         this.f = $$0;
      }

      @Override
      public void a(float $$0) {
         this.g = $$0;
      }

      public void a(long $$0) {
         this.h = $$0;
      }

      public void b(long $$0) {
         this.i = $$0;
      }

      @Override
      public void a(hx $$0, float $$1) {
         this.d = $$0.u();
         this.e = $$0.v();
         this.f = $$0.w();
         this.g = $$1;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public boolean k() {
         return this.j;
      }

      @Override
      public void b(boolean $$0) {
         this.j = $$0;
      }

      @Override
      public boolean n() {
         return this.a;
      }

      @Override
      public ctt q() {
         return this.b;
      }

      @Override
      public bjz s() {
         return this.k;
      }

      @Override
      public boolean t() {
         return this.l;
      }

      @Override
      public void a(p $$0, ctz $$1) {
         ehc.super.a($$0, $$1);
      }

      public void a(bjz $$0) {
         this.k = $$0;
      }

      public void a(boolean $$0) {
         this.l = $$0;
      }

      public double a(ctz $$0) {
         return this.c ? (double)$$0.J_() : 63.0;
      }

      public float g() {
         return this.c ? 1.0F : 0.03125F;
      }
   }

   final class b implements dno<blw> {
      public void a(blw $$0) {
      }

      public void b(blw $$0) {
      }

      public void c(blw $$0) {
         foe.this.e.a($$0);
      }

      public void d(blw $$0) {
         foe.this.e.b($$0);
      }

      public void e(blw $$0) {
         if ($$0 instanceof fss) {
            foe.this.J.add((fss)$$0);
         }
      }

      public void f(blw $$0) {
         $$0.ag();
         foe.this.J.remove($$0);
      }

      public void g(blw $$0) {
      }
   }
}
