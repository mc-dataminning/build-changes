import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class dpp extends dqa<dsl> {
   public dpp(Codec<dsl> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dqc<dsl> $$0) {
      atw $$1 = $$0.d();
      csz $$2 = $$0.b();
      hx $$3 = $$0.e();
      Optional<cvf> $$4 = kc.f.b(ark.ap).flatMap($$1x -> $$1x.a($$1)).map(ig::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().o());
   }

   protected abstract boolean a(csg var1, atw var2, hx var3, dhn var4);

   protected boolean b(csg $$0, atw $$1, hx $$2, dhn $$3) {
      hx $$4 = $$2.c();
      dhn $$5 = $$0.a_($$2);
      if (($$5.a(cvh.G) || $$5.a(ark.as)) && $$0.a_($$4).a(cvh.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            kc.f.b(ark.as).flatMap($$1x -> $$1x.a($$1)).map(ig::a).ifPresent($$2x -> $$0.a($$4, $$2x.o(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, cvh.mV.o().a(dcb.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (ib $$6 : ib.c.a) {
            if ($$1.i() < 0.2F) {
               hx $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(cvh.G)) {
                  kc.f.b(ark.aq).flatMap($$1x -> $$1x.a($$1)).map(ig::a).ifPresent($$3x -> {
                     dhn $$4x = $$3x.o();
                     if ($$4x.b(cuq.c)) {
                        $$4x = $$4x.a(cuq.c, $$6);
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
