import com.mojang.serialization.Codec;

public class dtk extends dru<duf> {
   public dtk(Codec<duf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drw<duf> $$0) {
      cuk $$1 = $$0.b();
      hx $$2 = $$0.e();
      $$0.f();
      if (!$$1.u($$2)) {
         return false;
      } else {
         for (ic $$3 : ic.values()) {
            if ($$3 != ic.a && dfk.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, cws.ff.o().a(dfk.a($$3), Boolean.valueOf(true)), 2);
               return true;
            }
         }

         return false;
      }
   }
}
