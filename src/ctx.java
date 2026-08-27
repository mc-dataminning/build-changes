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

public abstract class ctx implements cty, AutoCloseable {
   public static final Codec<ahg<ctx>> g = ahg.a(ke.aM);
   public static final ahg<ctx> h = ahg.a(ke.aM, new ahh("overworld"));
   public static final ahg<ctx> i = ahg.a(ke.aM, new ahh("the_nether"));
   public static final ahg<ctx> j = ahg.a(ke.aM, new ahh("the_end"));
   public static final int k = 30000000;
   public static final int l = 512;
   public static final int m = 32;
   public static final int n = 15;
   public static final int o = 24000;
   public static final int p = 20000000;
   public static final int q = -20000000;
   protected final List<diu> r = Lists.newArrayList();
   protected final egb s;
   private final List<diu> a = Lists.newArrayList();
   private boolean b;
   private final Thread c;
   private final boolean d;
   private int e;
   protected int t = auw.a().f();
   protected final int u = 1013904223;
   protected float v;
   protected float w;
   protected float x;
   protected float y;
   public final auw z = auw.a();
   @Deprecated
   private final auw f = auw.b();
   private final ahg<dmy> D;
   private final ih<dmy> E;
   protected final ehc A;
   private final Supplier<bgt> F;
   public final boolean B;
   private final dlg G;
   private final cuy H;
   private final ahg<ctx> I;
   private final iu J;
   private final bkw K;
   private long L;

