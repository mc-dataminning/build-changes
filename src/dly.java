import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dly extends ddm implements dhi {
   public static final MapCodec<dly> a = b(dly::new);
   public static final dsb<dsn> b = drt.bj;

   @Override
   public MapCodec<dly> a() {
      return a;
   }

   protected dly(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dsn.b));
   }

   @Override
   public doi a(io $$0, drd $$1) {
      return new dpx($$0, $$1);
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      doi $$5 = $$1.c_($$2);
      if ($$5 instanceof dpx) {
         return ((dpx)$$5).a($$3) ? bpw.a($$1.B) : bpw.d;
      } else {
         return bpw.d;
      }
   }

   @Override
   public void a(daz $$0, io $$1, drd $$2, @Nullable bsq $$3, ctq $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            doi $$5 = $$0.c_($$1);
            if ($$5 instanceof dpx) {
               ((dpx)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected dkg a_(drd $$0) {
      return dkg.c;
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, dea $$3, io $$4, boolean $$5) {
      if ($$1 instanceof aqn) {
         if ($$1.c_($$2) instanceof dpx $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.D();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((aqn)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(aqn $$0, dpx $$1) {
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
