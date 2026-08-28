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

public class erl extends esb {
   private static final Map<akk, erl.c> b = Stream.of(erl.a.a, erl.d.b, erl.e.b).collect(Collectors.toMap(erl.c::a, Function.identity()));
   private static final Codec<erl.c> c = akk.a.comapFlatMap($$0 -> {
      erl.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, erl.c::a);
   private static final MapCodec<erl.b> d = axm.a("formula", "parameters", c, erl.b::a, erl.c::b);
   public static final MapCodec<erl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(czj.b.fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, erl::new)
   );
   private final jj<czj> e;
   private final erl.b f;

   private erl(List<etz> $$0, jj<czj> $$1, erl.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public esd<erl> b() {
      return ese.x;
   }

   @Override
   public Set<eth<?>> a() {
      return ImmutableSet.of(etk.i);
   }

   @Override
   public cua a(cua $$0, eqo $$1) {
      cua $$2 = $$1.c(etk.i);
      if ($$2 != null) {
         int $$3 = czl.a(this.e, $$2);
         int $$4 = this.f.a($$1.b(), $$0.H(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static esb.a<?> a(jj<czj> $$0, float $$1, int $$2) {
      return a($$3 -> new erl($$3, $$0, new erl.a($$2, $$1)));
   }

   public static esb.a<?> a(jj<czj> $$0) {
      return a($$1 -> new erl($$1, $$0, new erl.d()));
   }

   public static esb.a<?> b(jj<czj> $$0) {
      return a($$1 -> new erl($$1, $$0, new erl.e(1)));
   }

   public static esb.a<?> a(jj<czj> $$0, int $$1) {
      return a($$2 -> new erl($$2, $$0, new erl.e($$1)));
   }

   static record a(int b, float c) implements erl.b {
      private static final Codec<erl.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(erl.a::b), Codec.FLOAT.fieldOf("probability").forGetter(erl.a::c)).apply($$0, erl.a::new)
      );
      public static final erl.c a = new erl.c(new akk("binomial_with_bonus_count"), d);

      @Override
      public int a(aym $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public erl.c a() {
         return a;
      }
   }

   interface b {
      int a(aym var1, int var2, int var3);

      erl.c a();
   }

   static record c(akk a, Codec<? extends erl.b> b) {
   }

   static record d() implements erl.b {
      public static final Codec<erl.d> a = Codec.unit(erl.d::new);
      public static final erl.c b = new erl.c(new akk("ore_drops"), a);

      @Override
      public int a(aym $$0, int $$1, int $$2) {
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
      public erl.c a() {
         return b;
      }
   }

   static record e(int c) implements erl.b {
      public static final Codec<erl.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(erl.e::b)).apply($$0, erl.e::new)
      );
      public static final erl.c b = new erl.c(new akk("uniform_bonus_count"), a);

      @Override
      public int a(aym $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public erl.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
