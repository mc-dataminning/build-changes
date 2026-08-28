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

public class dff extends dsg implements dcc {
   public static final MapCodec<dff> p = b(dff::new);
   private static final Logger a = LogUtils.getLogger();
   private final jj.c<dff> b = lq.e.f(this);
   public static final jp<dsh> q = new jp<>();
   private static final LoadingCache<ews, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<ews, Boolean>() {
      public Boolean a(ews $$0) {
         return !ewp.c(ewp.b(), $$0, ewd.g);
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
   protected final dsi<dff, dsh> E;
   private dsh d;
   @Nullable
   private String e;
   @Nullable
   private ctv f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dff.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dff.a> $$0 = new Object2ByteLinkedOpenHashMap<dff.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends dff> a() {
      return p;
   }

   public static int i(@Nullable dsh $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dsh a(int $$0) {
      dsh $$1 = q.a($$0);
      return $$1 == null ? dfh.a.o() : $$1;
   }

   public static dff a(@Nullable ctv $$0) {
      return $$0 instanceof cry ? ((cry)$$0).d() : dfh.a;
   }

   public static dsh a(dsh $$0, dsh $$1, dce $$2, ja $$3) {
      ews $$4 = ewp.b($$0.k($$2, $$3), $$1.k($$2, $$3), ewd.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (bsd $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = ewp.a(jf.a.b, $$6.cK().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static ews a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return ewp.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dsh b(dsh $$0, dce $$1, ja $$2) {
      dsh $$3 = $$0;
      ja.a $$4 = new ja.a();

      for (jf $$5 : aF) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(dsh $$0, dsh $$1, dce $$2, ja $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dsh $$0, dsh $$1, dce $$2, ja $$3, int $$4, int $$5) {
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

   public dff(dsg.d $$0) {
      super($$0);
      dsi.a<dff, dsh> $$1 = new dsi.a<>(this);
      this.a($$1);
      this.E = $$1.a(dff::o, dsh::new);
      this.k(this.E.b());
      if (aa.aX) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean j(dsh $$0) {
      return $$0.b() instanceof djp || $$0.a(dfh.hW) || $$0.a(dfh.ee) || $$0.a(dfh.ef) || $$0.a(dfh.fa) || $$0.a(dfh.eZ) || $$0.a(avu.aR);
   }

   public static boolean a(dsh $$0, dbj $$1, ja $$2, jf $$3, ja $$4) {
      dsh $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.p()) {
         dff.a $$6 = new dff.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<dff.a> $$7 = h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            ews $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.c()) {
               return true;
            } else {
               ews $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = ewp.c($$9, $$10, ewd.e);
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

   public static boolean c(dbj $$0, ja $$1) {
      return $$0.a_($$1).a($$0, $$1, jf.b, dng.c);
   }

   public static boolean a(dcg $$0, ja $$1, jf $$2) {
      dsh $$3 = $$0.a_($$1);
      return $$2 == jf.a && $$3.a(avu.aZ) ? false : $$3.a($$0, $$1, $$2, dng.b);
   }

   public static boolean a(ews $$0, jf $$1) {
      ews $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(ews $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(dsh $$0, dcd $$1, ja $$2, aym $$3) {
   }

   public void a(dce $$0, ja $$1, dsh $$2) {
   }

   public static List<cua> a(dsh $$0, aqk $$1, ja $$2, @Nullable dpn $$3) {
      eqr.a $$4 = new eqr.a($$1).a(etk.f, evz.b($$2)).a(etk.i, cua.l).b(etk.h, $$3);
      return $$0.a($$4);
   }

   public static List<cua> a(dsh $$0, aqk $$1, ja $$2, @Nullable dpn $$3, @Nullable bsd $$4, cua $$5) {
      eqr.a $$6 = new eqr.a($$1).a(etk.f, evz.b($$2)).a(etk.i, $$5).b(etk.a, $$4).b(etk.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dsh $$0, dcd $$1, ja $$2) {
      if ($$1 instanceof aqk) {
         a($$0, (aqk)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((aqk)$$1, $$2, cua.l, true);
      }
   }

   public static void a(dsh $$0, dce $$1, ja $$2, @Nullable dpn $$3) {
      if ($$1 instanceof aqk) {
         a($$0, (aqk)$$1, $$2, $$3).forEach($$2x -> a((dcd)((aqk)$$1), $$2, $$2x));
         $$0.a((aqk)$$1, $$2, cua.l, true);
      }
   }

   public static void a(dsh $$0, dcd $$1, ja $$2, @Nullable dpn $$3, @Nullable bsd $$4, cua $$5) {
      if ($$1 instanceof aqk) {
         a($$0, (aqk)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((aqk)$$1, $$2, $$5, true);
      }
   }

   public static void a(dcd $$0, ja $$1, cua $$2) {
      double $$3 = (double)bsj.ag.m() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + aye.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + aye.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + aye.a($$0.z, -0.25, 0.25);
      a($$0, () -> new cir($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(dcd $$0, ja $$1, jf $$2, cua $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bsj.ag.l() / 2.0;
      double $$8 = (double)bsj.ag.m() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? aye.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? aye.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? aye.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? aye.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? aye.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? aye.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new cir($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(dcd $$0, Supplier<cir> $$1, cua $$2) {
      if (!$$0.B && !$$2.e() && $$0.ab().b(dbz.h)) {
         cir $$3 = $$1.get();
         $$3.v();
         $$0.b($$3);
      }
   }

   protected void a(aqk $$0, ja $$1, int $$2) {
      if ($$0.ab().b(dbz.h)) {
         bso.a($$0, evz.b($$1), $$2);
      }
   }

   public float e() {
      return this.aH;
   }

   public void a(dcd $$0, ja $$1, dbv $$2) {
   }

   public void a(dcd $$0, ja $$1, dsh $$2, bsd $$3) {
   }

   @Nullable
   public dsh a(cxk $$0) {
      return this.o();
   }

   public void a(dcd $$0, cmh $$1, ja $$2, dsh $$3, @Nullable dpn $$4, cua $$5) {
      $$1.b(avp.a.b(this));
      $$1.D(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(dcd $$0, ja $$1, dsh $$2, @Nullable bsy $$3, cua $$4) {
   }

   public boolean a(dsh $$0) {
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

   public void a(dcd $$0, dsh $$1, ja $$2, bsd $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dQ().l());
   }

   public void a(dbj $$0, bsd $$1) {
      $$1.h($$1.ds().d(1.0, 0.0, 1.0));
   }

   public cua a(dcg $$0, ja $$1, dsh $$2) {
      return new cua(this);
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

   protected void a(dcd $$0, cmh $$1, ja $$2, dsh $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public dsh a(dcd $$0, ja $$1, dsh $$2, cmh $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(avu.aW)) {
         cky.a($$3, false);
      }

      $$0.a(dxa.f, $$1, dxa.a.a($$3, $$2));
      return $$2;
   }

   public void a(dsh $$0, dcd $$1, ja $$2, ddd.c $$3) {
   }

   public boolean a(dbv $$0) {
      return true;
   }

   protected void a(dsi.a<dff, dsh> $$0) {
   }

   public dsi<dff, dsh> l() {
      return this.E;
   }

   protected final void k(dsh $$0) {
      this.d = $$0;
   }

   public final dsh o() {
      return this.d;
   }

   public final dsh l(dsh $$0) {
      dsh $$1 = this.o();

      for (dtk<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dsh a(dsh $$0, dsh $$1, dtk<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   @Override
   public ctv r() {
      if (this.f == null) {
         this.f = ctv.a(this);
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

   public void a(cua $$0, ctv.b $$1, List<wu> $$2, cvt $$3) {
   }

   @Override
   protected dff q() {
      return this;
   }

   protected ImmutableMap<dsh, ews> a(Function<dsh, ews> $$0) {
      return this.E.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public jj.c<dff> s() {
      return this.b;
   }

   protected void a(aqk $$0, ja $$1, cua $$2, bpi $$3) {
      int $$4 = czl.b($$0, $$2, $$3.a($$0.E_()));
      if ($$4 > 0) {
         this.a($$0, $$1, $$4);
      }
   }

   public static final class a {
      private final dsh a;
      private final dsh b;
      private final jf c;

      public a(dsh $$0, dsh $$1, jf $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof dff.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
