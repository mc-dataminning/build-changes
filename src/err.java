import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class err extends esh {
   private static final Map<akk, err.c> b = Stream.of(err.a.a, err.d.b, err.e.b).collect(Collectors.toMap(err.c::a, Function.identity()));
   private static final Codec<err.c> c = akk.a.comapFlatMap($$0 -> {
      err.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, err.c::a);
   private static final MapCodec<err.b> d = axo.a("formula", "parameters", c, err.b::a, err.c::b);
   public static final MapCodec<err> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(czl.b.fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, err::new)
   );
   private final jj<czl> e;
   private final err.b f;

   private err(List<euf> $$0, jj<czl> $$1, err.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public esj<err> b() {
      return esk.x;
   }

   @Override
   public Set<etn<?>> a() {
      return ImmutableSet.of(etq.i);
   }

   @Override
   public cuc a(cuc $$0, equ $$1) {
      cuc $$2 = $$1.c(etq.i);
      if ($$2 != null) {
         int $$3 = czn.a(this.e, $$2);
         int $$4 = this.f.a($$1.b(), $$0.H(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static esh.a<?> a(jj<czl> $$0, float $$1, int $$2) {
      return a($$3 -> new err($$3, $$0, new err.a($$2, $$1)));
   }

   public static esh.a<?> a(jj<czl> $$0) {
      return a($$1 -> new err($$1, $$0, new err.d()));
   }

   public static esh.a<?> b(jj<czl> $$0) {
      return a($$1 -> new err($$1, $$0, new err.e(1)));
   }

   public static esh.a<?> a(jj<czl> $$0, int $$1) {
      return a($$2 -> new err($$2, $$0, new err.e($$1)));
   }

   static record a(int b, float c) implements err.b {
      private static final Codec<err.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(err.a::b), Codec.FLOAT.fieldOf("probability").forGetter(err.a::c)).apply($$0, err.a::new)
      );
      public static final err.c a = new err.c(new akk("binomial_with_bonus_count"), d);

      @Override
      public int a(ayo $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public err.c a() {
         return a;
      }
   }

   interface b {
      int a(ayo var1, int var2, int var3);

      err.c a();
   }

   static record c(akk a, Codec<? extends err.b> b) {
   }

   static record d() implements err.b {
      public static final Codec<err.d> a = Codec.unit(err.d::new);
      public static final err.c b = new err.c(new akk("ore_drops"), a);

      @Override
      public int a(ayo $$0, int $$1, int $$2) {
         if ($$2 > 0) {
            int $$3 = $$0.a($$2 + 2) - 1;
            if ($$3 < 0) {
               $$3 = 0;
            }

            return $$1 * ($$3 + 1);
         } else {
            return $$1;
         }
      }

      @Override
      public err.c a() {
         return b;
      }
   }

   static record e(int c) implements err.b {
      public static final Codec<err.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(err.e::b)).apply($$0, err.e::new)
      );
      public static final err.c b = new err.c(new akk("uniform_bonus_count"), a);

      @Override
      public int a(ayo $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public err.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
