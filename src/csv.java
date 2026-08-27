import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class csv extends dfi implements cpu {
   private static final Logger a = LogUtils.getLogger();
   private final he.c<csv> b = jb.f.f(this);
   public static final hk<dfj> o = new hk<>();
   private static final LoadingCache<eig, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<eig, Boolean>() {
      public Boolean a(eig $$0) {
         return !eid.c(eid.b(), $$0, ehr.g);
      }
   });
   public static final int p = 1;
   public static final int q = 2;
   public static final int r = 4;
   public static final int s = 8;
   public static final int t = 16;
   public static final int u = 32;
   public static final int v = 64;
   public static final int w = 4;
   public static final int x = 3;
   public static final int y = 11;
   public static final float z = -1.0F;
   public static final float A = 0.0F;
   public static final int B = 512;
   protected final dfk<csv, dfj> C;
   private dfj d;
   @Nullable
   private String e;
   @Nullable
   private cja f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<csv.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<csv.a> $$0 = new Object2ByteLinkedOpenHashMap<csv.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   public static int i(@Nullable dfj $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = o.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dfj a(int $$0) {
      dfj $$1 = o.a($$0);
      return $$1 == null ? csw.a.n() : $$1;
   }

   public static csv a(@Nullable cja $$0) {
      return $$0 instanceof cgy ? ((cgy)$$0).e() : csw.a;
   }

   public static dfj a(dfj $$0, dfj $$1, cpw $$2, gw $$3) {
      eig $$4 = eid.b($$0.k($$2, $$3), $$1.k($$2, $$3), ehr.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (biq $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = eid.a(ha.a.b, $$6.cG().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.c(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static eig a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return eid.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dfj b(dfj $$0, cpw $$1, gw $$2) {
      dfj $$3 = $$0;
      gw.a $$4 = new gw.a();

      for (ha $$5 : aD) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(dfj $$0, dfj $$1, cpw $$2, gw $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dfj $$0, dfj $$1, cpw $$2, gw $$3, int $$4, int $$5) {
      if ($$1 != $$0) {
         if ($$1.i()) {
            if (!$$2.w_()) {
               $$2.a($$3, ($$4 & 32) == 0, null, $$5);
            }
         } else {
            $$2.a($$3, $$1, $$4 & -33, $$5);
         }
      }
   }

   public csv(dfi.d $$0) {
      super($$0);
      dfk.a<csv, dfj> $$1 = new dfk.a<>(this);
      this.a($$1);
      this.C = $$1.a(csv::n, dfj::new);
      this.k(this.C.b());
      if (aa.aT) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean j(dfj $$0) {
      return $$0.b() instanceof cxc || $$0.a(csw.hW) || $$0.a(csw.ef) || $$0.a(csw.eg) || $$0.a(csw.fa) || $$0.a(csw.dV) || $$0.a(aps.aQ);
   }

   public boolean e_(dfj $$0) {
      return this.aG;
   }

   public static boolean a(dfj $$0, cpb $$1, gw $$2, ha $$3, gw $$4) {
      dfj $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.p()) {
         csv.a $$6 = new csv.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<csv.a> $$7 = h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            eig $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.c()) {
               return true;
            } else {
               eig $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = eid.c($$9, $$10, ehr.e);
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

   public static boolean c(cpb $$0, gw $$1) {
      return $$0.a_($$1).a($$0, $$1, ha.b, dax.c);
   }

   public static boolean a(cpy $$0, gw $$1, ha $$2) {
      dfj $$3 = $$0.a_($$1);
      return $$2 == ha.a && $$3.a(aps.aY) ? false : $$3.a($$0, $$1, $$2, dax.b);
   }

   public static boolean a(eig $$0, ha $$1) {
      eig $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(eig $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public boolean c(dfj $$0, cpb $$1, gw $$2) {
      return !a($$0.j($$1, $$2)) && $$0.u().c();
   }

   public void a(dfj $$0, cpv $$1, gw $$2, asc $$3) {
   }

   public void a(cpw $$0, gw $$1, dfj $$2) {
   }

   public static List<cjf> a(dfj $$0, akq $$1, gw $$2, @Nullable dcv $$3) {
      ecw.a $$4 = new ecw.a($$1).a(efb.f, ehn.b($$2)).a(efb.i, cjf.b).b(efb.h, $$3);
      return $$0.a($$4);
   }

   public static List<cjf> a(dfj $$0, akq $$1, gw $$2, @Nullable dcv $$3, @Nullable biq $$4, cjf $$5) {
      ecw.a $$6 = new ecw.a($$1).a(efb.f, ehn.b($$2)).a(efb.i, $$5).b(efb.a, $$4).b(efb.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dfj $$0, cpv $$1, gw $$2) {
      if ($$1 instanceof akq) {
         a($$0, (akq)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((akq)$$1, $$2, cjf.b, true);
      }
   }

   public static void a(dfj $$0, cpw $$1, gw $$2, @Nullable dcv $$3) {
      if ($$1 instanceof akq) {
         a($$0, (akq)$$1, $$2, $$3).forEach($$2x -> a((cpv)((akq)$$1), $$2, $$2x));
         $$0.a((akq)$$1, $$2, cjf.b, true);
      }
   }

   public static void a(dfj $$0, cpv $$1, gw $$2, @Nullable dcv $$3, @Nullable biq $$4, cjf $$5) {
      if ($$1 instanceof akq) {
         a($$0, (akq)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((akq)$$1, $$2, $$5, true);
      }
   }

   public static void a(cpv $$0, gw $$1, cjf $$2) {
      double $$3 = (double)biu.ad.l() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + arw.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + arw.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + arw.a($$0.z, -0.25, 0.25);
      a($$0, () -> new byn($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(cpv $$0, gw $$1, ha $$2, cjf $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)biu.ad.k() / 2.0;
      double $$8 = (double)biu.ad.l() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? arw.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? arw.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? arw.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? arw.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? arw.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? arw.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new byn($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(cpv $$0, Supplier<byn> $$1, cjf $$2) {
      if (!$$0.B && !$$2.b() && $$0.X().b(cpr.g)) {
         byn $$3 = $$1.get();
         $$3.t();
         $$0.b($$3);
      }
   }

   protected void a(akq $$0, gw $$1, int $$2) {
      if ($$0.X().b(cpr.g)) {
         biw.a($$0, ehn.b($$1), $$2);
      }
   }

   public float d() {
      return this.aF;
   }

   public void a(cpv $$0, gw $$1, cpn $$2) {
   }

   public void a(cpv $$0, gw $$1, dfj $$2, biq $$3) {
   }

   @Nullable
   public dfj a(cln $$0) {
      return this.n();
   }

   public void a(cpv $$0, cbu $$1, gw $$2, dfj $$3, @Nullable dcv $$4, cjf $$5) {
      $$1.b(apn.a.b(this));
      $$1.A(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(cpv $$0, gw $$1, dfj $$2, @Nullable bjg $$3, cjf $$4) {
   }

   public boolean a(dfj $$0) {
      return !$$0.e() && !$$0.k();
   }

   public ty e() {
      return tl.c(this.f());
   }

   public String f() {
      if (this.e == null) {
         this.e = ac.a("block", jb.f.b(this));
      }

      return this.e;
   }

   public void a(cpv $$0, dfj $$1, gw $$2, biq $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dM().k());
   }

   public void a(cpb $$0, biq $$1) {
      $$1.f($$1.do().d(1.0, 0.0, 1.0));
   }

   public cjf a(cpb $$0, gw $$1, dfj $$2) {
      return new cjf(this);
   }

   public float h() {
      return this.aI;
   }

   public float i() {
      return this.aJ;
   }

   public float j() {
      return this.aK;
   }

   protected void a(cpv $$0, cbu $$1, gw $$2, dfj $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public void a(cpv $$0, gw $$1, dfj $$2, cbu $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(aps.aV)) {
         cal.a($$3, false);
      }

      $$0.a(djt.f, $$1, djt.a.a($$3, $$2));
   }

   public void a(dfj $$0, cpv $$1, gw $$2, cqt.c $$3) {
   }

   public boolean a(cpn $$0) {
      return true;
   }

   protected void a(dfk.a<csv, dfj> $$0) {
   }

   public dfk<csv, dfj> l() {
      return this.C;
   }

   protected final void k(dfj $$0) {
      this.d = $$0;
   }

   public final dfj n() {
      return this.d;
   }

   public final dfj l(dfj $$0) {
      dfj $$1 = this.n();

      for (dgm<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dfj a(dfj $$0, dfj $$1, dgm<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   public dai m(dfj $$0) {
      return this.aH;
   }

   @Override
   public cja k() {
      if (this.f == null) {
         this.f = cja.a(this);
      }

      return this.f;
   }

   public boolean o() {
      return this.aL;
   }

   @Override
   public String toString() {
      return "Block{" + jb.f.b(this) + "}";
   }

   public void a(cjf $$0, @Nullable cpb $$1, List<tl> $$2, ckw $$3) {
   }

   @Override
   protected csv p() {
      return this;
   }

   protected ImmutableMap<dfj, eig> a(Function<dfj, eig> $$0) {
      return this.C.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public he.c<csv> q() {
      return this.b;
   }

   protected void a(akq $$0, gw $$1, cjf $$2, bgd $$3) {
      if (cnq.a(cns.v, $$2) == 0) {
         int $$4 = $$3.a($$0.z);
         if ($$4 > 0) {
            this.a($$0, $$1, $$4);
         }
      }
   }

   public static final class a {
      private final dfj a;
      private final dfj b;
      private final ha c;

      public a(dfj $$0, dfj $$1, ha $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof csv.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
