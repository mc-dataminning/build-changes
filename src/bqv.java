import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bqv {
   bqu a();

   static <T> bqv.b<T> a(T $$0, int $$1) {
      return new bqv.b<>($$0, bqu.a($$1));
   }

   public static class a implements bqv {
      private final bqu a;

      public a(int $$0) {
         this.a = bqu.a($$0);
      }

      public a(bqu $$0) {
         this.a = $$0;
      }

      @Override
      public bqu a() {
         return this.a;
      }
   }

   public static record b<T>(T a, bqu b) implements bqv {
      @Override
      public bqu a() {
         return this.b;
      }

      public static <E> Codec<bqv.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bqv.b::b), bqu.a.fieldOf("weight").forGetter(bqv.b::c)).apply($$1, bqv.b::new)
         );
      }

      public T b() {
         return this.a;
      }

      public bqu c() {
         return this.b;
      }
   }
}
