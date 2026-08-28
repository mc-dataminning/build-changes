import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

public interface dby {
   static <T, A extends T> MapCodec<A> a(Codec<T> $$0, Function<List<T>, A> $$1, Function<A, List<T>> $$2) {
      return RecordCodecBuilder.mapCodec($$3 -> $$3.group($$0.listOf().fieldOf("effects").forGetter($$2)).apply($$3, $$1));
   }

   static dby.a a(dce... $$0) {
      return new dby.a(List.of($$0));
   }

   static dby.b a(dcf... $$0) {
      return new dby.b(List.of($$0));
   }

   static dby.c a(dcg... $$0) {
      return new dby.c(List.of($$0));
   }

   public static record a(List<dce> d) implements dce {
      public static final MapCodec<dby.a> a = dby.a(dce.b, dby.a::new, dby.a::b);

      @Override
      public void a(arj $$0, int $$1, dbm $$2, btr $$3, eyw $$4) {
         for (dce $$5 : this.d) {
            $$5.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public MapCodec<dby.a> a() {
         return a;
      }

      public List<dce> b() {
         return this.d;
      }
   }

   public static record b(List<dcf> b) implements dcf {
      public static final MapCodec<dby.b> a = dby.a(dcf.c, dby.b::new, dby.b::b);

      @Override
      public void a(arj $$0, int $$1, dbm $$2, btr $$3, eyw $$4, boolean $$5) {
         for (dcf $$6 : this.b) {
            $$6.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }

      @Override
      public void a(dbm $$0, btr $$1, eyw $$2, int $$3) {
         for (dcf $$4 : this.b) {
            $$4.a($$0, $$1, $$2, $$3);
         }
      }

      @Override
      public MapCodec<dby.b> a() {
         return a;
      }
   }

   public static record c(List<dcg> c) implements dcg {
      public static final MapCodec<dby.c> a = dby.a(dcg.b, dby.c::new, dby.c::b);

      @Override
      public float a(int $$0, azn $$1, float $$2) {
         for (dcg $$3 : this.c) {
            $$2 = $$3.a($$0, $$1, $$2);
         }

         return $$2;
      }

      @Override
      public MapCodec<dby.c> a() {
         return a;
      }

      public List<dcg> b() {
         return this.c;
      }
   }
}
