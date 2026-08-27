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

public class eob extends eoo {
   private static final Map<ajt, eob.c> b = Stream.of(eob.a.a, eob.d.b, eob.e.b).collect(Collectors.toMap(eob.c::a, Function.identity()));
   private static final Codec<eob.c> c = ajt.a.comapFlatMap($$0 -> {
      eob.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, eob.c::a);
   private static final MapCodec<eob.b> d = aws.a("formula", "parameters", c, eob.b::a, eob.c::b);
   public static final Codec<eob> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(kr.f.r().fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, eob::new)
   );
   private final il<cwq> e;
   private final eob.b f;

   private eob(List<eqc> $$0, il<cwq> $$1, eob.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public eoq b() {
      return eor.s;
   }

   @Override
   public Set<epl<?>> a() {
      return ImmutableSet.of(epo.i);
   }

   @Override
   public crj a(crj $$0, enb $$1) {
      crj $$2 = $$1.c(epo.i);
      if ($$2 != null) {
         int $$3 = cwr.a(this.e.a(), $$2);
         int $$4 = this.f.a($$1.b(), $$0.G(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static eoo.a<?> a(cwq $$0, float $$1, int $$2) {
      return a($$3 -> new eob($$3, $$0.k(), new eob.a($$2, $$1)));
   }

   public static eoo.a<?> a(cwq $$0) {
      return a($$1 -> new eob($$1, $$0.k(), new eob.d()));
   }

   public static eoo.a<?> b(cwq $$0) {
      return a($$1 -> new eob($$1, $$0.k(), new eob.e(1)));
   }

   public static eoo.a<?> a(cwq $$0, int $$1) {
      return a($$2 -> new eob($$2, $$0.k(), new eob.e($$1)));
   }

   static record a(int b, float c) implements eob.b {
      private static final Codec<eob.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(eob.a::b), Codec.FLOAT.fieldOf("probability").forGetter(eob.a::c)).apply($$0, eob.a::new)
      );
      public static final eob.c a = new eob.c(new ajt("binomial_with_bonus_count"), d);

      @Override
      public int a(axr $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public eob.c a() {
         return a;
      }
   }

   interface b {
      int a(axr var1, int var2, int var3);

      eob.c a();
   }

   static record c(ajt a, Codec<? extends eob.b> b) {
   }

   static record d() implements eob.b {
      public static final Codec<eob.d> a = Codec.unit(eob.d::new);
      public static final eob.c b = new eob.c(new ajt("ore_drops"), a);

      @Override
      public int a(axr $$0, int $$1, int $$2) {
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
      public eob.c a() {
         return b;
      }
   }

   static record e(int c) implements eob.b {
      public static final Codec<eob.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(eob.e::b)).apply($$0, eob.e::new)
      );
      public static final eob.c b = new eob.c(new ajt("uniform_bonus_count"), a);

      @Override
      public int a(axr $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public eob.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
