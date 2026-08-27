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

public abstract class dad implements dae, AutoCloseable {
   public static final Codec<akg<dad>> g = akg.a(le.aS);
   public static final akg<dad> h = akg.a(le.aS, new akh("overworld"));
   public static final akg<dad> i = akg.a(le.aS, new akh("the_nether"));
   public static final akg<dad> j = akg.a(le.aS, new akh("the_end"));
   public static final int k = 30000000;
   public static final int l = 512;
   public static final int m = 32;
   public static final int n = 15;
   public static final int o = 24000;
   public static final int p = 20000000;
   public static final int q = -20000000;
   protected final List<dpe> r = Lists.newArrayList();
   protected final ene s;
   private final List<dpe> a = Lists.newArrayList();
   private boolean b;
   private final Thread c;
   private final boolean d;
   private int e;
   protected int t = ayg.a().f();
   protected final int u = 1013904223;
   protected float v;
   protected float w;
   protected float x;
   protected float y;
   public final ayg z = ayg.a();
   @Deprecated
   private final ayg f = ayg.b();
   private final iw<dtz> D;
   protected final eoi A;
   private final Supplier<bma> E;
   public final boolean B;
   private final dry F;
   private final dbe G;
   private final akg<dad> H;
   private final jk I;
   private final bqg J;
   private long K;

