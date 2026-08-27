import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcx extends cum implements cyi {
   public static final MapCodec<dcx> a = b(dcx::new);
   public static final dig<dis> b = dhy.bj;

   @Override
   public MapCodec<dcx> a() {
      return a;
   }

   protected dcx(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dis.b));
   }

   @Override
   public dfd a(ht $$0, dhi $$1) {
      return new dgr($$0, $$1);
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      dfd $$6 = $$1.c_($$2);
      if ($$6 instanceof dgr) {
         return ((dgr)$$6).a($$3) ? bix.a($$1.B) : bix.d;
      } else {
         return bix.d;
      }
   }

   @Override
   public void a(csa $$0, ht $$1, dhi $$2, @Nullable blg $$3, clj $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            dfd $$5 = $$0.c_($$1);
            if ($$5 instanceof dgr) {
               ((dgr)$$5).a($$3);
            }
         }
      }
   }

   @Override
   public dbf b_(dhi $$0) {
      return dbf.c;
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b);
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, cva $$3, ht $$4, boolean $$5) {
      if ($$1 instanceof ame) {
         if ($$1.c_($$2) instanceof dgr $$7) {
            boolean $$8 = $$1.B($$2);
            boolean $$9 = $$7.G();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((ame)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(ame $$0, dgr $$1) {
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
