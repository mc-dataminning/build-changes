import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dry(int g, int h, int i, int j) {
   public static final Codec<dry> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(dpq.e, dpq.d).fieldOf("min_y").forGetter(dry::c),
                  Codec.intRange(0, dpq.c).fieldOf("height").forGetter(dry::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(dry::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(dry::f)
               )
               .apply($$0, dry::new)
      )
      .comapFlatMap(dry::a, Function.identity());
   protected static final dry b = a(-64, 384, 1, 2);
   protected static final dry c = a(0, 128, 1, 2);
   protected static final dry d = a(0, 128, 2, 1);
   protected static final dry e = a(-64, 192, 1, 2);
   protected static final dry f = a(0, 256, 2, 1);

   private static DataResult<dry> a(dry $$0) {
      if ($$0.c() + $$0.d() > dpq.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (dpq.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static dry a(int $$0, int $$1, int $$2, int $$3) {
      dry $$4 = new dry($$0, $$1, $$2, $$3);
      a($$4).error().ifPresent($$0x -> {
         throw new IllegalStateException($$0x.message());
      });
      return $$4;
   }

   public int a() {
      return iw.c(this.f());
   }

   public int b() {
      return iw.c(this.e());
   }

   public dry a(cwg $$0) {
      int $$1 = Math.max(this.g, $$0.J_());
      int $$2 = Math.min(this.g + this.h, $$0.ak()) - $$1;
      return new dry($$1, $$2, this.i, this.j);
   }

   public int c() {
      return this.g;
   }

   public int d() {
      return this.h;
   }

   public int e() {
      return this.i;
   }

   public int f() {
      return this.j;
   }
}
