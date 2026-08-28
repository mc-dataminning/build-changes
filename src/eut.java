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

public class eut extends evj {
   private static final Map<alh, eut.c> b = Stream.of(eut.a.a, eut.d.b, eut.e.b).collect(Collectors.toMap(eut.c::a, Function.identity()));
   private static final Codec<eut.c> c = alh.a.comapFlatMap($$0 -> {
      eut.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, eut.c::a);
   private static final MapCodec<eut.b> d = ays.a("formula", "parameters", c, eut.b::a, eut.c::b);
   public static final MapCodec<eut> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dbm.c.fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, eut::new)
   );
   private final jp<dbm> e;
   private final eut.b f;

   private eut(List<exh> $$0, jp<dbm> $$1, eut.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public evl<eut> b() {
      return evm.x;
   }

   @Override
   public Set<ewp<?>> a() {
      return ImmutableSet.of(ews.i);
   }

   @Override
   public cvx a(cvx $$0, etw $$1) {
      cvx $$2 = $$1.c(ews.i);
      if ($$2 != null) {
         int $$3 = dbo.a(this.e, $$2);
         int $$4 = this.f.a($$1.b(), $$0.L(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static evj.a<?> a(jp<dbm> $$0, float $$1, int $$2) {
      return a($$3 -> new eut($$3, $$0, new eut.a($$2, $$1)));
   }

   public static evj.a<?> a(jp<dbm> $$0) {
      return a($$1 -> new eut($$1, $$0, new eut.d()));
   }

   public static evj.a<?> b(jp<dbm> $$0) {
      return a($$1 -> new eut($$1, $$0, new eut.e(1)));
   }

   public static evj.a<?> a(jp<dbm> $$0, int $$1) {
      return a($$2 -> new eut($$2, $$0, new eut.e($$1)));
   }

   static record a(int b, float c) implements eut.b {
      private static final Codec<eut.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(eut.a::b), Codec.FLOAT.fieldOf("probability").forGetter(eut.a::c)).apply($$0, eut.a::new)
      );
      public static final eut.c a = new eut.c(alh.b("binomial_with_bonus_count"), d);

      @Override
      public int a(azr $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public eut.c a() {
         return a;
      }
   }

   interface b {
      int a(azr var1, int var2, int var3);

      eut.c a();
   }

   static record c(alh a, Codec<? extends eut.b> b) {
   }

   static record d() implements eut.b {
      public static final Codec<eut.d> a = Codec.unit(eut.d::new);
      public static final eut.c b = new eut.c(alh.b("ore_drops"), a);

      @Override
      public int a(azr $$0, int $$1, int $$2) {
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
      public eut.c a() {
         return b;
      }
   }

   static record e(int c) implements eut.b {
      public static final Codec<eut.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(eut.e::b)).apply($$0, eut.e::new)
      );
      public static final eut.c b = new eut.c(alh.b("uniform_bonus_count"), a);

      @Override
      public int a(azr $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public eut.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
