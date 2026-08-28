import com.mojang.serialization.Codec;

public class ebs extends eat<edj> {
   public ebs(Codec<edj> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eav<edj> $$0) {
      edj $$1 = $$0.f();
      azc $$2 = $$0.d();
      dco $$3 = $$0.b();
      dtu $$4 = $$0.c();
      iz $$5 = $$0.e();

      for (ecn $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
