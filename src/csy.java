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

public abstract class csy implements csz, AutoCloseable {
   public static final Codec<ags<csy>> g = ags.a(kc.aL);
   public static final ags<csy> h = ags.a(kc.aL, new agt("overworld"));
   public static final ags<csy> i = ags.a(kc.aL, new agt("the_nether"));
   public static final ags<csy> j = ags.a(kc.aL, new agt("the_end"));
   public static final int k = 30000000;
   public static final int l = 512;
   public static final int m = 32;
   public static final int n = 15;
   public static final int o = 24000;
   public static final int p = 20000000;
   public static final int q = -20000000;
   protected final List<dhu> r = Lists.newArrayList();
   protected final efb s;
   private final List<dhu> a = Lists.newArrayList();
   private boolean b;
   private final Thread c;
   private final boolean d;
   private int e;
   protected int t = auf.a().f();
   protected final int u = 1013904223;
   protected float v;
   protected float w;
   protected float x;
   protected float y;
   public final auf z = auf.a();
   @Deprecated
   private final auf f = auf.b();
   private final ags<dly> D;
   private final ie<dly> E;
   protected final egb A;
   private final Supplier<bgc> F;
   public final boolean B;
   private final dkg G;
   private final ctz H;
   private final ags<csy> I;
   private final is J;
   private final bke K;
   private long L;

   protected csy(egb $$0, ags<csy> $$1, is $$2, ie<dly> $$3, Supplier<bgc> $$4, boolean $$5, boolean $$6, long $$7, int $$8) {
      this.F = $$4;
      this.A = $$0;
      this.E = $$3;
      this.D = $$3.e().orElseThrow(() -> new IllegalArgumentException("Dimension must be registered, got " + $$3));
      final dly $$9 = $$3.a();
      this.I = $$1;
      this.B = $$5;
      if ($$9.k() != 1.0) {
         this.G = new dkg() {
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
         this.G = new dkg();
      }

      this.c = Thread.currentThread();
      this.H = new ctz(this, $$7);
      this.d = $$6;
      this.s = new eez(this, $$8);
      this.J = $$2;
      this.K = new bke($$2);
   }

   @Override
   public boolean y_() {
      return this.B;
   }

   @Nullable
   @Override
   public MinecraftServer n() {
      return null;
   }

   public boolean j(hv $$0) {
      return !this.r($$0) && D($$0);
   }

   public static boolean k(hv $$0) {
      return !b($$0.v()) && D($$0);
   }

   private static boolean D(hv $$0) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000;
   }

   private static boolean b(int $$0) {
      return $$0 < -20000000 || $$0 >= 20000000;
   }

   public dkw l(hv $$0) {
      return this.d(ix.a($$0.u()), ix.a($$0.w()));
   }

   public dkw d(int $$0, int $$1) {
      return (dkw)this.a($$0, $$1, dkq.n);
   }

