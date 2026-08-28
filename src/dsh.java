import com.mojang.serialization.MapCodec;

public class dsh extends dke {
   public static final MapCodec<dsh> a = b(dsh::new);
   public static final dym b = dyd.ax;
   protected static final float c = 6.0F;
   protected static final fcm d = dke.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dsh> a() {
      return a;
   }

   protected dsh(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return d;
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, bam $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dxn $$0, ash $$1, jh $$2, bam $$3) {
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
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      dxn $$3 = $$1.a_($$2.e());
      if ($$3.a(this)) {
         return true;
      } else {
         if ($$3.a(axu.ah) || $$3.a(axu.J)) {
            jh $$4 = $$2.e();

            for (jm $$5 : jm.c.a) {
               dxn $$6 = $$1.a_($$4.a($$5));
               etp $$7 = $$1.b_($$4.a($$5));
               if ($$7.a(aya.a) || $$6.a(dkg.ld)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b);
   }
}
