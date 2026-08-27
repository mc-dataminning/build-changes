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

public class cwq extends djg implements cto {
   public static final MapCodec<cwq> p = b(cwq::new);
   private static final Logger a = LogUtils.getLogger();
   private final ih.c<cwq> b = kd.e.f(this);
   public static final in<djh> q = new in<>();
   private static final LoadingCache<emm, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<emm, Boolean>() {
      public Boolean a(emm $$0) {
         return !emj.c(emj.b(), $$0, elx.g);
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
   protected final dji<cwq, djh> E;
   private djh d;
   @Nullable
   private String e;
   @Nullable
   private cmt f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<cwq.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<cwq.a> $$0 = new Object2ByteLinkedOpenHashMap<cwq.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends cwq> a() {
      return p;
   }

   public static int i(@Nullable djh $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static djh a(int $$0) {
      djh $$1 = q.a($$0);
      return $$1 == null ? cws.a.o() : $$1;
   }

   public static cwq a(@Nullable cmt $$0) {
      return $$0 instanceof ckr ? ((ckr)$$0).e() : cws.a;
   }

   public static djh a(djh $$0, djh $$1, ctq $$2, hx $$3) {
      emm $$4 = emj.b($$0.k($$2, $$3), $$1.k($$2, $$3), elx.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (blv $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = emj.a(ic.a.b, $$6.cH().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static emm a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return emj.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static djh b(djh $$0, ctq $$1, hx $$2) {
      djh $$3 = $$0;
      hx.a $$4 = new hx.a();

      for (ic $$5 : aF) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(djh $$0, djh $$1, ctq $$2, hx $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(djh $$0, djh $$1, ctq $$2, hx $$3, int $$4, int $$5) {
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

   public cwq(djg.d $$0) {
      super($$0);
      dji.a<cwq, djh> $$1 = new dji.a<>(this);
      this.a($$1);
      this.E = $$1.a(cwq::o, djh::new);
      this.k(this.E.b());
      if (aa.aW) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean j(djh $$0) {
      return $$0.b() instanceof daz || $$0.a(cws.hW) || $$0.a(cws.ee) || $$0.a(cws.ef) || $$0.a(cws.fa) || $$0.a(cws.eZ) || $$0.a(ash.aQ);
   }

   public boolean e_(djh $$0) {
      return this.aI;
   }

   public static boolean a(djh $$0, csv $$1, hx $$2, ic $$3, hx $$4) {
      djh $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.p()) {
         cwq.a $$6 = new cwq.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<cwq.a> $$7 = h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            emm $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.c()) {
               return true;
            } else {
               emm $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = emj.c($$9, $$10, elx.e);
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

   public static boolean c(csv $$0, hx $$1) {
      return $$0.a_($$1).a($$0, $$1, ic.b, deq.c);
   }

   public static boolean a(cts $$0, hx $$1, ic $$2) {
      djh $$3 = $$0.a_($$1);
      return $$2 == ic.a && $$3.a(ash.aY) ? false : $$3.a($$0, $$1, $$2, deq.b);
   }

   public static boolean a(emm $$0, ic $$1) {
      emm $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(emm $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public boolean a_(djh $$0, csv $$1, hx $$2) {
      return !a($$0.j($$1, $$2)) && $$0.u().c();
   }

   public void a(djh $$0, ctp $$1, hx $$2, auv $$3) {
   }

   public void a(ctq $$0, hx $$1, djh $$2) {
   }

   public static List<cmy> a(djh $$0, and $$1, hx $$2, @Nullable dgv $$3) {
      ehc.a $$4 = new ehc.a($$1).a(ejh.f, elt.b($$2)).a(ejh.i, cmy.f).b(ejh.h, $$3);
      return $$0.a($$4);
   }

   public static List<cmy> a(djh $$0, and $$1, hx $$2, @Nullable dgv $$3, @Nullable blv $$4, cmy $$5) {
      ehc.a $$6 = new ehc.a($$1).a(ejh.f, elt.b($$2)).a(ejh.i, $$5).b(ejh.a, $$4).b(ejh.h, $$3);
      return $$0.a($$6);
   }

   public static void c(djh $$0, ctp $$1, hx $$2) {
      if ($$1 instanceof and) {
         a($$0, (and)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((and)$$1, $$2, cmy.f, true);
      }
   }

   public static void a(djh $$0, ctq $$1, hx $$2, @Nullable dgv $$3) {
      if ($$1 instanceof and) {
         a($$0, (and)$$1, $$2, $$3).forEach($$2x -> a((ctp)((and)$$1), $$2, $$2x));
         $$0.a((and)$$1, $$2, cmy.f, true);
      }
   }

   public static void a(djh $$0, ctp $$1, hx $$2, @Nullable dgv $$3, @Nullable blv $$4, cmy $$5) {
      if ($$1 instanceof and) {
         a($$0, (and)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((and)$$1, $$2, $$5, true);
      }
   }

   public static void a(ctp $$0, hx $$1, cmy $$2) {
      double $$3 = (double)blz.ae.l() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + auo.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + auo.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + auo.a($$0.z, -0.25, 0.25);
      a($$0, () -> new cbu($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(ctp $$0, hx $$1, ic $$2, cmy $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)blz.ae.k() / 2.0;
      double $$8 = (double)blz.ae.l() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? auo.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? auo.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? auo.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? auo.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? auo.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? auo.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new cbu($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(ctp $$0, Supplier<cbu> $$1, cmy $$2) {
      if (!$$0.B && !$$2.b() && $$0.Z().b(ctl.h)) {
         cbu $$3 = $$1.get();
         $$3.u();
         $$0.b($$3);
      }
   }

   protected void a(and $$0, hx $$1, int $$2) {
      if ($$0.Z().b(ctl.h)) {
         bmb.a($$0, elt.b($$1), $$2);
      }
   }

   public float e() {
      return this.aH;
   }

   public void a(ctp $$0, hx $$1, cth $$2) {
   }

   public void a(ctp $$0, hx $$1, djh $$2, blv $$3) {
   }

   @Nullable
   public djh a(cph $$0) {
      return this.o();
   }

   public void a(ctp $$0, cfi $$1, hx $$2, djh $$3, @Nullable dgv $$4, cmy $$5) {
      $$1.b(asc.a.b(this));
      $$1.A(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(ctp $$0, hx $$1, djh $$2, @Nullable bml $$3, cmy $$4) {
   }

   public boolean a(djh $$0) {
      return !$$0.e() && !$$0.k();
   }

   public vt f() {
      return vf.c(this.h());
   }

   public String h() {
      if (this.e == null) {
         this.e = ac.a("block", kd.e.b(this));
      }

      return this.e;
   }

   public void a(ctp $$0, djh $$1, hx $$2, blv $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dN().k());
   }

   public void a(csv $$0, blv $$1) {
      $$1.g($$1.dp().d(1.0, 0.0, 1.0));
   }

   public cmy a(cts $$0, hx $$1, djh $$2) {
      return new cmy(this);
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

   protected void a(ctp $$0, cfi $$1, hx $$2, djh $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public djh a(ctp $$0, hx $$1, djh $$2, cfi $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(ash.aV)) {
         cdz.a($$3, false);
      }

      $$0.a(dnr.f, $$1, dnr.a.a($$3, $$2));
      return $$2;
   }

   public void a(djh $$0, ctp $$1, hx $$2, cuo.c $$3) {
   }

   public boolean a(cth $$0) {
      return true;
   }

   protected void a(dji.a<cwq, djh> $$0) {
   }

   public dji<cwq, djh> n() {
      return this.E;
   }

   protected final void k(djh $$0) {
      this.d = $$0;
   }

   public final djh o() {
      return this.d;
   }

   public final djh l(djh $$0) {
      djh $$1 = this.o();

      for (dkk<?> $$2 : $$0.b().n().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> djh a(djh $$0, djh $$1, dkk<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   public dec m(djh $$0) {
      return this.aJ;
   }

   @Override
   public cmt k() {
      if (this.f == null) {
         this.f = cmt.a(this);
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

   public void a(cmy $$0, @Nullable csv $$1, List<vf> $$2, coq $$3) {
   }

   @Override
   protected cwq q() {
      return this;
   }

   protected ImmutableMap<djh, emm> a(Function<djh, emm> $$0) {
      return this.E.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public ih.c<cwq> r() {
      return this.b;
   }

   protected void a(and $$0, hx $$1, cmy $$2, bjg $$3) {
      if (crl.a(crn.v, $$2) == 0) {
         int $$4 = $$3.a($$0.z);
         if ($$4 > 0) {
            this.a($$0, $$1, $$4);
         }
      }
   }

   public static final class a {
      private final djh a;
      private final djh b;
      private final ic c;

      public a(djh $$0, djh $$1, ic $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof cwq.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
