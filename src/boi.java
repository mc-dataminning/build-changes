import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface boi {
   boh a();

   static <T> boi.b<T> a(T $$0, int $$1) {
      return new boi.b<>($$0, boh.a($$1));
   }

   public static class a implements boi {
      private final boh a;

      public a(int $$0) {
         this.a = boh.a($$0);
      }

      public a(boh $$0) {
         this.a = $$0;
      }

      @Override
      public boh a() {
         return this.a;
      }
   }

   public static record b<T>(T a, boh b) implements boi {
      @Override
      public boh a() {
         return this.b;
      }

      public static <E> Codec<boi.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(boi.b::b), boh.a.fieldOf("weight").forGetter(boi.b::c)).apply($$1, boi.b::new)
         );
      }

      public T b() {
         return this.a;
      }

      public boh c() {
         return this.b;
      }
   }
}
