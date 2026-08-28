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

public class dfi extends dsk implements dcf {
   public static final MapCodec<dfi> p = b(dfi::new);
   private static final Logger a = LogUtils.getLogger();
   private final jj.c<dfi> b = lq.e.f(this);
   public static final jp<dsl> q = new jp<>();
   private static final LoadingCache<exa, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<exa, Boolean>() {
      public Boolean a(exa $$0) {
         return !ewx.c(ewx.b(), $$0, ewl.g);
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
   protected final dsm<dfi, dsl> E;
   private dsl d;
   @Nullable
   private String e;
   @Nullable
   private cty f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dfi.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dfi.a> $$0 = new Object2ByteLinkedOpenHashMap<dfi.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends dfi> a() {
      return p;
   }

   public static int i(@Nullable dsl $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dsl a(int $$0) {
      dsl $$1 = q.a($$0);
      return $$1 == null ? dfk.a.o() : $$1;
   }

   public static dfi a(@Nullable cty $$0) {
      return $$0 instanceof csc ? ((csc)$$0).d() : dfk.a;
   }

   public static dsl a(dsl $$0, dsl $$1, dch $$2, ja $$3) {
      exa $$4 = ewx.b($$0.k($$2, $$3), $$1.k($$2, $$3), ewl.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (bsh $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = ewx.a(jf.a.b, $$6.cM().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static exa a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return ewx.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dsl b(dsl $$0, dch $$1, ja $$2) {
      dsl $$3 = $$0;
      ja.a $$4 = new ja.a();

      for (jf $$5 : aF) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(dsl $$0, dsl $$1, dch $$2, ja $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dsl $$0, dsl $$1, dch $$2, ja $$3, int $$4, int $$5) {
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

   public dfi(dsk.d $$0) {
      super($$0);
      dsm.a<dfi, dsl> $$1 = new dsm.a<>(this);
      this.a($$1);
      this.E = $$1.a(dfi::o, dsl::new);
      this.k(this.E.b());
      if (aa.aU) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean j(dsl $$0) {
      return $$0.b() instanceof djs || $$0.a(dfk.hW) || $$0.a(dfk.ee) || $$0.a(dfk.ef) || $$0.a(dfk.fa) || $$0.a(dfk.eZ) || $$0.a(avw.aR);
   }

   public static boolean a(dsl $$0, dbm $$1, ja $$2, jf $$3, ja $$4) {
      dsl $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.p()) {
         dfi.a $$6 = new dfi.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<dfi.a> $$7 = h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            exa $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.c()) {
               return true;
            } else {
               exa $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = ewx.c($$9, $$10, ewl.e);
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

   public static boolean c(dbm $$0, ja $$1) {
      return $$0.a_($$1).a($$0, $$1, jf.b, dnj.c);
   }

   public static boolean a(dcj $$0, ja $$1, jf $$2) {
      dsl $$3 = $$0.a_($$1);
      return $$2 == jf.a && $$3.a(avw.aZ) ? false : $$3.a($$0, $$1, $$2, dnj.b);
   }

   public static boolean a(exa $$0, jf $$1) {
      exa $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(exa $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(dsl $$0, dcg $$1, ja $$2, ayo $$3) {
   }

   public void a(dch $$0, ja $$1, dsl $$2) {
   }

   public static List<cud> a(dsl $$0, aqm $$1, ja $$2, @Nullable dpq $$3) {
      eqz.a $$4 = new eqz.a($$1).a(ets.f, ewh.b($$2)).a(ets.i, cud.l).b(ets.h, $$3);
      return $$0.a($$4);
   }

   public static List<cud> a(dsl $$0, aqm $$1, ja $$2, @Nullable dpq $$3, @Nullable bsh $$4, cud $$5) {
      eqz.a $$6 = new eqz.a($$1).a(ets.f, ewh.b($$2)).a(ets.i, $$5).b(ets.a, $$4).b(ets.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dsl $$0, dcg $$1, ja $$2) {
      if ($$1 instanceof aqm) {
         a($$0, (aqm)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((aqm)$$1, $$2, cud.l, true);
      }
   }

   public static void a(dsl $$0, dch $$1, ja $$2, @Nullable dpq $$3) {
      if ($$1 instanceof aqm) {
         a($$0, (aqm)$$1, $$2, $$3).forEach($$2x -> a((dcg)((aqm)$$1), $$2, $$2x));
         $$0.a((aqm)$$1, $$2, cud.l, true);
      }
   }

   public static void a(dsl $$0, dcg $$1, ja $$2, @Nullable dpq $$3, @Nullable bsh $$4, cud $$5) {
      if ($$1 instanceof aqm) {
         a($$0, (aqm)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((aqm)$$1, $$2, $$5, true);
      }
   }

   public static void a(dcg $$0, ja $$1, cud $$2) {
      double $$3 = (double)bsn.ag.m() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + ayg.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + ayg.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + ayg.a($$0.z, -0.25, 0.25);
      a($$0, () -> new civ($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(dcg $$0, ja $$1, jf $$2, cud $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bsn.ag.l() / 2.0;
      double $$8 = (double)bsn.ag.m() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? ayg.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? ayg.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? ayg.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? ayg.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? ayg.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? ayg.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new civ($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(dcg $$0, Supplier<civ> $$1, cud $$2) {
      if (!$$0.B && !$$2.e() && $$0.ab().b(dcc.h)) {
         civ $$3 = $$1.get();
         $$3.v();
         $$0.b($$3);
      }
   }

   protected void a(aqm $$0, ja $$1, int $$2) {
      if ($$0.ab().b(dcc.h)) {
         bss.a($$0, ewh.b($$1), $$2);
      }
   }

   public float e() {
      return this.aH;
   }

   public void a(dcg $$0, ja $$1, dby $$2) {
   }

   public void a(dcg $$0, ja $$1, dsl $$2, bsh $$3) {
   }

   @Nullable
   public dsl a(cxn $$0) {
      return this.o();
   }

   public void a(dcg $$0, cml $$1, ja $$2, dsl $$3, @Nullable dpq $$4, cud $$5) {
      $$1.b(avr.a.b(this));
      $$1.D(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(dcg $$0, ja $$1, dsl $$2, @Nullable btc $$3, cud $$4) {
   }

   public boolean a(dsl $$0) {
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

   public void a(dcg $$0, dsl $$1, ja $$2, bsh $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dS().l());
   }

   public void a(dbm $$0, bsh $$1) {
      $$1.j($$1.du().d(1.0, 0.0, 1.0));
   }

   public cud a(dcj $$0, ja $$1, dsl $$2) {
      return new cud(this);
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

   protected void a(dcg $$0, cml $$1, ja $$2, dsl $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public dsl a(dcg $$0, ja $$1, dsl $$2, cml $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(avw.aW)) {
         clc.a($$3, false);
      }

      $$0.a(dxh.f, $$1, dxh.a.a($$3, $$2));
      return $$2;
   }

   public void a(dsl $$0, dcg $$1, ja $$2, ddg.c $$3) {
   }

   public boolean a(dby $$0) {
      return true;
   }

   protected void a(dsm.a<dfi, dsl> $$0) {
   }

   public dsm<dfi, dsl> l() {
      return this.E;
   }

   protected final void k(dsl $$0) {
      this.d = $$0;
   }

   public final dsl o() {
      return this.d;
   }

   public final dsl l(dsl $$0) {
      dsl $$1 = this.o();

      for (dto<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dsl a(dsl $$0, dsl $$1, dto<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   @Override
   public cty r() {
      if (this.f == null) {
         this.f = cty.a(this);
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

   public void a(cud $$0, cty.b $$1, List<wu> $$2, cvw $$3) {
   }

   @Override
   protected dfi q() {
      return this;
   }

   protected ImmutableMap<dsl, exa> a(Function<dsl, exa> $$0) {
      return this.E.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public jj.c<dfi> s() {
      return this.b;
   }

   protected void a(aqm $$0, ja $$1, cud $$2, bpm $$3) {
      int $$4 = czo.b($$0, $$2, $$3.a($$0.E_()));
      if ($$4 > 0) {
         this.a($$0, $$1, $$4);
      }
   }

   public static final class a {
      private final dsl a;
      private final dsl b;
      private final jf c;

      public a(dsl $$0, dsl $$1, jf $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof dfi.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
