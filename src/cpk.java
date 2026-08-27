import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public abstract class cpk implements cpl, AutoCloseable {
   public static final Codec<aeo<cpk>> g = aeo.a(jd.aH);
   public static final aeo<cpk> h = aeo.a(jd.aH, new aep("overworld"));
   public static final aeo<cpk> i = aeo.a(jd.aH, new aep("the_nether"));
   public static final aeo<cpk> j = aeo.a(jd.aH, new aep("the_end"));
   public static final int k = 30000000;
   public static final int l = 512;
   public static final int m = 32;
   public static final int n = 15;
   public static final int o = 24000;
   public static final int p = 20000000;
   public static final int q = -20000000;
   protected final List<dea> r = Lists.newArrayList();
   protected final ebd s;
   private final List<dea> a = Lists.newArrayList();
   private boolean b;
   private final Thread c;
   private final boolean d;
   private int e;
   protected int t = art.a().f();
   protected final int u = 1013904223;
   protected float v;
   protected float w;
   protected float x;
   protected float y;
   public final art z = art.a();
   @Deprecated
   private final art f = art.b();
   private final aeo<dih> D;
   private final hf<dih> E;
   protected final ecc A;
   private final Supplier<bde> F;
   public final boolean B;
   private final dgp G;
   private final cqk H;
   private final aeo<cpk> I;
   private final ht J;
   private final bhf K;
   private long L;

   protected cpk(ecc $$0, aeo<cpk> $$1, ht $$2, hf<dih> $$3, Supplier<bde> $$4, boolean $$5, boolean $$6, long $$7, int $$8) {
      this.F = $$4;
      this.A = $$0;
      this.E = $$3;
      this.D = $$3.e().orElseThrow(() -> new IllegalArgumentException("Dimension must be registered, got " + $$3));
      final dih $$9 = $$3.a();
      this.I = $$1;
      this.B = $$5;
      if ($$9.k() != 1.0) {
         this.G = new dgp() {
            @Override
            public double a() {
               return super.a() / $$9.k();
            }

            @Override
            public double b() {
               return super.b() / $$9.k();
            }
         };
      } else {
         this.G = new dgp();
      }

      this.c = Thread.currentThread();
      this.H = new cqk(this, $$7);
      this.d = $$6;
      this.s = new ebb(this, $$8);
      this.J = $$2;
      this.K = new bhf($$2);
   }

   @Override
   public boolean r_() {
      return this.B;
   }

   @Nullable
   @Override
   public MinecraftServer n() {
      return null;
   }

   public boolean j(gv $$0) {
      return !this.r($$0) && D($$0);
   }

   public static boolean k(gv $$0) {
      return !b($$0.v()) && D($$0);
   }

   private static boolean D(gv $$0) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000;
   }

   private static boolean b(int $$0) {
      return $$0 < -20000000 || $$0 >= 20000000;
   }

   public dhf l(gv $$0) {
      return this.d(hy.a($$0.u()), hy.a($$0.w()));
   }

   public dhf d(int $$0, int $$1) {
      return (dhf)this.a($$0, $$1, dgz.n);
   }

   @Nullable
   @Override
   public dgu a(int $$0, int $$1, dgz $$2, boolean $$3) {
      dgu $$4 = this.J().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(gv $$0, dey $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(gv $$0, dey $$1, int $$2, int $$3) {
      if (this.r($$0)) {
         return false;
      } else if (!this.B && this.af()) {
         return false;
      } else {
         dhf $$4 = this.l($$0);
         csk $$5 = $$1.b();
         dey $$6 = $$4.a($$0, $$1, ($$2 & 64) != 0);
         if ($$6 == null) {
            return false;
         } else {
            dey $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.B || ($$2 & 4) == 0) && (this.B || $$4.D() != null && $$4.D().a(akb.c))) {
                  this.a($$0, $$6, $$1, $$2);
               }

               if (($$2 & 1) != 0) {
                  this.b($$0, $$6.b());
                  if (!this.B && $$1.n()) {
                     this.c($$0, $$5);
                  }
               }

               if (($$2 & 16) == 0 && $$3 > 0) {
                  int $$8 = $$2 & -34;
                  $$6.b(this, $$0, $$8, $$3 - 1);
                  $$1.a((cpl)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(gv $$0, dey $$1, dey $$2) {
   }

   @Override
   public boolean a(gv $$0, boolean $$1) {
      eab $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(gv $$0, boolean $$1, @Nullable big $$2, int $$3) {
      dey $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         eab $$5 = this.b_($$0);
         if (!($$4.b() instanceof cry)) {
            this.c(2001, $$0, csk.i($$4));
         }

         if ($$1) {
            dck $$6 = $$4.t() ? this.c_($$0) : null;
            csk.a($$4, this, $$0, $$6, $$2, ciw.b);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(dji.f, $$0, dji.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(gv $$0, dey $$1) {
   }

   public boolean b(gv $$0, dey $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(gv var1, dey var2, dey var3, int var4);

   public void b(gv $$0, dey $$1, dey $$2) {
   }

   public void a(gv $$0, csk $$1) {
   }

   public void a(gv $$0, csk $$1, hb $$2) {
   }

   public void a(gv $$0, csk $$1, gv $$2) {
   }

   public void a(dey $$0, gv $$1, csk $$2, gv $$3, boolean $$4) {
   }

   @Override
   public void a(hb $$0, dey $$1, gv $$2, gv $$3, int $$4, int $$5) {
      this.s.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int a(dkh.a $$0, int $$1, int $$2) {
      int $$4;
      if ($$1 >= -30000000 && $$2 >= -30000000 && $$1 < 30000000 && $$2 < 30000000) {
         if (this.b(hy.a($$1), hy.a($$2))) {
            $$4 = this.d(hy.a($$1), hy.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
         } else {
            $$4 = this.C_();
         }
      } else {
         $$4 = this.t_() + 1;
      }

      return $$4;
   }

   @Override
   public dzq s_() {
      return this.J().p();
   }

   @Override
   public dey a_(gv $$0) {
      if (this.r($$0)) {
         return csl.nb.n();
      } else {
         dhf $$1 = this.d(hy.a($$0.u()), hy.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public eab b_(gv $$0) {
      if (this.r($$0)) {
         return eac.a.g();
      } else {
         dhf $$1 = this.l($$0);
         return $$1.b_($$0);
      }
   }

   public boolean N() {
      return !this.x_().a() && this.e < 4;
   }

   public boolean O() {
      return !this.x_().a() && !this.N();
   }

   public void a(@Nullable big $$0, gv $$1, aot $$2, aov $$3, float $$4, float $$5) {
      this.a($$0 instanceof cbl $$6 ? $$6 : null, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(@Nullable cbl $$0, gv $$1, aot $$2, aov $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable cbl var1, double var2, double var4, double var6, hf<aot> var8, aov var9, float var10, float var11, long var12);

   public void a(@Nullable cbl $$0, double $$1, double $$2, double $$3, aot $$4, aov $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, jc.c.d($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable cbl var1, big var2, hf<aot> var3, aov var4, float var5, float var6, long var7);

   public void a(@Nullable cbl $$0, double $$1, double $$2, double $$3, aot $$4, aov $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable cbl $$0, big $$1, aot $$2, aov $$3, float $$4, float $$5) {
      this.a($$0, $$1, jc.c.d($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(gv $$0, aot $$1, aov $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(double $$0, double $$1, double $$2, aot $$3, aov $$4, float $$5, float $$6, boolean $$7) {
   }

   @Override
   public void a(iu $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(iu $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public void b(iu $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void b(iu $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public float a(float $$0) {
      float $$1 = this.f($$0);
      return $$1 * (float) (Math.PI * 2);
   }

   public void a(dea $$0) {
      (this.b ? this.a : this.r).add($$0);
   }

   protected void P() {
      bde $$0 = this.ad();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.r.addAll(this.a);
         this.a.clear();
      }

      Iterator<dea> $$1 = this.r.iterator();

      while ($$1.hasNext()) {
         dea $$2 = $$1.next();
         if ($$2.b()) {
            $$1.remove();
         } else if (this.m($$2.c())) {
            $$2.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends big> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Ticking entity");
         p $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new y($$3);
      }
   }

   public boolean h(big $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean m(gv $$0) {
      return this.a(cor.a($$0));
   }

   public cpc a(@Nullable big $$0, double $$1, double $$2, double $$3, float $$4, cpk.a $$5) {
      return this.a($$0, null, null, $$1, $$2, $$3, $$4, false, $$5);
   }

   public cpc a(@Nullable big $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, cpk.a $$6) {
      return this.a($$0, null, null, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public cpc a(@Nullable big $$0, @Nullable bhe $$1, @Nullable cpd $$2, ehf $$3, float $$4, boolean $$5, cpk.a $$6) {
      return this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6);
   }

   public cpc a(@Nullable big $$0, @Nullable bhe $$1, @Nullable cpd $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, cpk.a $$8) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, true);
   }

   public cpc a(@Nullable big $$0, @Nullable bhe $$1, @Nullable cpd $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, cpk.a $$8, boolean $$9) {
      cpc.a $$10 = switch ($$8) {
         case a -> cpc.a.a;
         case b -> this.a(cpg.M);
         case c -> this.X().b(cpg.c) ? this.a(cpg.N) : cpc.a.a;
         case d -> this.a(cpg.O);
      };
      cpc $$11 = new cpc(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$10);
      $$11.a();
      $$11.a($$9);
      return $$11;
   }

   private cpc.a a(cpg.e<cpg.a> $$0) {
      return this.X().b($$0) ? cpc.a.c : cpc.a.b;
   }

   public abstract String F();

   @Nullable
   @Override
   public dck c_(gv $$0) {
      if (this.r($$0)) {
         return null;
      } else {
         return !this.B && Thread.currentThread() != this.c ? null : this.l($$0).a($$0, dhf.b.a);
      }
   }

   public void a(dck $$0) {
      gv $$1 = $$0.p();
      if (!this.r($$1)) {
         this.l($$1).b($$0);
      }
   }

   public void n(gv $$0) {
      if (!this.r($$0)) {
         this.l($$0).d($$0);
      }
   }

   public boolean o(gv $$0) {
      return this.r($$0) ? false : this.J().b(hy.a($$0.u()), hy.a($$0.w()));
   }

   public boolean a(gv $$0, big $$1, hb $$2) {
      if (this.r($$0)) {
         return false;
      } else {
         dgu $$3 = this.a(hy.a($$0.u()), hy.a($$0.w()), dgz.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(gv $$0, big $$1) {
      return this.a($$0, $$1, hb.b);
   }

   public void Q() {
      double $$0 = 1.0 - (double)(this.d(1.0F) * 5.0F) / 16.0;
      double $$1 = 1.0 - (double)(this.b(1.0F) * 5.0F) / 16.0;
      double $$2 = 0.5 + 2.0 * aro.a((double)aro.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void b(boolean $$0, boolean $$1) {
      this.J().a($$0, $$1);
   }

   public gv R() {
      gv $$0 = new gv(this.A.a(), this.A.b(), this.A.c());
      if (!this.w_().a($$0)) {
         $$0 = this.a(dkh.a.e, gv.a(this.w_().a(), 0.0, this.w_().b()));
      }

      return $$0;
   }

   public float S() {
      return this.A.d();
   }

   protected void T() {
      if (this.A.k()) {
         this.w = 1.0F;
         if (this.A.i()) {
            this.y = 1.0F;
         }
      }
   }

   @Override
   public void close() throws IOException {
      this.J().close();
   }

   @Nullable
   @Override
   public coq c(int $$0, int $$1) {
      return this.a($$0, $$1, dgz.n, false);
   }

   @Override
   public List<big> a(@Nullable big $$0, eha $$1, Predicate<? super big> $$2) {
      this.ad().d("getEntities");
      List<big> $$3 = Lists.newArrayList();
      this.E().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }

         if ($$3x instanceof bwy) {
            for (bww $$4 : ((bwy)$$3x).fV()) {
               if ($$3x != $$0 && $$2.test($$4)) {
                  $$3.add($$4);
               }
            }
         }
      });
      return $$3;
   }

   @Override
   public <T extends big> List<T> a(diw<big, T> $$0, eha $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends big> void a(diw<big, T> $$0, eha $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends big> void a(diw<big, T> $$0, eha $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      this.ad().d("getEntities");
      this.E().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return aqe.a.b;
            }
         }

         if ($$4x instanceof bwy $$5) {
            for (bww $$6 : $$5.fV()) {
               T $$7 = $$0.a($$6);
               if ($$7 != null && $$2.test($$7)) {
                  $$3.add($$7);
                  if ($$3.size() >= $$4) {
                     return aqe.a.b;
                  }
               }
            }
         }

         return aqe.a.a;
      });
   }

   @Nullable
   public abstract big a(int var1);

   public void p(gv $$0) {
      if (this.A($$0)) {
         this.l($$0).a(true);
      }
   }

   @Override
   public int t_() {
      return 63;
   }

   public void U() {
   }

   public long V() {
      return this.A.e();
   }

   public long W() {
      return this.A.f();
   }

   public boolean a(cbl $$0, gv $$1) {
      return true;
   }

   public void a(big $$0, byte $$1) {
   }

   public void a(big $$0, bhe $$1) {
   }

   public void a(gv $$0, csk $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public ebs u_() {
      return this.A;
   }

   public cpg X() {
      return this.A.q();
   }

   public float b(float $$0) {
      return aro.i($$0, this.x, this.y) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = aro.a($$0, 0.0F, 1.0F);
      this.x = $$1;
      this.y = $$1;
   }

   public float d(float $$0) {
      return aro.i($$0, this.v, this.w);
   }

   public void e(float $$0) {
      float $$1 = aro.a($$0, 0.0F, 1.0F);
      this.v = $$1;
      this.w = $$1;
   }

   public boolean Y() {
      return this.x_().g() && !this.x_().h() ? (double)this.b(1.0F) > 0.9 : false;
   }

   public boolean Z() {
      return (double)this.d(1.0F) > 0.2;
   }

   public boolean q(gv $$0) {
      if (!this.Z()) {
         return false;
      } else if (!this.g($$0)) {
         return false;
      } else if (this.a(dkh.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         cqi $$1 = this.s($$0).a();
         return $$1.a($$0) == cqi.c.b;
      }
   }

   @Nullable
   public abstract ebl a(String var1);

   public abstract void a(String var1, ebl var2);

   public abstract int t();

   public void b(int $$0, gv $$1, int $$2) {
   }

   public p a(o $$0) {
      p $$1 = $$0.a("Affected level", 1);
      $$1.a("All players", () -> this.v().size() + " total; " + this.v());
      $$1.a("Chunk stats", this.J()::e);
      $$1.a("Level dimension", () -> this.ac().a().toString());

      try {
         this.A.a($$1, this);
      } catch (Throwable var4) {
         $$1.a("Level Data Unobtainable", var4);
      }

      return $$1;
   }

   public abstract void a(int var1, gv var2, int var3);

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, @Nullable qs $$6) {
   }

   public abstract eie I();

   public void c(gv $$0, csk $$1) {
      for (hb $$2 : hb.c.a) {
         gv $$3 = $$0.a($$2);
         if (this.A($$3)) {
            dey $$4 = this.a_($$3);
            if ($$4.a(csl.gY)) {
               this.a($$4, $$3, $$1, $$0, false);
            } else if ($$4.g(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(csl.gY)) {
                  this.a($$4, $$3, $$1, $$0, false);
               }
            }
         }
      }
   }

   @Override
   public bgm d_(gv $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.A($$0)) {
         $$2 = this.an();
         $$1 = this.l($$0).u();
      }

      return new bgm(this.ai(), this.W(), $$1, $$2);
   }

   @Override
   public int v_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public dgp w_() {
      return this.G;
   }

   public void a(uw<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public dih x_() {
      return this.E.a();
   }

   public aeo<dih> aa() {
      return this.D;
   }

   public hf<dih> ab() {
      return this.E;
   }

   public aeo<cpk> ac() {
      return this.I;
   }

   @Override
   public art y_() {
      return this.z;
   }

   @Override
   public boolean a(gv $$0, Predicate<dey> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(gv $$0, Predicate<eab> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract cma q();

   public gv a(int $$0, int $$1, int $$2, int $$3) {
      this.t = this.t * 3 + 1013904223;
      int $$4 = this.t >> 2;
      return new gv($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean r() {
      return false;
   }

   public bde ad() {
      return this.F.get();
   }

   public Supplier<bde> ae() {
      return this.F;
   }

   @Override
   public cqk z_() {
      return this.H;
   }

   public final boolean af() {
      return this.d;
   }

   protected abstract diy<big> E();

   @Override
   public long A_() {
      return this.L++;
   }

   @Override
   public ht B_() {
      return this.J;
   }

   public bhf ag() {
      return this.K;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
