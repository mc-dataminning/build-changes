import com.mojang.serialization.Codec;

public class eib extends egw<eiv> {
   public eib(Codec<eiv> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egy<eiv> $$0) {
      int $$1 = 0;
      bam $$2 = $$0.d();
      dig $$3 = $$0.b();
      jh $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(edq.a.d, $$4.u() + $$7, $$4.w() + $$8);
         jh $$10 = new jh($$4.u() + $$7, $$9, $$4.w() + $$8);
         dxv $$11 = dko.nq.m().b(drm.c, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(dko.J) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
