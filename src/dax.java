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

public abstract class dax implements day, AutoCloseable {
   public static final Codec<akl<dax>> g = akl.a(lf.aS);
   public static final akl<dax> h = akl.a(lf.aS, new akm("overworld"));
   public static final akl<dax> i = akl.a(lf.aS, new akm("the_nether"));
   public static final akl<dax> j = akl.a(lf.aS, new akm("the_end"));
   public static final int k = 30000000;
   public static final int l = 512;
   public static final int m = 32;
   public static final int n = 15;
   public static final int o = 24000;
   public static final int p = 20000000;
   public static final int q = -20000000;
   protected final List<dpy> r = Lists.newArrayList();
   protected final eny s;
   private final List<dpy> a = Lists.newArrayList();
   private boolean b;
   private final Thread c;
   private final boolean d;
   private int e;
   protected int t = ayk.a().f();
   protected final int u = 1013904223;
   protected float v;
   protected float w;
   protected float x;
   protected float y;
   public final ayk z = ayk.a();
   @Deprecated
   private final ayk f = ayk.b();
   private final ix<dut> D;
   protected final epc A;
   private final Supplier<bmi> E;
   public final boolean B;
   private final dss F;
   private final dby G;
   private final akl<dax> H;
   private final jl I;
   private final bqo J;
   private long K;

