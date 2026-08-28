import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dab(jr<avz> c) implements daa {
   public static final MapCodec<dab> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(avz.b.fieldOf("sound").forGetter(dab::b)).apply($$0, dab::new));
   public static final yn<wa, dab> b = yn.a(avz.d, dab::b, dab::new);

   @Override
   public daa.a<dab> a() {
      return daa.a.e;
   }

   @Override
   public boolean a(dgh $$0, cwo $$1, bvg $$2) {
      $$0.a(null, $$2.dv(), this.c.a(), $$2.dm(), 1.0F, 1.0F);
      return true;
   }

   public jr<avz> b() {
      return this.c;
   }
}