   protected ctx(ehc $$0, ahg<ctx> $$1, iu $$2, ih<dmy> $$3, Supplier<bgt> $$4, boolean $$5, boolean $$6, long $$7, int $$8) {
      this.F = $$4;
      this.A = $$0;
      this.E = $$3;
      this.D = $$3.e().orElseThrow(() -> new IllegalArgumentException("Dimension must be registered, got " + $$3));
      final dmy $$9 = $$3.a();
      this.I = $$1;
      this.B = $$5;
      if ($$9.k() != 1.0) {
         this.G = new dlg() {
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
         this.G = new dlg();
      }

      this.c = Thread.currentThread();
      this.H = new cuy(this, $$7);
      this.d = $$6;
      this.s = new efz(this, $$8);
      this.J = $$2;
      this.K = new bkw($$2);
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

   public dlw m(hx $$0) {
      return this.d(iz.a($$0.u()), iz.a($$0.w()));
   }

   public dlw d(int $$0, int $$1) {
      return (dlw)this.a($$0, $$1, dlq.n);
   }

   @Nullable
   @Override
   public dll a(int $$0, int $$1, dlq $$2, boolean $$3) {
      dll $$4 = this.L().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(hx $$0, djp $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(hx $$0, djp $$1, int $$2, int $$3) {
      if (this.s($$0)) {
         return false;
      } else if (!this.B && this.ah()) {
         return false;
      } else {
         dlw $$4 = this.m($$0);
         cwy $$5 = $$1.b();
         djp $$6 = $$4.a($$0, $$1, ($$2 & 64) != 0);
         if ($$6 == null) {
            return false;
         } else {
            djp $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.B || ($$2 & 4) == 0) && (this.B || $$4.D() != null && $$4.D().a(amx.c))) {
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
                  $$1.a((cty)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(hx $$0, djp $$1, djp $$2) {
   }

   @Override
   public boolean a(hx $$0, boolean $$1) {
      eez $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(hx $$0, boolean $$1, @Nullable blw $$2, int $$3) {
      djp $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         eez $$5 = this.b_($$0);
         if (!($$4.b() instanceof cwl)) {
            this.c(2001, $$0, cwy.i($$4));
         }

         if ($$1) {
            dhd $$6 = $$4.t() ? this.c_($$0) : null;
            cwy.a($$4, this, $$0, $$6, $$2, cng.f);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(dnz.f, $$0, dnz.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(hx $$0, djp $$1) {
   }

   public boolean b(hx $$0, djp $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(hx var1, djp var2, djp var3, int var4);

   public void b(hx $$0, djp $$1, djp $$2) {
   }

   public void a(hx $$0, cwy $$1) {
   }

   public void a(hx $$0, cwy $$1, ic $$2) {
   }

   public void a(hx $$0, cwy $$1, hx $$2) {
   }

   public void a(djp $$0, hx $$1, cwy $$2, hx $$3, boolean $$4) {
   }

   @Override
   public void a(ic $$0, djp $$1, hx $$2, hx $$3, int $$4, int $$5) {
      this.s.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int a(doy.a $$0, int $$1, int $$2) {
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
   public eeo z_() {
      return this.L().p();
   }

   @Override
   public djp a_(hx $$0) {
      if (this.s($$0)) {
         return cxa.nb.o();
      } else {
         dlw $$1 = this.d(iz.a($$0.u()), iz.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public eez b_(hx $$0) {
      if (this.s($$0)) {
         return efa.a.g();
      } else {
         dlw $$1 = this.m($$0);
         return $$1.b_($$0);
      }
   }

   public boolean P() {
      return !this.E_().a() && this.e < 4;
   }

   public boolean Q() {
      return !this.E_().a() && !this.P();
   }

   public void a(@Nullable blw $$0, hx $$1, ars $$2, aru $$3, float $$4, float $$5) {
      this.a($$0 instanceof cfq $$6 ? $$6 : null, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(@Nullable cfq $$0, hx $$1, ars $$2, aru $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable cfq var1, double var2, double var4, double var6, ih<ars> var8, aru var9, float var10, float var11, long var12);

   public void a(@Nullable cfq $$0, double $$1, double $$2, double $$3, ars $$4, aru $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, kd.b.d($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable cfq var1, blw var2, ih<ars> var3, aru var4, float var5, float var6, long var7);

   public void a(@Nullable cfq $$0, double $$1, double $$2, double $$3, ars $$4, aru $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 1.0F, 1.0F);
   }

   public void a(@Nullable cfq $$0, double $$1, double $$2, double $$3, ars $$4, aru $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable cfq $$0, blw $$1, ars $$2, aru $$3, float $$4, float $$5) {
      this.a($$0, $$1, kd.b.d($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(hx $$0, ars $$1, aru $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(blw $$0, ars $$1, aru $$2, float $$3, float $$4) {
   }

   public void a(double $$0, double $$1, double $$2, ars $$3, aru $$4, float $$5, float $$6, boolean $$7) {
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

   public void a(diu $$0) {
      (this.b ? this.a : this.r).add($$0);
   }

   protected void R() {
      bgt $$0 = this.af();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.r.addAll(this.a);
         this.a.clear();
      }

      Iterator<diu> $$1 = this.r.iterator();
      boolean $$2 = this.s().i();

      while ($$1.hasNext()) {
         diu $$3 = $$1.next();
         if ($$3.b()) {
            $$1.remove();
         } else if ($$2 && this.n($$3.c())) {
            $$3.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends blw> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Ticking entity");
         p $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new y($$3);
      }
   }

   public boolean h(blw $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean n(hx $$0) {
      return this.a(cte.a($$0));
   }

   public ctp a(@Nullable blw $$0, double $$1, double $$2, double $$3, float $$4, ctx.a $$5) {
      return this.a($$0, ctp.a(this, $$0), null, $$1, $$2, $$3, $$4, false, $$5, jx.x, jx.w, art.jP);
   }

   public ctp a(@Nullable blw $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, ctx.a $$6) {
      return this.a($$0, ctp.a(this, $$0), null, $$1, $$2, $$3, $$4, $$5, $$6, jx.x, jx.w, art.jP);
   }

   public ctp a(@Nullable blw $$0, @Nullable bkv $$1, @Nullable ctq $$2, emc $$3, float $$4, boolean $$5, ctx.a $$6) {
      return this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6, jx.x, jx.w, art.jP);
   }

   public ctp a(@Nullable blw $$0, @Nullable bkv $$1, @Nullable ctq $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, ctx.a $$8) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, jx.x, jx.w, art.jP);
   }

   public ctp a(
      @Nullable blw $$0, @Nullable bkv $$1, @Nullable ctq $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, ctx.a $$8, jv $$9, jv $$10, ars $$11
   ) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, true, $$9, $$10, $$11);
   }

   public ctp a(
      @Nullable blw $$0,
      @Nullable bkv $$1,
      @Nullable ctq $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      ctx.a $$8,
      boolean $$9,
      jv $$10,
      jv $$11,
      ars $$12
   ) {
      ctp.a $$13 = switch ($$8) {
         case a -> ctp.a.a;
         case b -> this.a(ctt.Q);
         case c -> this.Z().b(ctt.c) ? this.a(ctt.R) : ctp.a.a;
         case d -> this.a(ctt.S);
         case e -> ctp.a.d;
      };
      ctp $$14 = new ctp(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$13, $$10, $$11, $$12);
      $$14.c();
      $$14.a($$9);
      return $$14;
   }

   private ctp.a a(ctt.e<ctt.a> $$0) {
      return this.Z().b($$0) ? ctp.a.c : ctp.a.b;
   }

   public abstract String H();

   @Nullable
   @Override
   public dhd c_(hx $$0) {
      if (this.s($$0)) {
         return null;
      } else {
         return !this.B && Thread.currentThread() != this.c ? null : this.m($$0).a($$0, dlw.b.a);
      }
   }

   public void a(dhd $$0) {
      hx $$1 = $$0.aE_();
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

   public boolean a(hx $$0, blw $$1, ic $$2) {
      if (this.s($$0)) {
         return false;
      } else {
         dll $$3 = this.a(iz.a($$0.u()), iz.a($$0.w()), dlq.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(hx $$0, blw $$1) {
      return this.a($$0, $$1, ic.b);
   }

   public void S() {
      double $$0 = 1.0 - (double)(this.d(1.0F) * 5.0F) / 16.0;
      double $$1 = 1.0 - (double)(this.b(1.0F) * 5.0F) / 16.0;
      double $$2 = 0.5 + 2.0 * aup.a((double)aup.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void b(boolean $$0, boolean $$1) {
      this.L().a($$0, $$1);
   }

   public hx T() {
      hx $$0 = new hx(this.A.a(), this.A.b(), this.A.c());
      if (!this.D_().a($$0)) {
         $$0 = this.a(doy.a.e, hx.a(this.D_().a(), 0.0, this.D_().b()));
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
   public ctd c(int $$0, int $$1) {
      return this.a($$0, $$1, dlq.n, false);
   }

   @Override
   public List<blw> a(@Nullable blw $$0, elx $$1, Predicate<? super blw> $$2) {
      this.af().d("getEntities");
      List<blw> $$3 = Lists.newArrayList();
      this.G().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }

         if ($$3x instanceof cav) {
            for (cat $$4 : ((cav)$$3x).gb()) {
               if ($$3x != $$0 && $$2.test($$4)) {
                  $$3.add($$4);
               }
            }
         }
      });
      return $$3;
   }

   @Override
   public <T extends blw> List<T> a(dnn<blw, T> $$0, elx $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends blw> void a(dnn<blw, T> $$0, elx $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends blw> void a(dnn<blw, T> $$0, elx $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      this.af().d("getEntities");
      this.G().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return atd.a.b;
            }
         }

         if ($$4x instanceof cav $$5) {
            for (cat $$6 : $$5.gb()) {
               T $$7 = $$0.a($$6);
               if ($$7 != null && $$2.test($$7)) {
                  $$3.add($$7);
                  if ($$3.size() >= $$4) {
                     return atd.a.b;
                  }
               }
            }
         }

         return atd.a.a;
      });
   }

   @Nullable
   public abstract blw a(int var1);

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

   public boolean a(cfq $$0, hx $$1) {
      return true;
   }

   public void a(blw $$0, byte $$1) {
   }

   public void a(blw $$0, bkv $$1) {
   }

   public void a(hx $$0, cwy $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public egr B_() {
      return this.A;
   }

   public ctt Z() {
      return this.A.q();
   }

   public abstract bkn s();

   public float b(float $$0) {
      return aup.i($$0, this.x, this.y) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = aup.a($$0, 0.0F, 1.0F);
      this.x = $$1;
      this.y = $$1;
   }

   public float d(float $$0) {
      return aup.i($$0, this.v, this.w);
   }

   public void e(float $$0) {
      float $$1 = aup.a($$0, 0.0F, 1.0F);
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
      } else if (this.a(doy.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         cuw $$1 = this.t($$0).a();
         return $$1.a($$0) == cuw.c.b;
      }
   }

   @Nullable
   public abstract egj a(String var1);

   public abstract void a(String var1, egj var2);

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

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, @Nullable so $$6) {
   }

   public abstract eng K();

   public void c(hx $$0, cwy $$1) {
      for (ic $$2 : ic.c.a) {
         hx $$3 = $$0.a($$2);
         if (this.B($$3)) {
            djp $$4 = this.a_($$3);
            if ($$4.a(cxa.gY)) {
               this.a($$4, $$3, $$1, $$0, false);
            } else if ($$4.g(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(cxa.gY)) {
                  this.a($$4, $$3, $$1, $$0, false);
               }
            }
         }
      }
   }

   @Override
   public bka d_(hx $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.B($$0)) {
         $$2 = this.ap();
         $$1 = this.m($$0).u();
      }

      return new bka(this.ak(), this.Y(), $$1, $$2);
   }

   @Override
   public int C_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public dlg D_() {
      return this.G;
   }

   public void a(xg<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public dmy E_() {
      return this.E.a();
   }

   public ahg<dmy> ac() {
      return this.D;
   }

   public ih<dmy> ad() {
      return this.E;
   }

   public ahg<ctx> ae() {
      return this.I;
   }

   @Override
   public auw F_() {
      return this.z;
   }

   @Override
   public boolean a(hx $$0, Predicate<djp> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(hx $$0, Predicate<eez> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract cqn r();

   public hx a(int $$0, int $$1, int $$2, int $$3) {
      this.t = this.t * 3 + 1013904223;
      int $$4 = this.t >> 2;
      return new hx($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean t() {
      return false;
   }

   public bgt af() {
      return this.F.get();
   }

   public Supplier<bgt> ag() {
      return this.F;
   }

   @Override
   public cuy G_() {
      return this.H;
   }

   public final boolean ah() {
      return this.d;
   }

   protected abstract dnp<blw> G();

   @Override
   public long H_() {
      return this.L++;
   }

   @Override
   public iu I_() {
      return this.J;
   }

   public bkw ai() {
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
