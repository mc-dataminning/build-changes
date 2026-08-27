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

public class cwj extends diz implements cth {
   public static final MapCodec<cwj> p = b(cwj::new);
   private static final Logger a = LogUtils.getLogger();
   private final ih.c<cwj> b = kd.e.f(this);
   public static final in<dja> q = new in<>();
   private static final LoadingCache<emf, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<emf, Boolean>() {
      public Boolean a(emf $$0) {
         return !emc.c(emc.b(), $$0, elq.g);
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
   protected final djb<cwj, dja> E;
   private dja d;
   @Nullable
   private String e;
   @Nullable
   private cmm f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<cwj.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<cwj.a> $$0 = new Object2ByteLinkedOpenHashMap<cwj.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends cwj> a() {
      return p;
   }

   public static int i(@Nullable dja $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dja a(int $$0) {
      dja $$1 = q.a($$0);
      return $$1 == null ? cwl.a.o() : $$1;
   }

   public static cwj a(@Nullable cmm $$0) {
      return $$0 instanceof ckk ? ((ckk)$$0).e() : cwl.a;
   }

   public static dja a(dja $$0, dja $$1, ctj $$2, hx $$3) {
      emf $$4 = emc.b($$0.k($$2, $$3), $$1.k($$2, $$3), elq.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (blp $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = emc.a(ic.a.b, $$6.cH().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static emf a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return emc.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dja b(dja $$0, ctj $$1, hx $$2) {
      dja $$3 = $$0;
      hx.a $$4 = new hx.a();

      for (ic $$5 : aF) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(dja $$0, dja $$1, ctj $$2, hx $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dja $$0, dja $$1, ctj $$2, hx $$3, int $$4, int $$5) {
      if ($$1 != $$0) {
         if ($$1.i()) {
            if (!$$2.y_()) {
               $$2.a($$3, ($$4 & 32) == 0, null, $$5);
            }
         } else {
            $$2.a($$3, $$1, $$4 & -33, $$5);
         }
      }
   }

   public cwj(diz.d $$0) {
      super($$0);
      djb.a<cwj, dja> $$1 = new djb.a<>(this);
      this.a($$1);
      this.E = $$1.a(cwj::o, dja::new);
      this.k(this.E.b());
      if (aa.aW) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean j(dja $$0) {
      return $$0.b() instanceof das || $$0.a(cwl.hW) || $$0.a(cwl.ee) || $$0.a(cwl.ef) || $$0.a(cwl.fa) || $$0.a(cwl.eZ) || $$0.a(asb.aQ);
   }

   public boolean e_(dja $$0) {
      return this.aI;
   }

   public static boolean a(dja $$0, cso $$1, hx $$2, ic $$3, hx $$4) {
      dja $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.p()) {
         cwj.a $$6 = new cwj.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<cwj.a> $$7 = h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            emf $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.c()) {
               return true;
            } else {
               emf $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = emc.c($$9, $$10, elq.e);
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

   public static boolean c(cso $$0, hx $$1) {
      return $$0.a_($$1).a($$0, $$1, ic.b, dej.c);
   }

   public static boolean a(ctl $$0, hx $$1, ic $$2) {
      dja $$3 = $$0.a_($$1);
      return $$2 == ic.a && $$3.a(asb.aY) ? false : $$3.a($$0, $$1, $$2, dej.b);
   }

   public static boolean a(emf $$0, ic $$1) {
      emf $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(emf $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public boolean a_(dja $$0, cso $$1, hx $$2) {
      return !a($$0.j($$1, $$2)) && $$0.u().c();
   }

   public void a(dja $$0, cti $$1, hx $$2, aup $$3) {
   }

   public void a(ctj $$0, hx $$1, dja $$2) {
   }

   public static List<cmr> a(dja $$0, amz $$1, hx $$2, @Nullable dgo $$3) {
      egv.a $$4 = new egv.a($$1).a(eja.f, elm.b($$2)).a(eja.i, cmr.f).b(eja.h, $$3);
      return $$0.a($$4);
   }

   public static List<cmr> a(dja $$0, amz $$1, hx $$2, @Nullable dgo $$3, @Nullable blp $$4, cmr $$5) {
      egv.a $$6 = new egv.a($$1).a(eja.f, elm.b($$2)).a(eja.i, $$5).b(eja.a, $$4).b(eja.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dja $$0, cti $$1, hx $$2) {
      if ($$1 instanceof amz) {
         a($$0, (amz)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((amz)$$1, $$2, cmr.f, true);
      }
   }

   public static void a(dja $$0, ctj $$1, hx $$2, @Nullable dgo $$3) {
      if ($$1 instanceof amz) {
         a($$0, (amz)$$1, $$2, $$3).forEach($$2x -> a((cti)((amz)$$1), $$2, $$2x));
         $$0.a((amz)$$1, $$2, cmr.f, true);
      }
   }

   public static void a(dja $$0, cti $$1, hx $$2, @Nullable dgo $$3, @Nullable blp $$4, cmr $$5) {
      if ($$1 instanceof amz) {
         a($$0, (amz)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((amz)$$1, $$2, $$5, true);
      }
   }

   public static void a(cti $$0, hx $$1, cmr $$2) {
      double $$3 = (double)blt.ae.l() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + aui.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + aui.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + aui.a($$0.z, -0.25, 0.25);
      a($$0, () -> new cbo($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(cti $$0, hx $$1, ic $$2, cmr $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)blt.ae.k() / 2.0;
      double $$8 = (double)blt.ae.l() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? aui.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? aui.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? aui.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? aui.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? aui.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? aui.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new cbo($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(cti $$0, Supplier<cbo> $$1, cmr $$2) {
      if (!$$0.B && !$$2.b() && $$0.Z().b(cte.h)) {
         cbo $$3 = $$1.get();
         $$3.u();
         $$0.b($$3);
      }
   }

   protected void a(amz $$0, hx $$1, int $$2) {
      if ($$0.Z().b(cte.h)) {
         blv.a($$0, elm.b($$1), $$2);
      }
   }

   public float e() {
      return this.aH;
   }

   public void a(cti $$0, hx $$1, cta $$2) {
   }

   public void a(cti $$0, hx $$1, dja $$2, blp $$3) {
   }

   @Nullable
   public dja a(cpa $$0) {
      return this.o();
   }

   public void a(cti $$0, cfb $$1, hx $$2, dja $$3, @Nullable dgo $$4, cmr $$5) {
      $$1.b(arw.a.b(this));
      $$1.A(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(cti $$0, hx $$1, dja $$2, @Nullable bmf $$3, cmr $$4) {
   }

   public boolean a(dja $$0) {
      return !$$0.e() && !$$0.k();
   }

   public vr f() {
      return vd.c(this.h());
   }

   public String h() {
      if (this.e == null) {
         this.e = ac.a("block", kd.e.b(this));
      }

      return this.e;
   }

   public void a(cti $$0, dja $$1, hx $$2, blp $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dN().k());
   }

   public void a(cso $$0, blp $$1) {
      $$1.g($$1.dp().d(1.0, 0.0, 1.0));
   }

   public cmr a(ctl $$0, hx $$1, dja $$2) {
      return new cmr(this);
   }

   public float i() {
      return this.aK;
   }

   public float j() {
      return this.aL;
   }

   public float l() {
      return this.aM;
   }

   protected void a(cti $$0, cfb $$1, hx $$2, dja $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public dja a(cti $$0, hx $$1, dja $$2, cfb $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(asb.aV)) {
         cds.a($$3, false);
      }

      $$0.a(dnk.f, $$1, dnk.a.a($$3, $$2));
      return $$2;
   }

   public void a(dja $$0, cti $$1, hx $$2, cuh.c $$3) {
   }

   public boolean a(cta $$0) {
      return true;
   }

   protected void a(djb.a<cwj, dja> $$0) {
   }

   public djb<cwj, dja> n() {
      return this.E;
   }

   protected final void k(dja $$0) {
      this.d = $$0;
   }

   public final dja o() {
      return this.d;
   }

   public final dja l(dja $$0) {
      dja $$1 = this.o();

      for (dkd<?> $$2 : $$0.b().n().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dja a(dja $$0, dja $$1, dkd<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   public ddv m(dja $$0) {
      return this.aJ;
   }

   @Override
   public cmm k() {
      if (this.f == null) {
         this.f = cmm.a(this);
      }

      return this.f;
   }

   public boolean p() {
      return this.aN;
   }

   @Override
   public String toString() {
      return "Block{" + kd.e.b(this) + "}";
   }

   public void a(cmr $$0, @Nullable cso $$1, List<vd> $$2, coi $$3) {
   }

   @Override
   protected cwj q() {
      return this;
   }

   protected ImmutableMap<dja, emf> a(Function<dja, emf> $$0) {
      return this.E.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public ih.c<cwj> r() {
      return this.b;
   }

   protected void a(amz $$0, hx $$1, cmr $$2, bja $$3) {
      if (cre.a(crg.v, $$2) == 0) {
         int $$4 = $$3.a($$0.z);
         if ($$4 > 0) {
            this.a($$0, $$1, $$4);
         }
      }
   }

   public static final class a {
      private final dja a;
      private final dja b;
      private final ic c;

      public a(dja $$0, dja $$1, ic $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof cwj.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
