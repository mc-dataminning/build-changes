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

public class dfa extends dsc implements dby {
   public static final MapCodec<dfa> p = b(dfa::new);
   private static final Logger a = LogUtils.getLogger();
   private final ji.c<dfa> b = lp.e.f(this);
   public static final jo<dsd> q = new jo<>();
   private static final LoadingCache<ewl, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<ewl, Boolean>() {
      public Boolean a(ewl $$0) {
         return !ewi.c(ewi.b(), $$0, evw.g);
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
   protected final dse<dfa, dsd> E;
   private dsd d;
   @Nullable
   private String e;
   @Nullable
   private cul f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dfa.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dfa.a> $$0 = new Object2ByteLinkedOpenHashMap<dfa.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends dfa> a() {
      return p;
   }

   public static int i(@Nullable dsd $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dsd a(int $$0) {
      dsd $$1 = q.a($$0);
      return $$1 == null ? dfc.a.o() : $$1;
   }

   public static dfa a(@Nullable cul $$0) {
      return $$0 instanceof cso ? ((cso)$$0).d() : dfc.a;
   }

   public static dsd a(dsd $$0, dsd $$1, dca $$2, iz $$3) {
      ewl $$4 = ewi.b($$0.k($$2, $$3), $$1.k($$2, $$3), evw.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (bsv $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = ewi.a(je.a.b, $$6.cK().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static ewl a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return ewi.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dsd b(dsd $$0, dca $$1, iz $$2) {
      dsd $$3 = $$0;
      iz.a $$4 = new iz.a();

      for (je $$5 : aF) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(dsd $$0, dsd $$1, dca $$2, iz $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dsd $$0, dsd $$1, dca $$2, iz $$3, int $$4, int $$5) {
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

   public dfa(dsc.d $$0) {
      super($$0);
      dse.a<dfa, dsd> $$1 = new dse.a<>(this);
      this.a($$1);
      this.E = $$1.a(dfa::o, dsd::new);
      this.k(this.E.b());
      if (aa.aX) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean j(dsd $$0) {
      return $$0.b() instanceof djk || $$0.a(dfc.hW) || $$0.a(dfc.ee) || $$0.a(dfc.ef) || $$0.a(dfc.fa) || $$0.a(dfc.eZ) || $$0.a(awp.aR);
   }

   public static boolean a(dsd $$0, dbf $$1, iz $$2, je $$3, iz $$4) {
      dsd $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.p()) {
         dfa.a $$6 = new dfa.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<dfa.a> $$7 = h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            ewl $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.c()) {
               return true;
            } else {
               ewl $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = ewi.c($$9, $$10, evw.e);
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

   public static boolean c(dbf $$0, iz $$1) {
      return $$0.a_($$1).a($$0, $$1, je.b, dnb.c);
   }

   public static boolean a(dcc $$0, iz $$1, je $$2) {
      dsd $$3 = $$0.a_($$1);
      return $$2 == je.a && $$3.a(awp.aZ) ? false : $$3.a($$0, $$1, $$2, dnb.b);
   }

   public static boolean a(ewl $$0, je $$1) {
      ewl $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(ewl $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(dsd $$0, dbz $$1, iz $$2, azh $$3) {
   }

   public void a(dca $$0, iz $$1, dsd $$2) {
   }

   public static List<cuq> a(dsd $$0, arf $$1, iz $$2, @Nullable dpi $$3) {
      eqm.a $$4 = new eqm.a($$1).a(etf.f, evs.b($$2)).a(etf.i, cuq.l).b(etf.h, $$3);
      return $$0.a($$4);
   }

   public static List<cuq> a(dsd $$0, arf $$1, iz $$2, @Nullable dpi $$3, @Nullable bsv $$4, cuq $$5) {
      eqm.a $$6 = new eqm.a($$1).a(etf.f, evs.b($$2)).a(etf.i, $$5).b(etf.a, $$4).b(etf.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dsd $$0, dbz $$1, iz $$2) {
      if ($$1 instanceof arf) {
         a($$0, (arf)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((arf)$$1, $$2, cuq.l, true);
      }
   }

   public static void a(dsd $$0, dca $$1, iz $$2, @Nullable dpi $$3) {
      if ($$1 instanceof arf) {
         a($$0, (arf)$$1, $$2, $$3).forEach($$2x -> a((dbz)((arf)$$1), $$2, $$2x));
         $$0.a((arf)$$1, $$2, cuq.l, true);
      }
   }

   public static void a(dsd $$0, dbz $$1, iz $$2, @Nullable dpi $$3, @Nullable bsv $$4, cuq $$5) {
      if ($$1 instanceof arf) {
         a($$0, (arf)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((arf)$$1, $$2, $$5, true);
      }
   }

   public static void a(dbz $$0, iz $$1, cuq $$2) {
      double $$3 = (double)btb.ag.m() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + ayz.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + ayz.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + ayz.a($$0.z, -0.25, 0.25);
      a($$0, () -> new cji($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(dbz $$0, iz $$1, je $$2, cuq $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)btb.ag.l() / 2.0;
      double $$8 = (double)btb.ag.m() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? ayz.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? ayz.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? ayz.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? ayz.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? ayz.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? ayz.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new cji($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(dbz $$0, Supplier<cji> $$1, cuq $$2) {
      if (!$$0.B && !$$2.e() && $$0.ab().b(dbv.h)) {
         cji $$3 = $$1.get();
         $$3.v();
         $$0.b($$3);
      }
   }

   protected void a(arf $$0, iz $$1, int $$2) {
      if ($$0.ab().b(dbv.h)) {
         btg.a($$0, evs.b($$1), $$2);
      }
   }

   public float e() {
      return this.aH;
   }

   public void a(dbz $$0, iz $$1, dbr $$2) {
   }

   public void a(dbz $$0, iz $$1, dsd $$2, bsv $$3) {
   }

   @Nullable
   public dsd a(cyb $$0) {
      return this.o();
   }

   public void a(dbz $$0, cmy $$1, iz $$2, dsd $$3, @Nullable dpi $$4, cuq $$5) {
      $$1.b(awk.a.b(this));
      $$1.C(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(dbz $$0, iz $$1, dsd $$2, @Nullable btq $$3, cuq $$4) {
   }

   public boolean a(dsd $$0) {
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

   public void a(dbz $$0, dsd $$1, iz $$2, bsv $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dQ().k());
   }

   public void a(dbf $$0, bsv $$1) {
      $$1.h($$1.ds().d(1.0, 0.0, 1.0));
   }

   public cuq a(dcc $$0, iz $$1, dsd $$2) {
      return new cuq(this);
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

   protected void a(dbz $$0, cmy $$1, iz $$2, dsd $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public dsd a(dbz $$0, iz $$1, dsd $$2, cmy $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(awp.aW)) {
         clp.a($$3, false);
      }

      $$0.a(dww.f, $$1, dww.a.a($$3, $$2));
      return $$2;
   }

   public void a(dsd $$0, dbz $$1, iz $$2, dcy.c $$3) {
   }

   public boolean a(dbr $$0) {
      return true;
   }

   protected void a(dse.a<dfa, dsd> $$0) {
   }

   public dse<dfa, dsd> l() {
      return this.E;
   }

   protected final void k(dsd $$0) {
      this.d = $$0;
   }

   public final dsd o() {
      return this.d;
   }

   public final dsd l(dsd $$0) {
      dsd $$1 = this.o();

      for (dtg<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dsd a(dsd $$0, dsd $$1, dtg<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   @Override
   public cul r() {
      if (this.f == null) {
         this.f = cul.a(this);
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

   public void a(cuq $$0, cul.b $$1, List<xp> $$2, cwj $$3) {
   }

   @Override
   protected dfa q() {
      return this;
   }

   protected ImmutableMap<dsd, ewl> a(Function<dsd, ewl> $$0) {
      return this.E.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public ji.c<dfa> s() {
      return this.b;
   }

   protected void a(arf $$0, iz $$1, cuq $$2, bqa $$3) {
      if (dac.a(dae.v, $$2) == 0) {
         int $$4 = $$3.a($$0.z);
         if ($$4 > 0) {
            this.a($$0, $$1, $$4);
         }
      }
   }

   public static final class a {
      private final dsd a;
      private final dsd b;
      private final je c;

      public a(dsd $$0, dsd $$1, je $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof dfa.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
