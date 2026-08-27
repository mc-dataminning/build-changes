import com.mojang.serialization.Codec;

public class dpn extends doo<dre> {
   public dpn(Codec<dre> $$0) {
      super($$0);
   }

   @Override
   public boolean a(doq<dre> $$0) {
      dre $$1 = $$0.f();
      ate $$2 = $$0.d();
      crt $$3 = $$0.b();
      dhy $$4 = $$0.c();
      ht $$5 = $$0.e();

      for (dqi $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
