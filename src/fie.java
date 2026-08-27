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

public class fie extends cpk {
   private static final Logger a = LogUtils.getLogger();
   private static final double b = 0.05;
   private static final int c = 10;
   private static final int d = 1000;
   final div e = new div();
   private final djb<big> f = new djb<>(big.class, new fie.b());
   private final fif D;
   private final fne E;
   private final fie.a F;
   private final fmv G;
   private final eqn H = eqn.N();
   final List<fmf> I = Lists.newArrayList();
   private eie J = new eie();
   private final Map<String, ebl> K = Maps.newHashMap();
   private static final long L = 16777215L;
   private int M;
   private final Object2ObjectArrayMap<cov, erp> N = ac.a(new Object2ObjectArrayMap(3), $$0x -> {
      $$0x.put(fms.a, new erp($$0xx -> this.b($$0xx, fms.a)));
      $$0x.put(fms.b, new erp($$0xx -> this.b($$0xx, fms.b)));
      $$0x.put(fms.c, new erp($$0xx -> this.b($$0xx, fms.c)));
   });
   private final fia O;
   private final Deque<Runnable> P = Queues.newArrayDeque();
   private int Q;
   private final fjf R = new fjf();
   private static final Set<cir> S = Set.of(ciz.hf, ciz.hg);

   public void b(int $$0) {
      this.R.a($$0, this);
   }

   public void b(gv $$0, dey $$1, int $$2) {
      if (!this.R.a($$0, $$1)) {
         super.a($$0, $$1, $$2, 512);
      }
   }

   public void a(gv $$0, dey $$1, ehf $$2) {
      dey $$3 = this.a_($$0);
      if ($$3 != $$1) {
         this.a($$0, $$1, 19);
         cbl $$4 = this.H.t;
         if (this == $$4.dK() && $$4.a($$0, $$1)) {
            $$4.h($$2.c, $$2.d, $$2.e);
         }
      }
   }

   fjf a() {
      return this.R;
   }

