import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

public interface dco {
   static <T, A extends T> MapCodec<A> a(Codec<T> $$0, Function<List<T>, A> $$1, Function<A, List<T>> $$2) {
      return RecordCodecBuilder.mapCodec($$3 -> $$3.group($$0.listOf().fieldOf("effects").forGetter($$2)).apply($$3, $$1));
   }

   static dco.a a(dcu... $$0) {
      return new dco.a(List.of($$0));
   }

   static dco.b a(dcv... $$0) {
      return new dco.b(List.of($$0));
   }

   static dco.c a(dcw... $$0) {
      return new dco.c(List.of($$0));
   }

   public static record a(List<dcu> d) implements dcu {
      public static final MapCodec<dco.a> a = dco.a(dcu.b, dco.a::new, dco.a::b);

      @Override
      public void a(arp $$0, int $$1, dcc $$2, bul $$3, ezy $$4) {
         for (dcu $$5 : this.d) {
            $$5.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public MapCodec<dco.a> a() {
         return a;
      }

      public List<dcu> b() {
         return this.d;
      }
   }

   public static record b(List<dcv> b) implements dcv {
      public static final MapCodec<dco.b> a = dco.a(dcv.c, dco.b::new, dco.b::b);

      @Override
      public void a(arp $$0, int $$1, dcc $$2, bul $$3, ezy $$4, boolean $$5) {
         for (dcv $$6 : this.b) {
            $$6.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }

      @Override
      public void a(dcc $$0, bul $$1, ezy $$2, int $$3) {
         for (dcv $$4 : this.b) {
            $$4.a($$0, $$1, $$2, $$3);
         }
      }

      @Override
      public MapCodec<dco.b> a() {
         return a;
      }
   }

   public static record c(List<dcw> c) implements dcw {
      public static final MapCodec<dco.c> a = dco.a(dcw.b, dco.c::new, dco.c::b);

      @Override
      public float a(int $$0, azu $$1, float $$2) {
         for (dcw $$3 : this.c) {
            $$2 = $$3.a($$0, $$1, $$2);
         }

         return $$2;
      }

      @Override
      public MapCodec<dco.c> a() {
         return a;
      }

      public List<dcw> b() {
         return this.c;
      }
   }
}
