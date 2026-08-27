import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dwh(int g, int h, int i, int j) {
   public static final Codec<dwh> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(dtz.e, dtz.d).fieldOf("min_y").forGetter(dwh::c),
                  Codec.intRange(0, dtz.c).fieldOf("height").forGetter(dwh::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(dwh::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(dwh::f)
               )
               .apply($$0, dwh::new)
      )
      .comapFlatMap(dwh::a, Function.identity());
   protected static final dwh b = a(-64, 384, 1, 2);
   protected static final dwh c = a(0, 128, 1, 2);
   protected static final dwh d = a(0, 128, 2, 1);
   protected static final dwh e = a(-64, 192, 1, 2);
   protected static final dwh f = a(0, 256, 2, 1);

   private static DataResult<dwh> a(dwh $$0) {
      if ($$0.c() + $$0.d() > dtz.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (dtz.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static dwh a(int $$0, int $$1, int $$2, int $$3) {
      dwh $$4 = new dwh($$0, $$1, $$2, $$3);
      a($$4).error().ifPresent($$0x -> {
         throw new IllegalStateException($$0x.message());
      });
      return $$4;
   }

   public int a() {
      return jh.c(this.f());
   }

   public int b() {
      return jh.c(this.e());
   }

   public dwh a(daf $$0) {
      int $$1 = Math.max(this.g, $$0.I_());
      int $$2 = Math.min(this.g + this.h, $$0.al()) - $$1;
      return new dwh($$1, $$2, this.i, this.j);
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
