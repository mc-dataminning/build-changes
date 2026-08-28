import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public record cuu(ctl<cuv> c, boolean d) implements cxy {
   public static final Codec<cuu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ctl.a(lu.L, cuv.c).fieldOf("song").forGetter(cuu::a), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cuu::b))
            .apply($$0, cuu::new)
   );
   public static final yx<wk, cuu> b = yx.a(ctl.a(lu.L, cuv.d), cuu::a, yv.b, cuu::b, cuu::new);

   @Override
   public void a(cul.b $$0, Consumer<wz> $$1, cwm $$2) {
      jo.a $$3 = $$0.a();
      if (this.d && $$3 != null) {
         this.c.a($$3).ifPresent($$1x -> {
            xn $$2x = ((cuv)$$1x.a()).c().f();
            xc.a($$2x, xw.a.a(n.h));
            $$1.accept($$2x);
         });
      }
   }

   public cuu a(boolean $$0) {
      return new cuu(this.c, $$0);
   }

   public static bqt a(dcw $$0, jd $$1, cuq $$2, cmx $$3) {
      cuu $$4 = $$2.a(kq.R);
      if ($$4 == null) {
         return bqt.d;
      } else {
         dtc $$5 = $$0.a_($$1);
         if ($$5.a(dga.dT) && !$$5.c(dkb.b)) {
            if (!$$0.B) {
               cuq $$6 = $$2.b(1, $$3);
               if ($$0.c_($$1) instanceof drj $$7) {
                  $$7.b($$6);
                  $$0.a(dxz.c, $$1, dxz.a.a($$3, $$5));
               }

               $$3.a(avz.al);
            }

            return bqt.a($$0.B);
         } else {
            return bqt.d;
         }
      }
   }

   public ctl<cuv> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
