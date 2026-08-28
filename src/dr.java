import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record dr(boolean d, boolean e) implements bw {
   public static final MapCodec<dr> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("has_raid", false).forGetter(dr::b), Codec.BOOL.optionalFieldOf("is_captain", false).forGetter(dr::c))
            .apply($$0, dr::new)
   );
   public static final dr c = new dr(false, true);

   @Override
   public MapCodec<dr> a() {
      return bx.e;
   }

   @Override
   public boolean a(btr $$0, arj $$1, @Nullable eyw $$2) {
      return !($$0 instanceof cpm $$3) ? false : $$3.gE() == this.d && $$3.gD() == this.e;
   }

   public boolean b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
