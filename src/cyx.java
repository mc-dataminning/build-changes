import com.mojang.serialization.Codec;
import java.util.function.Consumer;

public record cyx(cxt<cyy> c) implements dbx {
   public static final Codec<cyx> a = cxt.a(mg.aT, cyy.c).xmap(cyx::new, cyx::a);
   public static final yu<wh, cyx> b = yu.a(cxt.a(mg.aT, cyy.d), cyx::a, cyx::new);

   @Override
   public void a(cyo.b $$0, Consumer<ww> $$1, dah $$2, ke $$3) {
      jg.a $$4 = $$0.a();
      if ($$4 != null) {
         this.c.a($$4).ifPresent($$1x -> {
            xk $$2x = ((cyy)$$1x.a()).c().f();
            wz.a($$2x, xt.a.a(n.h));
            $$1.accept($$2x);
         });
      }
   }

   public static bty a(dip $$0, iu $$1, cys $$2, cqs $$3) {
      cyx $$4 = $$2.a(kj.ae);
      if ($$4 == null) {
         return bty.f;
      } else {
         dzo $$5 = $$0.a_($$1);
         if ($$5.a(dlw.eg) && !$$5.c(dqa.b)) {
            if (!$$0.C) {
               cys $$6 = $$2.b(1, $$3);
               if ($$0.c_($$1) instanceof dxs $$7) {
                  $$7.b($$6);
                  $$0.a(eeo.c, $$1, eeo.a.a($$3, $$5));
               }

               $$3.a(awv.al);
            }

            return bty.a;
         } else {
            return bty.f;
         }
      }
   }

   public cxt<cyy> a() {
      return this.c;
   }
}
