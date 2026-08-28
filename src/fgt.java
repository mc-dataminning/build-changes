import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.List;
import javax.annotation.Nullable;

public record fgt<T>(T b, iv c, int d, fgy e) {
   public static final Strategy<fgt<?>> a = new Strategy<fgt<?>>() {
      public int a(fgt<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable fgt<?> $$0, @Nullable fgt<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public static <T> Codec<fgt<T>> a(Codec<T> $$0) {
      MapCodec<iv> $$1 = RecordCodecBuilder.mapCodec(
         $$0x -> $$0x.group(Codec.INT.fieldOf("x").forGetter(ka::u), Codec.INT.fieldOf("y").forGetter(ka::v), Codec.INT.fieldOf("z").forGetter(ka::w))
               .apply($$0x, iv::new)
      );
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  $$0.fieldOf("i").forGetter(fgt::a), $$1.forGetter(fgt::b), Codec.INT.fieldOf("t").forGetter(fgt::c), fgy.h.fieldOf("p").forGetter(fgt::d)
               )
               .apply($$2, fgt::new)
      );
   }

   public static <T> List<fgt<T>> a(List<fgt<T>> $$0, dir $$1) {
      long $$2 = $$1.a();
      return $$0.stream().filter($$1x -> dir.a($$1x.b()) == $$2).toList();
   }

   public fgu<T> a(long $$0, long $$1) {
      return new fgu<>(this.b, this.c, $$0 + (long)this.d, this.e, $$1);
   }

   public static <T> fgt<T> a(T $$0, iv $$1) {
      return new fgt<>($$0, $$1, 0, fgy.d);
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

   public fgy d() {
      return this.e;
   }
}
