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

public abstract class cpv implements cpw, AutoCloseable {
   public static final Codec<aev<cpv>> g = aev.a(jc.aH);
   public static final aev<cpv> h = aev.a(jc.aH, new aew("overworld"));
   public static final aev<cpv> i = aev.a(jc.aH, new aew("the_nether"));
   public static final aev<cpv> j = aev.a(jc.aH, new aew("the_end"));
   public static final int k = 30000000;
   public static final int l = 512;
   public static final int m = 32;
   public static final int n = 15;
   public static final int o = 24000;
   public static final int p = 20000000;
   public static final int q = -20000000;
   protected final List<del> r = Lists.newArrayList();
   protected final ebo s;
   private final List<del> a = Lists.newArrayList();
   private boolean b;
   private final Thread c;
   private final boolean d;
   private int e;
   protected int t = asc.a().f();
   protected final int u = 1013904223;
   protected float v;
   protected float w;
   protected float x;
   protected float y;
   public final asc z = asc.a();
   @Deprecated
   private final asc f = asc.b();
   private final aev<dis> D;
   private final he<dis> E;
   protected final ecn A;
   private final Supplier<bdp> F;
   public final boolean B;
   private final dha G;
   private final cqv H;
   private final aev<cpv> I;
   private final hr J;
   private final bhp K;
   private long L;

