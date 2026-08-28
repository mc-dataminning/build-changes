import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class buc extends btw {
   public static final MapCodec<buc> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.INT.fieldOf("min_inclusive").forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("max_inclusive").forGetter($$0x -> $$0x.f))
               .apply($$0, buc::new)
      )
      .validate(
         $$0 -> $$0.f < $$0.b
               ? DataResult.error(() -> "Max must be at least min, min_inclusive: " + $$0.b + ", max_inclusive: " + $$0.f)
               : DataResult.success($$0)
      );
   private final int b;
   private final int f;

   private buc(int $$0, int $$1) {
      this.b = $$0;
      this.f = $$1;
   }

   public static buc a(int $$0, int $$1) {
      return new buc($$0, $$1);
   }

   @Override
   public int a(azx $$0) {
      return azo.b($$0, this.b, this.f);
   }

   @Override
   public int a() {
      return this.b;
   }

   @Override
   public int b() {
      return this.f;
   }

   @Override
   public btx<?> c() {
      return btx.b;
   }

   @Override
   public String toString() {
      return "[" + this.b + "-" + this.f + "]";
   }
}
