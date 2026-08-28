import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record de(boolean d, boolean e) implements by {
   public static final MapCodec<de> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("has_raid", false).forGetter(de::b), Codec.BOOL.optionalFieldOf("is_captain", false).forGetter(de::c))
            .apply($$0, de::new)
   );
   public static final de c = new de(false, true);

   @Override
   public MapCodec<de> a() {
      return bz.e;
   }

   @Override
   public boolean a(bwd $$0, arq $$1, @Nullable fei $$2) {
      return !($$0 instanceof cso $$3) ? false : $$3.gD() == this.d && $$3.gC() == this.e;
   }

   public boolean b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
