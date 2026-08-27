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

public class dch extends dph implements czf {
   public static final MapCodec<dch> p = b(dch::new);
   private static final Logger a = LogUtils.getLogger();
   private final in.c<dch> b = kt.e.f(this);
   public static final it<dpi> q = new it<>();
   private static final LoadingCache<etc, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<etc, Boolean>() {
      public Boolean a(etc $$0) {
         return !esz.c(esz.b(), $$0, esn.g);
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
   protected final dpj<dch, dpi> E;
   private dpi d;
   @Nullable
   private String e;
   @Nullable
   private crn f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dch.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dch.a> $$0 = new Object2ByteLinkedOpenHashMap<dch.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends dch> a() {
      return p;
   }

   public static int i(@Nullable dpi $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dpi a(int $$0) {
      dpi $$1 = q.a($$0);
      return $$1 == null ? dcj.a.n() : $$1;
   }

   public static dch a(@Nullable crn $$0) {
      return $$0 instanceof cpq ? ((cpq)$$0).d() : dcj.a;
   }

   public static dpi a(dpi $$0, dpi $$1, czh $$2, id $$3) {
      etc $$4 = esz.b($$0.k($$2, $$3), $$1.k($$2, $$3), esn.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (bqa $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = esz.a(ij.a.b, $$6.cH().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static etc a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return esz.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dpi b(dpi $$0, czh $$1, id $$2) {
      dpi $$3 = $$0;
      id.a $$4 = new id.a();

      for (ij $$5 : aF) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(dpi $$0, dpi $$1, czh $$2, id $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dpi $$0, dpi $$1, czh $$2, id $$3, int $$4, int $$5) {
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

   public dch(dph.d $$0) {
      super($$0);
      dpj.a<dch, dpi> $$1 = new dpj.a<>(this);
      this.a($$1);
      this.E = $$1.a(dch::n, dpi::new);
      this.k(this.E.b());
      if (aa.aW) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean j(dpi $$0) {
      return $$0.b() instanceof dgq || $$0.a(dcj.hW) || $$0.a(dcj.ee) || $$0.a(dcj.ef) || $$0.a(dcj.fa) || $$0.a(dcj.eZ) || $$0.a(ave.aR);
   }

   public static boolean a(dpi $$0, cym $$1, id $$2, ij $$3, id $$4) {
      dpi $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.p()) {
         dch.a $$6 = new dch.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<dch.a> $$7 = h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            etc $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.c()) {
               return true;
            } else {
               etc $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = esz.c($$9, $$10, esn.e);
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

   public static boolean c(cym $$0, id $$1) {
      return $$0.a_($$1).a($$0, $$1, ij.b, dkh.c);
   }

   public static boolean a(czj $$0, id $$1, ij $$2) {
      dpi $$3 = $$0.a_($$1);
      return $$2 == ij.a && $$3.a(ave.aZ) ? false : $$3.a($$0, $$1, $$2, dkh.b);
   }

   public static boolean a(etc $$0, ij $$1) {
      etc $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(etc $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(dpi $$0, czg $$1, id $$2, axt $$3) {
   }

   public void a(czh $$0, id $$1, dpi $$2) {
   }

   public static List<crs> a(dpi $$0, apu $$1, id $$2, @Nullable dmo $$3) {
      enq.a $$4 = new enq.a($$1).a(epx.f, esj.b($$2)).a(epx.i, crs.i).b(epx.h, $$3);
      return $$0.a($$4);
   }

   public static List<crs> a(dpi $$0, apu $$1, id $$2, @Nullable dmo $$3, @Nullable bqa $$4, crs $$5) {
      enq.a $$6 = new enq.a($$1).a(epx.f, esj.b($$2)).a(epx.i, $$5).b(epx.a, $$4).b(epx.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dpi $$0, czg $$1, id $$2) {
      if ($$1 instanceof apu) {
         a($$0, (apu)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((apu)$$1, $$2, crs.i, true);
      }
   }

   public static void a(dpi $$0, czh $$1, id $$2, @Nullable dmo $$3) {
      if ($$1 instanceof apu) {
         a($$0, (apu)$$1, $$2, $$3).forEach($$2x -> a((czg)((apu)$$1), $$2, $$2x));
         $$0.a((apu)$$1, $$2, crs.i, true);
      }
   }

   public static void a(dpi $$0, czg $$1, id $$2, @Nullable dmo $$3, @Nullable bqa $$4, crs $$5) {
      if ($$1 instanceof apu) {
         a($$0, (apu)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((apu)$$1, $$2, $$5, true);
      }
   }

   public static void a(czg $$0, id $$1, crs $$2) {
      double $$3 = (double)bqg.ag.l() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + axm.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + axm.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + axm.a($$0.z, -0.25, 0.25);
      a($$0, () -> new cgk($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(czg $$0, id $$1, ij $$2, crs $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bqg.ag.k() / 2.0;
      double $$8 = (double)bqg.ag.l() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? axm.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? axm.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? axm.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? axm.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? axm.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? axm.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new cgk($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(czg $$0, Supplier<cgk> $$1, crs $$2) {
      if (!$$0.B && !$$2.d() && $$0.aa().b(czc.h)) {
         cgk $$3 = $$1.get();
         $$3.v();
         $$0.b($$3);
      }
   }

   protected void a(apu $$0, id $$1, int $$2) {
      if ($$0.aa().b(czc.h)) {
         bqj.a($$0, esj.b($$1), $$2);
      }
   }

   public float e() {
      return this.aH;
   }

   public void a(czg $$0, id $$1, cyy $$2) {
   }

   public void a(czg $$0, id $$1, dpi $$2, bqa $$3) {
   }

   @Nullable
   public dpi a(cux $$0) {
      return this.n();
   }

   public void a(czg $$0, cka $$1, id $$2, dpi $$3, @Nullable dmo $$4, crs $$5) {
      $$1.b(auz.a.b(this));
      $$1.C(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(czg $$0, id $$1, dpi $$2, @Nullable bqt $$3, crs $$4) {
   }

   public boolean a(dpi $$0) {
      return !$$0.e() && !$$0.k();
   }

   public ww f() {
      return wi.c(this.g());
   }

   public String g() {
      if (this.e == null) {
         this.e = ac.a("block", kt.e.b(this));
      }

      return this.e;
   }

   public void a(czg $$0, dpi $$1, id $$2, bqa $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dN().k());
   }

   public void a(cym $$0, bqa $$1) {
      $$1.g($$1.dp().d(1.0, 0.0, 1.0));
   }

   public crs a(czj $$0, id $$1, dpi $$2) {
      return new crs(this);
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

   protected void a(czg $$0, cka $$1, id $$2, dpi $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public dpi a(czg $$0, id $$1, dpi $$2, cka $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(ave.aW)) {
         cir.a($$3, false);
      }

      $$0.a(dub.f, $$1, dub.a.a($$3, $$2));
      return $$2;
   }

   public void a(dpi $$0, czg $$1, id $$2, daf.c $$3) {
   }

   public boolean a(cyy $$0) {
      return true;
   }

   protected void a(dpj.a<dch, dpi> $$0) {
   }

   public dpj<dch, dpi> l() {
      return this.E;
   }

   protected final void k(dpi $$0) {
      this.d = $$0;
   }

   public final dpi n() {
      return this.d;
   }

   public final dpi l(dpi $$0) {
      dpi $$1 = this.n();

      for (dql<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dpi a(dpi $$0, dpi $$1, dql<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   @Override
   public crn p() {
      if (this.f == null) {
         this.f = crn.a(this);
      }

      return this.f;
   }

   public boolean o() {
      return this.aN;
   }

   @Override
   public String toString() {
      return "Block{" + kt.e.b(this) + "}";
   }

   public void a(crs $$0, @Nullable cym $$1, List<wi> $$2, cti $$3, @Nullable jb $$4) {
   }

   @Override
   protected dch q() {
      return this;
   }

   protected ImmutableMap<dpi, etc> a(Function<dpi, etc> $$0) {
      return this.E.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public in.c<dch> r() {
      return this.b;
   }

   protected void a(apu $$0, id $$1, crs $$2, bnk $$3) {
      if (cxa.a(cxc.v, $$2) == 0) {
         int $$4 = $$3.a($$0.z);
         if ($$4 > 0) {
            this.a($$0, $$1, $$4);
         }
      }
   }

   public static final class a {
      private final dpi a;
      private final dpi b;
      private final ij c;

      public a(dpi $$0, dpi $$1, ij $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof dch.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
