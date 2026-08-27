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

public abstract class cyx implements cyy, AutoCloseable {
   public static final Codec<ajs<cyx>> g = ajs.a(ks.aO);
   public static final ajs<cyx> h = ajs.a(ks.aO, new ajt("overworld"));
   public static final ajs<cyx> i = ajs.a(ks.aO, new ajt("the_nether"));
   public static final ajs<cyx> j = ajs.a(ks.aO, new ajt("the_end"));
   public static final int k = 30000000;
   public static final int l = 512;
   public static final int m = 32;
   public static final int n = 15;
   public static final int o = 24000;
   public static final int p = 20000000;
   public static final int q = -20000000;
   protected final List<dnx> r = Lists.newArrayList();
   protected final elw s;
   private final List<dnx> a = Lists.newArrayList();
   private boolean b;
   private final Thread c;
   private final boolean d;
   private int e;
   protected int t = axr.a().f();
   protected final int u = 1013904223;
   protected float v;
   protected float w;
   protected float x;
   protected float y;
   public final axr z = axr.a();
   @Deprecated
   private final axr f = axr.b();
   private final il<dsr> D;
   protected final emy A;
   private final Supplier<bko> E;
   public final boolean B;
   private final dqq F;
   private final czy G;
   private final ajs<cyx> H;
   private final iz I;
   private final bou J;
   private long K;

