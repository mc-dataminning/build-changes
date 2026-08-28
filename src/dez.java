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

public class dez extends dsb implements dbx {
   public static final MapCodec<dez> p = b(dez::new);
   private static final Logger a = LogUtils.getLogger();
   private final ji.c<dez> b = lp.e.f(this);
   public static final jo<dsc> q = new jo<>();
   private static final LoadingCache<ewk, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<ewk, Boolean>() {
      public Boolean a(ewk $$0) {
         return !ewh.c(ewh.b(), $$0, evv.g);
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
   protected final dsd<dez, dsc> E;
   private dsc d;
   @Nullable
   private String e;
   @Nullable
   private cuk f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dez.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dez.a> $$0 = new Object2ByteLinkedOpenHashMap<dez.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends dez> a() {
      return p;
   }

   public static int i(@Nullable dsc $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dsc a(int $$0) {
      dsc $$1 = q.a($$0);
      return $$1 == null ? dfb.a.o() : $$1;
   }

   public static dez a(@Nullable cuk $$0) {
      return $$0 instanceof csn ? ((csn)$$0).d() : dfb.a;
   }

   public static dsc a(dsc $$0, dsc $$1, dbz $$2, iz $$3) {
      ewk $$4 = ewh.b($$0.k($$2, $$3), $$1.k($$2, $$3), evv.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (bsu $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = ewh.a(je.a.b, $$6.cK().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static ewk a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return ewh.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dsc b(dsc $$0, dbz $$1, iz $$2) {
      dsc $$3 = $$0;
      iz.a $$4 = new iz.a();

      for (je $$5 : aF) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(dsc $$0, dsc $$1, dbz $$2, iz $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dsc $$0, dsc $$1, dbz $$2, iz $$3, int $$4, int $$5) {
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

   public dez(dsb.d $$0) {
      super($$0);
      dsd.a<dez, dsc> $$1 = new dsd.a<>(this);
      this.a($$1);
      this.E = $$1.a(dez::o, dsc::new);
      this.k(this.E.b());
      if (aa.aX) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean j(dsc $$0) {
      return $$0.b() instanceof djj || $$0.a(dfb.hW) || $$0.a(dfb.ee) || $$0.a(dfb.ef) || $$0.a(dfb.fa) || $$0.a(dfb.eZ) || $$0.a(awp.aR);
   }

   public static boolean a(dsc $$0, dbe $$1, iz $$2, je $$3, iz $$4) {
      dsc $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.p()) {
         dez.a $$6 = new dez.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<dez.a> $$7 = h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            ewk $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.c()) {
               return true;
            } else {
               ewk $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = ewh.c($$9, $$10, evv.e);
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

   public static boolean c(dbe $$0, iz $$1) {
      return $$0.a_($$1).a($$0, $$1, je.b, dna.c);
   }

   public static boolean a(dcb $$0, iz $$1, je $$2) {
      dsc $$3 = $$0.a_($$1);
      return $$2 == je.a && $$3.a(awp.aZ) ? false : $$3.a($$0, $$1, $$2, dna.b);
   }

   public static boolean a(ewk $$0, je $$1) {
      ewk $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(ewk $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(dsc $$0, dby $$1, iz $$2, azh $$3) {
   }

   public void a(dbz $$0, iz $$1, dsc $$2) {
   }

   public static List<cup> a(dsc $$0, arf $$1, iz $$2, @Nullable dph $$3) {
      eql.a $$4 = new eql.a($$1).a(ete.f, evr.b($$2)).a(ete.i, cup.l).b(ete.h, $$3);
      return $$0.a($$4);
   }

   public static List<cup> a(dsc $$0, arf $$1, iz $$2, @Nullable dph $$3, @Nullable bsu $$4, cup $$5) {
      eql.a $$6 = new eql.a($$1).a(ete.f, evr.b($$2)).a(ete.i, $$5).b(ete.a, $$4).b(ete.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dsc $$0, dby $$1, iz $$2) {
      if ($$1 instanceof arf) {
         a($$0, (arf)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((arf)$$1, $$2, cup.l, true);
      }
   }

   public static void a(dsc $$0, dbz $$1, iz $$2, @Nullable dph $$3) {
      if ($$1 instanceof arf) {
         a($$0, (arf)$$1, $$2, $$3).forEach($$2x -> a((dby)((arf)$$1), $$2, $$2x));
         $$0.a((arf)$$1, $$2, cup.l, true);
      }
   }

   public static void a(dsc $$0, dby $$1, iz $$2, @Nullable dph $$3, @Nullable bsu $$4, cup $$5) {
      if ($$1 instanceof arf) {
         a($$0, (arf)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((arf)$$1, $$2, $$5, true);
      }
   }

   public static void a(dby $$0, iz $$1, cup $$2) {
      double $$3 = (double)bta.ag.m() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + ayz.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + ayz.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + ayz.a($$0.z, -0.25, 0.25);
      a($$0, () -> new cjh($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(dby $$0, iz $$1, je $$2, cup $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bta.ag.l() / 2.0;
      double $$8 = (double)bta.ag.m() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? ayz.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? ayz.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? ayz.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? ayz.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? ayz.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? ayz.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new cjh($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(dby $$0, Supplier<cjh> $$1, cup $$2) {
      if (!$$0.B && !$$2.e() && $$0.ab().b(dbu.h)) {
         cjh $$3 = $$1.get();
         $$3.v();
         $$0.b($$3);
      }
   }

   protected void a(arf $$0, iz $$1, int $$2) {
      if ($$0.ab().b(dbu.h)) {
         btf.a($$0, evr.b($$1), $$2);
      }
   }

   public float e() {
      return this.aH;
   }

   public void a(dby $$0, iz $$1, dbq $$2) {
   }

   public void a(dby $$0, iz $$1, dsc $$2, bsu $$3) {
   }

   @Nullable
   public dsc a(cya $$0) {
      return this.o();
   }

   public void a(dby $$0, cmx $$1, iz $$2, dsc $$3, @Nullable dph $$4, cup $$5) {
      $$1.b(awk.a.b(this));
      $$1.C(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(dby $$0, iz $$1, dsc $$2, @Nullable btp $$3, cup $$4) {
   }

   public boolean a(dsc $$0) {
      return !$$0.e() && !$$0.k();
   }

   public yd f() {
      return xp.c(this.g());
   }

   public String g() {
      if (this.e == null) {
         this.e = ac.a("block", lp.e.b(this));
      }

      return this.e;
   }

   public void a(dby $$0, dsc $$1, iz $$2, bsu $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dQ().k());
   }

   public void a(dbe $$0, bsu $$1) {
      $$1.h($$1.ds().d(1.0, 0.0, 1.0));
   }

   public cup a(dcb $$0, iz $$1, dsc $$2) {
      return new cup(this);
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

   protected void a(dby $$0, cmx $$1, iz $$2, dsc $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public dsc a(dby $$0, iz $$1, dsc $$2, cmx $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(awp.aW)) {
         clo.a($$3, false);
      }

      $$0.a(dwv.f, $$1, dwv.a.a($$3, $$2));
      return $$2;
   }

   public void a(dsc $$0, dby $$1, iz $$2, dcx.c $$3) {
   }

   public boolean a(dbq $$0) {
      return true;
   }

   protected void a(dsd.a<dez, dsc> $$0) {
   }

   public dsd<dez, dsc> l() {
      return this.E;
   }

   protected final void k(dsc $$0) {
      this.d = $$0;
   }

   public final dsc o() {
      return this.d;
   }

   public final dsc l(dsc $$0) {
      dsc $$1 = this.o();

      for (dtf<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dsc a(dsc $$0, dsc $$1, dtf<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   @Override
   public cuk r() {
      if (this.f == null) {
         this.f = cuk.a(this);
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

   public void a(cup $$0, cuk.b $$1, List<xp> $$2, cwi $$3) {
   }

   @Override
   protected dez q() {
      return this;
   }

   protected ImmutableMap<dsc, ewk> a(Function<dsc, ewk> $$0) {
      return this.E.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public ji.c<dez> s() {
      return this.b;
   }

   protected void a(arf $$0, iz $$1, cup $$2, bpz $$3) {
      if (dab.a(dad.v, $$2) == 0) {
         int $$4 = $$3.a($$0.z);
         if ($$4 > 0) {
            this.a($$0, $$1, $$4);
         }
      }
   }

   public static final class a {
      private final dsc a;
      private final dsc b;
      private final je c;

      public a(dsc $$0, dsc $$1, je $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof dez.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
