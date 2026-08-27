import com.mojang.serialization.MapCodec;

public class deo extends cwp {
   public static final MapCodec<deo> a = b(deo::new);
   public static final dkg b = djw.aw;
   protected static final float c = 6.0F;
   protected static final eml d = cwp.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<deo> a() {
      return a;
   }

   protected deo(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return d;
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public void b(djg $$0, and $$1, hx $$2, auu $$3) {
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
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      djg $$3 = $$1.a_($$2.d());
      if ($$3.a(this)) {
         return true;
      } else {
         if ($$3.a(asg.af) || $$3.a(asg.H)) {
            hx $$4 = $$2.d();

            for (ic $$5 : ic.c.a) {
               djg $$6 = $$1.a_($$4.a($$5));
               eeq $$7 = $$1.b_($$4.a($$5));
               if ($$7.a(asl.a) || $$6.a(cwr.kI)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b);
   }
}
