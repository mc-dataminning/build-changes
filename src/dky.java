import com.mojang.serialization.MapCodec;

public class dky extends dkm {
   public static final MapCodec<dky> a = b(dky::new);
   public static final dyu b = dyl.ax;
   public static final int c = 15;
   protected static final int d = 1;
   protected static final fcs e = dkm.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final fcs f = dkm.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dky> a() {
      return a;
   }

   protected dky(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dxv $$0, ash $$1, jh $$2, bam $$3) {
      jh $$4 = $$2.d();
      if ($$1.u($$4)) {
         int $$5 = 1;

         while ($$1.a_($$2.c($$5)).a(this)) {
            $$5++;
         }

         if ($$5 < 3) {
            int $$6 = $$0.c(b);
            if ($$6 == 15) {
               $$1.b($$4, this.m());
               dxv $$7 = $$0.b(b, Integer.valueOf(0));
               $$1.a($$2, $$7, 4);
               $$1.a($$7, $$4, this, null, false);
            } else {
               $$1.a($$2, $$0.b(b, Integer.valueOf($$6 + 1)), 4);
            }
         }
      }
   }

   @Override
   protected fcs b(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return e;
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return f;
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
      for (jm $$3 : jm.c.a) {
         dxv $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(aya.b)) {
            return false;
         }
      }

      dxv $$5 = $$1.a_($$2.e());
      return ($$5.a(dko.ed) || $$5.a(axu.J)) && !$$1.a_($$2.d()).n();
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, bvk $$3) {
      $$3.a($$1.aj().k(), 1.0F);
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }
}