   @Override
   public boolean a(gv $$0, dey $$1, int $$2, int $$3) {
      if (this.R.c()) {
         dey $$4 = this.a_($$0);
         boolean $$5 = super.a($$0, $$1, $$2, $$3);
         if ($$5) {
            this.R.a($$0, $$4, this.H.t);
         }

         return $$5;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   public fie(fif $$0, fie.a $$1, aeo<cpk> $$2, hf<dih> $$3, int $$4, int $$5, Supplier<bde> $$6, fne $$7, boolean $$8, long $$9) {
      super($$1, $$2, $$0.f(), $$3, $$6, true, $$8, $$9, 1000000);
      this.D = $$0;
      this.O = new fia(this, $$4);
      this.F = $$1;
      this.E = $$7;
      this.G = fmv.a($$3.a());
      this.a(new gv(8, 64, 8), 0.0F);
      this.Q = $$5;
      this.Q();
      this.T();
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

   public fmv d() {
      return this.G;
   }

   public void a(BooleanSupplier $$0) {
      this.w_().s();
      this.o();
      if (this.M > 0) {
         this.c(this.M - 1);
      }

      this.ad().a("blocks");
      this.O.a($$0, true);
      this.ad().c();
   }

   private void o() {
      this.b(this.A.e() + 1L);
      if (this.A.q().b(cpg.k)) {
         this.c(this.A.f() + 1L);
      }
   }

   public void b(long $$0) {
      this.F.a($$0);
   }

   public void c(long $$0) {
      if ($$0 < 0L) {
         $$0 = -$$0;
         this.X().a(cpg.k).a(false, null);
      } else {
         this.X().a(cpg.k).a(true, null);
      }

      this.F.b($$0);
   }

   public Iterable<big> e() {
      return this.E().a();
   }

   public void f() {
      bde $$0 = this.ad();
      $$0.a("entities");
      this.e.a($$0x -> {
         if (!$$0x.dF() && !$$0x.bN()) {
            this.a(this::a, $$0x);
         }
      });
      $$0.c();
      this.P();
   }

   @Override
   public boolean h(big $$0) {
      return $$0.dm().a(this.H.t.dm()) <= this.Q;
   }

   public void a(big $$0) {
      $$0.bn();
      $$0.ah++;
      this.ad().a(() -> jc.h.b($$0.ag()).toString());
      $$0.l();
      this.ad().c();

      for (big $$1 : $$0.cP()) {
         this.a($$0, $$1);
      }
   }

   private void a(big $$0, big $$1) {
      if ($$1.dF() || $$1.cY() != $$0) {
         $$1.aa();
      } else if ($$1 instanceof cbl || this.e.c($$1)) {
         $$1.bn();
         $$1.ah++;
         $$1.by();

         for (big $$2 : $$1.cP()) {
            this.a($$1, $$2);
         }
      }
   }

   public void a(dhf $$0) {
      $$0.I();
      this.O.p().a($$0.f(), false);
      this.f.b($$0.f());
   }

   public void a(cor $$0) {
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

   public void a(int $$0, fmf $$1) {
      this.b($$0, $$1);
   }

   public void a(int $$0, big $$1) {
      this.b($$0, $$1);
   }

   private void b(int $$0, big $$1) {
      this.a($$0, big.c.b);
      this.f.a($$1);
   }

   public void a(int $$0, big.c $$1) {
      big $$2 = this.E().a($$0);
      if ($$2 != null) {
         $$2.b($$1);
         $$2.am();
      }
   }

   @Nullable
   @Override
   public big a(int $$0) {
      return this.E().a($$0);
   }

   @Override
   public void U() {
      this.D.l().a(te.c("multiplayer.status.quitting"));
   }

   public void b(int $$0, int $$1, int $$2) {
      int $$3 = 32;
      art $$4 = art.a();
      csk $$5 = this.p();
      gv.a $$6 = new gv.a();

      for (int $$7 = 0; $$7 < 667; $$7++) {
         this.a($$0, $$1, $$2, 16, $$4, $$5, $$6);
         this.a($$0, $$1, $$2, 32, $$4, $$5, $$6);
      }
   }

   @Nullable
   private csk p() {
      if (this.H.r.l() == cph.b) {
         ciw $$0 = this.H.t.eR();
         cir $$1 = $$0.d();
         if (S.contains($$1) && $$1 instanceof cgp $$2) {
            return $$2.e();
         }
      }

      return null;
   }

   public void a(int $$0, int $$1, int $$2, int $$3, art $$4, @Nullable csk $$5, gv.a $$6) {
      int $$7 = $$0 + this.z.a($$3) - this.z.a($$3);
      int $$8 = $$1 + this.z.a($$3) - this.z.a($$3);
      int $$9 = $$2 + this.z.a($$3) - this.z.a($$3);
      $$6.d($$7, $$8, $$9);
      dey $$10 = this.a_($$6);
      $$10.b().a($$10, this, $$6, $$4);
      eab $$11 = this.b_($$6);
      if (!$$11.c()) {
         $$11.a(this, $$6, $$4);
         iu $$12 = $$11.h();
         if ($$12 != null && this.z.a(10) == 0) {
            boolean $$13 = $$10.d(this, $$6, hb.a);
            gv $$14 = $$6.d();
            this.a($$14, this.a_($$14), $$12, $$13);
         }
      }

      if ($$5 == $$10.b()) {
         this.a(new io(iw.d, $$10), (double)$$7 + 0.5, (double)$$8 + 0.5, (double)$$9 + 0.5, 0.0, 0.0, 0.0);
      }

      if (!$$10.r(this, $$6)) {
         this.s($$6).a().k().ifPresent($$1x -> {
            if ($$1x.a(this.z)) {
               this.a($$1x.a(), (double)$$6.u() + this.z.j(), (double)$$6.v() + this.z.j(), (double)$$6.w() + this.z.j(), 0.0, 0.0, 0.0);
            }
         });
      }
   }

   private void a(gv $$0, dey $$1, iu $$2, boolean $$3) {
      if ($$1.u().c()) {
         ehy $$4 = $$1.k(this, $$0);
         double $$5 = $$4.c(hb.a.b);
         if ($$5 < 1.0) {
            if ($$3) {
               this.a((double)$$0.u(), (double)($$0.u() + 1), (double)$$0.w(), (double)($$0.w() + 1), (double)($$0.v() + 1) - 0.05, $$2);
            }
         } else if (!$$1.a(apj.an)) {
            double $$6 = $$4.b(hb.a.b);
            if ($$6 > 0.0) {
               this.a($$0, $$2, $$4, (double)$$0.v() + $$6 - 0.05);
            } else {
               gv $$7 = $$0.d();
               dey $$8 = this.a_($$7);
               ehy $$9 = $$8.k(this, $$7);
               double $$10 = $$9.c(hb.a.b);
               if ($$10 < 1.0 && $$8.u().c()) {
                  this.a($$0, $$2, $$4, (double)$$0.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(gv $$0, iu $$1, ehy $$2, double $$3) {
      this.a((double)$$0.u() + $$2.b(hb.a.a), (double)$$0.u() + $$2.c(hb.a.a), (double)$$0.w() + $$2.b(hb.a.c), (double)$$0.w() + $$2.c(hb.a.c), $$3, $$1);
   }

   private void a(double $$0, double $$1, double $$2, double $$3, double $$4, iu $$5) {
      this.a($$5, aro.d(this.z.j(), $$0, $$1), $$4, aro.d(this.z.j(), $$2, $$3), 0.0, 0.0, 0.0);
   }

   @Override
   public p a(o $$0) {
      p $$1 = super.a($$0);
      $$1.a("Server brand", () -> this.H.t.cl.h());
      $$1.a("Server type", () -> this.H.S() == null ? "Non-integrated multiplayer server" : "Integrated singleplayer server");
      return $$1;
   }

   @Override
   public void a(@Nullable cbl $$0, double $$1, double $$2, double $$3, hf<aot> $$4, aov $$5, float $$6, float $$7, long $$8) {
      if ($$0 == this.H.t) {
         this.a($$1, $$2, $$3, $$4.a(), $$5, $$6, $$7, false, $$8);
      }
   }

   @Override
   public void a(@Nullable cbl $$0, big $$1, hf<aot> $$2, aov $$3, float $$4, float $$5, long $$6) {
      if ($$0 == this.H.t) {
         this.H.ah().a((gbo)(new gbf($$2.a(), $$3, $$4, $$5, $$1, $$6)));
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, aot $$3, aov $$4, float $$5, float $$6, boolean $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.z.g());
   }

   private void a(double $$0, double $$1, double $$2, aot $$3, aov $$4, float $$5, float $$6, boolean $$7, long $$8) {
      double $$9 = this.H.j.m().b().c($$0, $$1, $$2);
      gbj $$10 = new gbj($$3, $$4, $$5, $$6, art.a($$8), $$0, $$1, $$2);
      if ($$7 && $$9 > 100.0) {
         double $$11 = Math.sqrt($$9) / 40.0;
         this.H.ah().a($$10, (int)($$11 * 20.0));
      } else {
         this.H.ah().a($$10);
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, @Nullable qs $$6) {
      this.H.g.a(new fkk.e(this, $$0, $$1, $$2, $$3, $$4, $$5, this.H.g, $$6));
   }

   @Override
   public void a(uw<?> $$0) {
      this.D.b($$0);
   }

   @Override
   public cma q() {
      return this.D.k();
   }

   public void a(eie $$0) {
      this.J = $$0;
   }

   @Override
   public ein<csk> L() {
      return eik.b();
   }

   @Override
   public ein<eaa> K() {
      return eik.b();
   }

   public fia i() {
      return this.O;
   }

   @Nullable
   @Override
   public ebl a(String $$0) {
      return this.K.get($$0);
   }

   public void b(String $$0, ebl $$1) {
      this.K.put($$0, $$1);
   }

   @Override
   public void a(String $$0, ebl $$1) {
   }

   @Override
   public int t() {
      return 0;
   }

   @Override
   public eie I() {
      return this.J;
   }

   @Override
   public void a(gv $$0, dey $$1, dey $$2, int $$3) {
      this.E.a(this, $$0, $$1, $$2, $$3);
   }

   @Override
   public void b(gv $$0, dey $$1, dey $$2) {
      this.E.a($$0, $$1, $$2);
   }

   public void c(int $$0, int $$1, int $$2) {
      this.E.a($$0, $$1, $$2);
   }

   @Override
   public void a(int $$0, gv $$1, int $$2) {
      this.E.c($$0, $$1, $$2);
   }

   @Override
   public void b(int $$0, gv $$1, int $$2) {
      this.E.a($$0, $$1, $$2);
   }

   @Override
   public void a(@Nullable cbl $$0, int $$1, gv $$2, int $$3) {
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
   public void a(iu $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.E.a($$0, $$0.b().c(), $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public void a(iu $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.E.a($$0, $$0.b().c() || $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void b(iu $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.E.a($$0, false, true, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public void b(iu $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.E.a($$0, $$0.b().c() || $$1, true, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public List<fmf> v() {
      return this.I;
   }

   @Override
   public hf<cqi> a(int $$0, int $$1, int $$2) {
      return this.B_().d(jd.ap).f(cqp.b);
   }

   public float g(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = 1.0F - (aro.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.2F);
      $$2 = aro.a($$2, 0.0F, 1.0F);
      $$2 = 1.0F - $$2;
      $$2 *= 1.0F - this.d($$0) * 5.0F / 16.0F;
      $$2 *= 1.0F - this.b($$0) * 5.0F / 16.0F;
      return $$2 * 0.8F + 0.2F;
   }

   public ehf a(ehf $$0, float $$1) {
      float $$2 = this.f($$1);
      ehf $$3 = $$0.a(2.0, 2.0, 2.0).a(0.25);
      cqk $$4 = this.z_();
      ehf $$5 = aqq.a($$3, ($$1x, $$2x, $$3x) -> ehf.a($$4.a($$1x, $$2x, $$3x).a().a()));
      float $$6 = aro.b($$2 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      $$6 = aro.a($$6, 0.0F, 1.0F);
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

      return new ehf((double)$$7, (double)$$8, (double)$$9);
   }

   public ehf h(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = aro.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      $$2 = aro.a($$2, 0.0F, 1.0F);
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

      return new ehf((double)$$3, (double)$$4, (double)$$5);
   }

   public float i(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = 1.0F - (aro.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.25F);
      $$2 = aro.a($$2, 0.0F, 1.0F);
      return $$2 * $$2 * 0.5F;
   }

   public int j() {
      return this.H.m.b().c() ? 0 : this.M;
   }

   @Override
   public void c(int $$0) {
      this.M = $$0;
   }

   @Override
   public float a(hb $$0, boolean $$1) {
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
   public int a(gv $$0, cov $$1) {
      erp $$2 = (erp)this.N.get($$1);
      return $$2.a($$0);
   }

   public int b(gv $$0, cov $$1) {
      int $$2 = eqn.N().m.A().c();
      if ($$2 == 0) {
         return $$1.getColor(this.s($$0).a(), (double)$$0.u(), (double)$$0.w());
      } else {
         int $$3 = ($$2 * 2 + 1) * ($$2 * 2 + 1);
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         gy $$7 = new gy($$0.u() - $$2, $$0.v(), $$0.w() - $$2, $$0.u() + $$2, $$0.v(), $$0.w() + $$2);
         gv.a $$8 = new gv.a();

         while ($$7.a()) {
            $$8.d($$7.b(), $$7.c(), $$7.d());
            int $$9 = $$1.getColor(this.s($$8).a(), (double)$$8.u(), (double)$$8.w());
            $$4 += ($$9 & 0xFF0000) >> 16;
            $$5 += ($$9 & 0xFF00) >> 8;
            $$6 += $$9 & 0xFF;
         }

         return ($$4 / $$3 & 0xFF) << 16 | ($$5 / $$3 & 0xFF) << 8 | $$6 / $$3 & 0xFF;
      }
   }

   public void a(gv $$0, float $$1) {
      this.A.a($$0, $$1);
   }

   @Override
   public String toString() {
      return "ClientLevel";
   }

   public fie.a k() {
      return this.F;
   }

   @Override
   public void a(dji $$0, ehf $$1, dji.a $$2) {
   }

   protected Map<String, ebl> l() {
      return ImmutableMap.copyOf(this.K);
   }

   protected void a(Map<String, ebl> $$0) {
      this.K.putAll($$0);
   }

   @Override
   protected diy<big> E() {
      return this.f.a();
   }

   @Override
   public String F() {
      return "Chunks[C] W: " + this.O.e() + " E: " + this.f.c();
   }

   @Override
   public void a(gv $$0, dey $$1) {
      this.H.g.a($$0, $$1);
   }

   public void h(int $$0) {
      this.Q = $$0;
   }

   public int m() {
      return this.Q;
   }

   @Override
   public cdt G() {
      return this.D.x();
   }

   public static class a implements ecc {
      private final boolean a;
      private final cpg b;
      private final boolean c;
      private int d;
      private int e;
      private int f;
      private float g;
      private long h;
      private long i;
      private boolean j;
      private bgl k;
      private boolean l;

      public a(bgl $$0, boolean $$1, boolean $$2) {
         this.k = $$0;
         this.a = $$1;
         this.c = $$2;
         this.b = new cpg();
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
      public void a(gv $$0, float $$1) {
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
      public cpg q() {
         return this.b;
      }

      @Override
      public bgl s() {
         return this.k;
      }

      @Override
      public boolean t() {
         return this.l;
      }

      @Override
      public void a(p $$0, cpm $$1) {
         ecc.super.a($$0, $$1);
      }

      public void a(bgl $$0) {
         this.k = $$0;
      }

      public void a(boolean $$0) {
         this.l = $$0;
      }

      public double a(cpm $$0) {
         return this.c ? (double)$$0.C_() : 63.0;
      }

      public float g() {
         return this.c ? 1.0F : 0.03125F;
      }
   }

   final class b implements dix<big> {
      public void a(big $$0) {
      }

      public void b(big $$0) {
      }

      public void c(big $$0) {
         fie.this.e.a($$0);
      }

      public void d(big $$0) {
         fie.this.e.b($$0);
      }

      public void e(big $$0) {
         if ($$0 instanceof fmf) {
            fie.this.I.add((fmf)$$0);
         }
      }

      public void f(big $$0) {
         $$0.ae();
         fie.this.I.remove($$0);
      }

      public void g(big $$0) {
      }
   }
}
