import com.mojang.serialization.Codec;

public class edi extends eca<eex> {
   public edi(Codec<eex> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<eex> $$0) {
      ayv $$1 = $$0.d();
      eex $$2 = $$0.f();
      ddq $$3 = $$0.b();
      jd $$4 = $$0.e();
      dux $$5 = $$0.c();
      int $$6 = $$1.a($$2.b.b());
      eiq $$7 = $$2.b.a($$6).a();
      return $$7.a($$3, $$5, $$1, $$4);
   }
}
