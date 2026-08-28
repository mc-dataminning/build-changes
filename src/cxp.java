import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public record cxp(cwk<cxq> c, boolean d) implements dan {
   public static final Codec<cxp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cwk.a(mb.L, cxq.c).fieldOf("song").forGetter(cxp::a), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cxp::b))
            .apply($$0, cxp::new)
   );
   public static final zt<xg, cxp> b = zt.a(cwk.a(mb.L, cxq.d), cxp::a, zr.b, cxp::b, cxp::new);

   @Override
   public void a(cxg.b $$0, Consumer<xv> $$1, czc $$2) {
      js.a $$3 = $$0.a();
      if (this.d && $$3 != null) {
         this.c.a($$3).ifPresent($$1x -> {
            yj $$2x = ((cxq)$$1x.a()).c().f();
            xy.a($$2x, ys.a.a(n.h));
            $$1.accept($$2x);
         });
      }
   }

   public cxp a(boolean $$0) {
      return new cxp(this.c, $$0);
   }

   public static bte a(dha $$0, jh $$1, cxk $$2, cps $$3) {
      cxp $$4 = $$2.a(ku.ab);
      if ($$4 == null) {
         return bte.f;
      } else {
         dxn $$5 = $$0.a_($$1);
         if ($$5.a(dkg.eg) && !$$5.c(doj.b)) {
            if (!$$0.C) {
               cxk $$6 = $$2.b(1, $$3);
               if ($$0.c_($$1) instanceof dvt $$7) {
                  $$7.b($$6);
                  $$0.a(ecj.c, $$1, ecj.a.a($$3, $$5));
               }

               $$3.a(axp.al);
            }

            return bte.a;
         } else {
            return bte.f;
         }
      }
   }

   public cwk<cxq> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
