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

public final class cmi implements Predicate<cjh> {
   public static final cmi a = new cmi(Stream.empty());
   private final cmi.c[] d;
   @Nullable
   private cjh[] e;
   @Nullable
   private IntList f;
   public static final Codec<cmi> b = b(true);
   public static final Codec<cmi> c = b(false);

   private cmi(Stream<? extends cmi.c> $$0) {
      this.d = $$0.toArray(cmi.c[]::new);
   }

   private cmi(cmi.c[] $$0) {
      this.d = $$0;
   }

   public cjh[] a() {
      if (this.e == null) {
         this.e = Arrays.stream(this.d).flatMap($$0 -> $$0.a().stream()).distinct().toArray(cjh[]::new);
      }

      return this.e;
   }

   public boolean a(@Nullable cjh $$0) {
      if ($$0 == null) {
         return false;
      } else if (this.c()) {
         return $$0.b();
      } else {
         for (cjh $$1 : this.a()) {
            if ($$1.a($$0.d())) {
               return true;
            }
         }

         return false;
      }
   }

   public IntList b() {
      if (this.f == null) {
         cjh[] $$0 = this.a();
         this.f = new IntArrayList($$0.length);

         for (cjh $$1 : $$0) {
            this.f.add(cca.c($$1));
         }

         this.f.sort(IntComparators.NATURAL_COMPARATOR);
      }

      return this.f;
   }

   public void a(sq $$0) {
      $$0.a(Arrays.asList(this.a()), sq::a);
   }

   public JsonElement a(boolean $$0) {
      Codec<cmi> $$1 = $$0 ? b : c;
      return ac.a($$1.encodeStart(JsonOps.INSTANCE, this), IllegalStateException::new);
   }

   public boolean c() {
      return this.d.length == 0;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof cmi $$1 ? Arrays.equals((Object[])this.d, (Object[])$$1.d) : false;
   }

   private static cmi b(Stream<? extends cmi.c> $$0) {
      cmi $$1 = new cmi($$0);
      return $$1.c() ? a : $$1;
   }

   public static cmi d() {
      return a;
   }

   public static cmi a(cpw... $$0) {
      return a(Arrays.stream($$0).map(cjh::new));
   }

   public static cmi a(cjh... $$0) {
      return a(Arrays.stream($$0));
   }

   public static cmi a(Stream<cjh> $$0) {
      return b($$0.filter($$0x -> !$$0x.b()).map(cmi.a::new));
   }

   public static cmi a(aqj<cjc> $$0) {
      return b(Stream.of(new cmi.b($$0)));
   }

   public static cmi b(sq $$0) {
      return b($$0.<cjh>a(sq::q).stream().map(cmi.a::new));
   }

   private static Codec<cmi> b(boolean $$0) {
      Codec<cmi.c[]> $$1 = Codec.list(cmi.c.a)
         .comapFlatMap(
            $$1x -> !$$0 && $$1x.size() < 1
                  ? DataResult.error(() -> "Item array cannot be empty, at least one item must be defined")
                  : DataResult.success($$1x.toArray(new cmi.c[0])),
            List::of
         );
      return arh.c($$1, cmi.c.a)
         .flatComapMap(
            $$0x -> (cmi)$$0x.map(cmi::new, $$0xx -> new cmi(new cmi.c[]{$$0xx})),
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

   static record a(cjh b) implements cmi.c {
      static final Codec<cmi.a> c = RecordCodecBuilder.create($$0 -> $$0.group(cmc.b.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, cmi.a::new));

      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof cmi.a $$1) ? false : $$1.b.d().equals(this.b.d()) && $$1.b.L() == this.b.L();
      }

      @Override
      public Collection<cjh> a() {
         return Collections.singleton(this.b);
      }
   }

   static record b(aqj<cjc> b) implements cmi.c {
      static final Codec<cmi.b> c = RecordCodecBuilder.create($$0 -> $$0.group(aqj.a(je.D).fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, cmi.b::new));

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof cmi.b $$1 ? $$1.b.b().equals(this.b.b()) : false;
      }

      @Override
      public Collection<cjh> a() {
         List<cjh> $$0 = Lists.newArrayList();

         for (hg<cjc> $$1 : jd.i.c(this.b)) {
            $$0.add(new cjh($$1));
         }

         return $$0;
      }
   }

   interface c {
      Codec<cmi.c> a = arh.a(cmi.a.c, cmi.b.c).xmap($$0 -> (cmi.c)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof cmi.b $$1) {
            return Either.right($$1);
         } else if ($$0 instanceof cmi.a $$2) {
            return Either.left($$2);
         } else {
            throw new UnsupportedOperationException("This is neither an item value nor a tag value.");
         }
      });

      Collection<cjh> a();
   }
}
