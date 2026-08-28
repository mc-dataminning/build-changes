import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bpi {
   bph a();

   static <T> bpi.b<T> a(T $$0, int $$1) {
      return new bpi.b<>($$0, bph.a($$1));
   }

   public static class a implements bpi {
      private final bph a;

      public a(int $$0) {
         this.a = bph.a($$0);
      }

      public a(bph $$0) {
         this.a = $$0;
      }

      @Override
      public bph a() {
         return this.a;
      }
   }

   public static record b<T>(T a, bph b) implements bpi {
      @Override
      public bph a() {
         return this.b;
      }

      public static <E> Codec<bpi.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bpi.b::b), bph.a.fieldOf("weight").forGetter(bpi.b::c)).apply($$1, bpi.b::new)
         );
      }

      public T b() {
         return this.a;
      }

      public bph c() {
         return this.b;
      }
   }
}
