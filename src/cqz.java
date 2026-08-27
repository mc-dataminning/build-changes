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

public abstract class cqz implements cra, AutoCloseable {
   public static final Codec<afv<cqz>> g = afv.a(jz.aI);
   public static final afv<cqz> h = afv.a(jz.aI, new afw("overworld"));
   public static final afv<cqz> i = afv.a(jz.aI, new afw("the_nether"));
   public static final afv<cqz> j = afv.a(jz.aI, new afw("the_end"));
   public static final int k = 30000000;
   public static final int l = 512;
   public static final int m = 32;
   public static final int n = 15;
   public static final int o = 24000;
   public static final int p = 20000000;
   public static final int q = -20000000;
   protected final List<dfn> r = Lists.newArrayList();
   protected final ecg s;
   private final List<dfn> a = Lists.newArrayList();
   private boolean b;
   private final Thread c;
   private final boolean d;
   private int e;
   protected int t = ate.a().f();
   protected final int u = 1013904223;
   protected float v;
   protected float w;
   protected float x;
   protected float y;
   public final ate z = ate.a();
   @Deprecated
   private final ate f = ate.b();
   private final afv<djk> D;
   private final ib<djk> E;
   protected final edf A;
   private final Supplier<bes> F;
   public final boolean B;
   private final dhs G;
   private final crz H;
   private final afv<cqz> I;
   private final ip J;
   private final bis K;
   private long L;

   protected cqz(edf $$0, afv<cqz> $$1, ip $$2, ib<djk> $$3, Supplier<bes> $$4, boolean $$5, boolean $$6, long $$7, int $$8) {
      this.F = $$4;
      this.A = $$0;
      this.E = $$3;
      this.D = $$3.e().orElseThrow(() -> new IllegalArgumentException("Dimension must be registered, got " + $$3));
      final djk $$9 = $$3.a();
      this.I = $$1;
      this.B = $$5;
      if ($$9.k() != 1.0) {
         this.G = new dhs() {
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
         this.G = new dhs();
      }

      this.c = Thread.currentThread();
      this.H = new crz(this, $$7);
      this.d = $$6;
      this.s = new ece(this, $$8);
      this.J = $$2;
      this.K = new bis($$2);
   }

   @Override
   public boolean x_() {
      return this.B;
   }

   @Nullable
   @Override
   public MinecraftServer n() {
      return null;
   }

   public boolean j(ht $$0) {
      return !this.r($$0) && D($$0);
   }

   public static boolean k(ht $$0) {
      return !b($$0.v()) && D($$0);
   }

   private static boolean D(ht $$0) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000;
   }

   private static boolean b(int $$0) {
      return $$0 < -20000000 || $$0 >= 20000000;
   }

   public dii l(ht $$0) {
      return this.d(iu.a($$0.u()), iu.a($$0.w()));
   }

   public dii d(int $$0, int $$1) {
      return (dii)this.a($$0, $$1, dic.n);
   }

