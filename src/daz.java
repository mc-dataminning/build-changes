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

public abstract class daz implements dba, AutoCloseable {
   public static final Codec<akm<daz>> g = akm.a(lf.aS);
   public static final akm<daz> h = akm.a(lf.aS, new akn("overworld"));
   public static final akm<daz> i = akm.a(lf.aS, new akn("the_nether"));
   public static final akm<daz> j = akm.a(lf.aS, new akn("the_end"));
   public static final int k = 30000000;
   public static final int l = 512;
   public static final int m = 32;
   public static final int n = 15;
   public static final int o = 24000;
   public static final int p = 20000000;
   public static final int q = -20000000;
   protected final List<dqa> r = Lists.newArrayList();
   protected final eoa s;
   private final List<dqa> a = Lists.newArrayList();
   private boolean b;
   private final Thread c;
   private final boolean d;
   private int e;
   protected int t = aym.a().f();
   protected final int u = 1013904223;
   protected float v;
   protected float w;
   protected float x;
   protected float y;
   public final aym z = aym.a();
   @Deprecated
   private final aym f = aym.b();
   private final ix<duv> D;
   protected final epe A;
   private final Supplier<bmk> E;
   public final boolean B;
   private final dsu F;
   private final dca G;
   private final akm<daz> H;
   private final jl I;
   private final bqq J;
   private long K;

