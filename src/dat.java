import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dat(jr<avz> c) implements das {
   public static final MapCodec<dat> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(avz.b.fieldOf("sound").forGetter(dat::b)).apply($$0, dat::new));
   public static final yn<wa, dat> b = yn.a(avz.d, dat::b, dat::new);

   @Override
   public das.a<dat> a() {
      return das.a.e;
   }

   @Override
   public boolean a(dgz $$0, cxh $$1, bvy $$2) {
      $$0.a(null, $$2.du(), this.c.a(), $$2.dl(), 1.0F, 1.0F);
      return true;
   }

   public jr<avz> b() {
      return this.c;
   }
}
