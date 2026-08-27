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

public abstract class csa implements csb, AutoCloseable {
   public static final Codec<agh<csa>> g = agh.a(jz.aJ);
   public static final agh<csa> h = agh.a(jz.aJ, new agi("overworld"));
   public static final agh<csa> i = agh.a(jz.aJ, new agi("the_nether"));
   public static final agh<csa> j = agh.a(jz.aJ, new agi("the_end"));
   public static final int k = 30000000;
   public static final int l = 512;
   public static final int m = 32;
   public static final int n = 15;
   public static final int o = 24000;
   public static final int p = 20000000;
   public static final int q = -20000000;
   protected final List<dgu> r = Lists.newArrayList();
   protected final edu s;
   private final List<dgu> a = Lists.newArrayList();
   private boolean b;
   private final Thread c;
   private final boolean d;
   private int e;
   protected int t = ats.a().f();
   protected final int u = 1013904223;
   protected float v;
   protected float w;
   protected float x;
   protected float y;
   public final ats z = ats.a();
   @Deprecated
   private final ats f = ats.b();
   private final agh<dkr> D;
   private final ib<dkr> E;
   protected final eeu A;
   private final Supplier<bfo> F;
   public final boolean B;
   private final diz G;
   private final cta H;
   private final agh<csa> I;
   private final ip J;
   private final bjp K;
   private long L;

   protected csa(eeu $$0, agh<csa> $$1, ip $$2, ib<dkr> $$3, Supplier<bfo> $$4, boolean $$5, boolean $$6, long $$7, int $$8) {
      this.F = $$4;
      this.A = $$0;
      this.E = $$3;
      this.D = $$3.e().orElseThrow(() -> new IllegalArgumentException("Dimension must be registered, got " + $$3));
      final dkr $$9 = $$3.a();
      this.I = $$1;
      this.B = $$5;
      if ($$9.k() != 1.0) {
         this.G = new diz() {
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
         this.G = new diz();
      }

      this.c = Thread.currentThread();
      this.H = new cta(this, $$7);
      this.d = $$6;
      this.s = new eds(this, $$8);
      this.J = $$2;
      this.K = new bjp($$2);
   }

   @Override
   public boolean x_() {
      return this.B;
   }

   @Nullable
   @Override
   public MinecraftServer n() {
      return null;
   }

   public boolean j(ht $$0) {
      return !this.r($$0) && D($$0);
   }

   public static boolean k(ht $$0) {
      return !b($$0.v()) && D($$0);
   }

   private static boolean D(ht $$0) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000;
   }

   private static boolean b(int $$0) {
      return $$0 < -20000000 || $$0 >= 20000000;
   }

   public djp l(ht $$0) {
      return this.d(iu.a($$0.u()), iu.a($$0.w()));
   }

   public djp d(int $$0, int $$1) {
      return (djp)this.a($$0, $$1, djj.n);
   }

