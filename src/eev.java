import com.mojang.serialization.Codec;

public class eev extends edu<egm> {
   public eev(Codec<egm> $$0) {
      super($$0);
   }

   @Override
   public boolean a(edw<egm> $$0) {
      dfg $$1 = $$0.b();
      jf $$2 = $$0.e();
      egm $$3 = $$0.f();

      for (egg.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
