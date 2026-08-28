import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record deu(deg d) implements deq {
   public static final MapCodec<deu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(deg.b.fieldOf("duration").forGetter($$0x -> $$0x.d)).apply($$0, deu::new));

   @Override
   public void a(ash $$0, int $$1, ddy $$2, bvk $$3, fby $$4) {
      $$3.d(this.d.a($$1));
   }

   @Override
   public MapCodec<deu> a() {
      return a;
   }

   public deg b() {
      return this.d;
   }
}