   @Nullable
   @Override
   public dje a(int $$0, int $$1, djj $$2, boolean $$3) {
      dje $$4 = this.K().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(ht $$0, dhi $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(ht $$0, dhi $$1, int $$2, int $$3) {
      if (this.r($$0)) {
         return false;
      } else if (!this.B && this.ag()) {
         return false;
      } else {
         djp $$4 = this.l($$0);
         cva $$5 = $$1.b();
         dhi $$6 = $$4.a($$0, $$1, ($$2 & 64) != 0);
         if ($$6 == null) {
            return false;
         } else {
            dhi $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.B || ($$2 & 4) == 0) && (this.B || $$4.D() != null && $$4.D().a(alx.c))) {
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
                  $$1.a((csb)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(ht $$0, dhi $$1, dhi $$2) {
   }

   @Override
   public boolean a(ht $$0, boolean $$1) {
      ecs $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(ht $$0, boolean $$1, @Nullable bkq $$2, int $$3) {
      dhi $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         ecs $$5 = this.b_($$0);
         if (!($$4.b() instanceof cun)) {
            this.c(2001, $$0, cva.i($$4));
         }

         if ($$1) {
            dfd $$6 = $$4.t() ? this.c_($$0) : null;
            cva.a($$4, this, $$0, $$6, $$2, clj.b);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(dls.f, $$0, dls.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(ht $$0, dhi $$1) {
   }

   public boolean b(ht $$0, dhi $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(ht var1, dhi var2, dhi var3, int var4);

   public void b(ht $$0, dhi $$1, dhi $$2) {
   }

   public void a(ht $$0, cva $$1) {
   }

   public void a(ht $$0, cva $$1, hx $$2) {
   }

   public void a(ht $$0, cva $$1, ht $$2) {
   }

   public void a(dhi $$0, ht $$1, cva $$2, ht $$3, boolean $$4) {
   }

   @Override
   public void a(hx $$0, dhi $$1, ht $$2, ht $$3, int $$4, int $$5) {
      this.s.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int a(dmr.a $$0, int $$1, int $$2) {
      int $$4;
      if ($$1 >= -30000000 && $$2 >= -30000000 && $$1 < 30000000 && $$2 < 30000000) {
         if (this.b(iu.a($$1), iu.a($$2))) {
            $$4 = this.d(iu.a($$1), iu.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
         } else {
            $$4 = this.I_();
         }
      } else {
         $$4 = this.z_() + 1;
      }

      return $$4;
   }

   @Override
   public ech y_() {
      return this.K().p();
   }

   @Override
   public dhi a_(ht $$0) {
      if (this.r($$0)) {
         return cvc.nb.o();
      } else {
         djp $$1 = this.d(iu.a($$0.u()), iu.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public ecs b_(ht $$0) {
      if (this.r($$0)) {
         return ect.a.g();
      } else {
         djp $$1 = this.l($$0);
         return $$1.b_($$0);
      }
   }

   public boolean O() {
      return !this.D_().a() && this.e < 4;
   }

   public boolean P() {
      return !this.D_().a() && !this.O();
   }

   public void a(@Nullable bkq $$0, ht $$1, aqq $$2, aqs $$3, float $$4, float $$5) {
      this.a($$0 instanceof cdu $$6 ? $$6 : null, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(@Nullable cdu $$0, ht $$1, aqq $$2, aqs $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable cdu var1, double var2, double var4, double var6, ib<aqq> var8, aqs var9, float var10, float var11, long var12);

   public void a(@Nullable cdu $$0, double $$1, double $$2, double $$3, aqq $$4, aqs $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, jy.c.d($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable cdu var1, bkq var2, ib<aqq> var3, aqs var4, float var5, float var6, long var7);

   public void a(@Nullable cdu $$0, double $$1, double $$2, double $$3, aqq $$4, aqs $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 1.0F, 1.0F);
   }

   public void a(@Nullable cdu $$0, double $$1, double $$2, double $$3, aqq $$4, aqs $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable cdu $$0, bkq $$1, aqq $$2, aqs $$3, float $$4, float $$5) {
      this.a($$0, $$1, jy.c.d($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(ht $$0, aqq $$1, aqs $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(double $$0, double $$1, double $$2, aqq $$3, aqs $$4, float $$5, float $$6, boolean $$7) {
   }

   @Override
   public void a(jq $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(jq $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public void b(jq $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void b(jq $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public float a(float $$0) {
      float $$1 = this.f($$0);
      return $$1 * (float) (Math.PI * 2);
   }

   public void a(dgu $$0) {
      (this.b ? this.a : this.r).add($$0);
   }

   protected void Q() {
      bfo $$0 = this.ae();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.r.addAll(this.a);
         this.a.clear();
      }

      Iterator<dgu> $$1 = this.r.iterator();
      boolean $$2 = this.r().i();

      while ($$1.hasNext()) {
         dgu $$3 = $$1.next();
         if ($$3.b()) {
            $$1.remove();
         } else if ($$2 && this.m($$3.c())) {
            $$3.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends bkq> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Ticking entity");
         p $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new y($$3);
      }
   }

   public boolean h(bkq $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean m(ht $$0) {
      return this.a(crh.a($$0));
   }

   public crs a(@Nullable bkq $$0, double $$1, double $$2, double $$3, float $$4, csa.a $$5) {
      return this.a($$0, null, null, $$1, $$2, $$3, $$4, false, $$5);
   }

   public crs a(@Nullable bkq $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, csa.a $$6) {
      return this.a($$0, null, null, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public crs a(@Nullable bkq $$0, @Nullable bjo $$1, @Nullable crt $$2, eju $$3, float $$4, boolean $$5, csa.a $$6) {
      return this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6);
   }

   public crs a(@Nullable bkq $$0, @Nullable bjo $$1, @Nullable crt $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, csa.a $$8) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, true);
   }

   public crs a(@Nullable bkq $$0, @Nullable bjo $$1, @Nullable crt $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, csa.a $$8, boolean $$9) {
      crs.a $$10 = switch ($$8) {
         case a -> crs.a.a;
         case b -> this.a(crw.Q);
         case c -> this.Y().b(crw.c) ? this.a(crw.R) : crs.a.a;
         case d -> this.a(crw.S);
      };
      crs $$11 = new crs(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$10);
      $$11.a();
      $$11.a($$9);
      return $$11;
   }

   private crs.a a(crw.e<crw.a> $$0) {
      return this.Y().b($$0) ? crs.a.c : crs.a.b;
   }

   public abstract String G();

   @Nullable
   @Override
   public dfd c_(ht $$0) {
      if (this.r($$0)) {
         return null;
      } else {
         return !this.B && Thread.currentThread() != this.c ? null : this.l($$0).a($$0, djp.b.a);
      }
   }

   public void a(dfd $$0) {
      ht $$1 = $$0.p();
      if (!this.r($$1)) {
         this.l($$1).b($$0);
      }
   }

   public void n(ht $$0) {
      if (!this.r($$0)) {
         this.l($$0).d($$0);
      }
   }

   public boolean o(ht $$0) {
      return this.r($$0) ? false : this.K().b(iu.a($$0.u()), iu.a($$0.w()));
   }

   public boolean a(ht $$0, bkq $$1, hx $$2) {
      if (this.r($$0)) {
         return false;
      } else {
         dje $$3 = this.a(iu.a($$0.u()), iu.a($$0.w()), djj.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(ht $$0, bkq $$1) {
      return this.a($$0, $$1, hx.b);
   }

   public void R() {
      double $$0 = 1.0 - (double)(this.d(1.0F) * 5.0F) / 16.0;
      double $$1 = 1.0 - (double)(this.b(1.0F) * 5.0F) / 16.0;
      double $$2 = 0.5 + 2.0 * atm.a((double)atm.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void b(boolean $$0, boolean $$1) {
      this.K().a($$0, $$1);
   }

   public ht S() {
      ht $$0 = new ht(this.A.a(), this.A.b(), this.A.c());
      if (!this.C_().a($$0)) {
         $$0 = this.a(dmr.a.e, ht.a(this.C_().a(), 0.0, this.C_().b()));
      }

      return $$0;
   }

   public float T() {
      return this.A.d();
   }

   protected void U() {
      if (this.A.k()) {
         this.w = 1.0F;
         if (this.A.i()) {
            this.y = 1.0F;
         }
      }
   }

   @Override
   public void close() throws IOException {
      this.K().close();
   }

   @Nullable
   @Override
   public crg c(int $$0, int $$1) {
      return this.a($$0, $$1, djj.n, false);
   }

   @Override
   public List<bkq> a(@Nullable bkq $$0, ejp $$1, Predicate<? super bkq> $$2) {
      this.ae().d("getEntities");
      List<bkq> $$3 = Lists.newArrayList();
      this.F().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }

         if ($$3x instanceof bzh) {
            for (bzf $$4 : ((bzh)$$3x).gb()) {
               if ($$3x != $$0 && $$2.test($$4)) {
                  $$3.add($$4);
               }
            }
         }
      });
      return $$3;
   }

   @Override
   public <T extends bkq> List<T> a(dlg<bkq, T> $$0, ejp $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends bkq> void a(dlg<bkq, T> $$0, ejp $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends bkq> void a(dlg<bkq, T> $$0, ejp $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      this.ae().d("getEntities");
      this.F().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return asb.a.b;
            }
         }

         if ($$4x instanceof bzh $$5) {
            for (bzf $$6 : $$5.gb()) {
               T $$7 = $$0.a($$6);
               if ($$7 != null && $$2.test($$7)) {
                  $$3.add($$7);
                  if ($$3.size() >= $$4) {
                     return asb.a.b;
                  }
               }
            }
         }

         return asb.a.a;
      });
   }

   @Nullable
   public abstract bkq a(int var1);

   public void p(ht $$0) {
      if (this.A($$0)) {
         this.l($$0).a(true);
      }
   }

   @Override
   public int z_() {
      return 63;
   }

   public void V() {
   }

   public long W() {
      return this.A.e();
   }

   public long X() {
      return this.A.f();
   }

   public boolean a(cdu $$0, ht $$1) {
      return true;
   }

   public void a(bkq $$0, byte $$1) {
   }

   public void a(bkq $$0, bjo $$1) {
   }

   public void a(ht $$0, cva $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public eej A_() {
      return this.A;
   }

   public crw Y() {
      return this.A.q();
   }

   public abstract bjg r();

   public float b(float $$0) {
      return atm.i($$0, this.x, this.y) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = atm.a($$0, 0.0F, 1.0F);
      this.x = $$1;
      this.y = $$1;
   }

   public float d(float $$0) {
      return atm.i($$0, this.v, this.w);
   }

   public void e(float $$0) {
      float $$1 = atm.a($$0, 0.0F, 1.0F);
      this.v = $$1;
      this.w = $$1;
   }

   public boolean Z() {
      return this.D_().g() && !this.D_().h() ? (double)this.b(1.0F) > 0.9 : false;
   }

   public boolean aa() {
      return (double)this.d(1.0F) > 0.2;
   }

   public boolean q(ht $$0) {
      if (!this.aa()) {
         return false;
      } else if (!this.g($$0)) {
         return false;
      } else if (this.a(dmr.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         csy $$1 = this.s($$0).a();
         return $$1.a($$0) == csy.c.b;
      }
   }

   @Nullable
   public abstract eec a(String var1);

   public abstract void a(String var1, eec var2);

   public abstract int u();

   public void b(int $$0, ht $$1, int $$2) {
   }

   public p a(o $$0) {
      p $$1 = $$0.a("Affected level", 1);
      $$1.a("All players", () -> this.w().size() + " total; " + this.w());
      $$1.a("Chunk stats", this.K()::e);
      $$1.a("Level dimension", () -> this.ad().a().toString());

      try {
         this.A.a($$1, this);
      } catch (Throwable var4) {
         $$1.a("Level Data Unobtainable", var4);
      }

      return $$1;
   }

   public abstract void a(int var1, ht var2, int var3);

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, @Nullable rz $$6) {
   }

   public abstract ekt J();

   public void c(ht $$0, cva $$1) {
      for (hx $$2 : hx.c.a) {
         ht $$3 = $$0.a($$2);
         if (this.A($$3)) {
            dhi $$4 = this.a_($$3);
            if ($$4.a(cvc.gY)) {
               this.a($$4, $$3, $$1, $$0, false);
            } else if ($$4.g(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(cvc.gY)) {
                  this.a($$4, $$3, $$1, $$0, false);
               }
            }
         }
      }
   }

   @Override
   public biv d_(ht $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.A($$0)) {
         $$2 = this.ao();
         $$1 = this.l($$0).u();
      }

      return new biv(this.aj(), this.X(), $$1, $$2);
   }

   @Override
   public int B_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public diz C_() {
      return this.G;
   }

   public void a(wk<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public dkr D_() {
      return this.E.a();
   }

   public agh<dkr> ab() {
      return this.D;
   }

   public ib<dkr> ac() {
      return this.E;
   }

   public agh<csa> ad() {
      return this.I;
   }

   @Override
   public ats E_() {
      return this.z;
   }

   @Override
   public boolean a(ht $$0, Predicate<dhi> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(ht $$0, Predicate<ecs> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract cor q();

   public ht a(int $$0, int $$1, int $$2, int $$3) {
      this.t = this.t * 3 + 1013904223;
      int $$4 = this.t >> 2;
      return new ht($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean s() {
      return false;
   }

   public bfo ae() {
      return this.F.get();
   }

   public Supplier<bfo> af() {
      return this.F;
   }

   @Override
   public cta F_() {
      return this.H;
   }

   public final boolean ag() {
      return this.d;
   }

   protected abstract dli<bkq> F();

   @Override
   public long G_() {
      return this.L++;
   }

   @Override
   public ip H_() {
      return this.J;
   }

   public bjp ah() {
      return this.K;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