   protected dax(epc $$0, akl<dax> $$1, jl $$2, ix<dut> $$3, Supplier<bmi> $$4, boolean $$5, boolean $$6, long $$7, int $$8) {
      this.E = $$4;
      this.A = $$0;
      this.D = $$3;
      final dut $$9 = $$3.a();
      this.H = $$1;
      this.B = $$5;
      if ($$9.k() != 1.0) {
         this.F = new dss() {
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
         this.F = new dss();
      }

      this.c = Thread.currentThread();
      this.G = new dby(this, $$7);
      this.d = $$6;
      this.s = new enw(this, $$8);
      this.I = $$2;
      this.J = new bqo($$2);
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

   public dth m(io $$0) {
      return this.d(jq.a($$0.u()), jq.a($$0.w()));
   }

   public dth d(int $$0, int $$1) {
      return (dth)this.a($$0, $$1, dtw.n);
   }

   @Nullable
   @Override
   public dsx a(int $$0, int $$1, dtw $$2, boolean $$3) {
      dsx $$4 = this.M().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(io $$0, drb $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(io $$0, drb $$1, int $$2, int $$3) {
      if (this.s($$0)) {
         return false;
      } else if (!this.B && this.ah()) {
         return false;
      } else {
         dth $$4 = this.m($$0);
         ddy $$5 = $$1.b();
         drb $$6 = $$4.a($$0, $$1, ($$2 & 64) != 0);
         if ($$6 == null) {
            return false;
         } else {
            drb $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.B || ($$2 & 4) == 0) && (this.B || $$4.D() != null && $$4.D().a(aqf.c))) {
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
                  $$1.a((day)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(io $$0, drb $$1, drb $$2) {
   }

   @Override
   public boolean a(io $$0, boolean $$1) {
      emu $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(io $$0, boolean $$1, @Nullable bru $$2, int $$3) {
      drb $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         emu $$5 = this.b_($$0);
         if (!($$4.b() instanceof ddl)) {
            this.c(2001, $$0, ddy.i($$4));
         }

         if ($$1) {
            dog $$6 = $$4.t() ? this.c_($$0) : null;
            ddy.a($$4, this, $$0, $$6, $$2, cto.i);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(dvu.f, $$0, dvu.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(io $$0, drb $$1) {
   }

   public boolean b(io $$0, drb $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(io var1, drb var2, drb var3, int var4);

   public void b(io $$0, drb $$1, drb $$2) {
   }

   public void a(io $$0, ddy $$1) {
   }

   public void a(io $$0, ddy $$1, it $$2) {
   }

   public void a(io $$0, ddy $$1, io $$2) {
   }

   public void a(drb $$0, io $$1, ddy $$2, io $$3, boolean $$4) {
   }

   @Override
   public void a(it $$0, drb $$1, io $$2, io $$3, int $$4, int $$5) {
      this.s.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int a(dwt.a $$0, int $$1, int $$2) {
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
   public emj y_() {
      return this.M().p();
   }

   @Override
   public drb a_(io $$0) {
      if (this.s($$0)) {
         return dea.nb.n();
      } else {
         dth $$1 = this.d(jq.a($$0.u()), jq.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public emu b_(io $$0) {
      if (this.s($$0)) {
         return emv.a.g();
      } else {
         dth $$1 = this.m($$0);
         return $$1.b_($$0);
      }
   }

   public boolean Q() {
      return !this.D_().a() && this.e < 4;
   }

   public boolean R() {
      return !this.D_().a() && !this.Q();
   }

   public void a(@Nullable bru $$0, io $$1, avg $$2, avi $$3, float $$4, float $$5) {
      this.a($$0 instanceof clw $$6 ? $$6 : null, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(@Nullable clw $$0, io $$1, avg $$2, avi $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable clw var1, double var2, double var4, double var6, ix<avg> var8, avi var9, float var10, float var11, long var12);

   public void a(@Nullable clw $$0, double $$1, double $$2, double $$3, avg $$4, avi $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, le.b.e($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable clw var1, bru var2, ix<avg> var3, avi var4, float var5, float var6, long var7);

   public void a(@Nullable clw $$0, double $$1, double $$2, double $$3, avg $$4, avi $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 1.0F, 1.0F);
   }

   public void a(@Nullable clw $$0, double $$1, double $$2, double $$3, avg $$4, avi $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable clw $$0, bru $$1, avg $$2, avi $$3, float $$4, float $$5) {
      this.a($$0, $$1, le.b.e($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(io $$0, avg $$1, avi $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(bru $$0, avg $$1, avi $$2, float $$3, float $$4) {
   }

   public void a(double $$0, double $$1, double $$2, avg $$3, avi $$4, float $$5, float $$6, boolean $$7) {
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

   public void a(dpy $$0) {
      (this.b ? this.a : this.r).add($$0);
   }

   protected void S() {
      bmi $$0 = this.af();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.r.addAll(this.a);
         this.a.clear();
      }

      Iterator<dpy> $$1 = this.r.iterator();
      boolean $$2 = this.s().i();

      while ($$1.hasNext()) {
         dpy $$3 = $$1.next();
         if ($$3.b()) {
            $$1.remove();
         } else if ($$2 && this.n($$3.c())) {
            $$3.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends bru> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Ticking entity");
         p $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new y($$3);
      }
   }

   public boolean h(bru $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean n(io $$0) {
      return this.a(dae.a($$0));
   }

   public dap a(@Nullable bru $$0, double $$1, double $$2, double $$3, float $$4, dax.a $$5) {
      return this.a($$0, dap.a(this, $$0), null, $$1, $$2, $$3, $$4, false, $$5, ky.w, ky.v, avh.ke);
   }

   public dap a(@Nullable bru $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, dax.a $$6) {
      return this.a($$0, dap.a(this, $$0), null, $$1, $$2, $$3, $$4, $$5, $$6, ky.w, ky.v, avh.ke);
   }

   public dap a(@Nullable bru $$0, @Nullable bqn $$1, @Nullable daq $$2, euk $$3, float $$4, boolean $$5, dax.a $$6) {
      return this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6, ky.w, ky.v, avh.ke);
   }

   public dap a(@Nullable bru $$0, @Nullable bqn $$1, @Nullable daq $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, dax.a $$8) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, ky.w, ky.v, avh.ke);
   }

   public dap a(
      @Nullable bru $$0,
      @Nullable bqn $$1,
      @Nullable daq $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dax.a $$8,
      kw $$9,
      kw $$10,
      ix<avg> $$11
   ) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, true, $$9, $$10, $$11);
   }

   public dap a(
      @Nullable bru $$0,
      @Nullable bqn $$1,
      @Nullable daq $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dax.a $$8,
      boolean $$9,
      kw $$10,
      kw $$11,
      ix<avg> $$12
   ) {
      dap.a $$13 = switch ($$8) {
         case a -> dap.a.a;
         case b -> this.a(dat.Q);
         case c -> this.aa().b(dat.c) ? this.a(dat.R) : dap.a.a;
         case d -> this.a(dat.S);
         case e -> dap.a.d;
      };
      dap $$14 = new dap(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$13, $$10, $$11, $$12);
      $$14.c();
      $$14.a($$9);
      return $$14;
   }

   private dap.a a(dat.e<dat.a> $$0) {
      return this.aa().b($$0) ? dap.a.c : dap.a.b;
   }

   public abstract String I();

   @Nullable
   @Override
   public dog c_(io $$0) {
      if (this.s($$0)) {
         return null;
      } else {
         return !this.B && Thread.currentThread() != this.c ? null : this.m($$0).a($$0, dth.b.a);
      }
   }

   public void a(dog $$0) {
      io $$1 = $$0.az_();
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

   public boolean a(io $$0, bru $$1, it $$2) {
      if (this.s($$0)) {
         return false;
      } else {
         dsx $$3 = this.a(jq.a($$0.u()), jq.a($$0.w()), dtw.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(io $$0, bru $$1) {
      return this.a($$0, $$1, it.b);
   }

   public void T() {
      double $$0 = 1.0 - (double)(this.d(1.0F) * 5.0F) / 16.0;
      double $$1 = 1.0 - (double)(this.b(1.0F) * 5.0F) / 16.0;
      double $$2 = 0.5 + 2.0 * ayd.a((double)ayd.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void b(boolean $$0, boolean $$1) {
      this.M().a($$0, $$1);
   }

   public io U() {
      io $$0 = this.A.a();
      if (!this.C_().a($$0)) {
         $$0 = this.a(dwt.a.e, io.a(this.C_().a(), 0.0, this.C_().b()));
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
   public dad c(int $$0, int $$1) {
      return this.a($$0, $$1, dtw.n, false);
   }

   @Override
   public List<bru> a(@Nullable bru $$0, euf $$1, Predicate<? super bru> $$2) {
      this.af().d("getEntities");
      List<bru> $$3 = Lists.newArrayList();
      this.G().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }

         if ($$3x instanceof cha) {
            for (cgy $$4 : ((cha)$$3x).gl()) {
               if ($$3x != $$0 && $$2.test($$4)) {
                  $$3.add($$4);
               }
            }
         }
      });
      return $$3;
   }

   @Override
   public <T extends bru> List<T> a(dvi<bru, T> $$0, euf $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends bru> void a(dvi<bru, T> $$0, euf $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends bru> void a(dvi<bru, T> $$0, euf $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      this.af().d("getEntities");
      this.G().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return awr.a.b;
            }
         }

         if ($$4x instanceof cha $$5) {
            for (cgy $$6 : $$5.gl()) {
               T $$7 = $$0.a($$6);
               if ($$7 != null && $$2.test($$7)) {
                  $$3.add($$7);
                  if ($$3.size() >= $$4) {
                     return awr.a.b;
                  }
               }
            }
         }

         return awr.a.a;
      });
   }

   @Nullable
   public abstract bru a(int var1);

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

   public boolean a(clw $$0, io $$1) {
      return true;
   }

   public void a(bru $$0, byte $$1) {
   }

   public void a(bru $$0, bqn $$1) {
   }

   public void a(io $$0, ddy $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public eor A_() {
      return this.A;
   }

   public dat aa() {
      return this.A.o();
   }

   public abstract bqf s();

   public float b(float $$0) {
      return ayd.i($$0, this.x, this.y) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = ayd.a($$0, 0.0F, 1.0F);
      this.x = $$1;
      this.y = $$1;
   }

   public float d(float $$0) {
      return ayd.i($$0, this.v, this.w);
   }

   public void e(float $$0) {
      float $$1 = ayd.a($$0, 0.0F, 1.0F);
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
      } else if (this.a(dwt.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         dbw $$1 = this.t($$0).a();
         return $$1.a($$0) == dbw.c.b;
      }
   }

   @Nullable
   public abstract eoj a(eoh var1);

   public abstract void a(eoh var1, eoj var2);

   public abstract eoh v();

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

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<cwh> $$6) {
   }

   public abstract evo L();

   public void c(io $$0, ddy $$1) {
      for (it $$2 : it.c.a) {
         io $$3 = $$0.a($$2);
         if (this.B($$3)) {
            drb $$4 = this.a_($$3);
            if ($$4.a(dea.gY)) {
               this.a($$4, $$3, $$1, $$0, false);
            } else if ($$4.g(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(dea.gY)) {
                  this.a($$4, $$3, $$1, $$0, false);
               }
            }
         }
      }
   }

   @Override
   public bps d_(io $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.B($$0)) {
         $$2 = this.ap();
         $$1 = this.m($$0).u();
      }

      return new bps(this.ak(), this.Z(), $$1, $$2);
   }

   @Override
   public int B_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public dss C_() {
      return this.F;
   }

   public void a(ze<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public dut D_() {
      return this.D.a();
   }

   public ix<dut> ad() {
      return this.D;
   }

   public akl<dax> ae() {
      return this.H;
   }

   @Override
   public ayk E_() {
      return this.z;
   }

   @Override
   public boolean a(io $$0, Predicate<drb> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(io $$0, Predicate<emu> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract cxx r();

   public io a(int $$0, int $$1, int $$2, int $$3) {
      this.t = this.t * 3 + 1013904223;
      int $$4 = this.t >> 2;
      return new io($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean t() {
      return false;
   }

   public bmi af() {
      return this.E.get();
   }

   public Supplier<bmi> ag() {
      return this.E;
   }

   @Override
   public dby F_() {
      return this.G;
   }

   public final boolean ah() {
      return this.d;
   }

   protected abstract dvk<bru> G();

   @Override
   public long G_() {
      return this.K++;
   }

   @Override
   public jl H_() {
      return this.I;
   }

   public bqo ai() {
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
