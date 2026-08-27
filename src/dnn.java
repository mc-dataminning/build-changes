import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class dnn extends dny<dqj> {
   public dnn(Codec<dqj> $$0) {
      super($$0);
   }

   @Override
   public boolean a(doa<dqj> $$0) {
      ase $$1 = $$0.d();
      cqr $$2 = $$0.b();
      gw $$3 = $$0.e();
      Optional<csx> $$4 = jd.f.b(apu.ap).flatMap($$1x -> $$1x.a($$1)).map(hg::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().n());
   }

   protected abstract boolean a(cpy var1, ase var2, gw var3, dfl var4);

   protected boolean b(cpy $$0, ase $$1, gw $$2, dfl $$3) {
      gw $$4 = $$2.c();
      dfl $$5 = $$0.a_($$2);
      if (($$5.a(csy.G) || $$5.a(apu.as)) && $$0.a_($$4).a(csy.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            jd.f.b(apu.as).flatMap($$1x -> $$1x.a($$1)).map(hg::a).ifPresent($$2x -> $$0.a($$4, $$2x.n(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, csy.mV.n().a(czu.b, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (hc $$6 : hc.c.a) {
            if ($$1.i() < 0.2F) {
               gw $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(csy.G)) {
                  jd.f.b(apu.aq).flatMap($$1x -> $$1x.a($$1)).map(hg::a).ifPresent($$3x -> {
                     dfl $$4x = $$3x.n();
                     if ($$4x.b(csj.a)) {
                        $$4x = $$4x.a(csj.a, $$6);
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
