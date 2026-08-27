import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

interface epn {
   epn.e a();

   <T> List<T> a(List<T> var1, List<T> var2, int var3);

   public static class a implements epn {
      private static final Logger c = LogUtils.getLogger();
      public static final epn.a a = new epn.a();
      public static final MapCodec<epn.a> b = MapCodec.unit(() -> a);

      private a() {
      }

      @Override
      public epn.e a() {
         return epn.e.d;
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

   public static record b(int b) implements epn {
      private static final Logger c = LogUtils.getLogger();
      public static final MapCodec<epn.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(axe.a(axe.i, "offset", Integer.valueOf(0)).forGetter(epn.b::b)).apply($$0, epn.b::new)
      );

      @Override
      public epn.e a() {
         return epn.e.c;
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

   public static class c implements epn {
      public static final epn.c a = new epn.c();
      public static final MapCodec<epn.c> b = MapCodec.unit(() -> a);

      private c() {
      }

      @Override
      public epn.e a() {
         return epn.e.a;
      }

      @Override
      public <T> List<T> a(List<T> $$0, List<T> $$1, int $$2) {
         return $$1;
      }
   }

   public static record d(int b, Optional<Integer> c) implements epn {
      private static final Logger d = LogUtils.getLogger();
      public static final MapCodec<epn.d> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(axe.a(axe.i, "offset", Integer.valueOf(0)).forGetter(epn.d::b), axe.a(axe.i, "size").forGetter(epn.d::c)).apply($$0, epn.d::new)
      );

      public d(int $$0) {
         this($$0, Optional.empty());
      }

      @Override
      public epn.e a() {
         return epn.e.b;
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

   public static enum e implements ayq {
      a("replace_all", epn.c.b),
      b("replace_section", epn.d.a),
      c("insert", epn.b.a),
      d("append", epn.a.b);

      public static final Codec<epn.e> e = ayq.a(epn.e::values);
      public static final MapCodec<epn> f = e.dispatchMap("mode", epn::a, $$0 -> $$0.h.codec());
      private final String g;
      private final MapCodec<? extends epn> h;

      private e(String $$0, MapCodec<? extends epn> $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public MapCodec<? extends epn> a() {
         return this.h;
      }

      @Override
      public String c() {
         return this.g;
      }
   }
}
