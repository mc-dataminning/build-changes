import com.mojang.serialization.Codec;

public class ehv extends egw<ejm> {
   public ehv(Codec<ejm> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egy<ejm> $$0) {
      ejm $$1 = $$0.f();
      bam $$2 = $$0.d();
      dig $$3 = $$0.b();
      dzr $$4 = $$0.c();
      jh $$5 = $$0.e();

      for (eiq $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
