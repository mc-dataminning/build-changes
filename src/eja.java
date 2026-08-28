import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class eja extends ejm<elx> {
   public eja(Codec<elx> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejo<elx> $$0) {
      azv $$1 = $$0.d();
      djz $$2 = $$0.b();
      iu $$3 = $$0.e();
      Optional<dmf> $$4 = mf.e.a(axc.at, $$1).map(je::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().m());
   }

   protected abstract boolean a(djb var1, azv var2, iu var3, eah var4);

   protected boolean b(djb $$0, azv $$1, iu $$2, eah $$3) {
      iu $$4 = $$2.d();
      eah $$5 = $$0.a_($$2);
      if (($$5.a(dmh.J) || $$5.a(axc.aw)) && $$0.a_($$4).a(dmh.J)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            mf.e.a(axc.aw, $$1).map(je::a).ifPresent($$2x -> $$0.a($$4, $$2x.m(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, dmh.nB.m().b(dtk.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (ja $$6 : ja.c.a) {
            if ($$1.i() < 0.2F) {
               iu $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(dmh.J)) {
                  mf.e.a(axc.au, $$1).map(je::a).ifPresent($$3x -> {
                     eah $$4x = $$3x.m();
                     if ($$4x.b(dlq.d)) {
                        $$4x = $$4x.b(dlq.d, $$6);
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
