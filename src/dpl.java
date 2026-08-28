import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpl extends dgy implements dku {
   public static final MapCodec<dpl> a = b(dpl::new);
   public static final dvq<dwc> b = dvi.bj;

   @Override
   public MapCodec<dpl> a() {
      return a;
   }

   protected dpl(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dwc.b));
   }

   @Override
   public drv a(jf $$0, dus $$1) {
      return new dtm($$0, $$1);
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      drv $$5 = $$1.c_($$2);
      if ($$5 instanceof dtm) {
         return (brs)(((dtm)$$5).a($$3) ? brs.a : brs.e);
      } else {
         return brs.e;
      }
   }

   @Override
   public void a(dej $$0, jf $$1, dus $$2, @Nullable bun $$3, cvs $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            drv $$5 = $$0.c_($$1);
            if ($$5 instanceof dtm) {
               ((dtm)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected dnt a_(dus $$0) {
      return dnt.c;
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dhm $$3, @Nullable esb $$4, boolean $$5) {
      if ($$1 instanceof arj) {
         if ($$1.c_($$2) instanceof dtm $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.D();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((arj)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(arj $$0, dtm $$1) {
      switch ($$1.v()) {
         case a:
            $$1.b(false);
            break;
         case b:
            $$1.c($$0);
            break;
         case c:
            $$1.B();
         case d:
      }
   }
}
