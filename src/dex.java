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

public class dex extends drz implements dbv {
   public static final MapCodec<dex> p = b(dex::new);
   private static final Logger a = LogUtils.getLogger();
   private final ji.c<dex> b = lp.e.f(this);
   public static final jo<dsa> q = new jo<>();
   private static final LoadingCache<ewi, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<ewi, Boolean>() {
      public Boolean a(ewi $$0) {
         return !ewf.c(ewf.b(), $$0, evt.g);
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
   protected final dsb<dex, dsa> E;
   private dsa d;
   @Nullable
   private String e;
   @Nullable
   private cui f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dex.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dex.a> $$0 = new Object2ByteLinkedOpenHashMap<dex.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends dex> a() {
      return p;
   }

   public static int i(@Nullable dsa $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dsa a(int $$0) {
      dsa $$1 = q.a($$0);
      return $$1 == null ? dez.a.o() : $$1;
   }

   public static dex a(@Nullable cui $$0) {
      return $$0 instanceof csl ? ((csl)$$0).d() : dez.a;
   }

   public static dsa a(dsa $$0, dsa $$1, dbx $$2, iz $$3) {
      ewi $$4 = ewf.b($$0.k($$2, $$3), $$1.k($$2, $$3), evt.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (bss $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = ewf.a(je.a.b, $$6.cK().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static ewi a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return ewf.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dsa b(dsa $$0, dbx $$1, iz $$2) {
      dsa $$3 = $$0;
      iz.a $$4 = new iz.a();

      for (je $$5 : aF) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(dsa $$0, dsa $$1, dbx $$2, iz $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dsa $$0, dsa $$1, dbx $$2, iz $$3, int $$4, int $$5) {
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

   public dex(drz.d $$0) {
      super($$0);
      dsb.a<dex, dsa> $$1 = new dsb.a<>(this);
      this.a($$1);
      this.E = $$1.a(dex::o, dsa::new);
      this.k(this.E.b());
      if (aa.aX) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean j(dsa $$0) {
      return $$0.b() instanceof djh || $$0.a(dez.hW) || $$0.a(dez.ee) || $$0.a(dez.ef) || $$0.a(dez.fa) || $$0.a(dez.eZ) || $$0.a(awo.aR);
   }

   public static boolean a(dsa $$0, dbc $$1, iz $$2, je $$3, iz $$4) {
      dsa $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.p()) {
         dex.a $$6 = new dex.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<dex.a> $$7 = h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            ewi $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.c()) {
               return true;
            } else {
               ewi $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = ewf.c($$9, $$10, evt.e);
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

   public static boolean c(dbc $$0, iz $$1) {
      return $$0.a_($$1).a($$0, $$1, je.b, dmy.c);
   }

   public static boolean a(dbz $$0, iz $$1, je $$2) {
      dsa $$3 = $$0.a_($$1);
      return $$2 == je.a && $$3.a(awo.aZ) ? false : $$3.a($$0, $$1, $$2, dmy.b);
   }

   public static boolean a(ewi $$0, je $$1) {
      ewi $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(ewi $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(dsa $$0, dbw $$1, iz $$2, azf $$3) {
   }

   public void a(dbx $$0, iz $$1, dsa $$2) {
   }

   public static List<cun> a(dsa $$0, are $$1, iz $$2, @Nullable dpf $$3) {
      eqj.a $$4 = new eqj.a($$1).a(etc.f, evp.b($$2)).a(etc.i, cun.l).b(etc.h, $$3);
      return $$0.a($$4);
   }

   public static List<cun> a(dsa $$0, are $$1, iz $$2, @Nullable dpf $$3, @Nullable bss $$4, cun $$5) {
      eqj.a $$6 = new eqj.a($$1).a(etc.f, evp.b($$2)).a(etc.i, $$5).b(etc.a, $$4).b(etc.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dsa $$0, dbw $$1, iz $$2) {
      if ($$1 instanceof are) {
         a($$0, (are)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((are)$$1, $$2, cun.l, true);
      }
   }

   public static void a(dsa $$0, dbx $$1, iz $$2, @Nullable dpf $$3) {
      if ($$1 instanceof are) {
         a($$0, (are)$$1, $$2, $$3).forEach($$2x -> a((dbw)((are)$$1), $$2, $$2x));
         $$0.a((are)$$1, $$2, cun.l, true);
      }
   }

   public static void a(dsa $$0, dbw $$1, iz $$2, @Nullable dpf $$3, @Nullable bss $$4, cun $$5) {
      if ($$1 instanceof are) {
         a($$0, (are)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((are)$$1, $$2, $$5, true);
      }
   }

   public static void a(dbw $$0, iz $$1, cun $$2) {
      double $$3 = (double)bsy.ag.m() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + ayx.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + ayx.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + ayx.a($$0.z, -0.25, 0.25);
      a($$0, () -> new cjf($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(dbw $$0, iz $$1, je $$2, cun $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bsy.ag.l() / 2.0;
      double $$8 = (double)bsy.ag.m() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? ayx.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? ayx.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? ayx.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? ayx.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? ayx.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? ayx.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new cjf($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(dbw $$0, Supplier<cjf> $$1, cun $$2) {
      if (!$$0.B && !$$2.e() && $$0.ab().b(dbs.h)) {
         cjf $$3 = $$1.get();
         $$3.v();
         $$0.b($$3);
      }
   }

   protected void a(are $$0, iz $$1, int $$2) {
      if ($$0.ab().b(dbs.h)) {
         btd.a($$0, evp.b($$1), $$2);
      }
   }

   public float e() {
      return this.aH;
   }

   public void a(dbw $$0, iz $$1, dbo $$2) {
   }

   public void a(dbw $$0, iz $$1, dsa $$2, bss $$3) {
   }

   @Nullable
   public dsa a(cxy $$0) {
      return this.o();
   }

   public void a(dbw $$0, cmv $$1, iz $$2, dsa $$3, @Nullable dpf $$4, cun $$5) {
      $$1.b(awj.a.b(this));
      $$1.C(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(dbw $$0, iz $$1, dsa $$2, @Nullable btn $$3, cun $$4) {
   }

   public boolean a(dsa $$0) {
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

   public void a(dbw $$0, dsa $$1, iz $$2, bss $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dQ().k());
   }

   public void a(dbc $$0, bss $$1) {
      $$1.h($$1.ds().d(1.0, 0.0, 1.0));
   }

   public cun a(dbz $$0, iz $$1, dsa $$2) {
      return new cun(this);
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

   protected void a(dbw $$0, cmv $$1, iz $$2, dsa $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public dsa a(dbw $$0, iz $$1, dsa $$2, cmv $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(awo.aW)) {
         clm.a($$3, false);
      }

      $$0.a(dwt.f, $$1, dwt.a.a($$3, $$2));
      return $$2;
   }

   public void a(dsa $$0, dbw $$1, iz $$2, dcv.c $$3) {
   }

   public boolean a(dbo $$0) {
      return true;
   }

   protected void a(dsb.a<dex, dsa> $$0) {
   }

   public dsb<dex, dsa> l() {
      return this.E;
   }

   protected final void k(dsa $$0) {
      this.d = $$0;
   }

   public final dsa o() {
      return this.d;
   }

   public final dsa l(dsa $$0) {
      dsa $$1 = this.o();

      for (dtd<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dsa a(dsa $$0, dsa $$1, dtd<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   @Override
   public cui r() {
      if (this.f == null) {
         this.f = cui.a(this);
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

   public void a(cun $$0, cui.b $$1, List<xo> $$2, cwg $$3) {
   }

   @Override
   protected dex q() {
      return this;
   }

   protected ImmutableMap<dsa, ewi> a(Function<dsa, ewi> $$0) {
      return this.E.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public ji.c<dex> s() {
      return this.b;
   }

   protected void a(are $$0, iz $$1, cun $$2, bpx $$3) {
      if (czz.a(dab.v, $$2) == 0) {
         int $$4 = $$3.a($$0.z);
         if ($$4 > 0) {
            this.a($$0, $$1, $$4);
         }
      }
   }

   public static final class a {
      private final dsa a;
      private final dsa b;
      private final je c;

      public a(dsa $$0, dsa $$1, je $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof dex.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
