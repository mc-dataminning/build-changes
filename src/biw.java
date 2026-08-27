import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public class biw extends biq {
   public static final Codec<biw> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("min_inclusive").forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("max_inclusive").forGetter($$0x -> $$0x.f))
               .apply($$0, biw::new)
      )
      .comapFlatMap(
         $$0 -> $$0.f < $$0.b
               ? DataResult.error(() -> "Max must be at least min, min_inclusive: " + $$0.b + ", max_inclusive: " + $$0.f)
               : DataResult.success($$0),
         Function.identity()
      );
   private final int b;
   private final int f;

   private biw(int $$0, int $$1) {
      this.b = $$0;
      this.f = $$1;
   }

   public static biw a(int $$0, int $$1) {
      return new biw($$0, $$1);
   }

   @Override
   public int a(auf $$0) {
      return aty.b($$0, this.b, this.f);
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
   public bir<?> c() {
      return bir.b;
   }

   @Override
   public String toString() {
      return "[" + this.b + "-" + this.f + "]";
   }
}