   protected cyx(emy $$0, ajs<cyx> $$1, iz $$2, il<dsr> $$3, Supplier<bko> $$4, boolean $$5, boolean $$6, long $$7, int $$8) {
      this.E = $$4;
      this.A = $$0;
      this.D = $$3;
      final dsr $$9 = $$3.a();
      this.H = $$1;
      this.B = $$5;
      if ($$9.k() != 1.0) {
         this.F = new dqq() {
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
         this.F = new dqq();
      }

      this.c = Thread.currentThread();
      this.G = new czy(this, $$7);
      this.d = $$6;
      this.s = new elu(this, $$8);
      this.I = $$2;
      this.J = new bou($$2);
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

   public boolean k(ib $$0) {
      return !this.s($$0) && g($$0);
   }

   public static boolean l(ib $$0) {
      return !b($$0.v()) && g($$0);
   }

   private static boolean g(ib $$0) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000;
   }

   private static boolean b(int $$0) {
      return $$0 < -20000000 || $$0 >= 20000000;
   }

   public drf m(ib $$0) {
      return this.d(je.a($$0.u()), je.a($$0.w()));
   }

   public drf d(int $$0, int $$1) {
      return (drf)this.a($$0, $$1, dru.n);
   }

   @Nullable
   @Override
   public dqv a(int $$0, int $$1, dru $$2, boolean $$3) {
      dqv $$4 = this.M().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(ib $$0, doz $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(ib $$0, doz $$1, int $$2, int $$3) {
      if (this.s($$0)) {
         return false;
      } else if (!this.B && this.ah()) {
         return false;
      } else {
         drf $$4 = this.m($$0);
         dby $$5 = $$1.b();
         doz $$6 = $$4.a($$0, $$1, ($$2 & 64) != 0);
         if ($$6 == null) {
            return false;
         } else {
            doz $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.B || ($$2 & 4) == 0) && (this.B || $$4.D() != null && $$4.D().a(apl.c))) {
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
                  $$1.a((cyy)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(ib $$0, doz $$1, doz $$2) {
   }

   @Override
   public boolean a(ib $$0, boolean $$1) {
      eks $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(ib $$0, boolean $$1, @Nullable bpv $$2, int $$3) {
      doz $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         eks $$5 = this.b_($$0);
         if (!($$4.b() instanceof dbl)) {
            this.c(2001, $$0, dby.i($$4));
         }

         if ($$1) {
            dmf $$6 = $$4.t() ? this.c_($$0) : null;
            dby.a($$4, this, $$0, $$6, $$2, crj.i);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(dts.f, $$0, dts.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(ib $$0, doz $$1) {
   }

   public boolean b(ib $$0, doz $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(ib var1, doz var2, doz var3, int var4);

   public void b(ib $$0, doz $$1, doz $$2) {
   }

   public void a(ib $$0, dby $$1) {
   }

   public void a(ib $$0, dby $$1, ih $$2) {
   }

   public void a(ib $$0, dby $$1, ib $$2) {
   }

   public void a(doz $$0, ib $$1, dby $$2, ib $$3, boolean $$4) {
   }

   @Override
   public void a(ih $$0, doz $$1, ib $$2, ib $$3, int $$4, int $$5) {
      this.s.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int a(dur.a $$0, int $$1, int $$2) {
      int $$4;
      if ($$1 >= -30000000 && $$2 >= -30000000 && $$1 < 30000000 && $$2 < 30000000) {
         if (this.b(je.a($$1), je.a($$2))) {
            $$4 = this.d(je.a($$1), je.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
         } else {
            $$4 = this.I_();
         }
      } else {
         $$4 = this.z_() + 1;
      }

      return $$4;
   }

   @Override
   public ekh y_() {
      return this.M().p();
   }

   @Override
   public doz a_(ib $$0) {
      if (this.s($$0)) {
         return dca.nb.n();
      } else {
         drf $$1 = this.d(je.a($$0.u()), je.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public eks b_(ib $$0) {
      if (this.s($$0)) {
         return ekt.a.g();
      } else {
         drf $$1 = this.m($$0);
         return $$1.b_($$0);
      }
   }

   public boolean Q() {
      return !this.D_().a() && this.e < 4;
   }

   public boolean R() {
      return !this.D_().a() && !this.Q();
   }

   public void a(@Nullable bpv $$0, ib $$1, aul $$2, aun $$3, float $$4, float $$5) {
      this.a($$0 instanceof cjt $$6 ? $$6 : null, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(@Nullable cjt $$0, ib $$1, aul $$2, aun $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable cjt var1, double var2, double var4, double var6, il<aul> var8, aun var9, float var10, float var11, long var12);

   public void a(@Nullable cjt $$0, double $$1, double $$2, double $$3, aul $$4, aun $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, kr.b.e($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable cjt var1, bpv var2, il<aul> var3, aun var4, float var5, float var6, long var7);

   public void a(@Nullable cjt $$0, double $$1, double $$2, double $$3, aul $$4, aun $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 1.0F, 1.0F);
   }

   public void a(@Nullable cjt $$0, double $$1, double $$2, double $$3, aul $$4, aun $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable cjt $$0, bpv $$1, aul $$2, aun $$3, float $$4, float $$5) {
      this.a($$0, $$1, kr.b.e($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(ib $$0, aul $$1, aun $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(bpv $$0, aul $$1, aun $$2, float $$3, float $$4) {
   }

   public void a(double $$0, double $$1, double $$2, aul $$3, aun $$4, float $$5, float $$6, boolean $$7) {
   }

   @Override
   public void a(kj $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(kj $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public void b(kj $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void b(kj $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public float a(float $$0) {
      float $$1 = this.f($$0);
      return $$1 * (float) (Math.PI * 2);
   }

   public void a(dnx $$0) {
      (this.b ? this.a : this.r).add($$0);
   }

   protected void S() {
      bko $$0 = this.af();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.r.addAll(this.a);
         this.a.clear();
      }

      Iterator<dnx> $$1 = this.r.iterator();
      boolean $$2 = this.s().i();

      while ($$1.hasNext()) {
         dnx $$3 = $$1.next();
         if ($$3.b()) {
            $$1.remove();
         } else if ($$2 && this.n($$3.c())) {
            $$3.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends bpv> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Ticking entity");
         p $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new y($$3);
      }
   }

   public boolean h(bpv $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean n(ib $$0) {
      return this.a(cye.a($$0));
   }

   public cyp a(@Nullable bpv $$0, double $$1, double $$2, double $$3, float $$4, cyx.a $$5) {
      return this.a($$0, cyp.a(this, $$0), null, $$1, $$2, $$3, $$4, false, $$5, kl.x, kl.w, aum.jZ);
   }

   public cyp a(@Nullable bpv $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, cyx.a $$6) {
      return this.a($$0, cyp.a(this, $$0), null, $$1, $$2, $$3, $$4, $$5, $$6, kl.x, kl.w, aum.jZ);
   }

   public cyp a(@Nullable bpv $$0, @Nullable bot $$1, @Nullable cyq $$2, esa $$3, float $$4, boolean $$5, cyx.a $$6) {
      return this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6, kl.x, kl.w, aum.jZ);
   }

   public cyp a(@Nullable bpv $$0, @Nullable bot $$1, @Nullable cyq $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, cyx.a $$8) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, kl.x, kl.w, aum.jZ);
   }

   public cyp a(
      @Nullable bpv $$0,
      @Nullable bot $$1,
      @Nullable cyq $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      cyx.a $$8,
      kj $$9,
      kj $$10,
      il<aul> $$11
   ) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, true, $$9, $$10, $$11);
   }

   public cyp a(
      @Nullable bpv $$0,
      @Nullable bot $$1,
      @Nullable cyq $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      cyx.a $$8,
      boolean $$9,
      kj $$10,
      kj $$11,
      il<aul> $$12
   ) {
      cyp.a $$13 = switch ($$8) {
         case a -> cyp.a.a;
         case b -> this.a(cyt.Q);
         case c -> this.aa().b(cyt.c) ? this.a(cyt.R) : cyp.a.a;
         case d -> this.a(cyt.S);
         case e -> cyp.a.d;
      };
      cyp $$14 = new cyp(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$13, $$10, $$11, $$12);
      $$14.c();
      $$14.a($$9);
      return $$14;
   }

   private cyp.a a(cyt.e<cyt.a> $$0) {
      return this.aa().b($$0) ? cyp.a.c : cyp.a.b;
   }

   public abstract String I();

   @Nullable
   @Override
   public dmf c_(ib $$0) {
      if (this.s($$0)) {
         return null;
      } else {
         return !this.B && Thread.currentThread() != this.c ? null : this.m($$0).a($$0, drf.b.a);
      }
   }

   public void a(dmf $$0) {
      ib $$1 = $$0.aA_();
      if (!this.s($$1)) {
         this.m($$1).b($$0);
      }
   }

   public void o(ib $$0) {
      if (!this.s($$0)) {
         this.m($$0).d($$0);
      }
   }

   public boolean p(ib $$0) {
      return this.s($$0) ? false : this.M().b(je.a($$0.u()), je.a($$0.w()));
   }

   public boolean a(ib $$0, bpv $$1, ih $$2) {
      if (this.s($$0)) {
         return false;
      } else {
         dqv $$3 = this.a(je.a($$0.u()), je.a($$0.w()), dru.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(ib $$0, bpv $$1) {
      return this.a($$0, $$1, ih.b);
   }

   public void T() {
      double $$0 = 1.0 - (double)(this.d(1.0F) * 5.0F) / 16.0;
      double $$1 = 1.0 - (double)(this.b(1.0F) * 5.0F) / 16.0;
      double $$2 = 0.5 + 2.0 * axk.a((double)axk.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void b(boolean $$0, boolean $$1) {
      this.M().a($$0, $$1);
   }

   public ib U() {
      ib $$0 = this.A.a();
      if (!this.C_().a($$0)) {
         $$0 = this.a(dur.a.e, ib.a(this.C_().a(), 0.0, this.C_().b()));
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
   public cyd c(int $$0, int $$1) {
      return this.a($$0, $$1, dru.n, false);
   }

   @Override
   public List<bpv> a(@Nullable bpv $$0, erv $$1, Predicate<? super bpv> $$2) {
      this.af().d("getEntities");
      List<bpv> $$3 = Lists.newArrayList();
      this.G().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }

         if ($$3x instanceof cex) {
            for (cev $$4 : ((cex)$$3x).gj()) {
               if ($$3x != $$0 && $$2.test($$4)) {
                  $$3.add($$4);
               }
            }
         }
      });
      return $$3;
   }

   @Override
   public <T extends bpv> List<T> a(dtg<bpv, T> $$0, erv $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends bpv> void a(dtg<bpv, T> $$0, erv $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends bpv> void a(dtg<bpv, T> $$0, erv $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      this.af().d("getEntities");
      this.G().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return avx.a.b;
            }
         }

         if ($$4x instanceof cex $$5) {
            for (cev $$6 : $$5.gj()) {
               T $$7 = $$0.a($$6);
               if ($$7 != null && $$2.test($$7)) {
                  $$3.add($$7);
                  if ($$3.size() >= $$4) {
                     return avx.a.b;
                  }
               }
            }
         }

         return avx.a.a;
      });
   }

   @Nullable
   public abstract bpv a(int var1);

   public void q(ib $$0) {
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

   public boolean a(cjt $$0, ib $$1) {
      return true;
   }

   public void a(bpv $$0, byte $$1) {
   }

   public void a(bpv $$0, bot $$1) {
   }

   public void a(ib $$0, dby $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public emn A_() {
      return this.A;
   }

   public cyt aa() {
      return this.A.o();
   }

   public abstract bol s();

   public float b(float $$0) {
      return axk.i($$0, this.x, this.y) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = axk.a($$0, 0.0F, 1.0F);
      this.x = $$1;
      this.y = $$1;
   }

   public float d(float $$0) {
      return axk.i($$0, this.v, this.w);
   }

   public void e(float $$0) {
      float $$1 = axk.a($$0, 0.0F, 1.0F);
      this.v = $$1;
      this.w = $$1;
   }

   public boolean ab() {
      return this.D_().g() && !this.D_().h() ? (double)this.b(1.0F) > 0.9 : false;
   }

   public boolean ac() {
      return (double)this.d(1.0F) > 0.2;
   }

   public boolean r(ib $$0) {
      if (!this.ac()) {
         return false;
      } else if (!this.h($$0)) {
         return false;
      } else if (this.a(dur.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         czw $$1 = this.t($$0).a();
         return $$1.a($$0) == czw.c.b;
      }
   }

   @Nullable
   public abstract emf a(emd var1);

   public abstract void a(emd var1, emf var2);

   public abstract emd v();

   public void b(int $$0, ib $$1, int $$2) {
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

   public abstract void a(int var1, ib var2, int var3);

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<ctx> $$6) {
   }

   public abstract ete L();

   public void c(ib $$0, dby $$1) {
      for (ih $$2 : ih.c.a) {
         ib $$3 = $$0.a($$2);
         if (this.B($$3)) {
            doz $$4 = this.a_($$3);
            if ($$4.a(dca.gY)) {
               this.a($$4, $$3, $$1, $$0, false);
            } else if ($$4.g(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(dca.gY)) {
                  this.a($$4, $$3, $$1, $$0, false);
               }
            }
         }
      }
   }

   @Override
   public bny d_(ib $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.B($$0)) {
         $$2 = this.ap();
         $$1 = this.m($$0).u();
      }

      return new bny(this.ak(), this.Z(), $$1, $$2);
   }

   @Override
   public int B_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public dqq C_() {
      return this.F;
   }

   public void a(yn<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public dsr D_() {
      return this.D.a();
   }

   public il<dsr> ad() {
      return this.D;
   }

   public ajs<cyx> ae() {
      return this.H;
   }

   @Override
   public axr E_() {
      return this.z;
   }

   @Override
   public boolean a(ib $$0, Predicate<doz> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(ib $$0, Predicate<eks> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract cvm r();

   public ib a(int $$0, int $$1, int $$2, int $$3) {
      this.t = this.t * 3 + 1013904223;
      int $$4 = this.t >> 2;
      return new ib($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean t() {
      return false;
   }

   public bko af() {
      return this.E.get();
   }

   public Supplier<bko> ag() {
      return this.E;
   }

   @Override
   public czy F_() {
      return this.G;
   }

   public final boolean ah() {
      return this.d;
   }

   protected abstract dti<bpv> G();

   @Override
   public long G_() {
      return this.K++;
   }

   @Override
   public iz H_() {
      return this.I;
   }

   public bou ai() {
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
