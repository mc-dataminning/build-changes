import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public record cxu(cwp<cxv> c, boolean d) implements das {
   public static final Codec<cxu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cwp.a(mb.L, cxv.c).fieldOf("song").forGetter(cxu::a), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cxu::b))
            .apply($$0, cxu::new)
   );
   public static final zt<xg, cxu> b = zt.a(cwp.a(mb.L, cxv.d), cxu::a, zr.b, cxu::b, cxu::new);

   @Override
   public void a(cxl.b $$0, Consumer<xv> $$1, czh $$2) {
      js.a $$3 = $$0.a();
      if (this.d && $$3 != null) {
         this.c.a($$3).ifPresent($$1x -> {
            yj $$2x = ((cxv)$$1x.a()).c().f();
            xy.a($$2x, ys.a.a(n.h));
            $$1.accept($$2x);
         });
      }
   }

   public cxu a(boolean $$0) {
      return new cxu(this.c, $$0);
   }

   public static btj a(dhi $$0, jh $$1, cxp $$2, cpx $$3) {
      cxu $$4 = $$2.a(ku.ab);
      if ($$4 == null) {
         return btj.f;
      } else {
         dxv $$5 = $$0.a_($$1);
         if ($$5.a(dko.eg) && !$$5.c(dor.b)) {
            if (!$$0.C) {
               cxp $$6 = $$2.b(1, $$3);
               if ($$0.c_($$1) instanceof dwb $$7) {
                  $$7.b($$6);
                  $$0.a(ecr.c, $$1, ecr.a.a($$3, $$5));
               }

               $$3.a(axp.al);
            }

            return btj.a;
         } else {
            return btj.f;
         }
      }
   }

   public cwp<cxv> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
