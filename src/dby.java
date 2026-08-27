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

public class dby extends doy implements cyw {
   public static final MapCodec<dby> p = b(dby::new);
   private static final Logger a = LogUtils.getLogger();
   private final il.c<dby> b = kr.e.f(this);
   public static final ir<doz> q = new ir<>();
   private static final LoadingCache<est, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<est, Boolean>() {
      public Boolean a(est $$0) {
         return !esq.c(esq.b(), $$0, ese.g);
      }
   });
   public static final int r = 1;
   public static final int s = 2;
   public static final int t = 4;
   public static final int u = 8;
   public static final int v = 16;
   public static final int w = 32;
   public static final int x = 64;
   public static final int y = 4;
   public static final int z = 3;
   public static final int A = 11;
   public static final float B = -1.0F;
   public static final float C = 0.0F;
   public static final int D = 512;
   protected final dpa<dby, doz> E;
   private doz d;
   @Nullable
   private String e;
   @Nullable
   private cre f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dby.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dby.a> $$0 = new Object2ByteLinkedOpenHashMap<dby.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends dby> a() {
      return p;
   }

   public static int i(@Nullable doz $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static doz a(int $$0) {
      doz $$1 = q.a($$0);
      return $$1 == null ? dca.a.n() : $$1;
   }

   public static dby a(@Nullable cre $$0) {
      return $$0 instanceof cph ? ((cph)$$0).d() : dca.a;
   }

   public static doz a(doz $$0, doz $$1, cyy $$2, ib $$3) {
      est $$4 = esq.b($$0.k($$2, $$3), $$1.k($$2, $$3), ese.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (bpv $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = esq.a(ih.a.b, $$6.cH().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static est a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return esq.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static doz b(doz $$0, cyy $$1, ib $$2) {
      doz $$3 = $$0;
      ib.a $$4 = new ib.a();

      for (ih $$5 : aF) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(doz $$0, doz $$1, cyy $$2, ib $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(doz $$0, doz $$1, cyy $$2, ib $$3, int $$4, int $$5) {
      if ($$1 != $$0) {
         if ($$1.i()) {
            if (!$$2.x_()) {
               $$2.a($$3, ($$4 & 32) == 0, null, $$5);
            }
         } else {
            $$2.a($$3, $$1, $$4 & -33, $$5);
         }
      }
   }

   public dby(doy.d $$0) {
      super($$0);
      dpa.a<dby, doz> $$1 = new dpa.a<>(this);
      this.a($$1);
      this.E = $$1.a(dby::n, doz::new);
      this.k(this.E.b());
      if (aa.aW) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean j(doz $$0) {
      return $$0.b() instanceof dgh || $$0.a(dca.hW) || $$0.a(dca.ee) || $$0.a(dca.ef) || $$0.a(dca.fa) || $$0.a(dca.eZ) || $$0.a(avc.aR);
   }

   public static boolean a(doz $$0, cyd $$1, ib $$2, ih $$3, ib $$4) {
      doz $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.p()) {
         dby.a $$6 = new dby.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<dby.a> $$7 = h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            est $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.c()) {
               return true;
            } else {
               est $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = esq.c($$9, $$10, ese.e);
               if ($$7.size() == 2048) {
                  $$7.removeLastByte();
               }

               $$7.putAndMoveToFirst($$6, (byte)($$11 ? 1 : 0));
               return $$11;
            }
         }
      } else {
         return true;
      }
   }

   public static boolean c(cyd $$0, ib $$1) {
      return $$0.a_($$1).a($$0, $$1, ih.b, djy.c);
   }

   public static boolean a(cza $$0, ib $$1, ih $$2) {
      doz $$3 = $$0.a_($$1);
      return $$2 == ih.a && $$3.a(avc.aZ) ? false : $$3.a($$0, $$1, $$2, djy.b);
   }

   public static boolean a(est $$0, ih $$1) {
      est $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(est $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(doz $$0, cyx $$1, ib $$2, axr $$3) {
   }

   public void a(cyy $$0, ib $$1, doz $$2) {
   }

   public static List<crj> a(doz $$0, aps $$1, ib $$2, @Nullable dmf $$3) {
      enh.a $$4 = new enh.a($$1).a(epo.f, esa.b($$2)).a(epo.i, crj.i).b(epo.h, $$3);
      return $$0.a($$4);
   }

   public static List<crj> a(doz $$0, aps $$1, ib $$2, @Nullable dmf $$3, @Nullable bpv $$4, crj $$5) {
      enh.a $$6 = new enh.a($$1).a(epo.f, esa.b($$2)).a(epo.i, $$5).b(epo.a, $$4).b(epo.h, $$3);
      return $$0.a($$6);
   }

   public static void c(doz $$0, cyx $$1, ib $$2) {
      if ($$1 instanceof aps) {
         a($$0, (aps)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((aps)$$1, $$2, crj.i, true);
      }
   }

   public static void a(doz $$0, cyy $$1, ib $$2, @Nullable dmf $$3) {
      if ($$1 instanceof aps) {
         a($$0, (aps)$$1, $$2, $$3).forEach($$2x -> a((cyx)((aps)$$1), $$2, $$2x));
         $$0.a((aps)$$1, $$2, crj.i, true);
      }
   }

   public static void a(doz $$0, cyx $$1, ib $$2, @Nullable dmf $$3, @Nullable bpv $$4, crj $$5) {
      if ($$1 instanceof aps) {
         a($$0, (aps)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((aps)$$1, $$2, $$5, true);
      }
   }

   public static void a(cyx $$0, ib $$1, crj $$2) {
      double $$3 = (double)bqb.ag.l() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + axk.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + axk.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + axk.a($$0.z, -0.25, 0.25);
      a($$0, () -> new cgd($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(cyx $$0, ib $$1, ih $$2, crj $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bqb.ag.k() / 2.0;
      double $$8 = (double)bqb.ag.l() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? axk.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? axk.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? axk.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? axk.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? axk.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? axk.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new cgd($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(cyx $$0, Supplier<cgd> $$1, crj $$2) {
      if (!$$0.B && !$$2.d() && $$0.aa().b(cyt.h)) {
         cgd $$3 = $$1.get();
         $$3.v();
         $$0.b($$3);
      }
   }

   protected void a(aps $$0, ib $$1, int $$2) {
      if ($$0.aa().b(cyt.h)) {
         bqe.a($$0, esa.b($$1), $$2);
      }
   }

   public float e() {
      return this.aH;
   }

   public void a(cyx $$0, ib $$1, cyp $$2) {
   }

   public void a(cyx $$0, ib $$1, doz $$2, bpv $$3) {
   }

   @Nullable
   public doz a(cuo $$0) {
      return this.n();
   }

   public void a(cyx $$0, cjt $$1, ib $$2, doz $$3, @Nullable dmf $$4, crj $$5) {
      $$1.b(auw.a.b(this));
      $$1.C(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(cyx $$0, ib $$1, doz $$2, @Nullable bqo $$3, crj $$4) {
   }

   public boolean a(doz $$0) {
      return !$$0.e() && !$$0.k();
   }

   public wu f() {
      return wg.c(this.g());
   }

   public String g() {
      if (this.e == null) {
         this.e = ac.a("block", kr.e.b(this));
      }

      return this.e;
   }

   public void a(cyx $$0, doz $$1, ib $$2, bpv $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dN().k());
   }

   public void a(cyd $$0, bpv $$1) {
      $$1.g($$1.dp().d(1.0, 0.0, 1.0));
   }

   public crj a(cza $$0, ib $$1, doz $$2) {
      return new crj(this);
   }

   public float h() {
      return this.aK;
   }

   public float i() {
      return this.aL;
   }

   public float j() {
      return this.aM;
   }

   protected void a(cyx $$0, cjt $$1, ib $$2, doz $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public doz a(cyx $$0, ib $$1, doz $$2, cjt $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(avc.aW)) {
         cik.a($$3, false);
      }

      $$0.a(dts.f, $$1, dts.a.a($$3, $$2));
      return $$2;
   }

   public void a(doz $$0, cyx $$1, ib $$2, czw.c $$3) {
   }

   public boolean a(cyp $$0) {
      return true;
   }

   protected void a(dpa.a<dby, doz> $$0) {
   }

   public dpa<dby, doz> l() {
      return this.E;
   }

   protected final void k(doz $$0) {
      this.d = $$0;
   }

   public final doz n() {
      return this.d;
   }

   public final doz l(doz $$0) {
      doz $$1 = this.n();

      for (dqc<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> doz a(doz $$0, doz $$1, dqc<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   @Override
   public cre p() {
      if (this.f == null) {
         this.f = cre.a(this);
      }

      return this.f;
   }

   public boolean o() {
      return this.aN;
   }

   @Override
   public String toString() {
      return "Block{" + kr.e.b(this) + "}";
   }

   public void a(crj $$0, @Nullable cyd $$1, List<wg> $$2, csz $$3, @Nullable iz $$4) {
   }

   @Override
   protected dby q() {
      return this;
   }

   protected ImmutableMap<doz, est> a(Function<doz, est> $$0) {
      return this.E.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public il.c<dby> r() {
      return this.b;
   }

   protected void a(aps $$0, ib $$1, crj $$2, bnf $$3) {
      if (cwr.a(cwt.v, $$2) == 0) {
         int $$4 = $$3.a($$0.z);
         if ($$4 > 0) {
            this.a($$0, $$1, $$4);
         }
      }
   }

   public static final class a {
      private final doz a;
      private final doz b;
      private final ih c;

      public a(doz $$0, doz $$1, ih $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof dby.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
         }
      }

      @Override
      public int hashCode() {
         int $$0 = this.a.hashCode();
         $$0 = 31 * $$0 + this.b.hashCode();
         return 31 * $$0 + this.c.hashCode();
      }
   }
}
