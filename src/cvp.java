import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cvp extends cvv {
   public static final MapCodec<cvp> a = b(cvp::new);
   public static final dju b = djq.P;
   public static final djr c = djq.u;

   @Override
   public MapCodec<cvp> a() {
      return a;
   }

   public cvp(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      if ($$1.B) {
         return bjv.a;
      } else {
         dgo $$6 = $$1.c_($$2);
         if ($$6 instanceof dgh) {
            $$3.a((dgh)$$6);
            $$3.a(arw.ar);
            cds.a($$3, true);
         }

         return bjv.b;
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      bjr.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      dgo $$4 = $$1.c_($$2);
      if ($$4 instanceof dgh) {
         ((dgh)$$4).m();
      }
   }

   @Nullable
   @Override
   public dgo a(hx $$0, dja $$1) {
      return new dgh($$0, $$1);
   }

   @Override
   public dco b_(dja $$0) {
      return dco.c;
   }

   @Override
   public void a(cti $$0, hx $$1, dja $$2, @Nullable bmf $$3, cmr $$4) {
      if ($$4.A()) {
         dgo $$5 = $$0.c_($$1);
         if ($$5 instanceof dgh) {
            ((dgh)$$5).a($$4.y());
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
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dja a(cpa $$0) {
      return this.o().a(b, $$0.d().g());
   }
}
