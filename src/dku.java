import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dku extends dyl implements dho {
   public static final MapCodec<dku> j = b(dku::new);
   private static final Logger a = LogUtils.getLogger();
   private final js.c<dku> b = md.e.f(this);
   public static final jy<dym> k = new jy<>();
   private static final LoadingCache<fdo, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<fdo, Boolean>() {
      public Boolean a(fdo $$0) {
         return !fdl.c(fdl.b(), $$0, fcy.g);
      }
   });
   public static final int l = 1;
   public static final int m = 2;
   public static final int n = 4;
   public static final int o = 8;
   public static final int p = 16;
   public static final int q = 32;
   public static final int r = 64;
   public static final int s = 128;
   public static final int t = 256;
   public static final int u = 260;
   public static final int v = 3;
   public static final int w = 11;
   public static final int x = 304;
   public static final float y = -1.0F;
   public static final float z = 0.0F;
   public static final int A = 512;
   protected final dyn<dku, dym> B;
   private dym d;
   @Nullable
   private cxu e;
   private static final int f = 256;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dku.a>> g = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dku.a> $$0 = new Object2ByteLinkedOpenHashMap<dku.a>(256, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends dku> a() {
      return j;
   }

   public static int j(@Nullable dym $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = k.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dym a(int $$0) {
      dym $$1 = k.a($$0);
      return $$1 == null ? dkw.a.m() : $$1;
   }

   public static dku a(@Nullable cxu $$0) {
      return $$0 instanceof cwf ? ((cwf)$$0).d() : dkw.a;
   }

   public static dym a(dym $$0, dym $$1, dhq $$2, jj $$3) {
      fdo $$4 = fdl.b($$0.g($$2, $$3), $$1.g($$2, $$3), fcy.c).a($$3);
      if ($$4.c()) {
         return $$1;
      } else {
         for (bvs $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = fdl.a(jo.a.b, $$6.cR().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static fdo a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return fdl.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static fdo[] a(int $$0, IntFunction<fdo> $$1) {
      return IntStream.rangeClosed(0, $$0).mapToObj($$1).toArray(fdo[]::new);
   }

   public static fdo a(double $$0) {
      return a($$0, $$0, $$0);
   }

   public static fdo a(double $$0, double $$1, double $$2) {
      double $$3 = $$1 / 2.0;
      return a($$0, $$2, 8.0 - $$3, 8.0 + $$3);
   }

   public static fdo b(double $$0, double $$1, double $$2) {
      return a($$0, $$0, $$1, $$2);
   }

   public static fdo a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$0 / 2.0;
      double $$5 = $$1 / 2.0;
      return a(8.0 - $$4, $$2, 8.0 - $$5, 8.0 + $$4, $$3, 8.0 + $$5);
   }

   public static fdo c(double $$0, double $$1, double $$2) {
      return b($$0, $$0, $$1, $$2);
   }

   public static fdo b(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$1 / 2.0;
      return a($$0, 8.0 - $$4, 8.0 + $$4, $$2, $$3);
   }

   public static fdo a(double $$0, double $$1, double $$2, double $$3, double $$4) {
      double $$5 = $$0 / 2.0;
      return a(8.0 - $$5, $$1, $$3, 8.0 + $$5, $$2, $$4);
   }

   public static dym b(dym $$0, dhq $$1, jj $$2) {
      dym $$3 = $$0;
      jj.a $$4 = new jj.a();

      for (jo $$5 : D) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$1, $$1, $$2, $$5, $$4, $$1.a_($$4), $$1.C_());
      }

      return $$3;
   }

   public static void a(dym $$0, dym $$1, dhq $$2, jj $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dym $$0, dym $$1, dhq $$2, jj $$3, int $$4, int $$5) {
      if ($$1 != $$0) {
         if ($$1.l()) {
            if (!$$2.w_()) {
               $$2.a($$3, ($$4 & 32) == 0, null, $$5);
            }
         } else {
            $$2.a($$3, $$1, $$4 & -33, $$5);
         }
      }
   }

   public dku(dyl.d $$0) {
      super($$0);
      dyn.a<dku, dym> $$1 = new dyn.a<>(this);
      this.a($$1);
      this.B = $$1.a(dku::m, dym::new);
      this.l(this.B.b());
      if (ab.aU) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean k(dym $$0) {
      return $$0.b() instanceof dpi || $$0.a(dkw.iu) || $$0.a(dkw.er) || $$0.a(dkw.es) || $$0.a(dkw.fo) || $$0.a(dkw.fn) || $$0.a(awz.am);
   }

   public static boolean a(dym $$0, dym $$1, jo $$2) {
      fdo $$3 = $$1.a($$2.g());
      if ($$3 == fdl.b()) {
         return false;
      } else if ($$0.a($$1, $$2)) {
         return false;
      } else if ($$3 == fdl.a()) {
         return true;
      } else {
         fdo $$4 = $$0.a($$2);
         if ($$4 == fdl.a()) {
            return true;
         } else {
            dku.a $$5 = new dku.a($$4, $$3);
            Object2ByteLinkedOpenHashMap<dku.a> $$6 = g.get();
            byte $$7 = $$6.getAndMoveToFirst($$5);
            if ($$7 != 127) {
               return $$7 != 0;
            } else {
               boolean $$8 = fdl.c($$4, $$3, fcy.e);
               if ($$6.size() == 256) {
                  $$6.removeLastByte();
               }

               $$6.putAndMoveToFirst($$5, (byte)($$8 ? 1 : 0));
               return $$8;
            }
         }
      }
   }

   public static boolean c(dgv $$0, jj $$1) {
      return $$0.a_($$1).a($$0, $$1, jo.b, dtb.c);
   }

   public static boolean a(dhs $$0, jj $$1, jo $$2) {
      dym $$3 = $$0.a_($$1);
      return $$2 == jo.a && $$3.a(awz.bb) ? false : $$3.a($$0, $$1, $$2, dtb.b);
   }

   public static boolean a(fdo $$0, jo $$1) {
      fdo $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(fdo $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(dym $$0, dhp $$1, jj $$2, azs $$3) {
   }

   public void a(dhq $$0, jj $$1, dym $$2) {
   }

   public static List<cxy> a(dym $$0, arn $$1, jj $$2, @Nullable dvl $$3) {
      exo.a $$4 = new exo.a($$1).a(faf.f, fcu.b($$2)).a(faf.i, cxy.k).b(faf.h, $$3);
      return $$0.a($$4);
   }

   public static List<cxy> a(dym $$0, arn $$1, jj $$2, @Nullable dvl $$3, @Nullable bvs $$4, cxy $$5) {
      exo.a $$6 = new exo.a($$1).a(faf.f, fcu.b($$2)).a(faf.i, $$5).b(faf.a, $$4).b(faf.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dym $$0, dhp $$1, jj $$2) {
      if ($$1 instanceof arn) {
         a($$0, (arn)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((arn)$$1, $$2, cxy.k, true);
      }
   }

   public static void a(dym $$0, dhq $$1, jj $$2, @Nullable dvl $$3) {
      if ($$1 instanceof arn) {
         a($$0, (arn)$$1, $$2, $$3).forEach($$2x -> a((dhp)((arn)$$1), $$2, $$2x));
         $$0.a((arn)$$1, $$2, cxy.k, true);
      }
   }

   public static void a(dym $$0, dhp $$1, jj $$2, @Nullable dvl $$3, @Nullable bvs $$4, cxy $$5) {
      if ($$1 instanceof arn) {
         a($$0, (arn)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((arn)$$1, $$2, $$5, true);
      }
   }

   public static void a(dhp $$0, jj $$1, cxy $$2) {
      double $$3 = (double)bwb.aq.m() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + azk.a($$0.A, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + azk.a($$0.A, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + azk.a($$0.A, -0.25, 0.25);
      a($$0, () -> new cmn($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(dhp $$0, jj $$1, jo $$2, cxy $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bwb.aq.l() / 2.0;
      double $$8 = (double)bwb.aq.m() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? azk.a($$0.A, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? azk.a($$0.A, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? azk.a($$0.A, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? azk.a($$0.A, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? azk.a($$0.A, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? azk.a($$0.A, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new cmn($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(dhp $$0, Supplier<cmn> $$1, cxy $$2) {
      if ($$0 instanceof arn $$3 && !$$2.f() && $$3.O().c(dhl.h)) {
         cmn $$5 = $$1.get();
         $$5.j();
         $$0.b($$5);
         return;
      }
   }

   protected void a(arn $$0, jj $$1, int $$2) {
      if ($$0.O().c(dhl.h)) {
         bwg.a($$0, fcu.b($$1), $$2);
      }
   }

   public float e() {
      return this.F;
   }

   public void a(arn $$0, jj $$1, dhi $$2) {
   }

   public void a(dhp $$0, jj $$1, dym $$2, bvs $$3) {
   }

   @Nullable
   public dym a(dbn $$0) {
      return this.m();
   }

   public void a(dhp $$0, cqi $$1, jj $$2, dym $$3, @Nullable dvl $$4, cxy $$5) {
      $$1.b(awu.a.b(this));
      $$1.H(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(dhp $$0, jj $$1, dym $$2, @Nullable bwr $$3, cxy $$4) {
   }

   public boolean a(dym $$0) {
      return !$$0.e() && !$$0.n();
   }

   public xj f() {
      return wv.c(this.v());
   }

   public void a(dhp $$0, dym $$1, jj $$2, bvs $$3, double $$4) {
      $$3.a($$4, 1.0F, $$3.dW().l());
   }

   public void a(dgv $$0, bvs $$1) {
      $$1.i($$1.dy().d(1.0, 0.0, 1.0));
   }

   public float g() {
      return this.I;
   }

   public float h() {
      return this.J;
   }

   public float j() {
      return this.K;
   }

   protected void a(dhp $$0, cqi $$1, jj $$2, dym $$3) {
      $$0.a($$1, 2001, $$2, j($$3));
   }

   public dym a(dhp $$0, jj $$1, dym $$2, cqi $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(awz.aY) && $$0 instanceof arn $$4) {
         coy.a($$4, $$3, false);
      }

      $$0.a(edm.f, $$1, edm.a.a($$3, $$2));
      return $$2;
   }

   public void a(dym $$0, dhp $$1, jj $$2, dis.c $$3) {
   }

   public boolean a(dhi $$0) {
      return true;
   }

   protected void a(dyn.a<dku, dym> $$0) {
   }

   public dyn<dku, dym> l() {
      return this.B;
   }

   protected final void l(dym $$0) {
      this.d = $$0;
   }

   public final dym m() {
      return this.d;
   }

   public final dym m(dym $$0) {
      dym $$1 = this.m();

      for (dzp<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dym a(dym $$0, dym $$1, dzp<T> $$2) {
      return $$1.b($$2, $$0.c($$2));
   }

   @Override
   public cxu i() {
      if (this.e == null) {
         this.e = cxu.a(this);
      }

      return this.e;
   }

   public boolean n() {
      return this.L;
   }

   @Override
   public String toString() {
      return "Block{" + md.e.e(this).g() + "}";
   }

   public void a(cxy $$0, cxu.b $$1, List<wv> $$2, czn $$3) {
   }

   @Override
   protected dku o() {
      return this;
   }

   protected Function<dym, fdo> a(Function<dym, fdo> $$0) {
      return this.B.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0))::get;
   }

   protected Function<dym, fdo> a(Function<dym, fdo> $$0, dzp<?>... $$1) {
      Map<? extends dzp<?>, Object> $$2 = Arrays.stream($$1).collect(Collectors.toMap($$0x -> $$0x, $$0x -> $$0x.a().getFirst()));
      ImmutableMap<dym, fdo> $$3 = this.B
         .a()
         .stream()
         .filter($$1x -> $$2.entrySet().stream().allMatch($$1xx -> $$1x.c((dzp)$$1xx.getKey()) == $$1xx.getValue()))
         .collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
      return $$2x -> {
         for (Entry<? extends dzp<?>, Object> $$3x : $$2.entrySet()) {
            $$2x = a($$2x, (dzp<?>)$$3x.getKey(), $$3x.getValue());
         }

         return (fdo)$$3.get($$2x);
      };
   }

   private static <S extends dyo<?, S>, T extends Comparable<T>> S a(S $$0, dzp<T> $$1, Object $$2) {
      return $$0.b($$1, (Comparable)$$2);
   }

   @Deprecated
   public js.c<dku> p() {
      return this.b;
   }

   protected void a(arn $$0, jj $$1, cxy $$2, bsv $$3) {
      int $$4 = dej.b($$0, $$2, $$3.a($$0.C_()));
      if ($$4 > 0) {
         this.a($$0, $$1, $$4);
      }
   }

   static record a(fdo a, fdo b) {
      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof dku.a $$1 && this.a == $$1.a && this.b == $$1.b) {
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
