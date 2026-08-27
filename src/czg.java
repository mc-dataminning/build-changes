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

public abstract class czg implements czh, AutoCloseable {
   public static final Codec<aju<czg>> g = aju.a(ku.aP);
   public static final aju<czg> h = aju.a(ku.aP, new ajv("overworld"));
   public static final aju<czg> i = aju.a(ku.aP, new ajv("the_nether"));
   public static final aju<czg> j = aju.a(ku.aP, new ajv("the_end"));
   public static final int k = 30000000;
   public static final int l = 512;
   public static final int m = 32;
   public static final int n = 15;
   public static final int o = 24000;
   public static final int p = 20000000;
   public static final int q = -20000000;
   protected final List<dog> r = Lists.newArrayList();
   protected final emf s;
   private final List<dog> a = Lists.newArrayList();
   private boolean b;
   private final Thread c;
   private final boolean d;
   private int e;
   protected int t = axt.a().f();
   protected final int u = 1013904223;
   protected float v;
   protected float w;
   protected float x;
   protected float y;
   public final axt z = axt.a();
   @Deprecated
   private final axt f = axt.b();
   private final in<dta> D;
   protected final enh A;
   private final Supplier<bkt> E;
   public final boolean B;
   private final dqz F;
   private final dah G;
   private final aju<czg> H;
   private final jb I;
   private final boz J;
   private long K;

