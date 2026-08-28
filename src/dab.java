import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dab(jv<btm> c) implements czz {
   public static final MapCodec<dab> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kg.a(mc.W).fieldOf("effects").forGetter(dab::b)).apply($$0, dab::new));
   public static final ym<vz, dab> b = ym.a(yk.c(mc.W), dab::b, dab::new);

   public dab(jr<btm> $$0) {
      this(jv.a($$0));
   }

   @Override
   public czz.a<dab> a() {
      return czz.a.b;
   }

   @Override
   public boolean a(dgg $$0, cwn $$1, bvf $$2) {
      boolean $$3 = false;

      for (jr<btm> $$4 : this.c) {
         if ($$2.e($$4)) {
            $$3 = true;
         }
      }

      return $$3;
   }

   public jv<btm> b() {
      return this.c;
   }
}
