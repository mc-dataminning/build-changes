import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class dys extends dzd<ebo> {
   public dys(Codec<ebo> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzf<ebo> $$0) {
      ayg $$1 = $$0.d();
      day $$2 = $$0.b();
      in $$3 = $$0.e();
      Optional<dde> $$4 = ld.e.a(avr.aq, $$1).map(iw::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().n());
   }

   protected abstract boolean a(dae var1, ayg var2, in var3, dqh var4);

   protected boolean b(dae $$0, ayg $$1, in $$2, dqh $$3) {
      in $$4 = $$2.c();
      dqh $$5 = $$0.a_($$2);
      if (($$5.a(ddg.G) || $$5.a(avr.at)) && $$0.a_($$4).a(ddg.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            ld.e.a(avr.at, $$1).map(iw::a).ifPresent($$2x -> $$0.a($$4, $$2x.n(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, ddg.mV.n().a(dkb.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (is $$6 : is.c.a) {
            if ($$1.i() < 0.2F) {
               in $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(ddg.G)) {
                  ld.e.a(avr.ar, $$1).map(iw::a).ifPresent($$3x -> {
                     dqh $$4x = $$3x.n();
                     if ($$4x.b(dcp.c)) {
                        $$4x = $$4x.a(dcp.c, $$6);
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
