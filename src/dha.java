import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public abstract class dha implements dhb, AutoCloseable {
   public static final Codec<aly<dha>> h = aly.a(mb.bd);
   public static final aly<dha> i = aly.a(mb.bd, alz.b("overworld"));
   public static final aly<dha> j = aly.a(mb.bd, alz.b("the_nether"));
   public static final aly<dha> k = aly.a(mb.bd, alz.b("the_end"));
   public static final int l = 30000000;
   public static final int m = 512;
   public static final int n = 32;
   public static final int o = 15;
   public static final int p = 24000;
   public static final int q = 20000000;
   public static final int r = -20000000;
   protected final List<dwk> s = Lists.newArrayList();
   protected final euw t;
   private final List<dwk> a = Lists.newArrayList();
   private boolean b;
   private final Thread c;
   private final boolean d;
   private int e;
   protected int u = bam.a().f();
   protected final int v = 1013904223;
   protected float w;
   protected float x;
   protected float y;
   protected float z;
   public final bam A = bam.a();
   @Deprecated
   private final bam f = bam.b();
   private final jq<ebi> E;
   protected final ewc B;
   public final boolean C;
   private final dzd F;
   private final die G;
   private final aly<dha> H;
   private final ke I;
   private final btw J;
   private long K;

   protected dha(ewc $$0, aly<dha> $$1, ke $$2, jq<ebi> $$3, boolean $$4, boolean $$5, long $$6, int $$7) {
      this.B = $$0;
      this.E = $$3;
      final ebi $$8 = $$3.a();
      this.H = $$1;
      this.C = $$4;
      if ($$8.k() != 1.0) {
         this.F = new dzd() {
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
         this.F = new dzd();
      }

      this.c = Thread.currentThread();
      this.G = new die(this, $$6);
      this.d = $$5;
      this.t = new eur(this, $$7);
      this.I = $$2;
      this.J = new btw($$2);
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

   public dzs m(jh $$0) {
      return this.d(kj.a($$0.u()), kj.a($$0.w()));
   }

   public dzs d(int $$0, int $$1) {
      return (dzs)this.a($$0, $$1, eaj.n);
   }

   @Nullable
   @Override
   public dzi a(int $$0, int $$1, eaj $$2, boolean $$3) {
      dzi $$4 = this.R().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(jh $$0, dxn $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(jh $$0, dxn $$1, int $$2, int $$3) {
      if (this.s($$0)) {
         return false;
      } else if (!this.C && this.ai()) {
         return false;
      } else {
         dzs $$4 = this.m($$0);
         dke $$5 = $$1.b();
         dxn $$6 = $$4.a($$0, $$1, ($$2 & 64) != 0);
         if ($$6 == null) {
            return false;
         } else {
            dxn $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.C || ($$2 & 4) == 0) && (this.C || $$4.C() != null && $$4.C().a(arw.c))) {
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
                  $$1.a((dhb)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(jh $$0, dxn $$1, dxn $$2) {
   }

   @Override
   public boolean a(jh $$0, boolean $$1) {
      etp $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(jh $$0, boolean $$1, @Nullable bvf $$2, int $$3) {
      dxn $$4 = this.a_($$0);
      if ($$4.l()) {
         return false;
      } else {
         etp $$5 = this.b_($$0);
         if (!($$4.b() instanceof djr)) {
            this.c(2001, $$0, dke.j($$4));
         }

         if ($$1) {
            dup $$6 = $$4.x() ? this.c_($$0) : null;
            dke.a($$4, this, $$0, $$6, $$2, cxk.k);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(ecj.f, $$0, ecj.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(jh $$0, dxn $$1) {
   }

   public boolean b(jh $$0, dxn $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(jh var1, dxn var2, dxn var3, int var4);

   public void b(jh $$0, dxn $$1, dxn $$2) {
   }

   public void a(jh $$0, dke $$1) {
   }

   public void a(jh $$0, dke $$1, @Nullable eux $$2) {
   }

   public void a(jh $$0, dke $$1, jm $$2, @Nullable eux $$3) {
   }

   public void b(jh $$0, dke $$1, @Nullable eux $$2) {
   }

   public void a(dxn $$0, jh $$1, dke $$2, @Nullable eux $$3, boolean $$4) {
   }

   @Override
   public void a(jm $$0, jh $$1, jh $$2, dxn $$3, int $$4, int $$5) {
      this.t.a($$0, $$3, $$1, $$2, $$4, $$5);
   }

   @Override
   public int a(edi.a $$0, int $$1, int $$2) {
      int $$4;
      if ($$1 >= -30000000 && $$2 >= -30000000 && $$1 < 30000000 && $$2 < 30000000) {
         if (this.b(kj.a($$1), kj.a($$2))) {
            $$4 = this.d(kj.a($$1), kj.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
         } else {
            $$4 = this.L_();
         }
      } else {
         $$4 = this.O() + 1;
      }

      return $$4;
   }

   @Override
   public ete C_() {
      return this.R().p();
   }

   @Override
   public dxn a_(jh $$0) {
      if (this.s($$0)) {
         return dkg.nw.m();
      } else {
         dzs $$1 = this.d(kj.a($$0.u()), kj.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public etp b_(jh $$0) {
      if (this.s($$0)) {
         return etq.a.g();
      } else {
         dzs $$1 = this.m($$0);
         return $$1.b_($$0);
      }
   }

   public boolean U() {
      return !this.G_().a() && this.e < 4;
   }

   public boolean V() {
      return !this.G_().a() && !this.U();
   }

   public void a(@Nullable bvf $$0, jh $$1, axe $$2, axg $$3, float $$4, float $$5) {
      this.a($$0 instanceof cps $$6 ? $$6 : null, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(@Nullable cps $$0, jh $$1, axe $$2, axg $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable cps var1, double var2, double var4, double var6, jq<axe> var8, axg var9, float var10, float var11, long var12);

   public void a(@Nullable cps $$0, double $$1, double $$2, double $$3, axe $$4, axg $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, ma.b.e($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable cps var1, bvf var2, jq<axe> var3, axg var4, float var5, float var6, long var7);

   public void a(@Nullable cps $$0, double $$1, double $$2, double $$3, axe $$4, axg $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 1.0F, 1.0F);
   }

   public void a(@Nullable cps $$0, double $$1, double $$2, double $$3, axe $$4, axg $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable cps $$0, double $$1, double $$2, double $$3, jq<axe> $$4, axg $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable cps $$0, bvf $$1, axe $$2, axg $$3, float $$4, float $$5) {
      this.a($$0, $$1, ma.b.e($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(jh $$0, axe $$1, axg $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(bvf $$0, axe $$1, axg $$2, float $$3, float $$4) {
   }

   public void a(double $$0, double $$1, double $$2, axe $$3, axg $$4, float $$5, float $$6, boolean $$7) {
   }

   @Override
   public void a(lq $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(lq $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public void b(lq $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void b(lq $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public float a(float $$0) {
      float $$1 = this.f($$0);
      return $$1 * (float) (Math.PI * 2);
   }

   public void a(dwk $$0) {
      (this.b ? this.a : this.s).add($$0);
   }

   protected void W() {
      bpo $$0 = bpn.a();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.s.addAll(this.a);
         this.a.clear();
      }

      Iterator<dwk> $$1 = this.s.iterator();
      boolean $$2 = this.t().i();

      while ($$1.hasNext()) {
         dwk $$3 = $$1.next();
         if ($$3.b()) {
            $$1.remove();
         } else if ($$2 && this.n($$3.c())) {
            $$3.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends bvf> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Ticking entity");
         p $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new z($$3);
      }
   }

   public boolean h(bvf $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean n(jh $$0) {
      return this.a(dgg.a($$0));
   }

   public void a(@Nullable bvf $$0, double $$1, double $$2, double $$3, float $$4, dha.a $$5) {
      this.a($$0, dgs.a(this, $$0), null, $$1, $$2, $$3, $$4, false, $$5, ls.w, ls.v, axf.kx);
   }

   public void a(@Nullable bvf $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, dha.a $$6) {
      this.a($$0, dgs.a(this, $$0), null, $$1, $$2, $$3, $$4, $$5, $$6, ls.w, ls.v, axf.kx);
   }

   public void a(@Nullable bvf $$0, @Nullable btv $$1, @Nullable dgt $$2, fbs $$3, float $$4, boolean $$5, dha.a $$6) {
      this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6, ls.w, ls.v, axf.kx);
   }

   public void a(@Nullable bvf $$0, @Nullable btv $$1, @Nullable dgt $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, dha.a $$8) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, ls.w, ls.v, axf.kx);
   }

   public abstract void a(
      @Nullable bvf var1,
      @Nullable btv var2,
      @Nullable dgt var3,
      double var4,
      double var6,
      double var8,
      float var10,
      boolean var11,
      dha.a var12,
      lq var13,
      lq var14,
      jq<axe> var15
   );

   public abstract String I();

   @Nullable
   @Override
   public dup c_(jh $$0) {
      if (this.s($$0)) {
         return null;
      } else {
         return !this.C && Thread.currentThread() != this.c ? null : this.m($$0).a($$0, dzs.b.a);
      }
   }

   public void a(dup $$0) {
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
      return this.s($$0) ? false : this.R().b(kj.a($$0.u()), kj.a($$0.w()));
   }

   public boolean a(jh $$0, bvf $$1, jm $$2) {
      if (this.s($$0)) {
         return false;
      } else {
         dzi $$3 = this.a(kj.a($$0.u()), kj.a($$0.w()), eaj.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(jh $$0, bvf $$1) {
      return this.a($$0, $$1, jm.b);
   }

   public void X() {
      double $$0 = 1.0 - (double)(this.d(1.0F) * 5.0F) / 16.0;
      double $$1 = 1.0 - (double)(this.b(1.0F) * 5.0F) / 16.0;
      double $$2 = 0.5 + 2.0 * bae.a((double)bae.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void a(boolean $$0) {
      this.R().b($$0);
   }

   public jh Y() {
      jh $$0 = this.B.a();
      if (!this.F_().a($$0)) {
         $$0 = this.a(edi.a.e, jh.a(this.F_().a(), 0.0, this.F_().b()));
      }

      return $$0;
   }

   public float Z() {
      return this.B.b();
   }

   protected void aa() {
      if (this.B.i()) {
         this.x = 1.0F;
         if (this.B.g()) {
            this.z = 1.0F;
         }
      }
   }

   @Override
   public void close() throws IOException {
      this.R().close();
   }

   @Nullable
   @Override
   public dgf c(int $$0, int $$1) {
      return this.a($$0, $$1, eaj.n, false);
   }

   @Override
   public List<bvf> a(@Nullable bvf $$0, fbn $$1, Predicate<? super bvf> $$2) {
      bpn.a().f("getEntities");
      List<bvf> $$3 = Lists.newArrayList();
      this.G().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }

         if ($$3x instanceof ckp) {
            for (ckm $$4 : ((ckp)$$3x).x()) {
               if ($$3x != $$0 && $$2.test($$4)) {
                  $$3.add($$4);
               }
            }
         }
      });
      return $$3;
   }

   @Override
   public <T extends bvf> List<T> a(ebx<bvf, T> $$0, fbn $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends bvf> void a(ebx<bvf, T> $$0, fbn $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends bvf> void a(ebx<bvf, T> $$0, fbn $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      bpn.a().f("getEntities");
      this.G().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return ayq.a.b;
            }
         }

         if ($$4x instanceof ckp $$5) {
            for (ckm $$6 : $$5.x()) {
               T $$7 = $$0.a($$6);
               if ($$7 != null && $$2.test($$7)) {
                  $$3.add($$7);
                  if ($$3.size() >= $$4) {
                     return ayq.a.b;
                  }
               }
            }
         }

         return ayq.a.a;
      });
   }

   @Nullable
   public abstract bvf a(int var1);

   public void q(jh $$0) {
      if (this.B($$0)) {
         this.m($$0).a(true);
      }
   }

   public void ab() {
   }

   public long ac() {
      return this.B.c();
   }

   public long ad() {
      return this.B.d();
   }

   public boolean a(cps $$0, jh $$1) {
      return true;
   }

   public void a(bvf $$0, byte $$1) {
   }

   public void a(bvf $$0, btv $$1) {
   }

   public void a(jh $$0, dke $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public evr D_() {
      return this.B;
   }

   public abstract btn t();

   public float b(float $$0) {
      return bae.h($$0, this.y, this.z) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = bae.a($$0, 0.0F, 1.0F);
      this.y = $$1;
      this.z = $$1;
   }

   public float d(float $$0) {
      return bae.h($$0, this.w, this.x);
   }

   public void e(float $$0) {
      float $$1 = bae.a($$0, 0.0F, 1.0F);
      this.w = $$1;
      this.x = $$1;
   }

   private boolean a() {
      return this.G_().g() && !this.G_().h();
   }

   public boolean ae() {
      return this.a() && (double)this.b(1.0F) > 0.9;
   }

   public boolean af() {
      return this.a() && (double)this.d(1.0F) > 0.2;
   }

   public boolean r(jh $$0) {
      if (!this.af()) {
         return false;
      } else if (!this.h($$0)) {
         return false;
      } else if (this.a(edi.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         dic $$1 = this.t($$0).a();
         return $$1.a($$0, this.O()) == dic.c.b;
      }
   }

   @Nullable
   public abstract evj a(evh var1);

   public abstract void a(evh var1, evj var2);

   public abstract evh w();

   public void b(int $$0, jh $$1, int $$2) {
   }

   public p a(o $$0) {
      p $$1 = $$0.a("Affected level", 1);
      $$1.a("All players", () -> this.y().size() + " total; " + this.y());
      $$1.a("Chunk stats", this.R()::e);
      $$1.a("Level dimension", () -> this.ah().a().toString());

      try {
         this.B.a($$1, this);
      } catch (Throwable var4) {
         $$1.a("Level Data Unobtainable", var4);
      }

      return $$1;
   }

   public abstract void a(int var1, jh var2, int var3);

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<czz> $$6) {
   }

   public abstract fcx Q();

   public void c(jh $$0, dke $$1) {
      for (jm $$2 : jm.c.a) {
         jh $$3 = $$0.a($$2);
         if (this.B($$3)) {
            dxn $$4 = this.a_($$3);
            if ($$4.a(dkg.ho)) {
               this.a($$4, $$3, $$1, null, false);
            } else if ($$4.d(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(dkg.ho)) {
                  this.a($$4, $$3, $$1, null, false);
               }
            }
         }
      }
   }

   @Override
   public btc d_(jh $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.B($$0)) {
         $$2 = this.aq();
         $$1 = this.m($$0).t();
      }

      return new btc(this.al(), this.ad(), $$1, $$2);
   }

   @Override
   public int E_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public dzd F_() {
      return this.F;
   }

   public void a(aac<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public ebi G_() {
      return this.E.a();
   }

   public jq<ebi> ag() {
      return this.E;
   }

   public aly<dha> ah() {
      return this.H;
   }

   @Override
   public bam H_() {
      return this.A;
   }

   @Override
   public boolean a(jh $$0, Predicate<dxn> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(jh $$0, Predicate<etp> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract dca P();

   public jh a(int $$0, int $$1, int $$2, int $$3) {
      this.u = this.u * 3 + 1013904223;
      int $$4 = this.u >> 2;
      return new jh($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean u() {
      return false;
   }

   @Override
   public die I_() {
      return this.G;
   }

   public final boolean ai() {
      return this.d;
   }

   protected abstract ebz<bvf> G();

   @Override
   public long J_() {
      return this.K++;
   }

   @Override
   public ke K_() {
      return this.I;
   }

   public btw aj() {
      return this.J;
   }

   public abstract czi K();

   public abstract dvn L();

   public static enum a implements bba {
      a("none"),
      b("block"),
      c("mob"),
      d("tnt"),
      e("trigger");

      public static final Codec<dha.a> f = bba.a(dha.a::values);
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
