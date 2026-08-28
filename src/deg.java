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

public abstract class deg implements deh, AutoCloseable {
   public static final Codec<alb<deg>> g = alb.a(lv.bb);
   public static final alb<deg> h = alb.a(lv.bb, alc.b("overworld"));
   public static final alb<deg> i = alb.a(lv.bb, alc.b("the_nether"));
   public static final alb<deg> j = alb.a(lv.bb, alc.b("the_end"));
   public static final int k = 30000000;
   public static final int l = 512;
   public static final int m = 32;
   public static final int n = 15;
   public static final int o = 24000;
   public static final int p = 20000000;
   public static final int q = -20000000;
   protected final List<dtm> r = Lists.newArrayList();
   protected final erw s;
   private final List<dtm> a = Lists.newArrayList();
   private boolean b;
   private final Thread c;
   private final boolean d;
   private int e;
   protected int t = azl.a().f();
   protected final int u = 1013904223;
   protected float v;
   protected float w;
   protected float x;
   protected float y;
   public final azl z = azl.a();
   @Deprecated
   private final azl f = azl.b();
   private final jn<dyk> D;
   protected final etc A;
   private final Supplier<bod> E;
   public final boolean B;
   private final dwf F;
   private final dfj G;
   private final alb<deg> H;
   private final kb I;
   private final bsh J;
   private long K;

   protected deg(etc $$0, alb<deg> $$1, kb $$2, jn<dyk> $$3, Supplier<bod> $$4, boolean $$5, boolean $$6, long $$7, int $$8) {
      this.E = $$4;
      this.A = $$0;
      this.D = $$3;
      final dyk $$9 = $$3.a();
      this.H = $$1;
      this.B = $$5;
      if ($$9.k() != 1.0) {
         this.F = new dwf() {
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
         this.F = new dwf();
      }

      this.c = Thread.currentThread();
      this.G = new dfj(this, $$7);
      this.d = $$6;
      this.s = new err(this, $$8);
      this.I = $$2;
      this.J = new bsh($$2);
   }

   @Override
   public boolean w_() {
      return this.B;
   }

   @Nullable
   @Override
   public MinecraftServer o() {
      return null;
   }

   public boolean k(je $$0) {
      return !this.s($$0) && g($$0);
   }

   public static boolean l(je $$0) {
      return !b($$0.v()) && g($$0);
   }

   private static boolean g(je $$0) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000;
   }

   private static boolean b(int $$0) {
      return $$0 < -20000000 || $$0 >= 20000000;
   }

   public dwu m(je $$0) {
      return this.d(kg.a($$0.u()), kg.a($$0.w()));
   }

   public dwu d(int $$0, int $$1) {
      return (dwu)this.a($$0, $$1, dxl.n);
   }

