import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record df(boolean d, boolean e) implements bz {
   public static final MapCodec<df> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("has_raid", false).forGetter(df::b), Codec.BOOL.optionalFieldOf("is_captain", false).forGetter(df::c))
            .apply($$0, df::new)
   );
   public static final df c = new df(false, true);

   @Override
   public MapCodec<df> a() {
      return ca.e;
   }

   @Override
   public boolean a(bwt $$0, ars $$1, @Nullable ffq $$2) {
      return !($$0 instanceof cto $$3) ? false : $$3.gH() == this.d && $$3.gG() == this.e;
   }

   public boolean b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
