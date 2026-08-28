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

public class eue extends euu {
   private static final Map<alc, eue.c> b = Stream.of(eue.a.a, eue.d.b, eue.e.b).collect(Collectors.toMap(eue.c::a, Function.identity()));
   private static final Codec<eue.c> c = alc.a.comapFlatMap($$0 -> {
      eue.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, eue.c::a);
   private static final MapCodec<eue.b> d = aym.a("formula", "parameters", c, eue.b::a, eue.c::b);
   public static final MapCodec<eue> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dbk.c.fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, eue::new)
   );
   private final jn<dbk> e;
   private final eue.b f;

   private eue(List<ews> $$0, jn<dbk> $$1, eue.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public euw<eue> b() {
      return eux.x;
   }

   @Override
   public Set<ewa<?>> a() {
      return ImmutableSet.of(ewd.i);
   }

   @Override
   public cvp a(cvp $$0, eth $$1) {
      cvp $$2 = $$1.c(ewd.i);
      if ($$2 != null) {
         int $$3 = dbm.a(this.e, $$2);
         int $$4 = this.f.a($$1.b(), $$0.J(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static euu.a<?> a(jn<dbk> $$0, float $$1, int $$2) {
      return a($$3 -> new eue($$3, $$0, new eue.a($$2, $$1)));
   }

   public static euu.a<?> a(jn<dbk> $$0) {
      return a($$1 -> new eue($$1, $$0, new eue.d()));
   }

   public static euu.a<?> b(jn<dbk> $$0) {
      return a($$1 -> new eue($$1, $$0, new eue.e(1)));
   }

   public static euu.a<?> a(jn<dbk> $$0, int $$1) {
      return a($$2 -> new eue($$2, $$0, new eue.e($$1)));
   }

   static record a(int b, float c) implements eue.b {
      private static final Codec<eue.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(eue.a::b), Codec.FLOAT.fieldOf("probability").forGetter(eue.a::c)).apply($$0, eue.a::new)
      );
      public static final eue.c a = new eue.c(alc.b("binomial_with_bonus_count"), d);

      @Override
      public int a(azl $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public eue.c a() {
         return a;
      }
   }

   interface b {
      int a(azl var1, int var2, int var3);

      eue.c a();
   }

   static record c(alc a, Codec<? extends eue.b> b) {
   }

   static record d() implements eue.b {
      public static final Codec<eue.d> a = Codec.unit(eue.d::new);
      public static final eue.c b = new eue.c(alc.b("ore_drops"), a);

      @Override
      public int a(azl $$0, int $$1, int $$2) {
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
      public eue.c a() {
         return b;
      }
   }

   static record e(int c) implements eue.b {
      public static final Codec<eue.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(eue.e::b)).apply($$0, eue.e::new)
      );
      public static final eue.c b = new eue.c(alc.b("uniform_bonus_count"), a);

      @Override
      public int a(azl $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public eue.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
