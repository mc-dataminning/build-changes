import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bqn {
   bqm a();

   static <T> bqn.b<T> a(T $$0, int $$1) {
      return new bqn.b<>($$0, bqm.a($$1));
   }

   public static class a implements bqn {
      private final bqm a;

      public a(int $$0) {
         this.a = bqm.a($$0);
      }

      public a(bqm $$0) {
         this.a = $$0;
      }

      @Override
      public bqm a() {
         return this.a;
      }
   }

   public static record b<T>(T a, bqm b) implements bqn {
      @Override
      public bqm a() {
         return this.b;
      }

      public static <E> Codec<bqn.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bqn.b::b), bqm.a.fieldOf("weight").forGetter(bqn.b::c)).apply($$1, bqn.b::new)
         );
      }

      public T b() {
         return this.a;
      }

      public bqm c() {
         return this.b;
      }
   }
}
