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

public abstract class cvn implements cvo, AutoCloseable {
   public static final Codec<aix<cvn>> g = aix.a(kg.aM);
   public static final aix<cvn> h = aix.a(kg.aM, new aiy("overworld"));
   public static final aix<cvn> i = aix.a(kg.aM, new aiy("the_nether"));
   public static final aix<cvn> j = aix.a(kg.aM, new aiy("the_end"));
   public static final int k = 30000000;
   public static final int l = 512;
   public static final int m = 32;
   public static final int n = 15;
   public static final int o = 24000;
   public static final int p = 20000000;
   public static final int q = -20000000;
   protected final List<dkk> r = Lists.newArrayList();
   protected final ehr s;
   private final List<dkk> a = Lists.newArrayList();
   private boolean b;
   private final Thread c;
   private final boolean d;
   private int e;
   protected int t = awo.a().f();
   protected final int u = 1013904223;
   protected float v;
   protected float w;
   protected float x;
   protected float y;
   public final awo z = awo.a();
   @Deprecated
   private final awo f = awo.b();
   private final aix<doo> D;
   private final ij<doo> E;
   protected final eis A;
   private final Supplier<bil> F;
   public final boolean B;
   private final dmw G;
   private final cwo H;
   private final aix<cvn> I;
   private final iw J;
   private final bmo K;
   private long L;

