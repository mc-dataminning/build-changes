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

public class epi extends epw {
   private static final Map<akh, epi.c> b = Stream.of(epi.a.a, epi.d.b, epi.e.b).collect(Collectors.toMap(epi.c::a, Function.identity()));
   private static final Codec<epi.c> c = akh.a.comapFlatMap($$0 -> {
      epi.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, epi.c::a);
   private static final MapCodec<epi.b> d = axh.a("formula", "parameters", c, epi.b::a, epi.c::b);
   public static final Codec<epi> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(ld.f.r().fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, epi::new)
   );
   private final iw<cyg> e;
   private final epi.b f;

   private epi(List<erq> $$0, iw<cyg> $$1, epi.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public epy b() {
      return epz.u;
   }

   @Override
   public Set<eqz<?>> a() {
      return ImmutableSet.of(erc.i);
   }

   @Override
   public csz a(csz $$0, eol $$1) {
      csz $$2 = $$1.c(erc.i);
      if ($$2 != null) {
         int $$3 = cyh.a(this.e.a(), $$2);
         int $$4 = this.f.a($$1.b(), $$0.G(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static epw.a<?> a(cyg $$0, float $$1, int $$2) {
      return a($$3 -> new epi($$3, $$0.l(), new epi.a($$2, $$1)));
   }

   public static epw.a<?> a(cyg $$0) {
      return a($$1 -> new epi($$1, $$0.l(), new epi.d()));
   }

   public static epw.a<?> b(cyg $$0) {
      return a($$1 -> new epi($$1, $$0.l(), new epi.e(1)));
   }

   public static epw.a<?> a(cyg $$0, int $$1) {
      return a($$2 -> new epi($$2, $$0.l(), new epi.e($$1)));
   }

   static record a(int b, float c) implements epi.b {
      private static final Codec<epi.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(epi.a::b), Codec.FLOAT.fieldOf("probability").forGetter(epi.a::c)).apply($$0, epi.a::new)
      );
      public static final epi.c a = new epi.c(new akh("binomial_with_bonus_count"), d);

      @Override
      public int a(ayg $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public epi.c a() {
         return a;
      }
   }

   interface b {
      int a(ayg var1, int var2, int var3);

      epi.c a();
   }

   static record c(akh a, Codec<? extends epi.b> b) {
   }

   static record d() implements epi.b {
      public static final Codec<epi.d> a = Codec.unit(epi.d::new);
      public static final epi.c b = new epi.c(new akh("ore_drops"), a);

      @Override
      public int a(ayg $$0, int $$1, int $$2) {
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
      public epi.c a() {
         return b;
      }
   }

   static record e(int c) implements epi.b {
      public static final Codec<epi.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(epi.e::b)).apply($$0, epi.e::new)
      );
      public static final epi.c b = new epi.c(new akh("uniform_bonus_count"), a);

      @Override
      public int a(ayg $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public epi.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
