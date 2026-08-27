import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class doy extends dpj<dru> {
   public doy(Codec<dru> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dpl<dru> $$0) {
      ato $$1 = $$0.d();
      csm $$2 = $$0.b();
      ht $$3 = $$0.e();
      Optional<cut> $$4 = jy.f.b(arc.ap).flatMap($$1x -> $$1x.a($$1)).map(ib::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().o());
   }

   protected abstract boolean a(crt var1, ato var2, ht var3, dgw var4);

   protected boolean b(crt $$0, ato $$1, ht $$2, dgw $$3) {
      ht $$4 = $$2.c();
      dgw $$5 = $$0.a_($$2);
      if (($$5.a(cuv.G) || $$5.a(arc.as)) && $$0.a_($$4).a(cuv.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            jy.f.b(arc.as).flatMap($$1x -> $$1x.a($$1)).map(ib::a).ifPresent($$2x -> $$0.a($$4, $$2x.o(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, cuv.mV.o().a(dbp.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (hx $$6 : hx.c.a) {
            if ($$1.i() < 0.2F) {
               ht $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(cuv.G)) {
                  jy.f.b(arc.aq).flatMap($$1x -> $$1x.a($$1)).map(ib::a).ifPresent($$3x -> {
                     dgw $$4x = $$3x.o();
                     if ($$4x.b(cue.c)) {
                        $$4x = $$4x.a(cue.c, $$6);
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
