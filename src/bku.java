import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public class bku extends bkz {
   public static final Codec<bku> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.FLOAT.fieldOf("mean").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("deviation").forGetter($$0x -> $$0x.f),
                  Codec.INT.fieldOf("min_inclusive").forGetter($$0x -> $$0x.g),
                  Codec.INT.fieldOf("max_inclusive").forGetter($$0x -> $$0x.h)
               )
               .apply($$0, bku::new)
      )
      .comapFlatMap(
         $$0 -> $$0.h < $$0.g ? DataResult.error(() -> "Max must be larger than min: [" + $$0.g + ", " + $$0.h + "]") : DataResult.success($$0),
         Function.identity()
      );
   private final float b;
   private final float f;
   private final int g;
   private final int h;

   public static bku a(float $$0, float $$1, int $$2, int $$3) {
      return new bku($$0, $$1, $$2, $$3);
   }

   private bku(float $$0, float $$1, int $$2, int $$3) {
      this.b = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
   }

   @Override
   public int a(awo $$0) {
      return a($$0, this.b, this.f, (float)this.g, (float)this.h);
   }

   public static int a(awo $$0, float $$1, float $$2, float $$3, float $$4) {
      return (int)awh.a(awh.c($$0, $$1, $$2), $$3, $$4);
   }

   @Override
   public int a() {
      return this.g;
   }

   @Override
   public int b() {
      return this.h;
   }

   @Override
   public bla<?> c() {
      return bla.f;
   }

   @Override
   public String toString() {
      return "normal(" + this.b + ", " + this.f + ") in [" + this.g + "-" + this.h + "]";
   }
}
