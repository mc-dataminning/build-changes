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

public abstract class dcw implements dcx, AutoCloseable {
   public static final Codec<akq<dcw>> g = akq.a(lu.ba);
   public static final akq<dcw> h = akq.a(lu.ba, akr.b("overworld"));
   public static final akq<dcw> i = akq.a(lu.ba, akr.b("the_nether"));
   public static final akq<dcw> j = akq.a(lu.ba, akr.b("the_end"));
   public static final int k = 30000000;
   public static final int l = 512;
   public static final int m = 32;
   public static final int n = 15;
   public static final int o = 24000;
   public static final int p = 20000000;
   public static final int q = -20000000;
   protected final List<dsa> r = Lists.newArrayList();
   protected final eqi s;
   private final List<dsa> a = Lists.newArrayList();
   private boolean b;
   private final Thread c;
   private final boolean d;
   private int e;
   protected int t = ayw.a().f();
   protected final int u = 1013904223;
   protected float v;
   protected float w;
   protected float x;
   protected float y;
   public final ayw z = ayw.a();
   @Deprecated
   private final ayw f = ayw.b();
   private final jm<dwy> D;
   protected final erm A;
   private final Supplier<bnf> E;
   public final boolean B;
   private final dut F;
   private final ddy G;
   private final akq<dcw> H;
   private final ka I;
   private final brl J;
   private long K;

