import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dac(jv<btn> c) implements daa {
   public static final MapCodec<dac> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kg.a(mc.W).fieldOf("effects").forGetter(dac::b)).apply($$0, dac::new));
   public static final yn<wa, dac> b = yn.a(yl.c(mc.W), dac::b, dac::new);

   public dac(jr<btn> $$0) {
      this(jv.a($$0));
   }

   @Override
   public daa.a<dac> a() {
      return daa.a.b;
   }

   @Override
   public boolean a(dgh $$0, cwo $$1, bvg $$2) {
      boolean $$3 = false;

      for (jr<btn> $$4 : this.c) {
         if ($$2.e($$4)) {
            $$3 = true;
         }
      }

      return $$3;
   }

   public jv<btn> b() {
      return this.c;
   }
}
