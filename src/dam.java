import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

public interface dam {
   static <T, A extends T> MapCodec<A> a(Codec<T> $$0, Function<List<T>, A> $$1, Function<A, List<T>> $$2) {
      return RecordCodecBuilder.mapCodec($$3 -> $$3.group($$0.listOf().fieldOf("effects").forGetter($$2)).apply($$3, $$1));
   }

   static dam.a a(das... $$0) {
      return new dam.a(List.of($$0));
   }

   static dam.b a(dat... $$0) {
      return new dam.b(List.of($$0));
   }

   static dam.c a(dau... $$0) {
      return new dam.c(List.of($$0));
   }

   public static record a(List<das> d) implements das {
      public static final MapCodec<dam.a> a = dam.a(das.b, dam.a::new, dam.a::b);

      @Override
      public void a(aqu $$0, int $$1, dab $$2, bsr $$3, exa $$4) {
         for (das $$5 : this.d) {
            $$5.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public MapCodec<dam.a> a() {
         return a;
      }

      public List<das> b() {
         return this.d;
      }
   }

   public static record b(List<dat> b) implements dat {
      public static final MapCodec<dam.b> a = dam.a(dat.c, dam.b::new, dam.b::b);

      @Override
      public void a(aqu $$0, int $$1, dab $$2, bsr $$3, exa $$4, boolean $$5) {
         for (dat $$6 : this.b) {
            $$6.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }

      @Override
      public void a(dab $$0, bsr $$1, exa $$2, int $$3) {
         for (dat $$4 : this.b) {
            $$4.a($$0, $$1, $$2, $$3);
         }
      }

      @Override
      public MapCodec<dam.b> a() {
         return a;
      }
   }

   public static record c(List<dau> c) implements dau {
      public static final MapCodec<dam.c> a = dam.a(dau.b, dam.c::new, dam.c::b);

      @Override
      public float a(int $$0, ayw $$1, float $$2) {
         for (dau $$3 : this.c) {
            $$2 = $$3.a($$0, $$1, $$2);
         }

         return $$2;
      }

      @Override
      public MapCodec<dam.c> a() {
         return a;
      }

      public List<dau> b() {
         return this.c;
      }
   }
}
