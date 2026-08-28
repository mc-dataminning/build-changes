import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bqb {
   bqa a();

   static <T> bqb.b<T> a(T $$0, int $$1) {
      return new bqb.b<>($$0, bqa.a($$1));
   }

   public static class a implements bqb {
      private final bqa a;

      public a(int $$0) {
         this.a = bqa.a($$0);
      }

      public a(bqa $$0) {
         this.a = $$0;
      }

      @Override
      public bqa a() {
         return this.a;
      }
   }

   public static record b<T>(T a, bqa b) implements bqb {
      @Override
      public bqa a() {
         return this.b;
      }

      public static <E> Codec<bqb.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bqb.b::b), bqa.a.fieldOf("weight").forGetter(bqb.b::c)).apply($$1, bqb.b::new)
         );
      }

      public T b() {
         return this.a;
      }

      public bqa c() {
         return this.b;
      }
   }
}
