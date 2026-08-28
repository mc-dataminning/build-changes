import com.mojang.serialization.Codec;

public class ehu extends egv<ejl> {
   public ehu(Codec<ejl> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egx<ejl> $$0) {
      ejl $$1 = $$0.f();
      bam $$2 = $$0.d();
      dif $$3 = $$0.b();
      dzq $$4 = $$0.c();
      jh $$5 = $$0.e();

      for (eip $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
