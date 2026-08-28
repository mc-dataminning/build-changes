import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bot {
   bos a();

   static <T> bot.b<T> a(T $$0, int $$1) {
      return new bot.b<>($$0, bos.a($$1));
   }

   public static class a implements bot {
      private final bos a;

      public a(int $$0) {
         this.a = bos.a($$0);
      }

      public a(bos $$0) {
         this.a = $$0;
      }

      @Override
      public bos a() {
         return this.a;
      }
   }

   public static record b<T>(T a, bos b) implements bot {
      @Override
      public bos a() {
         return this.b;
      }

      public static <E> Codec<bot.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bot.b::b), bos.a.fieldOf("weight").forGetter(bot.b::c)).apply($$1, bot.b::new)
         );
      }

      public T b() {
         return this.a;
      }

      public bos c() {
         return this.b;
      }
   }
}
