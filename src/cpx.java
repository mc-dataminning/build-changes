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

public abstract class cpx implements cpy, AutoCloseable {
   public static final Codec<aex<cpx>> g = aex.a(je.aH);
   public static final aex<cpx> h = aex.a(je.aH, new aey("overworld"));
   public static final aex<cpx> i = aex.a(je.aH, new aey("the_nether"));
   public static final aex<cpx> j = aex.a(je.aH, new aey("the_end"));
   public static final int k = 30000000;
   public static final int l = 512;
   public static final int m = 32;
   public static final int n = 15;
   public static final int o = 24000;
   public static final int p = 20000000;
   public static final int q = -20000000;
   protected final List<den> r = Lists.newArrayList();
   protected final ebq s;
   private final List<den> a = Lists.newArrayList();
   private boolean b;
   private final Thread c;
   private final boolean d;
   private int e;
   protected int t = ase.a().f();
   protected final int u = 1013904223;
   protected float v;
   protected float w;
   protected float x;
   protected float y;
   public final ase z = ase.a();
   @Deprecated
   private final ase f = ase.b();
   private final aex<diu> D;
   private final hg<diu> E;
   protected final ecp A;
   private final Supplier<bdr> F;
   public final boolean B;
   private final dhc G;
   private final cqx H;
   private final aex<cpx> I;
   private final hu J;
   private final bhr K;
   private long L;

