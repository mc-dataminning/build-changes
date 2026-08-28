import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dfb extends der {
   public static final MapCodec<dfb> a = b(dfb::new);
   public static final dtb b = djb.aE;
   public static final dtf<dsv> c = dsx.V;
   public static final dsy d = dsx.w;
   private static final ews f = dff.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final ews g = dff.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final ews h = dff.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final ews i = dff.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final ews j = ewp.a(i, h);
   private static final ews k = ewp.a(j, dff.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final ews l = ewp.a(j, dff.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final ews m = ewp.a(j, dff.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final ews n = ewp.a(j, dff.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final ews o = ewp.a(j, dff.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final ews F = ewp.a(j, dff.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final ews G = ewp.a(j, dff.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<dfb> a() {
      return a;
   }

   public dfb(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jf.c).a(c, dsv.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dff $$3, ja $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(dcd $$0, dsh $$1, evv $$2, cmz $$3) {
      bsd $$4 = $$3.s();
      cmh $$5 = $$4 instanceof cmh ? (cmh)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      return this.a($$1, $$0, $$4, $$3, true) ? bqd.a($$1.B) : bqd.e;
   }

   public boolean a(dcd $$0, dsh $$1, evv $$2, @Nullable cmh $$3, boolean $$4) {
      jf $$5 = $$2.b();
      ja $$6 = $$2.a();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.e().d - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(avp.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dsh $$0, jf $$1, double $$2) {
      if ($$1.o() != jf.a.b && !($$2 > 0.8124F)) {
         jf $$3 = $$0.c(b);
         dsv $$4 = $$0.c(c);
         switch ($$4) {
            case a:
               return $$3.o() == $$1.o();
            case c:
            case d:
               return $$3.o() != $$1.o();
            case b:
               return true;
            default:
               return false;
         }
      } else {
         return false;
      }
   }

   public boolean a(dcd $$0, ja $$1, @Nullable jf $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bsd $$0, dcd $$1, ja $$2, @Nullable jf $$3) {
      dpn $$4 = $$1.c_($$2);
      if (!$$1.B && $$4 instanceof dpl) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dpl)$$4).a($$3);
         $$1.a(null, $$2, avf.bZ, avg.e, 2.0F, 1.0F);
         $$1.a($$0, dxa.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private ews m(dsh $$0) {
      jf $$1 = $$0.c(b);
      dsv $$2 = $$0.c(c);
      if ($$2 == dsv.a) {
         return $$1 != jf.c && $$1 != jf.d ? g : f;
      } else if ($$2 == dsv.b) {
         return G;
      } else if ($$2 == dsv.d) {
         return $$1 != jf.c && $$1 != jf.d ? l : k;
      } else if ($$1 == jf.c) {
         return o;
      } else if ($$1 == jf.d) {
         return F;
      } else {
         return $$1 == jf.f ? n : m;
      }
   }

   @Override
   protected ews b(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return this.m($$0);
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return this.m($$0);
   }

   @Override
   protected dll a_(dsh $$0) {
      return dll.c;
   }

   @Nullable
   @Override
   public dsh a(cxk $$0) {
      jf $$1 = $$0.k();
      ja $$2 = $$0.a();
      dcd $$3 = $$0.q();
      jf.a $$4 = $$1.o();
      if ($$4 == jf.a.b) {
         dsh $$5 = this.o().a(c, $$1 == jf.a ? dsv.b : dsv.a).a(b, $$0.g());
         if ($$5.a((dcg)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == jf.a.a && $$3.a_($$2.g()).d($$3, $$2.g(), jf.f) && $$3.a_($$2.h()).d($$3, $$2.h(), jf.e)
            || $$4 == jf.a.c && $$3.a_($$2.e()).d($$3, $$2.e(), jf.d) && $$3.a_($$2.f()).d($$3, $$2.f(), jf.c);
         dsh $$7 = this.o().a(b, $$1.g()).a(c, $$6 ? dsv.d : dsv.c);
         if ($$7.a((dcg)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.d()).d($$3, $$2.d(), jf.b);
         $$7 = $$7.a(c, $$8 ? dsv.a : dsv.b);
         if ($$7.a((dcg)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dbv $$3, BiConsumer<cua, ja> $$4) {
      if ($$3.n()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      dsv $$6 = $$0.c(c);
      jf $$7 = n($$0).g();
      if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != dsv.d) {
         return dfh.a.o();
      } else {
         if ($$1.o() == $$0.c(b).o()) {
            if ($$6 == dsv.d && !$$2.d($$3, $$5, $$1)) {
               return $$0.a(c, dsv.c).a(b, $$1.g());
            }

            if ($$6 == dsv.c && $$7.g() == $$1 && $$2.d($$3, $$5, $$0.c(b))) {
               return $$0.a(c, dsv.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      jf $$3 = n($$0).g();
      return $$3 == jf.b ? dff.a($$1, $$2.c(), jf.a) : dhz.b($$1, $$2, $$3);
   }

   private static jf n(dsh $$0) {
      switch ((dsv)$$0.c(c)) {
         case a:
            return jf.b;
         case b:
            return jf.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new dpl($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpn> dpo<T> a(dcd $$0, dsh $$1, dpp<T> $$2) {
      return a($$2, dpp.E, $$0.B ? dpl::a : dpl::b);
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }

   @Override
   public dsh a(dsh $$0, dls $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dsh a(dsh $$0, dkc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
