import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public record cxt(cwo<cxu> c, boolean d) implements dar {
   public static final Codec<cxt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cwo.a(mb.L, cxu.c).fieldOf("song").forGetter(cxt::a), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cxt::b))
            .apply($$0, cxt::new)
   );
   public static final zt<xg, cxt> b = zt.a(cwo.a(mb.L, cxu.d), cxt::a, zr.b, cxt::b, cxt::new);

   @Override
   public void a(cxk.b $$0, Consumer<xv> $$1, czg $$2) {
      js.a $$3 = $$0.a();
      if (this.d && $$3 != null) {
         this.c.a($$3).ifPresent($$1x -> {
            yj $$2x = ((cxu)$$1x.a()).c().f();
            xy.a($$2x, ys.a.a(n.h));
            $$1.accept($$2x);
         });
      }
   }

   public cxt a(boolean $$0) {
      return new cxt(this.c, $$0);
   }

   public static bti a(dhh $$0, jh $$1, cxo $$2, cpw $$3) {
      cxt $$4 = $$2.a(ku.ab);
      if ($$4 == null) {
         return bti.f;
      } else {
         dxu $$5 = $$0.a_($$1);
         if ($$5.a(dkn.eg) && !$$5.c(doq.b)) {
            if (!$$0.C) {
               cxo $$6 = $$2.b(1, $$3);
               if ($$0.c_($$1) instanceof dwa $$7) {
                  $$7.b($$6);
                  $$0.a(ecq.c, $$1, ecq.a.a($$3, $$5));
               }

               $$3.a(axp.al);
            }

            return bti.a;
         } else {
            return bti.f;
         }
      }
   }

   public cwo<cxu> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
