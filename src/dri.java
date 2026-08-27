import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class dri extends drt<due> {
   public dri(Codec<due> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drv<due> $$0) {
      auu $$1 = $$0.d();
      cuj $$2 = $$0.b();
      hx $$3 = $$0.e();
      Optional<cwp> $$4 = kd.e.b(asg.ap).flatMap($$1x -> $$1x.a($$1)).map(ih::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().o());
   }

   protected abstract boolean a(ctp var1, auu var2, hx var3, djg var4);

   protected boolean b(ctp $$0, auu $$1, hx $$2, djg $$3) {
      hx $$4 = $$2.c();
      djg $$5 = $$0.a_($$2);
      if (($$5.a(cwr.G) || $$5.a(asg.as)) && $$0.a_($$4).a(cwr.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            kd.e.b(asg.as).flatMap($$1x -> $$1x.a($$1)).map(ih::a).ifPresent($$2x -> $$0.a($$4, $$2x.o(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, cwr.mV.o().a(ddl.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (ic $$6 : ic.c.a) {
            if ($$1.i() < 0.2F) {
               hx $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(cwr.G)) {
                  kd.e.b(asg.aq).flatMap($$1x -> $$1x.a($$1)).map(ih::a).ifPresent($$3x -> {
                     djg $$4x = $$3x.o();
                     if ($$4x.b(cwa.c)) {
                        $$4x = $$4x.a(cwa.c, $$6);
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