   @Nullable
   @Override
   public dkl a(int $$0, int $$1, dkq $$2, boolean $$3) {
      dkl $$4 = this.K().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(hv $$0, dip $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(hv $$0, dip $$1, int $$2, int $$3) {
      if (this.r($$0)) {
         return false;
      } else if (!this.B && this.ag()) {
         return false;
      } else {
         dkw $$4 = this.l($$0);
         cvz $$5 = $$1.b();
         dip $$6 = $$4.a($$0, $$1, ($$2 & 64) != 0);
         if ($$6 == null) {
            return false;
         } else {
            dip $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.B || ($$2 & 4) == 0) && (this.B || $$4.D() != null && $$4.D().a(ami.c))) {
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
                  $$1.a((csz)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(hv $$0, dip $$1, dip $$2) {
   }

   @Override
   public boolean a(hv $$0, boolean $$1) {
      edz $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(hv $$0, boolean $$1, @Nullable blf $$2, int $$3) {
      dip $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         edz $$5 = this.b_($$0);
         if (!($$4.b() instanceof cvm)) {
            this.c(2001, $$0, cvz.i($$4));
         }

         if ($$1) {
            dgd $$6 = $$4.t() ? this.c_($$0) : null;
            cvz.a($$4, this, $$0, $$6, $$2, cmh.f);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(dmz.f, $$0, dmz.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(hv $$0, dip $$1) {
   }

   public boolean b(hv $$0, dip $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(hv var1, dip var2, dip var3, int var4);

   public void b(hv $$0, dip $$1, dip $$2) {
   }

   public void a(hv $$0, cvz $$1) {
   }

   public void a(hv $$0, cvz $$1, ia $$2) {
   }

   public void a(hv $$0, cvz $$1, hv $$2) {
   }

   public void a(dip $$0, hv $$1, cvz $$2, hv $$3, boolean $$4) {
   }

   @Override
   public void a(ia $$0, dip $$1, hv $$2, hv $$3, int $$4, int $$5) {
      this.s.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int a(dny.a $$0, int $$1, int $$2) {
      int $$4;
      if ($$1 >= -30000000 && $$2 >= -30000000 && $$1 < 30000000 && $$2 < 30000000) {
         if (this.b(ix.a($$1), ix.a($$2))) {
            $$4 = this.d(ix.a($$1), ix.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
         } else {
            $$4 = this.J_();
         }
      } else {
         $$4 = this.A_() + 1;
      }

      return $$4;
   }

   @Override
   public edo z_() {
      return this.K().p();
   }

   @Override
   public dip a_(hv $$0) {
      if (this.r($$0)) {
         return cwb.nb.o();
      } else {
         dkw $$1 = this.d(ix.a($$0.u()), ix.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public edz b_(hv $$0) {
      if (this.r($$0)) {
         return eea.a.g();
      } else {
         dkw $$1 = this.l($$0);
         return $$1.b_($$0);
      }
   }

   public boolean O() {
      return !this.E_().a() && this.e < 4;
   }

   public boolean P() {
      return !this.E_().a() && !this.O();
   }

   public void a(@Nullable blf $$0, hv $$1, arb $$2, ard $$3, float $$4, float $$5) {
      this.a($$0 instanceof cer $$6 ? $$6 : null, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(@Nullable cer $$0, hv $$1, arb $$2, ard $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable cer var1, double var2, double var4, double var6, ie<arb> var8, ard var9, float var10, float var11, long var12);

   public void a(@Nullable cer $$0, double $$1, double $$2, double $$3, arb $$4, ard $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, kb.b.d($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable cer var1, blf var2, ie<arb> var3, ard var4, float var5, float var6, long var7);

   public void a(@Nullable cer $$0, double $$1, double $$2, double $$3, arb $$4, ard $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 1.0F, 1.0F);
   }

   public void a(@Nullable cer $$0, double $$1, double $$2, double $$3, arb $$4, ard $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable cer $$0, blf $$1, arb $$2, ard $$3, float $$4, float $$5) {
      this.a($$0, $$1, kb.b.d($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(hv $$0, arb $$1, ard $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(blf $$0, arb $$1, ard $$2, float $$3, float $$4) {
   }

   public void a(double $$0, double $$1, double $$2, arb $$3, ard $$4, float $$5, float $$6, boolean $$7) {
   }

   @Override
   public void a(jt $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(jt $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public void b(jt $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void b(jt $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public float a(float $$0) {
      float $$1 = this.f($$0);
      return $$1 * (float) (Math.PI * 2);
   }

   public void a(dhu $$0) {
      (this.b ? this.a : this.r).add($$0);
   }

   protected void Q() {
      bgc $$0 = this.ae();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.r.addAll(this.a);
         this.a.clear();
      }

      Iterator<dhu> $$1 = this.r.iterator();
      boolean $$2 = this.r().i();

      while ($$1.hasNext()) {
         dhu $$3 = $$1.next();
         if ($$3.b()) {
            $$1.remove();
         } else if ($$2 && this.m($$3.c())) {
            $$3.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends blf> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Ticking entity");
         p $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new y($$3);
      }
   }

   public boolean h(blf $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean m(hv $$0) {
      return this.a(csf.a($$0));
   }

   public csq a(@Nullable blf $$0, double $$1, double $$2, double $$3, float $$4, csy.a $$5) {
      return this.a($$0, csq.a(this, $$0), null, $$1, $$2, $$3, $$4, false, $$5, jv.x, jv.w, arc.jA);
   }

   public csq a(@Nullable blf $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, csy.a $$6) {
      return this.a($$0, csq.a(this, $$0), null, $$1, $$2, $$3, $$4, $$5, $$6, jv.x, jv.w, arc.jA);
   }

   public csq a(@Nullable blf $$0, @Nullable bkd $$1, @Nullable csr $$2, elb $$3, float $$4, boolean $$5, csy.a $$6) {
      return this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6, jv.x, jv.w, arc.jA);
   }

   public csq a(@Nullable blf $$0, @Nullable bkd $$1, @Nullable csr $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, csy.a $$8) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, jv.x, jv.w, arc.jA);
   }

   public csq a(
      @Nullable blf $$0, @Nullable bkd $$1, @Nullable csr $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, csy.a $$8, jt $$9, jt $$10, arb $$11
   ) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, true, $$9, $$10, $$11);
   }

   public csq a(
      @Nullable blf $$0,
      @Nullable bkd $$1,
      @Nullable csr $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      csy.a $$8,
      boolean $$9,
      jt $$10,
      jt $$11,
      arb $$12
   ) {
      csq.a $$13 = switch ($$8) {
         case a -> csq.a.a;
         case b -> this.a(csu.Q);
         case c -> this.Y().b(csu.c) ? this.a(csu.R) : csq.a.a;
         case d -> this.a(csu.S);
         case e -> csq.a.d;
      };
      csq $$14 = new csq(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$13, $$10, $$11, $$12);
      $$14.c();
      $$14.a($$9);
      return $$14;
   }

   private csq.a a(csu.e<csu.a> $$0) {
      return this.Y().b($$0) ? csq.a.c : csq.a.b;
   }

   public abstract String G();

   @Nullable
   @Override
   public dgd c_(hv $$0) {
      if (this.r($$0)) {
         return null;
      } else {
         return !this.B && Thread.currentThread() != this.c ? null : this.l($$0).a($$0, dkw.b.a);
      }
   }

   public void a(dgd $$0) {
      hv $$1 = $$0.aB_();
      if (!this.r($$1)) {
         this.l($$1).b($$0);
      }
   }

   public void n(hv $$0) {
      if (!this.r($$0)) {
         this.l($$0).d($$0);
      }
   }

   public boolean o(hv $$0) {
      return this.r($$0) ? false : this.K().b(ix.a($$0.u()), ix.a($$0.w()));
   }

   public boolean a(hv $$0, blf $$1, ia $$2) {
      if (this.r($$0)) {
         return false;
      } else {
         dkl $$3 = this.a(ix.a($$0.u()), ix.a($$0.w()), dkq.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(hv $$0, blf $$1) {
      return this.a($$0, $$1, ia.b);
   }

   public void R() {
      double $$0 = 1.0 - (double)(this.d(1.0F) * 5.0F) / 16.0;
      double $$1 = 1.0 - (double)(this.b(1.0F) * 5.0F) / 16.0;
      double $$2 = 0.5 + 2.0 * aty.a((double)aty.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void b(boolean $$0, boolean $$1) {
      this.K().a($$0, $$1);
   }

   public hv S() {
      hv $$0 = new hv(this.A.a(), this.A.b(), this.A.c());
      if (!this.D_().a($$0)) {
         $$0 = this.a(dny.a.e, hv.a(this.D_().a(), 0.0, this.D_().b()));
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
   public cse c(int $$0, int $$1) {
      return this.a($$0, $$1, dkq.n, false);
   }

   @Override
   public List<blf> a(@Nullable blf $$0, ekw $$1, Predicate<? super blf> $$2) {
      this.ae().d("getEntities");
      List<blf> $$3 = Lists.newArrayList();
      this.F().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }

         if ($$3x instanceof bzy) {
            for (bzw $$4 : ((bzy)$$3x).ga()) {
               if ($$3x != $$0 && $$2.test($$4)) {
                  $$3.add($$4);
               }
            }
         }
      });
      return $$3;
   }

   @Override
   public <T extends blf> List<T> a(dmn<blf, T> $$0, ekw $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends blf> void a(dmn<blf, T> $$0, ekw $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends blf> void a(dmn<blf, T> $$0, ekw $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      this.ae().d("getEntities");
      this.F().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return asm.a.b;
            }
         }

         if ($$4x instanceof bzy $$5) {
            for (bzw $$6 : $$5.ga()) {
               T $$7 = $$0.a($$6);
               if ($$7 != null && $$2.test($$7)) {
                  $$3.add($$7);
                  if ($$3.size() >= $$4) {
                     return asm.a.b;
                  }
               }
            }
         }

         return asm.a.a;
      });
   }

   @Nullable
   public abstract blf a(int var1);

   public void p(hv $$0) {
      if (this.A($$0)) {
         this.l($$0).a(true);
      }
   }

   @Override
   public int A_() {
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

   public boolean a(cer $$0, hv $$1) {
      return true;
   }

   public void a(blf $$0, byte $$1) {
   }

   public void a(blf $$0, bkd $$1) {
   }

   public void a(hv $$0, cvz $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public efq B_() {
      return this.A;
   }

   public csu Y() {
      return this.A.q();
   }

   public abstract bjv r();

   public float b(float $$0) {
      return aty.i($$0, this.x, this.y) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = aty.a($$0, 0.0F, 1.0F);
      this.x = $$1;
      this.y = $$1;
   }

   public float d(float $$0) {
      return aty.i($$0, this.v, this.w);
   }

   public void e(float $$0) {
      float $$1 = aty.a($$0, 0.0F, 1.0F);
      this.v = $$1;
      this.w = $$1;
   }

   public boolean Z() {
      return this.E_().g() && !this.E_().h() ? (double)this.b(1.0F) > 0.9 : false;
   }

   public boolean aa() {
      return (double)this.d(1.0F) > 0.2;
   }

   public boolean q(hv $$0) {
      if (!this.aa()) {
         return false;
      } else if (!this.g($$0)) {
         return false;
      } else if (this.a(dny.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         ctx $$1 = this.s($$0).a();
         return $$1.a($$0) == ctx.c.b;
      }
   }

   @Nullable
   public abstract efj a(String var1);

   public abstract void a(String var1, efj var2);

   public abstract int u();

   public void b(int $$0, hv $$1, int $$2) {
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

   public abstract void a(int var1, hv var2, int var3);

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, @Nullable sj $$6) {
   }

   public abstract ema J();

   public void c(hv $$0, cvz $$1) {
      for (ia $$2 : ia.c.a) {
         hv $$3 = $$0.a($$2);
         if (this.A($$3)) {
            dip $$4 = this.a_($$3);
            if ($$4.a(cwb.gY)) {
               this.a($$4, $$3, $$1, $$0, false);
            } else if ($$4.g(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(cwb.gY)) {
                  this.a($$4, $$3, $$1, $$0, false);
               }
            }
         }
      }
   }

   @Override
   public bjj d_(hv $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.A($$0)) {
         $$2 = this.ao();
         $$1 = this.l($$0).u();
      }

      return new bjj(this.aj(), this.X(), $$1, $$2);
   }

   @Override
   public int C_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public dkg D_() {
      return this.G;
   }

   public void a(wu<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public dly E_() {
      return this.E.a();
   }

   public ags<dly> ab() {
      return this.D;
   }

   public ie<dly> ac() {
      return this.E;
   }

   public ags<csy> ad() {
      return this.I;
   }

   @Override
   public auf F_() {
      return this.z;
   }

   @Override
   public boolean a(hv $$0, Predicate<dip> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(hv $$0, Predicate<edz> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract cpo q();

   public hv a(int $$0, int $$1, int $$2, int $$3) {
      this.t = this.t * 3 + 1013904223;
      int $$4 = this.t >> 2;
      return new hv($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean s() {
      return false;
   }

   public bgc ae() {
      return this.F.get();
   }

   public Supplier<bgc> af() {
      return this.F;
   }

   @Override
   public ctz G_() {
      return this.H;
   }

   public final boolean ag() {
      return this.d;
   }

   protected abstract dmp<blf> F();

   @Override
   public long H_() {
      return this.L++;
   }

   @Override
   public is I_() {
      return this.J;
   }

   public bke ah() {
      return this.K;
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }
}
