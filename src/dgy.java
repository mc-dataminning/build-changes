import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

public interface dgy {
   static <T, A extends T> MapCodec<A> a(Codec<T> $$0, Function<List<T>, A> $$1, Function<A, List<T>> $$2) {
      return RecordCodecBuilder.mapCodec($$3 -> $$3.group($$0.listOf().fieldOf("effects").forGetter($$2)).apply($$3, $$1));
   }

   static dgy.a a(dhe... $$0) {
      return new dgy.a(List.of($$0));
   }

   static dgy.b a(dhf... $$0) {
      return new dgy.b(List.of($$0));
   }

   static dgy.c a(dhg... $$0) {
      return new dgy.c(List.of($$0));
   }

   public static record a(List<dhe> d) implements dhe {
      public static final MapCodec<dgy.a> a = dgy.a(dhe.b, dgy.a::new, dgy.a::b);

      @Override
      public void a(aru $$0, int $$1, dgm $$2, bwv $$3, ffs $$4) {
         for (dhe $$5 : this.d) {
            $$5.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public MapCodec<dgy.a> a() {
         return a;
      }

      public List<dhe> b() {
         return this.d;
      }
   }

   public static record b(List<dhf> b) implements dhf {
      public static final MapCodec<dgy.b> a = dgy.a(dhf.c, dgy.b::new, dgy.b::b);

      @Override
      public void a(aru $$0, int $$1, dgm $$2, bwv $$3, ffs $$4, boolean $$5) {
         for (dhf $$6 : this.b) {
            $$6.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }

      @Override
      public void a(dgm $$0, bwv $$1, ffs $$2, int $$3) {
         for (dhf $$4 : this.b) {
            $$4.a($$0, $$1, $$2, $$3);
         }
      }

      @Override
      public MapCodec<dgy.b> a() {
         return a;
      }
   }

   public static record c(List<dhg> c) implements dhg {
      public static final MapCodec<dgy.c> a = dgy.a(dhg.b, dgy.c::new, dgy.c::b);

      @Override
      public float a(int $$0, azz $$1, float $$2) {
         for (dhg $$3 : this.c) {
            $$2 = $$3.a($$0, $$1, $$2);
         }

         return $$2;
      }

      @Override
      public MapCodec<dgy.c> a() {
         return a;
      }

      public List<dhg> b() {
         return this.c;
      }
   }
}
