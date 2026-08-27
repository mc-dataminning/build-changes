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

public abstract class ctp implements ctq, AutoCloseable {
   public static final Codec<ahf<ctp>> g = ahf.a(ke.aM);
   public static final ahf<ctp> h = ahf.a(ke.aM, new ahg("overworld"));
   public static final ahf<ctp> i = ahf.a(ke.aM, new ahg("the_nether"));
   public static final ahf<ctp> j = ahf.a(ke.aM, new ahg("the_end"));
   public static final int k = 30000000;
   public static final int l = 512;
   public static final int m = 32;
   public static final int n = 15;
   public static final int o = 24000;
   public static final int p = 20000000;
   public static final int q = -20000000;
   protected final List<dim> r = Lists.newArrayList();
   protected final eft s;
   private final List<dim> a = Lists.newArrayList();
   private boolean b;
   private final Thread c;
   private final boolean d;
   private int e;
   protected int t = auv.a().f();
   protected final int u = 1013904223;
   protected float v;
   protected float w;
   protected float x;
   protected float y;
   public final auv z = auv.a();
   @Deprecated
   private final auv f = auv.b();
   private final ahf<dmq> D;
   private final ih<dmq> E;
   protected final egt A;
   private final Supplier<bgs> F;
   public final boolean B;
   private final dky G;
   private final cuq H;
   private final ahf<ctp> I;
   private final iu J;
   private final bku K;
   private long L;

