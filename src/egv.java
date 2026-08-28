import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record egv(int g, int h, int i, int j) {
   public static final Codec<egv> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(eel.e, eel.d).fieldOf("min_y").forGetter(egv::c),
                  Codec.intRange(0, eel.c).fieldOf("height").forGetter(egv::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(egv::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(egv::f)
               )
               .apply($$0, egv::new)
      )
      .comapFlatMap(egv::a, Function.identity());
   protected static final egv b = a(-64, 384, 1, 2);
   protected static final egv c = a(0, 128, 1, 2);
   protected static final egv d = a(0, 128, 2, 1);
   protected static final egv e = a(-64, 192, 1, 2);
   protected static final egv f = a(0, 256, 2, 1);

   private static DataResult<egv> a(egv $$0) {
      if ($$0.c() + $$0.d() > eel.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (eel.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static egv a(int $$0, int $$1, int $$2, int $$3) {
      egv $$4 = new egv($$0, $$1, $$2, $$3);
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

   public egv a(djj $$0) {
      int $$1 = Math.max(this.g, $$0.G_());
      int $$2 = Math.min(this.g + this.h, $$0.ao() + 1) - $$1;
      return new egv($$1, $$2, this.i, this.j);
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
