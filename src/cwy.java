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

public class cwy extends djo implements ctw {
   public static final MapCodec<cwy> p = b(cwy::new);
   private static final Logger a = LogUtils.getLogger();
   private final ih.c<cwy> b = kd.e.f(this);
   public static final in<djp> q = new in<>();
   private static final LoadingCache<emv, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<emv, Boolean>() {
      public Boolean a(emv $$0) {
         return !ems.c(ems.b(), $$0, emg.g);
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
   protected final djq<cwy, djp> E;
   private djp d;
   @Nullable
   private String e;
   @Nullable
   private cnb f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<cwy.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<cwy.a> $$0 = new Object2ByteLinkedOpenHashMap<cwy.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends cwy> a() {
      return p;
   }

   public static int i(@Nullable djp $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static djp a(int $$0) {
      djp $$1 = q.a($$0);
      return $$1 == null ? cxa.a.o() : $$1;
   }

   public static cwy a(@Nullable cnb $$0) {
      return $$0 instanceof cla ? ((cla)$$0).e() : cxa.a;
   }

   public static djp a(djp $$0, djp $$1, cty $$2, hx $$3) {
      emv $$4 = ems.b($$0.k($$2, $$3), $$1.k($$2, $$3), emg.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (blw $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = ems.a(ic.a.b, $$6.cH().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static emv a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return ems.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static djp b(djp $$0, cty $$1, hx $$2) {
      djp $$3 = $$0;
      hx.a $$4 = new hx.a();

      for (ic $$5 : aF) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(djp $$0, djp $$1, cty $$2, hx $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(djp $$0, djp $$1, cty $$2, hx $$3, int $$4, int $$5) {
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

   public cwy(djo.d $$0) {
      super($$0);
      djq.a<cwy, djp> $$1 = new djq.a<>(this);
      this.a($$1);
      this.E = $$1.a(cwy::o, djp::new);
      this.k(this.E.b());
      if (aa.aW) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean j(djp $$0) {
      return $$0.b() instanceof dbh || $$0.a(cxa.hW) || $$0.a(cxa.ee) || $$0.a(cxa.ef) || $$0.a(cxa.fa) || $$0.a(cxa.eZ) || $$0.a(asi.aQ);
   }

   public boolean e_(djp $$0) {
      return this.aI;
   }

   public static boolean a(djp $$0, ctd $$1, hx $$2, ic $$3, hx $$4) {
      djp $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.p()) {
         cwy.a $$6 = new cwy.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<cwy.a> $$7 = h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            emv $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.c()) {
               return true;
            } else {
               emv $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = ems.c($$9, $$10, emg.e);
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

   public static boolean c(ctd $$0, hx $$1) {
      return $$0.a_($$1).a($$0, $$1, ic.b, dey.c);
   }

   public static boolean a(cua $$0, hx $$1, ic $$2) {
      djp $$3 = $$0.a_($$1);
      return $$2 == ic.a && $$3.a(asi.aY) ? false : $$3.a($$0, $$1, $$2, dey.b);
   }

   public static boolean a(emv $$0, ic $$1) {
      emv $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(emv $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public boolean a_(djp $$0, ctd $$1, hx $$2) {
      return !a($$0.j($$1, $$2)) && $$0.u().c();
   }

   public void a(djp $$0, ctx $$1, hx $$2, auw $$3) {
   }

   public void a(cty $$0, hx $$1, djp $$2) {
   }

   public static List<cng> a(djp $$0, ane $$1, hx $$2, @Nullable dhd $$3) {
      ehl.a $$4 = new ehl.a($$1).a(ejq.f, emc.b($$2)).a(ejq.i, cng.f).b(ejq.h, $$3);
      return $$0.a($$4);
   }

   public static List<cng> a(djp $$0, ane $$1, hx $$2, @Nullable dhd $$3, @Nullable blw $$4, cng $$5) {
      ehl.a $$6 = new ehl.a($$1).a(ejq.f, emc.b($$2)).a(ejq.i, $$5).b(ejq.a, $$4).b(ejq.h, $$3);
      return $$0.a($$6);
   }

   public static void c(djp $$0, ctx $$1, hx $$2) {
      if ($$1 instanceof ane) {
         a($$0, (ane)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((ane)$$1, $$2, cng.f, true);
      }
   }

   public static void a(djp $$0, cty $$1, hx $$2, @Nullable dhd $$3) {
      if ($$1 instanceof ane) {
         a($$0, (ane)$$1, $$2, $$3).forEach($$2x -> a((ctx)((ane)$$1), $$2, $$2x));
         $$0.a((ane)$$1, $$2, cng.f, true);
      }
   }

   public static void a(djp $$0, ctx $$1, hx $$2, @Nullable dhd $$3, @Nullable blw $$4, cng $$5) {
      if ($$1 instanceof ane) {
         a($$0, (ane)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((ane)$$1, $$2, $$5, true);
      }
   }

   public static void a(ctx $$0, hx $$1, cng $$2) {
      double $$3 = (double)bmc.af.l() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + aup.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + aup.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + aup.a($$0.z, -0.25, 0.25);
      a($$0, () -> new ccb($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(ctx $$0, hx $$1, ic $$2, cng $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bmc.af.k() / 2.0;
      double $$8 = (double)bmc.af.l() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? aup.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? aup.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? aup.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? aup.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? aup.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? aup.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new ccb($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(ctx $$0, Supplier<ccb> $$1, cng $$2) {
      if (!$$0.B && !$$2.b() && $$0.Z().b(ctt.h)) {
         ccb $$3 = $$1.get();
         $$3.u();
         $$0.b($$3);
      }
   }

   protected void a(ane $$0, hx $$1, int $$2) {
      if ($$0.Z().b(ctt.h)) {
         bme.a($$0, emc.b($$1), $$2);
      }
   }

   public float e() {
      return this.aH;
   }

   public void a(ctx $$0, hx $$1, ctp $$2) {
   }

   public void a(ctx $$0, hx $$1, djp $$2, blw $$3) {
   }

   @Nullable
   public djp a(cpp $$0) {
      return this.o();
   }

   public void a(ctx $$0, cfq $$1, hx $$2, djp $$3, @Nullable dhd $$4, cng $$5) {
      $$1.b(asd.a.b(this));
      $$1.z(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(ctx $$0, hx $$1, djp $$2, @Nullable bmo $$3, cng $$4) {
   }

   public boolean a(djp $$0) {
      return !$$0.e() && !$$0.k();
   }

   public vu f() {
      return vg.c(this.h());
   }

   public String h() {
      if (this.e == null) {
         this.e = ac.a("block", kd.e.b(this));
      }

      return this.e;
   }

   public void a(ctx $$0, djp $$1, hx $$2, blw $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dM().k());
   }

   public void a(ctd $$0, blw $$1) {
      $$1.g($$1.do().d(1.0, 0.0, 1.0));
   }

   public cng a(cua $$0, hx $$1, djp $$2) {
      return new cng(this);
   }

   public float i() {
      return this.aK;
   }

   public float k() {
      return this.aL;
   }

   public float l() {
      return this.aM;
   }

   protected void a(ctx $$0, cfq $$1, hx $$2, djp $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public djp a(ctx $$0, hx $$1, djp $$2, cfq $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(asi.aV)) {
         ceh.a($$3, false);
      }

      $$0.a(dnz.f, $$1, dnz.a.a($$3, $$2));
      return $$2;
   }

   public void a(djp $$0, ctx $$1, hx $$2, cuw.c $$3) {
   }

   public boolean a(ctp $$0) {
      return true;
   }

   protected void a(djq.a<cwy, djp> $$0) {
   }

   public djq<cwy, djp> n() {
      return this.E;
   }

   protected final void k(djp $$0) {
      this.d = $$0;
   }

   public final djp o() {
      return this.d;
   }

   public final djp l(djp $$0) {
      djp $$1 = this.o();

      for (dks<?> $$2 : $$0.b().n().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> djp a(djp $$0, djp $$1, dks<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   public dek m(djp $$0) {
      return this.aJ;
   }

   @Override
   public cnb j() {
      if (this.f == null) {
         this.f = cnb.a(this);
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

   public void a(cng $$0, @Nullable ctd $$1, List<vg> $$2, coy $$3) {
   }

   @Override
   protected cwy q() {
      return this;
   }

   protected ImmutableMap<djp, emv> a(Function<djp, emv> $$0) {
      return this.E.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public ih.c<cwy> r() {
      return this.b;
   }

   protected void a(ane $$0, hx $$1, cng $$2, bjh $$3) {
      if (crt.a(crv.v, $$2) == 0) {
         int $$4 = $$3.a($$0.z);
         if ($$4 > 0) {
            this.a($$0, $$1, $$4);
         }
      }
   }

   public static final class a {
      private final djp a;
      private final djp b;
      private final ic c;

      public a(djp $$0, djp $$1, ic $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof cwy.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
