import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class drj extends dru<duf> {
   public drj(Codec<duf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drw<duf> $$0) {
      auv $$1 = $$0.d();
      cuk $$2 = $$0.b();
      hx $$3 = $$0.e();
      Optional<cwq> $$4 = kd.e.b(ash.ap).flatMap($$1x -> $$1x.a($$1)).map(ih::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().o());
   }

   protected abstract boolean a(ctq var1, auv var2, hx var3, djh var4);

   protected boolean b(ctq $$0, auv $$1, hx $$2, djh $$3) {
      hx $$4 = $$2.c();
      djh $$5 = $$0.a_($$2);
      if (($$5.a(cws.G) || $$5.a(ash.as)) && $$0.a_($$4).a(cws.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            kd.e.b(ash.as).flatMap($$1x -> $$1x.a($$1)).map(ih::a).ifPresent($$2x -> $$0.a($$4, $$2x.o(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, cws.mV.o().a(ddm.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (ic $$6 : ic.c.a) {
            if ($$1.i() < 0.2F) {
               hx $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(cws.G)) {
                  kd.e.b(ash.aq).flatMap($$1x -> $$1x.a($$1)).map(ih::a).ifPresent($$3x -> {
                     djh $$4x = $$3x.o();
                     if ($$4x.b(cwb.c)) {
                        $$4x = $$4x.a(cwb.c, $$6);
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
