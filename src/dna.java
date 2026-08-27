import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class dna extends dnl<dpw> {
   public dna(Codec<dpw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnn<dpw> $$0) {
      art $$1 = $$0.d();
      cqe $$2 = $$0.b();
      gv $$3 = $$0.e();
      Optional<csk> $$4 = jc.f.b(apj.ap).flatMap($$1x -> $$1x.a($$1)).map(hf::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().n());
   }

   protected abstract boolean a(cpl var1, art var2, gv var3, dey var4);

   protected boolean b(cpl $$0, art $$1, gv $$2, dey $$3) {
      gv $$4 = $$2.c();
      dey $$5 = $$0.a_($$2);
      if (($$5.a(csl.G) || $$5.a(apj.as)) && $$0.a_($$4).a(csl.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            jc.f.b(apj.as).flatMap($$1x -> $$1x.a($$1)).map(hf::a).ifPresent($$2x -> $$0.a($$4, $$2x.n(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, csl.mV.n().a(czh.b, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (hb $$6 : hb.c.a) {
            if ($$1.i() < 0.2F) {
               gv $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(csl.G)) {
                  jc.f.b(apj.aq).flatMap($$1x -> $$1x.a($$1)).map(hf::a).ifPresent($$3x -> {
                     dey $$4x = $$3x.n();
                     if ($$4x.b(crw.a)) {
                        $$4x = $$4x.a(crw.a, $$6);
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
