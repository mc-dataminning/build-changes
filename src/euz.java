import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record euz(czs b) implements evb {
   public static final MapCodec<euz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(czs.b.fieldOf("amount").forGetter(euz::c)).apply($$0, euz::new));

   @Override
   public float b(equ $$0) {
      int $$1 = $$0.b(etq.k);
      return this.b.a($$1);
   }

   @Override
   public eva b() {
      return evc.g;
   }

   public static euz a(czs $$0) {
      return new euz($$0);
   }

   public czs c() {
      return this.b;
   }
}
