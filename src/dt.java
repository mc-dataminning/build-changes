import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record dt(boolean d, boolean e) implements bx {
   public static final MapCodec<dt> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("has_raid", false).forGetter(dt::b), Codec.BOOL.optionalFieldOf("is_captain", false).forGetter(dt::c))
            .apply($$0, dt::new)
   );
   public static final dt c = new dt(false, true);

   @Override
   public MapCodec<dt> a() {
      return by.e;
   }

   @Override
   public boolean a(bvj $$0, ash $$1, @Nullable fbx $$2) {
      return !($$0 instanceof crk $$3) ? false : $$3.gD() == this.d && $$3.gC() == this.e;
   }

   public boolean b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
