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

public abstract class dcg implements dch, AutoCloseable {
   public static final Codec<akj<dcg>> g = akj.a(lr.aZ);
   public static final akj<dcg> h = akj.a(lr.aZ, new akk("overworld"));
   public static final akj<dcg> i = akj.a(lr.aZ, new akk("the_nether"));
   public static final akj<dcg> j = akj.a(lr.aZ, new akk("the_end"));
   public static final int k = 30000000;
   public static final int l = 512;
   public static final int m = 32;
   public static final int n = 15;
   public static final int o = 24000;
   public static final int p = 20000000;
   public static final int q = -20000000;
   protected final List<drj> r = Lists.newArrayList();
   protected final epn s;
   private final List<drj> a = Lists.newArrayList();
   private boolean b;
   private final Thread c;
   private final boolean d;
   private int e;
   protected int t = ayo.a().f();
   protected final int u = 1013904223;
   protected float v;
   protected float w;
   protected float x;
   protected float y;
   public final ayo z = ayo.a();
   @Deprecated
   private final ayo f = ayo.b();
   private final jj<dwg> D;
   protected final eqr A;
   private final Supplier<bmv> E;
   public final boolean B;
   private final duc F;
   private final ddi G;
   private final akj<dcg> H;
   private final jx I;
   private final brb J;
   private long K;

