import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class dnc extends dnn<dpy> {
   public dnc(Codec<dpy> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnp<dpy> $$0) {
      aru $$1 = $$0.d();
      cqg $$2 = $$0.b();
      gu $$3 = $$0.e();
      Optional<csm> $$4 = jb.f.b(apl.ap).flatMap($$1x -> $$1x.a($$1)).map(he::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().n());
   }

   protected abstract boolean a(cpn var1, aru var2, gu var3, dfa var4);

   protected boolean b(cpn $$0, aru $$1, gu $$2, dfa $$3) {
      gu $$4 = $$2.c();
      dfa $$5 = $$0.a_($$2);
      if (($$5.a(csn.G) || $$5.a(apl.as)) && $$0.a_($$4).a(csn.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            jb.f.b(apl.as).flatMap($$1x -> $$1x.a($$1)).map(he::a).ifPresent($$2x -> $$0.a($$4, $$2x.n(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, csn.mV.n().a(czj.b, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (ha $$6 : ha.c.a) {
            if ($$1.i() < 0.2F) {
               gu $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(csn.G)) {
                  jb.f.b(apl.aq).flatMap($$1x -> $$1x.a($$1)).map(he::a).ifPresent($$3x -> {
                     dfa $$4x = $$3x.n();
                     if ($$4x.b(cry.a)) {
                        $$4x = $$4x.a(cry.a, $$6);
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
