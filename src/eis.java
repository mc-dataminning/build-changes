import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class eis extends eje<elp> {
   public eis(Codec<elp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejg<elp> $$0) {
      azv $$1 = $$0.d();
      dju $$2 = $$0.b();
      iu $$3 = $$0.e();
      Optional<dma> $$4 = mf.e.a(axc.at, $$1).map(je::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().m());
   }

   protected abstract boolean a(diw var1, azv var2, iu var3, dzz var4);

   protected boolean b(diw $$0, azv $$1, iu $$2, dzz $$3) {
      iu $$4 = $$2.d();
      dzz $$5 = $$0.a_($$2);
      if (($$5.a(dmc.J) || $$5.a(axc.aw)) && $$0.a_($$4).a(dmc.J)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            mf.e.a(axc.aw, $$1).map(je::a).ifPresent($$2x -> $$0.a($$4, $$2x.m(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, dmc.ny.m().b(dte.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (ja $$6 : ja.c.a) {
            if ($$1.i() < 0.2F) {
               iu $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(dmc.J)) {
                  mf.e.a(axc.au, $$1).map(je::a).ifPresent($$3x -> {
                     dzz $$4x = $$3x.m();
                     if ($$4x.b(dll.d)) {
                        $$4x = $$4x.b(dll.d, $$6);
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
