import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public abstract class dfm implements dfn, AutoCloseable {
   public static final Codec<ali<dfm>> h = ali.a(ma.bb);
   public static final ali<dfm> i = ali.a(ma.bb, alj.b("overworld"));
   public static final ali<dfm> j = ali.a(ma.bb, alj.b("the_nether"));
   public static final ali<dfm> k = ali.a(ma.bb, alj.b("the_end"));
   public static final int l = 30000000;
   public static final int m = 512;
   public static final int n = 32;
   public static final int o = 15;
   public static final int p = 24000;
   public static final int q = 20000000;
   public static final int r = -20000000;
   protected final List<dus> s = Lists.newArrayList();
   protected final etc t;
   private final List<dus> a = Lists.newArrayList();
   private boolean b;
   private final Thread c;
   private final boolean d;
   private int e;
   protected int u = azu.a().f();
   protected final int v = 1013904223;
   protected float w;
   protected float x;
   protected float y;
   protected float z;
   public final azu A = azu.a();
   @Deprecated
   private final azu f = azu.b();
   private final jq<dzq> E;
   protected final eui B;
   public final boolean C;
   private final dxl F;
   private final dgq G;
   private final ali<dfm> H;
   private final ke I;
   private final btc J;
   private long K;

   protected dfm(eui $$0, ali<dfm> $$1, ke $$2, jq<dzq> $$3, boolean $$4, boolean $$5, long $$6, int $$7) {
      this.B = $$0;
      this.E = $$3;
      final dzq $$8 = $$3.a();
      this.H = $$1;
      this.C = $$4;
      if ($$8.k() != 1.0) {
         this.F = new dxl() {
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
         this.F = new dxl();
      }

      this.c = Thread.currentThread();
      this.G = new dgq(this, $$6);
      this.d = $$5;
      this.t = new esx(this, $$7);
      this.I = $$2;
      this.J = new btc($$2);
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

   public dya m(jh $$0) {
      return this.d(kj.a($$0.u()), kj.a($$0.w()));
   }

   public dya d(int $$0, int $$1) {
      return (dya)this.a($$0, $$1, dyr.n);
   }

   @Nullable
   @Override
   public dxq a(int $$0, int $$1, dyr $$2, boolean $$3) {
      dxq $$4 = this.Q().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(jh $$0, dvv $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(jh $$0, dvv $$1, int $$2, int $$3) {
      if (this.s($$0)) {
         return false;
      } else if (!this.C && this.ah()) {
         return false;
      } else {
         dya $$4 = this.m($$0);
         diq $$5 = $$1.b();
         dvv $$6 = $$4.a($$0, $$1, ($$2 & 64) != 0);
         if ($$6 == null) {
            return false;
         } else {
            dvv $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.C || ($$2 & 4) == 0) && (this.C || $$4.C() != null && $$4.C().a(are.c))) {
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
                  $$1.a((dfn)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(jh $$0, dvv $$1, dvv $$2) {
   }

   @Override
   public boolean a(jh $$0, boolean $$1) {
      erv $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(jh $$0, boolean $$1, @Nullable bul $$2, int $$3) {
      dvv $$4 = this.a_($$0);
      if ($$4.l()) {
         return false;
      } else {
         erv $$5 = this.b_($$0);
         if (!($$4.b() instanceof did)) {
            this.c(2001, $$0, diq.j($$4));
         }

         if ($$1) {
            dsy $$6 = $$4.x() ? this.c_($$0) : null;
            diq.a($$4, this, $$0, $$6, $$2, cwm.k);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(ear.f, $$0, ear.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(jh $$0, dvv $$1) {
   }

   public boolean b(jh $$0, dvv $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(jh var1, dvv var2, dvv var3, int var4);

   public void b(jh $$0, dvv $$1, dvv $$2) {
   }

   public void a(jh $$0, diq $$1) {
   }

   public void a(jh $$0, diq $$1, @Nullable etd $$2) {
   }

   public void a(jh $$0, diq $$1, jm $$2, @Nullable etd $$3) {
   }

   public void b(jh $$0, diq $$1, @Nullable etd $$2) {
   }

   public void a(dvv $$0, jh $$1, diq $$2, @Nullable etd $$3, boolean $$4) {
   }

   @Override
   public void a(jm $$0, jh $$1, jh $$2, dvv $$3, int $$4, int $$5) {
      this.t.a($$0, $$3, $$1, $$2, $$4, $$5);
   }

   @Override
   public int a(ebq.a $$0, int $$1, int $$2) {
      int $$4;
      if ($$1 >= -30000000 && $$2 >= -30000000 && $$1 < 30000000 && $$2 < 30000000) {
         if (this.b(kj.a($$1), kj.a($$2))) {
            $$4 = this.d(kj.a($$1), kj.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
         } else {
            $$4 = this.K_();
         }
      } else {
         $$4 = this.O() + 1;
      }

      return $$4;
   }

   @Override
   public erk B_() {
      return this.Q().p();
   }

   @Override
   public dvv a_(jh $$0) {
      if (this.s($$0)) {
         return dis.nb.m();
      } else {
         dya $$1 = this.d(kj.a($$0.u()), kj.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public erv b_(jh $$0) {
      if (this.s($$0)) {
         return erw.a.g();
      } else {
         dya $$1 = this.m($$0);
         return $$1.b_($$0);
      }
   }

   public boolean T() {
      return !this.F_().a() && this.e < 4;
   }

   public boolean U() {
      return !this.F_().a() && !this.T();
   }

   public void a(@Nullable bul $$0, jh $$1, awm $$2, awo $$3, float $$4, float $$5) {
      this.a($$0 instanceof cou $$6 ? $$6 : null, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(@Nullable cou $$0, jh $$1, awm $$2, awo $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable cou var1, double var2, double var4, double var6, jq<awm> var8, awo var9, float var10, float var11, long var12);

   public void a(@Nullable cou $$0, double $$1, double $$2, double $$3, awm $$4, awo $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, lz.b.e($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable cou var1, bul var2, jq<awm> var3, awo var4, float var5, float var6, long var7);

   public void a(@Nullable cou $$0, double $$1, double $$2, double $$3, awm $$4, awo $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 1.0F, 1.0F);
   }

   public void a(@Nullable cou $$0, double $$1, double $$2, double $$3, awm $$4, awo $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable cou $$0, double $$1, double $$2, double $$3, jq<awm> $$4, awo $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable cou $$0, bul $$1, awm $$2, awo $$3, float $$4, float $$5) {
      this.a($$0, $$1, lz.b.e($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(jh $$0, awm $$1, awo $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(bul $$0, awm $$1, awo $$2, float $$3, float $$4) {
   }

   public void a(double $$0, double $$1, double $$2, awm $$3, awo $$4, float $$5, float $$6, boolean $$7) {
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

   public void a(dus $$0) {
      (this.b ? this.a : this.s).add($$0);
   }

   protected void V() {
      bou $$0 = bot.a();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.s.addAll(this.a);
         this.a.clear();
      }

      Iterator<dus> $$1 = this.s.iterator();
      boolean $$2 = this.t().i();

      while ($$1.hasNext()) {
         dus $$3 = $$1.next();
         if ($$3.b()) {
            $$1.remove();
         } else if ($$2 && this.n($$3.c())) {
            $$3.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends bul> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Ticking entity");
         p $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new z($$3);
      }
   }

   public boolean h(bul $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean n(jh $$0) {
      return this.a(des.a($$0));
   }

   public void a(@Nullable bul $$0, double $$1, double $$2, double $$3, float $$4, dfm.a $$5) {
      this.a($$0, dfe.a(this, $$0), null, $$1, $$2, $$3, $$4, false, $$5, ls.w, ls.v, awn.kf);
   }

   public void a(@Nullable bul $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, dfm.a $$6) {
      this.a($$0, dfe.a(this, $$0), null, $$1, $$2, $$3, $$4, $$5, $$6, ls.w, ls.v, awn.kf);
   }

   public void a(@Nullable bul $$0, @Nullable btb $$1, @Nullable dff $$2, ezy $$3, float $$4, boolean $$5, dfm.a $$6) {
      this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6, ls.w, ls.v, awn.kf);
   }

   public void a(@Nullable bul $$0, @Nullable btb $$1, @Nullable dff $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, dfm.a $$8) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, ls.w, ls.v, awn.kf);
   }

   public abstract void a(
      @Nullable bul var1,
      @Nullable btb var2,
      @Nullable dff var3,
      double var4,
      double var6,
      double var8,
      float var10,
      boolean var11,
      dfm.a var12,
      lq var13,
      lq var14,
      jq<awm> var15
   );

   public abstract String I();

   @Nullable
   @Override
   public dsy c_(jh $$0) {
      if (this.s($$0)) {
         return null;
      } else {
         return !this.C && Thread.currentThread() != this.c ? null : this.m($$0).a($$0, dya.b.a);
      }
   }

   public void a(dsy $$0) {
      jh $$1 = $$0.aA_();
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
      return this.s($$0) ? false : this.Q().b(kj.a($$0.u()), kj.a($$0.w()));
   }

   public boolean a(jh $$0, bul $$1, jm $$2) {
      if (this.s($$0)) {
         return false;
      } else {
         dxq $$3 = this.a(kj.a($$0.u()), kj.a($$0.w()), dyr.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(jh $$0, bul $$1) {
      return this.a($$0, $$1, jm.b);
   }

   public void W() {
      double $$0 = 1.0 - (double)(this.d(1.0F) * 5.0F) / 16.0;
      double $$1 = 1.0 - (double)(this.b(1.0F) * 5.0F) / 16.0;
      double $$2 = 0.5 + 2.0 * azm.a((double)azm.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void a(boolean $$0) {
      this.Q().b($$0);
   }

   public jh X() {
      jh $$0 = this.B.a();
      if (!this.E_().a($$0)) {
         $$0 = this.a(ebq.a.e, jh.a(this.E_().a(), 0.0, this.E_().b()));
      }

      return $$0;
   }

   public float Y() {
      return this.B.b();
   }

   protected void Z() {
      if (this.B.i()) {
         this.x = 1.0F;
         if (this.B.g()) {
            this.z = 1.0F;
         }
      }
   }

   @Override
   public void close() throws IOException {
      this.Q().close();
   }

   @Nullable
   @Override
   public der c(int $$0, int $$1) {
      return this.a($$0, $$1, dyr.n, false);
   }

   @Override
   public List<bul> a(@Nullable bul $$0, ezt $$1, Predicate<? super bul> $$2) {
      bot.a().f("getEntities");
      List<bul> $$3 = Lists.newArrayList();
      this.G().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }

         if ($$3x instanceof cjv) {
            for (cjs $$4 : ((cjv)$$3x).gi()) {
               if ($$3x != $$0 && $$2.test($$4)) {
                  $$3.add($$4);
               }
            }
         }
      });
      return $$3;
   }

   @Override
   public <T extends bul> List<T> a(eaf<bul, T> $$0, ezt $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends bul> void a(eaf<bul, T> $$0, ezt $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends bul> void a(eaf<bul, T> $$0, ezt $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      bot.a().f("getEntities");
      this.G().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return axy.a.b;
            }
         }

         if ($$4x instanceof cjv $$5) {
            for (cjs $$6 : $$5.gi()) {
               T $$7 = $$0.a($$6);
               if ($$7 != null && $$2.test($$7)) {
                  $$3.add($$7);
                  if ($$3.size() >= $$4) {
                     return axy.a.b;
                  }
               }
            }
         }

         return axy.a.a;
      });
   }

   @Nullable
   public abstract bul a(int var1);

   public void q(jh $$0) {
      if (this.B($$0)) {
         this.m($$0).a(true);
      }
   }

   public void aa() {
   }

   public long ab() {
      return this.B.c();
   }

   public long ac() {
      return this.B.d();
   }

   public boolean a(cou $$0, jh $$1) {
      return true;
   }

   public void a(bul $$0, byte $$1) {
   }

   public void a(bul $$0, btb $$1) {
   }

   public void a(jh $$0, diq $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public etx C_() {
      return this.B;
   }

   public abstract bst t();

   public float b(float $$0) {
      return azm.h($$0, this.y, this.z) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = azm.a($$0, 0.0F, 1.0F);
      this.y = $$1;
      this.z = $$1;
   }

   public float d(float $$0) {
      return azm.h($$0, this.w, this.x);
   }

   public void e(float $$0) {
      float $$1 = azm.a($$0, 0.0F, 1.0F);
      this.w = $$1;
      this.x = $$1;
   }

   private boolean a() {
      return this.F_().g() && !this.F_().h();
   }

   public boolean ad() {
      return this.a() && (double)this.b(1.0F) > 0.9;
   }

   public boolean ae() {
      return this.a() && (double)this.d(1.0F) > 0.2;
   }

   public boolean r(jh $$0) {
      if (!this.ae()) {
         return false;
      } else if (!this.h($$0)) {
         return false;
      } else if (this.a(ebq.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         dgo $$1 = this.t($$0).a();
         return $$1.a($$0, this.O()) == dgo.c.b;
      }
   }

   @Nullable
   public abstract etp a(etn var1);

   public abstract void a(etn var1, etp var2);

   public abstract etn w();

   public void b(int $$0, jh $$1, int $$2) {
   }

   public p a(o $$0) {
      p $$1 = $$0.a("Affected level", 1);
      $$1.a("All players", () -> this.y().size() + " total; " + this.y());
      $$1.a("Chunk stats", this.Q()::e);
      $$1.a("Level dimension", () -> this.ag().a().toString());

      try {
         this.B.a($$1, this);
      } catch (Throwable var4) {
         $$1.a("Level Data Unobtainable", var4);
      }

      return $$1;
   }

   public abstract void a(int var1, jh var2, int var3);

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<czb> $$6) {
   }

   public abstract fbd P();

   public void c(jh $$0, diq $$1) {
      for (jm $$2 : jm.c.a) {
         jh $$3 = $$0.a($$2);
         if (this.B($$3)) {
            dvv $$4 = this.a_($$3);
            if ($$4.a(dis.gY)) {
               this.a($$4, $$3, $$1, null, false);
            } else if ($$4.d(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(dis.gY)) {
                  this.a($$4, $$3, $$1, null, false);
               }
            }
         }
      }
   }

   @Override
   public bsi d_(jh $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.B($$0)) {
         $$2 = this.ap();
         $$1 = this.m($$0).t();
      }

      return new bsi(this.ak(), this.ac(), $$1, $$2);
   }

   @Override
   public int D_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public dxl E_() {
      return this.F;
   }

   public void a(zq<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public dzq F_() {
      return this.E.a();
   }

   public jq<dzq> af() {
      return this.E;
   }

   public ali<dfm> ag() {
      return this.H;
   }

   @Override
   public azu G_() {
      return this.A;
   }

   @Override
   public boolean a(jh $$0, Predicate<dvv> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(jh $$0, Predicate<erv> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract dbe s();

   public jh a(int $$0, int $$1, int $$2, int $$3) {
      this.u = this.u * 3 + 1013904223;
      int $$4 = this.u >> 2;
      return new jh($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean u() {
      return false;
   }

   @Override
   public dgq H_() {
      return this.G;
   }

   public final boolean ah() {
      return this.d;
   }

   protected abstract eah<bul> G();

   @Override
   public long I_() {
      return this.K++;
   }

   @Override
   public ke J_() {
      return this.I;
   }

   public btc ai() {
      return this.J;
   }

   public abstract cyk K();

   public abstract dtv L();

   public static enum a implements bai {
      a("none"),
      b("block"),
      c("mob"),
      d("tnt"),
      e("trigger");

      public static final Codec<dfm.a> f = bai.a(dfm.a::values);
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
