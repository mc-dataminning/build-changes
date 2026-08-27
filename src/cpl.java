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

public abstract class cpl implements cpm, AutoCloseable {
   public static final Codec<aeq<cpl>> g = aeq.a(jc.aH);
   public static final aeq<cpl> h = aeq.a(jc.aH, new aer("overworld"));
   public static final aeq<cpl> i = aeq.a(jc.aH, new aer("the_nether"));
   public static final aeq<cpl> j = aeq.a(jc.aH, new aer("the_end"));
   public static final int k = 30000000;
   public static final int l = 512;
   public static final int m = 32;
   public static final int n = 15;
   public static final int o = 24000;
   public static final int p = 20000000;
   public static final int q = -20000000;
   protected final List<deb> r = Lists.newArrayList();
   protected final ebe s;
   private final List<deb> a = Lists.newArrayList();
   private boolean b;
   private final Thread c;
   private final boolean d;
   private int e;
   protected int t = aru.a().f();
   protected final int u = 1013904223;
   protected float v;
   protected float w;
   protected float x;
   protected float y;
   public final aru z = aru.a();
   @Deprecated
   private final aru f = aru.b();
   private final aeq<dii> D;
   private final he<dii> E;
   protected final ecd A;
   private final Supplier<bdh> F;
   public final boolean B;
   private final dgq G;
   private final cql H;
   private final aeq<cpl> I;
   private final hs J;
   private final bhh K;
   private long L;

   protected cpl(ecd $$0, aeq<cpl> $$1, hs $$2, he<dii> $$3, Supplier<bdh> $$4, boolean $$5, boolean $$6, long $$7, int $$8) {
      this.F = $$4;
      this.A = $$0;
      this.E = $$3;
      this.D = $$3.e().orElseThrow(() -> new IllegalArgumentException("Dimension must be registered, got " + $$3));
      final dii $$9 = $$3.a();
      this.I = $$1;
      this.B = $$5;
      if ($$9.k() != 1.0) {
         this.G = new dgq() {
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
         this.G = new dgq();
      }

      this.c = Thread.currentThread();
      this.H = new cql(this, $$7);
      this.d = $$6;
      this.s = new ebc(this, $$8);
      this.J = $$2;
      this.K = new bhh($$2);
   }

   @Override
   public boolean r_() {
      return this.B;
   }

   @Nullable
   @Override
   public MinecraftServer n() {
      return null;
   }

   public boolean j(gu $$0) {
      return !this.r($$0) && D($$0);
   }

   public static boolean k(gu $$0) {
      return !b($$0.v()) && D($$0);
   }

   private static boolean D(gu $$0) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000;
   }

   private static boolean b(int $$0) {
      return $$0 < -20000000 || $$0 >= 20000000;
   }

   public dhg l(gu $$0) {
      return this.d(hx.a($$0.u()), hx.a($$0.w()));
   }

   public dhg d(int $$0, int $$1) {
      return (dhg)this.a($$0, $$1, dha.n);
   }

