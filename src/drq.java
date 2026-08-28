import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drq extends diz implements dmw {
   public static final MapCodec<drq> a = b(drq::new);
   public static final dxv<dyh> b = dxo.bm;

   @Override
   public MapCodec<drq> a() {
      return a;
   }

   protected drq(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dyh.b));
   }

   @Override
   public dua a(ji $$0, dwy $$1) {
      return new dvs($$0, $$1);
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      dua $$5 = $$1.c_($$2);
      if ($$5 instanceof dvs) {
         return (bsl)(((dvs)$$5).a($$3) ? bsl.a : bsl.e);
      } else {
         return bsl.e;
      }
   }

   @Override
   public void a(dgj $$0, ji $$1, dwy $$2, @Nullable bvi $$3, cwq $$4) {
      if (!$$0.C) {
         if ($$3 != null) {
            dua $$5 = $$0.c_($$1);
            if ($$5 instanceof dvs) {
               ((dvs)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, djn $$3, @Nullable eui $$4, boolean $$5) {
      if ($$1 instanceof ard) {
         if ($$1.c_($$2) instanceof dvs $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.C();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((ard)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(ard $$0, dvs $$1) {
      switch ($$1.u()) {
         case a:
            $$1.b(false);
            break;
         case b:
            $$1.c($$0);
            break;
         case c:
            $$1.A();
         case d:
      }
   }
}
