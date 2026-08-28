import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record eet(int g, int h, int i, int j) {
   public static final Codec<eet> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(ecj.e, ecj.d).fieldOf("min_y").forGetter(eet::c),
                  Codec.intRange(0, ecj.c).fieldOf("height").forGetter(eet::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(eet::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(eet::f)
               )
               .apply($$0, eet::new)
      )
      .comapFlatMap(eet::a, Function.identity());
   protected static final eet b = a(-64, 384, 1, 2);
   protected static final eet c = a(0, 128, 1, 2);
   protected static final eet d = a(0, 128, 2, 1);
   protected static final eet e = a(-64, 192, 1, 2);
   protected static final eet f = a(0, 256, 2, 1);

   private static DataResult<eet> a(eet $$0) {
      if ($$0.c() + $$0.d() > ecj.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (ecj.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static eet a(int $$0, int $$1, int $$2, int $$3) {
      eet $$4 = new eet($$0, $$1, $$2, $$3);
      a($$4).error().ifPresent($$0x -> {
         throw new IllegalStateException($$0x.message());
      });
      return $$4;
   }

   public int a() {
      return kd.c(this.f());
   }

   public int b() {
      return kd.c(this.e());
   }

   public eet a(dhr $$0) {
      int $$1 = Math.max(this.g, $$0.G_());
      int $$2 = Math.min(this.g + this.h, $$0.ao() + 1) - $$1;
      return new eet($$1, $$2, this.i, this.j);
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
