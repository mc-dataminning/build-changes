import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class edt extends eef<egq> {
   public edt(Codec<egq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eeh<egq> $$0) {
      azr $$1 = $$0.d();
      dfs $$2 = $$0.b();
      jg $$3 = $$0.e();
      Optional<dhy> $$4 = lx.e.a(awz.ar, $$1).map(jp::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().m());
   }

   protected abstract boolean a(dew var1, azr var2, jg var3, dvd var4);

   protected boolean b(dew $$0, azr $$1, jg $$2, dvd $$3) {
      jg $$4 = $$2.d();
      dvd $$5 = $$0.a_($$2);
      if (($$5.a(dia.G) || $$5.a(awz.au)) && $$0.a_($$4).a(dia.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            lx.e.a(awz.au, $$1).map(jp::a).ifPresent($$2x -> $$0.a($$4, $$2x.m(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, dia.mV.m().b(dov.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (jl $$6 : jl.c.a) {
            if ($$1.i() < 0.2F) {
               jg $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(dia.G)) {
                  lx.e.a(awz.as, $$1).map(jp::a).ifPresent($$3x -> {
                     dvd $$4x = $$3x.m();
                     if ($$4x.b(dhj.c)) {
                        $$4x = $$4x.b(dhj.c, $$6);
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
