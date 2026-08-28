import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class efm extends efy<eij> {
   public efm(Codec<eij> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ega<eij> $$0) {
      azh $$1 = $$0.d();
      dhg $$2 = $$0.b();
      ji $$3 = $$0.e();
      Optional<djm> $$4 = mb.e.a(awp.at, $$1).map(jr::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().m());
   }

   protected abstract boolean a(dgj var1, azh var2, ji var3, dwx var4);

   protected boolean b(dgj $$0, azh $$1, ji $$2, dwx $$3) {
      ji $$4 = $$2.d();
      dwx $$5 = $$0.a_($$2);
      if (($$5.a(djo.J) || $$5.a(awp.aw)) && $$0.a_($$4).a(djo.J)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            mb.e.a(awp.aw, $$1).map(jr::a).ifPresent($$2x -> $$0.a($$4, $$2x.m(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, djo.nx.m().b(dqo.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (jn $$6 : jn.c.a) {
            if ($$1.i() < 0.2F) {
               ji $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(djo.J)) {
                  mb.e.a(awp.au, $$1).map(jr::a).ifPresent($$3x -> {
                     dwx $$4x = $$3x.m();
                     if ($$4x.b(dix.c)) {
                        $$4x = $$4x.b(dix.c, $$6);
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