   protected dad(eoi $$0, akg<dad> $$1, jk $$2, iw<dtz> $$3, Supplier<bma> $$4, boolean $$5, boolean $$6, long $$7, int $$8) {
      this.E = $$4;
      this.A = $$0;
      this.D = $$3;
      final dtz $$9 = $$3.a();
      this.H = $$1;
      this.B = $$5;
      if ($$9.k() != 1.0) {
         this.F = new dry() {
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
         this.F = new dry();
      }

      this.c = Thread.currentThread();
      this.G = new dbe(this, $$7);
      this.d = $$6;
      this.s = new enc(this, $$8);
      this.I = $$2;
      this.J = new bqg($$2);
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

   public boolean k(in $$0) {
      return !this.s($$0) && g($$0);
   }

   public static boolean l(in $$0) {
      return !b($$0.v()) && g($$0);
   }

   private static boolean g(in $$0) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000;
   }

   private static boolean b(int $$0) {
      return $$0 < -20000000 || $$0 >= 20000000;
   }

   public dsn m(in $$0) {
      return this.d(jp.a($$0.u()), jp.a($$0.w()));
   }

   public dsn d(int $$0, int $$1) {
      return (dsn)this.a($$0, $$1, dtc.n);
   }

   @Nullable
   @Override
   public dsd a(int $$0, int $$1, dtc $$2, boolean $$3) {
      dsd $$4 = this.M().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(in $$0, dqh $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(in $$0, dqh $$1, int $$2, int $$3) {
      if (this.s($$0)) {
         return false;
      } else if (!this.B && this.ah()) {
         return false;
      } else {
         dsn $$4 = this.m($$0);
         dde $$5 = $$1.b();
         dqh $$6 = $$4.a($$0, $$1, ($$2 & 64) != 0);
         if ($$6 == null) {
            return false;
         } else {
            dqh $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.B || ($$2 & 4) == 0) && (this.B || $$4.D() != null && $$4.D().a(aqa.c))) {
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
                  $$1.a((dae)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(in $$0, dqh $$1, dqh $$2) {
   }

   @Override
   public boolean a(in $$0, boolean $$1) {
      ema $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(in $$0, boolean $$1, @Nullable brh $$2, int $$3) {
      dqh $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         ema $$5 = this.b_($$0);
         if (!($$4.b() instanceof dcr)) {
            this.c(2001, $$0, dde.i($$4));
         }

         if ($$1) {
            dnm $$6 = $$4.t() ? this.c_($$0) : null;
            dde.a($$4, this, $$0, $$6, $$2, csz.i);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(dva.f, $$0, dva.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(in $$0, dqh $$1) {
   }

   public boolean b(in $$0, dqh $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(in var1, dqh var2, dqh var3, int var4);

   public void b(in $$0, dqh $$1, dqh $$2) {
   }

   public void a(in $$0, dde $$1) {
   }

   public void a(in $$0, dde $$1, is $$2) {
   }

   public void a(in $$0, dde $$1, in $$2) {
   }

   public void a(dqh $$0, in $$1, dde $$2, in $$3, boolean $$4) {
   }

   @Override
   public void a(is $$0, dqh $$1, in $$2, in $$3, int $$4, int $$5) {
      this.s.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int a(dvz.a $$0, int $$1, int $$2) {
      int $$4;
      if ($$1 >= -30000000 && $$2 >= -30000000 && $$1 < 30000000 && $$2 < 30000000) {
         if (this.b(jp.a($$1), jp.a($$2))) {
            $$4 = this.d(jp.a($$1), jp.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
         } else {
            $$4 = this.I_();
         }
      } else {
         $$4 = this.z_() + 1;
      }

      return $$4;
   }

   @Override
   public elp y_() {
      return this.M().p();
   }

   @Override
   public dqh a_(in $$0) {
      if (this.s($$0)) {
         return ddg.nb.n();
      } else {
         dsn $$1 = this.d(jp.a($$0.u()), jp.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public ema b_(in $$0) {
      if (this.s($$0)) {
         return emb.a.g();
      } else {
         dsn $$1 = this.m($$0);
         return $$1.b_($$0);
      }
   }

   public boolean Q() {
      return !this.D_().a() && this.e < 4;
   }

   public boolean R() {
      return !this.D_().a() && !this.Q();
   }

   public void a(@Nullable brh $$0, in $$1, avb $$2, avd $$3, float $$4, float $$5) {
      this.a($$0 instanceof clh $$6 ? $$6 : null, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(@Nullable clh $$0, in $$1, avb $$2, avd $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable clh var1, double var2, double var4, double var6, iw<avb> var8, avd var9, float var10, float var11, long var12);

   public void a(@Nullable clh $$0, double $$1, double $$2, double $$3, avb $$4, avd $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, ld.b.e($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable clh var1, brh var2, iw<avb> var3, avd var4, float var5, float var6, long var7);

   public void a(@Nullable clh $$0, double $$1, double $$2, double $$3, avb $$4, avd $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 1.0F, 1.0F);
   }

   public void a(@Nullable clh $$0, double $$1, double $$2, double $$3, avb $$4, avd $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable clh $$0, brh $$1, avb $$2, avd $$3, float $$4, float $$5) {
      this.a($$0, $$1, ld.b.e($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(in $$0, avb $$1, avd $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(brh $$0, avb $$1, avd $$2, float $$3, float $$4) {
   }

   public void a(double $$0, double $$1, double $$2, avb $$3, avd $$4, float $$5, float $$6, boolean $$7) {
   }

   @Override
   public void a(kv $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(kv $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public void b(kv $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void b(kv $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public float a(float $$0) {
      float $$1 = this.f($$0);
      return $$1 * (float) (Math.PI * 2);
   }

   public void a(dpe $$0) {
      (this.b ? this.a : this.r).add($$0);
   }

   protected void S() {
      bma $$0 = this.af();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.r.addAll(this.a);
         this.a.clear();
      }

      Iterator<dpe> $$1 = this.r.iterator();
      boolean $$2 = this.s().i();

      while ($$1.hasNext()) {
         dpe $$3 = $$1.next();
         if ($$3.b()) {
            $$1.remove();
         } else if ($$2 && this.n($$3.c())) {
            $$3.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends brh> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Ticking entity");
         p $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new y($$3);
      }
   }

   public boolean h(brh $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean n(in $$0) {
      return this.a(czk.a($$0));
   }

   public czv a(@Nullable brh $$0, double $$1, double $$2, double $$3, float $$4, dad.a $$5) {
      return this.a($$0, czv.a(this, $$0), null, $$1, $$2, $$3, $$4, false, $$5, kx.w, kx.v, avc.jZ);
   }

   public czv a(@Nullable brh $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, dad.a $$6) {
      return this.a($$0, czv.a(this, $$0), null, $$1, $$2, $$3, $$4, $$5, $$6, kx.w, kx.v, avc.jZ);
   }

   public czv a(@Nullable brh $$0, @Nullable bqf $$1, @Nullable czw $$2, etp $$3, float $$4, boolean $$5, dad.a $$6) {
      return this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6, kx.w, kx.v, avc.jZ);
   }

   public czv a(@Nullable brh $$0, @Nullable bqf $$1, @Nullable czw $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, dad.a $$8) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, kx.w, kx.v, avc.jZ);
   }

   public czv a(
      @Nullable brh $$0,
      @Nullable bqf $$1,
      @Nullable czw $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dad.a $$8,
      kv $$9,
      kv $$10,
      iw<avb> $$11
   ) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, true, $$9, $$10, $$11);
   }

   public czv a(
      @Nullable brh $$0,
      @Nullable bqf $$1,
      @Nullable czw $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dad.a $$8,
      boolean $$9,
      kv $$10,
      kv $$11,
      iw<avb> $$12
   ) {
      czv.a $$13 = switch ($$8) {
         case a -> czv.a.a;
         case b -> this.a(czz.Q);
         case c -> this.aa().b(czz.c) ? this.a(czz.R) : czv.a.a;
         case d -> this.a(czz.S);
         case e -> czv.a.d;
      };
      czv $$14 = new czv(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$13, $$10, $$11, $$12);
      $$14.c();
      $$14.a($$9);
      return $$14;
   }

   private czv.a a(czz.e<czz.a> $$0) {
      return this.aa().b($$0) ? czv.a.c : czv.a.b;
   }

   public abstract String I();

   @Nullable
   @Override
   public dnm c_(in $$0) {
      if (this.s($$0)) {
         return null;
      } else {
         return !this.B && Thread.currentThread() != this.c ? null : this.m($$0).a($$0, dsn.b.a);
      }
   }

   public void a(dnm $$0) {
      in $$1 = $$0.az_();
      if (!this.s($$1)) {
         this.m($$1).b($$0);
      }
   }

   public void o(in $$0) {
      if (!this.s($$0)) {
         this.m($$0).d($$0);
      }
   }

   public boolean p(in $$0) {
      return this.s($$0) ? false : this.M().b(jp.a($$0.u()), jp.a($$0.w()));
   }

   public boolean a(in $$0, brh $$1, is $$2) {
      if (this.s($$0)) {
         return false;
      } else {
         dsd $$3 = this.a(jp.a($$0.u()), jp.a($$0.w()), dtc.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(in $$0, brh $$1) {
      return this.a($$0, $$1, is.b);
   }

   public void T() {
      double $$0 = 1.0 - (double)(this.d(1.0F) * 5.0F) / 16.0;
      double $$1 = 1.0 - (double)(this.b(1.0F) * 5.0F) / 16.0;
      double $$2 = 0.5 + 2.0 * axz.a((double)axz.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void b(boolean $$0, boolean $$1) {
      this.M().a($$0, $$1);
   }

   public in U() {
      in $$0 = this.A.a();
      if (!this.C_().a($$0)) {
         $$0 = this.a(dvz.a.e, in.a(this.C_().a(), 0.0, this.C_().b()));
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
   public czj c(int $$0, int $$1) {
      return this.a($$0, $$1, dtc.n, false);
   }

   @Override
   public List<brh> a(@Nullable brh $$0, etk $$1, Predicate<? super brh> $$2) {
      this.af().d("getEntities");
      List<brh> $$3 = Lists.newArrayList();
      this.G().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }

         if ($$3x instanceof cgl) {
            for (cgj $$4 : ((cgl)$$3x).gl()) {
               if ($$3x != $$0 && $$2.test($$4)) {
                  $$3.add($$4);
               }
            }
         }
      });
      return $$3;
   }

   @Override
   public <T extends brh> List<T> a(duo<brh, T> $$0, etk $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends brh> void a(duo<brh, T> $$0, etk $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends brh> void a(duo<brh, T> $$0, etk $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      this.af().d("getEntities");
      this.G().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return awm.a.b;
            }
         }

         if ($$4x instanceof cgl $$5) {
            for (cgj $$6 : $$5.gl()) {
               T $$7 = $$0.a($$6);
               if ($$7 != null && $$2.test($$7)) {
                  $$3.add($$7);
                  if ($$3.size() >= $$4) {
                     return awm.a.b;
                  }
               }
            }
         }

         return awm.a.a;
      });
   }

   @Nullable
   public abstract brh a(int var1);

   public void q(in $$0) {
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

   public boolean a(clh $$0, in $$1) {
      return true;
   }

   public void a(brh $$0, byte $$1) {
   }

   public void a(brh $$0, bqf $$1) {
   }

   public void a(in $$0, dde $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public enx A_() {
      return this.A;
   }

   public czz aa() {
      return this.A.o();
   }

   public abstract bpx s();

   public float b(float $$0) {
      return axz.i($$0, this.x, this.y) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = axz.a($$0, 0.0F, 1.0F);
      this.x = $$1;
      this.y = $$1;
   }

   public float d(float $$0) {
      return axz.i($$0, this.v, this.w);
   }

   public void e(float $$0) {
      float $$1 = axz.a($$0, 0.0F, 1.0F);
      this.v = $$1;
      this.w = $$1;
   }

   public boolean ab() {
      return this.D_().g() && !this.D_().h() ? (double)this.b(1.0F) > 0.9 : false;
   }

   public boolean ac() {
      return (double)this.d(1.0F) > 0.2;
   }

   public boolean r(in $$0) {
      if (!this.ac()) {
         return false;
      } else if (!this.h($$0)) {
         return false;
      } else if (this.a(dvz.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         dbc $$1 = this.t($$0).a();
         return $$1.a($$0) == dbc.c.b;
      }
   }

   @Nullable
   public abstract enp a(enn var1);

   public abstract void a(enn var1, enp var2);

   public abstract enn v();

   public void b(int $$0, in $$1, int $$2) {
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

   public abstract void a(int var1, in var2, int var3);

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<cvq> $$6) {
   }

   public abstract eut L();

   public void c(in $$0, dde $$1) {
      for (is $$2 : is.c.a) {
         in $$3 = $$0.a($$2);
         if (this.B($$3)) {
            dqh $$4 = this.a_($$3);
            if ($$4.a(ddg.gY)) {
               this.a($$4, $$3, $$1, $$0, false);
            } else if ($$4.g(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(ddg.gY)) {
                  this.a($$4, $$3, $$1, $$0, false);
               }
            }
         }
      }
   }

   @Override
   public bpk d_(in $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.B($$0)) {
         $$2 = this.ap();
         $$1 = this.m($$0).u();
      }

      return new bpk(this.ak(), this.Z(), $$1, $$2);
   }

   @Override
   public int B_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public dry C_() {
      return this.F;
   }

   public void a(zb<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public dtz D_() {
      return this.D.a();
   }

   public iw<dtz> ad() {
      return this.D;
   }

   public akg<dad> ae() {
      return this.H;
   }

   @Override
   public ayg E_() {
      return this.z;
   }

   @Override
   public boolean a(in $$0, Predicate<dqh> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(in $$0, Predicate<ema> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract cxg r();

   public in a(int $$0, int $$1, int $$2, int $$3) {
      this.t = this.t * 3 + 1013904223;
      int $$4 = this.t >> 2;
      return new in($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean t() {
      return false;
   }

   public bma af() {
      return this.E.get();
   }

   public Supplier<bma> ag() {
      return this.E;
   }

   @Override
   public dbe F_() {
      return this.G;
   }

   public final boolean ah() {
      return this.d;
   }

   protected abstract duq<brh> G();

   @Override
   public long G_() {
      return this.K++;
   }

   @Override
   public jk H_() {
      return this.I;
   }

   public bqg ai() {
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
