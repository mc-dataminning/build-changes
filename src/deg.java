import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class deg extends cvv implements czr {
   public static final MapCodec<deg> a = b(deg::new);
   public static final djy<dkk> b = djq.bj;

   @Override
   public MapCodec<deg> a() {
      return a;
   }

   protected deg(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dkk.b));
   }

   @Override
   public dgo a(hx $$0, dja $$1) {
      return new dic($$0, $$1);
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      dgo $$6 = $$1.c_($$2);
      if ($$6 instanceof dic) {
         return ((dic)$$6).a($$3) ? bjv.a($$1.B) : bjv.d;
      } else {
         return bjv.d;
      }
   }

   @Override
   public void a(cti $$0, hx $$1, dja $$2, @Nullable bmf $$3, cmr $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            dgo $$5 = $$0.c_($$1);
            if ($$5 instanceof dic) {
               ((dic)$$5).a($$3);
            }
         }
      }
   }

   @Override
   public dco b_(dja $$0) {
      return dco.c;
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b);
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, cwj $$3, hx $$4, boolean $$5) {
      if ($$1 instanceof amz) {
         if ($$1.c_($$2) instanceof dic $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.F();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((amz)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(amz $$0, dic $$1) {
      switch ($$1.x()) {
         case a:
            $$1.b(false);
            break;
         case b:
            $$1.c($$0);
            break;
         case c:
            $$1.D();
         case d:
      }
   }
}
