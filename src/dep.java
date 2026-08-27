import com.mojang.serialization.MapCodec;

public class dep extends cwq {
   public static final MapCodec<dep> a = b(dep::new);
   public static final dkh b = djx.aw;
   protected static final float c = 6.0F;
   protected static final emm d = cwq.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dep> a() {
      return a;
   }

   protected dep(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return d;
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public void b(djh $$0, and $$1, hx $$2, auv $$3) {
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
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      djh $$3 = $$1.a_($$2.d());
      if ($$3.a(this)) {
         return true;
      } else {
         if ($$3.a(ash.af) || $$3.a(ash.H)) {
            hx $$4 = $$2.d();

            for (ic $$5 : ic.c.a) {
               djh $$6 = $$1.a_($$4.a($$5));
               eer $$7 = $$1.b_($$4.a($$5));
               if ($$7.a(asm.a) || $$6.a(cws.kI)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b);
   }
}
