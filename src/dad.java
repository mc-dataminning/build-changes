import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dad(jr<avz> c) implements dac {
   public static final MapCodec<dad> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(avz.b.fieldOf("sound").forGetter(dad::b)).apply($$0, dad::new));
   public static final yn<wa, dad> b = yn.a(avz.d, dad::b, dad::new);

   @Override
   public dac.a<dad> a() {
      return dac.a.e;
   }

   @Override
   public boolean a(dgj $$0, cwq $$1, bvi $$2) {
      $$0.a(null, $$2.dv(), this.c.a(), $$2.dm(), 1.0F, 1.0F);
      return true;
   }

   public jr<avz> b() {
      return this.c;
   }
}
