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

public class dfc extends dtb implements dbz {
   public static final MapCodec<dfc> p = b(dfc::new);
   private static final Logger a = LogUtils.getLogger();
   private final ja.c<dfc> b = lh.e.f(this);
   public static final jg<dtc> q = new jg<>();
   private static final LoadingCache<exn, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<exn, Boolean>() {
      public Boolean a(exn $$0) {
         return !exk.c(exk.b(), $$0, ewy.g);
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
   protected final dtd<dfc, dtc> E;
   private dtc d;
   @Nullable
   private String e;
   @Nullable
   private cuc f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dfc.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dfc.a> $$0 = new Object2ByteLinkedOpenHashMap<dfc.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends dfc> a() {
      return p;
   }

   public static int i(@Nullable dtc $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dtc a(int $$0) {
      dtc $$1 = q.a($$0);
      return $$1 == null ? dfe.a.n() : $$1;
   }

   public static dfc a(@Nullable cuc $$0) {
      return $$0 instanceof csc ? ((csc)$$0).d() : dfe.a;
   }

   public static dtc a(dtc $$0, dtc $$1, dcb $$2, ir $$3) {
      exn $$4 = exk.b($$0.k($$2, $$3), $$1.k($$2, $$3), ewy.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (brv $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = exk.a(iw.a.b, $$6.cP().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static exn a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return exk.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dtc b(dtc $$0, dcb $$1, ir $$2) {
      dtc $$3 = $$0;
      ir.a $$4 = new ir.a();

      for (iw $$5 : aF) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(dtc $$0, dtc $$1, dcb $$2, ir $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dtc $$0, dtc $$1, dcb $$2, ir $$3, int $$4, int $$5) {
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

   public dfc(dtb.d $$0) {
      super($$0);
      dtd.a<dfc, dtc> $$1 = new dtd.a<>(this);
      this.a($$1);
      this.E = $$1.a(dfc::n, dtc::new);
      this.k(this.E.b());
      if (ab.aX) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean j(dtc $$0) {
      return $$0.b() instanceof djq || $$0.a(dfe.iQ) || $$0.a(dfe.eU) || $$0.a(dfe.eX) || $$0.a(dfe.fS) || $$0.a(dfe.fR) || $$0.a(awe.aT);
   }

   public static boolean a(dtc $$0, dbg $$1, ir $$2, iw $$3, ir $$4) {
      dtc $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.p()) {
         dfc.a $$6 = new dfc.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<dfc.a> $$7 = h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            exn $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.c()) {
               return true;
            } else {
               exn $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = exk.c($$9, $$10, ewy.e);
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

   public static boolean c(dbg $$0, ir $$1) {
      return $$0.a_($$1).a($$0, $$1, iw.b, dns.c);
   }

   public static boolean a(dcd $$0, ir $$1, iw $$2) {
      dtc $$3 = $$0.a_($$1);
      return $$2 == iw.a && $$3.a(awe.bb) ? false : $$3.a($$0, $$1, $$2, dns.b);
   }

   public static boolean a(exn $$0, iw $$1) {
      exn $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(exn $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(dtc $$0, dca $$1, ir $$2, ayt $$3) {
   }

   public void a(dcb $$0, ir $$1, dtc $$2) {
   }

   public static List<cuh> a(dtc $$0, aqt $$1, ir $$2, @Nullable dqc $$3) {
      ers.a $$4 = new ers.a($$1).a(eug.f, ewu.b($$2)).a(eug.i, cuh.i).b(eug.h, $$3);
      return $$0.a($$4);
   }

   public static List<cuh> a(dtc $$0, aqt $$1, ir $$2, @Nullable dqc $$3, @Nullable brv $$4, cuh $$5) {
      ers.a $$6 = new ers.a($$1).a(eug.f, ewu.b($$2)).a(eug.i, $$5).b(eug.a, $$4).b(eug.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dtc $$0, dca $$1, ir $$2) {
      if ($$1 instanceof aqt) {
         a($$0, (aqt)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((aqt)$$1, $$2, cuh.i, true);
      }
   }

   public static void a(dtc $$0, dcb $$1, ir $$2, @Nullable dqc $$3) {
      if ($$1 instanceof aqt) {
         a($$0, (aqt)$$1, $$2, $$3).forEach($$2x -> a((dca)((aqt)$$1), $$2, $$2x));
         $$0.a((aqt)$$1, $$2, cuh.i, true);
      }
   }

   public static void a(dtc $$0, dca $$1, ir $$2, @Nullable dqc $$3, @Nullable brv $$4, cuh $$5) {
      if ($$1 instanceof aqt) {
         a($$0, (aqt)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         int $$6 = dae.a(dag.y, $$5);
         if ($$6 > 0) {
            int $$7 = $$1.A.a($$6 + 1);
            int $$8 = $$6 - $$7;
            a($$7, $$1, $$2, cuk.vT);
            a($$8, $$1, $$2, cuk.vI);
            if ($$1.A.i() <= 0.05F) {
               a(1, $$1, $$2, cuk.AH);
            }
         }

         $$0.a((aqt)$$1, $$2, $$5, true);
      }
   }

   public static void a(int $$0, dca $$1, ir $$2, cuc $$3) {
      for (int $$4 = 0; $$4 < aym.h($$0); $$4++) {
         cuh $$5 = new cuh($$3);
         double $$6 = (double)bsb.ai.l() / 2.0;
         double $$7 = (double)$$2.u() + 0.5 + aym.a($$1.A, -0.25, 0.25);
         double $$8 = (double)$$2.v() + 0.5 + aym.a($$1.A, -0.25, 0.25) - $$6;
         double $$9 = (double)$$2.w() + 0.5 + aym.a($$1.A, -0.25, 0.25);
         double $$10 = aym.a($$1.A, -0.25, 0.25);
         double $$11 = aym.a($$1.A, 0.0, 0.25);
         double $$12 = aym.a($$1.A, -0.25, 0.25);
         a($$1, () -> new cig($$1, $$7, $$8, $$9, $$5, $$10, $$11, $$12), $$5);
      }
   }

   public static void a(dca $$0, ir $$1, cuh $$2) {
      double $$3 = (double)bsb.ai.l() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + aym.a($$0.A, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + aym.a($$0.A, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + aym.a($$0.A, -0.25, 0.25);
      a($$0, () -> new cig($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(dca $$0, ir $$1, iw $$2, cuh $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bsb.ai.k() / 2.0;
      double $$8 = (double)bsb.ai.l() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? aym.a($$0.A, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? aym.a($$0.A, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? aym.a($$0.A, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? aym.a($$0.A, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? aym.a($$0.A, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? aym.a($$0.A, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new cig($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(dca $$0, Supplier<cig> $$1, cuh $$2) {
      if (!$$0.C && !$$2.d() && $$0.ab().b(dbw.h)) {
         cig $$3 = $$1.get();
         $$3.u();
         $$0.b($$3);
      }
   }

   protected void a(aqt $$0, ir $$1, int $$2) {
      if ($$0.ab().b(dbw.h)) {
         bse.a($$0, ewu.b($$1), $$2);
      }
   }

   public float e() {
      return this.aH;
   }

   public void a(dca $$0, ir $$1, dbs $$2) {
   }

   public void a(dca $$0, ir $$1, dtc $$2, brv $$3) {
   }

   @Nullable
   public dtc a(cyd $$0) {
      return this.n();
   }

   public void a(dca $$0, cly $$1, ir $$2, dtc $$3, @Nullable dqc $$4, cuh $$5) {
      $$1.b(avz.a.b(this));
      $$1.C(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(dca $$0, ir $$1, dtc $$2, @Nullable bso $$3, cuh $$4) {
   }

   public boolean a(dtc $$0) {
      return !$$0.e() && !$$0.k();
   }

   public xs f() {
      return xe.c(this.g());
   }

   public String g() {
      if (this.e == null) {
         this.e = ad.a("block", lh.e.b(this));
      }

      return this.e;
   }

   public void a(dca $$0, dtc $$1, ir $$2, brv $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dX().l());
   }

   public void a(dbg $$0, brv $$1) {
      $$1.g($$1.dx().d(1.0, 0.0, 1.0));
   }

   public cuh a(dcd $$0, ir $$1, dtc $$2) {
      return new cuh(this);
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

   protected void a(dca $$0, cly $$1, ir $$2, dtc $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public dtc a(dca $$0, ir $$1, dtc $$2, cly $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(awe.aY)) {
         ckp.a($$3, false);
      }

      $$0.a(dxv.f, $$1, dxv.a.a($$3, $$2));
      return $$2;
   }

   public void a(dtc $$0, dca $$1, ir $$2, dcz.c $$3) {
   }

   public boolean a(dbs $$0) {
      return true;
   }

   protected void a(dtd.a<dfc, dtc> $$0) {
   }

   public dtd<dfc, dtc> l() {
      return this.E;
   }

   protected final void k(dtc $$0) {
      this.d = $$0;
   }

   public final dtc n() {
      return this.d;
   }

   public final dtc l(dtc $$0) {
      dtc $$1 = this.n();

      for (duf<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dtc a(dtc $$0, dtc $$1, duf<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   @Override
   public cuc q() {
      if (this.f == null) {
         this.f = cuc.a(this);
      }

      return this.f;
   }

   public boolean o() {
      return this.aN;
   }

   @Override
   public String toString() {
      return "Block{" + lh.e.b(this) + "}";
   }

   public void a(cuh $$0, @Nullable dbg $$1, List<xe> $$2, cwi $$3, @Nullable jo $$4) {
   }

   @Override
   protected dfc p() {
      return this;
   }

   protected ImmutableMap<dtc, exn> a(Function<dtc, exn> $$0) {
      return this.E.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public ja.c<dfc> r() {
      return this.b;
   }

   protected void a(aqt $$0, ir $$1, cuh $$2, bpf $$3) {
      if (dae.a(dag.v, $$2) == 0) {
         int $$4 = $$3.a($$0.A);
         if ($$4 > 0) {
            this.a($$0, $$1, $$4);
         }
      }
   }

   public static final class a {
      private final dtc a;
      private final dtc b;
      private final iw c;

      public a(dtc $$0, dtc $$1, iw $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof dfc.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
