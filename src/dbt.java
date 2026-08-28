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

public abstract class dbt implements dbu, AutoCloseable {
   public static final Codec<ala<dbt>> g = ala.a(lq.aS);
   public static final ala<dbt> h = ala.a(lq.aS, new alb("overworld"));
   public static final ala<dbt> i = ala.a(lq.aS, new alb("the_nether"));
   public static final ala<dbt> j = ala.a(lq.aS, new alb("the_end"));
   public static final int k = 30000000;
   public static final int l = 512;
   public static final int m = 32;
   public static final int n = 15;
   public static final int o = 24000;
   public static final int p = 20000000;
   public static final int q = -20000000;
   protected final List<dqu> r = Lists.newArrayList();
   protected final eou s;
   private final List<dqu> a = Lists.newArrayList();
   private boolean b;
   private final Thread c;
   private final boolean d;
   private int e;
   protected int t = azc.a().f();
   protected final int u = 1013904223;
   protected float v;
   protected float w;
   protected float x;
   protected float y;
   public final azc z = azc.a();
   @Deprecated
   private final azc f = azc.b();
   private final ji<dvp> D;
   protected final epy A;
   private final Supplier<bnd> E;
   public final boolean B;
   private final dto F;
   private final dcu G;
   private final ala<dbt> H;
   private final jw I;
   private final brj J;
   private long K;

