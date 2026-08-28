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

public abstract class dev implements dew, AutoCloseable {
   public static final Codec<alg<dev>> h = alg.a(ly.bb);
   public static final alg<dev> i = alg.a(ly.bb, alh.b("overworld"));
   public static final alg<dev> j = alg.a(ly.bb, alh.b("the_nether"));
   public static final alg<dev> k = alg.a(ly.bb, alh.b("the_end"));
   public static final int l = 30000000;
   public static final int m = 512;
   public static final int n = 32;
   public static final int o = 15;
   public static final int p = 24000;
   public static final int q = 20000000;
   public static final int r = -20000000;
   protected final List<dua> s = Lists.newArrayList();
   protected final esl t;
   private final List<dua> a = Lists.newArrayList();
   private boolean b;
   private final Thread c;
   private final boolean d;
   private int e;
   protected int u = azr.a().f();
   protected final int v = 1013904223;
   protected float w;
   protected float x;
   protected float y;
   protected float z;
   public final azr A = azr.a();
   @Deprecated
   private final azr f = azr.b();
   private final jp<dyz> E;
   protected final etr B;
   private final Supplier<bok> F;
   public final boolean C;
   private final dwu G;
   private final dfy H;
   private final alg<dev> I;
   private final kd J;
   private final bsq K;
   private long L;

   protected dev(etr $$0, alg<dev> $$1, kd $$2, jp<dyz> $$3, Supplier<bok> $$4, boolean $$5, boolean $$6, long $$7, int $$8) {
      this.F = $$4;
      this.B = $$0;
      this.E = $$3;
      final dyz $$9 = $$3.a();
      this.I = $$1;
      this.C = $$5;
      if ($$9.k() != 1.0) {
         this.G = new dwu() {
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
         this.G = new dwu();
      }

      this.c = Thread.currentThread();
      this.H = new dfy(this, $$7);
      this.d = $$6;
      this.t = new esg(this, $$8);
      this.J = $$2;
      this.K = new bsq($$2);
   }

   @Override
   public boolean y_() {
      return this.C;
   }

   @Nullable
   @Override
   public MinecraftServer o() {
      return null;
   }

   public boolean k(jg $$0) {
      return !this.s($$0) && g($$0);
   }

   public static boolean l(jg $$0) {
      return !b($$0.v()) && g($$0);
   }

   private static boolean g(jg $$0) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000;
   }

   private static boolean b(int $$0) {
      return $$0 < -20000000 || $$0 >= 20000000;
   }

   public dxj m(jg $$0) {
      return this.d(ki.a($$0.u()), ki.a($$0.w()));
   }

   public dxj d(int $$0, int $$1) {
      return (dxj)this.a($$0, $$1, dya.n);
   }

