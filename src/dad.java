import com.mojang.serialization.Codec;
import java.util.function.Consumer;

public record dad(cyz<dae> c) implements ddd {
   public static final Codec<dad> a = cyz.a(mh.aV, dae.c).xmap(dad::new, dad::a);
   public static final yy<wl, dad> b = yy.a(cyz.a(mh.aV, dae.d), dad::a, dad::new);

   @Override
   public void a(czu.b $$0, Consumer<xa> $$1, dbn $$2, kf $$3) {
      jh.a $$4 = $$0.a();
      if ($$4 != null) {
         this.c.a($$4).ifPresent($$1x -> {
            xo $$2x = ((dae)$$1x.a()).c().f();
            xd.a($$2x, xx.a.a(o.h));
            $$1.accept($$2x);
         });
      }
   }

   public static bur a(djx $$0, iv $$1, czy $$2, crx $$3) {
      dad $$4 = $$2.a(kk.ae);
      if ($$4 == null) {
         return bur.f;
      } else {
         ebe $$5 = $$0.a_($$1);
         if ($$5.a(dne.ek) && !$$5.c(drk.b)) {
            if (!$$0.C) {
               czy $$6 = $$2.b(1, $$3);
               if ($$0.c_($$1) instanceof dzh $$7) {
                  $$7.b($$6);
                  $$0.a(ege.c, $$1, ege.a.a($$3, $$5));
               }

               $$3.a(awz.al);
            }

            return bur.a;
         } else {
            return bur.f;
         }
      }
   }

   public cyz<dae> a() {
      return this.c;
   }
}
