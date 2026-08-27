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

public abstract class csf implements csg, AutoCloseable {
   public static final Codec<agl<csf>> g = agl.a(kd.aJ);
   public static final agl<csf> h = agl.a(kd.aJ, new agm("overworld"));
   public static final agl<csf> i = agl.a(kd.aJ, new agm("the_nether"));
   public static final agl<csf> j = agl.a(kd.aJ, new agm("the_end"));
   public static final int k = 30000000;
   public static final int l = 512;
   public static final int m = 32;
   public static final int n = 15;
   public static final int o = 24000;
   public static final int p = 20000000;
   public static final int q = -20000000;
   protected final List<dgz> r = Lists.newArrayList();
   protected final edz s;
   private final List<dgz> a = Lists.newArrayList();
   private boolean b;
   private final Thread c;
   private final boolean d;
   private int e;
   protected int t = atw.a().f();
   protected final int u = 1013904223;
   protected float v;
   protected float w;
   protected float x;
   protected float y;
   public final atw z = atw.a();
   @Deprecated
   private final atw f = atw.b();
   private final agl<dkw> D;
   private final ig<dkw> E;
   protected final eez A;
   private final Supplier<bfs> F;
   public final boolean B;
   private final dje G;
   private final ctf H;
   private final agl<csf> I;
   private final it J;
   private final bju K;
   private long L;

