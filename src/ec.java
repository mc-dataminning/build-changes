import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record ec(dk.d c) implements by {
   public static final MapCodec<ec> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dk.d.d.optionalFieldOf("size", dk.d.c).forGetter(ec::b)).apply($$0, ec::new)
   );

   public static ec a(dk.d $$0) {
      return new ec($$0);
   }

   @Override
   public boolean a(bul $$0, ard $$1, @Nullable fba $$2) {
      return $$0 instanceof cmh $$3 ? this.c.d($$3.gs()) : false;
   }

   @Override
   public MapCodec<ec> a() {
      return bz.d;
   }

   public dk.d b() {
      return this.c;
   }
}
