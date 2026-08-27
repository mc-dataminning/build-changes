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

public class ekc extends eko {
   private static final Map<aiy, ekc.c> b = Stream.of(ekc.a.a, ekc.d.b, ekc.e.b).collect(Collectors.toMap(ekc.c::a, Function.identity()));
   private static final Codec<ekc.c> c = aiy.a.comapFlatMap($$0 -> {
      ekc.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, ekc.c::a);
   private static final MapCodec<ekc.b> d = avq.a("formula", "parameters", c, ekc.b::a, ekc.c::b);
   public static final Codec<ekc> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(kf.f.r().fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, ekc::new)
   );
   private final ij<ctm> e;
   private final ekc.b f;

   private ekc(List<emb> $$0, ij<ctm> $$1, ekc.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public ekq b() {
      return ekr.r;
   }

   @Override
   public Set<elk<?>> a() {
      return ImmutableSet.of(eln.i);
   }

   @Override
   public cpd a(cpd $$0, ejc $$1) {
      cpd $$2 = $$1.c(eln.i);
      if ($$2 != null) {
         int $$3 = ctn.a(this.e.a(), $$2);
         int $$4 = this.f.a($$1.b(), $$0.M(), $$3);
         $$0.f($$4);
      }

      return $$0;
   }

   public static eko.a<?> a(ctm $$0, float $$1, int $$2) {
      return a($$3 -> new ekc($$3, $$0.k(), new ekc.a($$2, $$1)));
   }

   public static eko.a<?> a(ctm $$0) {
      return a($$1 -> new ekc($$1, $$0.k(), new ekc.d()));
   }

   public static eko.a<?> b(ctm $$0) {
      return a($$1 -> new ekc($$1, $$0.k(), new ekc.e(1)));
   }

   public static eko.a<?> a(ctm $$0, int $$1) {
      return a($$2 -> new ekc($$2, $$0.k(), new ekc.e($$1)));
   }

   static record a(int b, float c) implements ekc.b {
      private static final Codec<ekc.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(ekc.a::b), Codec.FLOAT.fieldOf("probability").forGetter(ekc.a::c)).apply($$0, ekc.a::new)
      );
      public static final ekc.c a = new ekc.c(new aiy("binomial_with_bonus_count"), d);

      @Override
      public int a(awp $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public ekc.c a() {
         return a;
      }
   }

   interface b {
      int a(awp var1, int var2, int var3);

      ekc.c a();
   }

   static record c(aiy a, Codec<? extends ekc.b> b) {
   }

   static record d() implements ekc.b {
      public static final Codec<ekc.d> a = Codec.unit(ekc.d::new);
      public static final ekc.c b = new ekc.c(new aiy("ore_drops"), a);

      @Override
      public int a(awp $$0, int $$1, int $$2) {
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
      public ekc.c a() {
         return b;
      }
   }

   static record e(int c) implements ekc.b {
      public static final Codec<ekc.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(ekc.e::b)).apply($$0, ekc.e::new)
      );
      public static final ekc.c b = new ekc.c(new aiy("uniform_bonus_count"), a);

      @Override
      public int a(awp $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public ekc.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
