import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public abstract class dgi implements dgj, AutoCloseable {
   public static final Codec<akt<dgi>> h = akt.a(mc.be);
   public static final akt<dgi> i = akt.a(mc.be, aku.b("overworld"));
   public static final akt<dgi> j = akt.a(mc.be, aku.b("the_nether"));
   public static final akt<dgi> k = akt.a(mc.be, aku.b("the_end"));
   public static final int l = 30000000;
   public static final int m = 512;
   public static final int n = 32;
   public static final int o = 15;
   public static final int p = 24000;
   public static final int q = 20000000;
   public static final int r = -20000000;
   protected final List<dvu> s = Lists.newArrayList();
   protected final eug t;
   private final List<dvu> a = Lists.newArrayList();
   private boolean b;
   private final Thread c;
   private final boolean d;
   private int e;
   protected int u = azh.a().f();
   protected final int v = 1013904223;
   protected float w;
   protected float x;
   protected float y;
   protected float z;
   public final azh A = azh.a();
   @Deprecated
   private final azh f = azh.b();
   private final jr<eas> E;
   protected final evm B;
   public final boolean C;
   private final dyn F;
   private final dhm G;
   private final akt<dgi> H;
   private final kf I;
   private final btb J;
   private long K;

   protected dgi(evm $$0, akt<dgi> $$1, kf $$2, jr<eas> $$3, boolean $$4, boolean $$5, long $$6, int $$7) {
      this.B = $$0;
      this.E = $$3;
      final eas $$8 = $$3.a();
      this.H = $$1;
      this.C = $$4;
      if ($$8.k() != 1.0) {
         this.F = new dyn() {
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
         this.F = new dyn();
      }

      this.c = Thread.currentThread();
      this.G = new dhm(this, $$6);
      this.d = $$5;
      this.t = new eub(this, $$7);
      this.I = $$2;
      this.J = new btb($$2);
   }

   @Override
   public boolean B_() {
      return this.C;
   }

   @Nullable
   @Override
   public MinecraftServer p() {
      return null;
   }

   public boolean k(ji $$0) {
      return !this.s($$0) && g($$0);
   }

   public static boolean l(ji $$0) {
      return !b($$0.v()) && g($$0);
   }

   private static boolean g(ji $$0) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000;
   }

   private static boolean b(int $$0) {
      return $$0 < -20000000 || $$0 >= 20000000;
   }

   public dzc m(ji $$0) {
      return this.d(kk.a($$0.u()), kk.a($$0.w()));
   }

   public dzc d(int $$0, int $$1) {
      return (dzc)this.a($$0, $$1, dzt.n);
   }

   @Nullable
   @Override
   public dys a(int $$0, int $$1, dzt $$2, boolean $$3) {
      dys $$4 = this.S().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(ji $$0, dwx $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(ji $$0, dwx $$1, int $$2, int $$3) {
      if (this.s($$0)) {
         return false;
      } else if (!this.C && this.aj()) {
         return false;
      } else {
         dzc $$4 = this.m($$0);
         djm $$5 = $$1.b();
         dwx $$6 = $$4.a($$0, $$1, ($$2 & 64) != 0);
         if ($$6 == null) {
            return false;
         } else {
            dwx $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.C || ($$2 & 4) == 0) && (this.C || $$4.F() != null && $$4.F().a(aqr.c))) {
                  this.a($$0, $$6, $$1, $$2);
               }

               if (($$2 & 1) != 0) {
                  this.b($$0, $$6.b());
                  if (!this.C && $$1.q()) {
                     this.c($$0, $$5);
                  }
               }

               if (($$2 & 16) == 0 && $$3 > 0) {
                  int $$8 = $$2 & -34;
                  $$6.b(this, $$0, $$8, $$3 - 1);
                  $$1.a((dgj)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(ji $$0, dwx $$1, dwx $$2) {
   }

   @Override
   public boolean a(ji $$0, boolean $$1) {
      esz $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(ji $$0, boolean $$1, @Nullable buk $$2, int $$3) {
      dwx $$4 = this.a_($$0);
      if ($$4.l()) {
         return false;
      } else {
         esz $$5 = this.b_($$0);
         if (!($$4.b() instanceof diz)) {
            this.c(2001, $$0, djm.j($$4));
         }

         if ($$1) {
            dtz $$6 = $$4.x() ? this.c_($$0) : null;
            djm.a($$4, this, $$0, $$6, $$2, cwp.j);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(ebt.f, $$0, ebt.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(ji $$0, dwx $$1) {
   }

   public boolean b(ji $$0, dwx $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(ji var1, dwx var2, dwx var3, int var4);

   public void b(ji $$0, dwx $$1, dwx $$2) {
   }

   public void a(ji $$0, djm $$1) {
   }

   public void a(ji $$0, djm $$1, @Nullable euh $$2) {
   }

   public void a(ji $$0, djm $$1, jn $$2, @Nullable euh $$3) {
   }

   public void b(ji $$0, djm $$1, @Nullable euh $$2) {
   }

   public void a(dwx $$0, ji $$1, djm $$2, @Nullable euh $$3, boolean $$4) {
   }

   @Override
   public void a(jn $$0, ji $$1, ji $$2, dwx $$3, int $$4, int $$5) {
      this.t.a($$0, $$3, $$1, $$2, $$4, $$5);
   }

   @Override
   public int a(ecs.a $$0, int $$1, int $$2) {
      int $$4;
      if ($$1 >= -30000000 && $$2 >= -30000000 && $$1 < 30000000 && $$2 < 30000000) {
         if (this.b(kk.a($$1), kk.a($$2))) {
            $$4 = this.d(kk.a($$1), kk.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
         } else {
            $$4 = this.L_();
         }
      } else {
         $$4 = this.P() + 1;
      }

      return $$4;
   }

   @Override
   public eso C_() {
      return this.S().p();
   }

   @Override
   public dwx a_(ji $$0) {
      if (this.s($$0)) {
         return djo.nD.m();
      } else {
         dzc $$1 = this.d(kk.a($$0.u()), kk.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public esz b_(ji $$0) {
      if (this.s($$0)) {
         return eta.a.g();
      } else {
         dzc $$1 = this.m($$0);
         return $$1.b_($$0);
      }
   }

   public boolean V() {
      return !this.G_().a() && this.e < 4;
   }

   public boolean W() {
      return !this.G_().a() && !this.V();
   }

   public void a(@Nullable buk $$0, ji $$1, avz $$2, awb $$3, float $$4, float $$5) {
      this.a($$0 instanceof cox $$6 ? $$6 : null, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(@Nullable cox $$0, ji $$1, avz $$2, awb $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable cox var1, double var2, double var4, double var6, jr<avz> var8, awb var9, float var10, float var11, long var12);

   public void a(@Nullable cox $$0, double $$1, double $$2, double $$3, avz $$4, awb $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, mb.b.e($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable cox var1, buk var2, jr<avz> var3, awb var4, float var5, float var6, long var7);

   public void a(@Nullable cox $$0, double $$1, double $$2, double $$3, avz $$4, awb $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 1.0F, 1.0F);
   }

   public void a(@Nullable cox $$0, double $$1, double $$2, double $$3, avz $$4, awb $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable cox $$0, double $$1, double $$2, double $$3, jr<avz> $$4, awb $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable cox $$0, buk $$1, avz $$2, awb $$3, float $$4, float $$5) {
      this.a($$0, $$1, mb.b.e($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(ji $$0, avz $$1, awb $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(buk $$0, avz $$1, awb $$2, float $$3, float $$4) {
   }

   public void a(double $$0, double $$1, double $$2, avz $$3, awb $$4, float $$5, float $$6, boolean $$7) {
   }

   @Override
   public void a(lr $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(lr $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
   }

   public void b(lr $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(lr $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public float a(float $$0) {
      float $$1 = this.f($$0);
      return $$1 * (float) (Math.PI * 2);
   }

   public void a(dvu $$0) {
      (this.b ? this.a : this.s).add($$0);
   }

   protected void X() {
      bos $$0 = bor.a();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.s.addAll(this.a);
         this.a.clear();
      }

      Iterator<dvu> $$1 = this.s.iterator();
      boolean $$2 = this.u().i();

      while ($$1.hasNext()) {
         dvu $$3 = $$1.next();
         if ($$3.b()) {
            $$1.remove();
         } else if ($$2 && this.n($$3.c())) {
            $$3.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends buk> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Ticking entity");
         p $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new z($$3);
      }
   }

   public boolean h(buk $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean n(ji $$0) {
      return this.a(dfo.a($$0));
   }

   public void a(@Nullable buk $$0, double $$1, double $$2, double $$3, float $$4, dgi.a $$5) {
      this.a($$0, dga.a(this, $$0), null, $$1, $$2, $$3, $$4, false, $$5, lt.w, lt.v, awa.kE);
   }

   public void a(@Nullable buk $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, dgi.a $$6) {
      this.a($$0, dga.a(this, $$0), null, $$1, $$2, $$3, $$4, $$5, $$6, lt.w, lt.v, awa.kE);
   }

   public void a(@Nullable buk $$0, @Nullable bta $$1, @Nullable dgb $$2, fba $$3, float $$4, boolean $$5, dgi.a $$6) {
      this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6, lt.w, lt.v, awa.kE);
   }

   public void a(@Nullable buk $$0, @Nullable bta $$1, @Nullable dgb $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, dgi.a $$8) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, lt.w, lt.v, awa.kE);
   }

   public abstract void a(
      @Nullable buk var1,
      @Nullable bta var2,
      @Nullable dgb var3,
      double var4,
      double var6,
      double var8,
      float var10,
      boolean var11,
      dgi.a var12,
      lr var13,
      lr var14,
      jr<avz> var15
   );

   public abstract String J();

   @Nullable
   @Override
   public dtz c_(ji $$0) {
      if (this.s($$0)) {
         return null;
      } else {
         return !this.C && Thread.currentThread() != this.c ? null : this.m($$0).a($$0, dzc.b.a);
      }
   }

   public void a(dtz $$0) {
      ji $$1 = $$0.aA_();
      if (!this.s($$1)) {
         this.m($$1).b($$0);
      }
   }

   public void o(ji $$0) {
      if (!this.s($$0)) {
         this.m($$0).d($$0);
      }
   }

   public boolean p(ji $$0) {
      return this.s($$0) ? false : this.S().b(kk.a($$0.u()), kk.a($$0.w()));
   }

   public boolean a(ji $$0, buk $$1, jn $$2) {
      if (this.s($$0)) {
         return false;
      } else {
         dys $$3 = this.a(kk.a($$0.u()), kk.a($$0.w()), dzt.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(ji $$0, buk $$1) {
      return this.a($$0, $$1, jn.b);
   }

   public void Y() {
      double $$0 = 1.0 - (double)(this.d(1.0F) * 5.0F) / 16.0;
      double $$1 = 1.0 - (double)(this.b(1.0F) * 5.0F) / 16.0;
      double $$2 = 0.5 + 2.0 * ayz.a((double)ayz.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void a(boolean $$0) {
      this.S().b($$0);
   }

   public ji Z() {
      ji $$0 = this.B.a();
      if (!this.F_().a($$0)) {
         $$0 = this.a(ecs.a.e, ji.a(this.F_().a(), 0.0, this.F_().b()));
      }

      return $$0;
   }

   public float aa() {
      return this.B.b();
   }

   protected void ab() {
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
   public dfn c(int $$0, int $$1) {
      return this.a($$0, $$1, dzt.n, false);
   }

   @Override
   public List<buk> a(@Nullable buk $$0, fav $$1, Predicate<? super buk> $$2) {
      bor.a().f("getEntities");
      List<buk> $$3 = Lists.newArrayList();
      this.H().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }
      });

      for (cjr $$4 : this.s()) {
         if ($$4 != $$0 && $$4.a != $$0 && $$2.test($$4) && $$1.c($$4.cR())) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   @Override
   public <T extends buk> List<T> a(ebh<buk, T> $$0, fav $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends buk> void a(ebh<buk, T> $$0, fav $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends buk> void a(ebh<buk, T> $$0, fav $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      bor.a().f("getEntities");
      this.H().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return axl.a.b;
            }
         }

         if ($$4x instanceof cju $$5) {
            for (cjr $$6 : $$5.x()) {
               T $$7 = $$0.a($$6);
               if ($$7 != null && $$2.test($$7)) {
                  $$3.add($$7);
                  if ($$3.size() >= $$4) {
                     return axl.a.b;
                  }
               }
            }
         }

         return axl.a.a;
      });
   }

   @Nullable
   public abstract buk a(int var1);

   public abstract Collection<cjr> s();

   public void q(ji $$0) {
      if (this.B($$0)) {
         this.m($$0).i();
      }
   }

   public void ac() {
   }

   public long ad() {
      return this.B.c();
   }

   public long ae() {
      return this.B.d();
   }

   public boolean a(cox $$0, ji $$1) {
      return true;
   }

   public void a(buk $$0, byte $$1) {
   }

   public void a(buk $$0, bta $$1) {
   }

   public void a(ji $$0, djm $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public evb D_() {
      return this.B;
   }

   public abstract bss u();

   public float b(float $$0) {
      return ayz.h($$0, this.y, this.z) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = ayz.a($$0, 0.0F, 1.0F);
      this.y = $$1;
      this.z = $$1;
   }

   public float d(float $$0) {
      return ayz.h($$0, this.w, this.x);
   }

   public void e(float $$0) {
      float $$1 = ayz.a($$0, 0.0F, 1.0F);
      this.w = $$1;
      this.x = $$1;
   }

   private boolean a() {
      return this.G_().g() && !this.G_().h();
   }

   public boolean af() {
      return this.a() && (double)this.b(1.0F) > 0.9;
   }

   public boolean ag() {
      return this.a() && (double)this.d(1.0F) > 0.2;
   }

   public boolean r(ji $$0) {
      if (!this.ag()) {
         return false;
      } else if (!this.h($$0)) {
         return false;
      } else if (this.a(ecs.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         dhk $$1 = this.t($$0).a();
         return $$1.a($$0, this.P()) == dhk.c.b;
      }
   }

   @Nullable
   public abstract eut a(eur var1);

   public abstract void a(eur var1, eut var2);

   public abstract eur x();

   public void b(int $$0, ji $$1, int $$2) {
   }

   public p a(o $$0) {
      p $$1 = $$0.a("Affected level", 1);
      $$1.a("All players", () -> this.z().size() + " total; " + this.z());
      $$1.a("Chunk stats", this.S()::e);
      $$1.a("Level dimension", () -> this.ai().a().toString());

      try {
         this.B.a($$1, this);
      } catch (Throwable var4) {
         $$1.a("Level Data Unobtainable", var4);
      }

      return $$1;
   }

   public abstract void a(int var1, ji var2, int var3);

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<cze> $$6) {
   }

   public abstract fcf R();

   public void c(ji $$0, djm $$1) {
      for (jn $$2 : jn.c.a) {
         ji $$3 = $$0.a($$2);
         if (this.B($$3)) {
            dwx $$4 = this.a_($$3);
            if ($$4.a(djo.hv)) {
               this.a($$4, $$3, $$1, null, false);
            } else if ($$4.d(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(djo.hv)) {
                  this.a($$4, $$3, $$1, null, false);
               }
            }
         }
      }
   }

   @Override
   public bsh d_(ji $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.B($$0)) {
         $$2 = this.ar();
         $$1 = this.m($$0).w();
      }

      return new bsh(this.am(), this.ae(), $$1, $$2);
   }

   @Override
   public int E_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public dyn F_() {
      return this.F;
   }

   public void a(yv<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public eas G_() {
      return this.E.a();
   }

   public jr<eas> ah() {
      return this.E;
   }

   public akt<dgi> ai() {
      return this.H;
   }

   @Override
   public azh H_() {
      return this.A;
   }

   @Override
   public boolean a(ji $$0, Predicate<dwx> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(ji $$0, Predicate<esz> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract dbf Q();

   public ji a(int $$0, int $$1, int $$2, int $$3) {
      this.u = this.u * 3 + 1013904223;
      int $$4 = this.u >> 2;
      return new ji($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean v() {
      return false;
   }

   @Override
   public dhm I_() {
      return this.G;
   }

   public final boolean aj() {
      return this.d;
   }

   protected abstract ebj<buk> H();

   @Override
   public long J_() {
      return this.K++;
   }

   @Override
   public kf K_() {
      return this.I;
   }

   public btb ak() {
      return this.J;
   }

   public abstract cyn L();

   public abstract dux M();

   public static enum a implements azv {
      a("none"),
      b("block"),
      c("mob"),
      d("tnt"),
      e("trigger");

      public static final Codec<dgi.a> f = azv.a(dgi.a::values);
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
