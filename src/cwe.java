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

public abstract class cwe implements cwf, AutoCloseable {
   public static final Codec<ajb<cwe>> g = ajb.a(ki.aN);
   public static final ajb<cwe> h = ajb.a(ki.aN, new ajc("overworld"));
   public static final ajb<cwe> i = ajb.a(ki.aN, new ajc("the_nether"));
   public static final ajb<cwe> j = ajb.a(ki.aN, new ajc("the_end"));
   public static final int k = 30000000;
   public static final int l = 512;
   public static final int m = 32;
   public static final int n = 15;
   public static final int o = 24000;
   public static final int p = 20000000;
   public static final int q = -20000000;
   protected final List<dlc> r = Lists.newArrayList();
   protected final eit s;
   private final List<dlc> a = Lists.newArrayList();
   private boolean b;
   private final Thread c;
   private final boolean d;
   private int e;
   protected int t = awt.a().f();
   protected final int u = 1013904223;
   protected float v;
   protected float w;
   protected float x;
   protected float y;
   public final awt z = awt.a();
   @Deprecated
   private final awt f = awt.b();
   private final il<dpq> D;
   protected final ejv A;
   private final Supplier<bjc> E;
   public final boolean B;
   private final dnv F;
   private final cxf G;
   private final ajb<cwe> H;
   private final iy I;
   private final bnf J;
   private long K;

