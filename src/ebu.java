import com.mojang.serialization.Codec;

public class ebu extends eax<edm> {
   public ebu(Codec<edm> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eaz<edm> $$0) {
      azg $$1 = $$0.d();
      edm $$2 = $$0.f();
      dcs $$3 = $$0.b();
      dty $$4 = $$0.c();
      iz $$5 = $$0.e();
      boolean $$6 = $$1.h();
      return ($$6 ? $$2.b : $$2.c).a().a($$3, $$4, $$1, $$5);
   }
}
