import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class deo extends deu {
   public static final MapCodec<deo> a = b(deo::new);
   public static final dtf b = dtb.P;
   public static final dtc c = dtb.u;

   @Override
   public MapCodec<deo> a() {
      return a;
   }

   public deo(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jf.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      if ($$1.B) {
         return bqh.a;
      } else {
         dpq $$5 = $$1.c_($$2);
         if ($$5 instanceof dpj) {
            $$3.a((dpj)$$5);
            $$3.a(avr.ar);
            clc.a($$3, true);
         }

         return bqh.c;
      }
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      bqd.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      dpq $$4 = $$1.c_($$2);
      if ($$4 instanceof dpj) {
         ((dpj)$$4).l();
      }
   }

   @Nullable
   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new dpj($$0, $$1);
   }

   @Override
   protected dlo a_(dsl $$0) {
      return dlo.c;
   }

   @Override
   protected boolean c_(dsl $$0) {
      return true;
   }

   @Override
   protected int a(dsl $$0, dcg $$1, ja $$2) {
      return cpi.a($$1.c_($$2));
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dsl a(cxn $$0) {
      return this.o().a(b, $$0.d().g());
   }
}