   protected ctp(egt $$0, ahf<ctp> $$1, iu $$2, ih<dmq> $$3, Supplier<bgs> $$4, boolean $$5, boolean $$6, long $$7, int $$8) {
      this.F = $$4;
      this.A = $$0;
      this.E = $$3;
      this.D = $$3.e().orElseThrow(() -> new IllegalArgumentException("Dimension must be registered, got " + $$3));
      final dmq $$9 = $$3.a();
      this.I = $$1;
      this.B = $$5;
      if ($$9.k() != 1.0) {
         this.G = new dky() {
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
         this.G = new dky();
      }

      this.c = Thread.currentThread();
      this.H = new cuq(this, $$7);
      this.d = $$6;
      this.s = new efr(this, $$8);
      this.J = $$2;
      this.K = new bku($$2);
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

   public boolean k(hx $$0) {
      return !this.s($$0) && g($$0);
   }

   public static boolean l(hx $$0) {
      return !b($$0.v()) && g($$0);
   }

   private static boolean g(hx $$0) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000;
   }

   private static boolean b(int $$0) {
      return $$0 < -20000000 || $$0 >= 20000000;
   }

   public dlo m(hx $$0) {
      return this.d(iz.a($$0.u()), iz.a($$0.w()));
   }

   public dlo d(int $$0, int $$1) {
      return (dlo)this.a($$0, $$1, dli.n);
   }

   @Nullable
   @Override
   public dld a(int $$0, int $$1, dli $$2, boolean $$3) {
      dld $$4 = this.L().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(hx $$0, djh $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(hx $$0, djh $$1, int $$2, int $$3) {
      if (this.s($$0)) {
         return false;
      } else if (!this.B && this.ah()) {
         return false;
      } else {
         dlo $$4 = this.m($$0);
         cwq $$5 = $$1.b();
         djh $$6 = $$4.a($$0, $$1, ($$2 & 64) != 0);
         if ($$6 == null) {
            return false;
         } else {
            djh $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.B || ($$2 & 4) == 0) && (this.B || $$4.D() != null && $$4.D().a(amw.c))) {
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
                  $$1.a((ctq)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(hx $$0, djh $$1, djh $$2) {
   }

   @Override
   public boolean a(hx $$0, boolean $$1) {
      eer $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(hx $$0, boolean $$1, @Nullable blv $$2, int $$3) {
      djh $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         eer $$5 = this.b_($$0);
         if (!($$4.b() instanceof cwd)) {
            this.c(2001, $$0, cwq.i($$4));
         }

         if ($$1) {
            dgv $$6 = $$4.t() ? this.c_($$0) : null;
            cwq.a($$4, this, $$0, $$6, $$2, cmy.f);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(dnr.f, $$0, dnr.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(hx $$0, djh $$1) {
   }

   public boolean b(hx $$0, djh $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(hx var1, djh var2, djh var3, int var4);

   public void b(hx $$0, djh $$1, djh $$2) {
   }

   public void a(hx $$0, cwq $$1) {
   }

   public void a(hx $$0, cwq $$1, ic $$2) {
   }

   public void a(hx $$0, cwq $$1, hx $$2) {
   }

   public void a(djh $$0, hx $$1, cwq $$2, hx $$3, boolean $$4) {
   }

   @Override
   public void a(ic $$0, djh $$1, hx $$2, hx $$3, int $$4, int $$5) {
      this.s.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int a(doq.a $$0, int $$1, int $$2) {
      int $$4;
      if ($$1 >= -30000000 && $$2 >= -30000000 && $$1 < 30000000 && $$2 < 30000000) {
         if (this.b(iz.a($$1), iz.a($$2))) {
            $$4 = this.d(iz.a($$1), iz.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
         } else {
            $$4 = this.J_();
         }
      } else {
         $$4 = this.A_() + 1;
      }

      return $$4;
   }

   @Override
   public eeg z_() {
      return this.L().p();
   }

   @Override
   public djh a_(hx $$0) {
      if (this.s($$0)) {
         return cws.nb.o();
      } else {
         dlo $$1 = this.d(iz.a($$0.u()), iz.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public eer b_(hx $$0) {
      if (this.s($$0)) {
         return ees.a.g();
      } else {
         dlo $$1 = this.m($$0);
         return $$1.b_($$0);
      }
   }

   public boolean P() {
      return !this.E_().a() && this.e < 4;
   }

   public boolean Q() {
      return !this.E_().a() && !this.P();
   }

   public void a(@Nullable blv $$0, hx $$1, arr $$2, art $$3, float $$4, float $$5) {
      this.a($$0 instanceof cfi $$6 ? $$6 : null, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(@Nullable cfi $$0, hx $$1, arr $$2, art $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable cfi var1, double var2, double var4, double var6, ih<arr> var8, art var9, float var10, float var11, long var12);

   public void a(@Nullable cfi $$0, double $$1, double $$2, double $$3, arr $$4, art $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, kd.b.d($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable cfi var1, blv var2, ih<arr> var3, art var4, float var5, float var6, long var7);

   public void a(@Nullable cfi $$0, double $$1, double $$2, double $$3, arr $$4, art $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 1.0F, 1.0F);
   }

   public void a(@Nullable cfi $$0, double $$1, double $$2, double $$3, arr $$4, art $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable cfi $$0, blv $$1, arr $$2, art $$3, float $$4, float $$5) {
      this.a($$0, $$1, kd.b.d($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(hx $$0, arr $$1, art $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(blv $$0, arr $$1, art $$2, float $$3, float $$4) {
   }

   public void a(double $$0, double $$1, double $$2, arr $$3, art $$4, float $$5, float $$6, boolean $$7) {
   }

   @Override
   public void a(jv $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(jv $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public void b(jv $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void b(jv $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public float a(float $$0) {
      float $$1 = this.f($$0);
      return $$1 * (float) (Math.PI * 2);
   }

   public void a(dim $$0) {
      (this.b ? this.a : this.r).add($$0);
   }

   protected void R() {
      bgs $$0 = this.af();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.r.addAll(this.a);
         this.a.clear();
      }

      Iterator<dim> $$1 = this.r.iterator();
      boolean $$2 = this.s().i();

      while ($$1.hasNext()) {
         dim $$3 = $$1.next();
         if ($$3.b()) {
            $$1.remove();
         } else if ($$2 && this.n($$3.c())) {
            $$3.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends blv> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Ticking entity");
         p $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new y($$3);
      }
   }

   public boolean h(blv $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean n(hx $$0) {
      return this.a(csw.a($$0));
   }

   public cth a(@Nullable blv $$0, double $$1, double $$2, double $$3, float $$4, ctp.a $$5) {
      return this.a($$0, cth.a(this, $$0), null, $$1, $$2, $$3, $$4, false, $$5, jx.x, jx.w, ars.jA);
   }

   public cth a(@Nullable blv $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, ctp.a $$6) {
      return this.a($$0, cth.a(this, $$0), null, $$1, $$2, $$3, $$4, $$5, $$6, jx.x, jx.w, ars.jA);
   }

   public cth a(@Nullable blv $$0, @Nullable bkt $$1, @Nullable cti $$2, elt $$3, float $$4, boolean $$5, ctp.a $$6) {
      return this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6, jx.x, jx.w, ars.jA);
   }

   public cth a(@Nullable blv $$0, @Nullable bkt $$1, @Nullable cti $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, ctp.a $$8) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, jx.x, jx.w, ars.jA);
   }

   public cth a(
      @Nullable blv $$0, @Nullable bkt $$1, @Nullable cti $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, ctp.a $$8, jv $$9, jv $$10, arr $$11
   ) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, true, $$9, $$10, $$11);
   }

   public cth a(
      @Nullable blv $$0,
      @Nullable bkt $$1,
      @Nullable cti $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      ctp.a $$8,
      boolean $$9,
      jv $$10,
      jv $$11,
      arr $$12
   ) {
      cth.a $$13 = switch ($$8) {
         case a -> cth.a.a;
         case b -> this.a(ctl.Q);
         case c -> this.Z().b(ctl.c) ? this.a(ctl.R) : cth.a.a;
         case d -> this.a(ctl.S);
         case e -> cth.a.d;
      };
      cth $$14 = new cth(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$13, $$10, $$11, $$12);
      $$14.c();
      $$14.a($$9);
      return $$14;
   }

   private cth.a a(ctl.e<ctl.a> $$0) {
      return this.Z().b($$0) ? cth.a.c : cth.a.b;
   }

   public abstract String H();

   @Nullable
   @Override
   public dgv c_(hx $$0) {
      if (this.s($$0)) {
         return null;
      } else {
         return !this.B && Thread.currentThread() != this.c ? null : this.m($$0).a($$0, dlo.b.a);
      }
   }

   public void a(dgv $$0) {
      hx $$1 = $$0.aB_();
      if (!this.s($$1)) {
         this.m($$1).b($$0);
      }
   }

   public void o(hx $$0) {
      if (!this.s($$0)) {
         this.m($$0).d($$0);
      }
   }

   public boolean p(hx $$0) {
      return this.s($$0) ? false : this.L().b(iz.a($$0.u()), iz.a($$0.w()));
   }

   public boolean a(hx $$0, blv $$1, ic $$2) {
      if (this.s($$0)) {
         return false;
      } else {
         dld $$3 = this.a(iz.a($$0.u()), iz.a($$0.w()), dli.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(hx $$0, blv $$1) {
      return this.a($$0, $$1, ic.b);
   }

   public void S() {
      double $$0 = 1.0 - (double)(this.d(1.0F) * 5.0F) / 16.0;
      double $$1 = 1.0 - (double)(this.b(1.0F) * 5.0F) / 16.0;
      double $$2 = 0.5 + 2.0 * auo.a((double)auo.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void b(boolean $$0, boolean $$1) {
      this.L().a($$0, $$1);
   }

   public hx T() {
      hx $$0 = new hx(this.A.a(), this.A.b(), this.A.c());
      if (!this.D_().a($$0)) {
         $$0 = this.a(doq.a.e, hx.a(this.D_().a(), 0.0, this.D_().b()));
      }

      return $$0;
   }

   public float U() {
      return this.A.d();
   }

   protected void V() {
      if (this.A.k()) {
         this.w = 1.0F;
         if (this.A.i()) {
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
   public csv c(int $$0, int $$1) {
      return this.a($$0, $$1, dli.n, false);
   }

   @Override
   public List<blv> a(@Nullable blv $$0, elo $$1, Predicate<? super blv> $$2) {
      this.af().d("getEntities");
      List<blv> $$3 = Lists.newArrayList();
      this.G().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }

         if ($$3x instanceof cao) {
            for (cam $$4 : ((cao)$$3x).ga()) {
               if ($$3x != $$0 && $$2.test($$4)) {
                  $$3.add($$4);
               }
            }
         }
      });
      return $$3;
   }

   @Override
   public <T extends blv> List<T> a(dnf<blv, T> $$0, elo $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends blv> void a(dnf<blv, T> $$0, elo $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends blv> void a(dnf<blv, T> $$0, elo $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      this.af().d("getEntities");
      this.G().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return atc.a.b;
            }
         }

         if ($$4x instanceof cao $$5) {
            for (cam $$6 : $$5.ga()) {
               T $$7 = $$0.a($$6);
               if ($$7 != null && $$2.test($$7)) {
                  $$3.add($$7);
                  if ($$3.size() >= $$4) {
                     return atc.a.b;
                  }
               }
            }
         }

         return atc.a.a;
      });
   }

   @Nullable
   public abstract blv a(int var1);

   public void q(hx $$0) {
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
      return this.A.e();
   }

   public long Y() {
      return this.A.f();
   }

   public boolean a(cfi $$0, hx $$1) {
      return true;
   }

   public void a(blv $$0, byte $$1) {
   }

   public void a(blv $$0, bkt $$1) {
   }

   public void a(hx $$0, cwq $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public egi B_() {
      return this.A;
   }

   public ctl Z() {
      return this.A.q();
   }

   public abstract bkl s();

   public float b(float $$0) {
      return auo.i($$0, this.x, this.y) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = auo.a($$0, 0.0F, 1.0F);
      this.x = $$1;
      this.y = $$1;
   }

   public float d(float $$0) {
      return auo.i($$0, this.v, this.w);
   }

   public void e(float $$0) {
      float $$1 = auo.a($$0, 0.0F, 1.0F);
      this.v = $$1;
      this.w = $$1;
   }

   public boolean aa() {
      return this.E_().g() && !this.E_().h() ? (double)this.b(1.0F) > 0.9 : false;
   }

   public boolean ab() {
      return (double)this.d(1.0F) > 0.2;
   }

   public boolean r(hx $$0) {
      if (!this.ab()) {
         return false;
      } else if (!this.h($$0)) {
         return false;
      } else if (this.a(doq.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         cuo $$1 = this.t($$0).a();
         return $$1.a($$0) == cuo.c.b;
      }
   }

   @Nullable
   public abstract egb a(String var1);

   public abstract void a(String var1, egb var2);

   public abstract int v();

   public void b(int $$0, hx $$1, int $$2) {
   }

   public p a(o $$0) {
      p $$1 = $$0.a("Affected level", 1);
      $$1.a("All players", () -> this.x().size() + " total; " + this.x());
      $$1.a("Chunk stats", this.L()::e);
      $$1.a("Level dimension", () -> this.ae().a().toString());

      try {
         this.A.a($$1, this);
      } catch (Throwable var4) {
         $$1.a("Level Data Unobtainable", var4);
      }

      return $$1;
   }

   public abstract void a(int var1, hx var2, int var3);

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, @Nullable sn $$6) {
   }

   public abstract emx K();

   public void c(hx $$0, cwq $$1) {
      for (ic $$2 : ic.c.a) {
         hx $$3 = $$0.a($$2);
         if (this.B($$3)) {
            djh $$4 = this.a_($$3);
            if ($$4.a(cws.gY)) {
               this.a($$4, $$3, $$1, $$0, false);
            } else if ($$4.g(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(cws.gY)) {
                  this.a($$4, $$3, $$1, $$0, false);
               }
            }
         }
      }
   }

   @Override
   public bjz d_(hx $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.B($$0)) {
         $$2 = this.ap();
         $$1 = this.m($$0).u();
      }

      return new bjz(this.ak(), this.Y(), $$1, $$2);
   }

   @Override
   public int C_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public dky D_() {
      return this.G;
   }

   public void a(xf<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public dmq E_() {
      return this.E.a();
   }

   public ahf<dmq> ac() {
      return this.D;
   }

   public ih<dmq> ad() {
      return this.E;
   }

   public ahf<ctp> ae() {
      return this.I;
   }

   @Override
   public auv F_() {
      return this.z;
   }

   @Override
   public boolean a(hx $$0, Predicate<djh> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(hx $$0, Predicate<eer> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract cqf r();

   public hx a(int $$0, int $$1, int $$2, int $$3) {
      this.t = this.t * 3 + 1013904223;
      int $$4 = this.t >> 2;
      return new hx($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean t() {
      return false;
   }

   public bgs af() {
      return this.F.get();
   }

   public Supplier<bgs> ag() {
      return this.F;
   }

   @Override
   public cuq G_() {
      return this.H;
   }

   public final boolean ah() {
      return this.d;
   }

   protected abstract dnh<blv> G();

   @Override
   public long H_() {
      return this.L++;
   }

   @Override
   public iu I_() {
      return this.J;
   }

   public bku ai() {
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
