import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record ds(boolean d, boolean e) implements bw {
   public static final MapCodec<ds> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("has_raid", false).forGetter(ds::b), Codec.BOOL.optionalFieldOf("is_captain", false).forGetter(ds::c))
            .apply($$0, ds::new)
   );
   public static final ds c = new ds(false, true);

   @Override
   public MapCodec<ds> a() {
      return bx.e;
   }

   @Override
   public boolean a(btz $$0, arm $$1, @Nullable ezh $$2) {
      return !($$0 instanceof cpw $$3) ? false : $$3.gL() == this.d && $$3.gK() == this.e;
   }

   public boolean b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
