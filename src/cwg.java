import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public record cwg(cvb<cwh> c, boolean d) implements cze {
   public static final Codec<cwg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cvb.a(lz.L, cwh.c).fieldOf("song").forGetter(cwg::a), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cwg::b))
            .apply($$0, cwg::new)
   );
   public static final zg<wt, cwg> b = zg.a(cvb.a(lz.L, cwh.d), cwg::a, ze.b, cwg::b, cwg::new);

   @Override
   public void a(cvx.b $$0, Consumer<xi> $$1, cxt $$2) {
      js.a $$3 = $$0.a();
      if (this.d && $$3 != null) {
         this.c.a($$3).ifPresent($$1x -> {
            xw $$2x = ((cwh)$$1x.a()).c().f();
            xl.a($$2x, yf.a.a(n.h));
            $$1.accept($$2x);
         });
      }
   }

   public cwg a(boolean $$0) {
      return new cwg(this.c, $$0);
   }

   public static bsd a(dfb $$0, jh $$1, cwb $$2, com $$3) {
      cwg $$4 = $$2.a(ku.ab);
      if ($$4 == null) {
         return bsd.f;
      } else {
         dvj $$5 = $$0.a_($$1);
         if ($$5.a(dig.dT) && !$$5.c(dmg.b)) {
            if (!$$0.C) {
               cwb $$6 = $$2.b(1, $$3);
               if ($$0.c_($$1) instanceof dtp $$7) {
                  $$7.b($$6);
                  $$0.a(eag.c, $$1, eag.a.a($$3, $$5));
               }

               $$3.a(awv.al);
            }

            return bsd.a;
         } else {
            return bsd.f;
         }
      }
   }

   public cvb<cwh> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
