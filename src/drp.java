import com.mojang.serialization.MapCodec;

public class drp extends djk {
   public static final MapCodec<drp> a = b(drp::new);
   public static final dxu b = dxl.az;
   protected static final float c = 6.0F;
   protected static final fbs d = djk.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<drp> a() {
      return a;
   }

   protected drp(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return d;
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if ($$1.u($$2.d())) {
         int $$4 = 1;

         while ($$1.a_($$2.c($$4)).a(this)) {
            $$4++;
         }

         if ($$4 < 3) {
            int $$5 = $$0.c(b);
            if ($$5 == 15) {
               $$1.b($$2.d(), this.m());
               $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 4);
            } else {
               $$1.a($$2, $$0.b(b, Integer.valueOf($$5 + 1)), 4);
            }
         }
      }
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      dwv $$3 = $$1.a_($$2.e());
      if ($$3.a(this)) {
         return true;
      } else {
         if ($$3.a(awo.ah) || $$3.a(awo.J)) {
            ji $$4 = $$2.e();

            for (jn $$5 : jn.c.a) {
               dwv $$6 = $$1.a_($$4.a($$5));
               esx $$7 = $$1.b_($$4.a($$5));
               if ($$7.a(awu.a) || $$6.a(djm.lk)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b);
   }
}
