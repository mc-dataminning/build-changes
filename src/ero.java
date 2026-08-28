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

public interface ero {
   MapCodec<ero> a = a(Integer.MAX_VALUE);

   static MapCodec<ero> a(int $$0) {
      return ero.e.e.dispatchMap("mode", ero::a, $$0x -> $$0x.g).validate($$1 -> {
         if ($$1 instanceof ero.d $$2 && $$2.c().isPresent()) {
            int $$3 = $$2.c().get();
            if ($$3 > $$0) {
               return DataResult.error(() -> "Size value too large: " + $$3 + ", max size is " + $$0);
            }
         }

         return DataResult.success($$1);
      });
   }

   ero.e a();

   default <T> List<T> a(List<T> $$0, List<T> $$1) {
      return this.a($$0, $$1, Integer.MAX_VALUE);
   }

   <T> List<T> a(List<T> var1, List<T> var2, int var3);

   public static class a implements ero {
      private static final Logger d = LogUtils.getLogger();
      public static final ero.a b = new ero.a();
      public static final MapCodec<ero.a> c = MapCodec.unit(() -> b);

      private a() {
      }

      @Override
      public ero.e a() {
         return ero.e.d;
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

   public static record b(int c) implements ero {
      private static final Logger d = LogUtils.getLogger();
      public static final MapCodec<ero.b> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ayc.k.optionalFieldOf("offset", 0).forGetter(ero.b::b)).apply($$0, ero.b::new)
      );

      @Override
      public ero.e a() {
         return ero.e.c;
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

   public static class c implements ero {
      public static final ero.c b = new ero.c();
      public static final MapCodec<ero.c> c = MapCodec.unit(() -> b);

      private c() {
      }

      @Override
      public ero.e a() {
         return ero.e.a;
      }

      @Override
      public <T> List<T> a(List<T> $$0, List<T> $$1, int $$2) {
         return $$1;
      }
   }

   public static record d(int c, Optional<Integer> d) implements ero {
      private static final Logger e = LogUtils.getLogger();
      public static final MapCodec<ero.d> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ayc.k.optionalFieldOf("offset", 0).forGetter(ero.d::b), ayc.k.optionalFieldOf("size").forGetter(ero.d::c)).apply($$0, ero.d::new)
      );

      public d(int $$0) {
         this($$0, Optional.empty());
      }

      @Override
      public ero.e a() {
         return ero.e.b;
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

   public static enum e implements azp {
      a("replace_all", ero.c.c),
      b("replace_section", ero.d.b),
      c("insert", ero.b.b),
      d("append", ero.a.c);

      public static final Codec<ero.e> e = azp.a(ero.e::values);
      private final String f;
      final MapCodec<? extends ero> g;

      private e(final String $$0, final MapCodec<? extends ero> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public MapCodec<? extends ero> a() {
         return this.g;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