   @Nullable
   @Override
   public dwz a(int $$0, int $$1, dya $$2, boolean $$3) {
      dwz $$4 = this.P().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(jg $$0, dvd $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(jg $$0, dvd $$1, int $$2, int $$3) {
      if (this.s($$0)) {
         return false;
      } else if (!this.C && this.aj()) {
         return false;
      } else {
         dxj $$4 = this.m($$0);
         dhy $$5 = $$1.b();
         dvd $$6 = $$4.a($$0, $$1, ($$2 & 64) != 0);
         if ($$6 == null) {
            return false;
         } else {
            dvd $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.C || ($$2 & 4) == 0) && (this.C || $$4.C() != null && $$4.C().a(arc.c))) {
                  this.a($$0, $$6, $$1, $$2);
               }

               if (($$2 & 1) != 0) {
                  this.b($$0, $$6.b());
                  if (!this.C && $$1.q()) {
                     this.c($$0, $$5);
                  }
               }

               if (($$2 & 16) == 0 && $$3 > 0) {
                  int $$8 = $$2 & -34;
                  $$6.b(this, $$0, $$8, $$3 - 1);
                  $$1.a((dew)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(jg $$0, dvd $$1, dvd $$2) {
   }

   @Override
   public boolean a(jg $$0, boolean $$1) {
      ere $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(jg $$0, boolean $$1, @Nullable btz $$2, int $$3) {
      dvd $$4 = this.a_($$0);
      if ($$4.l()) {
         return false;
      } else {
         ere $$5 = this.b_($$0);
         if (!($$4.b() instanceof dhl)) {
            this.c(2001, $$0, dhy.j($$4));
         }

         if ($$1) {
            dsg $$6 = $$4.x() ? this.c_($$0) : null;
            dhy.a($$4, this, $$0, $$6, $$2, cvx.k);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(eaa.f, $$0, eaa.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(jg $$0, dvd $$1) {
   }

   public boolean b(jg $$0, dvd $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(jg var1, dvd var2, dvd var3, int var4);

   public void b(jg $$0, dvd $$1, dvd $$2) {
   }

   public void a(jg $$0, dhy $$1) {
   }

   public void a(jg $$0, dhy $$1, @Nullable esm $$2) {
   }

   public void a(jg $$0, dhy $$1, jl $$2, @Nullable esm $$3) {
   }

   public void b(jg $$0, dhy $$1, @Nullable esm $$2) {
   }

   public void a(dvd $$0, jg $$1, dhy $$2, @Nullable esm $$3, boolean $$4) {
   }

   @Override
   public void a(jl $$0, jg $$1, jg $$2, dvd $$3, int $$4, int $$5) {
      this.t.a($$0, $$3, $$1, $$2, $$4, $$5);
   }

   @Override
   public int a(eaz.a $$0, int $$1, int $$2) {
      int $$4;
      if ($$1 >= -30000000 && $$2 >= -30000000 && $$1 < 30000000 && $$2 < 30000000) {
         if (this.b(ki.a($$1), ki.a($$2))) {
            $$4 = this.d(ki.a($$1), ki.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
         } else {
            $$4 = this.I_();
         }
      } else {
         $$4 = this.N() + 1;
      }

      return $$4;
   }

   @Override
   public eqt z_() {
      return this.P().p();
   }

   @Override
   public dvd a_(jg $$0) {
      if (this.s($$0)) {
         return dia.nb.m();
      } else {
         dxj $$1 = this.d(ki.a($$0.u()), ki.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public ere b_(jg $$0) {
      if (this.s($$0)) {
         return erf.a.g();
      } else {
         dxj $$1 = this.m($$0);
         return $$1.b_($$0);
      }
   }

   public boolean S() {
      return !this.D_().a() && this.e < 4;
   }

   public boolean T() {
      return !this.D_().a() && !this.S();
   }

   public void a(@Nullable btz $$0, jg $$1, awj $$2, awl $$3, float $$4, float $$5) {
      this.a($$0 instanceof coh $$6 ? $$6 : null, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(@Nullable coh $$0, jg $$1, awj $$2, awl $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable coh var1, double var2, double var4, double var6, jp<awj> var8, awl var9, float var10, float var11, long var12);

   public void a(@Nullable coh $$0, double $$1, double $$2, double $$3, awj $$4, awl $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, lx.b.e($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable coh var1, btz var2, jp<awj> var3, awl var4, float var5, float var6, long var7);

   public void a(@Nullable coh $$0, double $$1, double $$2, double $$3, awj $$4, awl $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 1.0F, 1.0F);
   }

   public void a(@Nullable coh $$0, double $$1, double $$2, double $$3, awj $$4, awl $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable coh $$0, double $$1, double $$2, double $$3, jp<awj> $$4, awl $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable coh $$0, btz $$1, awj $$2, awl $$3, float $$4, float $$5) {
      this.a($$0, $$1, lx.b.e($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(jg $$0, awj $$1, awl $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(btz $$0, awj $$1, awl $$2, float $$3, float $$4) {
   }

   public void a(double $$0, double $$1, double $$2, awj $$3, awl $$4, float $$5, float $$6, boolean $$7) {
   }

   @Override
   public void a(lo $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(lo $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public void b(lo $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void b(lo $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public float a(float $$0) {
      float $$1 = this.f($$0);
      return $$1 * (float) (Math.PI * 2);
   }

   public void a(dua $$0) {
      (this.b ? this.a : this.s).add($$0);
   }

   protected void U() {
      bok $$0 = this.ah();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.s.addAll(this.a);
         this.a.clear();
      }

      Iterator<dua> $$1 = this.s.iterator();
      boolean $$2 = this.s().i();

      while ($$1.hasNext()) {
         dua $$3 = $$1.next();
         if ($$3.b()) {
            $$1.remove();
         } else if ($$2 && this.n($$3.c())) {
            $$3.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends btz> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Ticking entity");
         p $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new z($$3);
      }
   }

   public boolean h(btz $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean n(jg $$0) {
      return this.a(deb.a($$0));
   }

   public void a(@Nullable btz $$0, double $$1, double $$2, double $$3, float $$4, dev.a $$5) {
      this.a($$0, den.a(this, $$0), null, $$1, $$2, $$3, $$4, false, $$5, lq.w, lq.v, awk.kf);
   }

   public void a(@Nullable btz $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, dev.a $$6) {
      this.a($$0, den.a(this, $$0), null, $$1, $$2, $$3, $$4, $$5, $$6, lq.w, lq.v, awk.kf);
   }

   public void a(@Nullable btz $$0, @Nullable bsp $$1, @Nullable deo $$2, ezh $$3, float $$4, boolean $$5, dev.a $$6) {
      this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6, lq.w, lq.v, awk.kf);
   }

   public void a(@Nullable btz $$0, @Nullable bsp $$1, @Nullable deo $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, dev.a $$8) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, lq.w, lq.v, awk.kf);
   }

   public abstract void a(
      @Nullable btz var1,
      @Nullable bsp var2,
      @Nullable deo var3,
      double var4,
      double var6,
      double var8,
      float var10,
      boolean var11,
      dev.a var12,
      lo var13,
      lo var14,
      jp<awj> var15
   );

   public abstract String I();

   @Nullable
   @Override
   public dsg c_(jg $$0) {
      if (this.s($$0)) {
         return null;
      } else {
         return !this.C && Thread.currentThread() != this.c ? null : this.m($$0).a($$0, dxj.b.a);
      }
   }

   public void a(dsg $$0) {
      jg $$1 = $$0.aC_();
      if (!this.s($$1)) {
         this.m($$1).b($$0);
      }
   }

   public void o(jg $$0) {
      if (!this.s($$0)) {
         this.m($$0).d($$0);
      }
   }

   public boolean p(jg $$0) {
      return this.s($$0) ? false : this.P().b(ki.a($$0.u()), ki.a($$0.w()));
   }

   public boolean a(jg $$0, btz $$1, jl $$2) {
      if (this.s($$0)) {
         return false;
      } else {
         dwz $$3 = this.a(ki.a($$0.u()), ki.a($$0.w()), dya.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(jg $$0, btz $$1) {
      return this.a($$0, $$1, jl.b);
   }

   public void V() {
      double $$0 = 1.0 - (double)(this.d(1.0F) * 5.0F) / 16.0;
      double $$1 = 1.0 - (double)(this.b(1.0F) * 5.0F) / 16.0;
      double $$2 = 0.5 + 2.0 * azj.a((double)azj.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void a(boolean $$0) {
      this.P().b($$0);
   }

   public jg W() {
      jg $$0 = this.B.a();
      if (!this.C_().a($$0)) {
         $$0 = this.a(eaz.a.e, jg.a(this.C_().a(), 0.0, this.C_().b()));
      }

      return $$0;
   }

   public float X() {
      return this.B.b();
   }

   protected void Y() {
      if (this.B.i()) {
         this.x = 1.0F;
         if (this.B.g()) {
            this.z = 1.0F;
         }
      }
   }

   @Override
   public void close() throws IOException {
      this.P().close();
   }

   @Nullable
   @Override
   public dea c(int $$0, int $$1) {
      return this.a($$0, $$1, dya.n, false);
   }

   @Override
   public List<btz> a(@Nullable btz $$0, ezc $$1, Predicate<? super btz> $$2) {
      this.ah().d("getEntities");
      List<btz> $$3 = Lists.newArrayList();
      this.G().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }

         if ($$3x instanceof cjj) {
            for (cjg $$4 : ((cjj)$$3x).gr()) {
               if ($$3x != $$0 && $$2.test($$4)) {
                  $$3.add($$4);
               }
            }
         }
      });
      return $$3;
   }

   @Override
   public <T extends btz> List<T> a(dzo<btz, T> $$0, ezc $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends btz> void a(dzo<btz, T> $$0, ezc $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends btz> void a(dzo<btz, T> $$0, ezc $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      this.ah().d("getEntities");
      this.G().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return axv.a.b;
            }
         }

         if ($$4x instanceof cjj $$5) {
            for (cjg $$6 : $$5.gr()) {
               T $$7 = $$0.a($$6);
               if ($$7 != null && $$2.test($$7)) {
                  $$3.add($$7);
                  if ($$3.size() >= $$4) {
                     return axv.a.b;
                  }
               }
            }
         }

         return axv.a.a;
      });
   }

   @Nullable
   public abstract btz a(int var1);

   public void q(jg $$0) {
      if (this.B($$0)) {
         this.m($$0).a(true);
      }
   }

   public void Z() {
   }

   public long aa() {
      return this.B.c();
   }

   public long ab() {
      return this.B.d();
   }

   public boolean a(coh $$0, jg $$1) {
      return true;
   }

   public void a(btz $$0, byte $$1) {
   }

   public void a(btz $$0, bsp $$1) {
   }

   public void a(jg $$0, dhy $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public etg A_() {
      return this.B;
   }

   public der ac() {
      return this.B.o();
   }

   public abstract bsh s();

   public float b(float $$0) {
      return azj.h($$0, this.y, this.z) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = azj.a($$0, 0.0F, 1.0F);
      this.y = $$1;
      this.z = $$1;
   }

   public float d(float $$0) {
      return azj.h($$0, this.w, this.x);
   }

   public void e(float $$0) {
      float $$1 = azj.a($$0, 0.0F, 1.0F);
      this.w = $$1;
      this.x = $$1;
   }

   private boolean a() {
      return this.D_().g() && !this.D_().h();
   }

   public boolean ad() {
      return this.a() && (double)this.b(1.0F) > 0.9;
   }

   public boolean ae() {
      return this.a() && (double)this.d(1.0F) > 0.2;
   }

   public boolean r(jg $$0) {
      if (!this.ae()) {
         return false;
      } else if (!this.h($$0)) {
         return false;
      } else if (this.a(eaz.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         dfw $$1 = this.t($$0).a();
         return $$1.a($$0, this.N()) == dfw.c.b;
      }
   }

   @Nullable
   public abstract esy a(esw var1);

   public abstract void a(esw var1, esy var2);

   public abstract esw v();

   public void b(int $$0, jg $$1, int $$2) {
   }

   public p a(o $$0) {
      p $$1 = $$0.a("Affected level", 1);
      $$1.a("All players", () -> this.x().size() + " total; " + this.x());
      $$1.a("Chunk stats", this.P()::e);
      $$1.a("Level dimension", () -> this.ag().a().toString());

      try {
         this.B.a($$1, this);
      } catch (Throwable var4) {
         $$1.a("Level Data Unobtainable", var4);
      }

      return $$1;
   }

   public abstract void a(int var1, jg var2, int var3);

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<cyk> $$6) {
   }

   public abstract fam O();

   public void c(jg $$0, dhy $$1) {
      for (jl $$2 : jl.c.a) {
         jg $$3 = $$0.a($$2);
         if (this.B($$3)) {
            dvd $$4 = this.a_($$3);
            if ($$4.a(dia.gY)) {
               this.a($$4, $$3, $$1, null, false);
            } else if ($$4.d(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(dia.gY)) {
                  this.a($$4, $$3, $$1, null, false);
               }
            }
         }
      }
   }

   @Override
   public brw d_(jg $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.B($$0)) {
         $$2 = this.ar();
         $$1 = this.m($$0).t();
      }

      return new brw(this.am(), this.ab(), $$1, $$2);
   }

   @Override
   public int B_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public dwu C_() {
      return this.G;
   }

   public void a(zo<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public dyz D_() {
      return this.E.a();
   }

   public jp<dyz> af() {
      return this.E;
   }

   public alg<dev> ag() {
      return this.I;
   }

   @Override
   public azr E_() {
      return this.A;
   }

   @Override
   public boolean a(jg $$0, Predicate<dvd> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(jg $$0, Predicate<ere> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract dan r();

   public jg a(int $$0, int $$1, int $$2, int $$3) {
      this.u = this.u * 3 + 1013904223;
      int $$4 = this.u >> 2;
      return new jg($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean t() {
      return false;
   }

   public bok ah() {
      return this.F.get();
   }

   public Supplier<bok> ai() {
      return this.F;
   }

   @Override
   public dfy F_() {
      return this.H;
   }

   public final boolean aj() {
      return this.d;
   }

   protected abstract dzq<btz> G();

   @Override
   public long G_() {
      return this.L++;
   }

   @Override
   public kd H_() {
      return this.J;
   }

   public bsq ak() {
      return this.K;
   }

   public abstract cxv K();

   public abstract dtd L();

   public static enum a implements baf {
      a("none"),
      b("block"),
      c("mob"),
      d("tnt"),
      e("trigger");

      public static final Codec<dev.a> f = baf.a(dev.a::values);
      private final String g;

      private a(final String $$0) {
         this.g = $$0;
      }

      @Override
      public String c() {
         return this.g;
      }
   }
}
