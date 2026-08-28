import com.mojang.serialization.Codec;

public class eep extends edq<egg> {
   public eep(Codec<egg> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eds<egg> $$0) {
      egg $$1 = $$0.f();
      azl $$2 = $$0.d();
      dfd $$3 = $$0.b();
      dwl $$4 = $$0.c();
      je $$5 = $$0.e();

      for (efk $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
