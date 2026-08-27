import com.mojang.serialization.Codec;

public class edn extends eca<efd> {
   public edn(Codec<efd> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<efd> $$0) {
      ayt $$1 = $$0.d();
      efd $$2 = $$0.f();
      dcv $$3 = $$0.b();
      ir $$4 = $$0.e();
      duz $$5 = $$0.c();
      int $$6 = $$1.a($$2.b.b());
      eix $$7 = $$2.b.a($$6).a();
      return $$7.a($$3, $$5, $$1, $$4);
   }
}
