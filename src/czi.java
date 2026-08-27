import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czi extends czo {
   public static final MapCodec<czi> a = b(czi::new);
   public static final dnv b = dnr.P;
   public static final dns c = dnr.u;

   @Override
   public MapCodec<czi> a() {
      return a;
   }

   public czi(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      if ($$1.B) {
         return bnd.a;
      } else {
         dki $$5 = $$1.c_($$2);
         if ($$5 instanceof dkb) {
            $$3.a((dkb)$$5);
            $$3.a(aui.ar);
            chl.a($$3, true);
         }

         return bnd.b;
      }
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      bmz.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      dki $$4 = $$1.c_($$2);
      if ($$4 instanceof dkb) {
         ((dkb)$$4).l();
      }
   }

   @Nullable
   @Override
   public dki a(ib $$0, dnb $$1) {
      return new dkb($$0, $$1);
   }

   @Override
   protected dgh b_(dnb $$0) {
      return dgh.c;
   }

   @Override
   public void a(cxb $$0, ib $$1, dnb $$2, @Nullable bpp $$3, cqm $$4) {
      if ($$4.B()) {
         dki $$5 = $$0.c_($$1);
         if ($$5 instanceof dkb) {
            ((dkb)$$5).a($$4.z());
         }
      }
   }

   @Override
   protected boolean d_(dnb $$0) {
      return true;
   }

   @Override
   protected int a(dnb $$0, cxb $$1, ib $$2) {
      return clq.a($$1.c_($$2));
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dnb a(csu $$0) {
      return this.o().a(b, $$0.d().g());
   }
}
