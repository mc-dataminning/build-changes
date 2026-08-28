import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public interface err {
   MapCodec<err> a = a(Integer.MAX_VALUE);

   static MapCodec<err> a(int $$0) {
      return err.f.e.dispatchMap("mode", err::a, $$0x -> $$0x.g).validate($$1 -> {
         if ($$1 instanceof err.d $$2 && $$2.c().isPresent()) {
            int $$3 = $$2.c().get();
            if ($$3 > $$0) {
               return DataResult.error(() -> "Size value too large: " + $$3 + ", max size is " + $$0);
            }
         }

         return DataResult.success($$1);
      });
   }

   err.f a();

   default <T> List<T> a(List<T> $$0, List<T> $$1) {
      return this.a($$0, $$1, Integer.MAX_VALUE);
   }

   <T> List<T> a(List<T> var1, List<T> var2, int var3);

   public static class a implements err {
      private static final Logger d = LogUtils.getLogger();
      public static final err.a b = new err.a();
      public static final MapCodec<err.a> c = MapCodec.unit(() -> b);

      private a() {
      }

      @Override
      public err.f a() {
         return err.f.d;
      }

      @Override
      public <T> List<T> a(List<T> $$0, List<T> $$1, int $$2) {
         if ($$0.size() + $$1.size() > $$2) {
            d.error("Contents overflow in section append");
            return $$0;
         } else {
            return Stream.concat($$0.stream(), $$1.stream()).toList();
         }
      }
   }

   public static record b(int c) implements err {
      private static final Logger d = LogUtils.getLogger();
      public static final MapCodec<err.b> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ayf.k.optionalFieldOf("offset", 0).forGetter(err.b::b)).apply($$0, err.b::new)
      );

      @Override
      public err.f a() {
         return err.f.c;
      }

      @Override
      public <T> List<T> a(List<T> $$0, List<T> $$1, int $$2) {
         int $$3 = $$0.size();
         if (this.c > $$3) {
            d.error("Cannot insert when offset is out of bounds");
            return $$0;
         } else if ($$3 + $$1.size() > $$2) {
            d.error("Contents overflow in section insertion");
            return $$0;
         } else {
            Builder<T> $$4 = ImmutableList.builder();
            $$4.addAll($$0.subList(0, this.c));
            $$4.addAll($$1);
            $$4.addAll($$0.subList(this.c, $$3));
            return $$4.build();
         }
      }

      public int b() {
         return this.c;
      }
   }

   public static class c implements err {
      public static final err.c b = new err.c();
      public static final MapCodec<err.c> c = MapCodec.unit(() -> b);

      private c() {
      }

      @Override
      public err.f a() {
         return err.f.a;
      }

      @Override
      public <T> List<T> a(List<T> $$0, List<T> $$1, int $$2) {
         return $$1;
      }
   }

   public static record d(int c, Optional<Integer> d) implements err {
      private static final Logger e = LogUtils.getLogger();
      public static final MapCodec<err.d> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ayf.k.optionalFieldOf("offset", 0).forGetter(err.d::b), ayf.k.optionalFieldOf("size").forGetter(err.d::c)).apply($$0, err.d::new)
      );

      public d(int $$0) {
         this($$0, Optional.empty());
      }

      @Override
      public err.f a() {
         return err.f.b;
      }

      @Override
      public <T> List<T> a(List<T> $$0, List<T> $$1, int $$2) {
         int $$3 = $$0.size();
         if (this.c > $$3) {
            e.error("Cannot replace when offset is out of bounds");
            return $$0;
         } else {
            Builder<T> $$4 = ImmutableList.builder();
            $$4.addAll($$0.subList(0, this.c));
            $$4.addAll($$1);
            int $$5 = this.c + this.d.orElse($$1.size());
            if ($$5 < $$3) {
               $$4.addAll($$0.subList($$5, $$3));
            }

            List<T> $$6 = $$4.build();
            if ($$6.size() > $$2) {
               e.error("Contents overflow in section replacement");
               return $$0;
            } else {
               return $$6;
            }
         }
      }

      public int b() {
         return this.c;
      }

      public Optional<Integer> c() {
         return this.d;
      }
   }

   public static record e<T>(List<T> a, err b) {
      public static <T> Codec<err.e<T>> a(Codec<T> $$0, int $$1) {
         return RecordCodecBuilder.create(
            $$2 -> $$2.group($$0.sizeLimitedListOf($$1).fieldOf("values").forGetter($$0xx -> $$0xx.a), err.a($$1).forGetter($$0xx -> $$0xx.b))
                  .apply($$2, err.e::new)
         );
      }

      public List<T> a(List<T> $$0) {
         return this.b.a($$0, this.a);
      }
   }

   public static enum f implements azs {
      a("replace_all", err.c.c),
      b("replace_section", err.d.b),
      c("insert", err.b.b),
      d("append", err.a.c);

      public static final Codec<err.f> e = azs.a(err.f::values);
      private final String f;
      final MapCodec<? extends err> g;

      private f(final String $$0, final MapCodec<? extends err> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public MapCodec<? extends err> a() {
         return this.g;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
