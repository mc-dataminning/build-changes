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

public class cvz extends dio implements csx {
   public static final MapCodec<cvz> p = b(cvz::new);
   private static final Logger a = LogUtils.getLogger();
   private final ie.c<cvz> b = kb.e.f(this);
   public static final il<dip> q = new il<>();
   private static final LoadingCache<elu, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<elu, Boolean>() {
      public Boolean a(elu $$0) {
         return !elr.c(elr.b(), $$0, elf.g);
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
   protected final diq<cvz, dip> E;
   private dip d;
   @Nullable
   private String e;
   @Nullable
   private cmc f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<cvz.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<cvz.a> $$0 = new Object2ByteLinkedOpenHashMap<cvz.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends cvz> a() {
      return p;
   }

   public static int i(@Nullable dip $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dip a(int $$0) {
      dip $$1 = q.a($$0);
      return $$1 == null ? cwb.a.o() : $$1;
   }

   public static cvz a(@Nullable cmc $$0) {
      return $$0 instanceof cka ? ((cka)$$0).e() : cwb.a;
   }

   public static dip a(dip $$0, dip $$1, csz $$2, hv $$3) {
      elu $$4 = elr.b($$0.k($$2, $$3), $$1.k($$2, $$3), elf.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (blf $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = elr.a(ia.a.b, $$6.cH().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static elu a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return elr.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dip b(dip $$0, csz $$1, hv $$2) {
      dip $$3 = $$0;
      hv.a $$4 = new hv.a();

      for (ia $$5 : aF) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(dip $$0, dip $$1, csz $$2, hv $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dip $$0, dip $$1, csz $$2, hv $$3, int $$4, int $$5) {
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

   public cvz(dio.d $$0) {
      super($$0);
      diq.a<cvz, dip> $$1 = new diq.a<>(this);
      this.a($$1);
      this.E = $$1.a(cvz::o, dip::new);
      this.k(this.E.b());
      if (aa.aW) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean j(dip $$0) {
      return $$0.b() instanceof dai || $$0.a(cwb.hW) || $$0.a(cwb.ee) || $$0.a(cwb.ef) || $$0.a(cwb.fa) || $$0.a(cwb.eZ) || $$0.a(arr.aQ);
   }

   public boolean e_(dip $$0) {
      return this.aI;
   }

   public static boolean a(dip $$0, cse $$1, hv $$2, ia $$3, hv $$4) {
      dip $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.p()) {
         cvz.a $$6 = new cvz.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<cvz.a> $$7 = h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            elu $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.c()) {
               return true;
            } else {
               elu $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = elr.c($$9, $$10, elf.e);
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

   public static boolean c(cse $$0, hv $$1) {
      return $$0.a_($$1).a($$0, $$1, ia.b, ddz.c);
   }

   public static boolean a(ctb $$0, hv $$1, ia $$2) {
      dip $$3 = $$0.a_($$1);
      return $$2 == ia.a && $$3.a(arr.aY) ? false : $$3.a($$0, $$1, $$2, ddz.b);
   }

   public static boolean a(elu $$0, ia $$1) {
      elu $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(elu $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public boolean a_(dip $$0, cse $$1, hv $$2) {
      return !a($$0.j($$1, $$2)) && $$0.u().c();
   }

   public void a(dip $$0, csy $$1, hv $$2, auf $$3) {
   }

   public void a(csz $$0, hv $$1, dip $$2) {
   }

   public static List<cmh> a(dip $$0, amp $$1, hv $$2, @Nullable dgd $$3) {
      egk.a $$4 = new egk.a($$1).a(eip.f, elb.b($$2)).a(eip.i, cmh.f).b(eip.h, $$3);
      return $$0.a($$4);
   }

   public static List<cmh> a(dip $$0, amp $$1, hv $$2, @Nullable dgd $$3, @Nullable blf $$4, cmh $$5) {
      egk.a $$6 = new egk.a($$1).a(eip.f, elb.b($$2)).a(eip.i, $$5).b(eip.a, $$4).b(eip.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dip $$0, csy $$1, hv $$2) {
      if ($$1 instanceof amp) {
         a($$0, (amp)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((amp)$$1, $$2, cmh.f, true);
      }
   }

   public static void a(dip $$0, csz $$1, hv $$2, @Nullable dgd $$3) {
      if ($$1 instanceof amp) {
         a($$0, (amp)$$1, $$2, $$3).forEach($$2x -> a((csy)((amp)$$1), $$2, $$2x));
         $$0.a((amp)$$1, $$2, cmh.f, true);
      }
   }

   public static void a(dip $$0, csy $$1, hv $$2, @Nullable dgd $$3, @Nullable blf $$4, cmh $$5) {
      if ($$1 instanceof amp) {
         a($$0, (amp)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((amp)$$1, $$2, $$5, true);
      }
   }

   public static void a(csy $$0, hv $$1, cmh $$2) {
      double $$3 = (double)blj.ae.l() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + aty.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + aty.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + aty.a($$0.z, -0.25, 0.25);
      a($$0, () -> new cbe($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(csy $$0, hv $$1, ia $$2, cmh $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)blj.ae.k() / 2.0;
      double $$8 = (double)blj.ae.l() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? aty.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? aty.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? aty.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? aty.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? aty.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? aty.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new cbe($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(csy $$0, Supplier<cbe> $$1, cmh $$2) {
      if (!$$0.B && !$$2.b() && $$0.Y().b(csu.h)) {
         cbe $$3 = $$1.get();
         $$3.u();
         $$0.b($$3);
      }
   }

   protected void a(amp $$0, hv $$1, int $$2) {
      if ($$0.Y().b(csu.h)) {
         bll.a($$0, elb.b($$1), $$2);
      }
   }

   public float e() {
      return this.aH;
   }

   public void a(csy $$0, hv $$1, csq $$2) {
   }

   public void a(csy $$0, hv $$1, dip $$2, blf $$3) {
   }

   @Nullable
   public dip a(coq $$0) {
      return this.o();
   }

   public void a(csy $$0, cer $$1, hv $$2, dip $$3, @Nullable dgd $$4, cmh $$5) {
      $$1.b(arm.a.b(this));
      $$1.A(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(csy $$0, hv $$1, dip $$2, @Nullable blv $$3, cmh $$4) {
   }

   public boolean a(dip $$0) {
      return !$$0.e() && !$$0.k();
   }

   public vp f() {
      return vb.c(this.h());
   }

   public String h() {
      if (this.e == null) {
         this.e = ac.a("block", kb.e.b(this));
      }

      return this.e;
   }

   public void a(csy $$0, dip $$1, hv $$2, blf $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dN().k());
   }

   public void a(cse $$0, blf $$1) {
      $$1.g($$1.dp().d(1.0, 0.0, 1.0));
   }

   public cmh a(ctb $$0, hv $$1, dip $$2) {
      return new cmh(this);
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

   protected void a(csy $$0, cer $$1, hv $$2, dip $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public dip a(csy $$0, hv $$1, dip $$2, cer $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(arr.aV)) {
         cdi.a($$3, false);
      }

      $$0.a(dmz.f, $$1, dmz.a.a($$3, $$2));
      return $$2;
   }

   public void a(dip $$0, csy $$1, hv $$2, ctx.c $$3) {
   }

   public boolean a(csq $$0) {
      return true;
   }

   protected void a(diq.a<cvz, dip> $$0) {
   }

   public diq<cvz, dip> n() {
      return this.E;
   }

   protected final void k(dip $$0) {
      this.d = $$0;
   }

   public final dip o() {
      return this.d;
   }

   public final dip l(dip $$0) {
      dip $$1 = this.o();

      for (djs<?> $$2 : $$0.b().n().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dip a(dip $$0, dip $$1, djs<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   public ddl m(dip $$0) {
      return this.aJ;
   }

   @Override
   public cmc k() {
      if (this.f == null) {
         this.f = cmc.a(this);
      }

      return this.f;
   }

   public boolean p() {
      return this.aN;
   }

   @Override
   public String toString() {
      return "Block{" + kb.e.b(this) + "}";
   }

   public void a(cmh $$0, @Nullable cse $$1, List<vb> $$2, cny $$3) {
   }

   @Override
   protected cvz q() {
      return this;
   }

   protected ImmutableMap<dip, elu> a(Function<dip, elu> $$0) {
      return this.E.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public ie.c<cvz> r() {
      return this.b;
   }

   protected void a(amp $$0, hv $$1, cmh $$2, biq $$3) {
      if (cqu.a(cqw.v, $$2) == 0) {
         int $$4 = $$3.a($$0.z);
         if ($$4 > 0) {
            this.a($$0, $$1, $$4);
         }
      }
   }

   public static final class a {
      private final dip a;
      private final dip b;
      private final ia c;

      public a(dip $$0, dip $$1, ia $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof cvz.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