   protected czg(enh $$0, aju<czg> $$1, jb $$2, in<dta> $$3, Supplier<bkt> $$4, boolean $$5, boolean $$6, long $$7, int $$8) {
      this.E = $$4;
      this.A = $$0;
      this.D = $$3;
      final dta $$9 = $$3.a();
      this.H = $$1;
      this.B = $$5;
      if ($$9.k() != 1.0) {
         this.F = new dqz() {
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
         this.F = new dqz();
      }

      this.c = Thread.currentThread();
      this.G = new dah(this, $$7);
      this.d = $$6;
      this.s = new emd(this, $$8);
      this.I = $$2;
      this.J = new boz($$2);
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

   public boolean k(id $$0) {
      return !this.s($$0) && g($$0);
   }

   public static boolean l(id $$0) {
      return !b($$0.v()) && g($$0);
   }

   private static boolean g(id $$0) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000;
   }

   private static boolean b(int $$0) {
      return $$0 < -20000000 || $$0 >= 20000000;
   }

   public dro m(id $$0) {
      return this.d(jg.a($$0.u()), jg.a($$0.w()));
   }

   public dro d(int $$0, int $$1) {
      return (dro)this.a($$0, $$1, dsd.n);
   }

   @Nullable
   @Override
   public dre a(int $$0, int $$1, dsd $$2, boolean $$3) {
      dre $$4 = this.M().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(id $$0, dpi $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(id $$0, dpi $$1, int $$2, int $$3) {
      if (this.s($$0)) {
         return false;
      } else if (!this.B && this.ah()) {
         return false;
      } else {
         dro $$4 = this.m($$0);
         dch $$5 = $$1.b();
         dpi $$6 = $$4.a($$0, $$1, ($$2 & 64) != 0);
         if ($$6 == null) {
            return false;
         } else {
            dpi $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.B || ($$2 & 4) == 0) && (this.B || $$4.D() != null && $$4.D().a(apn.c))) {
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
                  $$1.a((czh)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(id $$0, dpi $$1, dpi $$2) {
   }

   @Override
   public boolean a(id $$0, boolean $$1) {
      elb $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(id $$0, boolean $$1, @Nullable bqa $$2, int $$3) {
      dpi $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         elb $$5 = this.b_($$0);
         if (!($$4.b() instanceof dbu)) {
            this.c(2001, $$0, dch.i($$4));
         }

         if ($$1) {
            dmo $$6 = $$4.t() ? this.c_($$0) : null;
            dch.a($$4, this, $$0, $$6, $$2, crs.i);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(dub.f, $$0, dub.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(id $$0, dpi $$1) {
   }

   public boolean b(id $$0, dpi $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(id var1, dpi var2, dpi var3, int var4);

   public void b(id $$0, dpi $$1, dpi $$2) {
   }

   public void a(id $$0, dch $$1) {
   }

   public void a(id $$0, dch $$1, ij $$2) {
   }

   public void a(id $$0, dch $$1, id $$2) {
   }

   public void a(dpi $$0, id $$1, dch $$2, id $$3, boolean $$4) {
   }

   @Override
   public void a(ij $$0, dpi $$1, id $$2, id $$3, int $$4, int $$5) {
      this.s.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int a(dva.a $$0, int $$1, int $$2) {
      int $$4;
      if ($$1 >= -30000000 && $$2 >= -30000000 && $$1 < 30000000 && $$2 < 30000000) {
         if (this.b(jg.a($$1), jg.a($$2))) {
            $$4 = this.d(jg.a($$1), jg.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
         } else {
            $$4 = this.I_();
         }
      } else {
         $$4 = this.z_() + 1;
      }

      return $$4;
   }

   @Override
   public ekq y_() {
      return this.M().p();
   }

   @Override
   public dpi a_(id $$0) {
      if (this.s($$0)) {
         return dcj.nb.n();
      } else {
         dro $$1 = this.d(jg.a($$0.u()), jg.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public elb b_(id $$0) {
      if (this.s($$0)) {
         return elc.a.g();
      } else {
         dro $$1 = this.m($$0);
         return $$1.b_($$0);
      }
   }

   public boolean Q() {
      return !this.D_().a() && this.e < 4;
   }

   public boolean R() {
      return !this.D_().a() && !this.Q();
   }

   public void a(@Nullable bqa $$0, id $$1, aun $$2, aup $$3, float $$4, float $$5) {
      this.a($$0 instanceof cka $$6 ? $$6 : null, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(@Nullable cka $$0, id $$1, aun $$2, aup $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable cka var1, double var2, double var4, double var6, in<aun> var8, aup var9, float var10, float var11, long var12);

   public void a(@Nullable cka $$0, double $$1, double $$2, double $$3, aun $$4, aup $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, kt.b.e($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable cka var1, bqa var2, in<aun> var3, aup var4, float var5, float var6, long var7);

   public void a(@Nullable cka $$0, double $$1, double $$2, double $$3, aun $$4, aup $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 1.0F, 1.0F);
   }

   public void a(@Nullable cka $$0, double $$1, double $$2, double $$3, aun $$4, aup $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable cka $$0, bqa $$1, aun $$2, aup $$3, float $$4, float $$5) {
      this.a($$0, $$1, kt.b.e($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(id $$0, aun $$1, aup $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(bqa $$0, aun $$1, aup $$2, float $$3, float $$4) {
   }

   public void a(double $$0, double $$1, double $$2, aun $$3, aup $$4, float $$5, float $$6, boolean $$7) {
   }

   @Override
   public void a(kl $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(kl $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public void b(kl $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void b(kl $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public float a(float $$0) {
      float $$1 = this.f($$0);
      return $$1 * (float) (Math.PI * 2);
   }

   public void a(dog $$0) {
      (this.b ? this.a : this.r).add($$0);
   }

   protected void S() {
      bkt $$0 = this.af();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.r.addAll(this.a);
         this.a.clear();
      }

      Iterator<dog> $$1 = this.r.iterator();
      boolean $$2 = this.s().i();

      while ($$1.hasNext()) {
         dog $$3 = $$1.next();
         if ($$3.b()) {
            $$1.remove();
         } else if ($$2 && this.n($$3.c())) {
            $$3.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends bqa> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Ticking entity");
         p $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new y($$3);
      }
   }

   public boolean h(bqa $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean n(id $$0) {
      return this.a(cyn.a($$0));
   }

   public cyy a(@Nullable bqa $$0, double $$1, double $$2, double $$3, float $$4, czg.a $$5) {
      return this.a($$0, cyy.a(this, $$0), null, $$1, $$2, $$3, $$4, false, $$5, kn.x, kn.w, auo.jZ);
   }

   public cyy a(@Nullable bqa $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, czg.a $$6) {
      return this.a($$0, cyy.a(this, $$0), null, $$1, $$2, $$3, $$4, $$5, $$6, kn.x, kn.w, auo.jZ);
   }

   public cyy a(@Nullable bqa $$0, @Nullable boy $$1, @Nullable cyz $$2, esj $$3, float $$4, boolean $$5, czg.a $$6) {
      return this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6, kn.x, kn.w, auo.jZ);
   }

   public cyy a(@Nullable bqa $$0, @Nullable boy $$1, @Nullable cyz $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, czg.a $$8) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, kn.x, kn.w, auo.jZ);
   }

   public cyy a(
      @Nullable bqa $$0,
      @Nullable boy $$1,
      @Nullable cyz $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      czg.a $$8,
      kl $$9,
      kl $$10,
      in<aun> $$11
   ) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, true, $$9, $$10, $$11);
   }

   public cyy a(
      @Nullable bqa $$0,
      @Nullable boy $$1,
      @Nullable cyz $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      czg.a $$8,
      boolean $$9,
      kl $$10,
      kl $$11,
      in<aun> $$12
   ) {
      cyy.a $$13 = switch ($$8) {
         case a -> cyy.a.a;
         case b -> this.a(czc.Q);
         case c -> this.aa().b(czc.c) ? this.a(czc.R) : cyy.a.a;
         case d -> this.a(czc.S);
         case e -> cyy.a.d;
      };
      cyy $$14 = new cyy(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$13, $$10, $$11, $$12);
      $$14.c();
      $$14.a($$9);
      return $$14;
   }

   private cyy.a a(czc.e<czc.a> $$0) {
      return this.aa().b($$0) ? cyy.a.c : cyy.a.b;
   }

   public abstract String I();

   @Nullable
   @Override
   public dmo c_(id $$0) {
      if (this.s($$0)) {
         return null;
      } else {
         return !this.B && Thread.currentThread() != this.c ? null : this.m($$0).a($$0, dro.b.a);
      }
   }

   public void a(dmo $$0) {
      id $$1 = $$0.az_();
      if (!this.s($$1)) {
         this.m($$1).b($$0);
      }
   }

   public void o(id $$0) {
      if (!this.s($$0)) {
         this.m($$0).d($$0);
      }
   }

   public boolean p(id $$0) {
      return this.s($$0) ? false : this.M().b(jg.a($$0.u()), jg.a($$0.w()));
   }

   public boolean a(id $$0, bqa $$1, ij $$2) {
      if (this.s($$0)) {
         return false;
      } else {
         dre $$3 = this.a(jg.a($$0.u()), jg.a($$0.w()), dsd.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(id $$0, bqa $$1) {
      return this.a($$0, $$1, ij.b);
   }

   public void T() {
      double $$0 = 1.0 - (double)(this.d(1.0F) * 5.0F) / 16.0;
      double $$1 = 1.0 - (double)(this.b(1.0F) * 5.0F) / 16.0;
      double $$2 = 0.5 + 2.0 * axm.a((double)axm.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void b(boolean $$0, boolean $$1) {
      this.M().a($$0, $$1);
   }

   public id U() {
      id $$0 = this.A.a();
      if (!this.C_().a($$0)) {
         $$0 = this.a(dva.a.e, id.a(this.C_().a(), 0.0, this.C_().b()));
      }

      return $$0;
   }

   public float V() {
      return this.A.b();
   }

   protected void W() {
      if (this.A.i()) {
         this.w = 1.0F;
         if (this.A.g()) {
            this.y = 1.0F;
         }
      }
   }

   @Override
   public void close() throws IOException {
      this.M().close();
   }

   @Nullable
   @Override
   public cym c(int $$0, int $$1) {
      return this.a($$0, $$1, dsd.n, false);
   }

   @Override
   public List<bqa> a(@Nullable bqa $$0, ese $$1, Predicate<? super bqa> $$2) {
      this.af().d("getEntities");
      List<bqa> $$3 = Lists.newArrayList();
      this.G().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }

         if ($$3x instanceof cfe) {
            for (cfc $$4 : ((cfe)$$3x).gj()) {
               if ($$3x != $$0 && $$2.test($$4)) {
                  $$3.add($$4);
               }
            }
         }
      });
      return $$3;
   }

   @Override
   public <T extends bqa> List<T> a(dtp<bqa, T> $$0, ese $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends bqa> void a(dtp<bqa, T> $$0, ese $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends bqa> void a(dtp<bqa, T> $$0, ese $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      this.af().d("getEntities");
      this.G().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return avz.a.b;
            }
         }

         if ($$4x instanceof cfe $$5) {
            for (cfc $$6 : $$5.gj()) {
               T $$7 = $$0.a($$6);
               if ($$7 != null && $$2.test($$7)) {
                  $$3.add($$7);
                  if ($$3.size() >= $$4) {
                     return avz.a.b;
                  }
               }
            }
         }

         return avz.a.a;
      });
   }

   @Nullable
   public abstract bqa a(int var1);

   public void q(id $$0) {
      if (this.B($$0)) {
         this.m($$0).a(true);
      }
   }

   @Override
   public int z_() {
      return 63;
   }

   public void X() {
   }

   public long Y() {
      return this.A.c();
   }

   public long Z() {
      return this.A.d();
   }

   public boolean a(cka $$0, id $$1) {
      return true;
   }

   public void a(bqa $$0, byte $$1) {
   }

   public void a(bqa $$0, boy $$1) {
   }

   public void a(id $$0, dch $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public emw A_() {
      return this.A;
   }

   public czc aa() {
      return this.A.o();
   }

   public abstract boq s();

   public float b(float $$0) {
      return axm.i($$0, this.x, this.y) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = axm.a($$0, 0.0F, 1.0F);
      this.x = $$1;
      this.y = $$1;
   }

   public float d(float $$0) {
      return axm.i($$0, this.v, this.w);
   }

   public void e(float $$0) {
      float $$1 = axm.a($$0, 0.0F, 1.0F);
      this.v = $$1;
      this.w = $$1;
   }

   public boolean ab() {
      return this.D_().g() && !this.D_().h() ? (double)this.b(1.0F) > 0.9 : false;
   }

   public boolean ac() {
      return (double)this.d(1.0F) > 0.2;
   }

   public boolean r(id $$0) {
      if (!this.ac()) {
         return false;
      } else if (!this.h($$0)) {
         return false;
      } else if (this.a(dva.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         daf $$1 = this.t($$0).a();
         return $$1.a($$0) == daf.c.b;
      }
   }

   @Nullable
   public abstract emo a(emm var1);

   public abstract void a(emm var1, emo var2);

   public abstract emm v();

   public void b(int $$0, id $$1, int $$2) {
   }

   public p a(o $$0) {
      p $$1 = $$0.a("Affected level", 1);
      $$1.a("All players", () -> this.x().size() + " total; " + this.x());
      $$1.a("Chunk stats", this.M()::e);
      $$1.a("Level dimension", () -> this.ae().a().toString());

      try {
         this.A.a($$1, this);
      } catch (Throwable var4) {
         $$1.a("Level Data Unobtainable", var4);
      }

      return $$1;
   }

   public abstract void a(int var1, id var2, int var3);

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<cug> $$6) {
   }

   public abstract etn L();

   public void c(id $$0, dch $$1) {
      for (ij $$2 : ij.c.a) {
         id $$3 = $$0.a($$2);
         if (this.B($$3)) {
            dpi $$4 = this.a_($$3);
            if ($$4.a(dcj.gY)) {
               this.a($$4, $$3, $$1, $$0, false);
            } else if ($$4.g(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(dcj.gY)) {
                  this.a($$4, $$3, $$1, $$0, false);
               }
            }
         }
      }
   }

   @Override
   public bod d_(id $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.B($$0)) {
         $$2 = this.ap();
         $$1 = this.m($$0).u();
      }

      return new bod(this.ak(), this.Z(), $$1, $$2);
   }

   @Override
   public int B_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public dqz C_() {
      return this.F;
   }

   public void a(yp<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public dta D_() {
      return this.D.a();
   }

   public in<dta> ad() {
      return this.D;
   }

   public aju<czg> ae() {
      return this.H;
   }

   @Override
   public axt E_() {
      return this.z;
   }

   @Override
   public boolean a(id $$0, Predicate<dpi> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(id $$0, Predicate<elb> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract cvv r();

   public id a(int $$0, int $$1, int $$2, int $$3) {
      this.t = this.t * 3 + 1013904223;
      int $$4 = this.t >> 2;
      return new id($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean t() {
      return false;
   }

   public bkt af() {
      return this.E.get();
   }

   public Supplier<bkt> ag() {
      return this.E;
   }

   @Override
   public dah F_() {
      return this.G;
   }

   public final boolean ah() {
      return this.d;
   }

   protected abstract dtr<bqa> G();

   @Override
   public long G_() {
      return this.K++;
   }

   @Override
   public jb H_() {
      return this.I;
   }

   public boz ai() {
      return this.J;
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }
}
