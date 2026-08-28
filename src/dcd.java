import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

public interface dcd {
   static <T, A extends T> MapCodec<A> a(Codec<T> $$0, Function<List<T>, A> $$1, Function<A, List<T>> $$2) {
      return RecordCodecBuilder.mapCodec($$3 -> $$3.group($$0.listOf().fieldOf("effects").forGetter($$2)).apply($$3, $$1));
   }

   static dcd.a a(dcj... $$0) {
      return new dcd.a(List.of($$0));
   }

   static dcd.b a(dck... $$0) {
      return new dcd.b(List.of($$0));
   }

   static dcd.c a(dcl... $$0) {
      return new dcd.c(List.of($$0));
   }

   public static record a(List<dcj> d) implements dcj {
      public static final MapCodec<dcd.a> a = dcd.a(dcj.b, dcd.a::new, dcd.a::b);

      @Override
      public void a(arn $$0, int $$1, dbr $$2, bue $$3, ezn $$4) {
         for (dcj $$5 : this.d) {
            $$5.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public MapCodec<dcd.a> a() {
         return a;
      }

      public List<dcj> b() {
         return this.d;
      }
   }

   public static record b(List<dck> b) implements dck {
      public static final MapCodec<dcd.b> a = dcd.a(dck.c, dcd.b::new, dcd.b::b);

      @Override
      public void a(arn $$0, int $$1, dbr $$2, bue $$3, ezn $$4, boolean $$5) {
         for (dck $$6 : this.b) {
            $$6.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }

      @Override
      public void a(dbr $$0, bue $$1, ezn $$2, int $$3) {
         for (dck $$4 : this.b) {
            $$4.a($$0, $$1, $$2, $$3);
         }
      }

      @Override
      public MapCodec<dcd.b> a() {
         return a;
      }
   }

   public static record c(List<dcl> c) implements dcl {
      public static final MapCodec<dcd.c> a = dcd.a(dcl.b, dcd.c::new, dcd.c::b);

      @Override
      public float a(int $$0, azs $$1, float $$2) {
         for (dcl $$3 : this.c) {
            $$2 = $$3.a($$0, $$1, $$2);
         }

         return $$2;
      }

      @Override
      public MapCodec<dcd.c> a() {
         return a;
      }

      public List<dcl> b() {
         return this.c;
      }
   }
}