   @Nullable
   @Override
   public dgv a(int $$0, int $$1, dha $$2, boolean $$3) {
      dgv $$4 = this.J().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(gu $$0, dez $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(gu $$0, dez $$1, int $$2, int $$3) {
      if (this.r($$0)) {
         return false;
      } else if (!this.B && this.af()) {
         return false;
      } else {
         dhg $$4 = this.l($$0);
         csl $$5 = $$1.b();
         dez $$6 = $$4.a($$0, $$1, ($$2 & 64) != 0);
         if ($$6 == null) {
            return false;
         } else {
            dez $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.B || ($$2 & 4) == 0) && (this.B || $$4.D() != null && $$4.D().a(akd.c))) {
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
                  $$1.a((cpm)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(gu $$0, dez $$1, dez $$2) {
   }

   @Override
   public boolean a(gu $$0, boolean $$1) {
      eac $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(gu $$0, boolean $$1, @Nullable bii $$2, int $$3) {
      dez $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         eac $$5 = this.b_($$0);
         if (!($$4.b() instanceof crz)) {
            this.c(2001, $$0, csl.i($$4));
         }

         if ($$1) {
            dcl $$6 = $$4.t() ? this.c_($$0) : null;
            csl.a($$4, this, $$0, $$6, $$2, cix.b);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(djj.f, $$0, djj.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(gu $$0, dez $$1) {
   }

   public boolean b(gu $$0, dez $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(gu var1, dez var2, dez var3, int var4);

   public void b(gu $$0, dez $$1, dez $$2) {
   }

   public void a(gu $$0, csl $$1) {
   }

   public void a(gu $$0, csl $$1, ha $$2) {
   }

   public void a(gu $$0, csl $$1, gu $$2) {
   }

   public void a(dez $$0, gu $$1, csl $$2, gu $$3, boolean $$4) {
   }

   @Override
   public void a(ha $$0, dez $$1, gu $$2, gu $$3, int $$4, int $$5) {
      this.s.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int a(dki.a $$0, int $$1, int $$2) {
      int $$4;
      if ($$1 >= -30000000 && $$2 >= -30000000 && $$1 < 30000000 && $$2 < 30000000) {
         if (this.b(hx.a($$1), hx.a($$2))) {
            $$4 = this.d(hx.a($$1), hx.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
         } else {
            $$4 = this.C_();
         }
      } else {
         $$4 = this.t_() + 1;
      }

      return $$4;
   }

   @Override
   public dzr s_() {
      return this.J().p();
   }

   @Override
   public dez a_(gu $$0) {
      if (this.r($$0)) {
         return csm.nb.n();
      } else {
         dhg $$1 = this.d(hx.a($$0.u()), hx.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public eac b_(gu $$0) {
      if (this.r($$0)) {
         return ead.a.g();
      } else {
         dhg $$1 = this.l($$0);
         return $$1.b_($$0);
      }
   }

   public boolean N() {
      return !this.x_().a() && this.e < 4;
   }

   public boolean O() {
      return !this.x_().a() && !this.N();
   }

   public void a(@Nullable bii $$0, gu $$1, aov $$2, aox $$3, float $$4, float $$5) {
      this.a($$0 instanceof cbm $$6 ? $$6 : null, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(@Nullable cbm $$0, gu $$1, aov $$2, aox $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable cbm var1, double var2, double var4, double var6, he<aov> var8, aox var9, float var10, float var11, long var12);

   public void a(@Nullable cbm $$0, double $$1, double $$2, double $$3, aov $$4, aox $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, jb.c.d($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable cbm var1, bii var2, he<aov> var3, aox var4, float var5, float var6, long var7);

   public void a(@Nullable cbm $$0, double $$1, double $$2, double $$3, aov $$4, aox $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable cbm $$0, bii $$1, aov $$2, aox $$3, float $$4, float $$5) {
      this.a($$0, $$1, jb.c.d($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(gu $$0, aov $$1, aox $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(double $$0, double $$1, double $$2, aov $$3, aox $$4, float $$5, float $$6, boolean $$7) {
   }

   @Override
   public void a(it $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(it $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public void b(it $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void b(it $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public float a(float $$0) {
      float $$1 = this.f($$0);
      return $$1 * (float) (Math.PI * 2);
   }

   public void a(deb $$0) {
      (this.b ? this.a : this.r).add($$0);
   }

   protected void P() {
      bdh $$0 = this.ad();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.r.addAll(this.a);
         this.a.clear();
      }

      Iterator<deb> $$1 = this.r.iterator();

      while ($$1.hasNext()) {
         deb $$2 = $$1.next();
         if ($$2.b()) {
            $$1.remove();
         } else if (this.m($$2.c())) {
            $$2.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends bii> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Ticking entity");
         p $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new y($$3);
      }
   }

   public boolean h(bii $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean m(gu $$0) {
      return this.a(cos.a($$0));
   }

   public cpd a(@Nullable bii $$0, double $$1, double $$2, double $$3, float $$4, cpl.a $$5) {
      return this.a($$0, null, null, $$1, $$2, $$3, $$4, false, $$5);
   }

   public cpd a(@Nullable bii $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, cpl.a $$6) {
      return this.a($$0, null, null, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public cpd a(@Nullable bii $$0, @Nullable bhg $$1, @Nullable cpe $$2, ehd $$3, float $$4, boolean $$5, cpl.a $$6) {
      return this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6);
   }

   public cpd a(@Nullable bii $$0, @Nullable bhg $$1, @Nullable cpe $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, cpl.a $$8) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, true);
   }

   public cpd a(@Nullable bii $$0, @Nullable bhg $$1, @Nullable cpe $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, cpl.a $$8, boolean $$9) {
      cpd.a $$10 = switch ($$8) {
         case a -> cpd.a.a;
         case b -> this.a(cph.M);
         case c -> this.X().b(cph.c) ? this.a(cph.N) : cpd.a.a;
         case d -> this.a(cph.O);
      };
      cpd $$11 = new cpd(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$10);
      $$11.a();
      $$11.a($$9);
      return $$11;
   }

   private cpd.a a(cph.e<cph.a> $$0) {
      return this.X().b($$0) ? cpd.a.c : cpd.a.b;
   }

   public abstract String F();

   @Nullable
   @Override
   public dcl c_(gu $$0) {
      if (this.r($$0)) {
         return null;
      } else {
         return !this.B && Thread.currentThread() != this.c ? null : this.l($$0).a($$0, dhg.b.a);
      }
   }

   public void a(dcl $$0) {
      gu $$1 = $$0.p();
      if (!this.r($$1)) {
         this.l($$1).b($$0);
      }
   }

   public void n(gu $$0) {
      if (!this.r($$0)) {
         this.l($$0).d($$0);
      }
   }

   public boolean o(gu $$0) {
      return this.r($$0) ? false : this.J().b(hx.a($$0.u()), hx.a($$0.w()));
   }

   public boolean a(gu $$0, bii $$1, ha $$2) {
      if (this.r($$0)) {
         return false;
      } else {
         dgv $$3 = this.a(hx.a($$0.u()), hx.a($$0.w()), dha.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(gu $$0, bii $$1) {
      return this.a($$0, $$1, ha.b);
   }

   public void Q() {
      double $$0 = 1.0 - (double)(this.d(1.0F) * 5.0F) / 16.0;
      double $$1 = 1.0 - (double)(this.b(1.0F) * 5.0F) / 16.0;
      double $$2 = 0.5 + 2.0 * arp.a((double)arp.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void b(boolean $$0, boolean $$1) {
      this.J().a($$0, $$1);
   }

   public gu R() {
      gu $$0 = new gu(this.A.a(), this.A.b(), this.A.c());
      if (!this.w_().a($$0)) {
         $$0 = this.a(dki.a.e, gu.a(this.w_().a(), 0.0, this.w_().b()));
      }

      return $$0;
   }

   public float S() {
      return this.A.d();
   }

   protected void T() {
      if (this.A.k()) {
         this.w = 1.0F;
         if (this.A.i()) {
            this.y = 1.0F;
         }
      }
   }

   @Override
   public void close() throws IOException {
      this.J().close();
   }

   @Nullable
   @Override
   public cor c(int $$0, int $$1) {
      return this.a($$0, $$1, dha.n, false);
   }

   @Override
   public List<bii> a(@Nullable bii $$0, egy $$1, Predicate<? super bii> $$2) {
      this.ad().d("getEntities");
      List<bii> $$3 = Lists.newArrayList();
      this.E().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }

         if ($$3x instanceof bwz) {
            for (bwx $$4 : ((bwz)$$3x).fW()) {
               if ($$3x != $$0 && $$2.test($$4)) {
                  $$3.add($$4);
               }
            }
         }
      });
      return $$3;
   }

   @Override
   public <T extends bii> List<T> a(dix<bii, T> $$0, egy $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends bii> void a(dix<bii, T> $$0, egy $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends bii> void a(dix<bii, T> $$0, egy $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      this.ad().d("getEntities");
      this.E().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return aqg.a.b;
            }
         }

         if ($$4x instanceof bwz $$5) {
            for (bwx $$6 : $$5.fW()) {
               T $$7 = $$0.a($$6);
               if ($$7 != null && $$2.test($$7)) {
                  $$3.add($$7);
                  if ($$3.size() >= $$4) {
                     return aqg.a.b;
                  }
               }
            }
         }

         return aqg.a.a;
      });
   }

   @Nullable
   public abstract bii a(int var1);

   public void p(gu $$0) {
      if (this.A($$0)) {
         this.l($$0).a(true);
      }
   }

   @Override
   public int t_() {
      return 63;
   }

   public void U() {
   }

   public long V() {
      return this.A.e();
   }

   public long W() {
      return this.A.f();
   }

   public boolean a(cbm $$0, gu $$1) {
      return true;
   }

   public void a(bii $$0, byte $$1) {
   }

   public void a(bii $$0, bhg $$1) {
   }

   public void a(gu $$0, csl $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public ebt u_() {
      return this.A;
   }

   public cph X() {
      return this.A.q();
   }

   public float b(float $$0) {
      return arp.i($$0, this.x, this.y) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = arp.a($$0, 0.0F, 1.0F);
      this.x = $$1;
      this.y = $$1;
   }

   public float d(float $$0) {
      return arp.i($$0, this.v, this.w);
   }

   public void e(float $$0) {
      float $$1 = arp.a($$0, 0.0F, 1.0F);
      this.v = $$1;
      this.w = $$1;
   }

   public boolean Y() {
      return this.x_().g() && !this.x_().h() ? (double)this.b(1.0F) > 0.9 : false;
   }

   public boolean Z() {
      return (double)this.d(1.0F) > 0.2;
   }

   public boolean q(gu $$0) {
      if (!this.Z()) {
         return false;
      } else if (!this.g($$0)) {
         return false;
      } else if (this.a(dki.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         cqj $$1 = this.s($$0).a();
         return $$1.a($$0) == cqj.c.b;
      }
   }

   @Nullable
   public abstract ebm a(String var1);

   public abstract void a(String var1, ebm var2);

   public abstract int t();

   public void b(int $$0, gu $$1, int $$2) {
   }

   public p a(o $$0) {
      p $$1 = $$0.a("Affected level", 1);
      $$1.a("All players", () -> this.v().size() + " total; " + this.v());
      $$1.a("Chunk stats", this.J()::e);
      $$1.a("Level dimension", () -> this.ac().a().toString());

      try {
         this.A.a($$1, this);
      } catch (Throwable var4) {
         $$1.a("Level Data Unobtainable", var4);
      }

      return $$1;
   }

   public abstract void a(int var1, gu var2, int var3);

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, @Nullable qr $$6) {
   }

   public abstract eic I();

   public void c(gu $$0, csl $$1) {
      for (ha $$2 : ha.c.a) {
         gu $$3 = $$0.a($$2);
         if (this.A($$3)) {
            dez $$4 = this.a_($$3);
            if ($$4.a(csm.gY)) {
               this.a($$4, $$3, $$1, $$0, false);
            } else if ($$4.g(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(csm.gY)) {
                  this.a($$4, $$3, $$1, $$0, false);
               }
            }
         }
      }
   }

   @Override
   public bgo d_(gu $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.A($$0)) {
         $$2 = this.an();
         $$1 = this.l($$0).u();
      }

      return new bgo(this.ai(), this.W(), $$1, $$2);
   }

   @Override
   public int v_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public dgq w_() {
      return this.G;
   }

   public void a(ux<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public dii x_() {
      return this.E.a();
   }

   public aeq<dii> aa() {
      return this.D;
   }

   public he<dii> ab() {
      return this.E;
   }

   public aeq<cpl> ac() {
      return this.I;
   }

   @Override
   public aru y_() {
      return this.z;
   }

   @Override
   public boolean a(gu $$0, Predicate<dez> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(gu $$0, Predicate<eac> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract cmb q();

   public gu a(int $$0, int $$1, int $$2, int $$3) {
      this.t = this.t * 3 + 1013904223;
      int $$4 = this.t >> 2;
      return new gu($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean r() {
      return false;
   }

   public bdh ad() {
      return this.F.get();
   }

   public Supplier<bdh> ae() {
      return this.F;
   }

   @Override
   public cql z_() {
      return this.H;
   }

   public final boolean af() {
      return this.d;
   }

   protected abstract diz<bii> E();

   @Override
   public long A_() {
      return this.L++;
   }

   @Override
   public hs B_() {
      return this.J;
   }

   public bhh ag() {
      return this.K;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
