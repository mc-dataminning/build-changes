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

public abstract class dej implements dek, AutoCloseable {
   public static final Codec<ald<dej>> g = ald.a(lw.bc);
   public static final ald<dej> h = ald.a(lw.bc, ale.b("overworld"));
   public static final ald<dej> i = ald.a(lw.bc, ale.b("the_nether"));
   public static final ald<dej> j = ald.a(lw.bc, ale.b("the_end"));
   public static final int k = 30000000;
   public static final int l = 512;
   public static final int m = 32;
   public static final int n = 15;
   public static final int o = 24000;
   public static final int p = 20000000;
   public static final int q = -20000000;
   protected final List<dtp> r = Lists.newArrayList();
   protected final esa s;
   private final List<dtp> a = Lists.newArrayList();
   private boolean b;
   private final Thread c;
   private final boolean d;
   private int e;
   protected int t = azn.a().f();
   protected final int u = 1013904223;
   protected float v;
   protected float w;
   protected float x;
   protected float y;
   public final azn z = azn.a();
   @Deprecated
   private final azn f = azn.b();
   private final jo<dyo> D;
   protected final etg A;
   private final Supplier<bog> E;
   public final boolean B;
   private final dwj F;
   private final dfm G;
   private final ald<dej> H;
   private final kc I;
   private final bsk J;
   private long K;

   protected dej(etg $$0, ald<dej> $$1, kc $$2, jo<dyo> $$3, Supplier<bog> $$4, boolean $$5, boolean $$6, long $$7, int $$8) {
      this.E = $$4;
      this.A = $$0;
      this.D = $$3;
      final dyo $$9 = $$3.a();
      this.H = $$1;
      this.B = $$5;
      if ($$9.k() != 1.0) {
         this.F = new dwj() {
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
         this.F = new dwj();
      }

      this.c = Thread.currentThread();
      this.G = new dfm(this, $$7);
      this.d = $$6;
      this.s = new erv(this, $$8);
      this.I = $$2;
      this.J = new bsk($$2);
   }

   @Override
   public boolean x_() {
      return this.B;
   }

   @Nullable
   @Override
   public MinecraftServer o() {
      return null;
   }

   public boolean k(jf $$0) {
      return !this.s($$0) && g($$0);
   }

   public static boolean l(jf $$0) {
      return !b($$0.v()) && g($$0);
   }

   private static boolean g(jf $$0) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000;
   }

   private static boolean b(int $$0) {
      return $$0 < -20000000 || $$0 >= 20000000;
   }

   public dwy m(jf $$0) {
      return this.d(kh.a($$0.u()), kh.a($$0.w()));
   }

   public dwy d(int $$0, int $$1) {
      return (dwy)this.a($$0, $$1, dxp.n);
   }

