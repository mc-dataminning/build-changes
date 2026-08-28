import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.List;
import javax.annotation.Nullable;

public record fhj<T>(T b, iw c, int d, fho e) {
   public static final Strategy<fhj<?>> a = new Strategy<fhj<?>>() {
      public int a(fhj<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable fhj<?> $$0, @Nullable fhj<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public static <T> Codec<fhj<T>> a(Codec<T> $$0) {
      MapCodec<iw> $$1 = RecordCodecBuilder.mapCodec(
         $$0x -> $$0x.group(Codec.INT.fieldOf("x").forGetter(kb::u), Codec.INT.fieldOf("y").forGetter(kb::v), Codec.INT.fieldOf("z").forGetter(kb::w))
               .apply($$0x, iw::new)
      );
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  $$0.fieldOf("i").forGetter(fhj::a), $$1.forGetter(fhj::b), Codec.INT.fieldOf("t").forGetter(fhj::c), fho.h.fieldOf("p").forGetter(fhj::d)
               )
               .apply($$2, fhj::new)
      );
   }

   public static <T> List<fhj<T>> a(List<fhj<T>> $$0, dje $$1) {
      long $$2 = $$1.a();
      return $$0.stream().filter($$1x -> dje.a($$1x.b()) == $$2).toList();
   }

   public fhk<T> a(long $$0, long $$1) {
      return new fhk<>(this.b, this.c, $$0 + (long)this.d, this.e, $$1);
   }

   public static <T> fhj<T> a(T $$0, iw $$1) {
      return new fhj<>($$0, $$1, 0, fho.d);
   }

   public T a() {
      return this.b;
   }

   public iw b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public fho d() {
      return this.e;
   }
}
