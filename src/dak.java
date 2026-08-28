import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

public interface dak {
   static <T, A extends T> MapCodec<A> a(Codec<T> $$0, Function<List<T>, A> $$1, Function<A, List<T>> $$2) {
      return RecordCodecBuilder.mapCodec($$3 -> $$3.group($$0.listOf().fieldOf("effects").forGetter($$2)).apply($$3, $$1));
   }

   static dak.a a(daq... $$0) {
      return new dak.a(List.of($$0));
   }

   static dak.b a(dar... $$0) {
      return new dak.b(List.of($$0));
   }

   static dak.c a(das... $$0) {
      return new dak.c(List.of($$0));
   }

   public static record a(List<daq> d) implements daq {
      public static final MapCodec<dak.a> a = dak.a(daq.b, dak.a::new, dak.a::b);

      @Override
      public void a(aqt $$0, int $$1, czz $$2, bsq $$3, eww $$4) {
         for (daq $$5 : this.d) {
            $$5.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public MapCodec<dak.a> a() {
         return a;
      }

      public List<daq> b() {
         return this.d;
      }
   }

   public static record b(List<dar> b) implements dar {
      public static final MapCodec<dak.b> a = dak.a(dar.c, dak.b::new, dak.b::b);

      @Override
      public void a(aqt $$0, int $$1, czz $$2, bsq $$3, eww $$4, boolean $$5) {
         for (dar $$6 : this.b) {
            $$6.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }

      @Override
      public void a(czz $$0, bsq $$1, eww $$2, int $$3) {
         for (dar $$4 : this.b) {
            $$4.a($$0, $$1, $$2, $$3);
         }
      }

      @Override
      public MapCodec<dak.b> a() {
         return a;
      }
   }

   public static record c(List<das> c) implements das {
      public static final MapCodec<dak.c> a = dak.a(das.b, dak.c::new, dak.c::b);

      @Override
      public float a(int $$0, ayv $$1, float $$2) {
         for (das $$3 : this.c) {
            $$2 = $$3.a($$0, $$1, $$2);
         }

         return $$2;
      }

      @Override
      public MapCodec<dak.c> a() {
         return a;
      }

      public List<das> b() {
         return this.c;
      }
   }
}
