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

public abstract class cqb implements cqc, AutoCloseable {
   public static final Codec<aey<cqb>> g = aey.a(jc.aI);
   public static final aey<cqb> h = aey.a(jc.aI, new aez("overworld"));
   public static final aey<cqb> i = aey.a(jc.aI, new aez("the_nether"));
   public static final aey<cqb> j = aey.a(jc.aI, new aez("the_end"));
   public static final int k = 30000000;
   public static final int l = 512;
   public static final int m = 32;
   public static final int n = 15;
   public static final int o = 24000;
   public static final int p = 20000000;
   public static final int q = -20000000;
   protected final List<dep> r = Lists.newArrayList();
   protected final ebi s;
   private final List<dep> a = Lists.newArrayList();
   private boolean b;
   private final Thread c;
   private final boolean d;
   private int e;
   protected int t = ash.a().f();
   protected final int u = 1013904223;
   protected float v;
   protected float w;
   protected float x;
   protected float y;
   public final ash z = ash.a();
   @Deprecated
   private final ash f = ash.b();
   private final aey<dim> D;
   private final he<dim> E;
   protected final ech A;
   private final Supplier<bdv> F;
   public final boolean B;
   private final dgu G;
   private final crb H;
   private final aey<cqb> I;
   private final hr J;
   private final bhv K;
   private long L;

   protected cqb(ech $$0, aey<cqb> $$1, hr $$2, he<dim> $$3, Supplier<bdv> $$4, boolean $$5, boolean $$6, long $$7, int $$8) {
      this.F = $$4;
      this.A = $$0;
      this.E = $$3;
      this.D = $$3.e().orElseThrow(() -> new IllegalArgumentException("Dimension must be registered, got " + $$3));
      final dim $$9 = $$3.a();
      this.I = $$1;
      this.B = $$5;
      if ($$9.k() != 1.0) {
         this.G = new dgu() {
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
         this.G = new dgu();
      }

      this.c = Thread.currentThread();
      this.H = new crb(this, $$7);
      this.d = $$6;
      this.s = new ebg(this, $$8);
      this.J = $$2;
      this.K = new bhv($$2);
   }

   @Override
   public boolean w_() {
      return this.B;
   }

   @Nullable
   @Override
   public MinecraftServer n() {
      return null;
   }

   public boolean j(gw $$0) {
      return !this.r($$0) && D($$0);
   }

   public static boolean k(gw $$0) {
      return !b($$0.v()) && D($$0);
   }

   private static boolean D(gw $$0) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000;
   }

   private static boolean b(int $$0) {
      return $$0 < -20000000 || $$0 >= 20000000;
   }

   public dhk l(gw $$0) {
      return this.d(hw.a($$0.u()), hw.a($$0.w()));
   }

   public dhk d(int $$0, int $$1) {
      return (dhk)this.a($$0, $$1, dhe.n);
   }

