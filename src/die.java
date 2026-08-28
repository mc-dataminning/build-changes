import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class die extends dvi implements dfa {
   public static final MapCodec<die> p = b(die::new);
   private static final Logger a = LogUtils.getLogger();
   private final jq.c<die> b = ly.e.f(this);
   public static final jw<dvj> q = new jw<>();
   private static final LoadingCache<fah, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<fah, Boolean>() {
      public Boolean a(fah $$0) {
         return !fae.c(fae.b(), $$0, ezr.g);
      }
   });
   public static final int r = 1;
   public static final int s = 2;
   public static final int t = 4;
   public static final int u = 8;
   public static final int v = 16;
   public static final int w = 32;
   public static final int x = 64;
   public static final int y = 128;
   public static final int z = 4;
   public static final int A = 3;
   public static final int B = 11;
   public static final float C = -1.0F;
   public static final float D = 0.0F;
   public static final int E = 512;
   protected final dvk<die, dvj> F;
   private dvj d;
   @Nullable
   private cvx e;
   private static final int f = 256;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<die.a>> g = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<die.a> $$0 = new Object2ByteLinkedOpenHashMap<die.a>(256, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends die> a() {
      return p;
   }

   public static int j(@Nullable dvj $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dvj a(int $$0) {
      dvj $$1 = q.a($$0);
      return $$1 == null ? dig.a.m() : $$1;
   }

   public static die a(@Nullable cvx $$0) {
      return $$0 instanceof cuh ? ((cuh)$$0).d() : dig.a;
   }

   public static dvj a(dvj $$0, dvj $$1, dfc $$2, jh $$3) {
      fah $$4 = fae.b($$0.g($$2, $$3), $$1.g($$2, $$3), ezr.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (bue $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = fae.a(jm.a.b, $$6.cS().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static fah a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return fae.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dvj b(dvj $$0, dfc $$1, jh $$2) {
      dvj $$3 = $$0;
      jh.a $$4 = new jh.a();

      for (jm $$5 : aG) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(dvj $$0, dvj $$1, dfc $$2, jh $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dvj $$0, dvj $$1, dfc $$2, jh $$3, int $$4, int $$5) {
      if ($$1 != $$0) {
         if ($$1.l()) {
            if (!$$2.y_()) {
               $$2.a($$3, ($$4 & 32) == 0, null, $$5);
            }
         } else {
            $$2.a($$3, $$1, $$4 & -33, $$5);
         }
      }
   }

   public die(dvi.d $$0) {
      super($$0);
      dvk.a<die, dvj> $$1 = new dvk.a<>(this);
      this.a($$1);
      this.F = $$1.a(die::m, dvj::new);
      this.l(this.F.b());
      if (ab.aV) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean k(dvj $$0) {
      return $$0.b() instanceof dmn || $$0.a(dig.hW) || $$0.a(dig.ee) || $$0.a(dig.ef) || $$0.a(dig.fa) || $$0.a(dig.eZ) || $$0.a(axa.aS);
   }

   public static boolean a(dvj $$0, dvj $$1, jm $$2) {
      fah $$3 = $$1.a($$2.g());
      if ($$3 == fae.b()) {
         return false;
      } else if ($$0.a($$1, $$2)) {
         return false;
      } else if ($$3 == fae.a()) {
         return true;
      } else {
         fah $$4 = $$0.a($$2);
         if ($$4 == fae.a()) {
            return true;
         } else {
            die.a $$5 = new die.a($$4, $$3);
            Object2ByteLinkedOpenHashMap<die.a> $$6 = g.get();
            byte $$7 = $$6.getAndMoveToFirst($$5);
            if ($$7 != 127) {
               return $$7 != 0;
            } else {
               boolean $$8 = fae.c($$4, $$3, ezr.e);
               if ($$6.size() == 256) {
                  $$6.removeLastByte();
               }

               $$6.putAndMoveToFirst($$5, (byte)($$8 ? 1 : 0));
               return $$8;
            }
         }
      }
   }

   public static boolean c(deg $$0, jh $$1) {
      return $$0.a_($$1).a($$0, $$1, jm.b, dqf.c);
   }

   public static boolean a(dfe $$0, jh $$1, jm $$2) {
      dvj $$3 = $$0.a_($$1);
      return $$2 == jm.a && $$3.a(axa.ba) ? false : $$3.a($$0, $$1, $$2, dqf.b);
   }

   public static boolean a(fah $$0, jm $$1) {
      fah $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(fah $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(dvj $$0, dfb $$1, jh $$2, azs $$3) {
   }

   public void a(dfc $$0, jh $$1, dvj $$2) {
   }

   public static List<cwb> a(dvj $$0, arn $$1, jh $$2, @Nullable dsm $$3) {
      euf.a $$4 = new euf.a($$1).a(ewy.f, ezn.b($$2)).a(ewy.i, cwb.k).b(ewy.h, $$3);
      return $$0.a($$4);
   }

   public static List<cwb> a(dvj $$0, arn $$1, jh $$2, @Nullable dsm $$3, @Nullable bue $$4, cwb $$5) {
      euf.a $$6 = new euf.a($$1).a(ewy.f, ezn.b($$2)).a(ewy.i, $$5).b(ewy.a, $$4).b(ewy.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dvj $$0, dfb $$1, jh $$2) {
      if ($$1 instanceof arn) {
         a($$0, (arn)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((arn)$$1, $$2, cwb.k, true);
      }
   }

   public static void a(dvj $$0, dfc $$1, jh $$2, @Nullable dsm $$3) {
      if ($$1 instanceof arn) {
         a($$0, (arn)$$1, $$2, $$3).forEach($$2x -> a((dfb)((arn)$$1), $$2, $$2x));
         $$0.a((arn)$$1, $$2, cwb.k, true);
      }
   }

   public static void a(dvj $$0, dfb $$1, jh $$2, @Nullable dsm $$3, @Nullable bue $$4, cwb $$5) {
      if ($$1 instanceof arn) {
         a($$0, (arn)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((arn)$$1, $$2, $$5, true);
      }
   }

   public static void a(dfb $$0, jh $$1, cwb $$2) {
      double $$3 = (double)bul.ag.m() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + azk.a($$0.A, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + azk.a($$0.A, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + azk.a($$0.A, -0.25, 0.25);
      a($$0, () -> new ckv($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(dfb $$0, jh $$1, jm $$2, cwb $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bul.ag.l() / 2.0;
      double $$8 = (double)bul.ag.m() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? azk.a($$0.A, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? azk.a($$0.A, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? azk.a($$0.A, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? azk.a($$0.A, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? azk.a($$0.A, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? azk.a($$0.A, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new ckv($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(dfb $$0, Supplier<ckv> $$1, cwb $$2) {
      if (!$$0.C && !$$2.f() && $$0.ac().b(dex.h)) {
         ckv $$3 = $$1.get();
         $$3.q();
         $$0.b($$3);
      }
   }

   protected void a(arn $$0, jh $$1, int $$2) {
      if ($$0.ac().b(dex.h)) {
         buq.a($$0, ezn.b($$1), $$2);
      }
   }

   public float e() {
      return this.aI;
   }

   public void a(arn $$0, jh $$1, det $$2) {
   }

   public void a(dfb $$0, jh $$1, dvj $$2, bue $$3) {
   }

   @Nullable
   public dvj a(czs $$0) {
      return this.m();
   }

   public void a(dfb $$0, com $$1, jh $$2, dvj $$3, @Nullable dsm $$4, cwb $$5) {
      $$1.b(awv.a.b(this));
      $$1.G(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(dfb $$0, jh $$1, dvj $$2, @Nullable bva $$3, cwb $$4) {
   }

   public boolean a(dvj $$0) {
      return !$$0.e() && !$$0.n();
   }

   public xw f() {
      return xi.c(this.v());
   }

   public void a(dfb $$0, dvj $$1, jh $$2, bue $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dY().l());
   }

   public void a(deg $$0, bue $$1) {
      $$1.h($$1.dA().d(1.0, 0.0, 1.0));
   }

   public cwb a(dfe $$0, jh $$1, dvj $$2) {
      return new cwb(this);
   }

   public float g() {
      return this.aL;
   }

   public float h() {
      return this.aM;
   }

   public float k() {
      return this.aN;
   }

   protected void a(dfb $$0, com $$1, jh $$2, dvj $$3) {
      $$0.a($$1, 2001, $$2, j($$3));
   }

   public dvj a(dfb $$0, jh $$1, dvj $$2, com $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(axa.aX)) {
         cnc.a($$3, false);
      }

      $$0.a(eag.f, $$1, eag.a.a($$3, $$2));
      return $$2;
   }

   public void a(dvj $$0, dfb $$1, jh $$2, dgc.c $$3) {
   }

   public boolean a(det $$0) {
      return true;
   }

   protected void a(dvk.a<die, dvj> $$0) {
   }

   public dvk<die, dvj> l() {
      return this.F;
   }

   protected final void l(dvj $$0) {
      this.d = $$0;
   }

   public final dvj m() {
      return this.d;
   }

   public final dvj m(dvj $$0) {
      dvj $$1 = this.m();

      for (dwm<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dvj a(dvj $$0, dvj $$1, dwm<T> $$2) {
      return $$1.b($$2, $$0.c($$2));
   }

   @Override
   public cvx j() {
      if (this.e == null) {
         this.e = cvx.a(this);
      }

      return this.e;
   }

   public boolean n() {
      return this.aO;
   }

   @Override
   public String toString() {
      return "Block{" + ly.e.e(this).g() + "}";
   }

   public void a(cwb $$0, cvx.b $$1, List<xi> $$2, cxt $$3) {
   }

   @Override
   protected die o() {
      return this;
   }

   protected ImmutableMap<dvj, fah> a(Function<dvj, fah> $$0) {
      return this.F.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public jq.c<die> p() {
      return this.b;
   }

   protected void a(arn $$0, jh $$1, cwb $$2, bri $$3) {
      int $$4 = dbu.b($$0, $$2, $$3.a($$0.E_()));
      if ($$4 > 0) {
         this.a($$0, $$1, $$4);
      }
   }

   static record a(fah a, fah b) {
      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof die.a $$1 && this.a == $$1.a && this.b == $$1.b) {
            return true;
         }

         return false;
      }

      @Override
      public int hashCode() {
         return System.identityHashCode(this.a) * 31 + System.identityHashCode(this.b);
      }
   }
}