   @Nullable
   @Override
   public dwo a(int $$0, int $$1, dxp $$2, boolean $$3) {
      dwo $$4 = this.P().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(jf $$0, dus $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(jf $$0, dus $$1, int $$2, int $$3) {
      if (this.s($$0)) {
         return false;
      } else if (!this.B && this.aj()) {
         return false;
      } else {
         dwy $$4 = this.m($$0);
         dhm $$5 = $$1.b();
         dus $$6 = $$4.a($$0, $$1, ($$2 & 64) != 0);
         if ($$6 == null) {
            return false;
         } else {
            dus $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.B || ($$2 & 4) == 0) && (this.B || $$4.C() != null && $$4.C().a(aqz.c))) {
                  this.a($$0, $$6, $$1, $$2);
               }

               if (($$2 & 1) != 0) {
                  this.b($$0, $$6.b());
                  if (!this.B && $$1.q()) {
                     this.c($$0, $$5);
                  }
               }

               if (($$2 & 16) == 0 && $$3 > 0) {
                  int $$8 = $$2 & -34;
                  $$6.b(this, $$0, $$8, $$3 - 1);
                  $$1.a((dek)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(jf $$0, dus $$1, dus $$2) {
   }

   @Override
   public boolean a(jf $$0, boolean $$1) {
      eqt $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(jf $$0, boolean $$1, @Nullable btr $$2, int $$3) {
      dus $$4 = this.a_($$0);
      if ($$4.l()) {
         return false;
      } else {
         eqt $$5 = this.b_($$0);
         if (!($$4.b() instanceof dgz)) {
            this.c(2001, $$0, dhm.j($$4));
         }

         if ($$1) {
            drv $$6 = $$4.x() ? this.c_($$0) : null;
            dhm.a($$4, this, $$0, $$6, $$2, cvs.k);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(dzp.f, $$0, dzp.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(jf $$0, dus $$1) {
   }

   public boolean b(jf $$0, dus $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(jf var1, dus var2, dus var3, int var4);

   public void b(jf $$0, dus $$1, dus $$2) {
   }

   public void a(jf $$0, dhm $$1) {
   }

   public void a(jf $$0, dhm $$1, @Nullable esb $$2) {
   }

   public void a(jf $$0, dhm $$1, jk $$2, @Nullable esb $$3) {
   }

   public void b(jf $$0, dhm $$1, @Nullable esb $$2) {
   }

   public void a(dus $$0, jf $$1, dhm $$2, @Nullable esb $$3, boolean $$4) {
   }

   @Override
   public void a(jk $$0, jf $$1, jf $$2, dus $$3, int $$4, int $$5) {
      this.s.a($$0, $$3, $$1, $$2, $$4, $$5);
   }

   @Override
   public int a(eao.a $$0, int $$1, int $$2) {
      int $$4;
      if ($$1 >= -30000000 && $$2 >= -30000000 && $$1 < 30000000 && $$2 < 30000000) {
         if (this.b(kh.a($$1), kh.a($$2))) {
            $$4 = this.d(kh.a($$1), kh.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
         } else {
            $$4 = this.H_();
         }
      } else {
         $$4 = this.N() + 1;
      }

      return $$4;
   }

   @Override
   public eqi y_() {
      return this.P().p();
   }

   @Override
   public dus a_(jf $$0) {
      if (this.s($$0)) {
         return dho.nb.n();
      } else {
         dwy $$1 = this.d(kh.a($$0.u()), kh.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public eqt b_(jf $$0) {
      if (this.s($$0)) {
         return equ.a.g();
      } else {
         dwy $$1 = this.m($$0);
         return $$1.b_($$0);
      }
   }

   public boolean S() {
      return !this.C_().a() && this.e < 4;
   }

   public boolean T() {
      return !this.C_().a() && !this.S();
   }

   public void a(@Nullable btr $$0, jf $$1, awf $$2, awh $$3, float $$4, float $$5) {
      this.a($$0 instanceof cnx $$6 ? $$6 : null, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(@Nullable cnx $$0, jf $$1, awf $$2, awh $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable cnx var1, double var2, double var4, double var6, jo<awf> var8, awh var9, float var10, float var11, long var12);

   public void a(@Nullable cnx $$0, double $$1, double $$2, double $$3, awf $$4, awh $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, lv.b.e($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable cnx var1, btr var2, jo<awf> var3, awh var4, float var5, float var6, long var7);

   public void a(@Nullable cnx $$0, double $$1, double $$2, double $$3, awf $$4, awh $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 1.0F, 1.0F);
   }

   public void a(@Nullable cnx $$0, double $$1, double $$2, double $$3, awf $$4, awh $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable cnx $$0, double $$1, double $$2, double $$3, jo<awf> $$4, awh $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable cnx $$0, btr $$1, awf $$2, awh $$3, float $$4, float $$5) {
      this.a($$0, $$1, lv.b.e($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(jf $$0, awf $$1, awh $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(btr $$0, awf $$1, awh $$2, float $$3, float $$4) {
   }

   public void a(double $$0, double $$1, double $$2, awf $$3, awh $$4, float $$5, float $$6, boolean $$7) {
   }

   @Override
   public void a(lm $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(lm $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public void b(lm $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void b(lm $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public float a(float $$0) {
      float $$1 = this.f($$0);
      return $$1 * (float) (Math.PI * 2);
   }

   public void a(dtp $$0) {
      (this.b ? this.a : this.r).add($$0);
   }

   protected void U() {
      bog $$0 = this.ah();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.r.addAll(this.a);
         this.a.clear();
      }

      Iterator<dtp> $$1 = this.r.iterator();
      boolean $$2 = this.s().i();

      while ($$1.hasNext()) {
         dtp $$3 = $$1.next();
         if ($$3.b()) {
            $$1.remove();
         } else if ($$2 && this.n($$3.c())) {
            $$3.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends btr> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Ticking entity");
         p $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new z($$3);
      }
   }

   public boolean h(btr $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean n(jf $$0) {
      return this.a(ddp.a($$0));
   }

   public void a(@Nullable btr $$0, double $$1, double $$2, double $$3, float $$4, dej.a $$5) {
      this.a($$0, deb.a(this, $$0), null, $$1, $$2, $$3, $$4, false, $$5, lo.w, lo.v, awg.kf);
   }

   public void a(@Nullable btr $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, dej.a $$6) {
      this.a($$0, deb.a(this, $$0), null, $$1, $$2, $$3, $$4, $$5, $$6, lo.w, lo.v, awg.kf);
   }

   public void a(@Nullable btr $$0, @Nullable bsj $$1, @Nullable dec $$2, eyw $$3, float $$4, boolean $$5, dej.a $$6) {
      this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6, lo.w, lo.v, awg.kf);
   }

   public void a(@Nullable btr $$0, @Nullable bsj $$1, @Nullable dec $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, dej.a $$8) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, lo.w, lo.v, awg.kf);
   }

   public abstract void a(
      @Nullable btr var1,
      @Nullable bsj var2,
      @Nullable dec var3,
      double var4,
      double var6,
      double var8,
      float var10,
      boolean var11,
      dej.a var12,
      lm var13,
      lm var14,
      jo<awf> var15
   );

   public abstract String I();

   @Nullable
   @Override
   public drv c_(jf $$0) {
      if (this.s($$0)) {
         return null;
      } else {
         return !this.B && Thread.currentThread() != this.c ? null : this.m($$0).a($$0, dwy.b.a);
      }
   }

   public void a(drv $$0) {
      jf $$1 = $$0.aC_();
      if (!this.s($$1)) {
         this.m($$1).b($$0);
      }
   }

   public void o(jf $$0) {
      if (!this.s($$0)) {
         this.m($$0).d($$0);
      }
   }

   public boolean p(jf $$0) {
      return this.s($$0) ? false : this.P().b(kh.a($$0.u()), kh.a($$0.w()));
   }

   public boolean a(jf $$0, btr $$1, jk $$2) {
      if (this.s($$0)) {
         return false;
      } else {
         dwo $$3 = this.a(kh.a($$0.u()), kh.a($$0.w()), dxp.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(jf $$0, btr $$1) {
      return this.a($$0, $$1, jk.b);
   }

   public void V() {
      double $$0 = 1.0 - (double)(this.d(1.0F) * 5.0F) / 16.0;
      double $$1 = 1.0 - (double)(this.b(1.0F) * 5.0F) / 16.0;
      double $$2 = 0.5 + 2.0 * azf.a((double)azf.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void a(boolean $$0) {
      this.P().b($$0);
   }

   public jf W() {
      jf $$0 = this.A.a();
      if (!this.B_().a($$0)) {
         $$0 = this.a(eao.a.e, jf.a(this.B_().a(), 0.0, this.B_().b()));
      }

      return $$0;
   }

   public float X() {
      return this.A.b();
   }

   protected void Y() {
      if (this.A.i()) {
         this.w = 1.0F;
         if (this.A.g()) {
            this.y = 1.0F;
         }
      }
   }

   @Override
   public void close() throws IOException {
      this.P().close();
   }

   @Nullable
   @Override
   public ddo c(int $$0, int $$1) {
      return this.a($$0, $$1, dxp.n, false);
   }

   @Override
   public List<btr> a(@Nullable btr $$0, eyr $$1, Predicate<? super btr> $$2) {
      this.ah().d("getEntities");
      List<btr> $$3 = Lists.newArrayList();
      this.G().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }

         if ($$3x instanceof cja) {
            for (cix $$4 : ((cja)$$3x).gk()) {
               if ($$3x != $$0 && $$2.test($$4)) {
                  $$3.add($$4);
               }
            }
         }
      });
      return $$3;
   }

   @Override
   public <T extends btr> List<T> a(dzd<btr, T> $$0, eyr $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends btr> void a(dzd<btr, T> $$0, eyr $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends btr> void a(dzd<btr, T> $$0, eyr $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      this.ah().d("getEntities");
      this.G().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return axr.a.b;
            }
         }

         if ($$4x instanceof cja $$5) {
            for (cix $$6 : $$5.gk()) {
               T $$7 = $$0.a($$6);
               if ($$7 != null && $$2.test($$7)) {
                  $$3.add($$7);
                  if ($$3.size() >= $$4) {
                     return axr.a.b;
                  }
               }
            }
         }

         return axr.a.a;
      });
   }

   @Nullable
   public abstract btr a(int var1);

   public void q(jf $$0) {
      if (this.B($$0)) {
         this.m($$0).a(true);
      }
   }

   public void Z() {
   }

   public long aa() {
      return this.A.c();
   }

   public long ab() {
      return this.A.d();
   }

   public boolean a(cnx $$0, jf $$1) {
      return true;
   }

   public void a(btr $$0, byte $$1) {
   }

   public void a(btr $$0, bsj $$1) {
   }

   public void a(jf $$0, dhm $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public esv z_() {
      return this.A;
   }

   public def ac() {
      return this.A.o();
   }

   public abstract bsb s();

   public float b(float $$0) {
      return azf.h($$0, this.x, this.y) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = azf.a($$0, 0.0F, 1.0F);
      this.x = $$1;
      this.y = $$1;
   }

   public float d(float $$0) {
      return azf.h($$0, this.v, this.w);
   }

   public void e(float $$0) {
      float $$1 = azf.a($$0, 0.0F, 1.0F);
      this.v = $$1;
      this.w = $$1;
   }

   private boolean a() {
      return this.C_().g() && !this.C_().h();
   }

   public boolean ad() {
      return this.a() && (double)this.b(1.0F) > 0.9;
   }

   public boolean ae() {
      return this.a() && (double)this.d(1.0F) > 0.2;
   }

   public boolean r(jf $$0) {
      if (!this.ae()) {
         return false;
      } else if (!this.h($$0)) {
         return false;
      } else if (this.a(eao.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         dfk $$1 = this.t($$0).a();
         return $$1.a($$0, this.N()) == dfk.c.b;
      }
   }

   @Nullable
   public abstract esn a(esl var1);

   public abstract void a(esl var1, esn var2);

   public abstract esl v();

   public void b(int $$0, jf $$1, int $$2) {
   }

   public p a(o $$0) {
      p $$1 = $$0.a("Affected level", 1);
      $$1.a("All players", () -> this.x().size() + " total; " + this.x());
      $$1.a("Chunk stats", this.P()::e);
      $$1.a("Level dimension", () -> this.ag().a().toString());

      try {
         this.A.a($$1, this);
      } catch (Throwable var4) {
         $$1.a("Level Data Unobtainable", var4);
      }

      return $$1;
   }

   public abstract void a(int var1, jf var2, int var3);

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<cyl> $$6) {
   }

   public abstract fab O();

   public void c(jf $$0, dhm $$1) {
      for (jk $$2 : jk.c.a) {
         jf $$3 = $$0.a($$2);
         if (this.B($$3)) {
            dus $$4 = this.a_($$3);
            if ($$4.a(dho.gY)) {
               this.a($$4, $$3, $$1, null, false);
            } else if ($$4.d(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(dho.gY)) {
                  this.a($$4, $$3, $$1, null, false);
               }
            }
         }
      }
   }

   @Override
   public brq d_(jf $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.B($$0)) {
         $$2 = this.ar();
         $$1 = this.m($$0).t();
      }

      return new brq(this.am(), this.ab(), $$1, $$2);
   }

   @Override
   public int A_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public dwj B_() {
      return this.F;
   }

   public void a(zl<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public dyo C_() {
      return this.D.a();
   }

   public jo<dyo> af() {
      return this.D;
   }

   public ald<dej> ag() {
      return this.H;
   }

   @Override
   public azn D_() {
      return this.z;
   }

   @Override
   public boolean a(jf $$0, Predicate<dus> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(jf $$0, Predicate<eqt> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract dao r();

   public jf a(int $$0, int $$1, int $$2, int $$3) {
      this.t = this.t * 3 + 1013904223;
      int $$4 = this.t >> 2;
      return new jf($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean t() {
      return false;
   }

   public bog ah() {
      return this.E.get();
   }

   public Supplier<bog> ai() {
      return this.E;
   }

   @Override
   public dfm E_() {
      return this.G;
   }

   public final boolean aj() {
      return this.d;
   }

   protected abstract dzf<btr> G();

   @Override
   public long F_() {
      return this.K++;
   }

   @Override
   public kc G_() {
      return this.I;
   }

   public bsk ak() {
      return this.J;
   }

   public abstract cxq K();

   public abstract dss L();

   public static enum a implements bab {
      a("none"),
      b("block"),
      c("mob"),
      d("tnt"),
      e("trigger");

      public static final Codec<dej.a> f = bab.a(dej.a::values);
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
