import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcn(dck c) implements dcw {
   public static final MapCodec<dcn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dck.b.fieldOf("value").forGetter(dcn::b)).apply($$0, dcn::new));

   @Override
   public float a(int $$0, azu $$1, float $$2) {
      return $$2 + this.c.a($$0);
   }

   @Override
   public MapCodec<dcn> a() {
      return a;
   }

   public dck b() {
      return this.c;
   }
}
