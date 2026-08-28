import com.mojang.serialization.Codec;
import java.util.function.Consumer;

public record daf(czb<dag> c) implements ddf {
   public static final Codec<daf> a = czb.a(mi.aV, dag.c).xmap(daf::new, daf::a);
   public static final za<wn, daf> b = za.a(czb.a(mi.aV, dag.d), daf::a, daf::new);

   @Override
   public void a(czw.b $$0, Consumer<xc> $$1, dbp $$2, kg $$3) {
      ji.a $$4 = $$0.a();
      if ($$4 != null) {
         this.c.a($$4).ifPresent($$1x -> {
            xq $$2x = ((dag)$$1x.a()).c().f();
            xf.a($$2x, xz.a.a(o.h));
            $$1.accept($$2x);
         });
      }
   }

   public static but a(djz $$0, iw $$1, daa $$2, crz $$3) {
      daf $$4 = $$2.a(kl.ae);
      if ($$4 == null) {
         return but.f;
      } else {
         ebg $$5 = $$0.a_($$1);
         if ($$5.a(dng.ek) && !$$5.c(drm.b)) {
            if (!$$0.C) {
               daa $$6 = $$2.b(1, $$3);
               if ($$0.c_($$1) instanceof dzj $$7) {
                  $$7.b($$6);
                  $$0.a(egg.c, $$1, egg.a.a($$3, $$5));
               }

               $$3.a(axb.al);
            }

            return but.a;
         } else {
            return but.f;
         }
      }
   }

   public czb<dag> a() {
      return this.c;
   }
}
