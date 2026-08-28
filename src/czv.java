import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

public interface czv {
   static <T, A extends T> MapCodec<A> a(Codec<T> $$0, Function<List<T>, A> $$1, Function<A, List<T>> $$2) {
      return RecordCodecBuilder.mapCodec($$3 -> $$3.group($$0.listOf().fieldOf("effects").forGetter($$2)).apply($$3, $$1));
   }

   static czv.a a(dab... $$0) {
      return new czv.a(List.of($$0));
   }

   static czv.b a(dac... $$0) {
      return new czv.b(List.of($$0));
   }

   static czv.c a(dad... $$0) {
      return new czv.c(List.of($$0));
   }

   public static record a(List<dab> d) implements dab {
      public static final MapCodec<czv.a> a = czv.a(dab.b, czv.a::new, czv.a::b);

      @Override
      public void a(aqm $$0, int $$1, czk $$2, bsg $$3, ewf $$4) {
         for (dab $$5 : this.d) {
            $$5.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public MapCodec<czv.a> a() {
         return a;
      }

      public List<dab> b() {
         return this.d;
      }
   }

   public static record b(List<dac> b) implements dac {
      public static final MapCodec<czv.b> a = czv.a(dac.c, czv.b::new, czv.b::b);

      @Override
      public void a(aqm $$0, int $$1, czk $$2, bsg $$3, ewf $$4, boolean $$5) {
         for (dac $$6 : this.b) {
            $$6.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }

      @Override
      public void a(czk $$0, bsg $$1, ewf $$2, int $$3) {
         for (dac $$4 : this.b) {
            $$4.a($$0, $$1, $$2, $$3);
         }
      }

      @Override
      public MapCodec<czv.b> a() {
         return a;
      }
   }

   public static record c(List<dad> c) implements dad {
      public static final MapCodec<czv.c> a = czv.a(dad.b, czv.c::new, czv.c::b);

      @Override
      public float a(int $$0, ayo $$1, float $$2) {
         for (dad $$3 : this.c) {
            $$2 = $$3.a($$0, $$1, $$2);
         }

         return $$2;
      }

      @Override
      public MapCodec<czv.c> a() {
         return a;
      }

      public List<dad> b() {
         return this.c;
      }
   }
}
