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

public class ert extends esj {
   private static final Map<akk, ert.c> b = Stream.of(ert.a.a, ert.d.b, ert.e.b).collect(Collectors.toMap(ert.c::a, Function.identity()));
   private static final Codec<ert.c> c = akk.a.comapFlatMap($$0 -> {
      ert.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, ert.c::a);
   private static final MapCodec<ert.b> d = axo.a("formula", "parameters", c, ert.b::a, ert.c::b);
   public static final MapCodec<ert> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(czm.c.fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, ert::new)
   );
   private final jj<czm> e;
   private final ert.b f;

   private ert(List<euh> $$0, jj<czm> $$1, ert.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public esl<ert> b() {
      return esm.x;
   }

   @Override
   public Set<etp<?>> a() {
      return ImmutableSet.of(ets.i);
   }

   @Override
   public cud a(cud $$0, eqw $$1) {
      cud $$2 = $$1.c(ets.i);
      if ($$2 != null) {
         int $$3 = czo.a(this.e, $$2);
         int $$4 = this.f.a($$1.b(), $$0.H(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static esj.a<?> a(jj<czm> $$0, float $$1, int $$2) {
      return a($$3 -> new ert($$3, $$0, new ert.a($$2, $$1)));
   }

   public static esj.a<?> a(jj<czm> $$0) {
      return a($$1 -> new ert($$1, $$0, new ert.d()));
   }

   public static esj.a<?> b(jj<czm> $$0) {
      return a($$1 -> new ert($$1, $$0, new ert.e(1)));
   }

   public static esj.a<?> a(jj<czm> $$0, int $$1) {
      return a($$2 -> new ert($$2, $$0, new ert.e($$1)));
   }

   static record a(int b, float c) implements ert.b {
      private static final Codec<ert.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(ert.a::b), Codec.FLOAT.fieldOf("probability").forGetter(ert.a::c)).apply($$0, ert.a::new)
      );
      public static final ert.c a = new ert.c(new akk("binomial_with_bonus_count"), d);

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
      public ert.c a() {
         return a;
      }
   }

   interface b {
      int a(ayo var1, int var2, int var3);

      ert.c a();
   }

   static record c(akk a, Codec<? extends ert.b> b) {
   }

   static record d() implements ert.b {
      public static final Codec<ert.d> a = Codec.unit(ert.d::new);
      public static final ert.c b = new ert.c(new akk("ore_drops"), a);

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
      public ert.c a() {
         return b;
      }
   }

   static record e(int c) implements ert.b {
      public static final Codec<ert.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(ert.e::b)).apply($$0, ert.e::new)
      );
      public static final ert.c b = new ert.c(new akk("uniform_bonus_count"), a);

      @Override
      public int a(ayo $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public ert.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
