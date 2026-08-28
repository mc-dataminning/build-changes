import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public record cwc(cux<cwd> c, boolean d) implements cyy {
   public static final Codec<cwc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cux.a(ly.L, cwd.c).fieldOf("song").forGetter(cwc::a), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cwc::b))
            .apply($$0, cwc::new)
   );
   public static final zf<ws, cwc> b = zf.a(cux.a(ly.L, cwd.d), cwc::a, zd.b, cwc::b, cwc::new);

   @Override
   public void a(cvt.b $$0, Consumer<xh> $$1, cxp $$2) {
      jr.a $$3 = $$0.a();
      if (this.d && $$3 != null) {
         this.c.a($$3).ifPresent($$1x -> {
            xv $$2x = ((cwd)$$1x.a()).c().f();
            xk.a($$2x, ye.a.a(n.h));
            $$1.accept($$2x);
         });
      }
   }

   public cwc a(boolean $$0) {
      return new cwc(this.c, $$0);
   }

   public static bry a(dev $$0, jg $$1, cvx $$2, coh $$3) {
      cwc $$4 = $$2.a(kt.aa);
      if ($$4 == null) {
         return bry.f;
      } else {
         dvd $$5 = $$0.a_($$1);
         if ($$5.a(dia.dT) && !$$5.c(dma.b)) {
            if (!$$0.C) {
               cvx $$6 = $$2.b(1, $$3);
               if ($$0.c_($$1) instanceof dtj $$7) {
                  $$7.b($$6);
                  $$0.a(eaa.c, $$1, eaa.a.a($$3, $$5));
               }

               $$3.a(awu.al);
            }

            return bry.a;
         } else {
            return bry.f;
         }
      }
   }

   public cux<cwd> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
