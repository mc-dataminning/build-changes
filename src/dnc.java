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

public class dnc extends ebd implements djw {
   public static final MapCodec<dnc> j = b(dnc::new);
   private static final Logger a = LogUtils.getLogger();
   private final jf.c<dnc> b = mg.e.f(this);
   public static final jl<ebe> k = new jl<>();
   private static final LoadingCache<fgk, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<fgk, Boolean>() {
      public Boolean a(fgk $$0) {
         return !fgh.c(fgh.b(), $$0, ffu.g);
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
   protected final ebf<dnc, ebe> C;
   private ebe d;
   @Nullable
   private czu e;
   private static final int f = 256;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dnc.a>> g = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dnc.a> $$0 = new Object2ByteLinkedOpenHashMap<dnc.a>(256, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends dnc> a() {
      return j;
   }

   public static int j(@Nullable ebe $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = k.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static ebe a(int $$0) {
      ebe $$1 = k.a($$0);
      return $$1 == null ? dne.a.m() : $$1;
   }

   public static dnc a(@Nullable czu $$0) {
      return $$0 instanceof cyg ? ((cyg)$$0).c() : dne.a;
   }

   public static ebe a(ebe $$0, ebe $$1, djy $$2, iv $$3) {
      fgk $$4 = fgh.b($$0.g($$2, $$3), $$1.g($$2, $$3), ffu.c).a($$3);
      if ($$4.c()) {
         return $$1;
      } else {
         for (bwt $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = fgh.a(jb.a.b, $$6.cR().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.c(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static fgk a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return fgh.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static fgk[] a(int $$0, IntFunction<fgk> $$1) {
      return IntStream.rangeClosed(0, $$0).mapToObj($$1).toArray(fgk[]::new);
   }

   public static fgk a(double $$0) {
      return a($$0, $$0, $$0);
   }

   public static fgk a(double $$0, double $$1, double $$2) {
      double $$3 = $$1 / 2.0;
      return a($$0, $$2, 8.0 - $$3, 8.0 + $$3);
   }

   public static fgk b(double $$0, double $$1, double $$2) {
      return a($$0, $$0, $$1, $$2);
   }

   public static fgk a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$0 / 2.0;
      double $$5 = $$1 / 2.0;
      return a(8.0 - $$4, $$2, 8.0 - $$5, 8.0 + $$4, $$3, 8.0 + $$5);
   }

   public static fgk c(double $$0, double $$1, double $$2) {
      return b($$0, $$0, $$1, $$2);
   }

   public static fgk b(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$1 / 2.0;
      return a($$0, 8.0 - $$4, 8.0 + $$4, $$2, $$3);
   }

   public static fgk a(double $$0, double $$1, double $$2, double $$3, double $$4) {
      double $$5 = $$0 / 2.0;
      return a(8.0 - $$5, $$1, $$3, 8.0 + $$5, $$2, $$4);
   }

   public static ebe b(ebe $$0, djy $$1, iv $$2) {
      ebe $$3 = $$0;
      iv.a $$4 = new iv.a();

      for (jb $$5 : E) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$1, $$1, $$2, $$5, $$4, $$1.a_($$4), $$1.G_());
      }

      return $$3;
   }

   public static void a(ebe $$0, ebe $$1, djy $$2, iv $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(ebe $$0, ebe $$1, djy $$2, iv $$3, int $$4, int $$5) {
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

   public dnc(ebd.d $$0) {
      super($$0);
      ebf.a<dnc, ebe> $$1 = new ebf.a<>(this);
      this.a($$1);
      this.C = $$1.a(dnc::m, ebe::new);
      this.l(this.C.b());
      if (ac.aU) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean k(ebe $$0) {
      return $$0.b() instanceof drs || $$0.a(dne.iy) || $$0.a(dne.ev) || $$0.a(dne.ew) || $$0.a(dne.fs) || $$0.a(dne.fr) || $$0.a(axe.am);
   }

   public static boolean a(ebe $$0, ebe $$1, jb $$2) {
      fgk $$3 = $$1.a($$2.g());
      if ($$3 == fgh.b()) {
         return false;
      } else if ($$0.a($$1, $$2)) {
         return false;
      } else if ($$3 == fgh.a()) {
         return true;
      } else {
         fgk $$4 = $$0.a($$2);
         if ($$4 == fgh.a()) {
            return true;
         } else {
            dnc.a $$5 = new dnc.a($$4, $$3);
            Object2ByteLinkedOpenHashMap<dnc.a> $$6 = g.get();
            byte $$7 = $$6.getAndMoveToFirst($$5);
            if ($$7 != 127) {
               return $$7 != 0;
            } else {
               boolean $$8 = fgh.c($$4, $$3, ffu.e);
               if ($$6.size() == 256) {
                  $$6.removeLastByte();
               }

               $$6.putAndMoveToFirst($$5, (byte)($$8 ? 1 : 0));
               return $$8;
            }
         }
      }
   }

   public static boolean c(djb $$0, iv $$1) {
      return $$0.a_($$1).a($$0, $$1, jb.b, dvn.c);
   }

   public static boolean a(dka $$0, iv $$1, jb $$2) {
      ebe $$3 = $$0.a_($$1);
      return $$2 == jb.a && $$3.a(axe.bb) ? false : $$3.a($$0, $$1, $$2, dvn.b);
   }

   public static boolean a(fgk $$0, jb $$1) {
      fgk $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(fgk $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(ebe $$0, djx $$1, iv $$2, azx $$3) {
   }

   public void a(djy $$0, iv $$1, ebe $$2) {
   }

   public static List<czy> a(ebe $$0, ars $$1, iv $$2, @Nullable dyc $$3) {
      fak.a $$4 = new fak.a($$1).a(fdb.f, ffq.b($$2)).a(fdb.i, czy.k).b(fdb.h, $$3);
      return $$0.a($$4);
   }

   public static List<czy> a(ebe $$0, ars $$1, iv $$2, @Nullable dyc $$3, @Nullable bwt $$4, czy $$5) {
      fak.a $$6 = new fak.a($$1).a(fdb.f, ffq.b($$2)).a(fdb.i, $$5).b(fdb.a, $$4).b(fdb.h, $$3);
      return $$0.a($$6);
   }

   public static void c(ebe $$0, djx $$1, iv $$2) {
      if ($$1 instanceof ars) {
         a($$0, (ars)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((ars)$$1, $$2, czy.k, true);
      }
   }

   public static void a(ebe $$0, djy $$1, iv $$2, @Nullable dyc $$3) {
      if ($$1 instanceof ars) {
         a($$0, (ars)$$1, $$2, $$3).forEach($$2x -> a((djx)((ars)$$1), $$2, $$2x));
         $$0.a((ars)$$1, $$2, czy.k, true);
      }
   }

   public static void a(ebe $$0, djx $$1, iv $$2, @Nullable dyc $$3, @Nullable bwt $$4, czy $$5) {
      if ($$1 instanceof ars) {
         a($$0, (ars)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((ars)$$1, $$2, $$5, true);
      }
   }

   public static void a(djx $$0, iv $$1, czy $$2) {
      double $$3 = (double)bxc.ar.m() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + azo.a($$0.A, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + azo.a($$0.A, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + azo.a($$0.A, -0.25, 0.25);
      a($$0, () -> new coc($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(djx $$0, iv $$1, jb $$2, czy $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bxc.ar.l() / 2.0;
      double $$8 = (double)bxc.ar.m() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? azo.a($$0.A, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? azo.a($$0.A, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? azo.a($$0.A, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? azo.a($$0.A, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? azo.a($$0.A, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? azo.a($$0.A, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new coc($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(djx $$0, Supplier<coc> $$1, czy $$2) {
      if ($$0 instanceof ars $$3 && !$$2.f() && $$3.O().c(djt.i)) {
         coc $$5 = $$1.get();
         $$5.j();
         $$0.b($$5);
         return;
      }
   }

   protected void a(ars $$0, iv $$1, int $$2) {
      if ($$0.O().c(djt.i)) {
         bxh.a($$0, ffq.b($$1), $$2);
      }
   }

   public float e() {
      return this.G;
   }

   public void a(ars $$0, iv $$1, djq $$2) {
   }

   public void a(djx $$0, iv $$1, ebe $$2, bwt $$3) {
   }

   @Nullable
   public ebe a(ddr $$0) {
      return this.m();
   }

   public void a(djx $$0, crx $$1, iv $$2, ebe $$3, @Nullable dyc $$4, czy $$5) {
      $$1.b(awz.a.b(this));
      $$1.G(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(djx $$0, iv $$1, ebe $$2, @Nullable bxu $$3, czy $$4) {
   }

   public boolean a(ebe $$0) {
      return !$$0.e() && !$$0.n();
   }

   public xo f() {
      return xa.c(this.v());
   }

   public void a(djx $$0, ebe $$1, iv $$2, bwt $$3, double $$4) {
      $$3.a($$4, 1.0F, $$3.dW().l());
   }

   public void a(djb $$0, bwt $$1) {
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

   protected void a(djx $$0, crx $$1, iv $$2, ebe $$3) {
      $$0.a($$1, 2001, $$2, j($$3));
   }

   public ebe a(djx $$0, iv $$1, ebe $$2, crx $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(axe.aY) && $$0 instanceof ars $$4) {
         cqn.a($$4, $$3, false);
      }

      $$0.a(ege.f, $$1, ege.a.a($$3, $$2));
      return $$2;
   }

   public void a(ebe $$0, djx $$1, iv $$2, dla.c $$3) {
   }

   public boolean a(djq $$0) {
      return true;
   }

   protected void a(ebf.a<dnc, ebe> $$0) {
   }

   public ebf<dnc, ebe> l() {
      return this.C;
   }

   protected final void l(ebe $$0) {
      this.d = $$0;
   }

   public final ebe m() {
      return this.d;
   }

   public final ebe m(ebe $$0) {
      ebe $$1 = this.m();

      for (ech<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> ebe a(ebe $$0, ebe $$1, ech<T> $$2) {
      return $$1.b($$2, $$0.c($$2));
   }

   @Override
   public czu h() {
      if (this.e == null) {
         this.e = czu.a(this);
      }

      return this.e;
   }

   public boolean n() {
      return this.M;
   }

   @Override
   public String toString() {
      return "Block{" + mg.e.e(this).g() + "}";
   }

   @Override
   protected dnc o() {
      return this;
   }

   protected Function<ebe, fgk> a(Function<ebe, fgk> $$0) {
      return this.C.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0))::get;
   }

   protected Function<ebe, fgk> a(Function<ebe, fgk> $$0, ech<?>... $$1) {
      Map<? extends ech<?>, Object> $$2 = Arrays.stream($$1).collect(Collectors.toMap($$0x -> $$0x, $$0x -> $$0x.a().getFirst()));
      ImmutableMap<ebe, fgk> $$3 = this.C
         .a()
         .stream()
         .filter($$1x -> $$2.entrySet().stream().allMatch($$1xx -> $$1x.c((ech)$$1xx.getKey()) == $$1xx.getValue()))
         .collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
      return $$2x -> {
         for (Entry<? extends ech<?>, Object> $$3x : $$2.entrySet()) {
            $$2x = a($$2x, (ech<?>)$$3x.getKey(), $$3x.getValue());
         }

         return (fgk)$$3.get($$2x);
      };
   }

   private static <S extends ebg<?, S>, T extends Comparable<T>> S a(S $$0, ech<T> $$1, Object $$2) {
      return $$0.b($$1, (Comparable)$$2);
   }

   @Deprecated
   public jf.c<dnc> p() {
      return this.b;
   }

   protected void a(ars $$0, iv $$1, czy $$2, btw $$3) {
      int $$4 = dgn.b($$0, $$2, $$3.a($$0.G_()));
      if ($$4 > 0) {
         this.a($$0, $$1, $$4);
      }
   }

   static record a(fgk a, fgk b) {
      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof dnc.a $$1 && this.a == $$1.a && this.b == $$1.b) {
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
