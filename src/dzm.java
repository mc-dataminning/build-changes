import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class dzm extends dzx<eci> {
   public dzm(Codec<eci> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzz<eci> $$0) {
      ayk $$1 = $$0.d();
      dbs $$2 = $$0.b();
      io $$3 = $$0.e();
      Optional<ddy> $$4 = le.e.a(avw.aq, $$1).map(ix::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().n());
   }

   protected abstract boolean a(day var1, ayk var2, io var3, drb var4);

   protected boolean b(day $$0, ayk $$1, io $$2, drb $$3) {
      io $$4 = $$2.c();
      drb $$5 = $$0.a_($$2);
      if (($$5.a(dea.G) || $$5.a(avw.at)) && $$0.a_($$4).a(dea.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            le.e.a(avw.at, $$1).map(ix::a).ifPresent($$2x -> $$0.a($$4, $$2x.n(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, dea.mV.n().a(dkv.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (it $$6 : it.c.a) {
            if ($$1.i() < 0.2F) {
               io $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(dea.G)) {
                  le.e.a(avw.ar, $$1).map(ix::a).ifPresent($$3x -> {
                     drb $$4x = $$3x.n();
                     if ($$4x.b(ddj.c)) {
                        $$4x = $$4x.a(ddj.c, $$6);
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
