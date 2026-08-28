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

public abstract class dbz implements dca, AutoCloseable {
   public static final Codec<ale<dbz>> g = ale.a(lq.aS);
   public static final ale<dbz> h = ale.a(lq.aS, new alf("overworld"));
   public static final ale<dbz> i = ale.a(lq.aS, new alf("the_nether"));
   public static final ale<dbz> j = ale.a(lq.aS, new alf("the_end"));
   public static final int k = 30000000;
   public static final int l = 512;
   public static final int m = 32;
   public static final int n = 15;
   public static final int o = 24000;
   public static final int p = 20000000;
   public static final int q = -20000000;
   protected final List<dra> r = Lists.newArrayList();
   protected final epa s;
   private final List<dra> a = Lists.newArrayList();
   private boolean b;
   private final Thread c;
   private final boolean d;
   private int e;
   protected int t = azh.a().f();
   protected final int u = 1013904223;
   protected float v;
   protected float w;
   protected float x;
   protected float y;
   public final azh z = azh.a();
   @Deprecated
   private final azh f = azh.b();
   private final ji<dvv> D;
   protected final eqe A;
   private final Supplier<bnj> E;
   public final boolean B;
   private final dtu F;
   private final dda G;
   private final ale<dbz> H;
   private final jw I;
   private final brp J;
   private long K;

   protected dbz(eqe $$0, ale<dbz> $$1, jw $$2, ji<dvv> $$3, Supplier<bnj> $$4, boolean $$5, boolean $$6, long $$7, int $$8) {
      this.E = $$4;
      this.A = $$0;
      this.D = $$3;
      final dvv $$9 = $$3.a();
      this.H = $$1;
      this.B = $$5;
      if ($$9.k() != 1.0) {
         this.F = new dtu() {
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
         this.F = new dtu();
      }

      this.c = Thread.currentThread();
      this.G = new dda(this, $$7);
      this.d = $$6;
      this.s = new eoy(this, $$8);
      this.I = $$2;
      this.J = new brp($$2);
   }

   @Override
   public boolean x_() {
      return this.B;
   }

   @Nullable
   @Override
   public MinecraftServer o() {
      return null;
   }

   public boolean k(iz $$0) {
      return !this.s($$0) && g($$0);
   }

   public static boolean l(iz $$0) {
      return !b($$0.v()) && g($$0);
   }

   private static boolean g(iz $$0) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000;
   }

   private static boolean b(int $$0) {
      return $$0 < -20000000 || $$0 >= 20000000;
   }

   public duj m(iz $$0) {
      return this.d(kb.a($$0.u()), kb.a($$0.w()));
   }

   public duj d(int $$0, int $$1) {
      return (duj)this.a($$0, $$1, duy.n);
   }

