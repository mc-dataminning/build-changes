import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public record cus(ctj<cut> c, boolean d) implements cxw {
   public static final Codec<cus> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ctj.a(lu.L, cut.c).fieldOf("song").forGetter(cus::a), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cus::b))
            .apply($$0, cus::new)
   );
   public static final yw<wj, cus> b = yw.a(ctj.a(lu.L, cut.d), cus::a, yu.b, cus::b, cus::new);

   @Override
   public void a(cuj.b $$0, Consumer<wy> $$1, cwk $$2) {
      jo.a $$3 = $$0.a();
      if (this.d && $$3 != null) {
         this.c.a($$3).ifPresent($$1x -> {
            xm $$2x = ((cut)$$1x.a()).c().f();
            xb.a($$2x, xv.a.a(n.h));
            $$1.accept($$2x);
         });
      }
   }

   public cus a(boolean $$0) {
      return new cus(this.c, $$0);
   }

   public static bqs a(dcu $$0, jd $$1, cuo $$2, cmv $$3) {
      cus $$4 = $$2.a(kq.R);
      if ($$4 == null) {
         return bqs.d;
      } else {
         dta $$5 = $$0.a_($$1);
         if ($$5.a(dfy.dT) && !$$5.c(djz.b)) {
            if (!$$0.B) {
               cuo $$6 = $$2.b(1, $$3);
               if ($$0.c_($$1) instanceof drh $$7) {
                  $$7.b($$6);
                  $$0.a(dxw.c, $$1, dxw.a.a($$3, $$5));
               }

               $$3.a(avy.al);
            }

            return bqs.a($$0.B);
         } else {
            return bqs.d;
         }
      }
   }

   public ctj<cut> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
