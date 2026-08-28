import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record dp(cx.d c) implements ca {
   public static final MapCodec<dp> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cx.d.d.optionalFieldOf("size", cx.d.c).forGetter(dp::b)).apply($$0, dp::new)
   );

   public static dp a(cx.d $$0) {
      return new dp($$0);
   }

   @Override
   public boolean a(bxe $$0, asb $$1, @Nullable fgc $$2) {
      return $$0 instanceof cpt $$3 ? this.c.d($$3.gs()) : false;
   }

   @Override
   public MapCodec<dp> a() {
      return cb.d;
   }

   public cx.d b() {
      return this.c;
   }
}
