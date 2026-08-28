import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public record cwk(cvf<cwl> c, boolean d) implements czi {
   public static final Codec<cwk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cvf.a(ma.L, cwl.c).fieldOf("song").forGetter(cwk::a), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cwk::b))
            .apply($$0, cwk::new)
   );
   public static final zj<ww, cwk> b = zj.a(cvf.a(ma.L, cwl.d), cwk::a, zh.b, cwk::b, cwk::new);

   @Override
   public void a(cwb.b $$0, Consumer<xl> $$1, cxx $$2) {
      js.a $$3 = $$0.a();
      if (this.d && $$3 != null) {
         this.c.a($$3).ifPresent($$1x -> {
            xz $$2x = ((cwl)$$1x.a()).c().f();
            xo.a($$2x, yi.a.a(n.h));
            $$1.accept($$2x);
         });
      }
   }

   public cwk a(boolean $$0) {
      return new cwk(this.c, $$0);
   }

   public static bsh a(dff $$0, jh $$1, cwf $$2, cor $$3) {
      cwk $$4 = $$2.a(ku.ab);
      if ($$4 == null) {
         return bsh.f;
      } else {
         dvo $$5 = $$0.a_($$1);
         if ($$5.a(dil.dT) && !$$5.c(dml.b)) {
            if (!$$0.C) {
               cwf $$6 = $$2.b(1, $$3);
               if ($$0.c_($$1) instanceof dtu $$7) {
                  $$7.b($$6);
                  $$0.a(eak.c, $$1, eak.a.a($$3, $$5));
               }

               $$3.a(awy.al);
            }

            return bsh.a;
         } else {
            return bsh.f;
         }
      }
   }

   public cvf<cwl> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