   protected dcg(eqr $$0, akj<dcg> $$1, jx $$2, jj<dwg> $$3, Supplier<bmv> $$4, boolean $$5, boolean $$6, long $$7, int $$8) {
      this.E = $$4;
      this.A = $$0;
      this.D = $$3;
      final dwg $$9 = $$3.a();
      this.H = $$1;
      this.B = $$5;
      if ($$9.k() != 1.0) {
         this.F = new duc() {
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
         this.F = new duc();
      }

      this.c = Thread.currentThread();
      this.G = new ddi(this, $$7);
      this.d = $$6;
      this.s = new epl(this, $$8);
      this.I = $$2;
      this.J = new brb($$2);
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

   public dur m(ja $$0) {
      return this.d(kc.a($$0.u()), kc.a($$0.w()));
   }

   public dur d(int $$0, int $$1) {
      return (dur)this.a($$0, $$1, dvi.n);
   }

   @Nullable
   @Override
   public duh a(int $$0, int $$1, dvi $$2, boolean $$3) {
      duh $$4 = this.N().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(ja $$0, dsl $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(ja $$0, dsl $$1, int $$2, int $$3) {
      if (this.s($$0)) {
         return false;
      } else if (!this.B && this.ai()) {
         return false;
      } else {
         dur $$4 = this.m($$0);
         dfi $$5 = $$1.b();
         dsl $$6 = $$4.a($$0, $$1, ($$2 & 64) != 0);
         if ($$6 == null) {
            return false;
         } else {
            dsl $$7 = this.a_($$0);
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
                  $$1.a((dch)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(ja $$0, dsl $$1, dsl $$2) {
   }

   @Override
   public boolean a(ja $$0, boolean $$1) {
      eoj $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(ja $$0, boolean $$1, @Nullable bsh $$2, int $$3) {
      dsl $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         eoj $$5 = this.b_($$0);
         if (!($$4.b() instanceof dev)) {
            this.c(2001, $$0, dfi.i($$4));
         }

         if ($$1) {
            dpq $$6 = $$4.t() ? this.c_($$0) : null;
            dfi.a($$4, this, $$0, $$6, $$2, cud.l);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(dxh.f, $$0, dxh.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(ja $$0, dsl $$1) {
   }

   public boolean b(ja $$0, dsl $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(ja var1, dsl var2, dsl var3, int var4);

   public void b(ja $$0, dsl $$1, dsl $$2) {
   }

   public void a(ja $$0, dfi $$1) {
   }

   public void a(ja $$0, dfi $$1, jf $$2) {
   }

   public void a(ja $$0, dfi $$1, ja $$2) {
   }

   public void a(dsl $$0, ja $$1, dfi $$2, ja $$3, boolean $$4) {
   }

   @Override
   public void a(jf $$0, dsl $$1, ja $$2, ja $$3, int $$4, int $$5) {
      this.s.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int a(dyg.a $$0, int $$1, int $$2) {
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
   public eny y_() {
      return this.N().p();
   }

   @Override
   public dsl a_(ja $$0) {
      if (this.s($$0)) {
         return dfk.nb.o();
      } else {
         dur $$1 = this.d(kc.a($$0.u()), kc.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public eoj b_(ja $$0) {
      if (this.s($$0)) {
         return eok.a.g();
      } else {
         dur $$1 = this.m($$0);
         return $$1.b_($$0);
      }
   }

   public boolean R() {
      return !this.D_().a() && this.e < 4;
   }

   public boolean S() {
      return !this.D_().a() && !this.R();
   }

   public void a(@Nullable bsh $$0, ja $$1, avg $$2, avi $$3, float $$4, float $$5) {
      this.a($$0 instanceof cml $$6 ? $$6 : null, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(@Nullable cml $$0, ja $$1, avg $$2, avi $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable cml var1, double var2, double var4, double var6, jj<avg> var8, avi var9, float var10, float var11, long var12);

   public void a(@Nullable cml $$0, double $$1, double $$2, double $$3, avg $$4, avi $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, lq.b.e($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable cml var1, bsh var2, jj<avg> var3, avi var4, float var5, float var6, long var7);

   public void a(@Nullable cml $$0, double $$1, double $$2, double $$3, avg $$4, avi $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 1.0F, 1.0F);
   }

   public void a(@Nullable cml $$0, double $$1, double $$2, double $$3, avg $$4, avi $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable cml $$0, double $$1, double $$2, double $$3, jj<avg> $$4, avi $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable cml $$0, bsh $$1, avg $$2, avi $$3, float $$4, float $$5) {
      this.a($$0, $$1, lq.b.e($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(ja $$0, avg $$1, avi $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(bsh $$0, avg $$1, avi $$2, float $$3, float $$4) {
   }

   public void a(double $$0, double $$1, double $$2, avg $$3, avi $$4, float $$5, float $$6, boolean $$7) {
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

   public void a(drj $$0) {
      (this.b ? this.a : this.r).add($$0);
   }

   protected void T() {
      bmv $$0 = this.ag();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.r.addAll(this.a);
         this.a.clear();
      }

      Iterator<drj> $$1 = this.r.iterator();
      boolean $$2 = this.s().i();

      while ($$1.hasNext()) {
         drj $$3 = $$1.next();
         if ($$3.b()) {
            $$1.remove();
         } else if ($$2 && this.n($$3.c())) {
            $$3.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends bsh> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Ticking entity");
         p $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new y($$3);
      }
   }

   public boolean h(bsh $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean n(ja $$0) {
      return this.a(dbn.a($$0));
   }

   public dby a(@Nullable bsh $$0, double $$1, double $$2, double $$3, float $$4, dcg.a $$5) {
      return this.a($$0, dby.a(this, $$0), null, $$1, $$2, $$3, $$4, false, $$5, lj.w, lj.v, avh.ke);
   }

   public dby a(@Nullable bsh $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, dcg.a $$6) {
      return this.a($$0, dby.a(this, $$0), null, $$1, $$2, $$3, $$4, $$5, $$6, lj.w, lj.v, avh.ke);
   }

   public dby a(@Nullable bsh $$0, @Nullable bra $$1, @Nullable dbz $$2, ewh $$3, float $$4, boolean $$5, dcg.a $$6) {
      return this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6, lj.w, lj.v, avh.ke);
   }

   public dby a(@Nullable bsh $$0, @Nullable bra $$1, @Nullable dbz $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, dcg.a $$8) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, lj.w, lj.v, avh.ke);
   }

   public dby a(
      @Nullable bsh $$0,
      @Nullable bra $$1,
      @Nullable dbz $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dcg.a $$8,
      lh $$9,
      lh $$10,
      jj<avg> $$11
   ) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, true, $$9, $$10, $$11);
   }

   public dby a(
      @Nullable bsh $$0,
      @Nullable bra $$1,
      @Nullable dbz $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dcg.a $$8,
      boolean $$9,
      lh $$10,
      lh $$11,
      jj<avg> $$12
   ) {
      dby.a $$13 = switch ($$8) {
         case a -> dby.a.a;
         case b -> this.a(dcc.Q);
         case c -> this.ab().b(dcc.c) ? this.a(dcc.R) : dby.a.a;
         case d -> this.a(dcc.S);
         case e -> dby.a.d;
      };
      dby $$14 = new dby(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$13, $$10, $$11, $$12);
      $$14.c();
      $$14.a($$9);
      return $$14;
   }

   private dby.a a(dcc.e<dcc.a> $$0) {
      return this.ab().b($$0) ? dby.a.c : dby.a.b;
   }

   public abstract String I();

   @Nullable
   @Override
   public dpq c_(ja $$0) {
      if (this.s($$0)) {
         return null;
      } else {
         return !this.B && Thread.currentThread() != this.c ? null : this.m($$0).a($$0, dur.b.a);
      }
   }

   public void a(dpq $$0) {
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

   public boolean a(ja $$0, bsh $$1, jf $$2) {
      if (this.s($$0)) {
         return false;
      } else {
         duh $$3 = this.a(kc.a($$0.u()), kc.a($$0.w()), dvi.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(ja $$0, bsh $$1) {
      return this.a($$0, $$1, jf.b);
   }

   public void U() {
      double $$0 = 1.0 - (double)(this.d(1.0F) * 5.0F) / 16.0;
      double $$1 = 1.0 - (double)(this.b(1.0F) * 5.0F) / 16.0;
      double $$2 = 0.5 + 2.0 * ayg.a((double)ayg.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void b(boolean $$0, boolean $$1) {
      this.N().a($$0, $$1);
   }

   public ja V() {
      ja $$0 = this.A.a();
      if (!this.C_().a($$0)) {
         $$0 = this.a(dyg.a.e, ja.a(this.C_().a(), 0.0, this.C_().b()));
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
   public dbm c(int $$0, int $$1) {
      return this.a($$0, $$1, dvi.n, false);
   }

   @Override
   public List<bsh> a(@Nullable bsh $$0, ewc $$1, Predicate<? super bsh> $$2) {
      this.ag().d("getEntities");
      List<bsh> $$3 = Lists.newArrayList();
      this.G().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }

         if ($$3x instanceof cho) {
            for (chm $$4 : ((cho)$$3x).gj()) {
               if ($$3x != $$0 && $$2.test($$4)) {
                  $$3.add($$4);
               }
            }
         }
      });
      return $$3;
   }

   @Override
   public <T extends bsh> List<T> a(dwv<bsh, T> $$0, ewc $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends bsh> void a(dwv<bsh, T> $$0, ewc $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends bsh> void a(dwv<bsh, T> $$0, ewc $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      this.ag().d("getEntities");
      this.G().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return aws.a.b;
            }
         }

         if ($$4x instanceof cho $$5) {
            for (chm $$6 : $$5.gj()) {
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
   public abstract bsh a(int var1);

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

   public boolean a(cml $$0, ja $$1) {
      return true;
   }

   public void a(bsh $$0, byte $$1) {
   }

   public void a(bsh $$0, bra $$1) {
   }

   public void a(ja $$0, dfi $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public eqg A_() {
      return this.A;
   }

   public dcc ab() {
      return this.A.o();
   }

   public abstract bqs s();

   public float b(float $$0) {
      return ayg.i($$0, this.x, this.y) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = ayg.a($$0, 0.0F, 1.0F);
      this.x = $$1;
      this.y = $$1;
   }

   public float d(float $$0) {
      return ayg.i($$0, this.v, this.w);
   }

   public void e(float $$0) {
      float $$1 = ayg.a($$0, 0.0F, 1.0F);
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
      } else if (this.a(dyg.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         ddg $$1 = this.t($$0).a();
         return $$1.a($$0) == ddg.c.b;
      }
   }

   @Nullable
   public abstract epy a(epw var1);

   public abstract void a(epw var1, epy var2);

   public abstract epw v();

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

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<cwv> $$6) {
   }

   public abstract exl M();

   public void c(ja $$0, dfi $$1) {
      for (jf $$2 : jf.c.a) {
         ja $$3 = $$0.a($$2);
         if (this.B($$3)) {
            dsl $$4 = this.a_($$3);
            if ($$4.a(dfk.gY)) {
               this.a($$4, $$3, $$1, $$0, false);
            } else if ($$4.g(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(dfk.gY)) {
                  this.a($$4, $$3, $$1, $$0, false);
               }
            }
         }
      }
   }

   @Override
   public bqf d_(ja $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.B($$0)) {
         $$2 = this.aq();
         $$1 = this.m($$0).u();
      }

      return new bqf(this.al(), this.aa(), $$1, $$2);
   }

   @Override
   public int B_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public duc C_() {
      return this.F;
   }

   public void a(zb<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public dwg D_() {
      return this.D.a();
   }

   public jj<dwg> ae() {
      return this.D;
   }

   public akj<dcg> af() {
      return this.H;
   }

   @Override
   public ayo E_() {
      return this.z;
   }

   @Override
   public boolean a(ja $$0, Predicate<dsl> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(ja $$0, Predicate<eoj> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract cyn r();

   public ja a(int $$0, int $$1, int $$2, int $$3) {
      this.t = this.t * 3 + 1013904223;
      int $$4 = this.t >> 2;
      return new ja($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean t() {
      return false;
   }

   public bmv ag() {
      return this.E.get();
   }

   public Supplier<bmv> ah() {
      return this.E;
   }

   @Override
   public ddi F_() {
      return this.G;
   }

   public final boolean ai() {
      return this.d;
   }

   protected abstract dwx<bsh> G();

   @Override
   public long G_() {
      return this.K++;
   }

   @Override
   public jx H_() {
      return this.I;
   }

   public brb aj() {
      return this.J;
   }

   public abstract cwd K();

   public static enum a implements azc {
      a("none"),
      b("block"),
      c("mob"),
      d("tnt"),
      e("trigger");

      public static final Codec<dcg.a> f = azc.a(dcg.a::values);
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
