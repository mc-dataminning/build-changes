import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class cvv extends cvl {
   public static final MapCodec<cvv> a = b(cvv::new);
   public static final djj b = czu.aE;
   public static final djn<djd> c = djf.V;
   public static final djg d = djf.w;
   private static final elu f = cvz.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final elu g = cvz.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final elu h = cvz.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final elu i = cvz.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final elu j = elr.a(i, h);
   private static final elu k = elr.a(j, cvz.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final elu l = elr.a(j, cvz.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final elu m = elr.a(j, cvz.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final elu n = elr.a(j, cvz.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final elu o = elr.a(j, cvz.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final elu F = elr.a(j, cvz.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final elu G = elr.a(j, cvz.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<cvv> a() {
      return a;
   }

   public cvv(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ia.c).a(c, djd.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, cvz $$3, hv $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   public void a(csy $$0, dip $$1, ekx $$2, cfj $$3) {
      blf $$4 = $$3.w();
      cer $$5 = $$4 instanceof cer ? (cer)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      return this.a($$1, $$0, $$5, $$3, true) ? bjl.a($$1.B) : bjl.d;
   }

   public boolean a(csy $$0, dip $$1, ekx $$2, @Nullable cer $$3, boolean $$4) {
      ia $$5 = $$2.b();
      hv $$6 = $$2.a();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.e().d - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(arm.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dip $$0, ia $$1, double $$2) {
      if ($$1.o() != ia.a.b && !($$2 > 0.8124F)) {
         ia $$3 = $$0.c(b);
         djd $$4 = $$0.c(c);
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

   public boolean a(csy $$0, hv $$1, @Nullable ia $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable blf $$0, csy $$1, hv $$2, @Nullable ia $$3) {
      dgd $$4 = $$1.c_($$2);
      if (!$$1.B && $$4 instanceof dgb) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dgb)$$4).a($$3);
         $$1.a(null, $$2, arc.bK, ard.e, 2.0F, 1.0F);
         $$1.a($$0, dmz.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private elu h(dip $$0) {
      ia $$1 = $$0.c(b);
      djd $$2 = $$0.c(c);
      if ($$2 == djd.a) {
         return $$1 != ia.c && $$1 != ia.d ? g : f;
      } else if ($$2 == djd.b) {
         return G;
      } else if ($$2 == djd.d) {
         return $$1 != ia.c && $$1 != ia.d ? l : k;
      } else if ($$1 == ia.c) {
         return o;
      } else if ($$1 == ia.d) {
         return F;
      } else {
         return $$1 == ia.f ? n : m;
      }
   }

   @Override
   public elu b(dip $$0, cse $$1, hv $$2, elg $$3) {
      return this.h($$0);
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return this.h($$0);
   }

   @Override
   public dce b_(dip $$0) {
      return dce.c;
   }

   @Nullable
   @Override
   public dip a(coq $$0) {
      ia $$1 = $$0.k();
      hv $$2 = $$0.a();
      csy $$3 = $$0.q();
      ia.a $$4 = $$1.o();
      if ($$4 == ia.a.b) {
         dip $$5 = this.o().a(c, $$1 == ia.a ? djd.b : djd.a).a(b, $$0.g());
         if ($$5.a((ctb)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == ia.a.a && $$3.a_($$2.g()).d($$3, $$2.g(), ia.f) && $$3.a_($$2.h()).d($$3, $$2.h(), ia.e)
            || $$4 == ia.a.c && $$3.a_($$2.e()).d($$3, $$2.e(), ia.d) && $$3.a_($$2.f()).d($$3, $$2.f(), ia.c);
         dip $$7 = this.o().a(b, $$1.g()).a(c, $$6 ? djd.d : djd.c);
         if ($$7.a((ctb)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.d()).d($$3, $$2.d(), ia.b);
         $$7 = $$7.a(c, $$8 ? djd.a : djd.b);
         if ($$7.a((ctb)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, csq $$3, BiConsumer<cmh, hv> $$4) {
      if ($$3.j() == csq.a.d && !$$1.y_()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      djd $$6 = $$0.c(c);
      ia $$7 = n($$0).g();
      if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != djd.d) {
         return cwb.a.o();
      } else {
         if ($$1.o() == $$0.c(b).o()) {
            if ($$6 == djd.d && !$$2.d($$3, $$5, $$1)) {
               return $$0.a(c, djd.c).a(b, $$1.g());
            }

            if ($$6 == djd.c && $$7.g() == $$1 && $$2.d($$3, $$5, $$0.c(b))) {
               return $$0.a(c, djd.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      ia $$3 = n($$0).g();
      return $$3 == ia.b ? cvz.a($$1, $$2.c(), ia.a) : cyt.b($$1, $$2, $$3);
   }

   private static ia n(dip $$0) {
      switch ((djd)$$0.c(c)) {
         case a:
            return ia.b;
         case b:
            return ia.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dgb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgd> dge<T> a(csy $$0, dip $$1, dgf<T> $$2) {
      return a($$2, dgf.E, $$0.B ? dgb::a : dgb::b);
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
