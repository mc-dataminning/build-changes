import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dae(jv<btp> c) implements dac {
   public static final MapCodec<dae> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kg.a(mc.W).fieldOf("effects").forGetter(dae::b)).apply($$0, dae::new));
   public static final yn<wa, dae> b = yn.a(yl.c(mc.W), dae::b, dae::new);

   public dae(jr<btp> $$0) {
      this(jv.a($$0));
   }

   @Override
   public dac.a<dae> a() {
      return dac.a.b;
   }

   @Override
   public boolean a(dgj $$0, cwq $$1, bvi $$2) {
      boolean $$3 = false;

      for (jr<btp> $$4 : this.c) {
         if ($$2.e($$4)) {
            $$3 = true;
         }
      }

      return $$3;
   }

   public jv<btp> b() {
      return this.c;
   }
}
