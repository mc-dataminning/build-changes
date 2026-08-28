import com.mojang.serialization.Codec;

public class egb extends eew<egv> {
   public egb(Codec<egv> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eey<egv> $$0) {
      int $$1 = 0;
      azu $$2 = $$0.d();
      dgk $$3 = $$0.b();
      jh $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(ebq.a.d, $$4.u() + $$7, $$4.w() + $$8);
         jh $$10 = new jh($$4.u() + $$7, $$9, $$4.w() + $$8);
         dvv $$11 = dis.mV.m().b(dpn.c, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(dis.G) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
