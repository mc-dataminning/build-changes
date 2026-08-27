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

public class eqc extends eqq {
   private static final Map<akm, eqc.c> b = Stream.of(eqc.a.a, eqc.d.b, eqc.e.b).collect(Collectors.toMap(eqc.c::a, Function.identity()));
   private static final Codec<eqc.c> c = akm.a.comapFlatMap($$0 -> {
      eqc.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, eqc.c::a);
   private static final MapCodec<eqc.b> d = axm.a("formula", "parameters", c, eqc.b::a, eqc.c::b);
   public static final MapCodec<eqc> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(le.f.r().fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, eqc::new)
   );
   private final ix<cyz> e;
   private final eqc.b f;

   private eqc(List<esl> $$0, ix<cyz> $$1, eqc.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public eqs b() {
      return eqt.u;
   }

   @Override
   public Set<eru<?>> a() {
      return ImmutableSet.of(erx.i);
   }

   @Override
   public cto a(cto $$0, epf $$1) {
      cto $$2 = $$1.c(erx.i);
      if ($$2 != null) {
         int $$3 = cza.a(this.e.a(), $$2);
         int $$4 = this.f.a($$1.b(), $$0.I(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static eqq.a<?> a(cyz $$0, float $$1, int $$2) {
      return a($$3 -> new eqc($$3, $$0.m(), new eqc.a($$2, $$1)));
   }

   public static eqq.a<?> a(cyz $$0) {
      return a($$1 -> new eqc($$1, $$0.m(), new eqc.d()));
   }

   public static eqq.a<?> b(cyz $$0) {
      return a($$1 -> new eqc($$1, $$0.m(), new eqc.e(1)));
   }

   public static eqq.a<?> a(cyz $$0, int $$1) {
      return a($$2 -> new eqc($$2, $$0.m(), new eqc.e($$1)));
   }

   static record a(int b, float c) implements eqc.b {
      private static final Codec<eqc.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(eqc.a::b), Codec.FLOAT.fieldOf("probability").forGetter(eqc.a::c)).apply($$0, eqc.a::new)
      );
      public static final eqc.c a = new eqc.c(new akm("binomial_with_bonus_count"), d);

      @Override
      public int a(ayk $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public eqc.c a() {
         return a;
      }
   }

   interface b {
      int a(ayk var1, int var2, int var3);

      eqc.c a();
   }

   static record c(akm a, Codec<? extends eqc.b> b) {
   }

   static record d() implements eqc.b {
      public static final Codec<eqc.d> a = Codec.unit(eqc.d::new);
      public static final eqc.c b = new eqc.c(new akm("ore_drops"), a);

      @Override
      public int a(ayk $$0, int $$1, int $$2) {
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
      public eqc.c a() {
         return b;
      }
   }

   static record e(int c) implements eqc.b {
      public static final Codec<eqc.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(eqc.e::b)).apply($$0, eqc.e::new)
      );
      public static final eqc.c b = new eqc.c(new akm("uniform_bonus_count"), a);

      @Override
      public int a(ayk $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public eqc.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
