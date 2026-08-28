import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

public interface dfq {
   static <T, A extends T> MapCodec<A> a(Codec<T> $$0, Function<List<T>, A> $$1, Function<A, List<T>> $$2) {
      return RecordCodecBuilder.mapCodec($$3 -> $$3.group($$0.listOf().fieldOf("effects").forGetter($$2)).apply($$3, $$1));
   }

   static dfq.a a(dfw... $$0) {
      return new dfq.a(List.of($$0));
   }

   static dfq.b a(dfx... $$0) {
      return new dfq.b(List.of($$0));
   }

   static dfq.c a(dfy... $$0) {
      return new dfq.c(List.of($$0));
   }

   public static record a(List<dfw> d) implements dfw {
      public static final MapCodec<dfq.a> a = dfq.a(dfw.b, dfq.a::new, dfq.a::b);

      @Override
      public void a(aro $$0, int $$1, dfe $$2, bwa $$3, fdw $$4) {
         for (dfw $$5 : this.d) {
            $$5.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public MapCodec<dfq.a> a() {
         return a;
      }

      public List<dfw> b() {
         return this.d;
      }
   }

   public static record b(List<dfx> b) implements dfx {
      public static final MapCodec<dfq.b> a = dfq.a(dfx.c, dfq.b::new, dfq.b::b);

      @Override
      public void a(aro $$0, int $$1, dfe $$2, bwa $$3, fdw $$4, boolean $$5) {
         for (dfx $$6 : this.b) {
            $$6.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }

      @Override
      public void a(dfe $$0, bwa $$1, fdw $$2, int $$3) {
         for (dfx $$4 : this.b) {
            $$4.a($$0, $$1, $$2, $$3);
         }
      }

      @Override
      public MapCodec<dfq.b> a() {
         return a;
      }
   }

   public static record c(List<dfy> c) implements dfy {
      public static final MapCodec<dfq.c> a = dfq.a(dfy.b, dfq.c::new, dfq.c::b);

      @Override
      public float a(int $$0, azt $$1, float $$2) {
         for (dfy $$3 : this.c) {
            $$2 = $$3.a($$0, $$1, $$2);
         }

         return $$2;
      }

      @Override
      public MapCodec<dfq.c> a() {
         return a;
      }

      public List<dfy> b() {
         return this.c;
      }
   }
}