   @Nullable
   @Override
   public dwk a(int $$0, int $$1, dxl $$2, boolean $$3) {
      dwk $$4 = this.P().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(je $$0, duo $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(je $$0, duo $$1, int $$2, int $$3) {
      if (this.s($$0)) {
         return false;
      } else if (!this.B && this.aj()) {
         return false;
      } else {
         dwu $$4 = this.m($$0);
         dhj $$5 = $$1.b();
         duo $$6 = $$4.a($$0, $$1, ($$2 & 64) != 0);
         if ($$6 == null) {
            return false;
         } else {
            duo $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.B || ($$2 & 4) == 0) && (this.B || $$4.C() != null && $$4.C().a(aqx.c))) {
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
                  $$1.a((deh)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(je $$0, duo $$1, duo $$2) {
   }

   @Override
   public boolean a(je $$0, boolean $$1) {
      eqp $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(je $$0, boolean $$1, @Nullable bto $$2, int $$3) {
      duo $$4 = this.a_($$0);
      if ($$4.l()) {
         return false;
      } else {
         eqp $$5 = this.b_($$0);
         if (!($$4.b() instanceof dgw)) {
            this.c(2001, $$0, dhj.j($$4));
         }

         if ($$1) {
            drs $$6 = $$4.x() ? this.c_($$0) : null;
            dhj.a($$4, this, $$0, $$6, $$2, cvp.k);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(dzl.f, $$0, dzl.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(je $$0, duo $$1) {
   }

   public boolean b(je $$0, duo $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(je var1, duo var2, duo var3, int var4);

   public void b(je $$0, duo $$1, duo $$2) {
   }

   public void a(je $$0, dhj $$1) {
   }

   public void a(je $$0, dhj $$1, @Nullable erx $$2) {
   }

   public void a(je $$0, dhj $$1, jj $$2, @Nullable erx $$3) {
   }

   public void b(je $$0, dhj $$1, @Nullable erx $$2) {
   }

   public void a(duo $$0, je $$1, dhj $$2, @Nullable erx $$3, boolean $$4) {
   }

   @Override
   public void a(jj $$0, duo $$1, je $$2, je $$3, int $$4, int $$5) {
      this.s.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int a(eak.a $$0, int $$1, int $$2) {
      int $$4;
      if ($$1 >= -30000000 && $$2 >= -30000000 && $$1 < 30000000 && $$2 < 30000000) {
         if (this.b(kg.a($$1), kg.a($$2))) {
            $$4 = this.d(kg.a($$1), kg.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
         } else {
            $$4 = this.G_();
         }
      } else {
         $$4 = this.N() + 1;
      }

      return $$4;
   }

   @Override
   public eqe x_() {
      return this.P().p();
   }

   @Override
   public duo a_(je $$0) {
      if (this.s($$0)) {
         return dhl.nb.o();
      } else {
         dwu $$1 = this.d(kg.a($$0.u()), kg.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public eqp b_(je $$0) {
      if (this.s($$0)) {
         return eqq.a.g();
      } else {
         dwu $$1 = this.m($$0);
         return $$1.b_($$0);
      }
   }

   public boolean S() {
      return !this.B_().a() && this.e < 4;
   }

   public boolean T() {
      return !this.B_().a() && !this.S();
   }

   public void a(@Nullable bto $$0, je $$1, awd $$2, awf $$3, float $$4, float $$5) {
      this.a($$0 instanceof cnu $$6 ? $$6 : null, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(@Nullable cnu $$0, je $$1, awd $$2, awf $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable cnu var1, double var2, double var4, double var6, jn<awd> var8, awf var9, float var10, float var11, long var12);

   public void a(@Nullable cnu $$0, double $$1, double $$2, double $$3, awd $$4, awf $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, lu.b.e($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable cnu var1, bto var2, jn<awd> var3, awf var4, float var5, float var6, long var7);

   public void a(@Nullable cnu $$0, double $$1, double $$2, double $$3, awd $$4, awf $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 1.0F, 1.0F);
   }

   public void a(@Nullable cnu $$0, double $$1, double $$2, double $$3, awd $$4, awf $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable cnu $$0, double $$1, double $$2, double $$3, jn<awd> $$4, awf $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable cnu $$0, bto $$1, awd $$2, awf $$3, float $$4, float $$5) {
      this.a($$0, $$1, lu.b.e($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(je $$0, awd $$1, awf $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(bto $$0, awd $$1, awf $$2, float $$3, float $$4) {
   }

   public void a(double $$0, double $$1, double $$2, awd $$3, awf $$4, float $$5, float $$6, boolean $$7) {
   }

   @Override
   public void a(ll $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(ll $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public void b(ll $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void b(ll $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public float a(float $$0) {
      float $$1 = this.f($$0);
      return $$1 * (float) (Math.PI * 2);
   }

   public void a(dtm $$0) {
      (this.b ? this.a : this.r).add($$0);
   }

   protected void U() {
      bod $$0 = this.ah();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.r.addAll(this.a);
         this.a.clear();
      }

      Iterator<dtm> $$1 = this.r.iterator();
      boolean $$2 = this.s().i();

      while ($$1.hasNext()) {
         dtm $$3 = $$1.next();
         if ($$3.b()) {
            $$1.remove();
         } else if ($$2 && this.n($$3.c())) {
            $$3.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends bto> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Ticking entity");
         p $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new z($$3);
      }
   }

   public boolean h(bto $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean n(je $$0) {
      return this.a(ddm.a($$0));
   }

   public void a(@Nullable bto $$0, double $$1, double $$2, double $$3, float $$4, deg.a $$5) {
      this.a($$0, ddy.a(this, $$0), null, $$1, $$2, $$3, $$4, false, $$5, ln.w, ln.v, awe.kf);
   }

   public void a(@Nullable bto $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, deg.a $$6) {
      this.a($$0, ddy.a(this, $$0), null, $$1, $$2, $$3, $$4, $$5, $$6, ln.w, ln.v, awe.kf);
   }

   public void a(@Nullable bto $$0, @Nullable bsg $$1, @Nullable ddz $$2, eys $$3, float $$4, boolean $$5, deg.a $$6) {
      this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6, ln.w, ln.v, awe.kf);
   }

   public void a(@Nullable bto $$0, @Nullable bsg $$1, @Nullable ddz $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, deg.a $$8) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, ln.w, ln.v, awe.kf);
   }

   public abstract void a(
      @Nullable bto var1,
      @Nullable bsg var2,
      @Nullable ddz var3,
      double var4,
      double var6,
      double var8,
      float var10,
      boolean var11,
      deg.a var12,
      ll var13,
      ll var14,
      jn<awd> var15
   );

   public abstract String I();

   @Nullable
   @Override
   public drs c_(je $$0) {
      if (this.s($$0)) {
         return null;
      } else {
         return !this.B && Thread.currentThread() != this.c ? null : this.m($$0).a($$0, dwu.b.a);
      }
   }

   public void a(drs $$0) {
      je $$1 = $$0.aB_();
      if (!this.s($$1)) {
         this.m($$1).b($$0);
      }
   }

   public void o(je $$0) {
      if (!this.s($$0)) {
         this.m($$0).d($$0);
      }
   }

   public boolean p(je $$0) {
      return this.s($$0) ? false : this.P().b(kg.a($$0.u()), kg.a($$0.w()));
   }

   public boolean a(je $$0, bto $$1, jj $$2) {
      if (this.s($$0)) {
         return false;
      } else {
         dwk $$3 = this.a(kg.a($$0.u()), kg.a($$0.w()), dxl.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(je $$0, bto $$1) {
      return this.a($$0, $$1, jj.b);
   }

   public void V() {
      double $$0 = 1.0 - (double)(this.d(1.0F) * 5.0F) / 16.0;
      double $$1 = 1.0 - (double)(this.b(1.0F) * 5.0F) / 16.0;
      double $$2 = 0.5 + 2.0 * azd.a((double)azd.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void a(boolean $$0) {
      this.P().b($$0);
   }

   public je W() {
      je $$0 = this.A.a();
      if (!this.A_().a($$0)) {
         $$0 = this.a(eak.a.e, je.a(this.A_().a(), 0.0, this.A_().b()));
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
   public ddl c(int $$0, int $$1) {
      return this.a($$0, $$1, dxl.n, false);
   }

   @Override
   public List<bto> a(@Nullable bto $$0, eyn $$1, Predicate<? super bto> $$2) {
      this.ah().d("getEntities");
      List<bto> $$3 = Lists.newArrayList();
      this.G().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }

         if ($$3x instanceof cix) {
            for (ciu $$4 : ((cix)$$3x).gl()) {
               if ($$3x != $$0 && $$2.test($$4)) {
                  $$3.add($$4);
               }
            }
         }
      });
      return $$3;
   }

   @Override
   public <T extends bto> List<T> a(dyz<bto, T> $$0, eyn $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends bto> void a(dyz<bto, T> $$0, eyn $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends bto> void a(dyz<bto, T> $$0, eyn $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      this.ah().d("getEntities");
      this.G().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return axp.a.b;
            }
         }

         if ($$4x instanceof cix $$5) {
            for (ciu $$6 : $$5.gl()) {
               T $$7 = $$0.a($$6);
               if ($$7 != null && $$2.test($$7)) {
                  $$3.add($$7);
                  if ($$3.size() >= $$4) {
                     return axp.a.b;
                  }
               }
            }
         }

         return axp.a.a;
      });
   }

   @Nullable
   public abstract bto a(int var1);

   public void q(je $$0) {
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

   public boolean a(cnu $$0, je $$1) {
      return true;
   }

   public void a(bto $$0, byte $$1) {
   }

   public void a(bto $$0, bsg $$1) {
   }

   public void a(je $$0, dhj $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public esr y_() {
      return this.A;
   }

   public dec ac() {
      return this.A.o();
   }

   public abstract bry s();

   public float b(float $$0) {
      return azd.h($$0, this.x, this.y) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = azd.a($$0, 0.0F, 1.0F);
      this.x = $$1;
      this.y = $$1;
   }

   public float d(float $$0) {
      return azd.h($$0, this.v, this.w);
   }

   public void e(float $$0) {
      float $$1 = azd.a($$0, 0.0F, 1.0F);
      this.v = $$1;
      this.w = $$1;
   }

   public boolean ad() {
      return this.B_().g() && !this.B_().h() ? (double)this.b(1.0F) > 0.9 : false;
   }

   public boolean ae() {
      return (double)this.d(1.0F) > 0.2;
   }

   public boolean r(je $$0) {
      if (!this.ae()) {
         return false;
      } else if (!this.h($$0)) {
         return false;
      } else if (this.a(eak.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         dfh $$1 = this.t($$0).a();
         return $$1.a($$0, this.N()) == dfh.c.b;
      }
   }

   @Nullable
   public abstract esj a(esh var1);

   public abstract void a(esh var1, esj var2);

   public abstract esh v();

   public void b(int $$0, je $$1, int $$2) {
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

   public abstract void a(int var1, je var2, int var3);

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<cyi> $$6) {
   }

   public abstract ezx O();

   public void c(je $$0, dhj $$1) {
      for (jj $$2 : jj.c.a) {
         je $$3 = $$0.a($$2);
         if (this.B($$3)) {
            duo $$4 = this.a_($$3);
            if ($$4.a(dhl.gY)) {
               this.a($$4, $$3, $$1, null, false);
            } else if ($$4.d(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(dhl.gY)) {
                  this.a($$4, $$3, $$1, null, false);
               }
            }
         }
      }
   }

   @Override
   public brn d_(je $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.B($$0)) {
         $$2 = this.ar();
         $$1 = this.m($$0).t();
      }

      return new brn(this.am(), this.ab(), $$1, $$2);
   }

   @Override
   public int z_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public dwf A_() {
      return this.F;
   }

   public void a(zk<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public dyk B_() {
      return this.D.a();
   }

   public jn<dyk> af() {
      return this.D;
   }

   public alb<deg> ag() {
      return this.H;
   }

   @Override
   public azl C_() {
      return this.z;
   }

   @Override
   public boolean a(je $$0, Predicate<duo> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(je $$0, Predicate<eqp> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract dal r();

   public je a(int $$0, int $$1, int $$2, int $$3) {
      this.t = this.t * 3 + 1013904223;
      int $$4 = this.t >> 2;
      return new je($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean t() {
      return false;
   }

   public bod ah() {
      return this.E.get();
   }

   public Supplier<bod> ai() {
      return this.E;
   }

   @Override
   public dfj D_() {
      return this.G;
   }

   public final boolean aj() {
      return this.d;
   }

   protected abstract dzb<bto> G();

   @Override
   public long E_() {
      return this.K++;
   }

   @Override
   public kb F_() {
      return this.I;
   }

   public bsh ak() {
      return this.J;
   }

   public abstract cxn K();

   public abstract dsp L();

   public static enum a implements azz {
      a("none"),
      b("block"),
      c("mob"),
      d("tnt"),
      e("trigger");

      public static final Codec<deg.a> f = azz.a(deg.a::values);
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
