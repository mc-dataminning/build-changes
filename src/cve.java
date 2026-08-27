import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cve extends cvv {
   public static final dju a = dae.aE;
   public static final djr b = djq.r;

   protected cve(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ic.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends cve> a();

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      if ($$1.B) {
         return bjv.a;
      } else {
         this.a($$1, $$2, $$3);
         return bjv.b;
      }
   }

   protected abstract void a(cti var1, hx var2, cfb var3);

   @Override
   public dja a(cpa $$0) {
      return this.o().a(a, $$0.g().g());
   }

   @Override
   public void a(cti $$0, hx $$1, dja $$2, bmf $$3, cmr $$4) {
      if ($$4.A()) {
         dgo $$5 = $$0.c_($$1);
         if ($$5 instanceof dgd) {
            ((dgd)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dgo $$5 = $$1.c_($$2);
         if ($$5 instanceof dgd) {
            if ($$1 instanceof amz) {
               bjr.a($$1, $$2, (dgd)$$5);
               ((dgd)$$5).a((amz)$$1, elm.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public boolean d_(dja $$0) {
      return true;
   }

   @Override
   public int a(dja $$0, cti $$1, hx $$2) {
      return chu.a($$1.c_($$2));
   }

   @Override
   public dco b_(dja $$0) {
      return dco.c;
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dgo> dgp<T> a(cti $$0, dgq<T> $$1, dgq<? extends dgd> $$2) {
      return $$0.B ? null : a($$1, $$2, dgd::a);
   }
}
