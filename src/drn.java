import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drn extends diw implements dmt {
   public static final MapCodec<drn> a = b(drn::new);
   public static final dxs<dye> b = dxl.bm;

   @Override
   public MapCodec<drn> a() {
      return a;
   }

   protected drn(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dye.b));
   }

   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new dvp($$0, $$1);
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      dtx $$5 = $$1.c_($$2);
      if ($$5 instanceof dvp) {
         return (bsi)(((dvp)$$5).a($$3) ? bsi.a : bsi.e);
      } else {
         return bsi.e;
      }
   }

   @Override
   public void a(dgg $$0, ji $$1, dwv $$2, @Nullable bvf $$3, cwn $$4) {
      if (!$$0.C) {
         if ($$3 != null) {
            dtx $$5 = $$0.c_($$1);
            if ($$5 instanceof dvp) {
               ((dvp)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, djk $$3, @Nullable euf $$4, boolean $$5) {
      if ($$1 instanceof arc) {
         if ($$1.c_($$2) instanceof dvp $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.C();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((arc)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(arc $$0, dvp $$1) {
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
