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

public abstract class dcd implements dce, AutoCloseable {
   public static final Codec<akj<dcd>> g = akj.a(lr.aZ);
   public static final akj<dcd> h = akj.a(lr.aZ, new akk("overworld"));
   public static final akj<dcd> i = akj.a(lr.aZ, new akk("the_nether"));
   public static final akj<dcd> j = akj.a(lr.aZ, new akk("the_end"));
   public static final int k = 30000000;
   public static final int l = 512;
   public static final int m = 32;
   public static final int n = 15;
   public static final int o = 24000;
   public static final int p = 20000000;
   public static final int q = -20000000;
   protected final List<drf> r = Lists.newArrayList();
   protected final epf s;
   private final List<drf> a = Lists.newArrayList();
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
   private final jj<dvz> D;
   protected final eqj A;
   private final Supplier<bmr> E;
   public final boolean B;
   private final dty F;
   private final ddf G;
   private final akj<dcd> H;
   private final jx I;
   private final bqx J;
   private long K;

   protected dcd(eqj $$0, akj<dcd> $$1, jx $$2, jj<dvz> $$3, Supplier<bmr> $$4, boolean $$5, boolean $$6, long $$7, int $$8) {
      this.E = $$4;
      this.A = $$0;
      this.D = $$3;
      final dvz $$9 = $$3.a();
      this.H = $$1;
      this.B = $$5;
      if ($$9.k() != 1.0) {
         this.F = new dty() {
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
         this.F = new dty();
      }

      this.c = Thread.currentThread();
      this.G = new ddf(this, $$7);
      this.d = $$6;
      this.s = new epd(this, $$8);
      this.I = $$2;
      this.J = new bqx($$2);
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

   public boolean k(ja $$0) {
      return !this.s($$0) && g($$0);
   }

   public static boolean l(ja $$0) {
      return !b($$0.v()) && g($$0);
   }

   private static boolean g(ja $$0) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000;
   }

   private static boolean b(int $$0) {
      return $$0 < -20000000 || $$0 >= 20000000;
   }

   public dun m(ja $$0) {
      return this.d(kc.a($$0.u()), kc.a($$0.w()));
   }

   public dun d(int $$0, int $$1) {
      return (dun)this.a($$0, $$1, dvc.n);
   }

   @Nullable
   @Override
   public dud a(int $$0, int $$1, dvc $$2, boolean $$3) {
      dud $$4 = this.N().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(ja $$0, dsh $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(ja $$0, dsh $$1, int $$2, int $$3) {
      if (this.s($$0)) {
         return false;
      } else if (!this.B && this.ai()) {
         return false;
      } else {
         dun $$4 = this.m($$0);
         dff $$5 = $$1.b();
         dsh $$6 = $$4.a($$0, $$1, ($$2 & 64) != 0);
         if ($$6 == null) {
            return false;
         } else {
            dsh $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.B || ($$2 & 4) == 0) && (this.B || $$4.D() != null && $$4.D().a(aqd.c))) {
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
                  $$1.a((dce)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(ja $$0, dsh $$1, dsh $$2) {
   }

   @Override
   public boolean a(ja $$0, boolean $$1) {
      eob $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(ja $$0, boolean $$1, @Nullable bsd $$2, int $$3) {
      dsh $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         eob $$5 = this.b_($$0);
         if (!($$4.b() instanceof des)) {
            this.c(2001, $$0, dff.i($$4));
         }

         if ($$1) {
            dpn $$6 = $$4.t() ? this.c_($$0) : null;
            dff.a($$4, this, $$0, $$6, $$2, cua.l);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(dxa.f, $$0, dxa.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(ja $$0, dsh $$1) {
   }

   public boolean b(ja $$0, dsh $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(ja var1, dsh var2, dsh var3, int var4);

   public void b(ja $$0, dsh $$1, dsh $$2) {
   }

   public void a(ja $$0, dff $$1) {
   }

   public void a(ja $$0, dff $$1, jf $$2) {
   }

   public void a(ja $$0, dff $$1, ja $$2) {
   }

   public void a(dsh $$0, ja $$1, dff $$2, ja $$3, boolean $$4) {
   }

   @Override
   public void a(jf $$0, dsh $$1, ja $$2, ja $$3, int $$4, int $$5) {
      this.s.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int a(dxz.a $$0, int $$1, int $$2) {
      int $$4;
      if ($$1 >= -30000000 && $$2 >= -30000000 && $$1 < 30000000 && $$2 < 30000000) {
         if (this.b(kc.a($$1), kc.a($$2))) {
            $$4 = this.d(kc.a($$1), kc.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
         } else {
            $$4 = this.I_();
         }
      } else {
         $$4 = this.z_() + 1;
      }

      return $$4;
   }

   @Override
   public enq y_() {
      return this.N().p();
   }

   @Override
   public dsh a_(ja $$0) {
      if (this.s($$0)) {
         return dfh.nb.o();
      } else {
         dun $$1 = this.d(kc.a($$0.u()), kc.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public eob b_(ja $$0) {
      if (this.s($$0)) {
         return eoc.a.g();
      } else {
         dun $$1 = this.m($$0);
         return $$1.b_($$0);
      }
   }

   public boolean R() {
      return !this.D_().a() && this.e < 4;
   }

   public boolean S() {
      return !this.D_().a() && !this.R();
   }

   public void a(@Nullable bsd $$0, ja $$1, ave $$2, avg $$3, float $$4, float $$5) {
      this.a($$0 instanceof cmh $$6 ? $$6 : null, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(@Nullable cmh $$0, ja $$1, ave $$2, avg $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable cmh var1, double var2, double var4, double var6, jj<ave> var8, avg var9, float var10, float var11, long var12);

   public void a(@Nullable cmh $$0, double $$1, double $$2, double $$3, ave $$4, avg $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, lq.b.e($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable cmh var1, bsd var2, jj<ave> var3, avg var4, float var5, float var6, long var7);

   public void a(@Nullable cmh $$0, double $$1, double $$2, double $$3, ave $$4, avg $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 1.0F, 1.0F);
   }

   public void a(@Nullable cmh $$0, double $$1, double $$2, double $$3, ave $$4, avg $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable cmh $$0, bsd $$1, ave $$2, avg $$3, float $$4, float $$5) {
      this.a($$0, $$1, lq.b.e($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(ja $$0, ave $$1, avg $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(bsd $$0, ave $$1, avg $$2, float $$3, float $$4) {
   }

   public void a(double $$0, double $$1, double $$2, ave $$3, avg $$4, float $$5, float $$6, boolean $$7) {
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

   public void a(drf $$0) {
      (this.b ? this.a : this.r).add($$0);
   }

   protected void T() {
      bmr $$0 = this.ag();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.r.addAll(this.a);
         this.a.clear();
      }

      Iterator<drf> $$1 = this.r.iterator();
      boolean $$2 = this.s().i();

      while ($$1.hasNext()) {
         drf $$3 = $$1.next();
         if ($$3.b()) {
            $$1.remove();
         } else if ($$2 && this.n($$3.c())) {
            $$3.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends bsd> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Ticking entity");
         p $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new y($$3);
      }
   }

   public boolean h(bsd $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean n(ja $$0) {
      return this.a(dbk.a($$0));
   }

   public dbv a(@Nullable bsd $$0, double $$1, double $$2, double $$3, float $$4, dcd.a $$5) {
      return this.a($$0, dbv.a(this, $$0), null, $$1, $$2, $$3, $$4, false, $$5, lj.w, lj.v, avf.ke);
   }

   public dbv a(@Nullable bsd $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, dcd.a $$6) {
      return this.a($$0, dbv.a(this, $$0), null, $$1, $$2, $$3, $$4, $$5, $$6, lj.w, lj.v, avf.ke);
   }

   public dbv a(@Nullable bsd $$0, @Nullable bqw $$1, @Nullable dbw $$2, evz $$3, float $$4, boolean $$5, dcd.a $$6) {
      return this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6, lj.w, lj.v, avf.ke);
   }

   public dbv a(@Nullable bsd $$0, @Nullable bqw $$1, @Nullable dbw $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, dcd.a $$8) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, lj.w, lj.v, avf.ke);
   }

   public dbv a(
      @Nullable bsd $$0,
      @Nullable bqw $$1,
      @Nullable dbw $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dcd.a $$8,
      lh $$9,
      lh $$10,
      jj<ave> $$11
   ) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, true, $$9, $$10, $$11);
   }

   public dbv a(
      @Nullable bsd $$0,
      @Nullable bqw $$1,
      @Nullable dbw $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dcd.a $$8,
      boolean $$9,
      lh $$10,
      lh $$11,
      jj<ave> $$12
   ) {
      dbv.a $$13 = switch ($$8) {
         case a -> dbv.a.a;
         case b -> this.a(dbz.Q);
         case c -> this.ab().b(dbz.c) ? this.a(dbz.R) : dbv.a.a;
         case d -> this.a(dbz.S);
         case e -> dbv.a.d;
      };
      dbv $$14 = new dbv(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$13, $$10, $$11, $$12);
      $$14.c();
      $$14.a($$9);
      return $$14;
   }

   private dbv.a a(dbz.e<dbz.a> $$0) {
      return this.ab().b($$0) ? dbv.a.c : dbv.a.b;
   }

   public abstract String I();

   @Nullable
   @Override
   public dpn c_(ja $$0) {
      if (this.s($$0)) {
         return null;
      } else {
         return !this.B && Thread.currentThread() != this.c ? null : this.m($$0).a($$0, dun.b.a);
      }
   }

   public void a(dpn $$0) {
      ja $$1 = $$0.az_();
      if (!this.s($$1)) {
         this.m($$1).b($$0);
      }
   }

   public void o(ja $$0) {
      if (!this.s($$0)) {
         this.m($$0).d($$0);
      }
   }

   public boolean p(ja $$0) {
      return this.s($$0) ? false : this.N().b(kc.a($$0.u()), kc.a($$0.w()));
   }

   public boolean a(ja $$0, bsd $$1, jf $$2) {
      if (this.s($$0)) {
         return false;
      } else {
         dud $$3 = this.a(kc.a($$0.u()), kc.a($$0.w()), dvc.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(ja $$0, bsd $$1) {
      return this.a($$0, $$1, jf.b);
   }

   public void U() {
      double $$0 = 1.0 - (double)(this.d(1.0F) * 5.0F) / 16.0;
      double $$1 = 1.0 - (double)(this.b(1.0F) * 5.0F) / 16.0;
      double $$2 = 0.5 + 2.0 * aye.a((double)aye.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void b(boolean $$0, boolean $$1) {
      this.N().a($$0, $$1);
   }

   public ja V() {
      ja $$0 = this.A.a();
      if (!this.C_().a($$0)) {
         $$0 = this.a(dxz.a.e, ja.a(this.C_().a(), 0.0, this.C_().b()));
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
   public dbj c(int $$0, int $$1) {
      return this.a($$0, $$1, dvc.n, false);
   }

   @Override
   public List<bsd> a(@Nullable bsd $$0, evu $$1, Predicate<? super bsd> $$2) {
      this.ag().d("getEntities");
      List<bsd> $$3 = Lists.newArrayList();
      this.G().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }

         if ($$3x instanceof chk) {
            for (chi $$4 : ((chk)$$3x).gj()) {
               if ($$3x != $$0 && $$2.test($$4)) {
                  $$3.add($$4);
               }
            }
         }
      });
      return $$3;
   }

   @Override
   public <T extends bsd> List<T> a(dwo<bsd, T> $$0, evu $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends bsd> void a(dwo<bsd, T> $$0, evu $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends bsd> void a(dwo<bsd, T> $$0, evu $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      this.ag().d("getEntities");
      this.G().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return awq.a.b;
            }
         }

         if ($$4x instanceof chk $$5) {
            for (chi $$6 : $$5.gj()) {
               T $$7 = $$0.a($$6);
               if ($$7 != null && $$2.test($$7)) {
                  $$3.add($$7);
                  if ($$3.size() >= $$4) {
                     return awq.a.b;
                  }
               }
            }
         }

         return awq.a.a;
      });
   }

   @Nullable
   public abstract bsd a(int var1);

   public void q(ja $$0) {
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

   public boolean a(cmh $$0, ja $$1) {
      return true;
   }

   public void a(bsd $$0, byte $$1) {
   }

   public void a(bsd $$0, bqw $$1) {
   }

   public void a(ja $$0, dff $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public epy A_() {
      return this.A;
   }

   public dbz ab() {
      return this.A.o();
   }

   public abstract bqo s();

   public float b(float $$0) {
      return aye.i($$0, this.x, this.y) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = aye.a($$0, 0.0F, 1.0F);
      this.x = $$1;
      this.y = $$1;
   }

   public float d(float $$0) {
      return aye.i($$0, this.v, this.w);
   }

   public void e(float $$0) {
      float $$1 = aye.a($$0, 0.0F, 1.0F);
      this.v = $$1;
      this.w = $$1;
   }

   public boolean ac() {
      return this.D_().g() && !this.D_().h() ? (double)this.b(1.0F) > 0.9 : false;
   }

   public boolean ad() {
      return (double)this.d(1.0F) > 0.2;
   }

   public boolean r(ja $$0) {
      if (!this.ad()) {
         return false;
      } else if (!this.h($$0)) {
         return false;
      } else if (this.a(dxz.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         ddd $$1 = this.t($$0).a();
         return $$1.a($$0) == ddd.c.b;
      }
   }

   @Nullable
   public abstract epq a(epo var1);

   public abstract void a(epo var1, epq var2);

   public abstract epo v();

   public void b(int $$0, ja $$1, int $$2) {
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

   public abstract void a(int var1, ja var2, int var3);

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<cws> $$6) {
   }

   public abstract exd M();

   public void c(ja $$0, dff $$1) {
      for (jf $$2 : jf.c.a) {
         ja $$3 = $$0.a($$2);
         if (this.B($$3)) {
            dsh $$4 = this.a_($$3);
            if ($$4.a(dfh.gY)) {
               this.a($$4, $$3, $$1, $$0, false);
            } else if ($$4.g(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(dfh.gY)) {
                  this.a($$4, $$3, $$1, $$0, false);
               }
            }
         }
      }
   }

   @Override
   public bqb d_(ja $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.B($$0)) {
         $$2 = this.aq();
         $$1 = this.m($$0).u();
      }

      return new bqb(this.al(), this.aa(), $$1, $$2);
   }

   @Override
   public int B_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public dty C_() {
      return this.F;
   }

   public void a(zb<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public dvz D_() {
      return this.D.a();
   }

   public jj<dvz> ae() {
      return this.D;
   }

   public akj<dcd> af() {
      return this.H;
   }

   @Override
   public aym E_() {
      return this.z;
   }

   @Override
   public boolean a(ja $$0, Predicate<dsh> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(ja $$0, Predicate<eob> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract cyk r();

   public ja a(int $$0, int $$1, int $$2, int $$3) {
      this.t = this.t * 3 + 1013904223;
      int $$4 = this.t >> 2;
      return new ja($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean t() {
      return false;
   }

   public bmr ag() {
      return this.E.get();
   }

   public Supplier<bmr> ah() {
      return this.E;
   }

   @Override
   public ddf F_() {
      return this.G;
   }

   public final boolean ai() {
      return this.d;
   }

   protected abstract dwq<bsd> G();

   @Override
   public long G_() {
      return this.K++;
   }

   @Override
   public jx H_() {
      return this.I;
   }

   public bqx aj() {
      return this.J;
   }

   public abstract cwa K();

   public static enum a implements ayz {
      a("none"),
      b("block"),
      c("mob"),
      d("tnt"),
      e("trigger");

      public static final Codec<dcd.a> f = ayz.a(dcd.a::values);
      private final String g;

      private a(String $$0) {
         this.g = $$0;
      }

      @Override
      public String c() {
         return this.g;
      }
   }
}
