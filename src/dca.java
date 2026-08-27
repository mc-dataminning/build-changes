import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public abstract class dca implements dcb, AutoCloseable {
   public static final Codec<aks<dca>> g = aks.a(li.aS);
   public static final aks<dca> h = aks.a(li.aS, new akt("overworld"));
   public static final aks<dca> i = aks.a(li.aS, new akt("the_nether"));
   public static final aks<dca> j = aks.a(li.aS, new akt("the_end"));
   public static final aks<dca> k = aks.a(li.aS, new akt("potato"));
   public static final int l = 30000000;
   public static final int m = 512;
   public static final int n = 32;
   public static final int o = 15;
   public static final int p = 24000;
   public static final int q = 20000000;
   public static final int r = -20000000;
   protected final List<drz> s = Lists.newArrayList();
   protected final eqi t;
   private final List<drz> a = Lists.newArrayList();
   private boolean b;
   private final Thread c;
   private final boolean d;
   private int e;
   protected int u = ayt.a().f();
   protected final int v = 1013904223;
   protected float w;
   protected float x;
   protected float y;
   protected float z;
   public final ayt A = ayt.a();
   @Deprecated
   private final ayt f = ayt.b();
   private final ja<dwu> E;
   protected final erm B;
   private final Supplier<bmo> F;
   public final boolean C;
   private final dut G;
   private final ddb H;
   private final aks<dca> I;
   private final jo J;
   private final bqu K;
   private long L;
   private final boolean M;

   protected dca(erm $$0, aks<dca> $$1, jo $$2, ja<dwu> $$3, Supplier<bmo> $$4, boolean $$5, boolean $$6, long $$7, int $$8) {
      this.F = $$4;
      this.B = $$0;
      this.E = $$3;
      final dwu $$9 = $$3.a();
      this.I = $$1;
      this.C = $$5;
      if ($$9.k() != 1.0) {
         this.G = new dut() {
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
         this.G = new dut();
      }

      this.c = Thread.currentThread();
      this.H = new ddb(this, $$7);
      this.d = $$6;
      this.t = new eqg(this, $$8);
      this.J = $$2;
      this.K = new bqu($$2);
      this.M = $$1 == k;
   }

   @Override
   public boolean x_() {
      return this.C;
   }

   @Nullable
   @Override
   public MinecraftServer o() {
      return null;
   }

   public boolean k(ir $$0) {
      return !this.s($$0) && g($$0);
   }

   public static boolean l(ir $$0) {
      return !b($$0.v()) && g($$0);
   }

   private static boolean g(ir $$0) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000;
   }

   private static boolean b(int $$0) {
      return $$0 < -20000000 || $$0 >= 20000000;
   }

   public dvi m(ir $$0) {
      return this.c(jt.a($$0.u()), jt.a($$0.w()));
   }

   public dvi c(int $$0, int $$1) {
      return (dvi)this.a($$0, $$1, dvx.n);
   }

   @Nullable
   @Override
   public duy a(int $$0, int $$1, dvx $$2, boolean $$3) {
      duy $$4 = this.N().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(ir $$0, dtc $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(ir $$0, dtc $$1, int $$2, int $$3) {
      if (this.s($$0)) {
         return false;
      } else if (!this.C && this.ai()) {
         return false;
      } else {
         dvi $$4 = this.m($$0);
         dfc $$5 = $$1.b();
         dtc $$6 = $$4.a($$0, $$1, ($$2 & 64) != 0);
         if ($$6 == null) {
            return false;
         } else {
            dtc $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.C || ($$2 & 4) == 0) && (this.C || $$4.E() != null && $$4.E().a(aqm.c))) {
                  this.a($$0, $$6, $$1, $$2);
               }

               if (($$2 & 1) != 0) {
                  this.b($$0, $$6.b());
                  if (!this.C && $$1.n()) {
                     this.c($$0, $$5);
                  }
               }

               if (($$2 & 16) == 0 && $$3 > 0) {
                  int $$8 = $$2 & -34;
                  $$6.b(this, $$0, $$8, $$3 - 1);
                  $$1.a((dcb)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(ir $$0, dtc $$1, dtc $$2) {
   }

   @Override
   public boolean a(ir $$0, boolean $$1) {
      epe $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(ir $$0, boolean $$1, @Nullable brv $$2, int $$3) {
      dtc $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         epe $$5 = this.b_($$0);
         if (!($$4.b() instanceof deo)) {
            this.c(2001, $$0, dfc.i($$4));
         }

         if ($$1) {
            dqc $$6 = $$4.t() ? this.c_($$0) : null;
            dfc.a($$4, this, $$0, $$6, $$2, cuh.i);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(dxv.f, $$0, dxv.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(ir $$0, dtc $$1) {
   }

   public boolean b(ir $$0, dtc $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(ir var1, dtc var2, dtc var3, int var4);

   public void b(ir $$0, dtc $$1, dtc $$2) {
   }

   public void a(ir $$0, dfc $$1) {
   }

   public void a(ir $$0, dfc $$1, iw $$2) {
   }

   public void a(ir $$0, dfc $$1, ir $$2) {
   }

   public void a(dtc $$0, ir $$1, dfc $$2, ir $$3, boolean $$4) {
   }

   @Override
   public void a(iw $$0, dtc $$1, ir $$2, ir $$3, int $$4, int $$5) {
      this.t.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int a(dyu.a $$0, int $$1, int $$2) {
      int $$4;
      if ($$1 >= -30000000 && $$2 >= -30000000 && $$1 < 30000000 && $$2 < 30000000) {
         if (this.b(jt.a($$1), jt.a($$2))) {
            $$4 = this.c(jt.a($$1), jt.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
         } else {
            $$4 = this.J_();
         }
      } else {
         $$4 = this.A_() + 1;
      }

      return $$4;
   }

   @Override
   public eot y_() {
      return this.N().p();
   }

   @Override
   public dtc a_(ir $$0) {
      if (this.s($$0)) {
         return dfe.nZ.n();
      } else {
         dvi $$1 = this.c(jt.a($$0.u()), jt.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public epe b_(ir $$0) {
      if (this.s($$0)) {
         return epf.a.g();
      } else {
         dvi $$1 = this.m($$0);
         return $$1.b_($$0);
      }
   }

   public boolean R() {
      return !this.E_().a() && this.e < 4;
   }

   public boolean S() {
      return !this.E_().a() && !this.R();
   }

   public void a(@Nullable brv $$0, ir $$1, avn $$2, avq $$3, float $$4, float $$5) {
      this.a($$0 instanceof cly $$6 ? $$6 : null, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(@Nullable cly $$0, ir $$1, avn $$2, avq $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable cly var1, double var2, double var4, double var6, ja<avn> var8, avq var9, float var10, float var11, long var12);

   public void a(@Nullable cly $$0, double $$1, double $$2, double $$3, avn $$4, avq $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, lh.b.e($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable cly var1, brv var2, ja<avn> var3, avq var4, float var5, float var6, long var7);

   public void a(@Nullable cly $$0, double $$1, double $$2, double $$3, avn $$4, avq $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 1.0F, 1.0F);
   }

   public void a(@Nullable cly $$0, double $$1, double $$2, double $$3, avn $$4, avq $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable cly $$0, brv $$1, avn $$2, avq $$3, float $$4, float $$5) {
      this.a($$0, $$1, lh.b.e($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(ir $$0, avn $$1, avq $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(brv $$0, avn $$1, avq $$2, float $$3, float $$4) {
   }

   public void a(double $$0, double $$1, double $$2, avn $$3, avq $$4, float $$5, float $$6, boolean $$7) {
   }

   @Override
   public void a(kz $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(kz $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public void b(kz $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void b(kz $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public float a(float $$0) {
      float $$1 = this.f($$0);
      return $$1 * (float) (Math.PI * 2);
   }

   public void a(drz $$0) {
      (this.b ? this.a : this.s).add($$0);
   }

   protected void T() {
      bmo $$0 = this.ag();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.s.addAll(this.a);
         this.a.clear();
      }

      Iterator<drz> $$1 = this.s.iterator();
      boolean $$2 = this.s().i();

      while ($$1.hasNext()) {
         drz $$3 = $$1.next();
         if ($$3.b()) {
            $$1.remove();
         } else if ($$2 && this.n($$3.c())) {
            $$3.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends brv> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Ticking entity");
         p $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new z($$3);
      }
   }

   public boolean h(brv $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean n(ir $$0) {
      return this.a(dbh.a($$0));
   }

   @Override
   public boolean z_() {
      return this.M;
   }

   public abstract void a(int var1, double var2, double var4, double var6, avn var8, avq var9, float var10, float var11);

   public abstract void a(double var1, double var3, double var5, Consumer<avp> var7);

   public cpa a(coz $$0) {
      return new cpa(this, $$0);
   }

   @Nullable
   public abstract cpa b(UUID var1);

   public dbs a(@Nullable brv $$0, double $$1, double $$2, double $$3, float $$4, dca.a $$5) {
      return this.a($$0, dbs.a(this, $$0), null, $$1, $$2, $$3, $$4, false, $$5, lb.w, lb.v, avo.kr);
   }

   public dbs a(@Nullable brv $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, dca.a $$6) {
      return this.a($$0, dbs.a(this, $$0), null, $$1, $$2, $$3, $$4, $$5, $$6, lb.w, lb.v, avo.kr);
   }

   public dbs a(@Nullable brv $$0, @Nullable bqt $$1, @Nullable dbt $$2, ewu $$3, float $$4, boolean $$5, dca.a $$6) {
      return this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6, lb.w, lb.v, avo.kr);
   }

   public dbs a(@Nullable brv $$0, @Nullable bqt $$1, @Nullable dbt $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, dca.a $$8) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, lb.w, lb.v, avo.kr);
   }

   public dbs a(
      @Nullable brv $$0,
      @Nullable bqt $$1,
      @Nullable dbt $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dca.a $$8,
      kz $$9,
      kz $$10,
      ja<avn> $$11
   ) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, true, $$9, $$10, $$11);
   }

   public dbs a(
      @Nullable brv $$0,
      @Nullable bqt $$1,
      @Nullable dbt $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dca.a $$8,
      boolean $$9,
      kz $$10,
      kz $$11,
      ja<avn> $$12
   ) {
      dbs.a $$13 = switch ($$8) {
         case a -> dbs.a.a;
         case b -> this.a(dbw.R);
         case c -> this.ab().b(dbw.c) ? this.a(dbw.S) : dbs.a.a;
         case d -> this.a(dbw.T);
         case e -> dbs.a.d;
      };
      dbs $$14 = new dbs(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$13, $$10, $$11, $$12);
      $$14.c();
      $$14.a($$9);
      return $$14;
   }

   private dbs.a a(dbw.e<dbw.a> $$0) {
      return this.ab().b($$0) ? dbs.a.c : dbs.a.b;
   }

   public abstract String J();

   @Nullable
   @Override
   public dqc c_(ir $$0) {
      if (this.s($$0)) {
         return null;
      } else {
         return !this.C && Thread.currentThread() != this.c ? null : this.m($$0).a($$0, dvi.b.a);
      }
   }

   public void a(dqc $$0) {
      ir $$1 = $$0.az_();
      if (!this.s($$1)) {
         this.m($$1).b($$0);
      }
   }

   public void o(ir $$0) {
      if (!this.s($$0)) {
         this.m($$0).d($$0);
      }
   }

   public boolean p(ir $$0) {
      return this.s($$0) ? false : this.N().b(jt.a($$0.u()), jt.a($$0.w()));
   }

   public boolean a(ir $$0, brv $$1, iw $$2) {
      if (this.s($$0)) {
         return false;
      } else {
         duy $$3 = this.a(jt.a($$0.u()), jt.a($$0.w()), dvx.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(ir $$0, brv $$1) {
      return this.a($$0, $$1, iw.b);
   }

   public void U() {
      double $$0 = 1.0 - (double)(this.d(1.0F) * 5.0F) / 16.0;
      double $$1 = 1.0 - (double)(this.b(1.0F) * 5.0F) / 16.0;
      double $$2 = 0.5 + 2.0 * aym.a((double)aym.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void b(boolean $$0, boolean $$1) {
      this.N().a($$0, $$1);
   }

   public ir V() {
      ir $$0 = this.B.a();
      if (!this.D_().a($$0)) {
         $$0 = this.a(dyu.a.e, ir.a(this.D_().a(), 0.0, this.D_().b()));
      }

      return $$0;
   }

   public float W() {
      return this.B.b();
   }

   protected void X() {
      if (this.B.i()) {
         this.x = 1.0F;
         if (this.B.g()) {
            this.z = 1.0F;
         }
      }
   }

   @Override
   public void close() throws IOException {
      this.N().close();
   }

   @Nullable
   @Override
   public dbg a(int $$0, int $$1) {
      return this.a($$0, $$1, dvx.n, false);
   }

   @Override
   public List<brv> a(@Nullable brv $$0, ewp $$1, Predicate<? super brv> $$2) {
      this.ag().d("getEntities");
      List<brv> $$3 = Lists.newArrayList();
      this.G().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }

         if ($$3x instanceof cha) {
            for (cgy $$4 : ((cha)$$3x).gu()) {
               if ($$3x != $$0 && $$2.test($$4)) {
                  $$3.add($$4);
               }
            }
         }
      });
      return $$3;
   }

   @Override
   public <T extends brv> List<T> a(dxj<brv, T> $$0, ewp $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends brv> void a(dxj<brv, T> $$0, ewp $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends brv> void a(dxj<brv, T> $$0, ewp $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      this.ag().d("getEntities");
      this.G().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return awz.a.b;
            }
         }

         if ($$4x instanceof cha $$5) {
            for (cgy $$6 : $$5.gu()) {
               T $$7 = $$0.a($$6);
               if ($$7 != null && $$2.test($$7)) {
                  $$3.add($$7);
                  if ($$3.size() >= $$4) {
                     return awz.a.b;
                  }
               }
            }
         }

         return awz.a.a;
      });
   }

   @Nullable
   public abstract brv a(int var1);

   public void q(ir $$0) {
      if (this.B($$0)) {
         this.m($$0).a(true);
      }
   }

   @Override
   public int A_() {
      return 63;
   }

   public void Y() {
   }

   public long Z() {
      return this.B.c();
   }

   public long aa() {
      return this.B.d();
   }

   public boolean a(cly $$0, ir $$1) {
      return true;
   }

   public void a(brv $$0, byte $$1) {
   }

   public void a(brv $$0, bqt $$1) {
   }

   public void a(ir $$0, dfc $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public erb B_() {
      return this.B;
   }

   public dbw ab() {
      return this.B.o();
   }

   public abstract bql s();

   public float b(float $$0) {
      return aym.i($$0, this.y, this.z) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = aym.a($$0, 0.0F, 1.0F);
      this.y = $$1;
      this.z = $$1;
   }

   public float a(float $$0, double $$1) {
      return this.c(this.d($$0), $$1);
   }

   public float b(float $$0, double $$1) {
      return this.c(this.b($$0), $$1);
   }

   private float c(float $$0, double $$1) {
      return $$0 > 0.0F && this.z_() && $$1 > 112.0 ? Math.max(0.0F, $$0 - ((float)$$1 - 112.0F) * 0.1F) : $$0;
   }

   public float d(float $$0) {
      return aym.i($$0, this.w, this.x);
   }

   public void e(float $$0) {
      float $$1 = aym.a($$0, 0.0F, 1.0F);
      this.w = $$1;
      this.x = $$1;
   }

   public boolean ac() {
      return this.E_().g() && !this.E_().h() ? (double)this.b(1.0F) > 0.9 : false;
   }

   public boolean ad() {
      return (double)this.d(1.0F) > 0.2;
   }

   public boolean r(ir $$0) {
      if (!this.ad()) {
         return false;
      } else if (!this.h($$0)) {
         return false;
      } else if (this.a(dyu.a.e, $$0).v() > $$0.v()) {
         return false;
      } else if (this.M && $$0.v() > 112) {
         return false;
      } else {
         dcz $$1 = this.t($$0).a();
         return $$1.a($$0) == dcz.c.b;
      }
   }

   @Nullable
   public abstract eqt a(eqr var1);

   public abstract void a(eqr var1, eqt var2);

   public abstract eqr v();

   public void b(int $$0, ir $$1, int $$2) {
   }

   public p a(o $$0) {
      p $$1 = $$0.a("Affected level", 1);
      $$1.a("All players", () -> this.x().size() + " total; " + this.x());
      $$1.a("Chunk stats", this.N()::e);
      $$1.a("Level dimension", () -> this.af().a().toString());

      try {
         this.B.a($$1, this);
      } catch (Throwable var4) {
         $$1.a("Level Data Unobtainable", var4);
      }

      return $$1;
   }

   public abstract void a(int var1, ir var2, int var3);

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<cxj> $$6) {
   }

   public abstract exy M();

   public void c(ir $$0, dfc $$1) {
      for (iw $$2 : iw.c.a) {
         ir $$3 = $$0.a($$2);
         if (this.B($$3)) {
            dtc $$4 = this.a_($$3);
            if ($$4.a(dfe.hS)) {
               this.a($$4, $$3, $$1, $$0, false);
            } else if ($$4.g(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(dfe.hS)) {
                  this.a($$4, $$3, $$1, $$0, false);
               }
            }
         }
      }
   }

   @Override
   public bpy d_(ir $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.B($$0)) {
         $$2 = this.aq();
         $$1 = this.m($$0).v();
      }

      return new bpy(this.al(), this.aa(), $$1, $$2);
   }

   @Override
   public int C_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public dut D_() {
      return this.G;
   }

   public void a(zl<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public dwu E_() {
      return this.E.a();
   }

   public ja<dwu> ae() {
      return this.E;
   }

   public aks<dca> af() {
      return this.I;
   }

   @Override
   public ayt F_() {
      return this.A;
   }

   @Override
   public boolean a(ir $$0, Predicate<dtc> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(ir $$0, Predicate<epe> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract czd r();

   public ir a(int $$0, int $$1, int $$2, int $$3) {
      this.u = this.u * 3 + 1013904223;
      int $$4 = this.u >> 2;
      return new ir($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean t() {
      return false;
   }

   public bmo ag() {
      return this.F.get();
   }

   public Supplier<bmo> ah() {
      return this.F;
   }

   @Override
   public ddb G_() {
      return this.H;
   }

   public final boolean ai() {
      return this.d;
   }

   protected abstract dxl<brv> G();

   public abstract Iterable<? extends cpa> H();

   @Override
   public long H_() {
      return this.L++;
   }

   @Override
   public jo I_() {
      return this.J;
   }

   public bqu aj() {
      return this.K;
   }

   @Override
   public boolean a(@Nullable brv $$0, ewp $$1, boolean $$2) {
      if (!dcb.super.a($$0, $$1, $$2)) {
         return false;
      } else {
         if (!$$2) {
            for (cpa $$3 : this.H()) {
               ewp $$4 = $$3.h();
               if (!$$3.b($$0, $$1.d(-$$4.a, -$$4.b, -$$4.c))) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }
}
