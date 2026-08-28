import com.mojang.serialization.Codec;

public class eet extends edu<egk> {
   public eet(Codec<egk> $$0) {
      super($$0);
   }

   @Override
   public boolean a(edw<egk> $$0) {
      egk $$1 = $$0.f();
      azn $$2 = $$0.d();
      dfg $$3 = $$0.b();
      dwp $$4 = $$0.c();
      jf $$5 = $$0.e();

      for (efo $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
