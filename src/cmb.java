import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntComparators;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class cmb implements Predicate<cja> {
   public static final cmb a = new cmb(Stream.empty());
   private final cmb.c[] d;
   @Nullable
   private cja[] e;
   @Nullable
   private IntList f;
   public static final Codec<cmb> b = b(true);
   public static final Codec<cmb> c = b(false);

   private cmb(Stream<? extends cmb.c> $$0) {
      this.d = $$0.toArray(cmb.c[]::new);
   }

   private cmb(cmb.c[] $$0) {
      this.d = $$0;
   }

   public cja[] a() {
      if (this.e == null) {
         this.e = Arrays.stream(this.d).flatMap($$0 -> $$0.a().stream()).distinct().toArray(cja[]::new);
      }

      return this.e;
   }

   public boolean a(@Nullable cja $$0) {
      if ($$0 == null) {
         return false;
      } else if (this.c()) {
         return $$0.b();
      } else {
         for (cja $$1 : this.a()) {
            if ($$1.a($$0.d())) {
               return true;
            }
         }

         return false;
      }
   }

   public IntList b() {
      if (this.f == null) {
         cja[] $$0 = this.a();
         this.f = new IntArrayList($$0.length);

         for (cja $$1 : $$0) {
            this.f.add(cbt.c($$1));
         }

         this.f.sort(IntComparators.NATURAL_COMPARATOR);
      }

      return this.f;
   }

   public void a(sl $$0) {
      $$0.a(Arrays.asList(this.a()), sl::a);
   }

   public JsonElement a(boolean $$0) {
      Codec<cmb> $$1 = $$0 ? b : c;
      return ac.a($$1.encodeStart(JsonOps.INSTANCE, this), IllegalStateException::new);
   }

   public boolean c() {
      return this.d.length == 0;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof cmb $$1 ? Arrays.equals((Object[])this.d, (Object[])$$1.d) : false;
   }

   private static cmb b(Stream<? extends cmb.c> $$0) {
      cmb $$1 = new cmb($$0);
      return $$1.c() ? a : $$1;
   }

   public static cmb d() {
      return a;
   }

   public static cmb a(cpp... $$0) {
      return a(Arrays.stream($$0).map(cja::new));
   }

   public static cmb a(cja... $$0) {
      return a(Arrays.stream($$0));
   }

   public static cmb a(Stream<cja> $$0) {
      return b($$0.filter($$0x -> !$$0x.b()).map(cmb.a::new));
   }

   public static cmb a(aqd<civ> $$0) {
      return b(Stream.of(new cmb.b($$0)));
   }

   public static cmb b(sl $$0) {
      return b($$0.<cja>a(sl::q).stream().map(cmb.a::new));
   }

   private static Codec<cmb> b(boolean $$0) {
      Codec<cmb.c[]> $$1 = Codec.list(cmb.c.a)
         .comapFlatMap(
            $$1x -> !$$0 && $$1x.size() < 1
                  ? DataResult.error(() -> "Item array cannot be empty, at least one item must be defined")
                  : DataResult.success($$1x.toArray(new cmb.c[0])),
            List::of
         );
      return arb.c($$1, cmb.c.a)
         .flatComapMap(
            $$0x -> (cmb)$$0x.map(cmb::new, $$0xx -> new cmb(new cmb.c[]{$$0xx})),
            $$1x -> {
               if ($$1x.d.length == 1) {
                  return DataResult.success(Either.right($$1x.d[0]));
               } else {
                  return $$1x.d.length == 0 && !$$0
                     ? DataResult.error(() -> "Item array cannot be empty, at least one item must be defined")
                     : DataResult.success(Either.left($$1x.d));
               }
            }
         );
   }

   static record a(cja b) implements cmb.c {
      static final Codec<cmb.a> c = RecordCodecBuilder.create($$0 -> $$0.group(clv.b.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, cmb.a::new));

      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof cmb.a $$1) ? false : $$1.b.d().equals(this.b.d()) && $$1.b.L() == this.b.L();
      }

      @Override
      public Collection<cja> a() {
         return Collections.singleton(this.b);
      }
   }

   static record b(aqd<civ> b) implements cmb.c {
      static final Codec<cmb.b> c = RecordCodecBuilder.create($$0 -> $$0.group(aqd.a(je.D).fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, cmb.b::new));

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof cmb.b $$1 ? $$1.b.b().equals(this.b.b()) : false;
      }

      @Override
      public Collection<cja> a() {
         List<cja> $$0 = Lists.newArrayList();

         for (hg<civ> $$1 : jd.i.c(this.b)) {
            $$0.add(new cja($$1));
         }

         return $$0;
      }
   }

   interface c {
      Codec<cmb.c> a = arb.a(cmb.a.c, cmb.b.c).xmap($$0 -> (cmb.c)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof cmb.b $$1) {
            return Either.right($$1);
         } else if ($$0 instanceof cmb.a $$2) {
            return Either.left($$2);
         } else {
            throw new UnsupportedOperationException("This is neither an item value nor a tag value.");
         }
      });

      Collection<cja> a();
   }
}
