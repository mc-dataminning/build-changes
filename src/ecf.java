import com.mojang.serialization.Codec;

public class ecf extends eax<edu> {
   public ecf(Codec<edu> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eaz<edu> $$0) {
      azg $$1 = $$0.d();
      edu $$2 = $$0.f();
      dcs $$3 = $$0.b();
      iz $$4 = $$0.e();
      dty $$5 = $$0.c();
      int $$6 = $$1.a($$2.b.b());
      ehn $$7 = $$2.b.a($$6).a();
      return $$7.a($$3, $$5, $$1, $$4);
   }
}
