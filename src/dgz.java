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

public abstract class dgz implements dha, AutoCloseable {
   public static final Codec<alo<dgz>> h = alo.a(mb.be);
   public static final alo<dgz> i = alo.a(mb.be, alp.b("overworld"));
   public static final alo<dgz> j = alo.a(mb.be, alp.b("the_nether"));
   public static final alo<dgz> k = alo.a(mb.be, alp.b("the_end"));
   public static final int l = 30000000;
   public static final int m = 512;
   public static final int n = 32;
   public static final int o = 15;
   public static final int p = 24000;
   public static final int q = 20000000;
   public static final int r = -20000000;
   protected final List<dwl> s = Lists.newArrayList();
   protected final eux t;
   private final List<dwl> a = Lists.newArrayList();
   private boolean b;
   private final Thread c;
   private final boolean d;
   private int e;
   protected int u = bac.a().f();
   protected final int v = 1013904223;
   protected float w;
   protected float x;
   protected float y;
   protected float z;
   public final bac A = bac.a();
   @Deprecated
   private final bac f = bac.b();
   private final jq<ebj> E;
   protected final ewd B;
   public final boolean C;
   private final dze F;
   private final did G;
   private final alo<dgz> H;
   private final ke I;
   private final bts J;
   private long K;

   protected dgz(ewd $$0, alo<dgz> $$1, ke $$2, jq<ebj> $$3, boolean $$4, boolean $$5, long $$6, int $$7) {
      this.B = $$0;
      this.E = $$3;
      final ebj $$8 = $$3.a();
      this.H = $$1;
      this.C = $$4;
      if ($$8.k() != 1.0) {
         this.F = new dze() {
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
         this.F = new dze();
      }

      this.c = Thread.currentThread();
      this.G = new did(this, $$6);
      this.d = $$5;
      this.t = new eus(this, $$7);
      this.I = $$2;
      this.J = new bts($$2);
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

   public boolean k(jh $$0) {
      return !this.s($$0) && g($$0);
   }

   public static boolean l(jh $$0) {
      return !b($$0.v()) && g($$0);
   }

   private static boolean g(jh $$0) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000;
   }

   private static boolean b(int $$0) {
      return $$0 < -20000000 || $$0 >= 20000000;
   }

   public dzt m(jh $$0) {
      return this.d(kj.a($$0.u()), kj.a($$0.w()));
   }

   public dzt d(int $$0, int $$1) {
      return (dzt)this.a($$0, $$1, eak.n);
   }

   @Nullable
   @Override
   public dzj a(int $$0, int $$1, eak $$2, boolean $$3) {
      dzj $$4 = this.S().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(jh $$0, dxo $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(jh $$0, dxo $$1, int $$2, int $$3) {
      if (this.s($$0)) {
         return false;
      } else if (!this.C && this.aj()) {
         return false;
      } else {
         dzt $$4 = this.m($$0);
         dkd $$5 = $$1.b();
         dxo $$6 = $$4.a($$0, $$1, ($$2 & 64) != 0);
         if ($$6 == null) {
            return false;
         } else {
            dxo $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.C || ($$2 & 4) == 0) && (this.C || $$4.F() != null && $$4.F().a(arm.c))) {
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
                  $$1.a((dha)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(jh $$0, dxo $$1, dxo $$2) {
   }

   @Override
   public boolean a(jh $$0, boolean $$1) {
      etq $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(jh $$0, boolean $$1, @Nullable bvb $$2, int $$3) {
      dxo $$4 = this.a_($$0);
      if ($$4.l()) {
         return false;
      } else {
         etq $$5 = this.b_($$0);
         if (!($$4.b() instanceof djq)) {
            this.c(2001, $$0, dkd.j($$4));
         }

         if ($$1) {
            duq $$6 = $$4.x() ? this.c_($$0) : null;
            dkd.a($$4, this, $$0, $$6, $$2, cxg.j);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(eck.f, $$0, eck.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(jh $$0, dxo $$1) {
   }

   public boolean b(jh $$0, dxo $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(jh var1, dxo var2, dxo var3, int var4);

   public void b(jh $$0, dxo $$1, dxo $$2) {
   }

   public void a(jh $$0, dkd $$1) {
   }

   public void a(jh $$0, dkd $$1, @Nullable euy $$2) {
   }

   public void a(jh $$0, dkd $$1, jm $$2, @Nullable euy $$3) {
   }

   public void b(jh $$0, dkd $$1, @Nullable euy $$2) {
   }

   public void a(dxo $$0, jh $$1, dkd $$2, @Nullable euy $$3, boolean $$4) {
   }

   @Override
   public void a(jm $$0, jh $$1, jh $$2, dxo $$3, int $$4, int $$5) {
      this.t.a($$0, $$3, $$1, $$2, $$4, $$5);
   }

   @Override
   public int a(edj.a $$0, int $$1, int $$2) {
      int $$4;
      if ($$1 >= -30000000 && $$2 >= -30000000 && $$1 < 30000000 && $$2 < 30000000) {
         if (this.b(kj.a($$1), kj.a($$2))) {
            $$4 = this.d(kj.a($$1), kj.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
         } else {
            $$4 = this.L_();
         }
      } else {
         $$4 = this.P() + 1;
      }

      return $$4;
   }

   @Override
   public etf C_() {
      return this.S().p();
   }

   @Override
   public dxo a_(jh $$0) {
      if (this.s($$0)) {
         return dkf.nD.m();
      } else {
         dzt $$1 = this.d(kj.a($$0.u()), kj.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public etq b_(jh $$0) {
      if (this.s($$0)) {
         return etr.a.g();
      } else {
         dzt $$1 = this.m($$0);
         return $$1.b_($$0);
      }
   }

   public boolean V() {
      return !this.G_().a() && this.e < 4;
   }

   public boolean W() {
      return !this.G_().a() && !this.V();
   }

   public void a(@Nullable bvb $$0, jh $$1, awu $$2, aww $$3, float $$4, float $$5) {
      this.a($$0 instanceof cpo $$6 ? $$6 : null, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(@Nullable cpo $$0, jh $$1, awu $$2, aww $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable cpo var1, double var2, double var4, double var6, jq<awu> var8, aww var9, float var10, float var11, long var12);

   public void a(@Nullable cpo $$0, double $$1, double $$2, double $$3, awu $$4, aww $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, ma.b.e($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable cpo var1, bvb var2, jq<awu> var3, aww var4, float var5, float var6, long var7);

   public void a(@Nullable cpo $$0, double $$1, double $$2, double $$3, awu $$4, aww $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 1.0F, 1.0F);
   }

   public void a(@Nullable cpo $$0, double $$1, double $$2, double $$3, awu $$4, aww $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable cpo $$0, double $$1, double $$2, double $$3, jq<awu> $$4, aww $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable cpo $$0, bvb $$1, awu $$2, aww $$3, float $$4, float $$5) {
      this.a($$0, $$1, ma.b.e($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(jh $$0, awu $$1, aww $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(bvb $$0, awu $$1, aww $$2, float $$3, float $$4) {
   }

   public void a(double $$0, double $$1, double $$2, awu $$3, aww $$4, float $$5, float $$6, boolean $$7) {
   }

   @Override
   public void a(lq $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(lq $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
   }

   public void b(lq $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(lq $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public float a(float $$0) {
      float $$1 = this.f($$0);
      return $$1 * (float) (Math.PI * 2);
   }

   public void a(dwl $$0) {
      (this.b ? this.a : this.s).add($$0);
   }

   protected void X() {
      bpj $$0 = bpi.a();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.s.addAll(this.a);
         this.a.clear();
      }

      Iterator<dwl> $$1 = this.s.iterator();
      boolean $$2 = this.u().i();

      while ($$1.hasNext()) {
         dwl $$3 = $$1.next();
         if ($$3.b()) {
            $$1.remove();
         } else if ($$2 && this.n($$3.c())) {
            $$3.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends bvb> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Ticking entity");
         p $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new z($$3);
      }
   }

   public boolean h(bvb $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean n(jh $$0) {
      return this.a(dgf.a($$0));
   }

   public void a(@Nullable bvb $$0, double $$1, double $$2, double $$3, float $$4, dgz.a $$5) {
      this.a($$0, dgr.a(this, $$0), null, $$1, $$2, $$3, $$4, false, $$5, ls.w, ls.v, awv.kE);
   }

   public void a(@Nullable bvb $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, dgz.a $$6) {
      this.a($$0, dgr.a(this, $$0), null, $$1, $$2, $$3, $$4, $$5, $$6, ls.w, ls.v, awv.kE);
   }

   public void a(@Nullable bvb $$0, @Nullable btr $$1, @Nullable dgs $$2, fbr $$3, float $$4, boolean $$5, dgz.a $$6) {
      this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6, ls.w, ls.v, awv.kE);
   }

   public void a(@Nullable bvb $$0, @Nullable btr $$1, @Nullable dgs $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, dgz.a $$8) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, ls.w, ls.v, awv.kE);
   }

   public abstract void a(
      @Nullable bvb var1,
      @Nullable btr var2,
      @Nullable dgs var3,
      double var4,
      double var6,
      double var8,
      float var10,
      boolean var11,
      dgz.a var12,
      lq var13,
      lq var14,
      jq<awu> var15
   );

   public abstract String J();

   @Nullable
   @Override
   public duq c_(jh $$0) {
      if (this.s($$0)) {
         return null;
      } else {
         return !this.C && Thread.currentThread() != this.c ? null : this.m($$0).a($$0, dzt.b.a);
      }
   }

   public void a(duq $$0) {
      jh $$1 = $$0.aB_();
      if (!this.s($$1)) {
         this.m($$1).b($$0);
      }
   }

   public void o(jh $$0) {
      if (!this.s($$0)) {
         this.m($$0).d($$0);
      }
   }

   public boolean p(jh $$0) {
      return this.s($$0) ? false : this.S().b(kj.a($$0.u()), kj.a($$0.w()));
   }

   public boolean a(jh $$0, bvb $$1, jm $$2) {
      if (this.s($$0)) {
         return false;
      } else {
         dzj $$3 = this.a(kj.a($$0.u()), kj.a($$0.w()), eak.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(jh $$0, bvb $$1) {
      return this.a($$0, $$1, jm.b);
   }

   public void Y() {
      double $$0 = 1.0 - (double)(this.d(1.0F) * 5.0F) / 16.0;
      double $$1 = 1.0 - (double)(this.b(1.0F) * 5.0F) / 16.0;
      double $$2 = 0.5 + 2.0 * azu.a((double)azu.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void a(boolean $$0) {
      this.S().b($$0);
   }

   public jh Z() {
      jh $$0 = this.B.a();
      if (!this.F_().a($$0)) {
         $$0 = this.a(edj.a.e, jh.a(this.F_().a(), 0.0, this.F_().b()));
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
   public dge c(int $$0, int $$1) {
      return this.a($$0, $$1, eak.n, false);
   }

   @Override
   public List<bvb> a(@Nullable bvb $$0, fbm $$1, Predicate<? super bvb> $$2) {
      bpi.a().f("getEntities");
      List<bvb> $$3 = Lists.newArrayList();
      this.H().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }
      });

      for (cki $$4 : this.s()) {
         if ($$4 != $$0 && $$4.a != $$0 && $$2.test($$4) && $$1.c($$4.cR())) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   @Override
   public <T extends bvb> List<T> a(eby<bvb, T> $$0, fbm $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends bvb> void a(eby<bvb, T> $$0, fbm $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends bvb> void a(eby<bvb, T> $$0, fbm $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      bpi.a().f("getEntities");
      this.H().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return ayg.a.b;
            }
         }

         if ($$4x instanceof ckl $$5) {
            for (cki $$6 : $$5.x()) {
               T $$7 = $$0.a($$6);
               if ($$7 != null && $$2.test($$7)) {
                  $$3.add($$7);
                  if ($$3.size() >= $$4) {
                     return ayg.a.b;
                  }
               }
            }
         }

         return ayg.a.a;
      });
   }

   @Nullable
   public abstract bvb a(int var1);

   public abstract Collection<cki> s();

   public void q(jh $$0) {
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

   public boolean a(cpo $$0, jh $$1) {
      return true;
   }

   public void a(bvb $$0, byte $$1) {
   }

   public void a(bvb $$0, btr $$1) {
   }

   public void a(jh $$0, dkd $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public evs D_() {
      return this.B;
   }

   public abstract btj u();

   public float b(float $$0) {
      return azu.h($$0, this.y, this.z) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = azu.a($$0, 0.0F, 1.0F);
      this.y = $$1;
      this.z = $$1;
   }

   public float d(float $$0) {
      return azu.h($$0, this.w, this.x);
   }

   public void e(float $$0) {
      float $$1 = azu.a($$0, 0.0F, 1.0F);
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

   public boolean r(jh $$0) {
      if (!this.ag()) {
         return false;
      } else if (!this.h($$0)) {
         return false;
      } else if (this.a(edj.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         dib $$1 = this.t($$0).a();
         return $$1.a($$0, this.P()) == dib.c.b;
      }
   }

   @Nullable
   public abstract evk a(evi var1);

   public abstract void a(evi var1, evk var2);

   public abstract evi x();

   public void b(int $$0, jh $$1, int $$2) {
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

   public abstract void a(int var1, jh var2, int var3);

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<czv> $$6) {
   }

   public abstract fcw R();

   public void c(jh $$0, dkd $$1) {
      for (jm $$2 : jm.c.a) {
         jh $$3 = $$0.a($$2);
         if (this.B($$3)) {
            dxo $$4 = this.a_($$3);
            if ($$4.a(dkf.hv)) {
               this.a($$4, $$3, $$1, null, false);
            } else if ($$4.d(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(dkf.hv)) {
                  this.a($$4, $$3, $$1, null, false);
               }
            }
         }
      }
   }

   @Override
   public bsy d_(jh $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.B($$0)) {
         $$2 = this.ar();
         $$1 = this.m($$0).w();
      }

      return new bsy(this.am(), this.ae(), $$1, $$2);
   }

   @Override
   public int E_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public dze F_() {
      return this.F;
   }

   public void a(zr<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public ebj G_() {
      return this.E.a();
   }

   public jq<ebj> ah() {
      return this.E;
   }

   public alo<dgz> ai() {
      return this.H;
   }

   @Override
   public bac H_() {
      return this.A;
   }

   @Override
   public boolean a(jh $$0, Predicate<dxo> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(jh $$0, Predicate<etq> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract dbw Q();

   public jh a(int $$0, int $$1, int $$2, int $$3) {
      this.u = this.u * 3 + 1013904223;
      int $$4 = this.u >> 2;
      return new jh($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean v() {
      return false;
   }

   @Override
   public did I_() {
      return this.G;
   }

   public final boolean aj() {
      return this.d;
   }

   protected abstract eca<bvb> H();

   @Override
   public long J_() {
      return this.K++;
   }

   @Override
   public ke K_() {
      return this.I;
   }

   public bts ak() {
      return this.J;
   }

   public abstract cze L();

   public abstract dvo M();

   public static enum a implements baq {
      a("none"),
      b("block"),
      c("mob"),
      d("tnt"),
      e("trigger");

      public static final Codec<dgz.a> f = baq.a(dgz.a::values);
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
