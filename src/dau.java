import javax.annotation.Nullable;

public class dau extends csi implements cvz {
   public static final dgh<dgt> a = dfz.bj;

   protected dau(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, dgt.b));
   }

   @Override
   public dcv a(gw $$0, dfj $$1) {
      return new dei($$0, $$1);
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      dcv $$6 = $$1.c_($$2);
      if ($$6 instanceof dei) {
         return ((dei)$$6).a($$3) ? bgy.a($$1.B) : bgy.d;
      } else {
         return bgy.d;
      }
   }

   @Override
   public void a(cpv $$0, gw $$1, dfj $$2, @Nullable bjg $$3, cjf $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            dcv $$5 = $$0.c_($$1);
            if ($$5 instanceof dei) {
               ((dei)$$5).a($$3);
            }
         }
      }
   }

   @Override
   public cza b_(dfj $$0) {
      return cza.c;
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a);
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, csv $$3, gw $$4, boolean $$5) {
      if ($$1 instanceof akq) {
         if ($$1.c_($$2) instanceof dei $$7) {
            boolean $$8 = $$1.B($$2);
            boolean $$9 = $$7.G();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((akq)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(akq $$0, dei $$1) {
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
