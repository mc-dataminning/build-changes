import com.mojang.serialization.MapCodec;

public class dsp extends dkm {
   public static final MapCodec<dsp> a = b(dsp::new);
   public static final dyu b = dyl.ax;
   protected static final float c = 6.0F;
   protected static final fcs d = dkm.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dsp> a() {
      return a;
   }

   protected dsp(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return d;
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dxv $$0, ash $$1, jh $$2, bam $$3) {
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
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      dxv $$3 = $$1.a_($$2.e());
      if ($$3.a(this)) {
         return true;
      } else {
         if ($$3.a(axu.ah) || $$3.a(axu.J)) {
            jh $$4 = $$2.e();

            for (jm $$5 : jm.c.a) {
               dxv $$6 = $$1.a_($$4.a($$5));
               etx $$7 = $$1.b_($$4.a($$5));
               if ($$7.a(aya.a) || $$6.a(dko.ld)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b);
   }
}
