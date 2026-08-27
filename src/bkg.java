import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bkg {
   bkf a();

   static <T> bkg.b<T> a(T $$0, int $$1) {
      return new bkg.b<>($$0, bkf.a($$1));
   }

   public static class a implements bkg {
      private final bkf a;

      public a(int $$0) {
         this.a = bkf.a($$0);
      }

      public a(bkf $$0) {
         this.a = $$0;
      }

      @Override
      public bkf a() {
         return this.a;
      }
   }

   public static class b<T> implements bkg {
      private final T a;
      private final bkf b;

      b(T $$0, bkf $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public T b() {
         return this.a;
      }

      @Override
      public bkf a() {
         return this.b;
      }

      public static <E> Codec<bkg.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bkg.b::b), bkf.a.fieldOf("weight").forGetter(bkg.b::a)).apply($$1, bkg.b::new)
         );
      }
   }
}
