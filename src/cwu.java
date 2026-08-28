import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public record cwu(cvp<cwv> c, boolean d) implements czs {
   public static final Codec<cwu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cvp.a(mc.L, cwv.c).fieldOf("song").forGetter(cwu::a), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cwu::b))
            .apply($$0, cwu::new)
   );
   public static final ym<vz, cwu> b = ym.a(cvp.a(mc.L, cwv.d), cwu::a, yk.b, cwu::b, cwu::new);

   @Override
   public void a(cwl.b $$0, Consumer<wo> $$1, cyh $$2) {
      jt.a $$3 = $$0.a();
      if (this.d && $$3 != null) {
         this.c.a($$3).ifPresent($$1x -> {
            xc $$2x = ((cwv)$$1x.a()).c().f();
            wr.a($$2x, xl.a.a(n.h));
            $$1.accept($$2x);
         });
      }
   }

   public cwu a(boolean $$0) {
      return new cwu(this.c, $$0);
   }

   public static bsj a(dgi $$0, ji $$1, cwp $$2, cox $$3) {
      cwu $$4 = $$2.a(kv.ab);
      if ($$4 == null) {
         return bsj.f;
      } else {
         dwx $$5 = $$0.a_($$1);
         if ($$5.a(djo.eg) && !$$5.c(dnr.b)) {
            if (!$$0.C) {
               cwp $$6 = $$2.b(1, $$3);
               if ($$0.c_($$1) instanceof dvd $$7) {
                  $$7.b($$6);
                  $$0.a(ebt.c, $$1, ebt.a.a($$3, $$5));
               }

               $$3.a(awk.al);
            }

            return bsj.a;
         } else {
            return bsj.f;
         }
      }
   }

   public cvp<cwv> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