   protected cwe(ejv $$0, ajb<cwe> $$1, iy $$2, il<dpq> $$3, Supplier<bjc> $$4, boolean $$5, boolean $$6, long $$7, int $$8) {
      this.E = $$4;
      this.A = $$0;
      this.D = $$3;
      final dpq $$9 = $$3.a();
      this.H = $$1;
      this.B = $$5;
      if ($$9.k() != 1.0) {
         this.F = new dnv() {
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
         this.F = new dnv();
      }

      this.c = Thread.currentThread();
      this.G = new cxf(this, $$7);
      this.d = $$6;
      this.s = new eir(this, $$8);
      this.I = $$2;
      this.J = new bnf($$2);
   }

   @Override
   public boolean y_() {
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

   public dol m(ib $$0) {
      return this.d(jd.a($$0.u()), jd.a($$0.w()));
   }

   public dol d(int $$0, int $$1) {
      return (dol)this.a($$0, $$1, dof.n);
   }

   @Nullable
   @Override
   public doa a(int $$0, int $$1, dof $$2, boolean $$3) {
      doa $$4 = this.L().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(ib $$0, dme $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(ib $$0, dme $$1, int $$2, int $$3) {
      if (this.s($$0)) {
         return false;
      } else if (!this.B && this.ag()) {
         return false;
      } else {
         dol $$4 = this.m($$0);
         czf $$5 = $$1.b();
         dme $$6 = $$4.a($$0, $$1, ($$2 & 64) != 0);
         if ($$6 == null) {
            return false;
         } else {
            dme $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.B || ($$2 & 4) == 0) && (this.B || $$4.D() != null && $$4.D().a(aot.c))) {
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
                  $$1.a((cwf)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(ib $$0, dme $$1, dme $$2) {
   }

   @Override
   public boolean a(ib $$0, boolean $$1) {
      ehr $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(ib $$0, boolean $$1, @Nullable bof $$2, int $$3) {
      dme $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         ehr $$5 = this.b_($$0);
         if (!($$4.b() instanceof cys)) {
            this.c(2001, $$0, czf.i($$4));
         }

         if ($$1) {
            djl $$6 = $$4.t() ? this.c_($$0) : null;
            czf.a($$4, this, $$0, $$6, $$2, cpq.h);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(dqr.f, $$0, dqr.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(ib $$0, dme $$1) {
   }

   public boolean b(ib $$0, dme $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(ib var1, dme var2, dme var3, int var4);

   public void b(ib $$0, dme $$1, dme $$2) {
   }

   public void a(ib $$0, czf $$1) {
   }

   public void a(ib $$0, czf $$1, ih $$2) {
   }

   public void a(ib $$0, czf $$1, ib $$2) {
   }

   public void a(dme $$0, ib $$1, czf $$2, ib $$3, boolean $$4) {
   }

   @Override
   public void a(ih $$0, dme $$1, ib $$2, ib $$3, int $$4, int $$5) {
      this.s.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int a(drq.a $$0, int $$1, int $$2) {
      int $$4;
      if ($$1 >= -30000000 && $$2 >= -30000000 && $$1 < 30000000 && $$2 < 30000000) {
         if (this.b(jd.a($$1), jd.a($$2))) {
            $$4 = this.d(jd.a($$1), jd.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
         } else {
            $$4 = this.J_();
         }
      } else {
         $$4 = this.A_() + 1;
      }

      return $$4;
   }

   @Override
   public ehg z_() {
      return this.L().p();
   }

   @Override
   public dme a_(ib $$0) {
      if (this.s($$0)) {
         return czh.nb.o();
      } else {
         dol $$1 = this.d(jd.a($$0.u()), jd.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public ehr b_(ib $$0) {
      if (this.s($$0)) {
         return ehs.a.g();
      } else {
         dol $$1 = this.m($$0);
         return $$1.b_($$0);
      }
   }

   public boolean P() {
      return !this.E_().a() && this.e < 4;
   }

   public boolean Q() {
      return !this.E_().a() && !this.P();
   }

   public void a(@Nullable bof $$0, ib $$1, ato $$2, atq $$3, float $$4, float $$5) {
      this.a($$0 instanceof cia $$6 ? $$6 : null, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(@Nullable cia $$0, ib $$1, ato $$2, atq $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable cia var1, double var2, double var4, double var6, il<ato> var8, atq var9, float var10, float var11, long var12);

   public void a(@Nullable cia $$0, double $$1, double $$2, double $$3, ato $$4, atq $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, kh.b.e($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable cia var1, bof var2, il<ato> var3, atq var4, float var5, float var6, long var7);

   public void a(@Nullable cia $$0, double $$1, double $$2, double $$3, ato $$4, atq $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 1.0F, 1.0F);
   }

   public void a(@Nullable cia $$0, double $$1, double $$2, double $$3, ato $$4, atq $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable cia $$0, bof $$1, ato $$2, atq $$3, float $$4, float $$5) {
      this.a($$0, $$1, kh.b.e($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(ib $$0, ato $$1, atq $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(bof $$0, ato $$1, atq $$2, float $$3, float $$4) {
   }

   public void a(double $$0, double $$1, double $$2, ato $$3, atq $$4, float $$5, float $$6, boolean $$7) {
   }

   @Override
   public void a(jz $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(jz $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public void b(jz $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void b(jz $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public float a(float $$0) {
      float $$1 = this.f($$0);
      return $$1 * (float) (Math.PI * 2);
   }

   public void a(dlc $$0) {
      (this.b ? this.a : this.r).add($$0);
   }

   protected void R() {
      bjc $$0 = this.ae();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.r.addAll(this.a);
         this.a.clear();
      }

      Iterator<dlc> $$1 = this.r.iterator();
      boolean $$2 = this.s().i();

      while ($$1.hasNext()) {
         dlc $$3 = $$1.next();
         if ($$3.b()) {
            $$1.remove();
         } else if ($$2 && this.n($$3.c())) {
            $$3.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends bof> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Ticking entity");
         p $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new y($$3);
      }
   }

   public boolean h(bof $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean n(ib $$0) {
      return this.a(cvl.a($$0));
   }

   public cvw a(@Nullable bof $$0, double $$1, double $$2, double $$3, float $$4, cwe.a $$5) {
      return this.a($$0, cvw.a(this, $$0), null, $$1, $$2, $$3, $$4, false, $$5, kb.x, kb.w, atp.jQ);
   }

   public cvw a(@Nullable bof $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, cwe.a $$6) {
      return this.a($$0, cvw.a(this, $$0), null, $$1, $$2, $$3, $$4, $$5, $$6, kb.x, kb.w, atp.jQ);
   }

   public cvw a(@Nullable bof $$0, @Nullable bne $$1, @Nullable cvx $$2, eov $$3, float $$4, boolean $$5, cwe.a $$6) {
      return this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6, kb.x, kb.w, atp.jQ);
   }

   public cvw a(@Nullable bof $$0, @Nullable bne $$1, @Nullable cvx $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, cwe.a $$8) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, kb.x, kb.w, atp.jQ);
   }

   public cvw a(
      @Nullable bof $$0,
      @Nullable bne $$1,
      @Nullable cvx $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      cwe.a $$8,
      jz $$9,
      jz $$10,
      il<ato> $$11
   ) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, true, $$9, $$10, $$11);
   }

   public cvw a(
      @Nullable bof $$0,
      @Nullable bne $$1,
      @Nullable cvx $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      cwe.a $$8,
      boolean $$9,
      jz $$10,
      jz $$11,
      il<ato> $$12
   ) {
      cvw.a $$13 = switch ($$8) {
         case a -> cvw.a.a;
         case b -> this.a(cwa.Q);
         case c -> this.Z().b(cwa.c) ? this.a(cwa.R) : cvw.a.a;
         case d -> this.a(cwa.S);
         case e -> cvw.a.d;
      };
      cvw $$14 = new cvw(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$13, $$10, $$11, $$12);
      $$14.c();
      $$14.a($$9);
      return $$14;
   }

   private cvw.a a(cwa.e<cwa.a> $$0) {
      return this.Z().b($$0) ? cvw.a.c : cvw.a.b;
   }

   public abstract String H();

   @Nullable
   @Override
   public djl c_(ib $$0) {
      if (this.s($$0)) {
         return null;
      } else {
         return !this.B && Thread.currentThread() != this.c ? null : this.m($$0).a($$0, dol.b.a);
      }
   }

   public void a(djl $$0) {
      ib $$1 = $$0.aD_();
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
      return this.s($$0) ? false : this.L().b(jd.a($$0.u()), jd.a($$0.w()));
   }

   public boolean a(ib $$0, bof $$1, ih $$2) {
      if (this.s($$0)) {
         return false;
      } else {
         doa $$3 = this.a(jd.a($$0.u()), jd.a($$0.w()), dof.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(ib $$0, bof $$1) {
      return this.a($$0, $$1, ih.b);
   }

   public void S() {
      double $$0 = 1.0 - (double)(this.d(1.0F) * 5.0F) / 16.0;
      double $$1 = 1.0 - (double)(this.b(1.0F) * 5.0F) / 16.0;
      double $$2 = 0.5 + 2.0 * awm.a((double)awm.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void b(boolean $$0, boolean $$1) {
      this.L().a($$0, $$1);
   }

   public ib T() {
      ib $$0 = this.A.a();
      if (!this.D_().a($$0)) {
         $$0 = this.a(drq.a.e, ib.a(this.D_().a(), 0.0, this.D_().b()));
      }

      return $$0;
   }

   public float U() {
      return this.A.b();
   }

   protected void V() {
      if (this.A.i()) {
         this.w = 1.0F;
         if (this.A.g()) {
            this.y = 1.0F;
         }
      }
   }

   @Override
   public void close() throws IOException {
      this.L().close();
   }

   @Nullable
   @Override
   public cvk c(int $$0, int $$1) {
      return this.a($$0, $$1, dof.n, false);
   }

   @Override
   public List<bof> a(@Nullable bof $$0, eoq $$1, Predicate<? super bof> $$2) {
      this.ae().d("getEntities");
      List<bof> $$3 = Lists.newArrayList();
      this.G().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }

         if ($$3x instanceof cdf) {
            for (cdd $$4 : ((cdf)$$3x).gh()) {
               if ($$3x != $$0 && $$2.test($$4)) {
                  $$3.add($$4);
               }
            }
         }
      });
      return $$3;
   }

   @Override
   public <T extends bof> List<T> a(dqf<bof, T> $$0, eoq $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends bof> void a(dqf<bof, T> $$0, eoq $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends bof> void a(dqf<bof, T> $$0, eoq $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      this.ae().d("getEntities");
      this.G().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return ava.a.b;
            }
         }

         if ($$4x instanceof cdf $$5) {
            for (cdd $$6 : $$5.gh()) {
               T $$7 = $$0.a($$6);
               if ($$7 != null && $$2.test($$7)) {
                  $$3.add($$7);
                  if ($$3.size() >= $$4) {
                     return ava.a.b;
                  }
               }
            }
         }

         return ava.a.a;
      });
   }

   @Nullable
   public abstract bof a(int var1);

   public void q(ib $$0) {
      if (this.B($$0)) {
         this.m($$0).a(true);
      }
   }

   @Override
   public int A_() {
      return 63;
   }

   public void W() {
   }

   public long X() {
      return this.A.c();
   }

   public long Y() {
      return this.A.d();
   }

   public boolean a(cia $$0, ib $$1) {
      return true;
   }

   public void a(bof $$0, byte $$1) {
   }

   public void a(bof $$0, bne $$1) {
   }

   public void a(ib $$0, czf $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public ejk B_() {
      return this.A;
   }

   public cwa Z() {
      return this.A.o();
   }

   public abstract bmw s();

   public float b(float $$0) {
      return awm.i($$0, this.x, this.y) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = awm.a($$0, 0.0F, 1.0F);
      this.x = $$1;
      this.y = $$1;
   }

   public float d(float $$0) {
      return awm.i($$0, this.v, this.w);
   }

   public void e(float $$0) {
      float $$1 = awm.a($$0, 0.0F, 1.0F);
      this.v = $$1;
      this.w = $$1;
   }

   public boolean aa() {
      return this.E_().g() && !this.E_().h() ? (double)this.b(1.0F) > 0.9 : false;
   }

   public boolean ab() {
      return (double)this.d(1.0F) > 0.2;
   }

   public boolean r(ib $$0) {
      if (!this.ab()) {
         return false;
      } else if (!this.h($$0)) {
         return false;
      } else if (this.a(drq.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         cxd $$1 = this.t($$0).a();
         return $$1.a($$0) == cxd.c.b;
      }
   }

   @Nullable
   public abstract ejc a(eja var1);

   public abstract void a(eja var1, ejc var2);

   public abstract eja v();

   public void b(int $$0, ib $$1, int $$2) {
   }

   public p a(o $$0) {
      p $$1 = $$0.a("Affected level", 1);
      $$1.a("All players", () -> this.x().size() + " total; " + this.x());
      $$1.a("Chunk stats", this.L()::e);
      $$1.a("Level dimension", () -> this.ad().a().toString());

      try {
         this.A.a($$1, this);
      } catch (Throwable var4) {
         $$1.a("Level Data Unobtainable", var4);
      }

      return $$1;
   }

   public abstract void a(int var1, ib var2, int var3);

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, @Nullable sy $$6) {
   }

   public abstract epz K();

   public void c(ib $$0, czf $$1) {
      for (ih $$2 : ih.c.a) {
         ib $$3 = $$0.a($$2);
         if (this.B($$3)) {
            dme $$4 = this.a_($$3);
            if ($$4.a(czh.gY)) {
               this.a($$4, $$3, $$1, $$0, false);
            } else if ($$4.g(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(czh.gY)) {
                  this.a($$4, $$3, $$1, $$0, false);
               }
            }
         }
      }
   }

   @Override
   public bmj d_(ib $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.B($$0)) {
         $$2 = this.ao();
         $$1 = this.m($$0).u();
      }

      return new bmj(this.aj(), this.Y(), $$1, $$2);
   }

   @Override
   public int C_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public dnv D_() {
      return this.F;
   }

   public void a(xz<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public dpq E_() {
      return this.D.a();
   }

   public il<dpq> ac() {
      return this.D;
   }

   public ajb<cwe> ad() {
      return this.H;
   }

   @Override
   public awt F_() {
      return this.z;
   }

   @Override
   public boolean a(ib $$0, Predicate<dme> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(ib $$0, Predicate<ehr> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract csv r();

   public ib a(int $$0, int $$1, int $$2, int $$3) {
      this.t = this.t * 3 + 1013904223;
      int $$4 = this.t >> 2;
      return new ib($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean t() {
      return false;
   }

   public bjc ae() {
      return this.E.get();
   }

   public Supplier<bjc> af() {
      return this.E;
   }

   @Override
   public cxf G_() {
      return this.G;
   }

   public final boolean ag() {
      return this.d;
   }

   protected abstract dqh<bof> G();

   @Override
   public long H_() {
      return this.K++;
   }

   @Override
   public iy I_() {
      return this.I;
   }

   public bnf ah() {
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