   protected dcw(erm $$0, akq<dcw> $$1, ka $$2, jm<dwy> $$3, Supplier<bnf> $$4, boolean $$5, boolean $$6, long $$7, int $$8) {
      this.E = $$4;
      this.A = $$0;
      this.D = $$3;
      final dwy $$9 = $$3.a();
      this.H = $$1;
      this.B = $$5;
      if ($$9.k() != 1.0) {
         this.F = new dut() {
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
         this.F = new dut();
      }

      this.c = Thread.currentThread();
      this.G = new ddy(this, $$7);
      this.d = $$6;
      this.s = new eqg(this, $$8);
      this.I = $$2;
      this.J = new brl($$2);
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

   public boolean k(jd $$0) {
      return !this.s($$0) && g($$0);
   }

   public static boolean l(jd $$0) {
      return !b($$0.v()) && g($$0);
   }

   private static boolean g(jd $$0) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000;
   }

   private static boolean b(int $$0) {
      return $$0 < -20000000 || $$0 >= 20000000;
   }

   public dvi m(jd $$0) {
      return this.d(kf.a($$0.u()), kf.a($$0.w()));
   }

   public dvi d(int $$0, int $$1) {
      return (dvi)this.a($$0, $$1, dvz.n);
   }

   @Nullable
   @Override
   public duy a(int $$0, int $$1, dvz $$2, boolean $$3) {
      duy $$4 = this.N().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(jd $$0, dtc $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(jd $$0, dtc $$1, int $$2, int $$3) {
      if (this.s($$0)) {
         return false;
      } else if (!this.B && this.ai()) {
         return false;
      } else {
         dvi $$4 = this.m($$0);
         dfy $$5 = $$1.b();
         dtc $$6 = $$4.a($$0, $$1, ($$2 & 64) != 0);
         if ($$6 == null) {
            return false;
         } else {
            dtc $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.B || ($$2 & 4) == 0) && (this.B || $$4.D() != null && $$4.D().a(aql.c))) {
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
                  $$1.a((dcx)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(jd $$0, dtc $$1, dtc $$2) {
   }

   @Override
   public boolean a(jd $$0, boolean $$1) {
      epe $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(jd $$0, boolean $$1, @Nullable bsr $$2, int $$3) {
      dtc $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         epe $$5 = this.b_($$0);
         if (!($$4.b() instanceof dfl)) {
            this.c(2001, $$0, dfy.i($$4));
         }

         if ($$1) {
            dqh $$6 = $$4.t() ? this.c_($$0) : null;
            dfy.a($$4, this, $$0, $$6, $$2, cuq.l);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(dxz.f, $$0, dxz.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(jd $$0, dtc $$1) {
   }

   public boolean b(jd $$0, dtc $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(jd var1, dtc var2, dtc var3, int var4);

   public void b(jd $$0, dtc $$1, dtc $$2) {
   }

   public void a(jd $$0, dfy $$1) {
   }

   public void a(jd $$0, dfy $$1, ji $$2) {
   }

   public void a(jd $$0, dfy $$1, jd $$2) {
   }

   public void a(dtc $$0, jd $$1, dfy $$2, jd $$3, boolean $$4) {
   }

   @Override
   public void a(ji $$0, dtc $$1, jd $$2, jd $$3, int $$4, int $$5) {
      this.s.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int a(dyy.a $$0, int $$1, int $$2) {
      int $$4;
      if ($$1 >= -30000000 && $$2 >= -30000000 && $$1 < 30000000 && $$2 < 30000000) {
         if (this.b(kf.a($$1), kf.a($$2))) {
            $$4 = this.d(kf.a($$1), kf.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
         } else {
            $$4 = this.I_();
         }
      } else {
         $$4 = this.z_() + 1;
      }

      return $$4;
   }

   @Override
   public eot y_() {
      return this.N().p();
   }

   @Override
   public dtc a_(jd $$0) {
      if (this.s($$0)) {
         return dga.nb.o();
      } else {
         dvi $$1 = this.d(kf.a($$0.u()), kf.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public epe b_(jd $$0) {
      if (this.s($$0)) {
         return epf.a.g();
      } else {
         dvi $$1 = this.m($$0);
         return $$1.b_($$0);
      }
   }

   public boolean R() {
      return !this.D_().a() && this.e < 4;
   }

   public boolean S() {
      return !this.D_().a() && !this.R();
   }

   public void a(@Nullable bsr $$0, jd $$1, avo $$2, avq $$3, float $$4, float $$5) {
      this.a($$0 instanceof cmx $$6 ? $$6 : null, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(@Nullable cmx $$0, jd $$1, avo $$2, avq $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable cmx var1, double var2, double var4, double var6, jm<avo> var8, avq var9, float var10, float var11, long var12);

   public void a(@Nullable cmx $$0, double $$1, double $$2, double $$3, avo $$4, avq $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, lt.b.e($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable cmx var1, bsr var2, jm<avo> var3, avq var4, float var5, float var6, long var7);

   public void a(@Nullable cmx $$0, double $$1, double $$2, double $$3, avo $$4, avq $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 1.0F, 1.0F);
   }

   public void a(@Nullable cmx $$0, double $$1, double $$2, double $$3, avo $$4, avq $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable cmx $$0, double $$1, double $$2, double $$3, jm<avo> $$4, avq $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable cmx $$0, bsr $$1, avo $$2, avq $$3, float $$4, float $$5) {
      this.a($$0, $$1, lt.b.e($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(jd $$0, avo $$1, avq $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(bsr $$0, avo $$1, avq $$2, float $$3, float $$4) {
   }

   public void a(double $$0, double $$1, double $$2, avo $$3, avq $$4, float $$5, float $$6, boolean $$7) {
   }

   @Override
   public void a(lk $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(lk $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public void b(lk $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void b(lk $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public float a(float $$0) {
      float $$1 = this.f($$0);
      return $$1 * (float) (Math.PI * 2);
   }

   public void a(dsa $$0) {
      (this.b ? this.a : this.r).add($$0);
   }

   protected void T() {
      bnf $$0 = this.ag();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.r.addAll(this.a);
         this.a.clear();
      }

      Iterator<dsa> $$1 = this.r.iterator();
      boolean $$2 = this.s().i();

      while ($$1.hasNext()) {
         dsa $$3 = $$1.next();
         if ($$3.b()) {
            $$1.remove();
         } else if ($$2 && this.n($$3.c())) {
            $$3.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends bsr> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Ticking entity");
         p $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new z($$3);
      }
   }

   public boolean h(bsr $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean n(jd $$0) {
      return this.a(dcd.a($$0));
   }

   public dco a(@Nullable bsr $$0, double $$1, double $$2, double $$3, float $$4, dcw.a $$5) {
      return this.a($$0, dco.a(this, $$0), null, $$1, $$2, $$3, $$4, false, $$5, lm.w, lm.v, avp.ke);
   }

   public dco a(@Nullable bsr $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, dcw.a $$6) {
      return this.a($$0, dco.a(this, $$0), null, $$1, $$2, $$3, $$4, $$5, $$6, lm.w, lm.v, avp.ke);
   }

   public dco a(@Nullable bsr $$0, @Nullable brk $$1, @Nullable dcp $$2, exc $$3, float $$4, boolean $$5, dcw.a $$6) {
      return this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6, lm.w, lm.v, avp.ke);
   }

   public dco a(@Nullable bsr $$0, @Nullable brk $$1, @Nullable dcp $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, dcw.a $$8) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, lm.w, lm.v, avp.ke);
   }

   public dco a(
      @Nullable bsr $$0,
      @Nullable brk $$1,
      @Nullable dcp $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dcw.a $$8,
      lk $$9,
      lk $$10,
      jm<avo> $$11
   ) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, true, $$9, $$10, $$11);
   }

   public dco a(
      @Nullable bsr $$0,
      @Nullable brk $$1,
      @Nullable dcp $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dcw.a $$8,
      boolean $$9,
      lk $$10,
      lk $$11,
      jm<avo> $$12
   ) {
      dco.a $$13 = switch ($$8) {
         case a -> dco.a.a;
         case b -> this.a(dcs.Q);
         case c -> this.ab().b(dcs.c) ? this.a(dcs.R) : dco.a.a;
         case d -> this.a(dcs.S);
         case e -> dco.a.d;
      };
      dco $$14 = new dco(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$13, $$10, $$11, $$12);
      $$14.c();
      $$14.a($$9);
      return $$14;
   }

   private dco.a a(dcs.e<dcs.a> $$0) {
      return this.ab().b($$0) ? dco.a.c : dco.a.b;
   }

   public abstract String I();

   @Nullable
   @Override
   public dqh c_(jd $$0) {
      if (this.s($$0)) {
         return null;
      } else {
         return !this.B && Thread.currentThread() != this.c ? null : this.m($$0).a($$0, dvi.b.a);
      }
   }

   public void a(dqh $$0) {
      jd $$1 = $$0.aD_();
      if (!this.s($$1)) {
         this.m($$1).b($$0);
      }
   }

   public void o(jd $$0) {
      if (!this.s($$0)) {
         this.m($$0).d($$0);
      }
   }

   public boolean p(jd $$0) {
      return this.s($$0) ? false : this.N().b(kf.a($$0.u()), kf.a($$0.w()));
   }

   public boolean a(jd $$0, bsr $$1, ji $$2) {
      if (this.s($$0)) {
         return false;
      } else {
         duy $$3 = this.a(kf.a($$0.u()), kf.a($$0.w()), dvz.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(jd $$0, bsr $$1) {
      return this.a($$0, $$1, ji.b);
   }

   public void U() {
      double $$0 = 1.0 - (double)(this.d(1.0F) * 5.0F) / 16.0;
      double $$1 = 1.0 - (double)(this.b(1.0F) * 5.0F) / 16.0;
      double $$2 = 0.5 + 2.0 * ayo.a((double)ayo.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void b(boolean $$0, boolean $$1) {
      this.N().a($$0, $$1);
   }

   public jd V() {
      jd $$0 = this.A.a();
      if (!this.C_().a($$0)) {
         $$0 = this.a(dyy.a.e, jd.a(this.C_().a(), 0.0, this.C_().b()));
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
   public dcc c(int $$0, int $$1) {
      return this.a($$0, $$1, dvz.n, false);
   }

   @Override
   public List<bsr> a(@Nullable bsr $$0, ewx $$1, Predicate<? super bsr> $$2) {
      this.ag().d("getEntities");
      List<bsr> $$3 = Lists.newArrayList();
      this.G().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }

         if ($$3x instanceof cia) {
            for (chy $$4 : ((cia)$$3x).gg()) {
               if ($$3x != $$0 && $$2.test($$4)) {
                  $$3.add($$4);
               }
            }
         }
      });
      return $$3;
   }

   @Override
   public <T extends bsr> List<T> a(dxn<bsr, T> $$0, ewx $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends bsr> void a(dxn<bsr, T> $$0, ewx $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends bsr> void a(dxn<bsr, T> $$0, ewx $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      this.ag().d("getEntities");
      this.G().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return axa.a.b;
            }
         }

         if ($$4x instanceof cia $$5) {
            for (chy $$6 : $$5.gg()) {
               T $$7 = $$0.a($$6);
               if ($$7 != null && $$2.test($$7)) {
                  $$3.add($$7);
                  if ($$3.size() >= $$4) {
                     return axa.a.b;
                  }
               }
            }
         }

         return axa.a.a;
      });
   }

   @Nullable
   public abstract bsr a(int var1);

   public void q(jd $$0) {
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

   public boolean a(cmx $$0, jd $$1) {
      return true;
   }

   public void a(bsr $$0, byte $$1) {
   }

   public void a(bsr $$0, brk $$1) {
   }

   public void a(jd $$0, dfy $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public erb A_() {
      return this.A;
   }

   public dcs ab() {
      return this.A.o();
   }

   public abstract brc s();

   public float b(float $$0) {
      return ayo.i($$0, this.x, this.y) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = ayo.a($$0, 0.0F, 1.0F);
      this.x = $$1;
      this.y = $$1;
   }

   public float d(float $$0) {
      return ayo.i($$0, this.v, this.w);
   }

   public void e(float $$0) {
      float $$1 = ayo.a($$0, 0.0F, 1.0F);
      this.v = $$1;
      this.w = $$1;
   }

   public boolean ac() {
      return this.D_().g() && !this.D_().h() ? (double)this.b(1.0F) > 0.9 : false;
   }

   public boolean ad() {
      return (double)this.d(1.0F) > 0.2;
   }

   public boolean r(jd $$0) {
      if (!this.ad()) {
         return false;
      } else if (!this.h($$0)) {
         return false;
      } else if (this.a(dyy.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         ddw $$1 = this.t($$0).a();
         return $$1.a($$0) == ddw.c.b;
      }
   }

   @Nullable
   public abstract eqt a(eqr var1);

   public abstract void a(eqr var1, eqt var2);

   public abstract eqr v();

   public void b(int $$0, jd $$1, int $$2) {
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

   public abstract void a(int var1, jd var2, int var3);

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<cxl> $$6) {
   }

   public abstract eyg M();

   public void c(jd $$0, dfy $$1) {
      for (ji $$2 : ji.c.a) {
         jd $$3 = $$0.a($$2);
         if (this.B($$3)) {
            dtc $$4 = this.a_($$3);
            if ($$4.a(dga.gY)) {
               this.a($$4, $$3, $$1, $$0, false);
            } else if ($$4.g(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(dga.gY)) {
                  this.a($$4, $$3, $$1, $$0, false);
               }
            }
         }
      }
   }

   @Override
   public bqp d_(jd $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.B($$0)) {
         $$2 = this.aq();
         $$1 = this.m($$0).u();
      }

      return new bqp(this.al(), this.aa(), $$1, $$2);
   }

   @Override
   public int B_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public dut C_() {
      return this.F;
   }

   public void a(zg<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public dwy D_() {
      return this.D.a();
   }

   public jm<dwy> ae() {
      return this.D;
   }

   public akq<dcw> af() {
      return this.H;
   }

   @Override
   public ayw E_() {
      return this.z;
   }

   @Override
   public boolean a(jd $$0, Predicate<dtc> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(jd $$0, Predicate<epe> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract czd r();

   public jd a(int $$0, int $$1, int $$2, int $$3) {
      this.t = this.t * 3 + 1013904223;
      int $$4 = this.t >> 2;
      return new jd($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean t() {
      return false;
   }

   public bnf ag() {
      return this.E.get();
   }

   public Supplier<bnf> ah() {
      return this.E;
   }

   @Override
   public ddy F_() {
      return this.G;
   }

   public final boolean ai() {
      return this.d;
   }

   protected abstract dxp<bsr> G();

   @Override
   public long G_() {
      return this.K++;
   }

   @Override
   public ka H_() {
      return this.I;
   }

   public brl aj() {
      return this.J;
   }

   public abstract cwt K();

   public static enum a implements azk {
      a("none"),
      b("block"),
      c("mob"),
      d("tnt"),
      e("trigger");

      public static final Codec<dcw.a> f = azk.a(dcw.a::values);
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
