import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dds(dde d) implements ddo {
   public static final MapCodec<dds> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dde.b.fieldOf("duration").forGetter($$0x -> $$0x.d)).apply($$0, dds::new));

   @Override
   public void a(arc $$0, int $$1, dcw $$2, buj $$3, fay $$4) {
      $$3.d(this.d.a($$1));
   }

   @Override
   public MapCodec<dds> a() {
      return a;
   }

   public dde b() {
      return this.d;
   }
}
