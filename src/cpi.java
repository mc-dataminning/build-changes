import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
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

public final class cpi implements Predicate<cmh> {
   public static final cpi a = new cpi(Stream.empty());
   private final cpi.c[] d;
   @Nullable
   private cmh[] e;
   @Nullable
   private IntList f;
   public static final Codec<cpi> b = a(true);
   public static final Codec<cpi> c = a(false);

   private cpi(Stream<? extends cpi.c> $$0) {
      this.d = $$0.toArray(cpi.c[]::new);
   }

   private cpi(cpi.c[] $$0) {
      this.d = $$0;
   }

   public cmh[] a() {
      if (this.e == null) {
         this.e = Arrays.stream(this.d).flatMap($$0 -> $$0.a().stream()).distinct().toArray(cmh[]::new);
      }

      return this.e;
   }

   public boolean a(@Nullable cmh $$0) {
      if ($$0 == null) {
         return false;
      } else if (this.c()) {
         return $$0.b();
      } else {
         for (cmh $$1 : this.a()) {
            if ($$1.a($$0.d())) {
               return true;
            }
         }

         return false;
      }
   }

   public IntList b() {
      if (this.f == null) {
         cmh[] $$0 = this.a();
         this.f = new IntArrayList($$0.length);

         for (cmh $$1 : $$0) {
            this.f.add(cev.c($$1));
         }

         this.f.sort(IntComparators.NATURAL_COMPARATOR);
      }

      return this.f;
   }

   public void a(ue $$0) {
      $$0.a(Arrays.asList(this.a()), ue::a);
   }

   public boolean c() {
      return this.d.length == 0;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof cpi $$1 ? Arrays.equals((Object[])this.d, (Object[])$$1.d) : false;
   }

   private static cpi b(Stream<? extends cpi.c> $$0) {
      cpi $$1 = new cpi($$0);
      return $$1.c() ? a : $$1;
   }

   public static cpi d() {
      return a;
   }

   public static cpi a(csx... $$0) {
      return a(Arrays.stream($$0).map(cmh::new));
   }

   public static cpi a(cmh... $$0) {
      return a(Arrays.stream($$0));
   }

   public static cpi a(Stream<cmh> $$0) {
      return b($$0.filter($$0x -> !$$0x.b()).map(cpi.a::new));
   }

   public static cpi a(asg<cmc> $$0) {
      return b(Stream.of(new cpi.b($$0)));
   }

   public static cpi b(ue $$0) {
      return b($$0.<cmh>a(ue::r).stream().map(cpi.a::new));
   }

   private static Codec<cpi> a(boolean $$0) {
      Codec<cpi.c[]> $$1 = Codec.list(cpi.c.a)
         .comapFlatMap(
            $$1x -> !$$0 && $$1x.size() < 1
                  ? DataResult.error(() -> "Item array cannot be empty, at least one item must be defined")
                  : DataResult.success($$1x.toArray(new cpi.c[0])),
            List::of
         );
      return atg.c($$1, cpi.c.a)
         .flatComapMap(
            $$0x -> (cpi)$$0x.map(cpi::new, $$0xx -> new cpi(new cpi.c[]{$$0xx})),
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

   static record a(cmh b) implements cpi.c {
      static final Codec<cpi.a> c = RecordCodecBuilder.create($$0 -> $$0.group(cmh.d.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, cpi.a::new));

      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof cpi.a $$1) ? false : $$1.b.d().equals(this.b.d()) && $$1.b.L() == this.b.L();
      }

      @Override
      public Collection<cmh> a() {
         return Collections.singleton(this.b);
      }
   }

   static record b(asg<cmc> b) implements cpi.c {
      static final Codec<cpi.b> c = RecordCodecBuilder.create($$0 -> $$0.group(asg.a(kc.F).fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, cpi.b::new));

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof cpi.b $$1 ? $$1.b.b().equals(this.b.b()) : false;
      }

      @Override
      public Collection<cmh> a() {
         List<cmh> $$0 = Lists.newArrayList();

         for (ie<cmc> $$1 : kb.h.c(this.b)) {
            $$0.add(new cmh($$1));
         }

         return $$0;
      }
   }

   interface c {
      Codec<cpi.c> a = atg.a(cpi.a.c, cpi.b.c).xmap($$0 -> (cpi.c)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof cpi.b $$1) {
            return Either.right($$1);
         } else if ($$0 instanceof cpi.a $$2) {
            return Either.left($$2);
         } else {
            throw new UnsupportedOperationException("This is neither an item value nor a tag value.");
         }
      });

      Collection<cmh> a();
   }
}
