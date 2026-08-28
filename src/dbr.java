import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbr(dbd d) implements dbn {
   public static final MapCodec<dbr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbd.b.fieldOf("duration").forGetter($$0x -> $$0x.d)).apply($$0, dbr::new));

   @Override
   public void a(arg $$0, int $$1, dav $$2, btj $$3, eye $$4) {
      $$3.d(this.d.a($$1));
   }

   @Override
   public MapCodec<dbr> a() {
      return a;
   }

   public dbd b() {
      return this.d;
   }
}
