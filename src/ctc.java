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

public class ctc extends dfc implements cqa {
   public static final MapCodec<ctc> p = b(ctc::new);
   private static final Logger a = LogUtils.getLogger();
   private final he.c<ctc> b = jb.f.f(this);
   public static final hk<dfd> q = new hk<>();
   private static final LoadingCache<eia, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<eia, Boolean>() {
      public Boolean a(eia $$0) {
         return !ehx.c(ehx.b(), $$0, ehl.g);
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
   protected final dfe<ctc, dfd> E;
   private dfd d;
   @Nullable
   private String e;
   @Nullable
   private cjg f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<ctc.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<ctc.a> $$0 = new Object2ByteLinkedOpenHashMap<ctc.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends ctc> a() {
      return p;
   }

   public static int i(@Nullable dfd $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dfd a(int $$0) {
      dfd $$1 = q.a($$0);
      return $$1 == null ? cte.a.o() : $$1;
   }

   public static ctc a(@Nullable cjg $$0) {
      return $$0 instanceof che ? ((che)$$0).e() : cte.a;
   }

   public static dfd a(dfd $$0, dfd $$1, cqc $$2, gw $$3) {
      eia $$4 = ehx.b($$0.k($$2, $$3), $$1.k($$2, $$3), ehl.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (biw $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = ehx.a(ha.a.b, $$6.cG().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.c(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static eia a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return ehx.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dfd b(dfd $$0, cqc $$1, gw $$2) {
      dfd $$3 = $$0;
      gw.a $$4 = new gw.a();

      for (ha $$5 : aF) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(dfd $$0, dfd $$1, cqc $$2, gw $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dfd $$0, dfd $$1, cqc $$2, gw $$3, int $$4, int $$5) {
      if ($$1 != $$0) {
         if ($$1.i()) {
            if (!$$2.w_()) {
               $$2.a($$3, ($$4 & 32) == 0, null, $$5);
            }
         } else {
            $$2.a($$3, $$1, $$4 & -33, $$5);
         }
      }
   }

   public ctc(dfc.d $$0) {
      super($$0);
      dfe.a<ctc, dfd> $$1 = new dfe.a<>(this);
      this.a($$1);
      this.E = $$1.a(ctc::o, dfd::new);
      this.k(this.E.b());
      if (aa.aT) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean j(dfd $$0) {
      return $$0.b() instanceof cxk || $$0.a(cte.hW) || $$0.a(cte.ee) || $$0.a(cte.ef) || $$0.a(cte.fa) || $$0.a(cte.eZ) || $$0.a(apv.aQ);
   }

   public boolean e_(dfd $$0) {
      return this.aI;
   }

   public static boolean a(dfd $$0, cph $$1, gw $$2, ha $$3, gw $$4) {
      dfd $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.p()) {
         ctc.a $$6 = new ctc.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<ctc.a> $$7 = h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            eia $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.c()) {
               return true;
            } else {
               eia $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = ehx.c($$9, $$10, ehl.e);
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

   public static boolean c(cph $$0, gw $$1) {
      return $$0.a_($$1).a($$0, $$1, ha.b, dbb.c);
   }

   public static boolean a(cqe $$0, gw $$1, ha $$2) {
      dfd $$3 = $$0.a_($$1);
      return $$2 == ha.a && $$3.a(apv.aY) ? false : $$3.a($$0, $$1, $$2, dbb.b);
   }

   public static boolean a(eia $$0, ha $$1) {
      eia $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(eia $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public boolean c(dfd $$0, cph $$1, gw $$2) {
      return !a($$0.j($$1, $$2)) && $$0.u().c();
   }

   public void a(dfd $$0, cqb $$1, gw $$2, ash $$3) {
   }

   public void a(cqc $$0, gw $$1, dfd $$2) {
   }

   public static List<cjl> a(dfd $$0, akt $$1, gw $$2, @Nullable dcz $$3) {
      ecq.a $$4 = new ecq.a($$1).a(eev.f, ehh.b($$2)).a(eev.i, cjl.b).b(eev.h, $$3);
      return $$0.a($$4);
   }

   public static List<cjl> a(dfd $$0, akt $$1, gw $$2, @Nullable dcz $$3, @Nullable biw $$4, cjl $$5) {
      ecq.a $$6 = new ecq.a($$1).a(eev.f, ehh.b($$2)).a(eev.i, $$5).b(eev.a, $$4).b(eev.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dfd $$0, cqb $$1, gw $$2) {
      if ($$1 instanceof akt) {
         a($$0, (akt)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((akt)$$1, $$2, cjl.b, true);
      }
   }

   public static void a(dfd $$0, cqc $$1, gw $$2, @Nullable dcz $$3) {
      if ($$1 instanceof akt) {
         a($$0, (akt)$$1, $$2, $$3).forEach($$2x -> a((cqb)((akt)$$1), $$2, $$2x));
         $$0.a((akt)$$1, $$2, cjl.b, true);
      }
   }

   public static void a(dfd $$0, cqb $$1, gw $$2, @Nullable dcz $$3, @Nullable biw $$4, cjl $$5) {
      if ($$1 instanceof akt) {
         a($$0, (akt)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((akt)$$1, $$2, $$5, true);
      }
   }

   public static void a(cqb $$0, gw $$1, cjl $$2) {
      double $$3 = (double)bja.ad.l() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + asb.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + asb.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + asb.a($$0.z, -0.25, 0.25);
      a($$0, () -> new byt($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(cqb $$0, gw $$1, ha $$2, cjl $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bja.ad.k() / 2.0;
      double $$8 = (double)bja.ad.l() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? asb.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? asb.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? asb.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? asb.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? asb.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? asb.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new byt($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(cqb $$0, Supplier<byt> $$1, cjl $$2) {
      if (!$$0.B && !$$2.b() && $$0.X().b(cpx.g)) {
         byt $$3 = $$1.get();
         $$3.t();
         $$0.b($$3);
      }
   }

   protected void a(akt $$0, gw $$1, int $$2) {
      if ($$0.X().b(cpx.g)) {
         bjc.a($$0, ehh.b($$1), $$2);
      }
   }

   public float e() {
      return this.aH;
   }

   public void a(cqb $$0, gw $$1, cpt $$2) {
   }

   public void a(cqb $$0, gw $$1, dfd $$2, biw $$3) {
   }

   @Nullable
   public dfd a(clt $$0) {
      return this.o();
   }

   public void a(cqb $$0, cca $$1, gw $$2, dfd $$3, @Nullable dcz $$4, cjl $$5) {
      $$1.b(apq.a.b(this));
      $$1.A(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(cqb $$0, gw $$1, dfd $$2, @Nullable bjm $$3, cjl $$4) {
   }

   public boolean a(dfd $$0) {
      return !$$0.e() && !$$0.k();
   }

   public tz f() {
      return tl.c(this.h());
   }

   public String h() {
      if (this.e == null) {
         this.e = ac.a("block", jb.f.b(this));
      }

      return this.e;
   }

   public void a(cqb $$0, dfd $$1, gw $$2, biw $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dM().k());
   }

   public void a(cph $$0, biw $$1) {
      $$1.f($$1.do().d(1.0, 0.0, 1.0));
   }

   public cjl a(cqe $$0, gw $$1, dfd $$2) {
      return new cjl(this);
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

   protected void a(cqb $$0, cca $$1, gw $$2, dfd $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public dfd a(cqb $$0, gw $$1, dfd $$2, cca $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(apv.aV)) {
         car.a($$3, false);
      }

      $$0.a(djn.f, $$1, djn.a.a($$3, $$2));
      return $$2;
   }

   public void a(dfd $$0, cqb $$1, gw $$2, cqz.c $$3) {
   }

   public boolean a(cpt $$0) {
      return true;
   }

   protected void a(dfe.a<ctc, dfd> $$0) {
   }

   public dfe<ctc, dfd> n() {
      return this.E;
   }

   protected final void k(dfd $$0) {
      this.d = $$0;
   }

   public final dfd o() {
      return this.d;
   }

   public final dfd l(dfd $$0) {
      dfd $$1 = this.o();

      for (dgg<?> $$2 : $$0.b().n().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dfd a(dfd $$0, dfd $$1, dgg<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   public dan m(dfd $$0) {
      return this.aJ;
   }

   @Override
   public cjg k() {
      if (this.f == null) {
         this.f = cjg.a(this);
      }

      return this.f;
   }

   public boolean p() {
      return this.aN;
   }

   @Override
   public String toString() {
      return "Block{" + jb.f.b(this) + "}";
   }

   public void a(cjl $$0, @Nullable cph $$1, List<tl> $$2, clc $$3) {
   }

   @Override
   protected ctc q() {
      return this;
   }

   protected ImmutableMap<dfd, eia> a(Function<dfd, eia> $$0) {
      return this.E.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public he.c<ctc> r() {
      return this.b;
   }

   protected void a(akt $$0, gw $$1, cjl $$2, bgj $$3) {
      if (cnw.a(cny.v, $$2) == 0) {
         int $$4 = $$3.a($$0.z);
         if ($$4 > 0) {
            this.a($$0, $$1, $$4);
         }
      }
   }

   public static final class a {
      private final dfd a;
      private final dfd b;
      private final ha c;

      public a(dfd $$0, dfd $$1, ha $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof ctc.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
