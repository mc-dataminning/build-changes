import com.mojang.serialization.Codec;

public class ehn extends ego<eje> {
   public ehn(Codec<eje> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egq<eje> $$0) {
      eje $$1 = $$0.f();
      bam $$2 = $$0.d();
      dhy $$3 = $$0.b();
      dzj $$4 = $$0.c();
      jh $$5 = $$0.e();

      for (eii $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
