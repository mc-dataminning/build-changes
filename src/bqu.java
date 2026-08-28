import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bqu {
   bqt a();

   static <T> bqu.b<T> a(T $$0, int $$1) {
      return new bqu.b<>($$0, bqt.a($$1));
   }

   public static class a implements bqu {
      private final bqt a;

      public a(int $$0) {
         this.a = bqt.a($$0);
      }

      public a(bqt $$0) {
         this.a = $$0;
      }

      @Override
      public bqt a() {
         return this.a;
      }
   }

   public static record b<T>(T a, bqt b) implements bqu {
      @Override
      public bqt a() {
         return this.b;
      }

      public static <E> Codec<bqu.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bqu.b::b), bqt.a.fieldOf("weight").forGetter(bqu.b::c)).apply($$1, bqu.b::new)
         );
      }

      public T b() {
         return this.a;
      }

      public bqt c() {
         return this.b;
      }
   }
}
