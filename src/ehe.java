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

public class ehe extends ehq {
   private static final Map<agt, ehe.c> b = Stream.of(ehe.a.a, ehe.d.b, ehe.e.b).collect(Collectors.toMap(ehe.c::a, Function.identity()));
   private static final Codec<ehe.c> c = agt.a.comapFlatMap($$0 -> {
      ehe.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, ehe.c::a);
   private static final MapCodec<ehe.b> d = atg.a("formula", "parameters", c, ehe.b::a, ehe.c::b);
   public static final Codec<ehe> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(kb.f.r().fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, ehe::new)
   );
   private final ie<cqs> e;
   private final ehe.b f;

   private ehe(List<ejd> $$0, ie<cqs> $$1, ehe.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public ehs b() {
      return eht.r;
   }

   @Override
   public Set<eim<?>> a() {
      return ImmutableSet.of(eip.i);
   }

   @Override
   public cmh a(cmh $$0, ege $$1) {
      cmh $$2 = $$1.c(eip.i);
      if ($$2 != null) {
         int $$3 = cqu.a(this.e.a(), $$2);
         int $$4 = this.f.a($$1.b(), $$0.L(), $$3);
         $$0.f($$4);
      }

      return $$0;
   }

   public static ehq.a<?> a(cqs $$0, float $$1, int $$2) {
      return a($$3 -> new ehe($$3, $$0.j(), new ehe.a($$2, $$1)));
   }

   public static ehq.a<?> a(cqs $$0) {
      return a($$1 -> new ehe($$1, $$0.j(), new ehe.d()));
   }

   public static ehq.a<?> b(cqs $$0) {
      return a($$1 -> new ehe($$1, $$0.j(), new ehe.e(1)));
   }

   public static ehq.a<?> a(cqs $$0, int $$1) {
      return a($$2 -> new ehe($$2, $$0.j(), new ehe.e($$1)));
   }

   static record a(int b, float c) implements ehe.b {
      private static final Codec<ehe.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(ehe.a::b), Codec.FLOAT.fieldOf("probability").forGetter(ehe.a::c)).apply($$0, ehe.a::new)
      );
      public static final ehe.c a = new ehe.c(new agt("binomial_with_bonus_count"), d);

      @Override
      public int a(auf $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public ehe.c a() {
         return a;
      }
   }

   interface b {
      int a(auf var1, int var2, int var3);

      ehe.c a();
   }

   static record c(agt a, Codec<? extends ehe.b> b) {
   }

   static record d() implements ehe.b {
      public static final Codec<ehe.d> a = Codec.unit(ehe.d::new);
      public static final ehe.c b = new ehe.c(new agt("ore_drops"), a);

      @Override
      public int a(auf $$0, int $$1, int $$2) {
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
      public ehe.c a() {
         return b;
      }
   }

   static record e(int c) implements ehe.b {
      public static final Codec<ehe.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(ehe.e::b)).apply($$0, ehe.e::new)
      );
      public static final ehe.c b = new ehe.c(new agt("uniform_bonus_count"), a);

      @Override
      public int a(auf $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public ehe.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