   @Nullable
   @Override
   public dhx a(int $$0, int $$1, dic $$2, boolean $$3) {
      dhx $$4 = this.J().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(ht $$0, dgb $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(ht $$0, dgb $$1, int $$2, int $$3) {
      if (this.r($$0)) {
         return false;
      } else if (!this.B && this.af()) {
         return false;
      } else {
         dii $$4 = this.l($$0);
         cua $$5 = $$1.b();
         dgb $$6 = $$4.a($$0, $$1, ($$2 & 64) != 0);
         if ($$6 == null) {
            return false;
         } else {
            dgb $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.B || ($$2 & 4) == 0) && (this.B || $$4.D() != null && $$4.D().a(alj.c))) {
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
                  $$1.a((cra)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(ht $$0, dgb $$1, dgb $$2) {
   }

   @Override
   public boolean a(ht $$0, boolean $$1) {
      ebe $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(ht $$0, boolean $$1, @Nullable bjt $$2, int $$3) {
      dgb $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         ebe $$5 = this.b_($$0);
         if (!($$4.b() instanceof ctn)) {
            this.c(2001, $$0, cua.i($$4));
         }

         if ($$1) {
            ddx $$6 = $$4.t() ? this.c_($$0) : null;
            cua.a($$4, this, $$0, $$6, $$2, ckj.b);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(dkl.f, $$0, dkl.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(ht $$0, dgb $$1) {
   }

   public boolean b(ht $$0, dgb $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(ht var1, dgb var2, dgb var3, int var4);

   public void b(ht $$0, dgb $$1, dgb $$2) {
   }

   public void a(ht $$0, cua $$1) {
   }

   public void a(ht $$0, cua $$1, hx $$2) {
   }

   public void a(ht $$0, cua $$1, ht $$2) {
   }

   public void a(dgb $$0, ht $$1, cua $$2, ht $$3, boolean $$4) {
   }

   @Override
   public void a(hx $$0, dgb $$1, ht $$2, ht $$3, int $$4, int $$5) {
      this.s.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int a(dlk.a $$0, int $$1, int $$2) {
      int $$4;
      if ($$1 >= -30000000 && $$2 >= -30000000 && $$1 < 30000000 && $$2 < 30000000) {
         if (this.b(iu.a($$1), iu.a($$2))) {
            $$4 = this.d(iu.a($$1), iu.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
         } else {
            $$4 = this.I_();
         }
      } else {
         $$4 = this.z_() + 1;
      }

      return $$4;
   }

   @Override
   public eat y_() {
      return this.J().p();
   }

   @Override
   public dgb a_(ht $$0) {
      if (this.r($$0)) {
         return cuc.nb.o();
      } else {
         dii $$1 = this.d(iu.a($$0.u()), iu.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public ebe b_(ht $$0) {
      if (this.r($$0)) {
         return ebf.a.g();
      } else {
         dii $$1 = this.l($$0);
         return $$1.b_($$0);
      }
   }

   public boolean N() {
      return !this.D_().a() && this.e < 4;
   }

   public boolean O() {
      return !this.D_().a() && !this.N();
   }

   public void a(@Nullable bjt $$0, ht $$1, aqc $$2, aqe $$3, float $$4, float $$5) {
      this.a($$0 instanceof ccx $$6 ? $$6 : null, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(@Nullable ccx $$0, ht $$1, aqc $$2, aqe $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable ccx var1, double var2, double var4, double var6, ib<aqc> var8, aqe var9, float var10, float var11, long var12);

   public void a(@Nullable ccx $$0, double $$1, double $$2, double $$3, aqc $$4, aqe $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, jy.c.d($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable ccx var1, bjt var2, ib<aqc> var3, aqe var4, float var5, float var6, long var7);

   public void a(@Nullable ccx $$0, double $$1, double $$2, double $$3, aqc $$4, aqe $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable ccx $$0, bjt $$1, aqc $$2, aqe $$3, float $$4, float $$5) {
      this.a($$0, $$1, jy.c.d($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(ht $$0, aqc $$1, aqe $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(double $$0, double $$1, double $$2, aqc $$3, aqe $$4, float $$5, float $$6, boolean $$7) {
   }

   @Override
   public void a(jq $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(jq $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public void b(jq $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void b(jq $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public float a(float $$0) {
      float $$1 = this.f($$0);
      return $$1 * (float) (Math.PI * 2);
   }

   public void a(dfn $$0) {
      (this.b ? this.a : this.r).add($$0);
   }

   protected void P() {
      bes $$0 = this.ad();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.r.addAll(this.a);
         this.a.clear();
      }

      Iterator<dfn> $$1 = this.r.iterator();

      while ($$1.hasNext()) {
         dfn $$2 = $$1.next();
         if ($$2.b()) {
            $$1.remove();
         } else if (this.m($$2.c())) {
            $$2.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends bjt> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Ticking entity");
         p $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new y($$3);
      }
   }

   public boolean h(bjt $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean m(ht $$0) {
      return this.a(cqg.a($$0));
   }

   public cqr a(@Nullable bjt $$0, double $$1, double $$2, double $$3, float $$4, cqz.a $$5) {
      return this.a($$0, null, null, $$1, $$2, $$3, $$4, false, $$5);
   }

   public cqr a(@Nullable bjt $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, cqz.a $$6) {
      return this.a($$0, null, null, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public cqr a(@Nullable bjt $$0, @Nullable bir $$1, @Nullable cqs $$2, eif $$3, float $$4, boolean $$5, cqz.a $$6) {
      return this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6);
   }

   public cqr a(@Nullable bjt $$0, @Nullable bir $$1, @Nullable cqs $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, cqz.a $$8) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, true);
   }

   public cqr a(@Nullable bjt $$0, @Nullable bir $$1, @Nullable cqs $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, cqz.a $$8, boolean $$9) {
      cqr.a $$10 = switch ($$8) {
         case a -> cqr.a.a;
         case b -> this.a(cqv.N);
         case c -> this.X().b(cqv.c) ? this.a(cqv.O) : cqr.a.a;
         case d -> this.a(cqv.P);
      };
      cqr $$11 = new cqr(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$10);
      $$11.a();
      $$11.a($$9);
      return $$11;
   }

   private cqr.a a(cqv.e<cqv.a> $$0) {
      return this.X().b($$0) ? cqr.a.c : cqr.a.b;
   }

   public abstract String F();

   @Nullable
   @Override
   public ddx c_(ht $$0) {
      if (this.r($$0)) {
         return null;
      } else {
         return !this.B && Thread.currentThread() != this.c ? null : this.l($$0).a($$0, dii.b.a);
      }
   }

   public void a(ddx $$0) {
      ht $$1 = $$0.p();
      if (!this.r($$1)) {
         this.l($$1).b($$0);
      }
   }

   public void n(ht $$0) {
      if (!this.r($$0)) {
         this.l($$0).d($$0);
      }
   }

   public boolean o(ht $$0) {
      return this.r($$0) ? false : this.J().b(iu.a($$0.u()), iu.a($$0.w()));
   }

   public boolean a(ht $$0, bjt $$1, hx $$2) {
      if (this.r($$0)) {
         return false;
      } else {
         dhx $$3 = this.a(iu.a($$0.u()), iu.a($$0.w()), dic.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(ht $$0, bjt $$1) {
      return this.a($$0, $$1, hx.b);
   }

   public void Q() {
      double $$0 = 1.0 - (double)(this.d(1.0F) * 5.0F) / 16.0;
      double $$1 = 1.0 - (double)(this.b(1.0F) * 5.0F) / 16.0;
      double $$2 = 0.5 + 2.0 * asy.a((double)asy.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void b(boolean $$0, boolean $$1) {
      this.J().a($$0, $$1);
   }

   public ht R() {
      ht $$0 = new ht(this.A.a(), this.A.b(), this.A.c());
      if (!this.C_().a($$0)) {
         $$0 = this.a(dlk.a.e, ht.a(this.C_().a(), 0.0, this.C_().b()));
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
   public cqf c(int $$0, int $$1) {
      return this.a($$0, $$1, dic.n, false);
   }

   @Override
   public List<bjt> a(@Nullable bjt $$0, eia $$1, Predicate<? super bjt> $$2) {
      this.ad().d("getEntities");
      List<bjt> $$3 = Lists.newArrayList();
      this.E().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }

         if ($$3x instanceof byk) {
            for (byi $$4 : ((byk)$$3x).ga()) {
               if ($$3x != $$0 && $$2.test($$4)) {
                  $$3.add($$4);
               }
            }
         }
      });
      return $$3;
   }

   @Override
   public <T extends bjt> List<T> a(djz<bjt, T> $$0, eia $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends bjt> void a(djz<bjt, T> $$0, eia $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends bjt> void a(djz<bjt, T> $$0, eia $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      this.ad().d("getEntities");
      this.E().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return arn.a.b;
            }
         }

         if ($$4x instanceof byk $$5) {
            for (byi $$6 : $$5.ga()) {
               T $$7 = $$0.a($$6);
               if ($$7 != null && $$2.test($$7)) {
                  $$3.add($$7);
                  if ($$3.size() >= $$4) {
                     return arn.a.b;
                  }
               }
            }
         }

         return arn.a.a;
      });
   }

   @Nullable
   public abstract bjt a(int var1);

   public void p(ht $$0) {
      if (this.A($$0)) {
         this.l($$0).a(true);
      }
   }

   @Override
   public int z_() {
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

   public boolean a(ccx $$0, ht $$1) {
      return true;
   }

   public void a(bjt $$0, byte $$1) {
   }

   public void a(bjt $$0, bir $$1) {
   }

   public void a(ht $$0, cua $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public ecv A_() {
      return this.A;
   }

   public cqv X() {
      return this.A.q();
   }

   public float b(float $$0) {
      return asy.i($$0, this.x, this.y) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = asy.a($$0, 0.0F, 1.0F);
      this.x = $$1;
      this.y = $$1;
   }

   public float d(float $$0) {
      return asy.i($$0, this.v, this.w);
   }

   public void e(float $$0) {
      float $$1 = asy.a($$0, 0.0F, 1.0F);
      this.v = $$1;
      this.w = $$1;
   }

   public boolean Y() {
      return this.D_().g() && !this.D_().h() ? (double)this.b(1.0F) > 0.9 : false;
   }

   public boolean Z() {
      return (double)this.d(1.0F) > 0.2;
   }

   public boolean q(ht $$0) {
      if (!this.Z()) {
         return false;
      } else if (!this.g($$0)) {
         return false;
      } else if (this.a(dlk.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         crx $$1 = this.s($$0).a();
         return $$1.a($$0) == crx.c.b;
      }
   }

   @Nullable
   public abstract eco a(String var1);

   public abstract void a(String var1, eco var2);

   public abstract int t();

   public void b(int $$0, ht $$1, int $$2) {
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

   public abstract void a(int var1, ht var2, int var3);

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, @Nullable rt $$6) {
   }

   public abstract eje I();

   public void c(ht $$0, cua $$1) {
      for (hx $$2 : hx.c.a) {
         ht $$3 = $$0.a($$2);
         if (this.A($$3)) {
            dgb $$4 = this.a_($$3);
            if ($$4.a(cuc.gY)) {
               this.a($$4, $$3, $$1, $$0, false);
            } else if ($$4.g(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(cuc.gY)) {
                  this.a($$4, $$3, $$1, $$0, false);
               }
            }
         }
      }
   }

   @Override
   public bhz d_(ht $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.A($$0)) {
         $$2 = this.an();
         $$1 = this.l($$0).u();
      }

      return new bhz(this.ai(), this.W(), $$1, $$2);
   }

   @Override
   public int B_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public dhs C_() {
      return this.G;
   }

   public void a(wb<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public djk D_() {
      return this.E.a();
   }

   public afv<djk> aa() {
      return this.D;
   }

   public ib<djk> ab() {
      return this.E;
   }

   public afv<cqz> ac() {
      return this.I;
   }

   @Override
   public ate E_() {
      return this.z;
   }

   @Override
   public boolean a(ht $$0, Predicate<dgb> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(ht $$0, Predicate<ebe> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract cnp q();

   public ht a(int $$0, int $$1, int $$2, int $$3) {
      this.t = this.t * 3 + 1013904223;
      int $$4 = this.t >> 2;
      return new ht($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean r() {
      return false;
   }

   public bes ad() {
      return this.F.get();
   }

   public Supplier<bes> ae() {
      return this.F;
   }

   @Override
   public crz F_() {
      return this.H;
   }

   public final boolean af() {
      return this.d;
   }

   protected abstract dkb<bjt> E();

   @Override
   public long G_() {
      return this.L++;
   }

   @Override
   public ip H_() {
      return this.J;
   }

   public bis ag() {
      return this.K;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
