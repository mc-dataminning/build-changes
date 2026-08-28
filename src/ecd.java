import com.mojang.serialization.Codec;

public class ecd extends ebe<edu> {
   public ecd(Codec<edu> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebg<edu> $$0) {
      edu $$1 = $$0.f();
      aym $$2 = $$0.d();
      dcz $$3 = $$0.b();
      due $$4 = $$0.c();
      ja $$5 = $$0.e();

      for (ecy $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
