import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import org.slf4j.Logger;

public interface epv {
   static MapCodec<epv> a(int $$0) {
      return axh.a(epv.e.e.dispatchMap("mode", epv::a, $$0x -> $$0x.g.codec()), (Function<epv, DataResult<epv>>)($$1 -> {
         if ($$1 instanceof epv.d $$2 && $$2.c().isPresent()) {
            int $$3 = $$2.c().get();
            if ($$3 > $$0) {
               return DataResult.error(() -> "Size value too large: " + $$3 + ", max size is " + $$0);
            }
         }

         return DataResult.success($$1);
      }));
   }

   epv.e a();

   <T> List<T> a(List<T> var1, List<T> var2, int var3);

   public static class a implements epv {
      private static final Logger c = LogUtils.getLogger();
      public static final epv.a a = new epv.a();
      public static final MapCodec<epv.a> b = MapCodec.unit(() -> a);

      private a() {
      }

      @Override
      public epv.e a() {
         return epv.e.d;
      }

      @Override
      public <T> List<T> a(List<T> $$0, List<T> $$1, int $$2) {
         if ($$0.size() + $$1.size() > $$2) {
            c.error("Contents overflow in section append");
            return $$0;
         } else {
            return Stream.concat($$0.stream(), $$1.stream()).toList();
         }
      }
   }

   public static record b(int b) implements epv {
      private static final Logger c = LogUtils.getLogger();
      public static final MapCodec<epv.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(axh.a(axh.i, "offset", Integer.valueOf(0)).forGetter(epv.b::b)).apply($$0, epv.b::new)
      );

      @Override
      public epv.e a() {
         return epv.e.c;
      }

      @Override
      public <T> List<T> a(List<T> $$0, List<T> $$1, int $$2) {
         int $$3 = $$0.size();
         if (this.b > $$3) {
            c.error("Cannot insert when offset is out of bounds");
            return $$0;
         } else if ($$3 + $$1.size() > $$2) {
            c.error("Contents overflow in section insertion");
            return $$0;
         } else {
            Builder<T> $$4 = ImmutableList.builder();
            $$4.addAll($$0.subList(0, this.b));
            $$4.addAll($$1);
            $$4.addAll($$0.subList(this.b, $$3));
            return $$4.build();
         }
      }
   }

   public static class c implements epv {
      public static final epv.c a = new epv.c();
      public static final MapCodec<epv.c> b = MapCodec.unit(() -> a);

      private c() {
      }

      @Override
      public epv.e a() {
         return epv.e.a;
      }

      @Override
      public <T> List<T> a(List<T> $$0, List<T> $$1, int $$2) {
         return $$1;
      }
   }

   public static record d(int b, Optional<Integer> c) implements epv {
      private static final Logger d = LogUtils.getLogger();
      public static final MapCodec<epv.d> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(axh.a(axh.i, "offset", Integer.valueOf(0)).forGetter(epv.d::b), axh.a(axh.i, "size").forGetter(epv.d::c)).apply($$0, epv.d::new)
      );

      public d(int $$0) {
         this($$0, Optional.empty());
      }

      @Override
      public epv.e a() {
         return epv.e.b;
      }

      @Override
      public <T> List<T> a(List<T> $$0, List<T> $$1, int $$2) {
         int $$3 = $$0.size();
         if (this.b > $$3) {
            d.error("Cannot replace when offset is out of bounds");
            return $$0;
         } else {
            Builder<T> $$4 = ImmutableList.builder();
            $$4.addAll($$0.subList(0, this.b));
            $$4.addAll($$1);
            int $$5 = this.b + this.c.orElse($$1.size());
            if ($$5 < $$3) {
               $$4.addAll($$0.subList($$5, $$3));
            }

            List<T> $$6 = $$4.build();
            if ($$6.size() > $$2) {
               d.error("Contents overflow in section replacement");
               return $$0;
            } else {
               return $$6;
            }
         }
      }
   }

   public static enum e implements ayt {
      a("replace_all", epv.c.b),
      b("replace_section", epv.d.a),
      c("insert", epv.b.a),
      d("append", epv.a.b);

      public static final Codec<epv.e> e = ayt.a(epv.e::values);
      private final String f;
      final MapCodec<? extends epv> g;

      private e(String $$0, MapCodec<? extends epv> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public MapCodec<? extends epv> a() {
         return this.g;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
