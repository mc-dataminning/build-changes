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

public class dea extends drc implements day {
   public static final MapCodec<dea> p = b(dea::new);
   private static final Logger a = LogUtils.getLogger();
   private final ix.c<dea> b = le.e.f(this);
   public static final jd<drd> q = new jd<>();
   private static final LoadingCache<evf, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<evf, Boolean>() {
      public Boolean a(evf $$0) {
         return !evc.c(evc.b(), $$0, euq.g);
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
   protected final dre<dea, drd> E;
   private drd d;
   @Nullable
   private String e;
   @Nullable
   private ctl f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dea.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dea.a> $$0 = new Object2ByteLinkedOpenHashMap<dea.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends dea> a() {
      return p;
   }

   public static int i(@Nullable drd $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static drd a(int $$0) {
      drd $$1 = q.a($$0);
      return $$1 == null ? dec.a.n() : $$1;
   }

   public static dea a(@Nullable ctl $$0) {
      return $$0 instanceof cro ? ((cro)$$0).d() : dec.a;
   }

   public static drd a(drd $$0, drd $$1, dba $$2, io $$3) {
      evf $$4 = evc.b($$0.k($$2, $$3), $$1.k($$2, $$3), euq.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (brw $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = evc.a(it.a.b, $$6.cK().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static evf a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return evc.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static drd b(drd $$0, dba $$1, io $$2) {
      drd $$3 = $$0;
      io.a $$4 = new io.a();

      for (it $$5 : aF) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(drd $$0, drd $$1, dba $$2, io $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(drd $$0, drd $$1, dba $$2, io $$3, int $$4, int $$5) {
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

   public dea(drc.d $$0) {
      super($$0);
      dre.a<dea, drd> $$1 = new dre.a<>(this);
      this.a($$1);
      this.E = $$1.a(dea::n, drd::new);
      this.k(this.E.b());
      if (aa.aX) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean j(drd $$0) {
      return $$0.b() instanceof dik || $$0.a(dec.hW) || $$0.a(dec.ee) || $$0.a(dec.ef) || $$0.a(dec.fa) || $$0.a(dec.eZ) || $$0.a(avx.aR);
   }

   public static boolean a(drd $$0, daf $$1, io $$2, it $$3, io $$4) {
      drd $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.p()) {
         dea.a $$6 = new dea.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<dea.a> $$7 = h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            evf $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.c()) {
               return true;
            } else {
               evf $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = evc.c($$9, $$10, euq.e);
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

   public static boolean c(daf $$0, io $$1) {
      return $$0.a_($$1).a($$0, $$1, it.b, dmb.c);
   }

   public static boolean a(dbc $$0, io $$1, it $$2) {
      drd $$3 = $$0.a_($$1);
      return $$2 == it.a && $$3.a(avx.aZ) ? false : $$3.a($$0, $$1, $$2, dmb.b);
   }

   public static boolean a(evf $$0, it $$1) {
      evf $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(evf $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(drd $$0, daz $$1, io $$2, aym $$3) {
   }

   public void a(dba $$0, io $$1, drd $$2) {
   }

   public static List<ctq> a(drd $$0, aqn $$1, io $$2, @Nullable doi $$3) {
      epk.a $$4 = new epk.a($$1).a(erz.f, eum.b($$2)).a(erz.i, ctq.i).b(erz.h, $$3);
      return $$0.a($$4);
   }

   public static List<ctq> a(drd $$0, aqn $$1, io $$2, @Nullable doi $$3, @Nullable brw $$4, ctq $$5) {
      epk.a $$6 = new epk.a($$1).a(erz.f, eum.b($$2)).a(erz.i, $$5).b(erz.a, $$4).b(erz.h, $$3);
      return $$0.a($$6);
   }

   public static void c(drd $$0, daz $$1, io $$2) {
      if ($$1 instanceof aqn) {
         a($$0, (aqn)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((aqn)$$1, $$2, ctq.i, true);
      }
   }

   public static void a(drd $$0, dba $$1, io $$2, @Nullable doi $$3) {
      if ($$1 instanceof aqn) {
         a($$0, (aqn)$$1, $$2, $$3).forEach($$2x -> a((daz)((aqn)$$1), $$2, $$2x));
         $$0.a((aqn)$$1, $$2, ctq.i, true);
      }
   }

   public static void a(drd $$0, daz $$1, io $$2, @Nullable doi $$3, @Nullable brw $$4, ctq $$5) {
      if ($$1 instanceof aqn) {
         a($$0, (aqn)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((aqn)$$1, $$2, $$5, true);
      }
   }

   public static void a(daz $$0, io $$1, ctq $$2) {
      double $$3 = (double)bsc.ag.m() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + ayf.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + ayf.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + ayf.a($$0.z, -0.25, 0.25);
      a($$0, () -> new cii($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(daz $$0, io $$1, it $$2, ctq $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bsc.ag.l() / 2.0;
      double $$8 = (double)bsc.ag.m() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? ayf.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? ayf.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? ayf.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? ayf.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? ayf.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? ayf.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new cii($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(daz $$0, Supplier<cii> $$1, ctq $$2) {
      if (!$$0.B && !$$2.e() && $$0.aa().b(dav.h)) {
         cii $$3 = $$1.get();
         $$3.v();
         $$0.b($$3);
      }
   }

   protected void a(aqn $$0, io $$1, int $$2) {
      if ($$0.aa().b(dav.h)) {
         bsg.a($$0, eum.b($$1), $$2);
      }
   }

   public float e() {
      return this.aH;
   }

   public void a(daz $$0, io $$1, dar $$2) {
   }

   public void a(daz $$0, io $$1, drd $$2, brw $$3) {
   }

   @Nullable
   public drd a(cxb $$0) {
      return this.n();
   }

   public void a(daz $$0, cly $$1, io $$2, drd $$3, @Nullable doi $$4, ctq $$5) {
      $$1.b(avs.a.b(this));
      $$1.C(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(daz $$0, io $$1, drd $$2, @Nullable bsq $$3, ctq $$4) {
   }

   public boolean a(drd $$0) {
      return !$$0.e() && !$$0.k();
   }

   public xl f() {
      return wx.c(this.g());
   }

   public String g() {
      if (this.e == null) {
         this.e = ac.a("block", le.e.b(this));
      }

      return this.e;
   }

   public void a(daz $$0, drd $$1, io $$2, brw $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dQ().k());
   }

   public void a(daf $$0, brw $$1) {
      $$1.g($$1.ds().d(1.0, 0.0, 1.0));
   }

   public ctq a(dbc $$0, io $$1, drd $$2) {
      return new ctq(this);
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

   protected void a(daz $$0, cly $$1, io $$2, drd $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public drd a(daz $$0, io $$1, drd $$2, cly $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(avx.aW)) {
         ckp.a($$3, false);
      }

      $$0.a(dvw.f, $$1, dvw.a.a($$3, $$2));
      return $$2;
   }

   public void a(drd $$0, daz $$1, io $$2, dby.c $$3) {
   }

   public boolean a(dar $$0) {
      return true;
   }

   protected void a(dre.a<dea, drd> $$0) {
   }

   public dre<dea, drd> l() {
      return this.E;
   }

   protected final void k(drd $$0) {
      this.d = $$0;
   }

   public final drd n() {
      return this.d;
   }

   public final drd l(drd $$0) {
      drd $$1 = this.n();

      for (dsg<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> drd a(drd $$0, drd $$1, dsg<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   @Override
   public ctl r() {
      if (this.f == null) {
         this.f = ctl.a(this);
      }

      return this.f;
   }

   public boolean o() {
      return this.aN;
   }

   @Override
   public String toString() {
      return "Block{" + le.e.b(this) + "}";
   }

   public void a(ctq $$0, ctl.b $$1, List<wx> $$2, cvj $$3) {
   }

   @Override
   protected dea p() {
      return this;
   }

   protected ImmutableMap<drd, evf> a(Function<drd, evf> $$0) {
      return this.E.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public ix.c<dea> q() {
      return this.b;
   }

   protected void a(aqn $$0, io $$1, ctq $$2, bpb $$3) {
      if (czc.a(cze.v, $$2) == 0) {
         int $$4 = $$3.a($$0.z);
         if ($$4 > 0) {
            this.a($$0, $$1, $$4);
         }
      }
   }

   public static final class a {
      private final drd a;
      private final drd b;
      private final it c;

      public a(drd $$0, drd $$1, it $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof dea.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
