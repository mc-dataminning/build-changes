import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public record cxl(cwg<cxm> c, boolean d) implements daj {
   public static final Codec<cxl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cwg.a(mb.L, cxm.c).fieldOf("song").forGetter(cxl::a), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cxl::b))
            .apply($$0, cxl::new)
   );
   public static final zi<wv, cxl> b = zi.a(cwg.a(mb.L, cxm.d), cxl::a, zg.b, cxl::b, cxl::new);

   @Override
   public void a(cxc.b $$0, Consumer<xk> $$1, cyy $$2) {
      js.a $$3 = $$0.a();
      if (this.d && $$3 != null) {
         this.c.a($$3).ifPresent($$1x -> {
            xy $$2x = ((cxm)$$1x.a()).c().f();
            xn.a($$2x, yh.a.a(n.h));
            $$1.accept($$2x);
         });
      }
   }

   public cxl a(boolean $$0) {
      return new cxl(this.c, $$0);
   }

   public static bta a(dgz $$0, jh $$1, cxg $$2, cpo $$3) {
      cxl $$4 = $$2.a(ku.ab);
      if ($$4 == null) {
         return bta.f;
      } else {
         dxo $$5 = $$0.a_($$1);
         if ($$5.a(dkf.eg) && !$$5.c(doi.b)) {
            if (!$$0.C) {
               cxg $$6 = $$2.b(1, $$3);
               if ($$0.c_($$1) instanceof dvu $$7) {
                  $$7.b($$6);
                  $$0.a(eck.c, $$1, eck.a.a($$3, $$5));
               }

               $$3.a(axf.al);
            }

            return bta.a;
         } else {
            return bta.f;
         }
      }
   }

   public cwg<cxm> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