   protected dbt(epy $$0, ala<dbt> $$1, jw $$2, ji<dvp> $$3, Supplier<bnd> $$4, boolean $$5, boolean $$6, long $$7, int $$8) {
      this.E = $$4;
      this.A = $$0;
      this.D = $$3;
      final dvp $$9 = $$3.a();
      this.H = $$1;
      this.B = $$5;
      if ($$9.k() != 1.0) {
         this.F = new dto() {
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
         this.F = new dto();
      }

      this.c = Thread.currentThread();
      this.G = new dcu(this, $$7);
      this.d = $$6;
      this.s = new eos(this, $$8);
      this.I = $$2;
      this.J = new brj($$2);
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

   public boolean k(iz $$0) {
      return !this.s($$0) && g($$0);
   }

   public static boolean l(iz $$0) {
      return !b($$0.v()) && g($$0);
   }

   private static boolean g(iz $$0) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000;
   }

   private static boolean b(int $$0) {
      return $$0 < -20000000 || $$0 >= 20000000;
   }

   public dud m(iz $$0) {
      return this.d(kb.a($$0.u()), kb.a($$0.w()));
   }

   public dud d(int $$0, int $$1) {
      return (dud)this.a($$0, $$1, dus.n);
   }

   @Nullable
   @Override
   public dtt a(int $$0, int $$1, dus $$2, boolean $$3) {
      dtt $$4 = this.N().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(iz $$0, drx $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(iz $$0, drx $$1, int $$2, int $$3) {
      if (this.s($$0)) {
         return false;
      } else if (!this.B && this.ai()) {
         return false;
      } else {
         dud $$4 = this.m($$0);
         deu $$5 = $$1.b();
         drx $$6 = $$4.a($$0, $$1, ($$2 & 64) != 0);
         if ($$6 == null) {
            return false;
         } else {
            drx $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.B || ($$2 & 4) == 0) && (this.B || $$4.D() != null && $$4.D().a(aqu.c))) {
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
                  $$1.a((dbu)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(iz $$0, drx $$1, drx $$2) {
   }

   @Override
   public boolean a(iz $$0, boolean $$1) {
      enq $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(iz $$0, boolean $$1, @Nullable bsp $$2, int $$3) {
      drx $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         enq $$5 = this.b_($$0);
         if (!($$4.b() instanceof deh)) {
            this.c(2001, $$0, deu.i($$4));
         }

         if ($$1) {
            dpc $$6 = $$4.t() ? this.c_($$0) : null;
            deu.a($$4, this, $$0, $$6, $$2, cuk.l);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(dwq.f, $$0, dwq.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(iz $$0, drx $$1) {
   }

   public boolean b(iz $$0, drx $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(iz var1, drx var2, drx var3, int var4);

   public void b(iz $$0, drx $$1, drx $$2) {
   }

   public void a(iz $$0, deu $$1) {
   }

   public void a(iz $$0, deu $$1, je $$2) {
   }

   public void a(iz $$0, deu $$1, iz $$2) {
   }

   public void a(drx $$0, iz $$1, deu $$2, iz $$3, boolean $$4) {
   }

   @Override
   public void a(je $$0, drx $$1, iz $$2, iz $$3, int $$4, int $$5) {
      this.s.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int a(dxp.a $$0, int $$1, int $$2) {
      int $$4;
      if ($$1 >= -30000000 && $$2 >= -30000000 && $$1 < 30000000 && $$2 < 30000000) {
         if (this.b(kb.a($$1), kb.a($$2))) {
            $$4 = this.d(kb.a($$1), kb.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
         } else {
            $$4 = this.I_();
         }
      } else {
         $$4 = this.z_() + 1;
      }

      return $$4;
   }

   @Override
   public enf y_() {
      return this.N().p();
   }

   @Override
   public drx a_(iz $$0) {
      if (this.s($$0)) {
         return dew.nb.n();
      } else {
         dud $$1 = this.d(kb.a($$0.u()), kb.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public enq b_(iz $$0) {
      if (this.s($$0)) {
         return enr.a.g();
      } else {
         dud $$1 = this.m($$0);
         return $$1.b_($$0);
      }
   }

   public boolean R() {
      return !this.D_().a() && this.e < 4;
   }

   public boolean S() {
      return !this.D_().a() && !this.R();
   }

   public void a(@Nullable bsp $$0, iz $$1, avv $$2, avx $$3, float $$4, float $$5) {
      this.a($$0 instanceof cms $$6 ? $$6 : null, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(@Nullable cms $$0, iz $$1, avv $$2, avx $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable cms var1, double var2, double var4, double var6, ji<avv> var8, avx var9, float var10, float var11, long var12);

   public void a(@Nullable cms $$0, double $$1, double $$2, double $$3, avv $$4, avx $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, lp.b.e($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable cms var1, bsp var2, ji<avv> var3, avx var4, float var5, float var6, long var7);

   public void a(@Nullable cms $$0, double $$1, double $$2, double $$3, avv $$4, avx $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 1.0F, 1.0F);
   }

   public void a(@Nullable cms $$0, double $$1, double $$2, double $$3, avv $$4, avx $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable cms $$0, bsp $$1, avv $$2, avx $$3, float $$4, float $$5) {
      this.a($$0, $$1, lp.b.e($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(iz $$0, avv $$1, avx $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(bsp $$0, avv $$1, avx $$2, float $$3, float $$4) {
   }

   public void a(double $$0, double $$1, double $$2, avv $$3, avx $$4, float $$5, float $$6, boolean $$7) {
   }

   @Override
   public void a(lh $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(lh $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public void b(lh $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void b(lh $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public float a(float $$0) {
      float $$1 = this.f($$0);
      return $$1 * (float) (Math.PI * 2);
   }

   public void a(dqu $$0) {
      (this.b ? this.a : this.r).add($$0);
   }

   protected void T() {
      bnd $$0 = this.ag();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.r.addAll(this.a);
         this.a.clear();
      }

      Iterator<dqu> $$1 = this.r.iterator();
      boolean $$2 = this.s().i();

      while ($$1.hasNext()) {
         dqu $$3 = $$1.next();
         if ($$3.b()) {
            $$1.remove();
         } else if ($$2 && this.n($$3.c())) {
            $$3.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends bsp> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Ticking entity");
         p $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new y($$3);
      }
   }

   public boolean h(bsp $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean n(iz $$0) {
      return this.a(dba.a($$0));
   }

   public dbl a(@Nullable bsp $$0, double $$1, double $$2, double $$3, float $$4, dbt.a $$5) {
      return this.a($$0, dbl.a(this, $$0), null, $$1, $$2, $$3, $$4, false, $$5, lj.w, lj.v, avw.ke);
   }

   public dbl a(@Nullable bsp $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, dbt.a $$6) {
      return this.a($$0, dbl.a(this, $$0), null, $$1, $$2, $$3, $$4, $$5, $$6, lj.w, lj.v, avw.ke);
   }

   public dbl a(@Nullable bsp $$0, @Nullable bri $$1, @Nullable dbm $$2, evm $$3, float $$4, boolean $$5, dbt.a $$6) {
      return this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6, lj.w, lj.v, avw.ke);
   }

   public dbl a(@Nullable bsp $$0, @Nullable bri $$1, @Nullable dbm $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, dbt.a $$8) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, lj.w, lj.v, avw.ke);
   }

   public dbl a(
      @Nullable bsp $$0,
      @Nullable bri $$1,
      @Nullable dbm $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dbt.a $$8,
      lh $$9,
      lh $$10,
      ji<avv> $$11
   ) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, true, $$9, $$10, $$11);
   }

   public dbl a(
      @Nullable bsp $$0,
      @Nullable bri $$1,
      @Nullable dbm $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dbt.a $$8,
      boolean $$9,
      lh $$10,
      lh $$11,
      ji<avv> $$12
   ) {
      dbl.a $$13 = switch ($$8) {
         case a -> dbl.a.a;
         case b -> this.a(dbp.Q);
         case c -> this.ab().b(dbp.c) ? this.a(dbp.R) : dbl.a.a;
         case d -> this.a(dbp.S);
         case e -> dbl.a.d;
      };
      dbl $$14 = new dbl(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$13, $$10, $$11, $$12);
      $$14.c();
      $$14.a($$9);
      return $$14;
   }

   private dbl.a a(dbp.e<dbp.a> $$0) {
      return this.ab().b($$0) ? dbl.a.c : dbl.a.b;
   }

   public abstract String I();

   @Nullable
   @Override
   public dpc c_(iz $$0) {
      if (this.s($$0)) {
         return null;
      } else {
         return !this.B && Thread.currentThread() != this.c ? null : this.m($$0).a($$0, dud.b.a);
      }
   }

   public void a(dpc $$0) {
      iz $$1 = $$0.aA_();
      if (!this.s($$1)) {
         this.m($$1).b($$0);
      }
   }

   public void o(iz $$0) {
      if (!this.s($$0)) {
         this.m($$0).d($$0);
      }
   }

   public boolean p(iz $$0) {
      return this.s($$0) ? false : this.N().b(kb.a($$0.u()), kb.a($$0.w()));
   }

   public boolean a(iz $$0, bsp $$1, je $$2) {
      if (this.s($$0)) {
         return false;
      } else {
         dtt $$3 = this.a(kb.a($$0.u()), kb.a($$0.w()), dus.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(iz $$0, bsp $$1) {
      return this.a($$0, $$1, je.b);
   }

   public void U() {
      double $$0 = 1.0 - (double)(this.d(1.0F) * 5.0F) / 16.0;
      double $$1 = 1.0 - (double)(this.b(1.0F) * 5.0F) / 16.0;
      double $$2 = 0.5 + 2.0 * ayu.a((double)ayu.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void b(boolean $$0, boolean $$1) {
      this.N().a($$0, $$1);
   }

   public iz V() {
      iz $$0 = this.A.a();
      if (!this.C_().a($$0)) {
         $$0 = this.a(dxp.a.e, iz.a(this.C_().a(), 0.0, this.C_().b()));
      }

      return $$0;
   }

   public float W() {
      return this.A.b();
   }

   protected void X() {
      if (this.A.i()) {
         this.w = 1.0F;
         if (this.A.g()) {
            this.y = 1.0F;
         }
      }
   }

   @Override
   public void close() throws IOException {
      this.N().close();
   }

   @Nullable
   @Override
   public daz c(int $$0, int $$1) {
      return this.a($$0, $$1, dus.n, false);
   }

   @Override
   public List<bsp> a(@Nullable bsp $$0, evh $$1, Predicate<? super bsp> $$2) {
      this.ag().d("getEntities");
      List<bsp> $$3 = Lists.newArrayList();
      this.G().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }

         if ($$3x instanceof chw) {
            for (chu $$4 : ((chw)$$3x).gm()) {
               if ($$3x != $$0 && $$2.test($$4)) {
                  $$3.add($$4);
               }
            }
         }
      });
      return $$3;
   }

   @Override
   public <T extends bsp> List<T> a(dwe<bsp, T> $$0, evh $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends bsp> void a(dwe<bsp, T> $$0, evh $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends bsp> void a(dwe<bsp, T> $$0, evh $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      this.ag().d("getEntities");
      this.G().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return axh.a.b;
            }
         }

         if ($$4x instanceof chw $$5) {
            for (chu $$6 : $$5.gm()) {
               T $$7 = $$0.a($$6);
               if ($$7 != null && $$2.test($$7)) {
                  $$3.add($$7);
                  if ($$3.size() >= $$4) {
                     return axh.a.b;
                  }
               }
            }
         }

         return axh.a.a;
      });
   }

   @Nullable
   public abstract bsp a(int var1);

   public void q(iz $$0) {
      if (this.B($$0)) {
         this.m($$0).a(true);
      }
   }

   @Override
   public int z_() {
      return 63;
   }

   public void Y() {
   }

   public long Z() {
      return this.A.c();
   }

   public long aa() {
      return this.A.d();
   }

   public boolean a(cms $$0, iz $$1) {
      return true;
   }

   public void a(bsp $$0, byte $$1) {
   }

   public void a(bsp $$0, bri $$1) {
   }

   public void a(iz $$0, deu $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public epn A_() {
      return this.A;
   }

   public dbp ab() {
      return this.A.o();
   }

   public abstract bra s();

   public float b(float $$0) {
      return ayu.i($$0, this.x, this.y) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = ayu.a($$0, 0.0F, 1.0F);
      this.x = $$1;
      this.y = $$1;
   }

   public float d(float $$0) {
      return ayu.i($$0, this.v, this.w);
   }

   public void e(float $$0) {
      float $$1 = ayu.a($$0, 0.0F, 1.0F);
      this.v = $$1;
      this.w = $$1;
   }

   public boolean ac() {
      return this.D_().g() && !this.D_().h() ? (double)this.b(1.0F) > 0.9 : false;
   }

   public boolean ad() {
      return (double)this.d(1.0F) > 0.2;
   }

   public boolean r(iz $$0) {
      if (!this.ad()) {
         return false;
      } else if (!this.h($$0)) {
         return false;
      } else if (this.a(dxp.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         dcs $$1 = this.t($$0).a();
         return $$1.a($$0) == dcs.c.b;
      }
   }

   @Nullable
   public abstract epf a(epd var1);

   public abstract void a(epd var1, epf var2);

   public abstract epd v();

   public void b(int $$0, iz $$1, int $$2) {
   }

   public p a(o $$0) {
      p $$1 = $$0.a("Affected level", 1);
      $$1.a("All players", () -> this.x().size() + " total; " + this.x());
      $$1.a("Chunk stats", this.N()::e);
      $$1.a("Level dimension", () -> this.af().a().toString());

      try {
         this.A.a($$1, this);
      } catch (Throwable var4) {
         $$1.a("Level Data Unobtainable", var4);
      }

      return $$1;
   }

   public abstract void a(int var1, iz var2, int var3);

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<cxd> $$6) {
   }

   public abstract ewq M();

   public void c(iz $$0, deu $$1) {
      for (je $$2 : je.c.a) {
         iz $$3 = $$0.a($$2);
         if (this.B($$3)) {
            drx $$4 = this.a_($$3);
            if ($$4.a(dew.gY)) {
               this.a($$4, $$3, $$1, $$0, false);
            } else if ($$4.g(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(dew.gY)) {
                  this.a($$4, $$3, $$1, $$0, false);
               }
            }
         }
      }
   }

   @Override
   public bqn d_(iz $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.B($$0)) {
         $$2 = this.aq();
         $$1 = this.m($$0).u();
      }

      return new bqn(this.al(), this.aa(), $$1, $$2);
   }

   @Override
   public int B_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public dto C_() {
      return this.F;
   }

   public void a(zs<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public dvp D_() {
      return this.D.a();
   }

   public ji<dvp> ae() {
      return this.D;
   }

   public ala<dbt> af() {
      return this.H;
   }

   @Override
   public azc E_() {
      return this.z;
   }

   @Override
   public boolean a(iz $$0, Predicate<drx> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(iz $$0, Predicate<enq> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract cyt r();

   public iz a(int $$0, int $$1, int $$2, int $$3) {
      this.t = this.t * 3 + 1013904223;
      int $$4 = this.t >> 2;
      return new iz($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean t() {
      return false;
   }

   public bnd ag() {
      return this.E.get();
   }

   public Supplier<bnd> ah() {
      return this.E;
   }

   @Override
   public dcu F_() {
      return this.G;
   }

   public final boolean ai() {
      return this.d;
   }

   protected abstract dwg<bsp> G();

   @Override
   public long G_() {
      return this.K++;
   }

   @Override
   public jw H_() {
      return this.I;
   }

   public brj aj() {
      return this.J;
   }

   public abstract cwk K();

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }
}
