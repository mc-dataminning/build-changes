import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record eha(int g, int h, int i, int j) {
   public static final Codec<eha> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(eeq.e, eeq.d).fieldOf("min_y").forGetter(eha::c),
                  Codec.intRange(0, eeq.c).fieldOf("height").forGetter(eha::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(eha::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(eha::f)
               )
               .apply($$0, eha::new)
      )
      .comapFlatMap(eha::a, Function.identity());
   protected static final eha b = a(-64, 384, 1, 2);
   protected static final eha c = a(0, 128, 1, 2);
   protected static final eha d = a(0, 128, 2, 1);
   protected static final eha e = a(-64, 192, 1, 2);
   protected static final eha f = a(0, 256, 2, 1);

   private static DataResult<eha> a(eha $$0) {
      if ($$0.c() + $$0.d() > eeq.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (eeq.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static eha a(int $$0, int $$1, int $$2, int $$3) {
      eha $$4 = new eha($$0, $$1, $$2, $$3);
      a($$4).error().ifPresent($$0x -> {
         throw new IllegalStateException($$0x.message());
      });
      return $$4;
   }

   public int a() {
      return jq.c(this.f());
   }

   public int b() {
      return jq.c(this.e());
   }

   public eha a(djo $$0) {
      int $$1 = Math.max(this.g, $$0.G_());
      int $$2 = Math.min(this.g + this.h, $$0.ao() + 1) - $$1;
      return new eha($$1, $$2, this.i, this.j);
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