   @Nullable
   @Override
   public dgz a(int $$0, int $$1, dhe $$2, boolean $$3) {
      dgz $$4 = this.J().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(gw $$0, dfd $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(gw $$0, dfd $$1, int $$2, int $$3) {
      if (this.r($$0)) {
         return false;
      } else if (!this.B && this.af()) {
         return false;
      } else {
         dhk $$4 = this.l($$0);
         ctc $$5 = $$1.b();
         dfd $$6 = $$4.a($$0, $$1, ($$2 & 64) != 0);
         if ($$6 == null) {
            return false;
         } else {
            dfd $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.B || ($$2 & 4) == 0) && (this.B || $$4.D() != null && $$4.D().a(akm.c))) {
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
                  $$1.a((cqc)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(gw $$0, dfd $$1, dfd $$2) {
   }

   @Override
   public boolean a(gw $$0, boolean $$1) {
      eag $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(gw $$0, boolean $$1, @Nullable biw $$2, int $$3) {
      dfd $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         eag $$5 = this.b_($$0);
         if (!($$4.b() instanceof csp)) {
            this.c(2001, $$0, ctc.i($$4));
         }

         if ($$1) {
            dcz $$6 = $$4.t() ? this.c_($$0) : null;
            ctc.a($$4, this, $$0, $$6, $$2, cjl.b);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(djn.f, $$0, djn.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(gw $$0, dfd $$1) {
   }

   public boolean b(gw $$0, dfd $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(gw var1, dfd var2, dfd var3, int var4);

   public void b(gw $$0, dfd $$1, dfd $$2) {
   }

   public void a(gw $$0, ctc $$1) {
   }

   public void a(gw $$0, ctc $$1, ha $$2) {
   }

   public void a(gw $$0, ctc $$1, gw $$2) {
   }

   public void a(dfd $$0, gw $$1, ctc $$2, gw $$3, boolean $$4) {
   }

   @Override
   public void a(ha $$0, dfd $$1, gw $$2, gw $$3, int $$4, int $$5) {
      this.s.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int a(dkm.a $$0, int $$1, int $$2) {
      int $$4;
      if ($$1 >= -30000000 && $$2 >= -30000000 && $$1 < 30000000 && $$2 < 30000000) {
         if (this.b(hw.a($$1), hw.a($$2))) {
            $$4 = this.d(hw.a($$1), hw.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
         } else {
            $$4 = this.H_();
         }
      } else {
         $$4 = this.y_() + 1;
      }

      return $$4;
   }

   @Override
   public dzv x_() {
      return this.J().p();
   }

   @Override
   public dfd a_(gw $$0) {
      if (this.r($$0)) {
         return cte.nb.o();
      } else {
         dhk $$1 = this.d(hw.a($$0.u()), hw.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public eag b_(gw $$0) {
      if (this.r($$0)) {
         return eah.a.g();
      } else {
         dhk $$1 = this.l($$0);
         return $$1.b_($$0);
      }
   }

   public boolean N() {
      return !this.C_().a() && this.e < 4;
   }

   public boolean O() {
      return !this.C_().a() && !this.N();
   }

   public void a(@Nullable biw $$0, gw $$1, apf $$2, aph $$3, float $$4, float $$5) {
      this.a($$0 instanceof cca $$6 ? $$6 : null, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(@Nullable cca $$0, gw $$1, apf $$2, aph $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable cca var1, double var2, double var4, double var6, he<apf> var8, aph var9, float var10, float var11, long var12);

   public void a(@Nullable cca $$0, double $$1, double $$2, double $$3, apf $$4, aph $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, jb.c.d($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable cca var1, biw var2, he<apf> var3, aph var4, float var5, float var6, long var7);

   public void a(@Nullable cca $$0, double $$1, double $$2, double $$3, apf $$4, aph $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable cca $$0, biw $$1, apf $$2, aph $$3, float $$4, float $$5) {
      this.a($$0, $$1, jb.c.d($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(gw $$0, apf $$1, aph $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(double $$0, double $$1, double $$2, apf $$3, aph $$4, float $$5, float $$6, boolean $$7) {
   }

   @Override
   public void a(it $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(it $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public void b(it $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void b(it $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public float a(float $$0) {
      float $$1 = this.f($$0);
      return $$1 * (float) (Math.PI * 2);
   }

   public void a(dep $$0) {
      (this.b ? this.a : this.r).add($$0);
   }

   protected void P() {
      bdv $$0 = this.ad();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.r.addAll(this.a);
         this.a.clear();
      }

      Iterator<dep> $$1 = this.r.iterator();

      while ($$1.hasNext()) {
         dep $$2 = $$1.next();
         if ($$2.b()) {
            $$1.remove();
         } else if (this.m($$2.c())) {
            $$2.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends biw> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Ticking entity");
         p $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new y($$3);
      }
   }

   public boolean h(biw $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean m(gw $$0) {
      return this.a(cpi.a($$0));
   }

   public cpt a(@Nullable biw $$0, double $$1, double $$2, double $$3, float $$4, cqb.a $$5) {
      return this.a($$0, null, null, $$1, $$2, $$3, $$4, false, $$5);
   }

   public cpt a(@Nullable biw $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, cqb.a $$6) {
      return this.a($$0, null, null, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public cpt a(@Nullable biw $$0, @Nullable bhu $$1, @Nullable cpu $$2, ehh $$3, float $$4, boolean $$5, cqb.a $$6) {
      return this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6);
   }

   public cpt a(@Nullable biw $$0, @Nullable bhu $$1, @Nullable cpu $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, cqb.a $$8) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, true);
   }

   public cpt a(@Nullable biw $$0, @Nullable bhu $$1, @Nullable cpu $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, cqb.a $$8, boolean $$9) {
      cpt.a $$10 = switch ($$8) {
         case a -> cpt.a.a;
         case b -> this.a(cpx.M);
         case c -> this.X().b(cpx.c) ? this.a(cpx.N) : cpt.a.a;
         case d -> this.a(cpx.O);
      };
      cpt $$11 = new cpt(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$10);
      $$11.a();
      $$11.a($$9);
      return $$11;
   }

   private cpt.a a(cpx.e<cpx.a> $$0) {
      return this.X().b($$0) ? cpt.a.c : cpt.a.b;
   }

   public abstract String F();

   @Nullable
   @Override
   public dcz c_(gw $$0) {
      if (this.r($$0)) {
         return null;
      } else {
         return !this.B && Thread.currentThread() != this.c ? null : this.l($$0).a($$0, dhk.b.a);
      }
   }

   public void a(dcz $$0) {
      gw $$1 = $$0.p();
      if (!this.r($$1)) {
         this.l($$1).b($$0);
      }
   }

   public void n(gw $$0) {
      if (!this.r($$0)) {
         this.l($$0).d($$0);
      }
   }

   public boolean o(gw $$0) {
      return this.r($$0) ? false : this.J().b(hw.a($$0.u()), hw.a($$0.w()));
   }

   public boolean a(gw $$0, biw $$1, ha $$2) {
      if (this.r($$0)) {
         return false;
      } else {
         dgz $$3 = this.a(hw.a($$0.u()), hw.a($$0.w()), dhe.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(gw $$0, biw $$1) {
      return this.a($$0, $$1, ha.b);
   }

   public void Q() {
      double $$0 = 1.0 - (double)(this.d(1.0F) * 5.0F) / 16.0;
      double $$1 = 1.0 - (double)(this.b(1.0F) * 5.0F) / 16.0;
      double $$2 = 0.5 + 2.0 * asb.a((double)asb.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void b(boolean $$0, boolean $$1) {
      this.J().a($$0, $$1);
   }

   public gw R() {
      gw $$0 = new gw(this.A.a(), this.A.b(), this.A.c());
      if (!this.B_().a($$0)) {
         $$0 = this.a(dkm.a.e, gw.a(this.B_().a(), 0.0, this.B_().b()));
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
   public cph c(int $$0, int $$1) {
      return this.a($$0, $$1, dhe.n, false);
   }

   @Override
   public List<biw> a(@Nullable biw $$0, ehc $$1, Predicate<? super biw> $$2) {
      this.ad().d("getEntities");
      List<biw> $$3 = Lists.newArrayList();
      this.E().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }

         if ($$3x instanceof bxn) {
            for (bxl $$4 : ((bxn)$$3x).ga()) {
               if ($$3x != $$0 && $$2.test($$4)) {
                  $$3.add($$4);
               }
            }
         }
      });
      return $$3;
   }

   @Override
   public <T extends biw> List<T> a(djb<biw, T> $$0, ehc $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends biw> void a(djb<biw, T> $$0, ehc $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends biw> void a(djb<biw, T> $$0, ehc $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      this.ad().d("getEntities");
      this.E().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return aqq.a.b;
            }
         }

         if ($$4x instanceof bxn $$5) {
            for (bxl $$6 : $$5.ga()) {
               T $$7 = $$0.a($$6);
               if ($$7 != null && $$2.test($$7)) {
                  $$3.add($$7);
                  if ($$3.size() >= $$4) {
                     return aqq.a.b;
                  }
               }
            }
         }

         return aqq.a.a;
      });
   }

   @Nullable
   public abstract biw a(int var1);

   public void p(gw $$0) {
      if (this.A($$0)) {
         this.l($$0).a(true);
      }
   }

   @Override
   public int y_() {
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

   public boolean a(cca $$0, gw $$1) {
      return true;
   }

   public void a(biw $$0, byte $$1) {
   }

   public void a(biw $$0, bhu $$1) {
   }

   public void a(gw $$0, ctc $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public ebx z_() {
      return this.A;
   }

   public cpx X() {
      return this.A.q();
   }

   public float b(float $$0) {
      return asb.i($$0, this.x, this.y) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = asb.a($$0, 0.0F, 1.0F);
      this.x = $$1;
      this.y = $$1;
   }

   public float d(float $$0) {
      return asb.i($$0, this.v, this.w);
   }

   public void e(float $$0) {
      float $$1 = asb.a($$0, 0.0F, 1.0F);
      this.v = $$1;
      this.w = $$1;
   }

   public boolean Y() {
      return this.C_().g() && !this.C_().h() ? (double)this.b(1.0F) > 0.9 : false;
   }

   public boolean Z() {
      return (double)this.d(1.0F) > 0.2;
   }

   public boolean q(gw $$0) {
      if (!this.Z()) {
         return false;
      } else if (!this.g($$0)) {
         return false;
      } else if (this.a(dkm.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         cqz $$1 = this.s($$0).a();
         return $$1.a($$0) == cqz.c.b;
      }
   }

   @Nullable
   public abstract ebq a(String var1);

   public abstract void a(String var1, ebq var2);

   public abstract int t();

   public void b(int $$0, gw $$1, int $$2) {
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

   public abstract void a(int var1, gw var2, int var3);

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, @Nullable qw $$6) {
   }

   public abstract eig I();

   public void c(gw $$0, ctc $$1) {
      for (ha $$2 : ha.c.a) {
         gw $$3 = $$0.a($$2);
         if (this.A($$3)) {
            dfd $$4 = this.a_($$3);
            if ($$4.a(cte.gY)) {
               this.a($$4, $$3, $$1, $$0, false);
            } else if ($$4.g(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(cte.gY)) {
                  this.a($$4, $$3, $$1, $$0, false);
               }
            }
         }
      }
   }

   @Override
   public bhc d_(gw $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.A($$0)) {
         $$2 = this.an();
         $$1 = this.l($$0).u();
      }

      return new bhc(this.ai(), this.W(), $$1, $$2);
   }

   @Override
   public int A_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public dgu B_() {
      return this.G;
   }

   public void a(ve<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public dim C_() {
      return this.E.a();
   }

   public aey<dim> aa() {
      return this.D;
   }

   public he<dim> ab() {
      return this.E;
   }

   public aey<cqb> ac() {
      return this.I;
   }

   @Override
   public ash D_() {
      return this.z;
   }

   @Override
   public boolean a(gw $$0, Predicate<dfd> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(gw $$0, Predicate<eag> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract cmr q();

   public gw a(int $$0, int $$1, int $$2, int $$3) {
      this.t = this.t * 3 + 1013904223;
      int $$4 = this.t >> 2;
      return new gw($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean r() {
      return false;
   }

   public bdv ad() {
      return this.F.get();
   }

   public Supplier<bdv> ae() {
      return this.F;
   }

   @Override
   public crb E_() {
      return this.H;
   }

   public final boolean af() {
      return this.d;
   }

   protected abstract djd<biw> E();

   @Override
   public long F_() {
      return this.L++;
   }

   @Override
   public hr G_() {
      return this.J;
   }

   public bhv ag() {
      return this.K;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
