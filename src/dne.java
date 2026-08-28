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

public class dne extends ebf implements djy {
   public static final MapCodec<dne> j = b(dne::new);
   private static final Logger a = LogUtils.getLogger();
   private final jg.c<dne> b = mh.e.f(this);
   public static final jm<ebg> k = new jm<>();
   private static final LoadingCache<fgm, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<fgm, Boolean>() {
      public Boolean a(fgm $$0) {
         return !fgj.c(fgj.b(), $$0, ffw.g);
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
   public static final int u = 512;
   public static final int v = 260;
   public static final int w = 3;
   public static final int x = 11;
   public static final int y = 816;
   public static final float z = -1.0F;
   public static final float A = 0.0F;
   public static final int B = 512;
   protected final ebh<dne, ebg> C;
   private ebg d;
   @Nullable
   private czw e;
   private static final int f = 256;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dne.a>> g = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dne.a> $$0 = new Object2ByteLinkedOpenHashMap<dne.a>(256, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends dne> a() {
      return j;
   }

   public static int j(@Nullable ebg $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = k.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static ebg a(int $$0) {
      ebg $$1 = k.a($$0);
      return $$1 == null ? dng.a.m() : $$1;
   }

   public static dne a(@Nullable czw $$0) {
      return $$0 instanceof cyi ? ((cyi)$$0).c() : dng.a;
   }

   public static ebg a(ebg $$0, ebg $$1, dka $$2, iw $$3) {
      fgm $$4 = fgj.b($$0.g($$2, $$3), $$1.g($$2, $$3), ffw.c).a($$3);
      if ($$4.c()) {
         return $$1;
      } else {
         for (bwv $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = fgj.a(jc.a.b, $$6.cR().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.c(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static fgm a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return fgj.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static fgm[] a(int $$0, IntFunction<fgm> $$1) {
      return IntStream.rangeClosed(0, $$0).mapToObj($$1).toArray(fgm[]::new);
   }

   public static fgm a(double $$0) {
      return a($$0, $$0, $$0);
   }

   public static fgm a(double $$0, double $$1, double $$2) {
      double $$3 = $$1 / 2.0;
      return a($$0, $$2, 8.0 - $$3, 8.0 + $$3);
   }

   public static fgm b(double $$0, double $$1, double $$2) {
      return a($$0, $$0, $$1, $$2);
   }

   public static fgm a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$0 / 2.0;
      double $$5 = $$1 / 2.0;
      return a(8.0 - $$4, $$2, 8.0 - $$5, 8.0 + $$4, $$3, 8.0 + $$5);
   }

   public static fgm c(double $$0, double $$1, double $$2) {
      return b($$0, $$0, $$1, $$2);
   }

   public static fgm b(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$1 / 2.0;
      return a($$0, 8.0 - $$4, 8.0 + $$4, $$2, $$3);
   }

   public static fgm a(double $$0, double $$1, double $$2, double $$3, double $$4) {
      double $$5 = $$0 / 2.0;
      return a(8.0 - $$5, $$1, $$3, 8.0 + $$5, $$2, $$4);
   }

   public static ebg b(ebg $$0, dka $$1, iw $$2) {
      ebg $$3 = $$0;
      iw.a $$4 = new iw.a();

      for (jc $$5 : E) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$1, $$1, $$2, $$5, $$4, $$1.a_($$4), $$1.G_());
      }

      return $$3;
   }

   public static void a(ebg $$0, ebg $$1, dka $$2, iw $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(ebg $$0, ebg $$1, dka $$2, iw $$3, int $$4, int $$5) {
      if ($$1 != $$0) {
         if ($$1.l()) {
            if (!$$2.A_()) {
               $$2.a($$3, ($$4 & 32) == 0, null, $$5);
            }
         } else {
            $$2.a($$3, $$1, $$4 & -33, $$5);
         }
      }
   }

   public dne(ebf.d $$0) {
      super($$0);
      ebh.a<dne, ebg> $$1 = new ebh.a<>(this);
      this.a($$1);
      this.C = $$1.a(dne::m, ebg::new);
      this.l(this.C.b());
      if (ac.aU) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean k(ebg $$0) {
      return $$0.b() instanceof dru || $$0.a(dng.iy) || $$0.a(dng.ev) || $$0.a(dng.ew) || $$0.a(dng.fs) || $$0.a(dng.fr) || $$0.a(axg.am);
   }

   public static boolean a(ebg $$0, ebg $$1, jc $$2) {
      fgm $$3 = $$1.a($$2.g());
      if ($$3 == fgj.b()) {
         return false;
      } else if ($$0.a($$1, $$2)) {
         return false;
      } else if ($$3 == fgj.a()) {
         return true;
      } else {
         fgm $$4 = $$0.a($$2);
         if ($$4 == fgj.a()) {
            return true;
         } else {
            dne.a $$5 = new dne.a($$4, $$3);
            Object2ByteLinkedOpenHashMap<dne.a> $$6 = g.get();
            byte $$7 = $$6.getAndMoveToFirst($$5);
            if ($$7 != 127) {
               return $$7 != 0;
            } else {
               boolean $$8 = fgj.c($$4, $$3, ffw.e);
               if ($$6.size() == 256) {
                  $$6.removeLastByte();
               }

               $$6.putAndMoveToFirst($$5, (byte)($$8 ? 1 : 0));
               return $$8;
            }
         }
      }
   }

   public static boolean c(djd $$0, iw $$1) {
      return $$0.a_($$1).a($$0, $$1, jc.b, dvp.c);
   }

   public static boolean a(dkc $$0, iw $$1, jc $$2) {
      ebg $$3 = $$0.a_($$1);
      return $$2 == jc.a && $$3.a(axg.bb) ? false : $$3.a($$0, $$1, $$2, dvp.b);
   }

   public static boolean a(fgm $$0, jc $$1) {
      fgm $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(fgm $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(ebg $$0, djz $$1, iw $$2, azz $$3) {
   }

   public void a(dka $$0, iw $$1, ebg $$2) {
   }

   public static List<daa> a(ebg $$0, aru $$1, iw $$2, @Nullable dye $$3) {
      fam.a $$4 = new fam.a($$1).a(fdd.f, ffs.b($$2)).a(fdd.i, daa.k).b(fdd.h, $$3);
      return $$0.a($$4);
   }

   public static List<daa> a(ebg $$0, aru $$1, iw $$2, @Nullable dye $$3, @Nullable bwv $$4, daa $$5) {
      fam.a $$6 = new fam.a($$1).a(fdd.f, ffs.b($$2)).a(fdd.i, $$5).b(fdd.a, $$4).b(fdd.h, $$3);
      return $$0.a($$6);
   }

   public static void c(ebg $$0, djz $$1, iw $$2) {
      if ($$1 instanceof aru) {
         a($$0, (aru)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((aru)$$1, $$2, daa.k, true);
      }
   }

   public static void a(ebg $$0, dka $$1, iw $$2, @Nullable dye $$3) {
      if ($$1 instanceof aru) {
         a($$0, (aru)$$1, $$2, $$3).forEach($$2x -> a((djz)((aru)$$1), $$2, $$2x));
         $$0.a((aru)$$1, $$2, daa.k, true);
      }
   }

   public static void a(ebg $$0, djz $$1, iw $$2, @Nullable dye $$3, @Nullable bwv $$4, daa $$5) {
      if ($$1 instanceof aru) {
         a($$0, (aru)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((aru)$$1, $$2, $$5, true);
      }
   }

   public static void a(djz $$0, iw $$1, daa $$2) {
      double $$3 = (double)bxe.ar.m() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + azq.a($$0.A, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + azq.a($$0.A, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + azq.a($$0.A, -0.25, 0.25);
      a($$0, () -> new coe($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(djz $$0, iw $$1, jc $$2, daa $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bxe.ar.l() / 2.0;
      double $$8 = (double)bxe.ar.m() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? azq.a($$0.A, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? azq.a($$0.A, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? azq.a($$0.A, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? azq.a($$0.A, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? azq.a($$0.A, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? azq.a($$0.A, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new coe($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(djz $$0, Supplier<coe> $$1, daa $$2) {
      if ($$0 instanceof aru $$3 && !$$2.f() && $$3.O().c(djv.i)) {
         coe $$5 = $$1.get();
         $$5.j();
         $$0.b($$5);
         return;
      }
   }

   protected void a(aru $$0, iw $$1, int $$2) {
      if ($$0.O().c(djv.i)) {
         bxj.a($$0, ffs.b($$1), $$2);
      }
   }

   public float e() {
      return this.G;
   }

   public void a(aru $$0, iw $$1, djs $$2) {
   }

   public void a(djz $$0, iw $$1, ebg $$2, bwv $$3) {
   }

   @Nullable
   public ebg a(ddt $$0) {
      return this.m();
   }

   public void a(djz $$0, crz $$1, iw $$2, ebg $$3, @Nullable dye $$4, daa $$5) {
      $$1.b(axb.a.b(this));
      $$1.G(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(djz $$0, iw $$1, ebg $$2, @Nullable bxw $$3, daa $$4) {
   }

   public boolean a(ebg $$0) {
      return !$$0.e() && !$$0.n();
   }

   public xq f() {
      return xc.c(this.v());
   }

   public void a(djz $$0, ebg $$1, iw $$2, bwv $$3, double $$4) {
      $$3.a($$4, 1.0F, $$3.dW().l());
   }

   public void a(djd $$0, bwv $$1) {
      $$1.i($$1.dy().d(1.0, 0.0, 1.0));
   }

   public float g() {
      return this.J;
   }

   public float i() {
      return this.K;
   }

   public float j() {
      return this.L;
   }

   protected void a(djz $$0, crz $$1, iw $$2, ebg $$3) {
      $$0.a($$1, 2001, $$2, j($$3));
   }

   public ebg a(djz $$0, iw $$1, ebg $$2, crz $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(axg.aY) && $$0 instanceof aru $$4) {
         cqp.a($$4, $$3, false);
      }

      $$0.a(egg.f, $$1, egg.a.a($$3, $$2));
      return $$2;
   }

   public void a(ebg $$0, djz $$1, iw $$2, dlc.c $$3) {
   }

   public boolean a(djs $$0) {
      return true;
   }

   protected void a(ebh.a<dne, ebg> $$0) {
   }

   public ebh<dne, ebg> l() {
      return this.C;
   }

   protected final void l(ebg $$0) {
      this.d = $$0;
   }

   public final ebg m() {
      return this.d;
   }

   public final ebg m(ebg $$0) {
      ebg $$1 = this.m();

      for (ecj<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> ebg a(ebg $$0, ebg $$1, ecj<T> $$2) {
      return $$1.b($$2, $$0.c($$2));
   }

   @Override
   public czw h() {
      if (this.e == null) {
         this.e = czw.a(this);
      }

      return this.e;
   }

   public boolean n() {
      return this.M;
   }

   @Override
   public String toString() {
      return "Block{" + mh.e.e(this).g() + "}";
   }

   @Override
   protected dne o() {
      return this;
   }

   protected Function<ebg, fgm> a(Function<ebg, fgm> $$0) {
      return this.C.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0))::get;
   }

   protected Function<ebg, fgm> a(Function<ebg, fgm> $$0, ecj<?>... $$1) {
      Map<? extends ecj<?>, Object> $$2 = Arrays.stream($$1).collect(Collectors.toMap($$0x -> $$0x, $$0x -> $$0x.a().getFirst()));
      ImmutableMap<ebg, fgm> $$3 = this.C
         .a()
         .stream()
         .filter($$1x -> $$2.entrySet().stream().allMatch($$1xx -> $$1x.c((ecj)$$1xx.getKey()) == $$1xx.getValue()))
         .collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
      return $$2x -> {
         for (Entry<? extends ecj<?>, Object> $$3x : $$2.entrySet()) {
            $$2x = a($$2x, (ecj<?>)$$3x.getKey(), $$3x.getValue());
         }

         return (fgm)$$3.get($$2x);
      };
   }

   private static <S extends ebi<?, S>, T extends Comparable<T>> S a(S $$0, ecj<T> $$1, Object $$2) {
      return $$0.b($$1, (Comparable)$$2);
   }

   @Deprecated
   public jg.c<dne> p() {
      return this.b;
   }

   protected void a(aru $$0, iw $$1, daa $$2, bty $$3) {
      int $$4 = dgp.b($$0, $$2, $$3.a($$0.G_()));
      if ($$4 > 0) {
         this.a($$0, $$1, $$4);
      }
   }

   static record a(fgm a, fgm b) {
      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof dne.a $$1 && this.a == $$1.a && this.b == $$1.b) {
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
