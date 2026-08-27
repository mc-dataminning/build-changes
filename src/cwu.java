import com.mojang.serialization.MapCodec;

public class cwu extends cwj {
   public static final MapCodec<cwu> a = b(cwu::new);
   public static final dka b = djq.aw;
   public static final int c = 15;
   protected static final int d = 1;
   protected static final emf e = cwj.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final emf f = cwj.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<cwu> a() {
      return a;
   }

   protected cwu(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public void b(dja $$0, amz $$1, hx $$2, aup $$3) {
      hx $$4 = $$2.c();
      if ($$1.u($$4)) {
         int $$5 = 1;

         while ($$1.a_($$2.c($$5)).a(this)) {
            $$5++;
         }

         if ($$5 < 3) {
            int $$6 = $$0.c(b);
            if ($$6 == 15) {
               $$1.b($$4, this.o());
               dja $$7 = $$0.a(b, Integer.valueOf(0));
               $$1.a($$2, $$7, 4);
               $$1.a($$7, $$4, this, $$2, false);
            } else {
               $$1.a($$2, $$0.a(b, Integer.valueOf($$6 + 1)), 4);
            }
         }
      }
   }

   @Override
   public emf b(dja $$0, cso $$1, hx $$2, elr $$3) {
      return e;
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return f;
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      for (ic $$3 : ic.c.a) {
         dja $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(asg.b)) {
            return false;
         }
      }

      dja $$5 = $$1.a_($$2.d());
      return ($$5.a(cwl.dQ) || $$5.a(asb.H)) && !$$1.a_($$2.c()).k();
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, blp $$3) {
      $$3.a($$1.ai().j(), 1.0F);
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }
}
