import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

public interface czw {
   static <T, A extends T> MapCodec<A> a(Codec<T> $$0, Function<List<T>, A> $$1, Function<A, List<T>> $$2) {
      return RecordCodecBuilder.mapCodec($$3 -> $$3.group($$0.listOf().fieldOf("effects").forGetter($$2)).apply($$3, $$1));
   }

   static czw.a a(dac... $$0) {
      return new czw.a(List.of($$0));
   }

   static czw.b a(dad... $$0) {
      return new czw.b(List.of($$0));
   }

   static czw.c a(dae... $$0) {
      return new czw.c(List.of($$0));
   }

   public static record a(List<dac> d) implements dac {
      public static final MapCodec<czw.a> a = czw.a(dac.b, czw.a::new, czw.a::b);

      @Override
      public void a(aqm $$0, int $$1, czl $$2, bsh $$3, ewh $$4) {
         for (dac $$5 : this.d) {
            $$5.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public MapCodec<czw.a> a() {
         return a;
      }

      public List<dac> b() {
         return this.d;
      }
   }

   public static record b(List<dad> b) implements dad {
      public static final MapCodec<czw.b> a = czw.a(dad.c, czw.b::new, czw.b::b);

      @Override
      public void a(aqm $$0, int $$1, czl $$2, bsh $$3, ewh $$4, boolean $$5) {
         for (dad $$6 : this.b) {
            $$6.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }

      @Override
      public void a(czl $$0, bsh $$1, ewh $$2, int $$3) {
         for (dad $$4 : this.b) {
            $$4.a($$0, $$1, $$2, $$3);
         }
      }

      @Override
      public MapCodec<czw.b> a() {
         return a;
      }
   }

   public static record c(List<dae> c) implements dae {
      public static final MapCodec<czw.c> a = czw.a(dae.b, czw.c::new, czw.c::b);

      @Override
      public float a(int $$0, ayo $$1, float $$2) {
         for (dae $$3 : this.c) {
            $$2 = $$3.a($$0, $$1, $$2);
         }

         return $$2;
      }

      @Override
      public MapCodec<czw.c> a() {
         return a;
      }

      public List<dae> b() {
         return this.c;
      }
   }
}
