import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record dm(boolean d, boolean e) implements bv {
   public static final MapCodec<dm> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("has_raid", false).forGetter(dm::b), Codec.BOOL.optionalFieldOf("is_captain", false).forGetter(dm::c))
            .apply($$0, dm::new)
   );
   public static final dm c = new dm(false, true);

   @Override
   public MapCodec<dm> a() {
      return bw.e;
   }

   @Override
   public boolean a(bsp $$0, arb $$1, @Nullable evm $$2) {
      return !($$0 instanceof coe $$3) ? false : $$3.gG() == this.d && $$3.gF() == this.e;
   }

   public boolean b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
