import com.mojang.serialization.MapCodec;

public class dei extends cwj {
   public static final MapCodec<dei> a = b(dei::new);
   public static final dka b = djq.aw;
   protected static final float c = 6.0F;
   protected static final emf d = cwj.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dei> a() {
      return a;
   }

   protected dei(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return d;
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public void b(dja $$0, amz $$1, hx $$2, aup $$3) {
      if ($$1.u($$2.c())) {
         int $$4 = 1;

         while ($$1.a_($$2.c($$4)).a(this)) {
            $$4++;
         }

         if ($$4 < 3) {
            int $$5 = $$0.c(b);
            if ($$5 == 15) {
               $$1.b($$2.c(), this.o());
               $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 4);
            } else {
               $$1.a($$2, $$0.a(b, Integer.valueOf($$5 + 1)), 4);
            }
         }
      }
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
      dja $$3 = $$1.a_($$2.d());
      if ($$3.a(this)) {
         return true;
      } else {
         if ($$3.a(asb.af) || $$3.a(asb.H)) {
            hx $$4 = $$2.d();

            for (ic $$5 : ic.c.a) {
               dja $$6 = $$1.a_($$4.a($$5));
               eek $$7 = $$1.b_($$4.a($$5));
               if ($$7.a(asg.a) || $$6.a(cwl.kI)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b);
   }
}
