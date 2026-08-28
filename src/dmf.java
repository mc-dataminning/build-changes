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

public class dmf extends eag implements diz {
   public static final MapCodec<dmf> j = b(dmf::new);
   private static final Logger a = LogUtils.getLogger();
   private final je.c<dmf> b = mf.e.f(this);
   public static final jk<eah> k = new jk<>();
   private static final LoadingCache<ffk, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<ffk, Boolean>() {
      public Boolean a(ffk $$0) {
         return !ffh.c(ffh.b(), $$0, feu.g);
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
   protected final eai<dmf, eah> C;
   private eah d;
   @Nullable
   private cyz e;
   private static final int f = 256;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dmf.a>> g = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dmf.a> $$0 = new Object2ByteLinkedOpenHashMap<dmf.a>(256, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends dmf> a() {
      return j;
   }

   public static int j(@Nullable eah $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = k.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static eah a(int $$0) {
      eah $$1 = k.a($$0);
      return $$1 == null ? dmh.a.m() : $$1;
   }

   public static dmf a(@Nullable cyz $$0) {
      return $$0 instanceof cxl ? ((cxl)$$0).c() : dmh.a;
   }

   public static eah a(eah $$0, eah $$1, djb $$2, iu $$3) {
      ffk $$4 = ffh.b($$0.g($$2, $$3), $$1.g($$2, $$3), feu.c).a($$3);
      if ($$4.c()) {
         return $$1;
      } else {
         for (bwf $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = ffh.a(ja.a.b, $$6.cR().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.c(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static ffk a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return ffh.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static ffk[] a(int $$0, IntFunction<ffk> $$1) {
      return IntStream.rangeClosed(0, $$0).mapToObj($$1).toArray(ffk[]::new);
   }

   public static ffk a(double $$0) {
      return a($$0, $$0, $$0);
   }

   public static ffk a(double $$0, double $$1, double $$2) {
      double $$3 = $$1 / 2.0;
      return a($$0, $$2, 8.0 - $$3, 8.0 + $$3);
   }

   public static ffk b(double $$0, double $$1, double $$2) {
      return a($$0, $$0, $$1, $$2);
   }

   public static ffk a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$0 / 2.0;
      double $$5 = $$1 / 2.0;
      return a(8.0 - $$4, $$2, 8.0 - $$5, 8.0 + $$4, $$3, 8.0 + $$5);
   }

   public static ffk c(double $$0, double $$1, double $$2) {
      return b($$0, $$0, $$1, $$2);
   }

   public static ffk b(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$1 / 2.0;
      return a($$0, 8.0 - $$4, 8.0 + $$4, $$2, $$3);
   }

   public static ffk a(double $$0, double $$1, double $$2, double $$3, double $$4) {
      double $$5 = $$0 / 2.0;
      return a(8.0 - $$5, $$1, $$3, 8.0 + $$5, $$2, $$4);
   }

   public static eah b(eah $$0, djb $$1, iu $$2) {
      eah $$3 = $$0;
      iu.a $$4 = new iu.a();

      for (ja $$5 : E) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$1, $$1, $$2, $$5, $$4, $$1.a_($$4), $$1.C_());
      }

      return $$3;
   }

   public static void a(eah $$0, eah $$1, djb $$2, iu $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(eah $$0, eah $$1, djb $$2, iu $$3, int $$4, int $$5) {
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

   public dmf(eag.d $$0) {
      super($$0);
      eai.a<dmf, eah> $$1 = new eai.a<>(this);
      this.a($$1);
      this.C = $$1.a(dmf::m, eah::new);
      this.l(this.C.b());
      if (ab.aU) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean k(eah $$0) {
      return $$0.b() instanceof dqv || $$0.a(dmh.iy) || $$0.a(dmh.ev) || $$0.a(dmh.ew) || $$0.a(dmh.fs) || $$0.a(dmh.fr) || $$0.a(axc.am);
   }

   public static boolean a(eah $$0, eah $$1, ja $$2) {
      ffk $$3 = $$1.a($$2.g());
      if ($$3 == ffh.b()) {
         return false;
      } else if ($$0.a($$1, $$2)) {
         return false;
      } else if ($$3 == ffh.a()) {
         return true;
      } else {
         ffk $$4 = $$0.a($$2);
         if ($$4 == ffh.a()) {
            return true;
         } else {
            dmf.a $$5 = new dmf.a($$4, $$3);
            Object2ByteLinkedOpenHashMap<dmf.a> $$6 = g.get();
            byte $$7 = $$6.getAndMoveToFirst($$5);
            if ($$7 != 127) {
               return $$7 != 0;
            } else {
               boolean $$8 = ffh.c($$4, $$3, feu.e);
               if ($$6.size() == 256) {
                  $$6.removeLastByte();
               }

               $$6.putAndMoveToFirst($$5, (byte)($$8 ? 1 : 0));
               return $$8;
            }
         }
      }
   }

   public static boolean c(dig $$0, iu $$1) {
      return $$0.a_($$1).a($$0, $$1, ja.b, duq.c);
   }

   public static boolean a(djd $$0, iu $$1, ja $$2) {
      eah $$3 = $$0.a_($$1);
      return $$2 == ja.a && $$3.a(axc.bb) ? false : $$3.a($$0, $$1, $$2, duq.b);
   }

   public static boolean a(ffk $$0, ja $$1) {
      ffk $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(ffk $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(eah $$0, dja $$1, iu $$2, azv $$3) {
   }

   public void a(djb $$0, iu $$1, eah $$2) {
   }

   public static List<czd> a(eah $$0, arq $$1, iu $$2, @Nullable dxf $$3) {
      ezk.a $$4 = new ezk.a($$1).a(fcb.f, feq.b($$2)).a(fcb.i, czd.k).b(fcb.h, $$3);
      return $$0.a($$4);
   }

   public static List<czd> a(eah $$0, arq $$1, iu $$2, @Nullable dxf $$3, @Nullable bwf $$4, czd $$5) {
      ezk.a $$6 = new ezk.a($$1).a(fcb.f, feq.b($$2)).a(fcb.i, $$5).b(fcb.a, $$4).b(fcb.h, $$3);
      return $$0.a($$6);
   }

   public static void c(eah $$0, dja $$1, iu $$2) {
      if ($$1 instanceof arq) {
         a($$0, (arq)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((arq)$$1, $$2, czd.k, true);
      }
   }

   public static void a(eah $$0, djb $$1, iu $$2, @Nullable dxf $$3) {
      if ($$1 instanceof arq) {
         a($$0, (arq)$$1, $$2, $$3).forEach($$2x -> a((dja)((arq)$$1), $$2, $$2x));
         $$0.a((arq)$$1, $$2, czd.k, true);
      }
   }

   public static void a(eah $$0, dja $$1, iu $$2, @Nullable dxf $$3, @Nullable bwf $$4, czd $$5) {
      if ($$1 instanceof arq) {
         a($$0, (arq)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((arq)$$1, $$2, $$5, true);
      }
   }

   public static void a(dja $$0, iu $$1, czd $$2) {
      double $$3 = (double)bwo.aq.m() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + azm.a($$0.A, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + azm.a($$0.A, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + azm.a($$0.A, -0.25, 0.25);
      a($$0, () -> new cnh($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(dja $$0, iu $$1, ja $$2, czd $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bwo.aq.l() / 2.0;
      double $$8 = (double)bwo.aq.m() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? azm.a($$0.A, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? azm.a($$0.A, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? azm.a($$0.A, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? azm.a($$0.A, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? azm.a($$0.A, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? azm.a($$0.A, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new cnh($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(dja $$0, Supplier<cnh> $$1, czd $$2) {
      if ($$0 instanceof arq $$3 && !$$2.f() && $$3.O().c(diw.i)) {
         cnh $$5 = $$1.get();
         $$5.j();
         $$0.b($$5);
         return;
      }
   }

   protected void a(arq $$0, iu $$1, int $$2) {
      if ($$0.O().c(diw.i)) {
         bwt.a($$0, feq.b($$1), $$2);
      }
   }

   public float e() {
      return this.G;
   }

   public void a(arq $$0, iu $$1, dit $$2) {
   }

   public void a(dja $$0, iu $$1, eah $$2, bwf $$3) {
   }

   @Nullable
   public eah a(dcw $$0) {
      return this.m();
   }

   public void a(dja $$0, crc $$1, iu $$2, eah $$3, @Nullable dxf $$4, czd $$5) {
      $$1.b(awx.a.b(this));
      $$1.G(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(dja $$0, iu $$1, eah $$2, @Nullable bxe $$3, czd $$4) {
   }

   public boolean a(eah $$0) {
      return !$$0.e() && !$$0.n();
   }

   public xm f() {
      return wy.c(this.v());
   }

   public void a(dja $$0, eah $$1, iu $$2, bwf $$3, double $$4) {
      $$3.a($$4, 1.0F, $$3.dW().l());
   }

   public void a(dig $$0, bwf $$1) {
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

   protected void a(dja $$0, crc $$1, iu $$2, eah $$3) {
      $$0.a($$1, 2001, $$2, j($$3));
   }

   public eah a(dja $$0, iu $$1, eah $$2, crc $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(axc.aY) && $$0 instanceof arq $$4) {
         cps.a($$4, $$3, false);
      }

      $$0.a(efh.f, $$1, efh.a.a($$3, $$2));
      return $$2;
   }

   public void a(eah $$0, dja $$1, iu $$2, dkd.c $$3) {
   }

   public boolean a(dit $$0) {
      return true;
   }

   protected void a(eai.a<dmf, eah> $$0) {
   }

   public eai<dmf, eah> l() {
      return this.C;
   }

   protected final void l(eah $$0) {
      this.d = $$0;
   }

   public final eah m() {
      return this.d;
   }

   public final eah m(eah $$0) {
      eah $$1 = this.m();

      for (ebk<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> eah a(eah $$0, eah $$1, ebk<T> $$2) {
      return $$1.b($$2, $$0.c($$2));
   }

   @Override
   public cyz h() {
      if (this.e == null) {
         this.e = cyz.a(this);
      }

      return this.e;
   }

   public boolean n() {
      return this.M;
   }

   @Override
   public String toString() {
      return "Block{" + mf.e.e(this).g() + "}";
   }

   @Override
   protected dmf o() {
      return this;
   }

   protected Function<eah, ffk> a(Function<eah, ffk> $$0) {
      return this.C.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0))::get;
   }

   protected Function<eah, ffk> a(Function<eah, ffk> $$0, ebk<?>... $$1) {
      Map<? extends ebk<?>, Object> $$2 = Arrays.stream($$1).collect(Collectors.toMap($$0x -> $$0x, $$0x -> $$0x.a().getFirst()));
      ImmutableMap<eah, ffk> $$3 = this.C
         .a()
         .stream()
         .filter($$1x -> $$2.entrySet().stream().allMatch($$1xx -> $$1x.c((ebk)$$1xx.getKey()) == $$1xx.getValue()))
         .collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
      return $$2x -> {
         for (Entry<? extends ebk<?>, Object> $$3x : $$2.entrySet()) {
            $$2x = a($$2x, (ebk<?>)$$3x.getKey(), $$3x.getValue());
         }

         return (ffk)$$3.get($$2x);
      };
   }

   private static <S extends eaj<?, S>, T extends Comparable<T>> S a(S $$0, ebk<T> $$1, Object $$2) {
      return $$0.b($$1, (Comparable)$$2);
   }

   @Deprecated
   public je.c<dmf> p() {
      return this.b;
   }

   protected void a(arq $$0, iu $$1, czd $$2, bti $$3) {
      int $$4 = dfs.b($$0, $$2, $$3.a($$0.C_()));
      if ($$4 > 0) {
         this.a($$0, $$1, $$4);
      }
   }

   static record a(ffk a, ffk b) {
      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof dmf.a $$1 && this.a == $$1.a && this.b == $$1.b) {
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
