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

public abstract class dgj implements dgk, AutoCloseable {
   public static final Codec<aku<dgj>> h = aku.a(mc.be);
   public static final aku<dgj> i = aku.a(mc.be, akv.b("overworld"));
   public static final aku<dgj> j = aku.a(mc.be, akv.b("the_nether"));
   public static final aku<dgj> k = aku.a(mc.be, akv.b("the_end"));
   public static final int l = 30000000;
   public static final int m = 512;
   public static final int n = 32;
   public static final int o = 15;
   public static final int p = 24000;
   public static final int q = 20000000;
   public static final int r = -20000000;
   protected final List<dvv> s = Lists.newArrayList();
   protected final euh t;
   private final List<dvv> a = Lists.newArrayList();
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
   private final jr<eat> E;
   protected final evn B;
   public final boolean C;
   private final dyo F;
   private final dhn G;
   private final aku<dgj> H;
   private final kf I;
   private final btd J;
   private long K;

   protected dgj(evn $$0, aku<dgj> $$1, kf $$2, jr<eat> $$3, boolean $$4, boolean $$5, long $$6, int $$7) {
      this.B = $$0;
      this.E = $$3;
      final eat $$8 = $$3.a();
      this.H = $$1;
      this.C = $$4;
      if ($$8.k() != 1.0) {
         this.F = new dyo() {
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
         this.F = new dyo();
      }

      this.c = Thread.currentThread();
      this.G = new dhn(this, $$6);
      this.d = $$5;
      this.t = new euc(this, $$7);
      this.I = $$2;
      this.J = new btd($$2);
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

   public dzd m(ji $$0) {
      return this.d(kk.a($$0.u()), kk.a($$0.w()));
   }

   public dzd d(int $$0, int $$1) {
      return (dzd)this.a($$0, $$1, dzu.n);
   }

   @Nullable
   @Override
   public dyt a(int $$0, int $$1, dzu $$2, boolean $$3) {
      dyt $$4 = this.S().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(ji $$0, dwy $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(ji $$0, dwy $$1, int $$2, int $$3) {
      if (this.s($$0)) {
         return false;
      } else if (!this.C && this.aj()) {
         return false;
      } else {
         dzd $$4 = this.m($$0);
         djn $$5 = $$1.b();
         dwy $$6 = $$4.a($$0, $$1, ($$2 & 64) != 0);
         if ($$6 == null) {
            return false;
         } else {
            dwy $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.C || ($$2 & 4) == 0) && (this.C || $$4.F() != null && $$4.F().a(aqs.c))) {
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
                  $$1.a((dgk)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(ji $$0, dwy $$1, dwy $$2) {
   }

   @Override
   public boolean a(ji $$0, boolean $$1) {
      eta $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(ji $$0, boolean $$1, @Nullable bum $$2, int $$3) {
      dwy $$4 = this.a_($$0);
      if ($$4.l()) {
         return false;
      } else {
         eta $$5 = this.b_($$0);
         if (!($$4.b() instanceof dja)) {
            this.c(2001, $$0, djn.j($$4));
         }

         if ($$1) {
            dua $$6 = $$4.x() ? this.c_($$0) : null;
            djn.a($$4, this, $$0, $$6, $$2, cwq.j);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(ebu.f, $$0, ebu.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(ji $$0, dwy $$1) {
   }

   public boolean b(ji $$0, dwy $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(ji var1, dwy var2, dwy var3, int var4);

   public void b(ji $$0, dwy $$1, dwy $$2) {
   }

   public void a(ji $$0, djn $$1) {
   }

   public void a(ji $$0, djn $$1, @Nullable eui $$2) {
   }

   public void a(ji $$0, djn $$1, jn $$2, @Nullable eui $$3) {
   }

   public void b(ji $$0, djn $$1, @Nullable eui $$2) {
   }

   public void a(dwy $$0, ji $$1, djn $$2, @Nullable eui $$3, boolean $$4) {
   }

   @Override
   public void a(jn $$0, ji $$1, ji $$2, dwy $$3, int $$4, int $$5) {
      this.t.a($$0, $$3, $$1, $$2, $$4, $$5);
   }

   @Override
   public int a(ect.a $$0, int $$1, int $$2) {
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
   public esp C_() {
      return this.S().p();
   }

   @Override
   public dwy a_(ji $$0) {
      if (this.s($$0)) {
         return djp.nD.m();
      } else {
         dzd $$1 = this.d(kk.a($$0.u()), kk.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public eta b_(ji $$0) {
      if (this.s($$0)) {
         return etb.a.g();
      } else {
         dzd $$1 = this.m($$0);
         return $$1.b_($$0);
      }
   }

   public boolean V() {
      return !this.G_().a() && this.e < 4;
   }

   public boolean W() {
      return !this.G_().a() && !this.V();
   }

   public void a(@Nullable bum $$0, ji $$1, avz $$2, awb $$3, float $$4, float $$5) {
      this.a($$0 instanceof coy $$6 ? $$6 : null, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(@Nullable coy $$0, ji $$1, avz $$2, awb $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable coy var1, double var2, double var4, double var6, jr<avz> var8, awb var9, float var10, float var11, long var12);

   public void a(@Nullable coy $$0, double $$1, double $$2, double $$3, avz $$4, awb $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, mb.b.e($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable coy var1, bum var2, jr<avz> var3, awb var4, float var5, float var6, long var7);

   public void a(@Nullable coy $$0, double $$1, double $$2, double $$3, avz $$4, awb $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 1.0F, 1.0F);
   }

   public void a(@Nullable coy $$0, double $$1, double $$2, double $$3, avz $$4, awb $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable coy $$0, double $$1, double $$2, double $$3, jr<avz> $$4, awb $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable coy $$0, bum $$1, avz $$2, awb $$3, float $$4, float $$5) {
      this.a($$0, $$1, mb.b.e($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(ji $$0, avz $$1, awb $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(bum $$0, avz $$1, awb $$2, float $$3, float $$4) {
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

   public void a(dvv $$0) {
      (this.b ? this.a : this.s).add($$0);
   }

   protected void X() {
      bou $$0 = bot.a();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.s.addAll(this.a);
         this.a.clear();
      }

      Iterator<dvv> $$1 = this.s.iterator();
      boolean $$2 = this.u().i();

      while ($$1.hasNext()) {
         dvv $$3 = $$1.next();
         if ($$3.b()) {
            $$1.remove();
         } else if ($$2 && this.n($$3.c())) {
            $$3.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends bum> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Ticking entity");
         p $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new z($$3);
      }
   }

   public boolean h(bum $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean n(ji $$0) {
      return this.a(dfp.a($$0));
   }

   public void a(@Nullable bum $$0, double $$1, double $$2, double $$3, float $$4, dgj.a $$5) {
      this.a($$0, dgb.a(this, $$0), null, $$1, $$2, $$3, $$4, false, $$5, lt.w, lt.v, awa.kE);
   }

   public void a(@Nullable bum $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, dgj.a $$6) {
      this.a($$0, dgb.a(this, $$0), null, $$1, $$2, $$3, $$4, $$5, $$6, lt.w, lt.v, awa.kE);
   }

   public void a(@Nullable bum $$0, @Nullable btc $$1, @Nullable dgc $$2, fbb $$3, float $$4, boolean $$5, dgj.a $$6) {
      this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6, lt.w, lt.v, awa.kE);
   }

   public void a(@Nullable bum $$0, @Nullable btc $$1, @Nullable dgc $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, dgj.a $$8) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, lt.w, lt.v, awa.kE);
   }

   public abstract void a(
      @Nullable bum var1,
      @Nullable btc var2,
      @Nullable dgc var3,
      double var4,
      double var6,
      double var8,
      float var10,
      boolean var11,
      dgj.a var12,
      lr var13,
      lr var14,
      jr<avz> var15
   );

   public abstract String J();

   @Nullable
   @Override
   public dua c_(ji $$0) {
      if (this.s($$0)) {
         return null;
      } else {
         return !this.C && Thread.currentThread() != this.c ? null : this.m($$0).a($$0, dzd.b.a);
      }
   }

   public void a(dua $$0) {
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

   public boolean a(ji $$0, bum $$1, jn $$2) {
      if (this.s($$0)) {
         return false;
      } else {
         dyt $$3 = this.a(kk.a($$0.u()), kk.a($$0.w()), dzu.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(ji $$0, bum $$1) {
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
         $$0 = this.a(ect.a.e, ji.a(this.F_().a(), 0.0, this.F_().b()));
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
   public dfo c(int $$0, int $$1) {
      return this.a($$0, $$1, dzu.n, false);
   }

   @Override
   public List<bum> a(@Nullable bum $$0, faw $$1, Predicate<? super bum> $$2) {
      bot.a().f("getEntities");
      List<bum> $$3 = Lists.newArrayList();
      this.H().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }
      });

      for (cjt $$4 : this.s()) {
         if ($$4 != $$0 && $$4.a != $$0 && $$2.test($$4) && $$1.c($$4.cR())) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   @Override
   public <T extends bum> List<T> a(ebi<bum, T> $$0, faw $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends bum> void a(ebi<bum, T> $$0, faw $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends bum> void a(ebi<bum, T> $$0, faw $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      bot.a().f("getEntities");
      this.H().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return axl.a.b;
            }
         }

         if ($$4x instanceof cjw $$5) {
            for (cjt $$6 : $$5.x()) {
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
   public abstract bum a(int var1);

   public abstract Collection<cjt> s();

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

   public boolean a(coy $$0, ji $$1) {
      return true;
   }

   public void a(bum $$0, byte $$1) {
   }

   public void a(bum $$0, btc $$1) {
   }

   public void a(ji $$0, djn $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public evc D_() {
      return this.B;
   }

   public abstract bsu u();

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
      } else if (this.a(ect.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         dhl $$1 = this.t($$0).a();
         return $$1.a($$0, this.P()) == dhl.c.b;
      }
   }

   @Nullable
   public abstract euu a(eus var1);

   public abstract void a(eus var1, euu var2);

   public abstract eus x();

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

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<czf> $$6) {
   }

   public abstract fcg R();

   public void c(ji $$0, djn $$1) {
      for (jn $$2 : jn.c.a) {
         ji $$3 = $$0.a($$2);
         if (this.B($$3)) {
            dwy $$4 = this.a_($$3);
            if ($$4.a(djp.hv)) {
               this.a($$4, $$3, $$1, null, false);
            } else if ($$4.d(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(djp.hv)) {
                  this.a($$4, $$3, $$1, null, false);
               }
            }
         }
      }
   }

   @Override
   public bsj d_(ji $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.B($$0)) {
         $$2 = this.ar();
         $$1 = this.m($$0).w();
      }

      return new bsj(this.am(), this.ae(), $$1, $$2);
   }

   @Override
   public int E_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public dyo F_() {
      return this.F;
   }

   public void a(yw<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public eat G_() {
      return this.E.a();
   }

   public jr<eat> ah() {
      return this.E;
   }

   public aku<dgj> ai() {
      return this.H;
   }

   @Override
   public azh H_() {
      return this.A;
   }

   @Override
   public boolean a(ji $$0, Predicate<dwy> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(ji $$0, Predicate<eta> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract dbg Q();

   public ji a(int $$0, int $$1, int $$2, int $$3) {
      this.u = this.u * 3 + 1013904223;
      int $$4 = this.u >> 2;
      return new ji($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean v() {
      return false;
   }

   @Override
   public dhn I_() {
      return this.G;
   }

   public final boolean aj() {
      return this.d;
   }

   protected abstract ebk<bum> H();

   @Override
   public long J_() {
      return this.K++;
   }

   @Override
   public kf K_() {
      return this.I;
   }

   public btd ak() {
      return this.J;
   }

   public abstract cyo L();

   public abstract duy M();

   public static enum a implements azv {
      a("none"),
      b("block"),
      c("mob"),
      d("tnt"),
      e("trigger");

      public static final Codec<dgj.a> f = azv.a(dgj.a::values);
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
