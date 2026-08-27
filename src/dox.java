import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dox(int g, int h, int i, int j) {
   public static final Codec<dox> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(dmp.e, dmp.d).fieldOf("min_y").forGetter(dox::c),
                  Codec.intRange(0, dmp.c).fieldOf("height").forGetter(dox::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(dox::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(dox::f)
               )
               .apply($$0, dox::new)
      )
      .comapFlatMap(dox::a, Function.identity());
   protected static final dox b = a(-64, 384, 1, 2);
   protected static final dox c = a(0, 128, 1, 2);
   protected static final dox d = a(0, 128, 2, 1);
   protected static final dox e = a(-64, 192, 1, 2);
   protected static final dox f = a(0, 256, 2, 1);

   private static DataResult<dox> a(dox $$0) {
      if ($$0.c() + $$0.d() > dmp.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (dmp.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static dox a(int $$0, int $$1, int $$2, int $$3) {
      dox $$4 = new dox($$0, $$1, $$2, $$3);
      a($$4).error().ifPresent($$0x -> {
         throw new IllegalStateException($$0x.message());
      });
      return $$4;
   }

   public int a() {
      return is.c(this.f());
   }

   public int b() {
      return is.c(this.e());
   }

   public dox a(ctq $$0) {
      int $$1 = Math.max(this.g, $$0.J_());
      int $$2 = Math.min(this.g + this.h, $$0.al()) - $$1;
      return new dox($$1, $$2, this.i, this.j);
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
