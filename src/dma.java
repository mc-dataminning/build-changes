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

public class dma extends dzy implements diu {
   public static final MapCodec<dma> j = b(dma::new);
   private static final Logger a = LogUtils.getLogger();
   private final je.c<dma> b = mf.e.f(this);
   public static final jk<dzz> k = new jk<>();
   private static final LoadingCache<ffc, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<ffc, Boolean>() {
      public Boolean a(ffc $$0) {
         return !fez.c(fez.b(), $$0, fem.g);
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
   protected final eaa<dma, dzz> B;
   private dzz d;
   @Nullable
   private cyu e;
   private static final int f = 256;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dma.a>> g = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dma.a> $$0 = new Object2ByteLinkedOpenHashMap<dma.a>(256, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends dma> a() {
      return j;
   }

   public static int j(@Nullable dzz $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = k.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dzz a(int $$0) {
      dzz $$1 = k.a($$0);
      return $$1 == null ? dmc.a.m() : $$1;
   }

   public static dma a(@Nullable cyu $$0) {
      return $$0 instanceof cxg ? ((cxg)$$0).c() : dmc.a;
   }

   public static dzz a(dzz $$0, dzz $$1, diw $$2, iu $$3) {
      ffc $$4 = fez.b($$0.g($$2, $$3), $$1.g($$2, $$3), fem.c).a($$3);
      if ($$4.c()) {
         return $$1;
      } else {
         for (bwd $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = fez.a(ja.a.b, $$6.cR().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static ffc a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return fez.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static ffc[] a(int $$0, IntFunction<ffc> $$1) {
      return IntStream.rangeClosed(0, $$0).mapToObj($$1).toArray(ffc[]::new);
   }

   public static ffc a(double $$0) {
      return a($$0, $$0, $$0);
   }

   public static ffc a(double $$0, double $$1, double $$2) {
      double $$3 = $$1 / 2.0;
      return a($$0, $$2, 8.0 - $$3, 8.0 + $$3);
   }

   public static ffc b(double $$0, double $$1, double $$2) {
      return a($$0, $$0, $$1, $$2);
   }

   public static ffc a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$0 / 2.0;
      double $$5 = $$1 / 2.0;
      return a(8.0 - $$4, $$2, 8.0 - $$5, 8.0 + $$4, $$3, 8.0 + $$5);
   }

   public static ffc c(double $$0, double $$1, double $$2) {
      return b($$0, $$0, $$1, $$2);
   }

   public static ffc b(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$1 / 2.0;
      return a($$0, 8.0 - $$4, 8.0 + $$4, $$2, $$3);
   }

   public static ffc a(double $$0, double $$1, double $$2, double $$3, double $$4) {
      double $$5 = $$0 / 2.0;
      return a(8.0 - $$5, $$1, $$3, 8.0 + $$5, $$2, $$4);
   }

   public static dzz b(dzz $$0, diw $$1, iu $$2) {
      dzz $$3 = $$0;
      iu.a $$4 = new iu.a();

      for (ja $$5 : D) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$1, $$1, $$2, $$5, $$4, $$1.a_($$4), $$1.C_());
      }

      return $$3;
   }

   public static void a(dzz $$0, dzz $$1, diw $$2, iu $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dzz $$0, dzz $$1, diw $$2, iu $$3, int $$4, int $$5) {
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

   public dma(dzy.d $$0) {
      super($$0);
      eaa.a<dma, dzz> $$1 = new eaa.a<>(this);
      this.a($$1);
      this.B = $$1.a(dma::m, dzz::new);
      this.l(this.B.b());
      if (ab.aU) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean k(dzz $$0) {
      return $$0.b() instanceof dqp || $$0.a(dmc.iv) || $$0.a(dmc.es) || $$0.a(dmc.et) || $$0.a(dmc.fp) || $$0.a(dmc.fo) || $$0.a(axc.am);
   }

   public static boolean a(dzz $$0, dzz $$1, ja $$2) {
      ffc $$3 = $$1.a($$2.g());
      if ($$3 == fez.b()) {
         return false;
      } else if ($$0.a($$1, $$2)) {
         return false;
      } else if ($$3 == fez.a()) {
         return true;
      } else {
         ffc $$4 = $$0.a($$2);
         if ($$4 == fez.a()) {
            return true;
         } else {
            dma.a $$5 = new dma.a($$4, $$3);
            Object2ByteLinkedOpenHashMap<dma.a> $$6 = g.get();
            byte $$7 = $$6.getAndMoveToFirst($$5);
            if ($$7 != 127) {
               return $$7 != 0;
            } else {
               boolean $$8 = fez.c($$4, $$3, fem.e);
               if ($$6.size() == 256) {
                  $$6.removeLastByte();
               }

               $$6.putAndMoveToFirst($$5, (byte)($$8 ? 1 : 0));
               return $$8;
            }
         }
      }
   }

   public static boolean c(dib $$0, iu $$1) {
      return $$0.a_($$1).a($$0, $$1, ja.b, duj.c);
   }

   public static boolean a(diy $$0, iu $$1, ja $$2) {
      dzz $$3 = $$0.a_($$1);
      return $$2 == ja.a && $$3.a(axc.bb) ? false : $$3.a($$0, $$1, $$2, duj.b);
   }

   public static boolean a(ffc $$0, ja $$1) {
      ffc $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(ffc $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(dzz $$0, div $$1, iu $$2, azv $$3) {
   }

   public void a(diw $$0, iu $$1, dzz $$2) {
   }

   public static List<cyy> a(dzz $$0, arq $$1, iu $$2, @Nullable dwx $$3) {
      ezc.a $$4 = new ezc.a($$1).a(fbt.f, fei.b($$2)).a(fbt.i, cyy.k).b(fbt.h, $$3);
      return $$0.a($$4);
   }

   public static List<cyy> a(dzz $$0, arq $$1, iu $$2, @Nullable dwx $$3, @Nullable bwd $$4, cyy $$5) {
      ezc.a $$6 = new ezc.a($$1).a(fbt.f, fei.b($$2)).a(fbt.i, $$5).b(fbt.a, $$4).b(fbt.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dzz $$0, div $$1, iu $$2) {
      if ($$1 instanceof arq) {
         a($$0, (arq)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((arq)$$1, $$2, cyy.k, true);
      }
   }

   public static void a(dzz $$0, diw $$1, iu $$2, @Nullable dwx $$3) {
      if ($$1 instanceof arq) {
         a($$0, (arq)$$1, $$2, $$3).forEach($$2x -> a((div)((arq)$$1), $$2, $$2x));
         $$0.a((arq)$$1, $$2, cyy.k, true);
      }
   }

   public static void a(dzz $$0, div $$1, iu $$2, @Nullable dwx $$3, @Nullable bwd $$4, cyy $$5) {
      if ($$1 instanceof arq) {
         a($$0, (arq)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((arq)$$1, $$2, $$5, true);
      }
   }

   public static void a(div $$0, iu $$1, cyy $$2) {
      double $$3 = (double)bwm.aq.m() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + azm.a($$0.A, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + azm.a($$0.A, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + azm.a($$0.A, -0.25, 0.25);
      a($$0, () -> new cnd($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(div $$0, iu $$1, ja $$2, cyy $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bwm.aq.l() / 2.0;
      double $$8 = (double)bwm.aq.m() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? azm.a($$0.A, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? azm.a($$0.A, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? azm.a($$0.A, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? azm.a($$0.A, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? azm.a($$0.A, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? azm.a($$0.A, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new cnd($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(div $$0, Supplier<cnd> $$1, cyy $$2) {
      if ($$0 instanceof arq $$3 && !$$2.f() && $$3.O().c(dir.h)) {
         cnd $$5 = $$1.get();
         $$5.j();
         $$0.b($$5);
         return;
      }
   }

   protected void a(arq $$0, iu $$1, int $$2) {
      if ($$0.O().c(dir.h)) {
         bwr.a($$0, fei.b($$1), $$2);
      }
   }

   public float e() {
      return this.F;
   }

   public void a(arq $$0, iu $$1, dio $$2) {
   }

   public void a(div $$0, iu $$1, dzz $$2, bwd $$3) {
   }

   @Nullable
   public dzz a(dcr $$0) {
      return this.m();
   }

   public void a(div $$0, cqy $$1, iu $$2, dzz $$3, @Nullable dwx $$4, cyy $$5) {
      $$1.b(awx.a.b(this));
      $$1.G(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(div $$0, iu $$1, dzz $$2, @Nullable bxc $$3, cyy $$4) {
   }

   public boolean a(dzz $$0) {
      return !$$0.e() && !$$0.n();
   }

   public xm f() {
      return wy.c(this.v());
   }

   public void a(div $$0, dzz $$1, iu $$2, bwd $$3, double $$4) {
      $$3.a($$4, 1.0F, $$3.dW().l());
   }

   public void a(dib $$0, bwd $$1) {
      $$1.i($$1.dy().d(1.0, 0.0, 1.0));
   }

   public float g() {
      return this.I;
   }

   public float i() {
      return this.J;
   }

   public float j() {
      return this.K;
   }

   protected void a(div $$0, cqy $$1, iu $$2, dzz $$3) {
      $$0.a($$1, 2001, $$2, j($$3));
   }

   public dzz a(div $$0, iu $$1, dzz $$2, cqy $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(axc.aY) && $$0 instanceof arq $$4) {
         cpo.a($$4, $$3, false);
      }

      $$0.a(eez.f, $$1, eez.a.a($$3, $$2));
      return $$2;
   }

   public void a(dzz $$0, div $$1, iu $$2, djy.c $$3) {
   }

   public boolean a(dio $$0) {
      return true;
   }

   protected void a(eaa.a<dma, dzz> $$0) {
   }

   public eaa<dma, dzz> l() {
      return this.B;
   }

   protected final void l(dzz $$0) {
      this.d = $$0;
   }

   public final dzz m() {
      return this.d;
   }

   public final dzz m(dzz $$0) {
      dzz $$1 = this.m();

      for (ebc<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dzz a(dzz $$0, dzz $$1, ebc<T> $$2) {
      return $$1.b($$2, $$0.c($$2));
   }

   @Override
   public cyu h() {
      if (this.e == null) {
         this.e = cyu.a(this);
      }

      return this.e;
   }

   public boolean n() {
      return this.L;
   }

   @Override
   public String toString() {
      return "Block{" + mf.e.e(this).g() + "}";
   }

   @Override
   protected dma o() {
      return this;
   }

   protected Function<dzz, ffc> a(Function<dzz, ffc> $$0) {
      return this.B.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0))::get;
   }

   protected Function<dzz, ffc> a(Function<dzz, ffc> $$0, ebc<?>... $$1) {
      Map<? extends ebc<?>, Object> $$2 = Arrays.stream($$1).collect(Collectors.toMap($$0x -> $$0x, $$0x -> $$0x.a().getFirst()));
      ImmutableMap<dzz, ffc> $$3 = this.B
         .a()
         .stream()
         .filter($$1x -> $$2.entrySet().stream().allMatch($$1xx -> $$1x.c((ebc)$$1xx.getKey()) == $$1xx.getValue()))
         .collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
      return $$2x -> {
         for (Entry<? extends ebc<?>, Object> $$3x : $$2.entrySet()) {
            $$2x = a($$2x, (ebc<?>)$$3x.getKey(), $$3x.getValue());
         }

         return (ffc)$$3.get($$2x);
      };
   }

   private static <S extends eab<?, S>, T extends Comparable<T>> S a(S $$0, ebc<T> $$1, Object $$2) {
      return $$0.b($$1, (Comparable)$$2);
   }

   @Deprecated
   public je.c<dma> p() {
      return this.b;
   }

   protected void a(arq $$0, iu $$1, cyy $$2, btg $$3) {
      int $$4 = dfn.b($$0, $$2, $$3.a($$0.C_()));
      if ($$4 > 0) {
         this.a($$0, $$1, $$4);
      }
   }

   static record a(ffc a, ffc b) {
      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof dma.a $$1 && this.a == $$1.a && this.b == $$1.b) {
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
