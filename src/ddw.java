import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class ddw extends ddm {
   public static final MapCodec<ddw> a = b(ddw::new);
   public static final drx b = dhw.aE;
   public static final dsb<drr> c = drt.V;
   public static final dru d = drt.w;
   private static final evf f = dea.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final evf g = dea.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final evf h = dea.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final evf i = dea.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final evf j = evc.a(i, h);
   private static final evf k = evc.a(j, dea.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final evf l = evc.a(j, dea.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final evf m = evc.a(j, dea.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final evf n = evc.a(j, dea.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final evf o = evc.a(j, dea.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final evf F = evc.a(j, dea.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final evf G = evc.a(j, dea.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<ddw> a() {
      return a;
   }

   public ddw(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, it.c).a(c, drr.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, dea $$3, io $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(daz $$0, drd $$1, eui $$2, cmq $$3) {
      brw $$4 = $$3.s();
      cly $$5 = $$4 instanceof cly ? (cly)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      return this.a($$1, $$0, $$4, $$3, true) ? bpw.a($$1.B) : bpw.d;
   }

   public boolean a(daz $$0, drd $$1, eui $$2, @Nullable cly $$3, boolean $$4) {
      it $$5 = $$2.b();
      io $$6 = $$2.a();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.e().d - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(avs.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(drd $$0, it $$1, double $$2) {
      if ($$1.o() != it.a.b && !($$2 > 0.8124F)) {
         it $$3 = $$0.c(b);
         drr $$4 = $$0.c(c);
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

   public boolean a(daz $$0, io $$1, @Nullable it $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable brw $$0, daz $$1, io $$2, @Nullable it $$3) {
      doi $$4 = $$1.c_($$2);
      if (!$$1.B && $$4 instanceof dog) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dog)$$4).a($$3);
         $$1.a(null, $$2, avi.bZ, avj.e, 2.0F, 1.0F);
         $$1.a($$0, dvw.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private evf m(drd $$0) {
      it $$1 = $$0.c(b);
      drr $$2 = $$0.c(c);
      if ($$2 == drr.a) {
         return $$1 != it.c && $$1 != it.d ? g : f;
      } else if ($$2 == drr.b) {
         return G;
      } else if ($$2 == drr.d) {
         return $$1 != it.c && $$1 != it.d ? l : k;
      } else if ($$1 == it.c) {
         return o;
      } else if ($$1 == it.d) {
         return F;
      } else {
         return $$1 == it.f ? n : m;
      }
   }

   @Override
   protected evf b(drd $$0, daf $$1, io $$2, eur $$3) {
      return this.m($$0);
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return this.m($$0);
   }

   @Override
   protected dkg a_(drd $$0) {
      return dkg.c;
   }

   @Nullable
   @Override
   public drd a(cxb $$0) {
      it $$1 = $$0.k();
      io $$2 = $$0.a();
      daz $$3 = $$0.q();
      it.a $$4 = $$1.o();
      if ($$4 == it.a.b) {
         drd $$5 = this.n().a(c, $$1 == it.a ? drr.b : drr.a).a(b, $$0.g());
         if ($$5.a((dbc)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == it.a.a && $$3.a_($$2.g()).d($$3, $$2.g(), it.f) && $$3.a_($$2.h()).d($$3, $$2.h(), it.e)
            || $$4 == it.a.c && $$3.a_($$2.e()).d($$3, $$2.e(), it.d) && $$3.a_($$2.f()).d($$3, $$2.f(), it.c);
         drd $$7 = this.n().a(b, $$1.g()).a(c, $$6 ? drr.d : drr.c);
         if ($$7.a((dbc)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.d()).d($$3, $$2.d(), it.b);
         $$7 = $$7.a(c, $$8 ? drr.a : drr.b);
         if ($$7.a((dbc)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, dar $$3, BiConsumer<ctq, io> $$4) {
      if ($$3.j() == dar.a.d && !$$1.x_()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      drr $$6 = $$0.c(c);
      it $$7 = n($$0).g();
      if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != drr.d) {
         return dec.a.n();
      } else {
         if ($$1.o() == $$0.c(b).o()) {
            if ($$6 == drr.d && !$$2.d($$3, $$5, $$1)) {
               return $$0.a(c, drr.c).a(b, $$1.g());
            }

            if ($$6 == drr.c && $$7.g() == $$1 && $$2.d($$3, $$5, $$0.c(b))) {
               return $$0.a(c, drr.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      it $$3 = n($$0).g();
      return $$3 == it.b ? dea.a($$1, $$2.c(), it.a) : dgu.b($$1, $$2, $$3);
   }

   private static it n(drd $$0) {
      switch ((drr)$$0.c(c)) {
         case a:
            return it.b;
         case b:
            return it.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public doi a(io $$0, drd $$1) {
      return new dog($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends doi> doj<T> a(daz $$0, drd $$1, dok<T> $$2) {
      return a($$2, dok.E, $$0.B ? dog::a : dog::b);
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }

   @Override
   public drd a(drd $$0, dkn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public drd a(drd $$0, dix $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