   protected csf(eez $$0, agl<csf> $$1, it $$2, ig<dkw> $$3, Supplier<bfs> $$4, boolean $$5, boolean $$6, long $$7, int $$8) {
      this.F = $$4;
      this.A = $$0;
      this.E = $$3;
      this.D = $$3.e().orElseThrow(() -> new IllegalArgumentException("Dimension must be registered, got " + $$3));
      final dkw $$9 = $$3.a();
      this.I = $$1;
      this.B = $$5;
      if ($$9.k() != 1.0) {
         this.G = new dje() {
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
         this.G = new dje();
      }

      this.c = Thread.currentThread();
      this.H = new ctf(this, $$7);
      this.d = $$6;
      this.s = new edx(this, $$8);
      this.J = $$2;
      this.K = new bju($$2);
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

   public boolean j(hx $$0) {
      return !this.r($$0) && D($$0);
   }

   public static boolean k(hx $$0) {
      return !b($$0.v()) && D($$0);
   }

   private static boolean D(hx $$0) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000;
   }

   private static boolean b(int $$0) {
      return $$0 < -20000000 || $$0 >= 20000000;
   }

   public dju l(hx $$0) {
      return this.d(iy.a($$0.u()), iy.a($$0.w()));
   }

   public dju d(int $$0, int $$1) {
      return (dju)this.a($$0, $$1, djo.n);
   }

   @Nullable
   @Override
   public djj a(int $$0, int $$1, djo $$2, boolean $$3) {
      djj $$4 = this.K().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(hx $$0, dhn $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(hx $$0, dhn $$1, int $$2, int $$3) {
      if (this.r($$0)) {
         return false;
      } else if (!this.B && this.ag()) {
         return false;
      } else {
         dju $$4 = this.l($$0);
         cvf $$5 = $$1.b();
         dhn $$6 = $$4.a($$0, $$1, ($$2 & 64) != 0);
         if ($$6 == null) {
            return false;
         } else {
            dhn $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.B || ($$2 & 4) == 0) && (this.B || $$4.D() != null && $$4.D().a(amb.c))) {
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
                  $$1.a((csg)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(hx $$0, dhn $$1, dhn $$2) {
   }

   @Override
   public boolean a(hx $$0, boolean $$1) {
      ecx $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(hx $$0, boolean $$1, @Nullable bkv $$2, int $$3) {
      dhn $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         ecx $$5 = this.b_($$0);
         if (!($$4.b() instanceof cus)) {
            this.c(2001, $$0, cvf.i($$4));
         }

         if ($$1) {
            dfi $$6 = $$4.t() ? this.c_($$0) : null;
            cvf.a($$4, this, $$0, $$6, $$2, clo.b);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(dlx.f, $$0, dlx.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(hx $$0, dhn $$1) {
   }

   public boolean b(hx $$0, dhn $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(hx var1, dhn var2, dhn var3, int var4);

   public void b(hx $$0, dhn $$1, dhn $$2) {
   }

   public void a(hx $$0, cvf $$1) {
   }

   public void a(hx $$0, cvf $$1, ib $$2) {
   }

   public void a(hx $$0, cvf $$1, hx $$2) {
   }

   public void a(dhn $$0, hx $$1, cvf $$2, hx $$3, boolean $$4) {
   }

   @Override
   public void a(ib $$0, dhn $$1, hx $$2, hx $$3, int $$4, int $$5) {
      this.s.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int a(dmw.a $$0, int $$1, int $$2) {
      int $$4;
      if ($$1 >= -30000000 && $$2 >= -30000000 && $$1 < 30000000 && $$2 < 30000000) {
         if (this.b(iy.a($$1), iy.a($$2))) {
            $$4 = this.d(iy.a($$1), iy.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
         } else {
            $$4 = this.J_();
         }
      } else {
         $$4 = this.A_() + 1;
      }

      return $$4;
   }

   @Override
   public ecm z_() {
      return this.K().p();
   }

   @Override
   public dhn a_(hx $$0) {
      if (this.r($$0)) {
         return cvh.nb.o();
      } else {
         dju $$1 = this.d(iy.a($$0.u()), iy.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public ecx b_(hx $$0) {
      if (this.r($$0)) {
         return ecy.a.g();
      } else {
         dju $$1 = this.l($$0);
         return $$1.b_($$0);
      }
   }

   public boolean O() {
      return !this.E_().a() && this.e < 4;
   }

   public boolean P() {
      return !this.E_().a() && !this.O();
   }

   public void a(@Nullable bkv $$0, hx $$1, aqu $$2, aqw $$3, float $$4, float $$5) {
      this.a($$0 instanceof cdz $$6 ? $$6 : null, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(@Nullable cdz $$0, hx $$1, aqu $$2, aqw $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable cdz var1, double var2, double var4, double var6, ig<aqu> var8, aqw var9, float var10, float var11, long var12);

   public void a(@Nullable cdz $$0, double $$1, double $$2, double $$3, aqu $$4, aqw $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, kc.c.d($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable cdz var1, bkv var2, ig<aqu> var3, aqw var4, float var5, float var6, long var7);

   public void a(@Nullable cdz $$0, double $$1, double $$2, double $$3, aqu $$4, aqw $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 1.0F, 1.0F);
   }

   public void a(@Nullable cdz $$0, double $$1, double $$2, double $$3, aqu $$4, aqw $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable cdz $$0, bkv $$1, aqu $$2, aqw $$3, float $$4, float $$5) {
      this.a($$0, $$1, kc.c.d($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(hx $$0, aqu $$1, aqw $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(double $$0, double $$1, double $$2, aqu $$3, aqw $$4, float $$5, float $$6, boolean $$7) {
   }

   @Override
   public void a(ju $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(ju $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public void b(ju $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void b(ju $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public float a(float $$0) {
      float $$1 = this.f($$0);
      return $$1 * (float) (Math.PI * 2);
   }

   public void a(dgz $$0) {
      (this.b ? this.a : this.r).add($$0);
   }

   protected void Q() {
      bfs $$0 = this.ae();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.r.addAll(this.a);
         this.a.clear();
      }

      Iterator<dgz> $$1 = this.r.iterator();
      boolean $$2 = this.r().i();

      while ($$1.hasNext()) {
         dgz $$3 = $$1.next();
         if ($$3.b()) {
            $$1.remove();
         } else if ($$2 && this.m($$3.c())) {
            $$3.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends bkv> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Ticking entity");
         p $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new y($$3);
      }
   }

   public boolean h(bkv $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean m(hx $$0) {
      return this.a(crm.a($$0));
   }

   public crx a(@Nullable bkv $$0, double $$1, double $$2, double $$3, float $$4, csf.a $$5) {
      return this.a($$0, null, null, $$1, $$2, $$3, $$4, false, $$5);
   }

   public crx a(@Nullable bkv $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, csf.a $$6) {
      return this.a($$0, null, null, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public crx a(@Nullable bkv $$0, @Nullable bjt $$1, @Nullable cry $$2, ejz $$3, float $$4, boolean $$5, csf.a $$6) {
      return this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6);
   }

   public crx a(@Nullable bkv $$0, @Nullable bjt $$1, @Nullable cry $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, csf.a $$8) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, true);
   }

   public crx a(@Nullable bkv $$0, @Nullable bjt $$1, @Nullable cry $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, csf.a $$8, boolean $$9) {
      crx.a $$10 = switch ($$8) {
         case a -> crx.a.a;
         case b -> this.a(csb.Q);
         case c -> this.Y().b(csb.c) ? this.a(csb.R) : crx.a.a;
         case d -> this.a(csb.S);
      };
      crx $$11 = new crx(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$10);
      $$11.a();
      $$11.a($$9);
      return $$11;
   }

   private crx.a a(csb.e<csb.a> $$0) {
      return this.Y().b($$0) ? crx.a.c : crx.a.b;
   }

   public abstract String G();

   @Nullable
   @Override
   public dfi c_(hx $$0) {
      if (this.r($$0)) {
         return null;
      } else {
         return !this.B && Thread.currentThread() != this.c ? null : this.l($$0).a($$0, dju.b.a);
      }
   }

   public void a(dfi $$0) {
      hx $$1 = $$0.aC_();
      if (!this.r($$1)) {
         this.l($$1).b($$0);
      }
   }

   public void n(hx $$0) {
      if (!this.r($$0)) {
         this.l($$0).d($$0);
      }
   }

   public boolean o(hx $$0) {
      return this.r($$0) ? false : this.K().b(iy.a($$0.u()), iy.a($$0.w()));
   }

   public boolean a(hx $$0, bkv $$1, ib $$2) {
      if (this.r($$0)) {
         return false;
      } else {
         djj $$3 = this.a(iy.a($$0.u()), iy.a($$0.w()), djo.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(hx $$0, bkv $$1) {
      return this.a($$0, $$1, ib.b);
   }

   public void R() {
      double $$0 = 1.0 - (double)(this.d(1.0F) * 5.0F) / 16.0;
      double $$1 = 1.0 - (double)(this.b(1.0F) * 5.0F) / 16.0;
      double $$2 = 0.5 + 2.0 * atq.a((double)atq.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void b(boolean $$0, boolean $$1) {
      this.K().a($$0, $$1);
   }

   public hx S() {
      hx $$0 = new hx(this.A.a(), this.A.b(), this.A.c());
      if (!this.D_().a($$0)) {
         $$0 = this.a(dmw.a.e, hx.a(this.D_().a(), 0.0, this.D_().b()));
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
   public crl c(int $$0, int $$1) {
      return this.a($$0, $$1, djo.n, false);
   }

   @Override
   public List<bkv> a(@Nullable bkv $$0, eju $$1, Predicate<? super bkv> $$2) {
      this.ae().d("getEntities");
      List<bkv> $$3 = Lists.newArrayList();
      this.F().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }

         if ($$3x instanceof bzm) {
            for (bzk $$4 : ((bzm)$$3x).gb()) {
               if ($$3x != $$0 && $$2.test($$4)) {
                  $$3.add($$4);
               }
            }
         }
      });
      return $$3;
   }

   @Override
   public <T extends bkv> List<T> a(dll<bkv, T> $$0, eju $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends bkv> void a(dll<bkv, T> $$0, eju $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends bkv> void a(dll<bkv, T> $$0, eju $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      this.ae().d("getEntities");
      this.F().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return asf.a.b;
            }
         }

         if ($$4x instanceof bzm $$5) {
            for (bzk $$6 : $$5.gb()) {
               T $$7 = $$0.a($$6);
               if ($$7 != null && $$2.test($$7)) {
                  $$3.add($$7);
                  if ($$3.size() >= $$4) {
                     return asf.a.b;
                  }
               }
            }
         }

         return asf.a.a;
      });
   }

   @Nullable
   public abstract bkv a(int var1);

   public void p(hx $$0) {
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

   public boolean a(cdz $$0, hx $$1) {
      return true;
   }

   public void a(bkv $$0, byte $$1) {
   }

   public void a(bkv $$0, bjt $$1) {
   }

   public void a(hx $$0, cvf $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public eeo B_() {
      return this.A;
   }

   public csb Y() {
      return this.A.q();
   }

   public abstract bjl r();

   public float b(float $$0) {
      return atq.i($$0, this.x, this.y) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = atq.a($$0, 0.0F, 1.0F);
      this.x = $$1;
      this.y = $$1;
   }

   public float d(float $$0) {
      return atq.i($$0, this.v, this.w);
   }

   public void e(float $$0) {
      float $$1 = atq.a($$0, 0.0F, 1.0F);
      this.v = $$1;
      this.w = $$1;
   }

   public boolean Z() {
      return this.E_().g() && !this.E_().h() ? (double)this.b(1.0F) > 0.9 : false;
   }

   public boolean aa() {
      return (double)this.d(1.0F) > 0.2;
   }

   public boolean q(hx $$0) {
      if (!this.aa()) {
         return false;
      } else if (!this.g($$0)) {
         return false;
      } else if (this.a(dmw.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         ctd $$1 = this.s($$0).a();
         return $$1.a($$0) == ctd.c.b;
      }
   }

   @Nullable
   public abstract eeh a(String var1);

   public abstract void a(String var1, eeh var2);

   public abstract int u();

   public void b(int $$0, hx $$1, int $$2) {
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

   public abstract void a(int var1, hx var2, int var3);

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, @Nullable sd $$6) {
   }

   public abstract eky J();

   public void c(hx $$0, cvf $$1) {
      for (ib $$2 : ib.c.a) {
         hx $$3 = $$0.a($$2);
         if (this.A($$3)) {
            dhn $$4 = this.a_($$3);
            if ($$4.a(cvh.gY)) {
               this.a($$4, $$3, $$1, $$0, false);
            } else if ($$4.g(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(cvh.gY)) {
                  this.a($$4, $$3, $$1, $$0, false);
               }
            }
         }
      }
   }

   @Override
   public biz d_(hx $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.A($$0)) {
         $$2 = this.ao();
         $$1 = this.l($$0).u();
      }

      return new biz(this.aj(), this.X(), $$1, $$2);
   }

   @Override
   public int C_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public dje D_() {
      return this.G;
   }

   public void a(wo<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public dkw E_() {
      return this.E.a();
   }

   public agl<dkw> ab() {
      return this.D;
   }

   public ig<dkw> ac() {
      return this.E;
   }

   public agl<csf> ad() {
      return this.I;
   }

   @Override
   public atw F_() {
      return this.z;
   }

   @Override
   public boolean a(hx $$0, Predicate<dhn> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(hx $$0, Predicate<ecx> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract cow q();

   public hx a(int $$0, int $$1, int $$2, int $$3) {
      this.t = this.t * 3 + 1013904223;
      int $$4 = this.t >> 2;
      return new hx($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean s() {
      return false;
   }

   public bfs ae() {
      return this.F.get();
   }

   public Supplier<bfs> af() {
      return this.F;
   }

   @Override
   public ctf G_() {
      return this.H;
   }

   public final boolean ag() {
      return this.d;
   }

   protected abstract dln<bkv> F();

   @Override
   public long H_() {
      return this.L++;
   }

   @Override
   public it I_() {
      return this.J;
   }

   public bju ah() {
      return this.K;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