   protected cpv(ecn $$0, aev<cpv> $$1, hr $$2, he<dis> $$3, Supplier<bdp> $$4, boolean $$5, boolean $$6, long $$7, int $$8) {
      this.F = $$4;
      this.A = $$0;
      this.E = $$3;
      this.D = $$3.e().orElseThrow(() -> new IllegalArgumentException("Dimension must be registered, got " + $$3));
      final dis $$9 = $$3.a();
      this.I = $$1;
      this.B = $$5;
      if ($$9.k() != 1.0) {
         this.G = new dha() {
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
         this.G = new dha();
      }

      this.c = Thread.currentThread();
      this.H = new cqv(this, $$7);
      this.d = $$6;
      this.s = new ebm(this, $$8);
      this.J = $$2;
      this.K = new bhp($$2);
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

   public dhq l(gw $$0) {
      return this.d(hw.a($$0.u()), hw.a($$0.w()));
   }

   public dhq d(int $$0, int $$1) {
      return (dhq)this.a($$0, $$1, dhk.n);
   }

   @Nullable
   @Override
   public dhf a(int $$0, int $$1, dhk $$2, boolean $$3) {
      dhf $$4 = this.J().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(gw $$0, dfj $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(gw $$0, dfj $$1, int $$2, int $$3) {
      if (this.r($$0)) {
         return false;
      } else if (!this.B && this.af()) {
         return false;
      } else {
         dhq $$4 = this.l($$0);
         csv $$5 = $$1.b();
         dfj $$6 = $$4.a($$0, $$1, ($$2 & 64) != 0);
         if ($$6 == null) {
            return false;
         } else {
            dfj $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.B || ($$2 & 4) == 0) && (this.B || $$4.D() != null && $$4.D().a(akj.c))) {
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
                  $$1.a((cpw)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(gw $$0, dfj $$1, dfj $$2) {
   }

   @Override
   public boolean a(gw $$0, boolean $$1) {
      eam $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(gw $$0, boolean $$1, @Nullable biq $$2, int $$3) {
      dfj $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         eam $$5 = this.b_($$0);
         if (!($$4.b() instanceof csj)) {
            this.c(2001, $$0, csv.i($$4));
         }

         if ($$1) {
            dcv $$6 = $$4.t() ? this.c_($$0) : null;
            csv.a($$4, this, $$0, $$6, $$2, cjf.b);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(djt.f, $$0, djt.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(gw $$0, dfj $$1) {
   }

   public boolean b(gw $$0, dfj $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(gw var1, dfj var2, dfj var3, int var4);

   public void b(gw $$0, dfj $$1, dfj $$2) {
   }

   public void a(gw $$0, csv $$1) {
   }

   public void a(gw $$0, csv $$1, ha $$2) {
   }

   public void a(gw $$0, csv $$1, gw $$2) {
   }

   public void a(dfj $$0, gw $$1, csv $$2, gw $$3, boolean $$4) {
   }

   @Override
   public void a(ha $$0, dfj $$1, gw $$2, gw $$3, int $$4, int $$5) {
      this.s.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int a(dks.a $$0, int $$1, int $$2) {
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
   public eab x_() {
      return this.J().p();
   }

   @Override
   public dfj a_(gw $$0) {
      if (this.r($$0)) {
         return csw.nb.n();
      } else {
         dhq $$1 = this.d(hw.a($$0.u()), hw.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public eam b_(gw $$0) {
      if (this.r($$0)) {
         return ean.a.g();
      } else {
         dhq $$1 = this.l($$0);
         return $$1.b_($$0);
      }
   }

   public boolean N() {
      return !this.C_().a() && this.e < 4;
   }

   public boolean O() {
      return !this.C_().a() && !this.N();
   }

   public void a(@Nullable biq $$0, gw $$1, apc $$2, ape $$3, float $$4, float $$5) {
      this.a($$0 instanceof cbu $$6 ? $$6 : null, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(@Nullable cbu $$0, gw $$1, apc $$2, ape $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable cbu var1, double var2, double var4, double var6, he<apc> var8, ape var9, float var10, float var11, long var12);

   public void a(@Nullable cbu $$0, double $$1, double $$2, double $$3, apc $$4, ape $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, jb.c.d($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable cbu var1, biq var2, he<apc> var3, ape var4, float var5, float var6, long var7);

   public void a(@Nullable cbu $$0, double $$1, double $$2, double $$3, apc $$4, ape $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable cbu $$0, biq $$1, apc $$2, ape $$3, float $$4, float $$5) {
      this.a($$0, $$1, jb.c.d($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(gw $$0, apc $$1, ape $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(double $$0, double $$1, double $$2, apc $$3, ape $$4, float $$5, float $$6, boolean $$7) {
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

   public void a(del $$0) {
      (this.b ? this.a : this.r).add($$0);
   }

   protected void P() {
      bdp $$0 = this.ad();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.r.addAll(this.a);
         this.a.clear();
      }

      Iterator<del> $$1 = this.r.iterator();

      while ($$1.hasNext()) {
         del $$2 = $$1.next();
         if ($$2.b()) {
            $$1.remove();
         } else if (this.m($$2.c())) {
            $$2.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends biq> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Ticking entity");
         p $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new y($$3);
      }
   }

   public boolean h(biq $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean m(gw $$0) {
      return this.a(cpc.a($$0));
   }

   public cpn a(@Nullable biq $$0, double $$1, double $$2, double $$3, float $$4, cpv.a $$5) {
      return this.a($$0, null, null, $$1, $$2, $$3, $$4, false, $$5);
   }

   public cpn a(@Nullable biq $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, cpv.a $$6) {
      return this.a($$0, null, null, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public cpn a(@Nullable biq $$0, @Nullable bho $$1, @Nullable cpo $$2, ehn $$3, float $$4, boolean $$5, cpv.a $$6) {
      return this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6);
   }

   public cpn a(@Nullable biq $$0, @Nullable bho $$1, @Nullable cpo $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, cpv.a $$8) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, true);
   }

   public cpn a(@Nullable biq $$0, @Nullable bho $$1, @Nullable cpo $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, cpv.a $$8, boolean $$9) {
      cpn.a $$10 = switch ($$8) {
         case a -> cpn.a.a;
         case b -> this.a(cpr.M);
         case c -> this.X().b(cpr.c) ? this.a(cpr.N) : cpn.a.a;
         case d -> this.a(cpr.O);
      };
      cpn $$11 = new cpn(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$10);
      $$11.a();
      $$11.a($$9);
      return $$11;
   }

   private cpn.a a(cpr.e<cpr.a> $$0) {
      return this.X().b($$0) ? cpn.a.c : cpn.a.b;
   }

   public abstract String F();

   @Nullable
   @Override
   public dcv c_(gw $$0) {
      if (this.r($$0)) {
         return null;
      } else {
         return !this.B && Thread.currentThread() != this.c ? null : this.l($$0).a($$0, dhq.b.a);
      }
   }

   public void a(dcv $$0) {
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

   public boolean a(gw $$0, biq $$1, ha $$2) {
      if (this.r($$0)) {
         return false;
      } else {
         dhf $$3 = this.a(hw.a($$0.u()), hw.a($$0.w()), dhk.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(gw $$0, biq $$1) {
      return this.a($$0, $$1, ha.b);
   }

   public void Q() {
      double $$0 = 1.0 - (double)(this.d(1.0F) * 5.0F) / 16.0;
      double $$1 = 1.0 - (double)(this.b(1.0F) * 5.0F) / 16.0;
      double $$2 = 0.5 + 2.0 * arw.a((double)arw.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void b(boolean $$0, boolean $$1) {
      this.J().a($$0, $$1);
   }

   public gw R() {
      gw $$0 = new gw(this.A.a(), this.A.b(), this.A.c());
      if (!this.B_().a($$0)) {
         $$0 = this.a(dks.a.e, gw.a(this.B_().a(), 0.0, this.B_().b()));
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
   public cpb c(int $$0, int $$1) {
      return this.a($$0, $$1, dhk.n, false);
   }

   @Override
   public List<biq> a(@Nullable biq $$0, ehi $$1, Predicate<? super biq> $$2) {
      this.ad().d("getEntities");
      List<biq> $$3 = Lists.newArrayList();
      this.E().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }

         if ($$3x instanceof bxh) {
            for (bxf $$4 : ((bxh)$$3x).fZ()) {
               if ($$3x != $$0 && $$2.test($$4)) {
                  $$3.add($$4);
               }
            }
         }
      });
      return $$3;
   }

   @Override
   public <T extends biq> List<T> a(djh<biq, T> $$0, ehi $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends biq> void a(djh<biq, T> $$0, ehi $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends biq> void a(djh<biq, T> $$0, ehi $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      this.ad().d("getEntities");
      this.E().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return aqn.a.b;
            }
         }

         if ($$4x instanceof bxh $$5) {
            for (bxf $$6 : $$5.fZ()) {
               T $$7 = $$0.a($$6);
               if ($$7 != null && $$2.test($$7)) {
                  $$3.add($$7);
                  if ($$3.size() >= $$4) {
                     return aqn.a.b;
                  }
               }
            }
         }

         return aqn.a.a;
      });
   }

   @Nullable
   public abstract biq a(int var1);

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

   public boolean a(cbu $$0, gw $$1) {
      return true;
   }

   public void a(biq $$0, byte $$1) {
   }

   public void a(biq $$0, bho $$1) {
   }

   public void a(gw $$0, csv $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public ecd z_() {
      return this.A;
   }

   public cpr X() {
      return this.A.q();
   }

   public float b(float $$0) {
      return arw.i($$0, this.x, this.y) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = arw.a($$0, 0.0F, 1.0F);
      this.x = $$1;
      this.y = $$1;
   }

   public float d(float $$0) {
      return arw.i($$0, this.v, this.w);
   }

   public void e(float $$0) {
      float $$1 = arw.a($$0, 0.0F, 1.0F);
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
      } else if (this.a(dks.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         cqt $$1 = this.s($$0).a();
         return $$1.a($$0) == cqt.c.b;
      }
   }

   @Nullable
   public abstract ebw a(String var1);

   public abstract void a(String var1, ebw var2);

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

   public abstract eim I();

   public void c(gw $$0, csv $$1) {
      for (ha $$2 : ha.c.a) {
         gw $$3 = $$0.a($$2);
         if (this.A($$3)) {
            dfj $$4 = this.a_($$3);
            if ($$4.a(csw.gY)) {
               this.a($$4, $$3, $$1, $$0, false);
            } else if ($$4.g(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(csw.gY)) {
                  this.a($$4, $$3, $$1, $$0, false);
               }
            }
         }
      }
   }

   @Override
   public bgw d_(gw $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.A($$0)) {
         $$2 = this.an();
         $$1 = this.l($$0).u();
      }

      return new bgw(this.ai(), this.W(), $$1, $$2);
   }

   @Override
   public int A_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public dha B_() {
      return this.G;
   }

   public void a(vd<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public dis C_() {
      return this.E.a();
   }

   public aev<dis> aa() {
      return this.D;
   }

   public he<dis> ab() {
      return this.E;
   }

   public aev<cpv> ac() {
      return this.I;
   }

   @Override
   public asc D_() {
      return this.z;
   }

   @Override
   public boolean a(gw $$0, Predicate<dfj> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(gw $$0, Predicate<eam> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract cml q();

   public gw a(int $$0, int $$1, int $$2, int $$3) {
      this.t = this.t * 3 + 1013904223;
      int $$4 = this.t >> 2;
      return new gw($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean r() {
      return false;
   }

   public bdp ad() {
      return this.F.get();
   }

   public Supplier<bdp> ae() {
      return this.F;
   }

   @Override
   public cqv E_() {
      return this.H;
   }

   public final boolean af() {
      return this.d;
   }

   protected abstract djj<biq> E();

   @Override
   public long F_() {
      return this.L++;
   }

   @Override
   public hr G_() {
      return this.J;
   }

   public bhp ag() {
      return this.K;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
