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

public class dno extends ebp implements dki {
   public static final MapCodec<dno> j = b(dno::new);
   private static final Logger a = LogUtils.getLogger();
   private final jg.c<dno> b = mh.e.f(this);
   public static final jm<ebq> k = new jm<>();
   private static final LoadingCache<fgw, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<fgw, Boolean>() {
      public Boolean a(fgw $$0) {
         return !fgt.c(fgt.b(), $$0, fgg.g);
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
   protected final ebr<dno, ebq> C;
   private ebq d;
   @Nullable
   private dag e;
   private static final int f = 256;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dno.a>> g = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dno.a> $$0 = new Object2ByteLinkedOpenHashMap<dno.a>(256, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends dno> a() {
      return j;
   }

   public static int j(@Nullable ebq $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = k.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static ebq a(int $$0) {
      ebq $$1 = k.a($$0);
      return $$1 == null ? dnq.a.m() : $$1;
   }

   public static dno a(@Nullable dag $$0) {
      return $$0 instanceof cys ? ((cys)$$0).c() : dnq.a;
   }

   public static ebq a(ebq $$0, ebq $$1, dkk $$2, iw $$3) {
      fgw $$4 = fgt.b($$0.g($$2, $$3), $$1.g($$2, $$3), fgg.c).a($$3);
      if ($$4.c()) {
         return $$1;
      } else {
         for (bxe $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = fgt.a(jc.a.b, $$6.cR().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.c(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static fgw a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return fgt.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static fgw[] a(int $$0, IntFunction<fgw> $$1) {
      return IntStream.rangeClosed(0, $$0).mapToObj($$1).toArray(fgw[]::new);
   }

   public static fgw a(double $$0) {
      return a($$0, $$0, $$0);
   }

   public static fgw a(double $$0, double $$1, double $$2) {
      double $$3 = $$1 / 2.0;
      return a($$0, $$2, 8.0 - $$3, 8.0 + $$3);
   }

   public static fgw b(double $$0, double $$1, double $$2) {
      return a($$0, $$0, $$1, $$2);
   }

   public static fgw a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$0 / 2.0;
      double $$5 = $$1 / 2.0;
      return a(8.0 - $$4, $$2, 8.0 - $$5, 8.0 + $$4, $$3, 8.0 + $$5);
   }

   public static fgw c(double $$0, double $$1, double $$2) {
      return b($$0, $$0, $$1, $$2);
   }

   public static fgw b(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$1 / 2.0;
      return a($$0, 8.0 - $$4, 8.0 + $$4, $$2, $$3);
   }

   public static fgw a(double $$0, double $$1, double $$2, double $$3, double $$4) {
      double $$5 = $$0 / 2.0;
      return a(8.0 - $$5, $$1, $$3, 8.0 + $$5, $$2, $$4);
   }

   public static ebq b(ebq $$0, dkk $$1, iw $$2) {
      ebq $$3 = $$0;
      iw.a $$4 = new iw.a();

      for (jc $$5 : E) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$1, $$1, $$2, $$5, $$4, $$1.a_($$4), $$1.G_());
      }

      return $$3;
   }

   public static void a(ebq $$0, ebq $$1, dkk $$2, iw $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(ebq $$0, ebq $$1, dkk $$2, iw $$3, int $$4, int $$5) {
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

   public dno(ebp.d $$0) {
      super($$0);
      ebr.a<dno, ebq> $$1 = new ebr.a<>(this);
      this.a($$1);
      this.C = $$1.a(dno::m, ebq::new);
      this.l(this.C.b());
      if (ac.aU) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean k(ebq $$0) {
      return $$0.b() instanceof dse || $$0.a(dnq.iy) || $$0.a(dnq.ev) || $$0.a(dnq.ew) || $$0.a(dnq.fs) || $$0.a(dnq.fr) || $$0.a(axn.am);
   }

   public static boolean a(ebq $$0, ebq $$1, jc $$2) {
      fgw $$3 = $$1.a($$2.g());
      if ($$3 == fgt.b()) {
         return false;
      } else if ($$0.a($$1, $$2)) {
         return false;
      } else if ($$3 == fgt.a()) {
         return true;
      } else {
         fgw $$4 = $$0.a($$2);
         if ($$4 == fgt.a()) {
            return true;
         } else {
            dno.a $$5 = new dno.a($$4, $$3);
            Object2ByteLinkedOpenHashMap<dno.a> $$6 = g.get();
            byte $$7 = $$6.getAndMoveToFirst($$5);
            if ($$7 != 127) {
               return $$7 != 0;
            } else {
               boolean $$8 = fgt.c($$4, $$3, fgg.e);
               if ($$6.size() == 256) {
                  $$6.removeLastByte();
               }

               $$6.putAndMoveToFirst($$5, (byte)($$8 ? 1 : 0));
               return $$8;
            }
         }
      }
   }

   public static boolean c(djn $$0, iw $$1) {
      return $$0.a_($$1).a($$0, $$1, jc.b, dvz.c);
   }

   public static boolean a(dkm $$0, iw $$1, jc $$2) {
      ebq $$3 = $$0.a_($$1);
      return $$2 == jc.a && $$3.a(axn.bb) ? false : $$3.a($$0, $$1, $$2, dvz.b);
   }

   public static boolean a(fgw $$0, jc $$1) {
      fgw $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(fgw $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(ebq $$0, dkj $$1, iw $$2, bai $$3) {
   }

   public void a(dkk $$0, iw $$1, ebq $$2) {
   }

   public static List<dak> a(ebq $$0, asb $$1, iw $$2, @Nullable dyo $$3) {
      faw.a $$4 = new faw.a($$1).a(fdn.f, fgc.b($$2)).a(fdn.i, dak.l).b(fdn.h, $$3);
      return $$0.a($$4);
   }

   public static List<dak> a(ebq $$0, asb $$1, iw $$2, @Nullable dyo $$3, @Nullable bxe $$4, dak $$5) {
      faw.a $$6 = new faw.a($$1).a(fdn.f, fgc.b($$2)).a(fdn.i, $$5).b(fdn.a, $$4).b(fdn.h, $$3);
      return $$0.a($$6);
   }

   public static void c(ebq $$0, dkj $$1, iw $$2) {
      if ($$1 instanceof asb) {
         a($$0, (asb)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((asb)$$1, $$2, dak.l, true);
      }
   }

   public static void a(ebq $$0, dkk $$1, iw $$2, @Nullable dyo $$3) {
      if ($$1 instanceof asb) {
         a($$0, (asb)$$1, $$2, $$3).forEach($$2x -> a((dkj)((asb)$$1), $$2, $$2x));
         $$0.a((asb)$$1, $$2, dak.l, true);
      }
   }

   public static void a(ebq $$0, dkj $$1, iw $$2, @Nullable dyo $$3, @Nullable bxe $$4, dak $$5) {
      if ($$1 instanceof asb) {
         a($$0, (asb)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((asb)$$1, $$2, $$5, true);
      }
   }

   public static void a(dkj $$0, iw $$1, dak $$2) {
      double $$3 = (double)bxn.ar.m() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + azz.a($$0.A, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + azz.a($$0.A, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + azz.a($$0.A, -0.25, 0.25);
      a($$0, () -> new coo($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(dkj $$0, iw $$1, jc $$2, dak $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bxn.ar.l() / 2.0;
      double $$8 = (double)bxn.ar.m() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? azz.a($$0.A, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? azz.a($$0.A, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? azz.a($$0.A, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? azz.a($$0.A, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? azz.a($$0.A, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? azz.a($$0.A, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new coo($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(dkj $$0, Supplier<coo> $$1, dak $$2) {
      if ($$0 instanceof asb $$3 && !$$2.f() && $$3.O().c(dkf.i)) {
         coo $$5 = $$1.get();
         $$5.j();
         $$0.b($$5);
         return;
      }
   }

   protected void a(asb $$0, iw $$1, int $$2) {
      if ($$0.O().c(dkf.i)) {
         bxs.a($$0, fgc.b($$1), $$2);
      }
   }

   public float e() {
      return this.G;
   }

   public void a(asb $$0, iw $$1, dkc $$2) {
   }

   public void a(dkj $$0, iw $$1, ebq $$2, bxe $$3) {
   }

   @Nullable
   public ebq a(ded $$0) {
      return this.m();
   }

   public void a(dkj $$0, csi $$1, iw $$2, ebq $$3, @Nullable dyo $$4, dak $$5) {
      $$1.b(axi.a.b(this));
      $$1.G(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(dkj $$0, iw $$1, ebq $$2, @Nullable byf $$3, dak $$4) {
   }

   public boolean a(ebq $$0) {
      return !$$0.e() && !$$0.n();
   }

   public xu f() {
      return xg.c(this.v());
   }

   public void a(dkj $$0, ebq $$1, iw $$2, bxe $$3, double $$4) {
      $$3.a($$4, 1.0F, $$3.dW().l());
   }

   public void a(djn $$0, bxe $$1) {
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

   protected void a(dkj $$0, csi $$1, iw $$2, ebq $$3) {
      $$0.a($$1, 2001, $$2, j($$3));
   }

   public ebq a(dkj $$0, iw $$1, ebq $$2, csi $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(axn.aY) && $$0 instanceof asb $$4) {
         cqy.a($$4, $$3, false);
      }

      $$0.a(egq.f, $$1, egq.a.a($$3, $$2));
      return $$2;
   }

   public void a(ebq $$0, dkj $$1, iw $$2, dlm.c $$3) {
   }

   public boolean a(dkc $$0) {
      return true;
   }

   protected void a(ebr.a<dno, ebq> $$0) {
   }

   public ebr<dno, ebq> l() {
      return this.C;
   }

   protected final void l(ebq $$0) {
      this.d = $$0;
   }

   public final ebq m() {
      return this.d;
   }

   public final ebq m(ebq $$0) {
      ebq $$1 = this.m();

      for (ect<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> ebq a(ebq $$0, ebq $$1, ect<T> $$2) {
      return $$1.b($$2, $$0.c($$2));
   }

   @Override
   public dag h() {
      if (this.e == null) {
         this.e = dag.a(this);
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
   protected dno o() {
      return this;
   }

   protected Function<ebq, fgw> a(Function<ebq, fgw> $$0) {
      return this.C.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0))::get;
   }

   protected Function<ebq, fgw> a(Function<ebq, fgw> $$0, ect<?>... $$1) {
      Map<? extends ect<?>, Object> $$2 = Arrays.stream($$1).collect(Collectors.toMap($$0x -> $$0x, $$0x -> $$0x.a().getFirst()));
      ImmutableMap<ebq, fgw> $$3 = this.C
         .a()
         .stream()
         .filter($$1x -> $$2.entrySet().stream().allMatch($$1xx -> $$1x.c((ect)$$1xx.getKey()) == $$1xx.getValue()))
         .collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
      return $$2x -> {
         for (Entry<? extends ect<?>, Object> $$3x : $$2.entrySet()) {
            $$2x = a($$2x, (ect<?>)$$3x.getKey(), $$3x.getValue());
         }

         return (fgw)$$3.get($$2x);
      };
   }

   private static <S extends ebs<?, S>, T extends Comparable<T>> S a(S $$0, ect<T> $$1, Object $$2) {
      return $$0.b($$1, (Comparable)$$2);
   }

   @Deprecated
   public jg.c<dno> p() {
      return this.b;
   }

   protected void a(asb $$0, iw $$1, dak $$2, buh $$3) {
      int $$4 = dgz.b($$0, $$2, $$3.a($$0.G_()));
      if ($$4 > 0) {
         this.a($$0, $$1, $$4);
      }
   }

   static record a(fgw a, fgw b) {
      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof dno.a $$1 && this.a == $$1.a && this.b == $$1.b) {
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
