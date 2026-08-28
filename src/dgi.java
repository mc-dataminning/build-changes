import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

public interface dgi {
   static <T, A extends T> MapCodec<A> a(Codec<T> $$0, Function<List<T>, A> $$1, Function<A, List<T>> $$2) {
      return RecordCodecBuilder.mapCodec($$3 -> $$3.group($$0.listOf().fieldOf("effects").forGetter($$2)).apply($$3, $$1));
   }

   static dgi.a a(dgo... $$0) {
      return new dgi.a(List.of($$0));
   }

   static dgi.b a(dgp... $$0) {
      return new dgi.b(List.of($$0));
   }

   static dgi.c a(dgq... $$0) {
      return new dgi.c(List.of($$0));
   }

   public static record a(List<dgo> d) implements dgo {
      public static final MapCodec<dgi.a> a = dgi.a(dgo.b, dgi.a::new, dgi.a::b);

      @Override
      public void a(arq $$0, int $$1, dfw $$2, bwi $$3, fex $$4) {
         for (dgo $$5 : this.d) {
            $$5.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public MapCodec<dgi.a> a() {
         return a;
      }

      public List<dgo> b() {
         return this.d;
      }
   }

   public static record b(List<dgp> b) implements dgp {
      public static final MapCodec<dgi.b> a = dgi.a(dgp.c, dgi.b::new, dgi.b::b);

      @Override
      public void a(arq $$0, int $$1, dfw $$2, bwi $$3, fex $$4, boolean $$5) {
         for (dgp $$6 : this.b) {
            $$6.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }

      @Override
      public void a(dfw $$0, bwi $$1, fex $$2, int $$3) {
         for (dgp $$4 : this.b) {
            $$4.a($$0, $$1, $$2, $$3);
         }
      }

      @Override
      public MapCodec<dgi.b> a() {
         return a;
      }
   }

   public static record c(List<dgq> c) implements dgq {
      public static final MapCodec<dgi.c> a = dgi.a(dgq.b, dgi.c::new, dgi.c::b);

      @Override
      public float a(int $$0, azv $$1, float $$2) {
         for (dgq $$3 : this.c) {
            $$2 = $$3.a($$0, $$1, $$2);
         }

         return $$2;
      }

      @Override
      public MapCodec<dgi.c> a() {
         return a;
      }

      public List<dgq> b() {
         return this.c;
      }
   }
}
