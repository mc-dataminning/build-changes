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

public class dey extends dsa implements dbw {
   public static final MapCodec<dey> p = b(dey::new);
   private static final Logger a = LogUtils.getLogger();
   private final ji.c<dey> b = lp.e.f(this);
   public static final jo<dsb> q = new jo<>();
   private static final LoadingCache<ewj, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<ewj, Boolean>() {
      public Boolean a(ewj $$0) {
         return !ewg.c(ewg.b(), $$0, evu.g);
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
   protected final dsc<dey, dsb> E;
   private dsb d;
   @Nullable
   private String e;
   @Nullable
   private cuj f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dey.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dey.a> $$0 = new Object2ByteLinkedOpenHashMap<dey.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends dey> a() {
      return p;
   }

   public static int i(@Nullable dsb $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dsb a(int $$0) {
      dsb $$1 = q.a($$0);
      return $$1 == null ? dfa.a.o() : $$1;
   }

   public static dey a(@Nullable cuj $$0) {
      return $$0 instanceof csm ? ((csm)$$0).d() : dfa.a;
   }

   public static dsb a(dsb $$0, dsb $$1, dby $$2, iz $$3) {
      ewj $$4 = ewg.b($$0.k($$2, $$3), $$1.k($$2, $$3), evu.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (bst $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = ewg.a(je.a.b, $$6.cK().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static ewj a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return ewg.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dsb b(dsb $$0, dby $$1, iz $$2) {
      dsb $$3 = $$0;
      iz.a $$4 = new iz.a();

      for (je $$5 : aF) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(dsb $$0, dsb $$1, dby $$2, iz $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dsb $$0, dsb $$1, dby $$2, iz $$3, int $$4, int $$5) {
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

   public dey(dsa.d $$0) {
      super($$0);
      dsc.a<dey, dsb> $$1 = new dsc.a<>(this);
      this.a($$1);
      this.E = $$1.a(dey::o, dsb::new);
      this.k(this.E.b());
      if (aa.aX) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean j(dsb $$0) {
      return $$0.b() instanceof dji || $$0.a(dfa.hW) || $$0.a(dfa.ee) || $$0.a(dfa.ef) || $$0.a(dfa.fa) || $$0.a(dfa.eZ) || $$0.a(awo.aR);
   }

   public static boolean a(dsb $$0, dbd $$1, iz $$2, je $$3, iz $$4) {
      dsb $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.p()) {
         dey.a $$6 = new dey.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<dey.a> $$7 = h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            ewj $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.c()) {
               return true;
            } else {
               ewj $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = ewg.c($$9, $$10, evu.e);
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

   public static boolean c(dbd $$0, iz $$1) {
      return $$0.a_($$1).a($$0, $$1, je.b, dmz.c);
   }

   public static boolean a(dca $$0, iz $$1, je $$2) {
      dsb $$3 = $$0.a_($$1);
      return $$2 == je.a && $$3.a(awo.aZ) ? false : $$3.a($$0, $$1, $$2, dmz.b);
   }

   public static boolean a(ewj $$0, je $$1) {
      ewj $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(ewj $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(dsb $$0, dbx $$1, iz $$2, azg $$3) {
   }

   public void a(dby $$0, iz $$1, dsb $$2) {
   }

   public static List<cuo> a(dsb $$0, are $$1, iz $$2, @Nullable dpg $$3) {
      eqk.a $$4 = new eqk.a($$1).a(etd.f, evq.b($$2)).a(etd.i, cuo.l).b(etd.h, $$3);
      return $$0.a($$4);
   }

   public static List<cuo> a(dsb $$0, are $$1, iz $$2, @Nullable dpg $$3, @Nullable bst $$4, cuo $$5) {
      eqk.a $$6 = new eqk.a($$1).a(etd.f, evq.b($$2)).a(etd.i, $$5).b(etd.a, $$4).b(etd.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dsb $$0, dbx $$1, iz $$2) {
      if ($$1 instanceof are) {
         a($$0, (are)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((are)$$1, $$2, cuo.l, true);
      }
   }

   public static void a(dsb $$0, dby $$1, iz $$2, @Nullable dpg $$3) {
      if ($$1 instanceof are) {
         a($$0, (are)$$1, $$2, $$3).forEach($$2x -> a((dbx)((are)$$1), $$2, $$2x));
         $$0.a((are)$$1, $$2, cuo.l, true);
      }
   }

   public static void a(dsb $$0, dbx $$1, iz $$2, @Nullable dpg $$3, @Nullable bst $$4, cuo $$5) {
      if ($$1 instanceof are) {
         a($$0, (are)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((are)$$1, $$2, $$5, true);
      }
   }

   public static void a(dbx $$0, iz $$1, cuo $$2) {
      double $$3 = (double)bsz.ag.m() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + ayy.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + ayy.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + ayy.a($$0.z, -0.25, 0.25);
      a($$0, () -> new cjg($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(dbx $$0, iz $$1, je $$2, cuo $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bsz.ag.l() / 2.0;
      double $$8 = (double)bsz.ag.m() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? ayy.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? ayy.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? ayy.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? ayy.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? ayy.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? ayy.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new cjg($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(dbx $$0, Supplier<cjg> $$1, cuo $$2) {
      if (!$$0.B && !$$2.e() && $$0.ab().b(dbt.h)) {
         cjg $$3 = $$1.get();
         $$3.v();
         $$0.b($$3);
      }
   }

   protected void a(are $$0, iz $$1, int $$2) {
      if ($$0.ab().b(dbt.h)) {
         bte.a($$0, evq.b($$1), $$2);
      }
   }

   public float e() {
      return this.aH;
   }

   public void a(dbx $$0, iz $$1, dbp $$2) {
   }

   public void a(dbx $$0, iz $$1, dsb $$2, bst $$3) {
   }

   @Nullable
   public dsb a(cxz $$0) {
      return this.o();
   }

   public void a(dbx $$0, cmw $$1, iz $$2, dsb $$3, @Nullable dpg $$4, cuo $$5) {
      $$1.b(awj.a.b(this));
      $$1.C(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(dbx $$0, iz $$1, dsb $$2, @Nullable bto $$3, cuo $$4) {
   }

   public boolean a(dsb $$0) {
      return !$$0.e() && !$$0.k();
   }

   public yc f() {
      return xo.c(this.g());
   }

   public String g() {
      if (this.e == null) {
         this.e = ac.a("block", lp.e.b(this));
      }

      return this.e;
   }

   public void a(dbx $$0, dsb $$1, iz $$2, bst $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dQ().k());
   }

   public void a(dbd $$0, bst $$1) {
      $$1.h($$1.ds().d(1.0, 0.0, 1.0));
   }

   public cuo a(dca $$0, iz $$1, dsb $$2) {
      return new cuo(this);
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

   protected void a(dbx $$0, cmw $$1, iz $$2, dsb $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public dsb a(dbx $$0, iz $$1, dsb $$2, cmw $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(awo.aW)) {
         cln.a($$3, false);
      }

      $$0.a(dwu.f, $$1, dwu.a.a($$3, $$2));
      return $$2;
   }

   public void a(dsb $$0, dbx $$1, iz $$2, dcw.c $$3) {
   }

   public boolean a(dbp $$0) {
      return true;
   }

   protected void a(dsc.a<dey, dsb> $$0) {
   }

   public dsc<dey, dsb> l() {
      return this.E;
   }

   protected final void k(dsb $$0) {
      this.d = $$0;
   }

   public final dsb o() {
      return this.d;
   }

   public final dsb l(dsb $$0) {
      dsb $$1 = this.o();

      for (dte<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dsb a(dsb $$0, dsb $$1, dte<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   @Override
   public cuj r() {
      if (this.f == null) {
         this.f = cuj.a(this);
      }

      return this.f;
   }

   public boolean p() {
      return this.aN;
   }

   @Override
   public String toString() {
      return "Block{" + lp.e.b(this) + "}";
   }

   public void a(cuo $$0, cuj.b $$1, List<xo> $$2, cwh $$3) {
   }

   @Override
   protected dey q() {
      return this;
   }

   protected ImmutableMap<dsb, ewj> a(Function<dsb, ewj> $$0) {
      return this.E.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public ji.c<dey> s() {
      return this.b;
   }

   protected void a(are $$0, iz $$1, cuo $$2, bpy $$3) {
      if (daa.a(dac.v, $$2) == 0) {
         int $$4 = $$3.a($$0.z);
         if ($$4 > 0) {
            this.a($$0, $$1, $$4);
         }
      }
   }

   public static final class a {
      private final dsb a;
      private final dsb b;
      private final je c;

      public a(dsb $$0, dsb $$1, je $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof dey.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
