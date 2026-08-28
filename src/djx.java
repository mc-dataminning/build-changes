import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public abstract class djx implements djy, efw<bwt>, AutoCloseable {
   public static final Codec<alh<djx>> h = alh.a(mh.bp);
   public static final alh<djx> i = alh.a(mh.bp, ali.b("overworld"));
   public static final alh<djx> j = alh.a(mh.bp, ali.b("the_nether"));
   public static final alh<djx> k = alh.a(mh.bp, ali.b("the_end"));
   public static final int l = 30000000;
   public static final int m = 512;
   public static final int n = 32;
   public static final int o = 15;
   public static final int p = 24000;
   public static final int q = 20000000;
   public static final int r = -20000000;
   protected final List<eaa> s = Lists.newArrayList();
   protected final eyv t;
   private final List<eaa> a = Lists.newArrayList();
   private boolean b;
   private final Thread c;
   private final boolean d;
   private int e;
   protected int u = azx.a().f();
   protected final int v = 1013904223;
   protected float w;
   protected float x;
   protected float y;
   protected float z;
   public final azx A = azx.a();
   @Deprecated
   private final azx f = azx.b();
   private final jf<efb> E;
   protected final fac B;
   public final boolean C;
   private final ecw F;
   private final dlc G;
   private final alh<djx> H;
   private final jt I;
   private final bvj J;
   private long K;

   protected djx(fac $$0, alh<djx> $$1, jt $$2, jf<efb> $$3, boolean $$4, boolean $$5, long $$6, int $$7) {
      this.B = $$0;
      this.E = $$3;
      final efb $$8 = $$3.a();
      this.H = $$1;
      this.C = $$4;
      if ($$8.k() != 1.0) {
         this.F = new ecw() {
            @Override
            public double a() {
               return super.a() / $$8.k();
            }

            @Override
            public double b() {
               return super.b() / $$8.k();
            }
         };
      } else {
         this.F = new ecw();
      }

      this.c = Thread.currentThread();
      this.G = new dlc(this, $$6);
      this.d = $$5;
      this.t = new eyq(this, $$7);
      this.I = $$2;
      this.J = new bvj($$2);
   }

   @Override
   public boolean A_() {
      return this.C;
   }

   @Nullable
   @Override
   public MinecraftServer p() {
      return null;
   }

   public boolean k(iv $$0) {
      return !this.t($$0) && g($$0);
   }

   public static boolean l(iv $$0) {
      return !b($$0.v()) && g($$0);
   }

   private static boolean g(iv $$0) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000;
   }

   private static boolean b(int $$0) {
      return $$0 < -20000000 || $$0 >= 20000000;
   }

   public edl m(iv $$0) {
      return this.d(jy.a($$0.u()), jy.a($$0.w()));
   }

   public edl d(int $$0, int $$1) {
      return (edl)this.a($$0, $$1, eec.n);
   }

   @Nullable
   @Override
   public edb a(int $$0, int $$1, eec $$2, boolean $$3) {
      edb $$4 = this.S().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(iv $$0, ebe $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(iv $$0, ebe $$1, int $$2, int $$3) {
      if (this.t($$0)) {
         return false;
      } else if (!this.C && this.ak()) {
         return false;
      } else {
         edl $$4 = this.m($$0);
         dnc $$5 = $$1.b();
         ebe $$6 = $$4.a($$0, $$1, $$2);
         if ($$6 == null) {
            return false;
         } else {
            ebe $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.C || ($$2 & 4) == 0) && (this.C || $$4.F() != null && $$4.F().a(arg.c))) {
                  this.a($$0, $$6, $$1, $$2);
               }

               if (($$2 & 1) != 0) {
                  this.a($$0, $$6.b());
                  if (!this.C && $$1.q()) {
                     this.b($$0, $$5);
                  }
               }

               if (($$2 & 16) == 0 && $$3 > 0) {
                  int $$8 = $$2 & -34;
                  $$6.b(this, $$0, $$8, $$3 - 1);
                  $$1.a((djy)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(iv $$0, ebe $$1, ebe $$2) {
   }

   @Override
   public boolean a(iv $$0, boolean $$1) {
      exo $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(iv $$0, boolean $$1, @Nullable bwt $$2, int $$3) {
      ebe $$4 = this.a_($$0);
      if ($$4.l()) {
         return false;
      } else {
         exo $$5 = this.b_($$0);
         if (!($$4.b() instanceof dmp)) {
            this.c(2001, $$0, dnc.j($$4));
         }

         if ($$1) {
            dyc $$6 = $$4.x() ? this.c_($$0) : null;
            dnc.a($$4, this, $$0, $$6, $$2, czy.k);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(ege.f, $$0, ege.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(iv $$0, ebe $$1) {
   }

   public boolean b(iv $$0, ebe $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(iv var1, ebe var2, ebe var3, int var4);

   public void b(iv $$0, ebe $$1, ebe $$2) {
   }

   public void a(iv $$0, dnc $$1, @Nullable eyw $$2) {
   }

   public void a(iv $$0, dnc $$1, jb $$2, @Nullable eyw $$3) {
   }

   public void b(iv $$0, dnc $$1, @Nullable eyw $$2) {
   }

   public void a(ebe $$0, iv $$1, dnc $$2, @Nullable eyw $$3, boolean $$4) {
   }

   @Override
   public void a(jb $$0, iv $$1, iv $$2, ebe $$3, int $$4, int $$5) {
      this.t.a($$0, $$3, $$1, $$2, $$4, $$5);
   }

   @Override
   public int a(ehd.a $$0, int $$1, int $$2) {
      int $$4;
      if ($$1 >= -30000000 && $$2 >= -30000000 && $$1 < 30000000 && $$2 < 30000000) {
         if (this.b(jy.a($$1), jy.a($$2))) {
            $$4 = this.d(jy.a($$1), jy.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
         } else {
            $$4 = this.K_();
         }
      } else {
         $$4 = this.P() + 1;
      }

      return $$4;
   }

   @Override
   public exd B_() {
      return this.S().q();
   }

   @Override
   public ebe a_(iv $$0) {
      if (this.t($$0)) {
         return dne.nH.m();
      } else {
         edl $$1 = this.d(jy.a($$0.u()), jy.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public exo b_(iv $$0) {
      if (this.t($$0)) {
         return exp.a.g();
      } else {
         edl $$1 = this.m($$0);
         return $$1.b_($$0);
      }
   }

   public boolean V() {
      return !this.F_().a() && this.e < 4;
   }

   public boolean W() {
      return !this.F_().a() && !this.V();
   }

   public boolean X() {
      if (!this.F_().j()) {
         return false;
      } else {
         int $$0 = (int)(this.af() % 24000L);
         return $$0 >= 12600 && $$0 <= 23400;
      }
   }

   @Override
   public void a(@Nullable bwt $$0, iv $$1, awo $$2, awq $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable bwt var1, double var2, double var4, double var6, jf<awo> var8, awq var9, float var10, float var11, long var12);

   public void a(@Nullable bwt $$0, double $$1, double $$2, double $$3, awo $$4, awq $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, mg.b.e($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable bwt var1, bwt var2, jf<awo> var3, awq var4, float var5, float var6, long var7);

   public void a(@Nullable bwt $$0, double $$1, double $$2, double $$3, awo $$4, awq $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 1.0F, 1.0F);
   }

   public void a(@Nullable bwt $$0, double $$1, double $$2, double $$3, awo $$4, awq $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable bwt $$0, double $$1, double $$2, double $$3, jf<awo> $$4, awq $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable bwt $$0, bwt $$1, awo $$2, awq $$3, float $$4, float $$5) {
      this.a($$0, $$1, mg.b.e($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(iv $$0, awo $$1, awq $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(bwt $$0, awo $$1, awq $$2, float $$3, float $$4) {
   }

   public void a(double $$0, double $$1, double $$2, awo $$3, awq $$4, float $$5, float $$6, boolean $$7) {
   }

   public void a(awo $$0, awq $$1, float $$2, float $$3) {
   }

   @Override
   public void a(lw $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(lw $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
   }

   public void b(lw $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(lw $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public float a(float $$0) {
      float $$1 = this.f($$0);
      return $$1 * (float) (Math.PI * 2);
   }

   public void a(eaa $$0) {
      (this.b ? this.a : this.s).add($$0);
   }

   protected void Y() {
      brb $$0 = bra.a();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.s.addAll(this.a);
         this.a.clear();
      }

      Iterator<eaa> $$1 = this.s.iterator();
      boolean $$2 = this.u().i();

      while ($$1.hasNext()) {
         eaa $$3 = $$1.next();
         if ($$3.b()) {
            $$1.remove();
         } else if ($$2 && this.n($$3.c())) {
            $$3.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends bwt> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         p $$3 = p.a(var6, "Ticking entity");
         q $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new aa($$3);
      }
   }

   public boolean h(bwt $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean n(iv $$0) {
      return this.a(djc.a($$0));
   }

   public void a(@Nullable bwt $$0, double $$1, double $$2, double $$3, float $$4, djx.a $$5) {
      this.a($$0, djq.a(this, $$0), null, $$1, $$2, $$3, $$4, false, $$5, ly.w, ly.v, awp.kI);
   }

   public void a(@Nullable bwt $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, djx.a $$6) {
      this.a($$0, djq.a(this, $$0), null, $$1, $$2, $$3, $$4, $$5, $$6, ly.w, ly.v, awp.kI);
   }

   public void a(@Nullable bwt $$0, @Nullable bvi $$1, @Nullable djr $$2, ffq $$3, float $$4, boolean $$5, djx.a $$6) {
      this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6, ly.w, ly.v, awp.kI);
   }

   public void a(@Nullable bwt $$0, @Nullable bvi $$1, @Nullable djr $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, djx.a $$8) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, ly.w, ly.v, awp.kI);
   }

   public abstract void a(
      @Nullable bwt var1,
      @Nullable bvi var2,
      @Nullable djr var3,
      double var4,
      double var6,
      double var8,
      float var10,
      boolean var11,
      djx.a var12,
      lw var13,
      lw var14,
      jf<awo> var15
   );

   public abstract String J();

   @Nullable
   @Override
   public dyc c_(iv $$0) {
      if (this.t($$0)) {
         return null;
      } else {
         return !this.C && Thread.currentThread() != this.c ? null : this.m($$0).a($$0, edl.b.a);
      }
   }

   public void a(dyc $$0) {
      iv $$1 = $$0.aB_();
      if (!this.t($$1)) {
         this.m($$1).b($$0);
      }
   }

   public void o(iv $$0) {
      if (!this.t($$0)) {
         this.m($$0).d($$0);
      }
   }

   public boolean p(iv $$0) {
      return this.t($$0) ? false : this.S().b(jy.a($$0.u()), jy.a($$0.w()));
   }

   public boolean a(iv $$0, bwt $$1, jb $$2) {
      if (this.t($$0)) {
         return false;
      } else {
         edb $$3 = this.a(jy.a($$0.u()), jy.a($$0.w()), eec.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(iv $$0, bwt $$1) {
      return this.a($$0, $$1, jb.b);
   }

   public void Z() {
      double $$0 = 1.0 - (double)(this.d(1.0F) * 5.0F) / 16.0;
      double $$1 = 1.0 - (double)(this.b(1.0F) * 5.0F) / 16.0;
      double $$2 = 0.5 + 2.0 * azo.a((double)azo.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void a(boolean $$0) {
      this.S().b($$0);
   }

   public iv aa() {
      iv $$0 = this.B.a();
      if (!this.E_().a($$0)) {
         $$0 = this.a(ehd.a.e, iv.a(this.E_().a(), 0.0, this.E_().b()));
      }

      return $$0;
   }

   public float ab() {
      return this.B.b();
   }

   protected void ac() {
      if (this.B.i()) {
         this.x = 1.0F;
         if (this.B.g()) {
            this.z = 1.0F;
         }
      }
   }

   @Override
   public void close() throws IOException {
      this.S().close();
   }

   @Nullable
   @Override
   public djb c(int $$0, int $$1) {
      return this.a($$0, $$1, eec.n, false);
   }

   @Override
   public List<bwt> a(@Nullable bwt $$0, ffl $$1, Predicate<? super bwt> $$2) {
      bra.a().f("getEntities");
      List<bwt> $$3 = Lists.newArrayList();
      this.H().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }
      });

      for (cms $$4 : this.s()) {
         if ($$4 != $$0 && $$4.a != $$0 && $$2.test($$4) && $$1.c($$4.cR())) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   @Override
   public <T extends bwt> List<T> a(efq<bwt, T> $$0, ffl $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends bwt> void a(efq<bwt, T> $$0, ffl $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends bwt> void a(efq<bwt, T> $$0, ffl $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      bra.a().f("getEntities");
      this.H().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return axz.a.b;
            }
         }

         if ($$4x instanceof cmv $$5) {
            for (cms $$6 : $$5.q()) {
               T $$7 = $$0.a($$6);
               if ($$7 != null && $$2.test($$7)) {
                  $$3.add($$7);
                  if ($$3.size() >= $$4) {
                     return axz.a.b;
                  }
               }
            }
         }

         return axz.a.a;
      });
   }

   public List<bwt> i(bwt $$0, ffl $$1) {
      return this.a($$0, $$1, bxa.a($$0));
   }

   @Nullable
   public abstract bwt a(int var1);

   @Nullable
   public bwt b(UUID $$0) {
      return this.H().a($$0);
   }

   public abstract Collection<cms> s();

   public void q(iv $$0) {
      if (this.C($$0)) {
         this.m($$0).i();
      }
   }

   public void ad() {
   }

   public long ae() {
      return this.B.c();
   }

   public long af() {
      return this.B.d();
   }

   public boolean a(bwt $$0, iv $$1) {
      return true;
   }

   public void a(bwt $$0, byte $$1) {
   }

   public void a(bwt $$0, bvi $$1) {
   }

   public void a(iv $$0, dnc $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public ezr C_() {
      return this.B;
   }

   public abstract bva u();

   public float b(float $$0) {
      return azo.h($$0, this.y, this.z) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = azo.a($$0, 0.0F, 1.0F);
      this.y = $$1;
      this.z = $$1;
   }

   public float d(float $$0) {
      return azo.h($$0, this.w, this.x);
   }

   public void e(float $$0) {
      float $$1 = azo.a($$0, 0.0F, 1.0F);
      this.w = $$1;
      this.x = $$1;
   }

   private boolean a() {
      return this.F_().g() && !this.F_().h();
   }

   public boolean ag() {
      return this.a() && (double)this.b(1.0F) > 0.9;
   }

   public boolean ah() {
      return this.a() && (double)this.d(1.0F) > 0.2;
   }

   public boolean r(iv $$0) {
      if (!this.ah()) {
         return false;
      } else if (!this.h($$0)) {
         return false;
      } else if (this.a(ehd.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         dla $$1 = this.u($$0).a();
         return $$1.a($$0, this.P()) == dla.c.b;
      }
   }

   @Nullable
   public abstract ezj a(ezh var1);

   public abstract void a(ezh var1, ezj var2);

   public abstract ezh x();

   public void b(int $$0, iv $$1, int $$2) {
   }

   public q a(p $$0) {
      q $$1 = $$0.a("Affected level", 1);
      $$1.a("All players", () -> this.z().size() + " total; " + this.z());
      $$1.a("Chunk stats", this.S()::e);
      $$1.a("Level dimension", () -> this.aj().a().toString());

      try {
         this.B.a($$1, this);
      } catch (Throwable var4) {
         $$1.a("Level Data Unobtainable", var4);
      }

      return $$1;
   }

   public abstract void a(int var1, iv var2, int var3);

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<dcm> $$6) {
   }

   public abstract fgv R();

   public void b(iv $$0, dnc $$1) {
      for (jb $$2 : jb.c.a) {
         iv $$3 = $$0.a($$2);
         if (this.C($$3)) {
            ebe $$4 = this.a_($$3);
            if ($$4.a(dne.hz)) {
               this.a($$4, $$3, $$1, null, false);
            } else if ($$4.d(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(dne.hz)) {
                  this.a($$4, $$3, $$1, null, false);
               }
            }
         }
      }
   }

   @Override
   public bup d_(iv $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.C($$0)) {
         $$2 = this.as();
         $$1 = this.m($$0).w();
      }

      return new bup(this.an(), this.af(), $$1, $$2);
   }

   @Override
   public int D_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public ecw E_() {
      return this.F;
   }

   public void a(zh<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public efb F_() {
      return this.E.a();
   }

   public jf<efb> ai() {
      return this.E;
   }

   public alh<djx> aj() {
      return this.H;
   }

   @Override
   public azx G_() {
      return this.A;
   }

   @Override
   public boolean a(iv $$0, Predicate<ebe> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(iv $$0, Predicate<exo> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract deq Q();

   public iv a(int $$0, int $$1, int $$2, int $$3) {
      this.u = this.u * 3 + 1013904223;
      int $$4 = this.u >> 2;
      return new iv($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean v() {
      return false;
   }

   @Override
   public dlc H_() {
      return this.G;
   }

   public final boolean ak() {
      return this.d;
   }

   protected abstract efs<bwt> H();

   @Override
   public long I_() {
      return this.K++;
   }

   @Override
   public jt J_() {
      return this.I;
   }

   public bvj al() {
      return this.J;
   }

   public abstract dbt L();

   public abstract dzb M();

   public int s(iv $$0) {
      return 0;
   }

   public static enum a implements bam {
      a("none"),
      b("block"),
      c("mob"),
      d("tnt"),
      e("trigger");

      public static final Codec<djx.a> f = bam.a(djx.a::values);
      private final String g;

      private a(final String $$0) {
         this.g = $$0;
      }

      @Override
      public String c() {
         return this.g;
      }
   }
}
