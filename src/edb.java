import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record edb(int g, int h, int i, int j) {
   public static final Codec<edb> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(eat.e, eat.d).fieldOf("min_y").forGetter(edb::c),
                  Codec.intRange(0, eat.c).fieldOf("height").forGetter(edb::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(edb::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(edb::f)
               )
               .apply($$0, edb::new)
      )
      .comapFlatMap(edb::a, Function.identity());
   protected static final edb b = a(-64, 384, 1, 2);
   protected static final edb c = a(0, 128, 1, 2);
   protected static final edb d = a(0, 128, 2, 1);
   protected static final edb e = a(-64, 192, 1, 2);
   protected static final edb f = a(0, 256, 2, 1);

   private static DataResult<edb> a(edb $$0) {
      if ($$0.c() + $$0.d() > eat.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (eat.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static edb a(int $$0, int $$1, int $$2, int $$3) {
      edb $$4 = new edb($$0, $$1, $$2, $$3);
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

   public edb a(dgl $$0) {
      int $$1 = Math.max(this.g, $$0.L_());
      int $$2 = Math.min(this.g + this.h, $$0.an() + 1) - $$1;
      return new edb($$1, $$2, this.i, this.j);
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
