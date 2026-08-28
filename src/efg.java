import com.mojang.serialization.Codec;

public class efg extends eef<egx> {
   public efg(Codec<egx> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eeh<egx> $$0) {
      dfs $$1 = $$0.b();
      jg $$2 = $$0.e();
      egx $$3 = $$0.f();

      for (egr.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
