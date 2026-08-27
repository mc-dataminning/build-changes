import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class dzo extends dzz<eck> {
   public dzo(Codec<eck> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eab<eck> $$0) {
      aym $$1 = $$0.d();
      dbu $$2 = $$0.b();
      io $$3 = $$0.e();
      Optional<dea> $$4 = le.e.a(avx.aq, $$1).map(ix::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().n());
   }

   protected abstract boolean a(dba var1, aym var2, io var3, drd var4);

   protected boolean b(dba $$0, aym $$1, io $$2, drd $$3) {
      io $$4 = $$2.c();
      drd $$5 = $$0.a_($$2);
      if (($$5.a(dec.G) || $$5.a(avx.at)) && $$0.a_($$4).a(dec.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            le.e.a(avx.at, $$1).map(ix::a).ifPresent($$2x -> $$0.a($$4, $$2x.n(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, dec.mV.n().a(dkx.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (it $$6 : it.c.a) {
            if ($$1.i() < 0.2F) {
               io $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(dec.G)) {
                  le.e.a(avx.ar, $$1).map(ix::a).ifPresent($$3x -> {
                     drd $$4x = $$3x.n();
                     if ($$4x.b(ddl.c)) {
                        $$4x = $$4x.a(ddl.c, $$6);
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
