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

public class dlu extends dzn implements dio {
   public static final MapCodec<dlu> j = b(dlu::new);
   private static final Logger a = LogUtils.getLogger();
   private final je.c<dlu> b = mf.e.f(this);
   public static final jk<dzo> k = new jk<>();
   private static final LoadingCache<feq, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<feq, Boolean>() {
      public Boolean a(feq $$0) {
         return !fen.c(fen.b(), $$0, fea.g);
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
   protected final dzp<dlu, dzo> B;
   private dzo d;
   @Nullable
   private cyo e;
   private static final int f = 256;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dlu.a>> g = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dlu.a> $$0 = new Object2ByteLinkedOpenHashMap<dlu.a>(256, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends dlu> a() {
      return j;
   }

   public static int j(@Nullable dzo $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = k.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dzo a(int $$0) {
      dzo $$1 = k.a($$0);
      return $$1 == null ? dlw.a.m() : $$1;
   }

   public static dlu a(@Nullable cyo $$0) {
      return $$0 instanceof cxa ? ((cxa)$$0).c() : dlw.a;
   }

   public static dzo a(dzo $$0, dzo $$1, diq $$2, iu $$3) {
      feq $$4 = fen.b($$0.g($$2, $$3), $$1.g($$2, $$3), fea.c).a($$3);
      if ($$4.c()) {
         return $$1;
      } else {
         for (bwa $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = fen.a(ja.a.b, $$6.cR().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static feq a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return fen.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static feq[] a(int $$0, IntFunction<feq> $$1) {
      return IntStream.rangeClosed(0, $$0).mapToObj($$1).toArray(feq[]::new);
   }

   public static feq a(double $$0) {
      return a($$0, $$0, $$0);
   }

   public static feq a(double $$0, double $$1, double $$2) {
      double $$3 = $$1 / 2.0;
      return a($$0, $$2, 8.0 - $$3, 8.0 + $$3);
   }

   public static feq b(double $$0, double $$1, double $$2) {
      return a($$0, $$0, $$1, $$2);
   }

   public static feq a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$0 / 2.0;
      double $$5 = $$1 / 2.0;
      return a(8.0 - $$4, $$2, 8.0 - $$5, 8.0 + $$4, $$3, 8.0 + $$5);
   }

   public static feq c(double $$0, double $$1, double $$2) {
      return b($$0, $$0, $$1, $$2);
   }

   public static feq b(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$1 / 2.0;
      return a($$0, 8.0 - $$4, 8.0 + $$4, $$2, $$3);
   }

   public static feq a(double $$0, double $$1, double $$2, double $$3, double $$4) {
      double $$5 = $$0 / 2.0;
      return a(8.0 - $$5, $$1, $$3, 8.0 + $$5, $$2, $$4);
   }

   public static dzo b(dzo $$0, diq $$1, iu $$2) {
      dzo $$3 = $$0;
      iu.a $$4 = new iu.a();

      for (ja $$5 : D) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$1, $$1, $$2, $$5, $$4, $$1.a_($$4), $$1.C_());
      }

      return $$3;
   }

   public static void a(dzo $$0, dzo $$1, diq $$2, iu $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dzo $$0, dzo $$1, diq $$2, iu $$3, int $$4, int $$5) {
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

   public dlu(dzn.d $$0) {
      super($$0);
      dzp.a<dlu, dzo> $$1 = new dzp.a<>(this);
      this.a($$1);
      this.B = $$1.a(dlu::m, dzo::new);
      this.l(this.B.b());
      if (ab.aU) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean k(dzo $$0) {
      return $$0.b() instanceof dqi || $$0.a(dlw.iu) || $$0.a(dlw.er) || $$0.a(dlw.es) || $$0.a(dlw.fo) || $$0.a(dlw.fn) || $$0.a(axa.am);
   }

   public static boolean a(dzo $$0, dzo $$1, ja $$2) {
      feq $$3 = $$1.a($$2.g());
      if ($$3 == fen.b()) {
         return false;
      } else if ($$0.a($$1, $$2)) {
         return false;
      } else if ($$3 == fen.a()) {
         return true;
      } else {
         feq $$4 = $$0.a($$2);
         if ($$4 == fen.a()) {
            return true;
         } else {
            dlu.a $$5 = new dlu.a($$4, $$3);
            Object2ByteLinkedOpenHashMap<dlu.a> $$6 = g.get();
            byte $$7 = $$6.getAndMoveToFirst($$5);
            if ($$7 != 127) {
               return $$7 != 0;
            } else {
               boolean $$8 = fen.c($$4, $$3, fea.e);
               if ($$6.size() == 256) {
                  $$6.removeLastByte();
               }

               $$6.putAndMoveToFirst($$5, (byte)($$8 ? 1 : 0));
               return $$8;
            }
         }
      }
   }

   public static boolean c(dhv $$0, iu $$1) {
      return $$0.a_($$1).a($$0, $$1, ja.b, dub.c);
   }

   public static boolean a(dis $$0, iu $$1, ja $$2) {
      dzo $$3 = $$0.a_($$1);
      return $$2 == ja.a && $$3.a(axa.bb) ? false : $$3.a($$0, $$1, $$2, dub.b);
   }

   public static boolean a(feq $$0, ja $$1) {
      feq $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(feq $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(dzo $$0, dip $$1, iu $$2, azt $$3) {
   }

   public void a(diq $$0, iu $$1, dzo $$2) {
   }

   public static List<cys> a(dzo $$0, aro $$1, iu $$2, @Nullable dwn $$3) {
      eyq.a $$4 = new eyq.a($$1).a(fbh.f, fdw.b($$2)).a(fbh.i, cys.k).b(fbh.h, $$3);
      return $$0.a($$4);
   }

   public static List<cys> a(dzo $$0, aro $$1, iu $$2, @Nullable dwn $$3, @Nullable bwa $$4, cys $$5) {
      eyq.a $$6 = new eyq.a($$1).a(fbh.f, fdw.b($$2)).a(fbh.i, $$5).b(fbh.a, $$4).b(fbh.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dzo $$0, dip $$1, iu $$2) {
      if ($$1 instanceof aro) {
         a($$0, (aro)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((aro)$$1, $$2, cys.k, true);
      }
   }

   public static void a(dzo $$0, diq $$1, iu $$2, @Nullable dwn $$3) {
      if ($$1 instanceof aro) {
         a($$0, (aro)$$1, $$2, $$3).forEach($$2x -> a((dip)((aro)$$1), $$2, $$2x));
         $$0.a((aro)$$1, $$2, cys.k, true);
      }
   }

   public static void a(dzo $$0, dip $$1, iu $$2, @Nullable dwn $$3, @Nullable bwa $$4, cys $$5) {
      if ($$1 instanceof aro) {
         a($$0, (aro)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((aro)$$1, $$2, $$5, true);
      }
   }

   public static void a(dip $$0, iu $$1, cys $$2) {
      double $$3 = (double)bwj.aq.m() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + azk.a($$0.A, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + azk.a($$0.A, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + azk.a($$0.A, -0.25, 0.25);
      a($$0, () -> new cmx($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(dip $$0, iu $$1, ja $$2, cys $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bwj.aq.l() / 2.0;
      double $$8 = (double)bwj.aq.m() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? azk.a($$0.A, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? azk.a($$0.A, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? azk.a($$0.A, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? azk.a($$0.A, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? azk.a($$0.A, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? azk.a($$0.A, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new cmx($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(dip $$0, Supplier<cmx> $$1, cys $$2) {
      if ($$0 instanceof aro $$3 && !$$2.f() && $$3.O().c(dil.h)) {
         cmx $$5 = $$1.get();
         $$5.j();
         $$0.b($$5);
         return;
      }
   }

   protected void a(aro $$0, iu $$1, int $$2) {
      if ($$0.O().c(dil.h)) {
         bwo.a($$0, fdw.b($$1), $$2);
      }
   }

   public float e() {
      return this.F;
   }

   public void a(aro $$0, iu $$1, dii $$2) {
   }

   public void a(dip $$0, iu $$1, dzo $$2, bwa $$3) {
   }

   @Nullable
   public dzo a(dcl $$0) {
      return this.m();
   }

   public void a(dip $$0, cqs $$1, iu $$2, dzo $$3, @Nullable dwn $$4, cys $$5) {
      $$1.b(awv.a.b(this));
      $$1.G(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(dip $$0, iu $$1, dzo $$2, @Nullable bwz $$3, cys $$4) {
   }

   public boolean a(dzo $$0) {
      return !$$0.e() && !$$0.n();
   }

   public xk f() {
      return ww.c(this.v());
   }

   public void a(dip $$0, dzo $$1, iu $$2, bwa $$3, double $$4) {
      $$3.a($$4, 1.0F, $$3.dW().l());
   }

   public void a(dhv $$0, bwa $$1) {
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

   protected void a(dip $$0, cqs $$1, iu $$2, dzo $$3) {
      $$0.a($$1, 2001, $$2, j($$3));
   }

   public dzo a(dip $$0, iu $$1, dzo $$2, cqs $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(axa.aY) && $$0 instanceof aro $$4) {
         cpi.a($$4, $$3, false);
      }

      $$0.a(eeo.f, $$1, eeo.a.a($$3, $$2));
      return $$2;
   }

   public void a(dzo $$0, dip $$1, iu $$2, djs.c $$3) {
   }

   public boolean a(dii $$0) {
      return true;
   }

   protected void a(dzp.a<dlu, dzo> $$0) {
   }

   public dzp<dlu, dzo> l() {
      return this.B;
   }

   protected final void l(dzo $$0) {
      this.d = $$0;
   }

   public final dzo m() {
      return this.d;
   }

   public final dzo m(dzo $$0) {
      dzo $$1 = this.m();

      for (ear<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dzo a(dzo $$0, dzo $$1, ear<T> $$2) {
      return $$1.b($$2, $$0.c($$2));
   }

   @Override
   public cyo h() {
      if (this.e == null) {
         this.e = cyo.a(this);
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
   protected dlu o() {
      return this;
   }

   protected Function<dzo, feq> a(Function<dzo, feq> $$0) {
      return this.B.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0))::get;
   }

   protected Function<dzo, feq> a(Function<dzo, feq> $$0, ear<?>... $$1) {
      Map<? extends ear<?>, Object> $$2 = Arrays.stream($$1).collect(Collectors.toMap($$0x -> $$0x, $$0x -> $$0x.a().getFirst()));
      ImmutableMap<dzo, feq> $$3 = this.B
         .a()
         .stream()
         .filter($$1x -> $$2.entrySet().stream().allMatch($$1xx -> $$1x.c((ear)$$1xx.getKey()) == $$1xx.getValue()))
         .collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
      return $$2x -> {
         for (Entry<? extends ear<?>, Object> $$3x : $$2.entrySet()) {
            $$2x = a($$2x, (ear<?>)$$3x.getKey(), $$3x.getValue());
         }

         return (feq)$$3.get($$2x);
      };
   }

   private static <S extends dzq<?, S>, T extends Comparable<T>> S a(S $$0, ear<T> $$1, Object $$2) {
      return $$0.b($$1, (Comparable)$$2);
   }

   @Deprecated
   public je.c<dlu> p() {
      return this.b;
   }

   protected void a(aro $$0, iu $$1, cys $$2, btd $$3) {
      int $$4 = dfh.b($$0, $$2, $$3.a($$0.C_()));
      if ($$4 > 0) {
         this.a($$0, $$1, $$4);
      }
   }

   static record a(feq a, feq b) {
      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof dlu.a $$1 && this.a == $$1.a && this.b == $$1.b) {
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
