import com.mojang.serialization.Codec;

public class eat extends dzd<ebo> {
   public eat(Codec<ebo> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzf<ebo> $$0) {
      day $$1 = $$0.b();
      in $$2 = $$0.e();
      $$0.f();
      if (!$$1.u($$2)) {
         return false;
      } else {
         for (is $$3 : is.values()) {
            if ($$3 != is.a && dma.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, ddg.ff.n().a(dma.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
