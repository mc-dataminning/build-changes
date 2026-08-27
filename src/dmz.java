import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dmz(int g, int h, int i, int j) {
   public static final Codec<dmz> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(dkr.e, dkr.d).fieldOf("min_y").forGetter(dmz::c),
                  Codec.intRange(0, dkr.c).fieldOf("height").forGetter(dmz::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(dmz::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(dmz::f)
               )
               .apply($$0, dmz::new)
      )
      .comapFlatMap(dmz::a, Function.identity());
   protected static final dmz b = a(-64, 384, 1, 2);
   protected static final dmz c = a(0, 128, 1, 2);
   protected static final dmz d = a(0, 128, 2, 1);
   protected static final dmz e = a(-64, 192, 1, 2);
   protected static final dmz f = a(0, 256, 2, 1);

   private static DataResult<dmz> a(dmz $$0) {
      if ($$0.c() + $$0.d() > dkr.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (dkr.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static dmz a(int $$0, int $$1, int $$2, int $$3) {
      dmz $$4 = new dmz($$0, $$1, $$2, $$3);
      a($$4).error().ifPresent($$0x -> {
         throw new IllegalStateException($$0x.message());
      });
      return $$4;
   }

   public int a() {
      return in.c(this.f());
   }

   public int b() {
      return in.c(this.e());
   }

   public dmz a(csc $$0) {
      int $$1 = Math.max(this.g, $$0.I_());
      int $$2 = Math.min(this.g + this.h, $$0.ak()) - $$1;
      return new dmz($$1, $$2, this.i, this.j);
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
