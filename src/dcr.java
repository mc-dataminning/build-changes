import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcr(dcd d) implements dcn {
   public static final MapCodec<dcr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dcd.b.fieldOf("duration").forGetter($$0x -> $$0x.d)).apply($$0, dcr::new));

   @Override
   public void a(arq $$0, int $$1, dbv $$2, bui $$3, ezr $$4) {
      $$3.d(this.d.a($$1));
   }

   @Override
   public MapCodec<dcr> a() {
      return a;
   }

   public dcd b() {
      return this.d;
   }
}
