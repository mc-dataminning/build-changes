import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class efk extends efw<eih> {
   public efk(Codec<eih> $$0) {
      super($$0);
   }

   @Override
   public boolean a(efy<eih> $$0) {
      azg $$1 = $$0.d();
      dhe $$2 = $$0.b();
      ji $$3 = $$0.e();
      Optional<djk> $$4 = mb.e.a(awo.at, $$1).map(jr::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().m());
   }

   protected abstract boolean a(dgh var1, azg var2, ji var3, dwv var4);

   protected boolean b(dgh $$0, azg $$1, ji $$2, dwv $$3) {
      ji $$4 = $$2.d();
      dwv $$5 = $$0.a_($$2);
      if (($$5.a(djm.J) || $$5.a(awo.aw)) && $$0.a_($$4).a(djm.J)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            mb.e.a(awo.aw, $$1).map(jr::a).ifPresent($$2x -> $$0.a($$4, $$2x.m(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, djm.nx.m().b(dqm.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (jn $$6 : jn.c.a) {
            if ($$1.i() < 0.2F) {
               ji $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(djm.J)) {
                  mb.e.a(awo.au, $$1).map(jr::a).ifPresent($$3x -> {
                     dwv $$4x = $$3x.m();
                     if ($$4x.b(div.c)) {
                        $$4x = $$4x.b(div.c, $$6);
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
