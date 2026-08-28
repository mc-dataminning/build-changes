import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record ecz(int g, int h, int i, int j) {
   public static final Codec<ecz> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(ear.e, ear.d).fieldOf("min_y").forGetter(ecz::c),
                  Codec.intRange(0, ear.c).fieldOf("height").forGetter(ecz::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(ecz::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(ecz::f)
               )
               .apply($$0, ecz::new)
      )
      .comapFlatMap(ecz::a, Function.identity());
   protected static final ecz b = a(-64, 384, 1, 2);
   protected static final ecz c = a(0, 128, 1, 2);
   protected static final ecz d = a(0, 128, 2, 1);
   protected static final ecz e = a(-64, 192, 1, 2);
   protected static final ecz f = a(0, 256, 2, 1);

   private static DataResult<ecz> a(ecz $$0) {
      if ($$0.c() + $$0.d() > ear.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (ear.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static ecz a(int $$0, int $$1, int $$2, int $$3) {
      ecz $$4 = new ecz($$0, $$1, $$2, $$3);
      a($$4).error().ifPresent($$0x -> {
         throw new IllegalStateException($$0x.message());
      });
      return $$4;
   }

   public int a() {
      return kc.c(this.f());
   }

   public int b() {
      return kc.c(this.e());
   }

   public ecz a(dgj $$0) {
      int $$1 = Math.max(this.g, $$0.L_());
      int $$2 = Math.min(this.g + this.h, $$0.an() + 1) - $$1;
      return new ecz($$1, $$2, this.i, this.j);
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
