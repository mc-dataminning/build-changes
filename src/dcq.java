import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcq extends cuf implements cya {
   public static final MapCodec<dcq> a = b(dcq::new);
   public static final dhu<dig> b = dhm.bj;

   @Override
   public MapCodec<dcq> a() {
      return a;
   }

   protected dcq(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dig.b));
   }

   @Override
   public der a(ht $$0, dgw $$1) {
      return new dgf($$0, $$1);
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      der $$6 = $$1.c_($$2);
      if ($$6 instanceof dgf) {
         return ((dgf)$$6).a($$3) ? biq.a($$1.B) : biq.d;
      } else {
         return biq.d;
      }
   }

   @Override
   public void a(crs $$0, ht $$1, dgw $$2, @Nullable bky $$3, clb $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            der $$5 = $$0.c_($$1);
            if ($$5 instanceof dgf) {
               ((dgf)$$5).a($$3);
            }
         }
      }
   }

   @Override
   public day b_(dgw $$0) {
      return day.c;
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b);
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, cut $$3, ht $$4, boolean $$5) {
      if ($$1 instanceof ama) {
         if ($$1.c_($$2) instanceof dgf $$7) {
            boolean $$8 = $$1.B($$2);
            boolean $$9 = $$7.G();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((ama)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(ama $$0, dgf $$1) {
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
