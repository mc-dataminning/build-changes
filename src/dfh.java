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

public class dfh extends dsj implements dce {
   public static final MapCodec<dfh> p = b(dfh::new);
   private static final Logger a = LogUtils.getLogger();
   private final jj.c<dfh> b = lq.e.f(this);
   public static final jp<dsk> q = new jp<>();
   private static final LoadingCache<ewy, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<ewy, Boolean>() {
      public Boolean a(ewy $$0) {
         return !ewv.c(ewv.b(), $$0, ewj.g);
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
   protected final dsl<dfh, dsk> E;
   private dsk d;
   @Nullable
   private String e;
   @Nullable
   private ctx f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dfh.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dfh.a> $$0 = new Object2ByteLinkedOpenHashMap<dfh.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends dfh> a() {
      return p;
   }

   public static int i(@Nullable dsk $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dsk a(int $$0) {
      dsk $$1 = q.a($$0);
      return $$1 == null ? dfj.a.o() : $$1;
   }

   public static dfh a(@Nullable ctx $$0) {
      return $$0 instanceof csb ? ((csb)$$0).d() : dfj.a;
   }

   public static dsk a(dsk $$0, dsk $$1, dcg $$2, ja $$3) {
      ewy $$4 = ewv.b($$0.k($$2, $$3), $$1.k($$2, $$3), ewj.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (bsg $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = ewv.a(jf.a.b, $$6.cL().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static ewy a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return ewv.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dsk b(dsk $$0, dcg $$1, ja $$2) {
      dsk $$3 = $$0;
      ja.a $$4 = new ja.a();

      for (jf $$5 : aF) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(dsk $$0, dsk $$1, dcg $$2, ja $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dsk $$0, dsk $$1, dcg $$2, ja $$3, int $$4, int $$5) {
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

   public dfh(dsj.d $$0) {
      super($$0);
      dsl.a<dfh, dsk> $$1 = new dsl.a<>(this);
      this.a($$1);
      this.E = $$1.a(dfh::o, dsk::new);
      this.k(this.E.b());
      if (aa.aW) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean j(dsk $$0) {
      return $$0.b() instanceof djr || $$0.a(dfj.hW) || $$0.a(dfj.ee) || $$0.a(dfj.ef) || $$0.a(dfj.fa) || $$0.a(dfj.eZ) || $$0.a(avw.aR);
   }

   public static boolean a(dsk $$0, dbl $$1, ja $$2, jf $$3, ja $$4) {
      dsk $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.p()) {
         dfh.a $$6 = new dfh.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<dfh.a> $$7 = h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            ewy $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.c()) {
               return true;
            } else {
               ewy $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = ewv.c($$9, $$10, ewj.e);
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

   public static boolean c(dbl $$0, ja $$1) {
      return $$0.a_($$1).a($$0, $$1, jf.b, dni.c);
   }

   public static boolean a(dci $$0, ja $$1, jf $$2) {
      dsk $$3 = $$0.a_($$1);
      return $$2 == jf.a && $$3.a(avw.aZ) ? false : $$3.a($$0, $$1, $$2, dni.b);
   }

   public static boolean a(ewy $$0, jf $$1) {
      ewy $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(ewy $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(dsk $$0, dcf $$1, ja $$2, ayo $$3) {
   }

   public void a(dcg $$0, ja $$1, dsk $$2) {
   }

   public static List<cuc> a(dsk $$0, aqm $$1, ja $$2, @Nullable dpp $$3) {
      eqx.a $$4 = new eqx.a($$1).a(etq.f, ewf.b($$2)).a(etq.i, cuc.l).b(etq.h, $$3);
      return $$0.a($$4);
   }

   public static List<cuc> a(dsk $$0, aqm $$1, ja $$2, @Nullable dpp $$3, @Nullable bsg $$4, cuc $$5) {
      eqx.a $$6 = new eqx.a($$1).a(etq.f, ewf.b($$2)).a(etq.i, $$5).b(etq.a, $$4).b(etq.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dsk $$0, dcf $$1, ja $$2) {
      if ($$1 instanceof aqm) {
         a($$0, (aqm)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((aqm)$$1, $$2, cuc.l, true);
      }
   }

   public static void a(dsk $$0, dcg $$1, ja $$2, @Nullable dpp $$3) {
      if ($$1 instanceof aqm) {
         a($$0, (aqm)$$1, $$2, $$3).forEach($$2x -> a((dcf)((aqm)$$1), $$2, $$2x));
         $$0.a((aqm)$$1, $$2, cuc.l, true);
      }
   }

   public static void a(dsk $$0, dcf $$1, ja $$2, @Nullable dpp $$3, @Nullable bsg $$4, cuc $$5) {
      if ($$1 instanceof aqm) {
         a($$0, (aqm)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((aqm)$$1, $$2, $$5, true);
      }
   }

   public static void a(dcf $$0, ja $$1, cuc $$2) {
      double $$3 = (double)bsm.ag.m() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + ayg.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + ayg.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + ayg.a($$0.z, -0.25, 0.25);
      a($$0, () -> new ciu($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(dcf $$0, ja $$1, jf $$2, cuc $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bsm.ag.l() / 2.0;
      double $$8 = (double)bsm.ag.m() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? ayg.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? ayg.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? ayg.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? ayg.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? ayg.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? ayg.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new ciu($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(dcf $$0, Supplier<ciu> $$1, cuc $$2) {
      if (!$$0.B && !$$2.e() && $$0.ab().b(dcb.h)) {
         ciu $$3 = $$1.get();
         $$3.v();
         $$0.b($$3);
      }
   }

   protected void a(aqm $$0, ja $$1, int $$2) {
      if ($$0.ab().b(dcb.h)) {
         bsr.a($$0, ewf.b($$1), $$2);
      }
   }

   public float e() {
      return this.aH;
   }

   public void a(dcf $$0, ja $$1, dbx $$2) {
   }

   public void a(dcf $$0, ja $$1, dsk $$2, bsg $$3) {
   }

   @Nullable
   public dsk a(cxm $$0) {
      return this.o();
   }

   public void a(dcf $$0, cmk $$1, ja $$2, dsk $$3, @Nullable dpp $$4, cuc $$5) {
      $$1.b(avr.a.b(this));
      $$1.D(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(dcf $$0, ja $$1, dsk $$2, @Nullable btb $$3, cuc $$4) {
   }

   public boolean a(dsk $$0) {
      return !$$0.e() && !$$0.k();
   }

   public xi f() {
      return wu.c(this.g());
   }

   public String g() {
      if (this.e == null) {
         this.e = ac.a("block", lq.e.b(this));
      }

      return this.e;
   }

   public void a(dcf $$0, dsk $$1, ja $$2, bsg $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dR().l());
   }

   public void a(dbl $$0, bsg $$1) {
      $$1.i($$1.dt().d(1.0, 0.0, 1.0));
   }

   public cuc a(dci $$0, ja $$1, dsk $$2) {
      return new cuc(this);
   }

   public float h() {
      return this.aK;
   }

   public float j() {
      return this.aL;
   }

   public float k() {
      return this.aM;
   }

   protected void a(dcf $$0, cmk $$1, ja $$2, dsk $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public dsk a(dcf $$0, ja $$1, dsk $$2, cmk $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(avw.aW)) {
         clb.a($$3, false);
      }

      $$0.a(dxg.f, $$1, dxg.a.a($$3, $$2));
      return $$2;
   }

   public void a(dsk $$0, dcf $$1, ja $$2, ddf.c $$3) {
   }

   public boolean a(dbx $$0) {
      return true;
   }

   protected void a(dsl.a<dfh, dsk> $$0) {
   }

   public dsl<dfh, dsk> l() {
      return this.E;
   }

   protected final void k(dsk $$0) {
      this.d = $$0;
   }

   public final dsk o() {
      return this.d;
   }

   public final dsk l(dsk $$0) {
      dsk $$1 = this.o();

      for (dtn<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dsk a(dsk $$0, dsk $$1, dtn<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   @Override
   public ctx r() {
      if (this.f == null) {
         this.f = ctx.a(this);
      }

      return this.f;
   }

   public boolean p() {
      return this.aN;
   }

   @Override
   public String toString() {
      return "Block{" + lq.e.b(this) + "}";
   }

   public void a(cuc $$0, ctx.b $$1, List<wu> $$2, cvv $$3) {
   }

   @Override
   protected dfh q() {
      return this;
   }

   protected ImmutableMap<dsk, ewy> a(Function<dsk, ewy> $$0) {
      return this.E.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public jj.c<dfh> s() {
      return this.b;
   }

   protected void a(aqm $$0, ja $$1, cuc $$2, bpl $$3) {
      int $$4 = czn.b($$0, $$2, $$3.a($$0.E_()));
      if ($$4 > 0) {
         this.a($$0, $$1, $$4);
      }
   }

   public static final class a {
      private final dsk a;
      private final dsk b;
      private final jf c;

      public a(dsk $$0, dsk $$1, jf $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof dfh.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