   protected cpx(ecp $$0, aex<cpx> $$1, hu $$2, hg<diu> $$3, Supplier<bdr> $$4, boolean $$5, boolean $$6, long $$7, int $$8) {
      this.F = $$4;
      this.A = $$0;
      this.E = $$3;
      this.D = $$3.e().orElseThrow(() -> new IllegalArgumentException("Dimension must be registered, got " + $$3));
      final diu $$9 = $$3.a();
      this.I = $$1;
      this.B = $$5;
      if ($$9.k() != 1.0) {
         this.G = new dhc() {
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
         this.G = new dhc();
      }

      this.c = Thread.currentThread();
      this.H = new cqx(this, $$7);
      this.d = $$6;
      this.s = new ebo(this, $$8);
      this.J = $$2;
      this.K = new bhr($$2);
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

   public dhs l(gw $$0) {
      return this.d(hz.a($$0.u()), hz.a($$0.w()));
   }

   public dhs d(int $$0, int $$1) {
      return (dhs)this.a($$0, $$1, dhm.n);
   }

   @Nullable
   @Override
   public dhh a(int $$0, int $$1, dhm $$2, boolean $$3) {
      dhh $$4 = this.J().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(gw $$0, dfl $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(gw $$0, dfl $$1, int $$2, int $$3) {
      if (this.r($$0)) {
         return false;
      } else if (!this.B && this.af()) {
         return false;
      } else {
         dhs $$4 = this.l($$0);
         csx $$5 = $$1.b();
         dfl $$6 = $$4.a($$0, $$1, ($$2 & 64) != 0);
         if ($$6 == null) {
            return false;
         } else {
            dfl $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.B || ($$2 & 4) == 0) && (this.B || $$4.D() != null && $$4.D().a(akl.c))) {
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
                  $$1.a((cpy)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(gw $$0, dfl $$1, dfl $$2) {
   }

   @Override
   public boolean a(gw $$0, boolean $$1) {
      eao $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(gw $$0, boolean $$1, @Nullable bis $$2, int $$3) {
      dfl $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         eao $$5 = this.b_($$0);
         if (!($$4.b() instanceof csl)) {
            this.c(2001, $$0, csx.i($$4));
         }

         if ($$1) {
            dcx $$6 = $$4.t() ? this.c_($$0) : null;
            csx.a($$4, this, $$0, $$6, $$2, cjh.b);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(djv.f, $$0, djv.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(gw $$0, dfl $$1) {
   }

   public boolean b(gw $$0, dfl $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(gw var1, dfl var2, dfl var3, int var4);

   public void b(gw $$0, dfl $$1, dfl $$2) {
   }

   public void a(gw $$0, csx $$1) {
   }

   public void a(gw $$0, csx $$1, hc $$2) {
   }

   public void a(gw $$0, csx $$1, gw $$2) {
   }

   public void a(dfl $$0, gw $$1, csx $$2, gw $$3, boolean $$4) {
   }

   @Override
   public void a(hc $$0, dfl $$1, gw $$2, gw $$3, int $$4, int $$5) {
      this.s.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int a(dku.a $$0, int $$1, int $$2) {
      int $$4;
      if ($$1 >= -30000000 && $$2 >= -30000000 && $$1 < 30000000 && $$2 < 30000000) {
         if (this.b(hz.a($$1), hz.a($$2))) {
            $$4 = this.d(hz.a($$1), hz.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
         } else {
            $$4 = this.H_();
         }
      } else {
         $$4 = this.y_() + 1;
      }

      return $$4;
   }

   @Override
   public ead x_() {
      return this.J().p();
   }

   @Override
   public dfl a_(gw $$0) {
      if (this.r($$0)) {
         return csy.nb.n();
      } else {
         dhs $$1 = this.d(hz.a($$0.u()), hz.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public eao b_(gw $$0) {
      if (this.r($$0)) {
         return eap.a.g();
      } else {
         dhs $$1 = this.l($$0);
         return $$1.b_($$0);
      }
   }

   public boolean N() {
      return !this.C_().a() && this.e < 4;
   }

   public boolean O() {
      return !this.C_().a() && !this.N();
   }

   public void a(@Nullable bis $$0, gw $$1, ape $$2, apg $$3, float $$4, float $$5) {
      this.a($$0 instanceof cbw $$6 ? $$6 : null, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(@Nullable cbw $$0, gw $$1, ape $$2, apg $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable cbw var1, double var2, double var4, double var6, hg<ape> var8, apg var9, float var10, float var11, long var12);

   public void a(@Nullable cbw $$0, double $$1, double $$2, double $$3, ape $$4, apg $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, jd.c.d($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable cbw var1, bis var2, hg<ape> var3, apg var4, float var5, float var6, long var7);

   public void a(@Nullable cbw $$0, double $$1, double $$2, double $$3, ape $$4, apg $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable cbw $$0, bis $$1, ape $$2, apg $$3, float $$4, float $$5) {
      this.a($$0, $$1, jd.c.d($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(gw $$0, ape $$1, apg $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(double $$0, double $$1, double $$2, ape $$3, apg $$4, float $$5, float $$6, boolean $$7) {
   }

   @Override
   public void a(iv $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(iv $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public void b(iv $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void b(iv $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public float a(float $$0) {
      float $$1 = this.f($$0);
      return $$1 * (float) (Math.PI * 2);
   }

   public void a(den $$0) {
      (this.b ? this.a : this.r).add($$0);
   }

   protected void P() {
      bdr $$0 = this.ad();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.r.addAll(this.a);
         this.a.clear();
      }

      Iterator<den> $$1 = this.r.iterator();

      while ($$1.hasNext()) {
         den $$2 = $$1.next();
         if ($$2.b()) {
            $$1.remove();
         } else if (this.m($$2.c())) {
            $$2.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends bis> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Ticking entity");
         p $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new y($$3);
      }
   }

   public boolean h(bis $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean m(gw $$0) {
      return this.a(cpe.a($$0));
   }

   public cpp a(@Nullable bis $$0, double $$1, double $$2, double $$3, float $$4, cpx.a $$5) {
      return this.a($$0, null, null, $$1, $$2, $$3, $$4, false, $$5);
   }

   public cpp a(@Nullable bis $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, cpx.a $$6) {
      return this.a($$0, null, null, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public cpp a(@Nullable bis $$0, @Nullable bhq $$1, @Nullable cpq $$2, ehp $$3, float $$4, boolean $$5, cpx.a $$6) {
      return this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6);
   }

   public cpp a(@Nullable bis $$0, @Nullable bhq $$1, @Nullable cpq $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, cpx.a $$8) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, true);
   }

   public cpp a(@Nullable bis $$0, @Nullable bhq $$1, @Nullable cpq $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, cpx.a $$8, boolean $$9) {
      cpp.a $$10 = switch ($$8) {
         case a -> cpp.a.a;
         case b -> this.a(cpt.M);
         case c -> this.X().b(cpt.c) ? this.a(cpt.N) : cpp.a.a;
         case d -> this.a(cpt.O);
      };
      cpp $$11 = new cpp(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$10);
      $$11.a();
      $$11.a($$9);
      return $$11;
   }

   private cpp.a a(cpt.e<cpt.a> $$0) {
      return this.X().b($$0) ? cpp.a.c : cpp.a.b;
   }

   public abstract String F();

   @Nullable
   @Override
   public dcx c_(gw $$0) {
      if (this.r($$0)) {
         return null;
      } else {
         return !this.B && Thread.currentThread() != this.c ? null : this.l($$0).a($$0, dhs.b.a);
      }
   }

   public void a(dcx $$0) {
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
      return this.r($$0) ? false : this.J().b(hz.a($$0.u()), hz.a($$0.w()));
   }

   public boolean a(gw $$0, bis $$1, hc $$2) {
      if (this.r($$0)) {
         return false;
      } else {
         dhh $$3 = this.a(hz.a($$0.u()), hz.a($$0.w()), dhm.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(gw $$0, bis $$1) {
      return this.a($$0, $$1, hc.b);
   }

   public void Q() {
      double $$0 = 1.0 - (double)(this.d(1.0F) * 5.0F) / 16.0;
      double $$1 = 1.0 - (double)(this.b(1.0F) * 5.0F) / 16.0;
      double $$2 = 0.5 + 2.0 * ary.a((double)ary.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void b(boolean $$0, boolean $$1) {
      this.J().a($$0, $$1);
   }

   public gw R() {
      gw $$0 = new gw(this.A.a(), this.A.b(), this.A.c());
      if (!this.B_().a($$0)) {
         $$0 = this.a(dku.a.e, gw.a(this.B_().a(), 0.0, this.B_().b()));
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
   public cpd c(int $$0, int $$1) {
      return this.a($$0, $$1, dhm.n, false);
   }

   @Override
   public List<bis> a(@Nullable bis $$0, ehk $$1, Predicate<? super bis> $$2) {
      this.ad().d("getEntities");
      List<bis> $$3 = Lists.newArrayList();
      this.E().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }

         if ($$3x instanceof bxj) {
            for (bxh $$4 : ((bxj)$$3x).fZ()) {
               if ($$3x != $$0 && $$2.test($$4)) {
                  $$3.add($$4);
               }
            }
         }
      });
      return $$3;
   }

   @Override
   public <T extends bis> List<T> a(djj<bis, T> $$0, ehk $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends bis> void a(djj<bis, T> $$0, ehk $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends bis> void a(djj<bis, T> $$0, ehk $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      this.ad().d("getEntities");
      this.E().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return aqp.a.b;
            }
         }

         if ($$4x instanceof bxj $$5) {
            for (bxh $$6 : $$5.fZ()) {
               T $$7 = $$0.a($$6);
               if ($$7 != null && $$2.test($$7)) {
                  $$3.add($$7);
                  if ($$3.size() >= $$4) {
                     return aqp.a.b;
                  }
               }
            }
         }

         return aqp.a.a;
      });
   }

   @Nullable
   public abstract bis a(int var1);

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

   public boolean a(cbw $$0, gw $$1) {
      return true;
   }

   public void a(bis $$0, byte $$1) {
   }

   public void a(bis $$0, bhq $$1) {
   }

   public void a(gw $$0, csx $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public ecf z_() {
      return this.A;
   }

   public cpt X() {
      return this.A.q();
   }

   public float b(float $$0) {
      return ary.i($$0, this.x, this.y) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = ary.a($$0, 0.0F, 1.0F);
      this.x = $$1;
      this.y = $$1;
   }

   public float d(float $$0) {
      return ary.i($$0, this.v, this.w);
   }

   public void e(float $$0) {
      float $$1 = ary.a($$0, 0.0F, 1.0F);
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
      } else if (this.a(dku.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         cqv $$1 = this.s($$0).a();
         return $$1.a($$0) == cqv.c.b;
      }
   }

   @Nullable
   public abstract eby a(String var1);

   public abstract void a(String var1, eby var2);

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

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, @Nullable qy $$6) {
   }

   public abstract eio I();

   public void c(gw $$0, csx $$1) {
      for (hc $$2 : hc.c.a) {
         gw $$3 = $$0.a($$2);
         if (this.A($$3)) {
            dfl $$4 = this.a_($$3);
            if ($$4.a(csy.gY)) {
               this.a($$4, $$3, $$1, $$0, false);
            } else if ($$4.g(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(csy.gY)) {
                  this.a($$4, $$3, $$1, $$0, false);
               }
            }
         }
      }
   }

   @Override
   public bgy d_(gw $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.A($$0)) {
         $$2 = this.an();
         $$1 = this.l($$0).u();
      }

      return new bgy(this.ai(), this.W(), $$1, $$2);
   }

   @Override
   public int A_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public dhc B_() {
      return this.G;
   }

   public void a(vf<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public diu C_() {
      return this.E.a();
   }

   public aex<diu> aa() {
      return this.D;
   }

   public hg<diu> ab() {
      return this.E;
   }

   public aex<cpx> ac() {
      return this.I;
   }

   @Override
   public ase D_() {
      return this.z;
   }

   @Override
   public boolean a(gw $$0, Predicate<dfl> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(gw $$0, Predicate<eao> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract cmn q();

   public gw a(int $$0, int $$1, int $$2, int $$3) {
      this.t = this.t * 3 + 1013904223;
      int $$4 = this.t >> 2;
      return new gw($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean r() {
      return false;
   }

   public bdr ad() {
      return this.F.get();
   }

   public Supplier<bdr> ae() {
      return this.F;
   }

   @Override
   public cqx E_() {
      return this.H;
   }

   public final boolean af() {
      return this.d;
   }

   protected abstract djl<bis> E();

   @Override
   public long F_() {
      return this.L++;
   }

   @Override
   public hu G_() {
      return this.J;
   }

   public bhr ag() {
      return this.K;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
