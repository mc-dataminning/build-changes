import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.List;
import javax.annotation.Nullable;

public record fgo<T>(T b, iv c, int d, fgt e) {
   public static final Strategy<fgo<?>> a = new Strategy<fgo<?>>() {
      public int a(fgo<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable fgo<?> $$0, @Nullable fgo<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public static <T> Codec<fgo<T>> a(Codec<T> $$0) {
      MapCodec<iv> $$1 = RecordCodecBuilder.mapCodec(
         $$0x -> $$0x.group(Codec.INT.fieldOf("x").forGetter(ka::u), Codec.INT.fieldOf("y").forGetter(ka::v), Codec.INT.fieldOf("z").forGetter(ka::w))
               .apply($$0x, iv::new)
      );
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  $$0.fieldOf("i").forGetter(fgo::a), $$1.forGetter(fgo::b), Codec.INT.fieldOf("t").forGetter(fgo::c), fgt.h.fieldOf("p").forGetter(fgo::d)
               )
               .apply($$2, fgo::new)
      );
   }

   public static <T> List<fgo<T>> a(List<fgo<T>> $$0, dio $$1) {
      long $$2 = $$1.a();
      return $$0.stream().filter($$1x -> dio.a($$1x.b()) == $$2).toList();
   }

   public fgp<T> a(long $$0, long $$1) {
      return new fgp<>(this.b, this.c, $$0 + (long)this.d, this.e, $$1);
   }

   public static <T> fgo<T> a(T $$0, iv $$1) {
      return new fgo<>($$0, $$1, 0, fgt.d);
   }

   public T a() {
      return this.b;
   }

   public iv b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public fgt d() {
      return this.e;
   }
}
