import com.mojang.serialization.Codec;

public class ekl extends ejm<emc> {
   public ekl(Codec<emc> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejo<emc> $$0) {
      emc $$1 = $$0.f();
      azv $$2 = $$0.d();
      djz $$3 = $$0.b();
      ecf $$4 = $$0.c();
      iu $$5 = $$0.e();

      for (elg $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