   protected daz(epe $$0, akm<daz> $$1, jl $$2, ix<duv> $$3, Supplier<bmk> $$4, boolean $$5, boolean $$6, long $$7, int $$8) {
      this.E = $$4;
      this.A = $$0;
      this.D = $$3;
      final duv $$9 = $$3.a();
      this.H = $$1;
      this.B = $$5;
      if ($$9.k() != 1.0) {
         this.F = new dsu() {
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
         this.F = new dsu();
      }

      this.c = Thread.currentThread();
      this.G = new dca(this, $$7);
      this.d = $$6;
      this.s = new eny(this, $$8);
      this.I = $$2;
      this.J = new bqq($$2);
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

   public boolean k(io $$0) {
      return !this.s($$0) && g($$0);
   }

   public static boolean l(io $$0) {
      return !b($$0.v()) && g($$0);
   }

   private static boolean g(io $$0) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000;
   }

   private static boolean b(int $$0) {
      return $$0 < -20000000 || $$0 >= 20000000;
   }

   public dtj m(io $$0) {
      return this.d(jq.a($$0.u()), jq.a($$0.w()));
   }

   public dtj d(int $$0, int $$1) {
      return (dtj)this.a($$0, $$1, dty.n);
   }

   @Nullable
   @Override
   public dsz a(int $$0, int $$1, dty $$2, boolean $$3) {
      dsz $$4 = this.M().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(io $$0, drd $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(io $$0, drd $$1, int $$2, int $$3) {
      if (this.s($$0)) {
         return false;
      } else if (!this.B && this.ah()) {
         return false;
      } else {
         dtj $$4 = this.m($$0);
         dea $$5 = $$1.b();
         drd $$6 = $$4.a($$0, $$1, ($$2 & 64) != 0);
         if ($$6 == null) {
            return false;
         } else {
            drd $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.B || ($$2 & 4) == 0) && (this.B || $$4.D() != null && $$4.D().a(aqg.c))) {
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
                  $$1.a((dba)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(io $$0, drd $$1, drd $$2) {
   }

   @Override
   public boolean a(io $$0, boolean $$1) {
      emw $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(io $$0, boolean $$1, @Nullable brw $$2, int $$3) {
      drd $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         emw $$5 = this.b_($$0);
         if (!($$4.b() instanceof ddn)) {
            this.c(2001, $$0, dea.i($$4));
         }

         if ($$1) {
            doi $$6 = $$4.t() ? this.c_($$0) : null;
            dea.a($$4, this, $$0, $$6, $$2, ctq.i);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(dvw.f, $$0, dvw.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(io $$0, drd $$1) {
   }

   public boolean b(io $$0, drd $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(io var1, drd var2, drd var3, int var4);

   public void b(io $$0, drd $$1, drd $$2) {
   }

   public void a(io $$0, dea $$1) {
   }

   public void a(io $$0, dea $$1, it $$2) {
   }

   public void a(io $$0, dea $$1, io $$2) {
   }

   public void a(drd $$0, io $$1, dea $$2, io $$3, boolean $$4) {
   }

   @Override
   public void a(it $$0, drd $$1, io $$2, io $$3, int $$4, int $$5) {
      this.s.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int a(dwv.a $$0, int $$1, int $$2) {
      int $$4;
      if ($$1 >= -30000000 && $$2 >= -30000000 && $$1 < 30000000 && $$2 < 30000000) {
         if (this.b(jq.a($$1), jq.a($$2))) {
            $$4 = this.d(jq.a($$1), jq.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
         } else {
            $$4 = this.I_();
         }
      } else {
         $$4 = this.z_() + 1;
      }

      return $$4;
   }

   @Override
   public eml y_() {
      return this.M().p();
   }

   @Override
   public drd a_(io $$0) {
      if (this.s($$0)) {
         return dec.nb.n();
      } else {
         dtj $$1 = this.d(jq.a($$0.u()), jq.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public emw b_(io $$0) {
      if (this.s($$0)) {
         return emx.a.g();
      } else {
         dtj $$1 = this.m($$0);
         return $$1.b_($$0);
      }
   }

   public boolean Q() {
      return !this.D_().a() && this.e < 4;
   }

   public boolean R() {
      return !this.D_().a() && !this.Q();
   }

   public void a(@Nullable brw $$0, io $$1, avh $$2, avj $$3, float $$4, float $$5) {
      this.a($$0 instanceof cly $$6 ? $$6 : null, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(@Nullable cly $$0, io $$1, avh $$2, avj $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable cly var1, double var2, double var4, double var6, ix<avh> var8, avj var9, float var10, float var11, long var12);

   public void a(@Nullable cly $$0, double $$1, double $$2, double $$3, avh $$4, avj $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, le.b.e($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable cly var1, brw var2, ix<avh> var3, avj var4, float var5, float var6, long var7);

   public void a(@Nullable cly $$0, double $$1, double $$2, double $$3, avh $$4, avj $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 1.0F, 1.0F);
   }

   public void a(@Nullable cly $$0, double $$1, double $$2, double $$3, avh $$4, avj $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable cly $$0, brw $$1, avh $$2, avj $$3, float $$4, float $$5) {
      this.a($$0, $$1, le.b.e($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(io $$0, avh $$1, avj $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(brw $$0, avh $$1, avj $$2, float $$3, float $$4) {
   }

   public void a(double $$0, double $$1, double $$2, avh $$3, avj $$4, float $$5, float $$6, boolean $$7) {
   }

   @Override
   public void a(kw $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(kw $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public void b(kw $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void b(kw $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public float a(float $$0) {
      float $$1 = this.f($$0);
      return $$1 * (float) (Math.PI * 2);
   }

   public void a(dqa $$0) {
      (this.b ? this.a : this.r).add($$0);
   }

   protected void S() {
      bmk $$0 = this.af();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.r.addAll(this.a);
         this.a.clear();
      }

      Iterator<dqa> $$1 = this.r.iterator();
      boolean $$2 = this.s().i();

      while ($$1.hasNext()) {
         dqa $$3 = $$1.next();
         if ($$3.b()) {
            $$1.remove();
         } else if ($$2 && this.n($$3.c())) {
            $$3.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends brw> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Ticking entity");
         p $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new y($$3);
      }
   }

   public boolean h(brw $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean n(io $$0) {
      return this.a(dag.a($$0));
   }

   public dar a(@Nullable brw $$0, double $$1, double $$2, double $$3, float $$4, daz.a $$5) {
      return this.a($$0, dar.a(this, $$0), null, $$1, $$2, $$3, $$4, false, $$5, ky.w, ky.v, avi.ke);
   }

   public dar a(@Nullable brw $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, daz.a $$6) {
      return this.a($$0, dar.a(this, $$0), null, $$1, $$2, $$3, $$4, $$5, $$6, ky.w, ky.v, avi.ke);
   }

   public dar a(@Nullable brw $$0, @Nullable bqp $$1, @Nullable das $$2, eum $$3, float $$4, boolean $$5, daz.a $$6) {
      return this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6, ky.w, ky.v, avi.ke);
   }

   public dar a(@Nullable brw $$0, @Nullable bqp $$1, @Nullable das $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, daz.a $$8) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, ky.w, ky.v, avi.ke);
   }

   public dar a(
      @Nullable brw $$0,
      @Nullable bqp $$1,
      @Nullable das $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      daz.a $$8,
      kw $$9,
      kw $$10,
      ix<avh> $$11
   ) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, true, $$9, $$10, $$11);
   }

   public dar a(
      @Nullable brw $$0,
      @Nullable bqp $$1,
      @Nullable das $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      daz.a $$8,
      boolean $$9,
      kw $$10,
      kw $$11,
      ix<avh> $$12
   ) {
      dar.a $$13 = switch ($$8) {
         case a -> dar.a.a;
         case b -> this.a(dav.Q);
         case c -> this.aa().b(dav.c) ? this.a(dav.R) : dar.a.a;
         case d -> this.a(dav.S);
         case e -> dar.a.d;
      };
      dar $$14 = new dar(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$13, $$10, $$11, $$12);
      $$14.c();
      $$14.a($$9);
      return $$14;
   }

   private dar.a a(dav.e<dav.a> $$0) {
      return this.aa().b($$0) ? dar.a.c : dar.a.b;
   }

   public abstract String I();

   @Nullable
   @Override
   public doi c_(io $$0) {
      if (this.s($$0)) {
         return null;
      } else {
         return !this.B && Thread.currentThread() != this.c ? null : this.m($$0).a($$0, dtj.b.a);
      }
   }

   public void a(doi $$0) {
      io $$1 = $$0.aA_();
      if (!this.s($$1)) {
         this.m($$1).b($$0);
      }
   }

   public void o(io $$0) {
      if (!this.s($$0)) {
         this.m($$0).d($$0);
      }
   }

   public boolean p(io $$0) {
      return this.s($$0) ? false : this.M().b(jq.a($$0.u()), jq.a($$0.w()));
   }

   public boolean a(io $$0, brw $$1, it $$2) {
      if (this.s($$0)) {
         return false;
      } else {
         dsz $$3 = this.a(jq.a($$0.u()), jq.a($$0.w()), dty.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(io $$0, brw $$1) {
      return this.a($$0, $$1, it.b);
   }

   public void T() {
      double $$0 = 1.0 - (double)(this.d(1.0F) * 5.0F) / 16.0;
      double $$1 = 1.0 - (double)(this.b(1.0F) * 5.0F) / 16.0;
      double $$2 = 0.5 + 2.0 * ayf.a((double)ayf.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void b(boolean $$0, boolean $$1) {
      this.M().a($$0, $$1);
   }

   public io U() {
      io $$0 = this.A.a();
      if (!this.C_().a($$0)) {
         $$0 = this.a(dwv.a.e, io.a(this.C_().a(), 0.0, this.C_().b()));
      }

      return $$0;
   }

   public float V() {
      return this.A.b();
   }

   protected void W() {
      if (this.A.i()) {
         this.w = 1.0F;
         if (this.A.g()) {
            this.y = 1.0F;
         }
      }
   }

   @Override
   public void close() throws IOException {
      this.M().close();
   }

   @Nullable
   @Override
   public daf c(int $$0, int $$1) {
      return this.a($$0, $$1, dty.n, false);
   }

   @Override
   public List<brw> a(@Nullable brw $$0, euh $$1, Predicate<? super brw> $$2) {
      this.af().d("getEntities");
      List<brw> $$3 = Lists.newArrayList();
      this.G().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }

         if ($$3x instanceof chc) {
            for (cha $$4 : ((chc)$$3x).gl()) {
               if ($$3x != $$0 && $$2.test($$4)) {
                  $$3.add($$4);
               }
            }
         }
      });
      return $$3;
   }

   @Override
   public <T extends brw> List<T> a(dvk<brw, T> $$0, euh $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends brw> void a(dvk<brw, T> $$0, euh $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends brw> void a(dvk<brw, T> $$0, euh $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      this.af().d("getEntities");
      this.G().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return aws.a.b;
            }
         }

         if ($$4x instanceof chc $$5) {
            for (cha $$6 : $$5.gl()) {
               T $$7 = $$0.a($$6);
               if ($$7 != null && $$2.test($$7)) {
                  $$3.add($$7);
                  if ($$3.size() >= $$4) {
                     return aws.a.b;
                  }
               }
            }
         }

         return aws.a.a;
      });
   }

   @Nullable
   public abstract brw a(int var1);

   public void q(io $$0) {
      if (this.B($$0)) {
         this.m($$0).a(true);
      }
   }

   @Override
   public int z_() {
      return 63;
   }

   public void X() {
   }

   public long Y() {
      return this.A.c();
   }

   public long Z() {
      return this.A.d();
   }

   public boolean a(cly $$0, io $$1) {
      return true;
   }

   public void a(brw $$0, byte $$1) {
   }

   public void a(brw $$0, bqp $$1) {
   }

   public void a(io $$0, dea $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public eot A_() {
      return this.A;
   }

   public dav aa() {
      return this.A.o();
   }

   public abstract bqh s();

   public float b(float $$0) {
      return ayf.i($$0, this.x, this.y) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = ayf.a($$0, 0.0F, 1.0F);
      this.x = $$1;
      this.y = $$1;
   }

   public float d(float $$0) {
      return ayf.i($$0, this.v, this.w);
   }

   public void e(float $$0) {
      float $$1 = ayf.a($$0, 0.0F, 1.0F);
      this.v = $$1;
      this.w = $$1;
   }

   public boolean ab() {
      return this.D_().g() && !this.D_().h() ? (double)this.b(1.0F) > 0.9 : false;
   }

   public boolean ac() {
      return (double)this.d(1.0F) > 0.2;
   }

   public boolean r(io $$0) {
      if (!this.ac()) {
         return false;
      } else if (!this.h($$0)) {
         return false;
      } else if (this.a(dwv.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         dby $$1 = this.t($$0).a();
         return $$1.a($$0) == dby.c.b;
      }
   }

   @Nullable
   public abstract eol a(eoj var1);

   public abstract void a(eoj var1, eol var2);

   public abstract eoj v();

   public void b(int $$0, io $$1, int $$2) {
   }

   public p a(o $$0) {
      p $$1 = $$0.a("Affected level", 1);
      $$1.a("All players", () -> this.x().size() + " total; " + this.x());
      $$1.a("Chunk stats", this.M()::e);
      $$1.a("Level dimension", () -> this.ae().a().toString());

      try {
         this.A.a($$1, this);
      } catch (Throwable var4) {
         $$1.a("Level Data Unobtainable", var4);
      }

      return $$1;
   }

   public abstract void a(int var1, io var2, int var3);

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<cwj> $$6) {
   }

   public abstract evq L();

   public void c(io $$0, dea $$1) {
      for (it $$2 : it.c.a) {
         io $$3 = $$0.a($$2);
         if (this.B($$3)) {
            drd $$4 = this.a_($$3);
            if ($$4.a(dec.gY)) {
               this.a($$4, $$3, $$1, $$0, false);
            } else if ($$4.g(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(dec.gY)) {
                  this.a($$4, $$3, $$1, $$0, false);
               }
            }
         }
      }
   }

   @Override
   public bpu d_(io $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.B($$0)) {
         $$2 = this.ap();
         $$1 = this.m($$0).u();
      }

      return new bpu(this.ak(), this.Z(), $$1, $$2);
   }

   @Override
   public int B_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public dsu C_() {
      return this.F;
   }

   public void a(ze<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public duv D_() {
      return this.D.a();
   }

   public ix<duv> ad() {
      return this.D;
   }

   public akm<daz> ae() {
      return this.H;
   }

   @Override
   public aym E_() {
      return this.z;
   }

   @Override
   public boolean a(io $$0, Predicate<drd> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(io $$0, Predicate<emw> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract cxz r();

   public io a(int $$0, int $$1, int $$2, int $$3) {
      this.t = this.t * 3 + 1013904223;
      int $$4 = this.t >> 2;
      return new io($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean t() {
      return false;
   }

   public bmk af() {
      return this.E.get();
   }

   public Supplier<bmk> ag() {
      return this.E;
   }

   @Override
   public dca F_() {
      return this.G;
   }

   public final boolean ah() {
      return this.d;
   }

   protected abstract dvm<brw> G();

   @Override
   public long G_() {
      return this.K++;
   }

   @Override
   public jl H_() {
      return this.I;
   }

   public bqq ai() {
      return this.J;
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }
}