   @Nullable
   @Override
   public dtz a(int $$0, int $$1, duy $$2, boolean $$3) {
      dtz $$4 = this.N().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(iz $$0, dsd $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(iz $$0, dsd $$1, int $$2, int $$3) {
      if (this.s($$0)) {
         return false;
      } else if (!this.B && this.ai()) {
         return false;
      } else {
         duj $$4 = this.m($$0);
         dfa $$5 = $$1.b();
         dsd $$6 = $$4.a($$0, $$1, ($$2 & 64) != 0);
         if ($$6 == null) {
            return false;
         } else {
            dsd $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.B || ($$2 & 4) == 0) && (this.B || $$4.D() != null && $$4.D().a(aqy.c))) {
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
                  $$1.a((dca)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(iz $$0, dsd $$1, dsd $$2) {
   }

   @Override
   public boolean a(iz $$0, boolean $$1) {
      enw $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(iz $$0, boolean $$1, @Nullable bsv $$2, int $$3) {
      dsd $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         enw $$5 = this.b_($$0);
         if (!($$4.b() instanceof den)) {
            this.c(2001, $$0, dfa.i($$4));
         }

         if ($$1) {
            dpi $$6 = $$4.t() ? this.c_($$0) : null;
            dfa.a($$4, this, $$0, $$6, $$2, cuq.l);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(dww.f, $$0, dww.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(iz $$0, dsd $$1) {
   }

   public boolean b(iz $$0, dsd $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(iz var1, dsd var2, dsd var3, int var4);

   public void b(iz $$0, dsd $$1, dsd $$2) {
   }

   public void a(iz $$0, dfa $$1) {
   }

   public void a(iz $$0, dfa $$1, je $$2) {
   }

   public void a(iz $$0, dfa $$1, iz $$2) {
   }

   public void a(dsd $$0, iz $$1, dfa $$2, iz $$3, boolean $$4) {
   }

   @Override
   public void a(je $$0, dsd $$1, iz $$2, iz $$3, int $$4, int $$5) {
      this.s.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int a(dxv.a $$0, int $$1, int $$2) {
      int $$4;
      if ($$1 >= -30000000 && $$2 >= -30000000 && $$1 < 30000000 && $$2 < 30000000) {
         if (this.b(kb.a($$1), kb.a($$2))) {
            $$4 = this.d(kb.a($$1), kb.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
         } else {
            $$4 = this.I_();
         }
      } else {
         $$4 = this.z_() + 1;
      }

      return $$4;
   }

   @Override
   public enl y_() {
      return this.N().p();
   }

   @Override
   public dsd a_(iz $$0) {
      if (this.s($$0)) {
         return dfc.nb.o();
      } else {
         duj $$1 = this.d(kb.a($$0.u()), kb.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public enw b_(iz $$0) {
      if (this.s($$0)) {
         return enx.a.g();
      } else {
         duj $$1 = this.m($$0);
         return $$1.b_($$0);
      }
   }

   public boolean R() {
      return !this.D_().a() && this.e < 4;
   }

   public boolean S() {
      return !this.D_().a() && !this.R();
   }

   public void a(@Nullable bsv $$0, iz $$1, avz $$2, awb $$3, float $$4, float $$5) {
      this.a($$0 instanceof cmy $$6 ? $$6 : null, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(@Nullable cmy $$0, iz $$1, avz $$2, awb $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable cmy var1, double var2, double var4, double var6, ji<avz> var8, awb var9, float var10, float var11, long var12);

   public void a(@Nullable cmy $$0, double $$1, double $$2, double $$3, avz $$4, awb $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, lp.b.e($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable cmy var1, bsv var2, ji<avz> var3, awb var4, float var5, float var6, long var7);

   public void a(@Nullable cmy $$0, double $$1, double $$2, double $$3, avz $$4, awb $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 1.0F, 1.0F);
   }

   public void a(@Nullable cmy $$0, double $$1, double $$2, double $$3, avz $$4, awb $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable cmy $$0, bsv $$1, avz $$2, awb $$3, float $$4, float $$5) {
      this.a($$0, $$1, lp.b.e($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(iz $$0, avz $$1, awb $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(bsv $$0, avz $$1, awb $$2, float $$3, float $$4) {
   }

   public void a(double $$0, double $$1, double $$2, avz $$3, awb $$4, float $$5, float $$6, boolean $$7) {
   }

   @Override
   public void a(lg $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(lg $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public void b(lg $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void b(lg $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public float a(float $$0) {
      float $$1 = this.f($$0);
      return $$1 * (float) (Math.PI * 2);
   }

   public void a(dra $$0) {
      (this.b ? this.a : this.r).add($$0);
   }

   protected void T() {
      bnj $$0 = this.ag();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.r.addAll(this.a);
         this.a.clear();
      }

      Iterator<dra> $$1 = this.r.iterator();
      boolean $$2 = this.s().i();

      while ($$1.hasNext()) {
         dra $$3 = $$1.next();
         if ($$3.b()) {
            $$1.remove();
         } else if ($$2 && this.n($$3.c())) {
            $$3.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends bsv> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Ticking entity");
         p $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new y($$3);
      }
   }

   public boolean h(bsv $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean n(iz $$0) {
      return this.a(dbg.a($$0));
   }

   public dbr a(@Nullable bsv $$0, double $$1, double $$2, double $$3, float $$4, dbz.a $$5) {
      return this.a($$0, dbr.a(this, $$0), null, $$1, $$2, $$3, $$4, false, $$5, li.w, li.v, awa.ke);
   }

   public dbr a(@Nullable bsv $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, dbz.a $$6) {
      return this.a($$0, dbr.a(this, $$0), null, $$1, $$2, $$3, $$4, $$5, $$6, li.w, li.v, awa.ke);
   }

   public dbr a(@Nullable bsv $$0, @Nullable bro $$1, @Nullable dbs $$2, evs $$3, float $$4, boolean $$5, dbz.a $$6) {
      return this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6, li.w, li.v, awa.ke);
   }

   public dbr a(@Nullable bsv $$0, @Nullable bro $$1, @Nullable dbs $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, dbz.a $$8) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, li.w, li.v, awa.ke);
   }

   public dbr a(
      @Nullable bsv $$0,
      @Nullable bro $$1,
      @Nullable dbs $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dbz.a $$8,
      lg $$9,
      lg $$10,
      ji<avz> $$11
   ) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, true, $$9, $$10, $$11);
   }

   public dbr a(
      @Nullable bsv $$0,
      @Nullable bro $$1,
      @Nullable dbs $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dbz.a $$8,
      boolean $$9,
      lg $$10,
      lg $$11,
      ji<avz> $$12
   ) {
      dbr.a $$13 = switch ($$8) {
         case a -> dbr.a.a;
         case b -> this.a(dbv.Q);
         case c -> this.ab().b(dbv.c) ? this.a(dbv.R) : dbr.a.a;
         case d -> this.a(dbv.S);
         case e -> dbr.a.d;
      };
      dbr $$14 = new dbr(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$13, $$10, $$11, $$12);
      $$14.c();
      $$14.a($$9);
      return $$14;
   }

   private dbr.a a(dbv.e<dbv.a> $$0) {
      return this.ab().b($$0) ? dbr.a.c : dbr.a.b;
   }

   public abstract String I();

   @Nullable
   @Override
   public dpi c_(iz $$0) {
      if (this.s($$0)) {
         return null;
      } else {
         return !this.B && Thread.currentThread() != this.c ? null : this.m($$0).a($$0, duj.b.a);
      }
   }

   public void a(dpi $$0) {
      iz $$1 = $$0.ay_();
      if (!this.s($$1)) {
         this.m($$1).b($$0);
      }
   }

   public void o(iz $$0) {
      if (!this.s($$0)) {
         this.m($$0).d($$0);
      }
   }

   public boolean p(iz $$0) {
      return this.s($$0) ? false : this.N().b(kb.a($$0.u()), kb.a($$0.w()));
   }

   public boolean a(iz $$0, bsv $$1, je $$2) {
      if (this.s($$0)) {
         return false;
      } else {
         dtz $$3 = this.a(kb.a($$0.u()), kb.a($$0.w()), duy.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(iz $$0, bsv $$1) {
      return this.a($$0, $$1, je.b);
   }

   public void U() {
      double $$0 = 1.0 - (double)(this.d(1.0F) * 5.0F) / 16.0;
      double $$1 = 1.0 - (double)(this.b(1.0F) * 5.0F) / 16.0;
      double $$2 = 0.5 + 2.0 * ayz.a((double)ayz.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void b(boolean $$0, boolean $$1) {
      this.N().a($$0, $$1);
   }

   public iz V() {
      iz $$0 = this.A.a();
      if (!this.C_().a($$0)) {
         $$0 = this.a(dxv.a.e, iz.a(this.C_().a(), 0.0, this.C_().b()));
      }

      return $$0;
   }

   public float W() {
      return this.A.b();
   }

   protected void X() {
      if (this.A.i()) {
         this.w = 1.0F;
         if (this.A.g()) {
            this.y = 1.0F;
         }
      }
   }

   @Override
   public void close() throws IOException {
      this.N().close();
   }

   @Nullable
   @Override
   public dbf c(int $$0, int $$1) {
      return this.a($$0, $$1, duy.n, false);
   }

   @Override
   public List<bsv> a(@Nullable bsv $$0, evn $$1, Predicate<? super bsv> $$2) {
      this.ag().d("getEntities");
      List<bsv> $$3 = Lists.newArrayList();
      this.G().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }

         if ($$3x instanceof cic) {
            for (cia $$4 : ((cic)$$3x).gm()) {
               if ($$3x != $$0 && $$2.test($$4)) {
                  $$3.add($$4);
               }
            }
         }
      });
      return $$3;
   }

   @Override
   public <T extends bsv> List<T> a(dwk<bsv, T> $$0, evn $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends bsv> void a(dwk<bsv, T> $$0, evn $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends bsv> void a(dwk<bsv, T> $$0, evn $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      this.ag().d("getEntities");
      this.G().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return axl.a.b;
            }
         }

         if ($$4x instanceof cic $$5) {
            for (cia $$6 : $$5.gm()) {
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
   public abstract bsv a(int var1);

   public void q(iz $$0) {
      if (this.B($$0)) {
         this.m($$0).a(true);
      }
   }

   @Override
   public int z_() {
      return 63;
   }

   public void Y() {
   }

   public long Z() {
      return this.A.c();
   }

   public long aa() {
      return this.A.d();
   }

   public boolean a(cmy $$0, iz $$1) {
      return true;
   }

   public void a(bsv $$0, byte $$1) {
   }

   public void a(bsv $$0, bro $$1) {
   }

   public void a(iz $$0, dfa $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public ept A_() {
      return this.A;
   }

   public dbv ab() {
      return this.A.o();
   }

   public abstract brg s();

   public float b(float $$0) {
      return ayz.i($$0, this.x, this.y) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = ayz.a($$0, 0.0F, 1.0F);
      this.x = $$1;
      this.y = $$1;
   }

   public float d(float $$0) {
      return ayz.i($$0, this.v, this.w);
   }

   public void e(float $$0) {
      float $$1 = ayz.a($$0, 0.0F, 1.0F);
      this.v = $$1;
      this.w = $$1;
   }

   public boolean ac() {
      return this.D_().g() && !this.D_().h() ? (double)this.b(1.0F) > 0.9 : false;
   }

   public boolean ad() {
      return (double)this.d(1.0F) > 0.2;
   }

   public boolean r(iz $$0) {
      if (!this.ad()) {
         return false;
      } else if (!this.h($$0)) {
         return false;
      } else if (this.a(dxv.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         dcy $$1 = this.t($$0).a();
         return $$1.a($$0) == dcy.c.b;
      }
   }

   @Nullable
   public abstract epl a(epj var1);

   public abstract void a(epj var1, epl var2);

   public abstract epj v();

   public void b(int $$0, iz $$1, int $$2) {
   }

   public p a(o $$0) {
      p $$1 = $$0.a("Affected level", 1);
      $$1.a("All players", () -> this.x().size() + " total; " + this.x());
      $$1.a("Chunk stats", this.N()::e);
      $$1.a("Level dimension", () -> this.af().a().toString());

      try {
         this.A.a($$1, this);
      } catch (Throwable var4) {
         $$1.a("Level Data Unobtainable", var4);
      }

      return $$1;
   }

   public abstract void a(int var1, iz var2, int var3);

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<cxj> $$6) {
   }

   public abstract eww M();

   public void c(iz $$0, dfa $$1) {
      for (je $$2 : je.c.a) {
         iz $$3 = $$0.a($$2);
         if (this.B($$3)) {
            dsd $$4 = this.a_($$3);
            if ($$4.a(dfc.gY)) {
               this.a($$4, $$3, $$1, $$0, false);
            } else if ($$4.g(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(dfc.gY)) {
                  this.a($$4, $$3, $$1, $$0, false);
               }
            }
         }
      }
   }

   @Override
   public bqt d_(iz $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.B($$0)) {
         $$2 = this.aq();
         $$1 = this.m($$0).u();
      }

      return new bqt(this.al(), this.aa(), $$1, $$2);
   }

   @Override
   public int B_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public dtu C_() {
      return this.F;
   }

   public void a(zw<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public dvv D_() {
      return this.D.a();
   }

   public ji<dvv> ae() {
      return this.D;
   }

   public ale<dbz> af() {
      return this.H;
   }

   @Override
   public azh E_() {
      return this.z;
   }

   @Override
   public boolean a(iz $$0, Predicate<dsd> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(iz $$0, Predicate<enw> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract cyz r();

   public iz a(int $$0, int $$1, int $$2, int $$3) {
      this.t = this.t * 3 + 1013904223;
      int $$4 = this.t >> 2;
      return new iz($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean t() {
      return false;
   }

   public bnj ag() {
      return this.E.get();
   }

   public Supplier<bnj> ah() {
      return this.E;
   }

   @Override
   public dda F_() {
      return this.G;
   }

   public final boolean ai() {
      return this.d;
   }

   protected abstract dwm<bsv> G();

   @Override
   public long G_() {
      return this.K++;
   }

   @Override
   public jw H_() {
      return this.I;
   }

   public brp aj() {
      return this.J;
   }

   public abstract cwq K();

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }
}
