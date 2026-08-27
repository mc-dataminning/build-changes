import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class dnl extends dnw<dqh> {
   public dnl(Codec<dqh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dny<dqh> $$0) {
      asc $$1 = $$0.d();
      cqp $$2 = $$0.b();
      gw $$3 = $$0.e();
      Optional<csv> $$4 = jd.f.b(apt.ap).flatMap($$1x -> $$1x.a($$1)).map(hg::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().n());
   }

   protected abstract boolean a(cpw var1, asc var2, gw var3, dfj var4);

   protected boolean b(cpw $$0, asc $$1, gw $$2, dfj $$3) {
      gw $$4 = $$2.c();
      dfj $$5 = $$0.a_($$2);
      if (($$5.a(csw.G) || $$5.a(apt.as)) && $$0.a_($$4).a(csw.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            jd.f.b(apt.as).flatMap($$1x -> $$1x.a($$1)).map(hg::a).ifPresent($$2x -> $$0.a($$4, $$2x.n(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, csw.mV.n().a(czs.b, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (hc $$6 : hc.c.a) {
            if ($$1.i() < 0.2F) {
               gw $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(csw.G)) {
                  jd.f.b(apt.aq).flatMap($$1x -> $$1x.a($$1)).map(hg::a).ifPresent($$3x -> {
                     dfj $$4x = $$3x.n();
                     if ($$4x.b(csh.a)) {
                        $$4x = $$4x.a(csh.a, $$6);
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
