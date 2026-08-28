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

public class dmm extends ean implements djg {
   public static final MapCodec<dmm> j = b(dmm::new);
   private static final Logger a = LogUtils.getLogger();
   private final jf.c<dmm> b = mg.e.f(this);
   public static final jl<eao> k = new jl<>();
   private static final LoadingCache<ffr, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<ffr, Boolean>() {
      public Boolean a(ffr $$0) {
         return !ffo.c(ffo.b(), $$0, ffb.g);
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
   protected final eap<dmm, eao> C;
   private eao d;
   @Nullable
   private czg e;
   private static final int f = 256;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dmm.a>> g = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dmm.a> $$0 = new Object2ByteLinkedOpenHashMap<dmm.a>(256, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends dmm> a() {
      return j;
   }

   public static int j(@Nullable eao $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = k.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static eao a(int $$0) {
      eao $$1 = k.a($$0);
      return $$1 == null ? dmo.a.m() : $$1;
   }

   public static dmm a(@Nullable czg $$0) {
      return $$0 instanceof cxs ? ((cxs)$$0).c() : dmo.a;
   }

   public static eao a(eao $$0, eao $$1, dji $$2, iv $$3) {
      ffr $$4 = ffo.b($$0.g($$2, $$3), $$1.g($$2, $$3), ffb.c).a($$3);
      if ($$4.c()) {
         return $$1;
      } else {
         for (bwi $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = ffo.a(jb.a.b, $$6.cQ().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.c(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static ffr a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return ffo.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static ffr[] a(int $$0, IntFunction<ffr> $$1) {
      return IntStream.rangeClosed(0, $$0).mapToObj($$1).toArray(ffr[]::new);
   }

   public static ffr a(double $$0) {
      return a($$0, $$0, $$0);
   }

   public static ffr a(double $$0, double $$1, double $$2) {
      double $$3 = $$1 / 2.0;
      return a($$0, $$2, 8.0 - $$3, 8.0 + $$3);
   }

   public static ffr b(double $$0, double $$1, double $$2) {
      return a($$0, $$0, $$1, $$2);
   }

   public static ffr a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$0 / 2.0;
      double $$5 = $$1 / 2.0;
      return a(8.0 - $$4, $$2, 8.0 - $$5, 8.0 + $$4, $$3, 8.0 + $$5);
   }

   public static ffr c(double $$0, double $$1, double $$2) {
      return b($$0, $$0, $$1, $$2);
   }

   public static ffr b(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$1 / 2.0;
      return a($$0, 8.0 - $$4, 8.0 + $$4, $$2, $$3);
   }

   public static ffr a(double $$0, double $$1, double $$2, double $$3, double $$4) {
      double $$5 = $$0 / 2.0;
      return a(8.0 - $$5, $$1, $$3, 8.0 + $$5, $$2, $$4);
   }

   public static eao b(eao $$0, dji $$1, iv $$2) {
      eao $$3 = $$0;
      iv.a $$4 = new iv.a();

      for (jb $$5 : E) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$1, $$1, $$2, $$5, $$4, $$1.a_($$4), $$1.C_());
      }

      return $$3;
   }

   public static void a(eao $$0, eao $$1, dji $$2, iv $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(eao $$0, eao $$1, dji $$2, iv $$3, int $$4, int $$5) {
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

   public dmm(ean.d $$0) {
      super($$0);
      eap.a<dmm, eao> $$1 = new eap.a<>(this);
      this.a($$1);
      this.C = $$1.a(dmm::m, eao::new);
      this.l(this.C.b());
      if (ac.aV) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean k(eao $$0) {
      return $$0.b() instanceof drc || $$0.a(dmo.iy) || $$0.a(dmo.ev) || $$0.a(dmo.ew) || $$0.a(dmo.fs) || $$0.a(dmo.fr) || $$0.a(axc.am);
   }

   public static boolean a(eao $$0, eao $$1, jb $$2) {
      ffr $$3 = $$1.a($$2.g());
      if ($$3 == ffo.b()) {
         return false;
      } else if ($$0.a($$1, $$2)) {
         return false;
      } else if ($$3 == ffo.a()) {
         return true;
      } else {
         ffr $$4 = $$0.a($$2);
         if ($$4 == ffo.a()) {
            return true;
         } else {
            dmm.a $$5 = new dmm.a($$4, $$3);
            Object2ByteLinkedOpenHashMap<dmm.a> $$6 = g.get();
            byte $$7 = $$6.getAndMoveToFirst($$5);
            if ($$7 != 127) {
               return $$7 != 0;
            } else {
               boolean $$8 = ffo.c($$4, $$3, ffb.e);
               if ($$6.size() == 256) {
                  $$6.removeLastByte();
               }

               $$6.putAndMoveToFirst($$5, (byte)($$8 ? 1 : 0));
               return $$8;
            }
         }
      }
   }

   public static boolean c(din $$0, iv $$1) {
      return $$0.a_($$1).a($$0, $$1, jb.b, dux.c);
   }

   public static boolean a(djk $$0, iv $$1, jb $$2) {
      eao $$3 = $$0.a_($$1);
      return $$2 == jb.a && $$3.a(axc.bb) ? false : $$3.a($$0, $$1, $$2, dux.b);
   }

   public static boolean a(ffr $$0, jb $$1) {
      ffr $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(ffr $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(eao $$0, djh $$1, iv $$2, azv $$3) {
   }

   public void a(dji $$0, iv $$1, eao $$2) {
   }

   public static List<czk> a(eao $$0, arq $$1, iv $$2, @Nullable dxm $$3) {
      ezr.a $$4 = new ezr.a($$1).a(fci.f, fex.b($$2)).a(fci.i, czk.k).b(fci.h, $$3);
      return $$0.a($$4);
   }

   public static List<czk> a(eao $$0, arq $$1, iv $$2, @Nullable dxm $$3, @Nullable bwi $$4, czk $$5) {
      ezr.a $$6 = new ezr.a($$1).a(fci.f, fex.b($$2)).a(fci.i, $$5).b(fci.a, $$4).b(fci.h, $$3);
      return $$0.a($$6);
   }

   public static void c(eao $$0, djh $$1, iv $$2) {
      if ($$1 instanceof arq) {
         a($$0, (arq)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((arq)$$1, $$2, czk.k, true);
      }
   }

   public static void a(eao $$0, dji $$1, iv $$2, @Nullable dxm $$3) {
      if ($$1 instanceof arq) {
         a($$0, (arq)$$1, $$2, $$3).forEach($$2x -> a((djh)((arq)$$1), $$2, $$2x));
         $$0.a((arq)$$1, $$2, czk.k, true);
      }
   }

   public static void a(eao $$0, djh $$1, iv $$2, @Nullable dxm $$3, @Nullable bwi $$4, czk $$5) {
      if ($$1 instanceof arq) {
         a($$0, (arq)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((arq)$$1, $$2, $$5, true);
      }
   }

   public static void a(djh $$0, iv $$1, czk $$2) {
      double $$3 = (double)bwr.aq.m() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + azm.a($$0.A, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + azm.a($$0.A, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + azm.a($$0.A, -0.25, 0.25);
      a($$0, () -> new cno($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(djh $$0, iv $$1, jb $$2, czk $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bwr.aq.l() / 2.0;
      double $$8 = (double)bwr.aq.m() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? azm.a($$0.A, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? azm.a($$0.A, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? azm.a($$0.A, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? azm.a($$0.A, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? azm.a($$0.A, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? azm.a($$0.A, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new cno($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(djh $$0, Supplier<cno> $$1, czk $$2) {
      if ($$0 instanceof arq $$3 && !$$2.f() && $$3.O().c(djd.i)) {
         cno $$5 = $$1.get();
         $$5.j();
         $$0.b($$5);
         return;
      }
   }

   protected void a(arq $$0, iv $$1, int $$2) {
      if ($$0.O().c(djd.i)) {
         bww.a($$0, fex.b($$1), $$2);
      }
   }

   public float e() {
      return this.G;
   }

   public void a(arq $$0, iv $$1, dja $$2) {
   }

   public void a(djh $$0, iv $$1, eao $$2, bwi $$3) {
   }

   @Nullable
   public eao a(ddd $$0) {
      return this.m();
   }

   public void a(djh $$0, crj $$1, iv $$2, eao $$3, @Nullable dxm $$4, czk $$5) {
      $$1.b(awx.a.b(this));
      $$1.G(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(djh $$0, iv $$1, eao $$2, @Nullable bxj $$3, czk $$4) {
   }

   public boolean a(eao $$0) {
      return !$$0.e() && !$$0.n();
   }

   public xm f() {
      return wy.c(this.v());
   }

   public void a(djh $$0, eao $$1, iv $$2, bwi $$3, double $$4) {
      $$3.a($$4, 1.0F, $$3.dV().l());
   }

   public void a(din $$0, bwi $$1) {
      $$1.i($$1.dx().d(1.0, 0.0, 1.0));
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

   protected void a(djh $$0, crj $$1, iv $$2, eao $$3) {
      $$0.a($$1, 2001, $$2, j($$3));
   }

   public eao a(djh $$0, iv $$1, eao $$2, crj $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(axc.aY) && $$0 instanceof arq $$4) {
         cpz.a($$4, $$3, false);
      }

      $$0.a(efo.f, $$1, efo.a.a($$3, $$2));
      return $$2;
   }

   public void a(eao $$0, djh $$1, iv $$2, dkk.c $$3) {
   }

   public boolean a(dja $$0) {
      return true;
   }

   protected void a(eap.a<dmm, eao> $$0) {
   }

   public eap<dmm, eao> l() {
      return this.C;
   }

   protected final void l(eao $$0) {
      this.d = $$0;
   }

   public final eao m() {
      return this.d;
   }

   public final eao m(eao $$0) {
      eao $$1 = this.m();

      for (ebr<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> eao a(eao $$0, eao $$1, ebr<T> $$2) {
      return $$1.b($$2, $$0.c($$2));
   }

   @Override
   public czg h() {
      if (this.e == null) {
         this.e = czg.a(this);
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
   protected dmm o() {
      return this;
   }

   protected Function<eao, ffr> a(Function<eao, ffr> $$0) {
      return this.C.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0))::get;
   }

   protected Function<eao, ffr> a(Function<eao, ffr> $$0, ebr<?>... $$1) {
      Map<? extends ebr<?>, Object> $$2 = Arrays.stream($$1).collect(Collectors.toMap($$0x -> $$0x, $$0x -> $$0x.a().getFirst()));
      ImmutableMap<eao, ffr> $$3 = this.C
         .a()
         .stream()
         .filter($$1x -> $$2.entrySet().stream().allMatch($$1xx -> $$1x.c((ebr)$$1xx.getKey()) == $$1xx.getValue()))
         .collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
      return $$2x -> {
         for (Entry<? extends ebr<?>, Object> $$3x : $$2.entrySet()) {
            $$2x = a($$2x, (ebr<?>)$$3x.getKey(), $$3x.getValue());
         }

         return (ffr)$$3.get($$2x);
      };
   }

   private static <S extends eaq<?, S>, T extends Comparable<T>> S a(S $$0, ebr<T> $$1, Object $$2) {
      return $$0.b($$1, (Comparable)$$2);
   }

   @Deprecated
   public jf.c<dmm> p() {
      return this.b;
   }

   protected void a(arq $$0, iv $$1, czk $$2, btl $$3) {
      int $$4 = dfz.b($$0, $$2, $$3.a($$0.C_()));
      if ($$4 > 0) {
         this.a($$0, $$1, $$4);
      }
   }

   static record a(ffr a, ffr b) {
      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof dmm.a $$1 && this.a == $$1.a && this.b == $$1.b) {
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
