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

public class dke extends dxp implements dgy {
   public static final MapCodec<dke> j = b(dke::new);
   private static final Logger a = LogUtils.getLogger();
   private final jr.c<dke> b = mb.e.f(this);
   public static final jx<dxq> k = new jx<>();
   private static final LoadingCache<fcr, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<fcr, Boolean>() {
      public Boolean a(fcr $$0) {
         return !fco.c(fco.b(), $$0, fcb.g);
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
   protected final dxr<dke, dxq> B;
   private dxq d;
   @Nullable
   private cxd e;
   private static final int f = 256;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dke.a>> g = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dke.a> $$0 = new Object2ByteLinkedOpenHashMap<dke.a>(256, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends dke> a() {
      return j;
   }

   public static int j(@Nullable dxq $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = k.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dxq a(int $$0) {
      dxq $$1 = k.a($$0);
      return $$1 == null ? dkg.a.m() : $$1;
   }

   public static dke a(@Nullable cxd $$0) {
      return $$0 instanceof cvo ? ((cvo)$$0).d() : dkg.a;
   }

   public static dxq a(dxq $$0, dxq $$1, dha $$2, ji $$3) {
      fcr $$4 = fco.b($$0.g($$2, $$3), $$1.g($$2, $$3), fcb.c).a($$3);
      if ($$4.c()) {
         return $$1;
      } else {
         for (bva $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = fco.a(jn.a.b, $$6.cQ().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static fcr a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return fco.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static fcr[] a(int $$0, IntFunction<fcr> $$1) {
      return IntStream.rangeClosed(0, $$0).mapToObj($$1).toArray(fcr[]::new);
   }

   public static fcr a(double $$0) {
      return a($$0, $$0, $$0);
   }

   public static fcr a(double $$0, double $$1, double $$2) {
      double $$3 = $$1 / 2.0;
      return a($$0, $$2, 8.0 - $$3, 8.0 + $$3);
   }

   public static fcr b(double $$0, double $$1, double $$2) {
      return a($$0, $$0, $$1, $$2);
   }

   public static fcr a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$0 / 2.0;
      double $$5 = $$1 / 2.0;
      return a(8.0 - $$4, $$2, 8.0 - $$5, 8.0 + $$4, $$3, 8.0 + $$5);
   }

   public static fcr c(double $$0, double $$1, double $$2) {
      return b($$0, $$0, $$1, $$2);
   }

   public static fcr b(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$1 / 2.0;
      return a($$0, 8.0 - $$4, 8.0 + $$4, $$2, $$3);
   }

   public static fcr a(double $$0, double $$1, double $$2, double $$3, double $$4) {
      double $$5 = $$0 / 2.0;
      return a(8.0 - $$5, $$1, $$3, 8.0 + $$5, $$2, $$4);
   }

   public static dxq b(dxq $$0, dha $$1, ji $$2) {
      dxq $$3 = $$0;
      ji.a $$4 = new ji.a();

      for (jn $$5 : D) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$1, $$1, $$2, $$5, $$4, $$1.a_($$4), $$1.C_());
      }

      return $$3;
   }

   public static void a(dxq $$0, dxq $$1, dha $$2, ji $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dxq $$0, dxq $$1, dha $$2, ji $$3, int $$4, int $$5) {
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

   public dke(dxp.d $$0) {
      super($$0);
      dxr.a<dke, dxq> $$1 = new dxr.a<>(this);
      this.a($$1);
      this.B = $$1.a(dke::m, dxq::new);
      this.l(this.B.b());
      if (ab.aU) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean k(dxq $$0) {
      return $$0.b() instanceof dos || $$0.a(dkg.iu) || $$0.a(dkg.er) || $$0.a(dkg.es) || $$0.a(dkg.fo) || $$0.a(dkg.fn) || $$0.a(awp.am);
   }

   public static boolean a(dxq $$0, dxq $$1, jn $$2) {
      fcr $$3 = $$1.a($$2.g());
      if ($$3 == fco.b()) {
         return false;
      } else if ($$0.a($$1, $$2)) {
         return false;
      } else if ($$3 == fco.a()) {
         return true;
      } else {
         fcr $$4 = $$0.a($$2);
         if ($$4 == fco.a()) {
            return true;
         } else {
            dke.a $$5 = new dke.a($$4, $$3);
            Object2ByteLinkedOpenHashMap<dke.a> $$6 = g.get();
            byte $$7 = $$6.getAndMoveToFirst($$5);
            if ($$7 != 127) {
               return $$7 != 0;
            } else {
               boolean $$8 = fco.c($$4, $$3, fcb.e);
               if ($$6.size() == 256) {
                  $$6.removeLastByte();
               }

               $$6.putAndMoveToFirst($$5, (byte)($$8 ? 1 : 0));
               return $$8;
            }
         }
      }
   }

   public static boolean c(dgf $$0, ji $$1) {
      return $$0.a_($$1).a($$0, $$1, jn.b, dsl.c);
   }

   public static boolean a(dhc $$0, ji $$1, jn $$2) {
      dxq $$3 = $$0.a_($$1);
      return $$2 == jn.a && $$3.a(awp.bb) ? false : $$3.a($$0, $$1, $$2, dsl.b);
   }

   public static boolean a(fcr $$0, jn $$1) {
      fcr $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(fcr $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(dxq $$0, dgz $$1, ji $$2, azh $$3) {
   }

   public void a(dha $$0, ji $$1, dxq $$2) {
   }

   public static List<cxh> a(dxq $$0, ard $$1, ji $$2, @Nullable dus $$3) {
      ewr.a $$4 = new ewr.a($$1).a(ezi.f, fbx.b($$2)).a(ezi.i, cxh.k).b(ezi.h, $$3);
      return $$0.a($$4);
   }

   public static List<cxh> a(dxq $$0, ard $$1, ji $$2, @Nullable dus $$3, @Nullable bva $$4, cxh $$5) {
      ewr.a $$6 = new ewr.a($$1).a(ezi.f, fbx.b($$2)).a(ezi.i, $$5).b(ezi.a, $$4).b(ezi.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dxq $$0, dgz $$1, ji $$2) {
      if ($$1 instanceof ard) {
         a($$0, (ard)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((ard)$$1, $$2, cxh.k, true);
      }
   }

   public static void a(dxq $$0, dha $$1, ji $$2, @Nullable dus $$3) {
      if ($$1 instanceof ard) {
         a($$0, (ard)$$1, $$2, $$3).forEach($$2x -> a((dgz)((ard)$$1), $$2, $$2x));
         $$0.a((ard)$$1, $$2, cxh.k, true);
      }
   }

   public static void a(dxq $$0, dgz $$1, ji $$2, @Nullable dus $$3, @Nullable bva $$4, cxh $$5) {
      if ($$1 instanceof ard) {
         a($$0, (ard)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((ard)$$1, $$2, $$5, true);
      }
   }

   public static void a(dgz $$0, ji $$1, cxh $$2) {
      double $$3 = (double)bvi.aq.m() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + ayz.a($$0.A, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + ayz.a($$0.A, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + ayz.a($$0.A, -0.25, 0.25);
      a($$0, () -> new clw($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(dgz $$0, ji $$1, jn $$2, cxh $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bvi.aq.l() / 2.0;
      double $$8 = (double)bvi.aq.m() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? ayz.a($$0.A, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? ayz.a($$0.A, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? ayz.a($$0.A, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? ayz.a($$0.A, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? ayz.a($$0.A, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? ayz.a($$0.A, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new clw($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(dgz $$0, Supplier<clw> $$1, cxh $$2) {
      if ($$0 instanceof ard $$3 && !$$2.f() && $$3.O().b(dgv.h)) {
         clw $$5 = $$1.get();
         $$5.j();
         $$0.b($$5);
         return;
      }
   }

   protected void a(ard $$0, ji $$1, int $$2) {
      if ($$0.O().b(dgv.h)) {
         bvn.a($$0, fbx.b($$1), $$2);
      }
   }

   public float e() {
      return this.F;
   }

   public void a(ard $$0, ji $$1, dgs $$2) {
   }

   public void a(dgz $$0, ji $$1, dxq $$2, bva $$3) {
   }

   @Nullable
   public dxq a(dax $$0) {
      return this.m();
   }

   public void a(dgz $$0, cpr $$1, ji $$2, dxq $$3, @Nullable dus $$4, cxh $$5) {
      $$1.b(awk.a.b(this));
      $$1.H(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(dgz $$0, ji $$1, dxq $$2, @Nullable bvy $$3, cxh $$4) {
   }

   public boolean a(dxq $$0) {
      return !$$0.e() && !$$0.n();
   }

   public xd f() {
      return wp.c(this.v());
   }

   public void a(dgz $$0, dxq $$1, ji $$2, bva $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dV().l());
   }

   public void a(dgf $$0, bva $$1) {
      $$1.i($$1.dx().d(1.0, 0.0, 1.0));
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

   protected void a(dgz $$0, cpr $$1, ji $$2, dxq $$3) {
      $$0.a($$1, 2001, $$2, j($$3));
   }

   public dxq a(dgz $$0, ji $$1, dxq $$2, cpr $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(awp.aY) && $$0 instanceof ard $$4) {
         cog.a($$4, $$3, false);
      }

      $$0.a(ecp.f, $$1, ecp.a.a($$3, $$2));
      return $$2;
   }

   public void a(dxq $$0, dgz $$1, ji $$2, dic.c $$3) {
   }

   public boolean a(dgs $$0) {
      return true;
   }

   protected void a(dxr.a<dke, dxq> $$0) {
   }

   public dxr<dke, dxq> l() {
      return this.B;
   }

   protected final void l(dxq $$0) {
      this.d = $$0;
   }

   public final dxq m() {
      return this.d;
   }

   public final dxq m(dxq $$0) {
      dxq $$1 = this.m();

      for (dyt<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dxq a(dxq $$0, dxq $$1, dyt<T> $$2) {
      return $$1.b($$2, $$0.c($$2));
   }

   @Override
   public cxd i() {
      if (this.e == null) {
         this.e = cxd.a(this);
      }

      return this.e;
   }

   public boolean n() {
      return this.L;
   }

   @Override
   public String toString() {
      return "Block{" + mb.e.e(this).g() + "}";
   }

   public void a(cxh $$0, cxd.b $$1, List<wp> $$2, cyx $$3) {
   }

   @Override
   protected dke o() {
      return this;
   }

   protected Function<dxq, fcr> a(Function<dxq, fcr> $$0) {
      return this.B.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0))::get;
   }

   protected Function<dxq, fcr> a(Function<dxq, fcr> $$0, dyt<?>... $$1) {
      Map<? extends dyt<?>, Object> $$2 = Arrays.stream($$1).collect(Collectors.toMap($$0x -> $$0x, $$0x -> $$0x.a().getFirst()));
      ImmutableMap<dxq, fcr> $$3 = this.B
         .a()
         .stream()
         .filter($$1x -> $$2.entrySet().stream().allMatch($$1xx -> $$1x.c((dyt)$$1xx.getKey()) == $$1xx.getValue()))
         .collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
      return $$2x -> {
         for (Entry<? extends dyt<?>, Object> $$3x : $$2.entrySet()) {
            $$2x = a($$2x, (dyt<?>)$$3x.getKey(), $$3x.getValue());
         }

         return (fcr)$$3.get($$2x);
      };
   }

   private static <S extends dxs<?, S>, T extends Comparable<T>> S a(S $$0, dyt<T> $$1, Object $$2) {
      return $$0.b($$1, (Comparable)$$2);
   }

   @Deprecated
   public jr.c<dke> p() {
      return this.b;
   }

   protected void a(ard $$0, ji $$1, cxh $$2, bsd $$3) {
      int $$4 = ddt.b($$0, $$2, $$3.a($$0.C_()));
      if ($$4 > 0) {
         this.a($$0, $$1, $$4);
      }
   }

   static record a(fcr a, fcr b) {
      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof dke.a $$1 && this.a == $$1.a && this.b == $$1.b) {
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
