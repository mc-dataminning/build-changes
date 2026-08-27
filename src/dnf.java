import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class dnf extends dnq<dqb> {
   public dnf(Codec<dqb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dns<dqb> $$0) {
      ash $$1 = $$0.d();
      cqv $$2 = $$0.b();
      gw $$3 = $$0.e();
      Optional<ctc> $$4 = jb.f.b(apv.ap).flatMap($$1x -> $$1x.a($$1)).map(he::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().o());
   }

   protected abstract boolean a(cqc var1, ash var2, gw var3, dfd var4);

   protected boolean b(cqc $$0, ash $$1, gw $$2, dfd $$3) {
      gw $$4 = $$2.c();
      dfd $$5 = $$0.a_($$2);
      if (($$5.a(cte.G) || $$5.a(apv.as)) && $$0.a_($$4).a(cte.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            jb.f.b(apv.as).flatMap($$1x -> $$1x.a($$1)).map(he::a).ifPresent($$2x -> $$0.a($$4, $$2x.o(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, cte.mV.o().a(czx.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (ha $$6 : ha.c.a) {
            if ($$1.i() < 0.2F) {
               gw $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(cte.G)) {
                  jb.f.b(apv.aq).flatMap($$1x -> $$1x.a($$1)).map(he::a).ifPresent($$3x -> {
                     dfd $$4x = $$3x.o();
                     if ($$4x.b(csn.c)) {
                        $$4x = $$4x.a(csn.c, $$6);
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
