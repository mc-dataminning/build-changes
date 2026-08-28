import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record egg(int g, int h, int i, int j) {
   public static final Codec<egg> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(edw.e, edw.d).fieldOf("min_y").forGetter(egg::c),
                  Codec.intRange(0, edw.c).fieldOf("height").forGetter(egg::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(egg::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(egg::f)
               )
               .apply($$0, egg::new)
      )
      .comapFlatMap(egg::a, Function.identity());
   protected static final egg b = a(-64, 384, 1, 2);
   protected static final egg c = a(0, 128, 1, 2);
   protected static final egg d = a(0, 128, 2, 1);
   protected static final egg e = a(-64, 192, 1, 2);
   protected static final egg f = a(0, 256, 2, 1);

   private static DataResult<egg> a(egg $$0) {
      if ($$0.c() + $$0.d() > edw.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (edw.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static egg a(int $$0, int $$1, int $$2, int $$3) {
      egg $$4 = new egg($$0, $$1, $$2, $$3);
      a($$4).error().ifPresent($$0x -> {
         throw new IllegalStateException($$0x.message());
      });
      return $$4;
   }

   public int a() {
      return jp.c(this.f());
   }

   public int b() {
      return jp.c(this.e());
   }

   public egg a(dix $$0) {
      int $$1 = Math.max(this.g, $$0.G_());
      int $$2 = Math.min(this.g + this.h, $$0.ao() + 1) - $$1;
      return new egg($$1, $$2, this.i, this.j);
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
