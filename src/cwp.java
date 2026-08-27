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

public class cwp extends djf implements ctn {
   public static final MapCodec<cwp> p = b(cwp::new);
   private static final Logger a = LogUtils.getLogger();
   private final ih.c<cwp> b = kd.e.f(this);
   public static final in<djg> q = new in<>();
   private static final LoadingCache<eml, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<eml, Boolean>() {
      public Boolean a(eml $$0) {
         return !emi.c(emi.b(), $$0, elw.g);
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
   protected final djh<cwp, djg> E;
   private djg d;
   @Nullable
   private String e;
   @Nullable
   private cms f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<cwp.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<cwp.a> $$0 = new Object2ByteLinkedOpenHashMap<cwp.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends cwp> a() {
      return p;
   }

   public static int i(@Nullable djg $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static djg a(int $$0) {
      djg $$1 = q.a($$0);
      return $$1 == null ? cwr.a.o() : $$1;
   }

   public static cwp a(@Nullable cms $$0) {
      return $$0 instanceof ckq ? ((ckq)$$0).e() : cwr.a;
   }

   public static djg a(djg $$0, djg $$1, ctp $$2, hx $$3) {
      eml $$4 = emi.b($$0.k($$2, $$3), $$1.k($$2, $$3), elw.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (blu $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = emi.a(ic.a.b, $$6.cH().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static eml a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return emi.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static djg b(djg $$0, ctp $$1, hx $$2) {
      djg $$3 = $$0;
      hx.a $$4 = new hx.a();

      for (ic $$5 : aF) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(djg $$0, djg $$1, ctp $$2, hx $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(djg $$0, djg $$1, ctp $$2, hx $$3, int $$4, int $$5) {
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

   public cwp(djf.d $$0) {
      super($$0);
      djh.a<cwp, djg> $$1 = new djh.a<>(this);
      this.a($$1);
      this.E = $$1.a(cwp::o, djg::new);
      this.k(this.E.b());
      if (aa.aW) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean j(djg $$0) {
      return $$0.b() instanceof day || $$0.a(cwr.hW) || $$0.a(cwr.ee) || $$0.a(cwr.ef) || $$0.a(cwr.fa) || $$0.a(cwr.eZ) || $$0.a(asg.aQ);
   }

   public boolean e_(djg $$0) {
      return this.aI;
   }

   public static boolean a(djg $$0, csu $$1, hx $$2, ic $$3, hx $$4) {
      djg $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.p()) {
         cwp.a $$6 = new cwp.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<cwp.a> $$7 = h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            eml $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.c()) {
               return true;
            } else {
               eml $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = emi.c($$9, $$10, elw.e);
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

   public static boolean c(csu $$0, hx $$1) {
      return $$0.a_($$1).a($$0, $$1, ic.b, dep.c);
   }

   public static boolean a(ctr $$0, hx $$1, ic $$2) {
      djg $$3 = $$0.a_($$1);
      return $$2 == ic.a && $$3.a(asg.aY) ? false : $$3.a($$0, $$1, $$2, dep.b);
   }

   public static boolean a(eml $$0, ic $$1) {
      eml $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(eml $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public boolean a_(djg $$0, csu $$1, hx $$2) {
      return !a($$0.j($$1, $$2)) && $$0.u().c();
   }

   public void a(djg $$0, cto $$1, hx $$2, auu $$3) {
   }

   public void a(ctp $$0, hx $$1, djg $$2) {
   }

   public static List<cmx> a(djg $$0, and $$1, hx $$2, @Nullable dgu $$3) {
      ehb.a $$4 = new ehb.a($$1).a(ejg.f, els.b($$2)).a(ejg.i, cmx.f).b(ejg.h, $$3);
      return $$0.a($$4);
   }

   public static List<cmx> a(djg $$0, and $$1, hx $$2, @Nullable dgu $$3, @Nullable blu $$4, cmx $$5) {
      ehb.a $$6 = new ehb.a($$1).a(ejg.f, els.b($$2)).a(ejg.i, $$5).b(ejg.a, $$4).b(ejg.h, $$3);
      return $$0.a($$6);
   }

   public static void c(djg $$0, cto $$1, hx $$2) {
      if ($$1 instanceof and) {
         a($$0, (and)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((and)$$1, $$2, cmx.f, true);
      }
   }

   public static void a(djg $$0, ctp $$1, hx $$2, @Nullable dgu $$3) {
      if ($$1 instanceof and) {
         a($$0, (and)$$1, $$2, $$3).forEach($$2x -> a((cto)((and)$$1), $$2, $$2x));
         $$0.a((and)$$1, $$2, cmx.f, true);
      }
   }

   public static void a(djg $$0, cto $$1, hx $$2, @Nullable dgu $$3, @Nullable blu $$4, cmx $$5) {
      if ($$1 instanceof and) {
         a($$0, (and)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((and)$$1, $$2, $$5, true);
      }
   }

   public static void a(cto $$0, hx $$1, cmx $$2) {
      double $$3 = (double)bly.ae.l() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + aun.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + aun.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + aun.a($$0.z, -0.25, 0.25);
      a($$0, () -> new cbt($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(cto $$0, hx $$1, ic $$2, cmx $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bly.ae.k() / 2.0;
      double $$8 = (double)bly.ae.l() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? aun.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? aun.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? aun.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? aun.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? aun.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? aun.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new cbt($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(cto $$0, Supplier<cbt> $$1, cmx $$2) {
      if (!$$0.B && !$$2.b() && $$0.Z().b(ctk.h)) {
         cbt $$3 = $$1.get();
         $$3.u();
         $$0.b($$3);
      }
   }

   protected void a(and $$0, hx $$1, int $$2) {
      if ($$0.Z().b(ctk.h)) {
         bma.a($$0, els.b($$1), $$2);
      }
   }

   public float e() {
      return this.aH;
   }

   public void a(cto $$0, hx $$1, ctg $$2) {
   }

   public void a(cto $$0, hx $$1, djg $$2, blu $$3) {
   }

   @Nullable
   public djg a(cpg $$0) {
      return this.o();
   }

   public void a(cto $$0, cfh $$1, hx $$2, djg $$3, @Nullable dgu $$4, cmx $$5) {
      $$1.b(asb.a.b(this));
      $$1.A(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(cto $$0, hx $$1, djg $$2, @Nullable bmk $$3, cmx $$4) {
   }

   public boolean a(djg $$0) {
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

   public void a(cto $$0, djg $$1, hx $$2, blu $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dN().k());
   }

   public void a(csu $$0, blu $$1) {
      $$1.g($$1.dp().d(1.0, 0.0, 1.0));
   }

   public cmx a(ctr $$0, hx $$1, djg $$2) {
      return new cmx(this);
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

   protected void a(cto $$0, cfh $$1, hx $$2, djg $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public djg a(cto $$0, hx $$1, djg $$2, cfh $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(asg.aV)) {
         cdy.a($$3, false);
      }

      $$0.a(dnq.f, $$1, dnq.a.a($$3, $$2));
      return $$2;
   }

   public void a(djg $$0, cto $$1, hx $$2, cun.c $$3) {
   }

   public boolean a(ctg $$0) {
      return true;
   }

   protected void a(djh.a<cwp, djg> $$0) {
   }

   public djh<cwp, djg> n() {
      return this.E;
   }

   protected final void k(djg $$0) {
      this.d = $$0;
   }

   public final djg o() {
      return this.d;
   }

   public final djg l(djg $$0) {
      djg $$1 = this.o();

      for (dkj<?> $$2 : $$0.b().n().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> djg a(djg $$0, djg $$1, dkj<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   public deb m(djg $$0) {
      return this.aJ;
   }

   @Override
   public cms k() {
      if (this.f == null) {
         this.f = cms.a(this);
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

   public void a(cmx $$0, @Nullable csu $$1, List<vf> $$2, cop $$3) {
   }

   @Override
   protected cwp q() {
      return this;
   }

   protected ImmutableMap<djg, eml> a(Function<djg, eml> $$0) {
      return this.E.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public ih.c<cwp> r() {
      return this.b;
   }

   protected void a(and $$0, hx $$1, cmx $$2, bjf $$3) {
      if (crk.a(crm.v, $$2) == 0) {
         int $$4 = $$3.a($$0.z);
         if ($$4 > 0) {
            this.a($$0, $$1, $$4);
         }
      }
   }

   public static final class a {
      private final djg a;
      private final djg b;
      private final ic c;

      public a(djg $$0, djg $$1, ic $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof cwp.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
