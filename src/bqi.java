import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bqi {
   bqh a();

   static <T> bqi.b<T> a(T $$0, int $$1) {
      return new bqi.b<>($$0, bqh.a($$1));
   }

   public static class a implements bqi {
      private final bqh a;

      public a(int $$0) {
         this.a = bqh.a($$0);
      }

      public a(bqh $$0) {
         this.a = $$0;
      }

      @Override
      public bqh a() {
         return this.a;
      }
   }

   public static record b<T>(T a, bqh b) implements bqi {
      @Override
      public bqh a() {
         return this.b;
      }

      public static <E> Codec<bqi.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bqi.b::b), bqh.a.fieldOf("weight").forGetter(bqi.b::c)).apply($$1, bqi.b::new)
         );
      }

      public T b() {
         return this.a;
      }

      public bqh c() {
         return this.b;
      }
   }
}
