import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class day extends cso implements cwi {
   public static final MapCodec<day> a = b(day::new);
   public static final dgb<dgn> b = dft.bj;

   @Override
   public MapCodec<day> a() {
      return a;
   }

   protected day(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dgn.b));
   }

   @Override
   public dcz a(gw $$0, dfd $$1) {
      return new dem($$0, $$1);
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      dcz $$6 = $$1.c_($$2);
      if ($$6 instanceof dem) {
         return ((dem)$$6).a($$3) ? bhe.a($$1.B) : bhe.d;
      } else {
         return bhe.d;
      }
   }

   @Override
   public void a(cqb $$0, gw $$1, dfd $$2, @Nullable bjm $$3, cjl $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            dcz $$5 = $$0.c_($$1);
            if ($$5 instanceof dem) {
               ((dem)$$5).a($$3);
            }
         }
      }
   }

   @Override
   public czg b_(dfd $$0) {
      return czg.c;
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b);
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ctc $$3, gw $$4, boolean $$5) {
      if ($$1 instanceof akt) {
         if ($$1.c_($$2) instanceof dem $$7) {
            boolean $$8 = $$1.B($$2);
            boolean $$9 = $$7.G();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((akt)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(akt $$0, dem $$1) {
      switch ($$1.y()) {
         case a:
            $$1.b(false);
            break;
         case b:
            $$1.a($$0, false);
            break;
         case c:
            $$1.E();
         case d:
      }
   }
}
