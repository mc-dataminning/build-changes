import com.mojang.serialization.Codec;

public class eci extends ebl<eea> {
   public eci(Codec<eea> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebn<eea> $$0) {
      ayo $$1 = $$0.d();
      eea $$2 = $$0.f();
      ddc $$3 = $$0.b();
      dui $$4 = $$0.c();
      ja $$5 = $$0.e();
      boolean $$6 = $$1.h();
      return ($$6 ? $$2.b : $$2.c).a().a($$3, $$4, $$1, $$5);
   }
}
