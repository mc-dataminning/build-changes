import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class dng extends dnr<dqc> {
   public dng(Codec<dqc> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnt<dqc> $$0) {
      arx $$1 = $$0.d();
      cqk $$2 = $$0.b();
      gw $$3 = $$0.e();
      Optional<csq> $$4 = jd.f.b(apo.ap).flatMap($$1x -> $$1x.a($$1)).map(hg::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().n());
   }

   protected abstract boolean a(cpr var1, arx var2, gw var3, dfe var4);

   protected boolean b(cpr $$0, arx $$1, gw $$2, dfe $$3) {
      gw $$4 = $$2.c();
      dfe $$5 = $$0.a_($$2);
      if (($$5.a(csr.G) || $$5.a(apo.as)) && $$0.a_($$4).a(csr.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            jd.f.b(apo.as).flatMap($$1x -> $$1x.a($$1)).map(hg::a).ifPresent($$2x -> $$0.a($$4, $$2x.n(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, csr.mV.n().a(czn.b, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (hc $$6 : hc.c.a) {
            if ($$1.i() < 0.2F) {
               gw $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(csr.G)) {
                  jd.f.b(apo.aq).flatMap($$1x -> $$1x.a($$1)).map(hg::a).ifPresent($$3x -> {
                     dfe $$4x = $$3x.n();
                     if ($$4x.b(csc.a)) {
                        $$4x = $$4x.a(csc.a, $$6);
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
