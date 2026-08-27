import com.mojang.serialization.Codec;

public class dsv extends dru<dum> {
   public dsv(Codec<dum> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drw<dum> $$0) {
      cuk $$1 = $$0.b();
      hx $$2 = $$0.e();
      dum $$3 = $$0.f();

      for (dug.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