   protected cvn(eis $$0, aix<cvn> $$1, iw $$2, ij<doo> $$3, Supplier<bil> $$4, boolean $$5, boolean $$6, long $$7, int $$8) {
      this.F = $$4;
      this.A = $$0;
      this.E = $$3;
      this.D = $$3.e().orElseThrow(() -> new IllegalArgumentException("Dimension must be registered, got " + $$3));
      final doo $$9 = $$3.a();
      this.I = $$1;
      this.B = $$5;
      if ($$9.k() != 1.0) {
         this.G = new dmw() {
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
         this.G = new dmw();
      }

      this.c = Thread.currentThread();
      this.H = new cwo(this, $$7);
      this.d = $$6;
      this.s = new ehp(this, $$8);
      this.J = $$2;
      this.K = new bmo($$2);
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

   public boolean k(hz $$0) {
      return !this.s($$0) && g($$0);
   }

   public static boolean l(hz $$0) {
      return !b($$0.v()) && g($$0);
   }

   private static boolean g(hz $$0) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000;
   }

   private static boolean b(int $$0) {
      return $$0 < -20000000 || $$0 >= 20000000;
   }

   public dnm m(hz $$0) {
      return this.d(jb.a($$0.u()), jb.a($$0.w()));
   }

   public dnm d(int $$0, int $$1) {
      return (dnm)this.a($$0, $$1, dng.n);
   }

   @Nullable
   @Override
   public dnb a(int $$0, int $$1, dng $$2, boolean $$3) {
      dnb $$4 = this.L().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(hz $$0, dlf $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(hz $$0, dlf $$1, int $$2, int $$3) {
      if (this.s($$0)) {
         return false;
      } else if (!this.B && this.ah()) {
         return false;
      } else {
         dnm $$4 = this.m($$0);
         cyo $$5 = $$1.b();
         dlf $$6 = $$4.a($$0, $$1, ($$2 & 64) != 0);
         if ($$6 == null) {
            return false;
         } else {
            dlf $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.B || ($$2 & 4) == 0) && (this.B || $$4.D() != null && $$4.D().a(aoo.c))) {
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
                  $$1.a((cvo)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(hz $$0, dlf $$1, dlf $$2) {
   }

   @Override
   public boolean a(hz $$0, boolean $$1) {
      egp $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(hz $$0, boolean $$1, @Nullable bno $$2, int $$3) {
      dlf $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         egp $$5 = this.b_($$0);
         if (!($$4.b() instanceof cyb)) {
            this.c(2001, $$0, cyo.i($$4));
         }

         if ($$1) {
            dit $$6 = $$4.t() ? this.c_($$0) : null;
            cyo.a($$4, this, $$0, $$6, $$2, coz.h);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(dpp.f, $$0, dpp.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(hz $$0, dlf $$1) {
   }

   public boolean b(hz $$0, dlf $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(hz var1, dlf var2, dlf var3, int var4);

   public void b(hz $$0, dlf $$1, dlf $$2) {
   }

   public void a(hz $$0, cyo $$1) {
   }

   public void a(hz $$0, cyo $$1, ie $$2) {
   }

   public void a(hz $$0, cyo $$1, hz $$2) {
   }

   public void a(dlf $$0, hz $$1, cyo $$2, hz $$3, boolean $$4) {
   }

   @Override
   public void a(ie $$0, dlf $$1, hz $$2, hz $$3, int $$4, int $$5) {
      this.s.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int a(dqo.a $$0, int $$1, int $$2) {
      int $$4;
      if ($$1 >= -30000000 && $$2 >= -30000000 && $$1 < 30000000 && $$2 < 30000000) {
         if (this.b(jb.a($$1), jb.a($$2))) {
            $$4 = this.d(jb.a($$1), jb.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
         } else {
            $$4 = this.J_();
         }
      } else {
         $$4 = this.A_() + 1;
      }

      return $$4;
   }

   @Override
   public ege z_() {
      return this.L().p();
   }

   @Override
   public dlf a_(hz $$0) {
      if (this.s($$0)) {
         return cyq.nb.o();
      } else {
         dnm $$1 = this.d(jb.a($$0.u()), jb.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public egp b_(hz $$0) {
      if (this.s($$0)) {
         return egq.a.g();
      } else {
         dnm $$1 = this.m($$0);
         return $$1.b_($$0);
      }
   }

   public boolean P() {
      return !this.E_().a() && this.e < 4;
   }

   public boolean Q() {
      return !this.E_().a() && !this.P();
   }

   public void a(@Nullable bno $$0, hz $$1, atj $$2, atl $$3, float $$4, float $$5) {
      this.a($$0 instanceof chh $$6 ? $$6 : null, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(@Nullable chh $$0, hz $$1, atj $$2, atl $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable chh var1, double var2, double var4, double var6, ij<atj> var8, atl var9, float var10, float var11, long var12);

   public void a(@Nullable chh $$0, double $$1, double $$2, double $$3, atj $$4, atl $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, kf.b.e($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable chh var1, bno var2, ij<atj> var3, atl var4, float var5, float var6, long var7);

   public void a(@Nullable chh $$0, double $$1, double $$2, double $$3, atj $$4, atl $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 1.0F, 1.0F);
   }

   public void a(@Nullable chh $$0, double $$1, double $$2, double $$3, atj $$4, atl $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable chh $$0, bno $$1, atj $$2, atl $$3, float $$4, float $$5) {
      this.a($$0, $$1, kf.b.e($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(hz $$0, atj $$1, atl $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(bno $$0, atj $$1, atl $$2, float $$3, float $$4) {
   }

   public void a(double $$0, double $$1, double $$2, atj $$3, atl $$4, float $$5, float $$6, boolean $$7) {
   }

   @Override
   public void a(jx $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(jx $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public void b(jx $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void b(jx $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public float a(float $$0) {
      float $$1 = this.f($$0);
      return $$1 * (float) (Math.PI * 2);
   }

   public void a(dkk $$0) {
      (this.b ? this.a : this.r).add($$0);
   }

   protected void R() {
      bil $$0 = this.af();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.r.addAll(this.a);
         this.a.clear();
      }

      Iterator<dkk> $$1 = this.r.iterator();
      boolean $$2 = this.s().i();

      while ($$1.hasNext()) {
         dkk $$3 = $$1.next();
         if ($$3.b()) {
            $$1.remove();
         } else if ($$2 && this.n($$3.c())) {
            $$3.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends bno> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Ticking entity");
         p $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new y($$3);
      }
   }

   public boolean h(bno $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean n(hz $$0) {
      return this.a(cuu.a($$0));
   }

   public cvf a(@Nullable bno $$0, double $$1, double $$2, double $$3, float $$4, cvn.a $$5) {
      return this.a($$0, cvf.a(this, $$0), null, $$1, $$2, $$3, $$4, false, $$5, jz.x, jz.w, atk.jP);
   }

   public cvf a(@Nullable bno $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, cvn.a $$6) {
      return this.a($$0, cvf.a(this, $$0), null, $$1, $$2, $$3, $$4, $$5, $$6, jz.x, jz.w, atk.jP);
   }

   public cvf a(@Nullable bno $$0, @Nullable bmn $$1, @Nullable cvg $$2, ens $$3, float $$4, boolean $$5, cvn.a $$6) {
      return this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6, jz.x, jz.w, atk.jP);
   }

   public cvf a(@Nullable bno $$0, @Nullable bmn $$1, @Nullable cvg $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, cvn.a $$8) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, jz.x, jz.w, atk.jP);
   }

   public cvf a(
      @Nullable bno $$0,
      @Nullable bmn $$1,
      @Nullable cvg $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      cvn.a $$8,
      jx $$9,
      jx $$10,
      ij<atj> $$11
   ) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, true, $$9, $$10, $$11);
   }

   public cvf a(
      @Nullable bno $$0,
      @Nullable bmn $$1,
      @Nullable cvg $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      cvn.a $$8,
      boolean $$9,
      jx $$10,
      jx $$11,
      ij<atj> $$12
   ) {
      cvf.a $$13 = switch ($$8) {
         case a -> cvf.a.a;
         case b -> this.a(cvj.Q);
         case c -> this.Z().b(cvj.c) ? this.a(cvj.R) : cvf.a.a;
         case d -> this.a(cvj.S);
         case e -> cvf.a.d;
      };
      cvf $$14 = new cvf(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$13, $$10, $$11, $$12);
      $$14.c();
      $$14.a($$9);
      return $$14;
   }

   private cvf.a a(cvj.e<cvj.a> $$0) {
      return this.Z().b($$0) ? cvf.a.c : cvf.a.b;
   }

   public abstract String H();

   @Nullable
   @Override
   public dit c_(hz $$0) {
      if (this.s($$0)) {
         return null;
      } else {
         return !this.B && Thread.currentThread() != this.c ? null : this.m($$0).a($$0, dnm.b.a);
      }
   }

   public void a(dit $$0) {
      hz $$1 = $$0.aE_();
      if (!this.s($$1)) {
         this.m($$1).b($$0);
      }
   }

   public void o(hz $$0) {
      if (!this.s($$0)) {
         this.m($$0).d($$0);
      }
   }

   public boolean p(hz $$0) {
      return this.s($$0) ? false : this.L().b(jb.a($$0.u()), jb.a($$0.w()));
   }

   public boolean a(hz $$0, bno $$1, ie $$2) {
      if (this.s($$0)) {
         return false;
      } else {
         dnb $$3 = this.a(jb.a($$0.u()), jb.a($$0.w()), dng.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(hz $$0, bno $$1) {
      return this.a($$0, $$1, ie.b);
   }

   public void S() {
      double $$0 = 1.0 - (double)(this.d(1.0F) * 5.0F) / 16.0;
      double $$1 = 1.0 - (double)(this.b(1.0F) * 5.0F) / 16.0;
      double $$2 = 0.5 + 2.0 * awh.a((double)awh.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void b(boolean $$0, boolean $$1) {
      this.L().a($$0, $$1);
   }

   public hz T() {
      hz $$0 = this.A.a();
      if (!this.D_().a($$0)) {
         $$0 = this.a(dqo.a.e, hz.a(this.D_().a(), 0.0, this.D_().b()));
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
   public cut c(int $$0, int $$1) {
      return this.a($$0, $$1, dng.n, false);
   }

   @Override
   public List<bno> a(@Nullable bno $$0, enn $$1, Predicate<? super bno> $$2) {
      this.af().d("getEntities");
      List<bno> $$3 = Lists.newArrayList();
      this.G().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }

         if ($$3x instanceof ccm) {
            for (cck $$4 : ((ccm)$$3x).gc()) {
               if ($$3x != $$0 && $$2.test($$4)) {
                  $$3.add($$4);
               }
            }
         }
      });
      return $$3;
   }

   @Override
   public <T extends bno> List<T> a(dpd<bno, T> $$0, enn $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends bno> void a(dpd<bno, T> $$0, enn $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends bno> void a(dpd<bno, T> $$0, enn $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      this.af().d("getEntities");
      this.G().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return auu.a.b;
            }
         }

         if ($$4x instanceof ccm $$5) {
            for (cck $$6 : $$5.gc()) {
               T $$7 = $$0.a($$6);
               if ($$7 != null && $$2.test($$7)) {
                  $$3.add($$7);
                  if ($$3.size() >= $$4) {
                     return auu.a.b;
                  }
               }
            }
         }

         return auu.a.a;
      });
   }

   @Nullable
   public abstract bno a(int var1);

   public void q(hz $$0) {
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

   public boolean a(chh $$0, hz $$1) {
      return true;
   }

   public void a(bno $$0, byte $$1) {
   }

   public void a(bno $$0, bmn $$1) {
   }

   public void a(hz $$0, cyo $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public eih B_() {
      return this.A;
   }

   public cvj Z() {
      return this.A.o();
   }

   public abstract bmf s();

   public float b(float $$0) {
      return awh.i($$0, this.x, this.y) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = awh.a($$0, 0.0F, 1.0F);
      this.x = $$1;
      this.y = $$1;
   }

   public float d(float $$0) {
      return awh.i($$0, this.v, this.w);
   }

   public void e(float $$0) {
      float $$1 = awh.a($$0, 0.0F, 1.0F);
      this.v = $$1;
      this.w = $$1;
   }

   public boolean aa() {
      return this.E_().g() && !this.E_().h() ? (double)this.b(1.0F) > 0.9 : false;
   }

   public boolean ab() {
      return (double)this.d(1.0F) > 0.2;
   }

   public boolean r(hz $$0) {
      if (!this.ab()) {
         return false;
      } else if (!this.h($$0)) {
         return false;
      } else if (this.a(dqo.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         cwm $$1 = this.t($$0).a();
         return $$1.a($$0) == cwm.c.b;
      }
   }

   @Nullable
   public abstract ehz a(String var1);

   public abstract void a(String var1, ehz var2);

   public abstract int v();

   public void b(int $$0, hz $$1, int $$2) {
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

   public abstract void a(int var1, hz var2, int var3);

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, @Nullable sw $$6) {
   }

   public abstract eow K();

   public void c(hz $$0, cyo $$1) {
      for (ie $$2 : ie.c.a) {
         hz $$3 = $$0.a($$2);
         if (this.B($$3)) {
            dlf $$4 = this.a_($$3);
            if ($$4.a(cyq.gY)) {
               this.a($$4, $$3, $$1, $$0, false);
            } else if ($$4.g(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(cyq.gY)) {
                  this.a($$4, $$3, $$1, $$0, false);
               }
            }
         }
      }
   }

   @Override
   public bls d_(hz $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.B($$0)) {
         $$2 = this.ap();
         $$1 = this.m($$0).u();
      }

      return new bls(this.ak(), this.Y(), $$1, $$2);
   }

   @Override
   public int C_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public dmw D_() {
      return this.G;
   }

   public void a(xx<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public doo E_() {
      return this.E.a();
   }

   public aix<doo> ac() {
      return this.D;
   }

   public ij<doo> ad() {
      return this.E;
   }

   public aix<cvn> ae() {
      return this.I;
   }

   @Override
   public awo F_() {
      return this.z;
   }

   @Override
   public boolean a(hz $$0, Predicate<dlf> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(hz $$0, Predicate<egp> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract cse r();

   public hz a(int $$0, int $$1, int $$2, int $$3) {
      this.t = this.t * 3 + 1013904223;
      int $$4 = this.t >> 2;
      return new hz($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean t() {
      return false;
   }

   public bil af() {
      return this.F.get();
   }

   public Supplier<bil> ag() {
      return this.F;
   }

   @Override
   public cwo G_() {
      return this.H;
   }

   public final boolean ah() {
      return this.d;
   }

   protected abstract dpf<bno> G();

   @Override
   public long H_() {
      return this.L++;
   }

   @Override
   public iw I_() {
      return this.J;
   }

   public bmo ai() {
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
