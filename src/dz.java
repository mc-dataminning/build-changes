import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record dz(dh.d c) implements bw {
   public static final MapCodec<dz> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dh.d.d.optionalFieldOf("size", dh.d.c).forGetter(dz::b)).apply($$0, dz::new)
   );

   public static dz a(dh.d $$0) {
      return new dz($$0);
   }

   @Override
   public boolean a(btr $$0, arj $$1, @Nullable eyw $$2) {
      return $$0 instanceof clm $$3 ? this.c.d($$3.gp()) : false;
   }

   @Override
   public MapCodec<dz> a() {
      return bx.d;
   }

   public dh.d b() {
      return this.c;
   }
}
