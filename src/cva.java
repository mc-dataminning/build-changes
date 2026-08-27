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

public class cva extends dhh implements crz {
   public static final MapCodec<cva> p = b(cva::new);
   private static final Logger a = LogUtils.getLogger();
   private final ib.c<cva> b = jy.f.f(this);
   public static final ii<dhi> q = new ii<>();
   private static final LoadingCache<ekn, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<ekn, Boolean>() {
      public Boolean a(ekn $$0) {
         return !ekk.c(ekk.b(), $$0, ejy.g);
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
   protected final dhj<cva, dhi> E;
   private dhi d;
   @Nullable
   private String e;
   @Nullable
   private cle f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<cva.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<cva.a> $$0 = new Object2ByteLinkedOpenHashMap<cva.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends cva> a() {
      return p;
   }

   public static int i(@Nullable dhi $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dhi a(int $$0) {
      dhi $$1 = q.a($$0);
      return $$1 == null ? cvc.a.o() : $$1;
   }

   public static cva a(@Nullable cle $$0) {
      return $$0 instanceof cjc ? ((cjc)$$0).e() : cvc.a;
   }

   public static dhi a(dhi $$0, dhi $$1, csb $$2, ht $$3) {
      ekn $$4 = ekk.b($$0.k($$2, $$3), $$1.k($$2, $$3), ejy.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (bkq $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = ekk.a(hx.a.b, $$6.cH().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static ekn a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return ekk.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dhi b(dhi $$0, csb $$1, ht $$2) {
      dhi $$3 = $$0;
      ht.a $$4 = new ht.a();

      for (hx $$5 : aF) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(dhi $$0, dhi $$1, csb $$2, ht $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dhi $$0, dhi $$1, csb $$2, ht $$3, int $$4, int $$5) {
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

   public cva(dhh.d $$0) {
      super($$0);
      dhj.a<cva, dhi> $$1 = new dhj.a<>(this);
      this.a($$1);
      this.E = $$1.a(cva::o, dhi::new);
      this.k(this.E.b());
      if (aa.aT) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean j(dhi $$0) {
      return $$0.b() instanceof czj || $$0.a(cvc.hW) || $$0.a(cvc.ee) || $$0.a(cvc.ef) || $$0.a(cvc.fa) || $$0.a(cvc.eZ) || $$0.a(arg.aQ);
   }

   public boolean e_(dhi $$0) {
      return this.aI;
   }

   public static boolean a(dhi $$0, crg $$1, ht $$2, hx $$3, ht $$4) {
      dhi $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.p()) {
         cva.a $$6 = new cva.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<cva.a> $$7 = h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            ekn $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.c()) {
               return true;
            } else {
               ekn $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = ekk.c($$9, $$10, ejy.e);
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

   public static boolean c(crg $$0, ht $$1) {
      return $$0.a_($$1).a($$0, $$1, hx.b, dda.c);
   }

   public static boolean a(csd $$0, ht $$1, hx $$2) {
      dhi $$3 = $$0.a_($$1);
      return $$2 == hx.a && $$3.a(arg.aY) ? false : $$3.a($$0, $$1, $$2, dda.b);
   }

   public static boolean a(ekn $$0, hx $$1) {
      ekn $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(ekn $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public boolean a_(dhi $$0, crg $$1, ht $$2) {
      return !a($$0.j($$1, $$2)) && $$0.u().c();
   }

   public void a(dhi $$0, csa $$1, ht $$2, ats $$3) {
   }

   public void a(csb $$0, ht $$1, dhi $$2) {
   }

   public static List<clj> a(dhi $$0, ame $$1, ht $$2, @Nullable dfd $$3) {
      efd.a $$4 = new efd.a($$1).a(ehi.f, eju.b($$2)).a(ehi.i, clj.b).b(ehi.h, $$3);
      return $$0.a($$4);
   }

   public static List<clj> a(dhi $$0, ame $$1, ht $$2, @Nullable dfd $$3, @Nullable bkq $$4, clj $$5) {
      efd.a $$6 = new efd.a($$1).a(ehi.f, eju.b($$2)).a(ehi.i, $$5).b(ehi.a, $$4).b(ehi.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dhi $$0, csa $$1, ht $$2) {
      if ($$1 instanceof ame) {
         a($$0, (ame)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((ame)$$1, $$2, clj.b, true);
      }
   }

   public static void a(dhi $$0, csb $$1, ht $$2, @Nullable dfd $$3) {
      if ($$1 instanceof ame) {
         a($$0, (ame)$$1, $$2, $$3).forEach($$2x -> a((csa)((ame)$$1), $$2, $$2x));
         $$0.a((ame)$$1, $$2, clj.b, true);
      }
   }

   public static void a(dhi $$0, csa $$1, ht $$2, @Nullable dfd $$3, @Nullable bkq $$4, clj $$5) {
      if ($$1 instanceof ame) {
         a($$0, (ame)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((ame)$$1, $$2, $$5, true);
      }
   }

   public static void a(csa $$0, ht $$1, clj $$2) {
      double $$3 = (double)bku.ad.l() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + atm.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + atm.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + atm.a($$0.z, -0.25, 0.25);
      a($$0, () -> new can($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(csa $$0, ht $$1, hx $$2, clj $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bku.ad.k() / 2.0;
      double $$8 = (double)bku.ad.l() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? atm.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? atm.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? atm.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? atm.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? atm.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? atm.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new can($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(csa $$0, Supplier<can> $$1, clj $$2) {
      if (!$$0.B && !$$2.b() && $$0.Y().b(crw.h)) {
         can $$3 = $$1.get();
         $$3.u();
         $$0.b($$3);
      }
   }

   protected void a(ame $$0, ht $$1, int $$2) {
      if ($$0.Y().b(crw.h)) {
         bkw.a($$0, eju.b($$1), $$2);
      }
   }

   public float e() {
      return this.aH;
   }

   public void a(csa $$0, ht $$1, crs $$2) {
   }

   public void a(csa $$0, ht $$1, dhi $$2, bkq $$3) {
   }

   @Nullable
   public dhi a(cnr $$0) {
      return this.o();
   }

   public void a(csa $$0, cdu $$1, ht $$2, dhi $$3, @Nullable dfd $$4, clj $$5) {
      $$1.b(arb.a.b(this));
      $$1.A(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(csa $$0, ht $$1, dhi $$2, @Nullable blg $$3, clj $$4) {
   }

   public boolean a(dhi $$0) {
      return !$$0.e() && !$$0.k();
   }

   public vf f() {
      return ur.c(this.h());
   }

   public String h() {
      if (this.e == null) {
         this.e = ac.a("block", jy.f.b(this));
      }

      return this.e;
   }

   public void a(csa $$0, dhi $$1, ht $$2, bkq $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dO().k());
   }

   public void a(crg $$0, bkq $$1) {
      $$1.g($$1.dq().d(1.0, 0.0, 1.0));
   }

   public clj a(csd $$0, ht $$1, dhi $$2) {
      return new clj(this);
   }

   public float i() {
      return this.aK;
   }

   public float j() {
      return this.aL;
   }

   public float l() {
      return this.aM;
   }

   protected void a(csa $$0, cdu $$1, ht $$2, dhi $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public dhi a(csa $$0, ht $$1, dhi $$2, cdu $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(arg.aV)) {
         ccl.a($$3, false);
      }

      $$0.a(dls.f, $$1, dls.a.a($$3, $$2));
      return $$2;
   }

   public void a(dhi $$0, csa $$1, ht $$2, csy.c $$3) {
   }

   public boolean a(crs $$0) {
      return true;
   }

   protected void a(dhj.a<cva, dhi> $$0) {
   }

   public dhj<cva, dhi> n() {
      return this.E;
   }

   protected final void k(dhi $$0) {
      this.d = $$0;
   }

   public final dhi o() {
      return this.d;
   }

   public final dhi l(dhi $$0) {
      dhi $$1 = this.o();

      for (dil<?> $$2 : $$0.b().n().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dhi a(dhi $$0, dhi $$1, dil<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   public dcm m(dhi $$0) {
      return this.aJ;
   }

   @Override
   public cle k() {
      if (this.f == null) {
         this.f = cle.a(this);
      }

      return this.f;
   }

   public boolean p() {
      return this.aN;
   }

   @Override
   public String toString() {
      return "Block{" + jy.f.b(this) + "}";
   }

   public void a(clj $$0, @Nullable crg $$1, List<ur> $$2, cna $$3) {
   }

   @Override
   protected cva q() {
      return this;
   }

   protected ImmutableMap<dhi, ekn> a(Function<dhi, ekn> $$0) {
      return this.E.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public ib.c<cva> r() {
      return this.b;
   }

   protected void a(ame $$0, ht $$1, clj $$2, bic $$3) {
      if (cpw.a(cpy.v, $$2) == 0) {
         int $$4 = $$3.a($$0.z);
         if ($$4 > 0) {
            this.a($$0, $$1, $$4);
         }
      }
   }

   public static final class a {
      private final dhi a;
      private final dhi b;
      private final hx c;

      public a(dhi $$0, dhi $$1, hx $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof cva.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
