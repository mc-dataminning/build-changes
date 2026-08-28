import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class edz extends eel<egw> {
   public edz(Codec<egw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(een<egw> $$0) {
      azs $$1 = $$0.d();
      dfy $$2 = $$0.b();
      jh $$3 = $$0.e();
      Optional<die> $$4 = ly.e.a(axa.ar, $$1).map(jq::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().m());
   }

   protected abstract boolean a(dfc var1, azs var2, jh var3, dvj var4);

   protected boolean b(dfc $$0, azs $$1, jh $$2, dvj $$3) {
      jh $$4 = $$2.d();
      dvj $$5 = $$0.a_($$2);
      if (($$5.a(dig.G) || $$5.a(axa.au)) && $$0.a_($$4).a(dig.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            ly.e.a(axa.au, $$1).map(jq::a).ifPresent($$2x -> $$0.a($$4, $$2x.m(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, dig.mV.m().b(dpb.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (jm $$6 : jm.c.a) {
            if ($$1.i() < 0.2F) {
               jh $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(dig.G)) {
                  ly.e.a(axa.as, $$1).map(jq::a).ifPresent($$3x -> {
                     dvj $$4x = $$3x.m();
                     if ($$4x.b(dhp.c)) {
                        $$4x = $$4x.b(dhp.c, $$6);
                     }

                     $$0.a($$7, $$4x, 2);
                  });
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }
}
