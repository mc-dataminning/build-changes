import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dad(czq d) implements czz {
   public static final MapCodec<dad> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(czq.b.fieldOf("duration").forGetter($$0x -> $$0x.d)).apply($$0, dad::new));

   @Override
   public void a(aqk $$0, int $$1, czi $$2, bsd $$3, evz $$4) {
      $$3.d(this.d.a($$1));
   }

   @Override
   public MapCodec<dad> a() {
      return a;
   }

   public czq b() {
      return this.d;
   }
}
