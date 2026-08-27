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

public class ehw extends eii {
   private static final Map<ahg, ehw.c> b = Stream.of(ehw.a.a, ehw.d.b, ehw.e.b).collect(Collectors.toMap(ehw.c::a, Function.identity()));
   private static final Codec<ehw.c> c = ahg.a.comapFlatMap($$0 -> {
      ehw.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, ehw.c::a);
   private static final MapCodec<ehw.b> d = atw.a("formula", "parameters", c, ehw.b::a, ehw.c::b);
   public static final Codec<ehw> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(kd.f.r().fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, ehw::new)
   );
   private final ih<crj> e;
   private final ehw.b f;

   private ehw(List<ejv> $$0, ih<crj> $$1, ehw.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public eik b() {
      return eil.r;
   }

   @Override
   public Set<eje<?>> a() {
      return ImmutableSet.of(ejh.i);
   }

   @Override
   public cmy a(cmy $$0, egw $$1) {
      cmy $$2 = $$1.c(ejh.i);
      if ($$2 != null) {
         int $$3 = crl.a(this.e.a(), $$2);
         int $$4 = this.f.a($$1.b(), $$0.L(), $$3);
         $$0.f($$4);
      }

      return $$0;
   }

   public static eii.a<?> a(crj $$0, float $$1, int $$2) {
      return a($$3 -> new ehw($$3, $$0.j(), new ehw.a($$2, $$1)));
   }

   public static eii.a<?> a(crj $$0) {
      return a($$1 -> new ehw($$1, $$0.j(), new ehw.d()));
   }

   public static eii.a<?> b(crj $$0) {
      return a($$1 -> new ehw($$1, $$0.j(), new ehw.e(1)));
   }

   public static eii.a<?> a(crj $$0, int $$1) {
      return a($$2 -> new ehw($$2, $$0.j(), new ehw.e($$1)));
   }

   static record a(int b, float c) implements ehw.b {
      private static final Codec<ehw.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(ehw.a::b), Codec.FLOAT.fieldOf("probability").forGetter(ehw.a::c)).apply($$0, ehw.a::new)
      );
      public static final ehw.c a = new ehw.c(new ahg("binomial_with_bonus_count"), d);

      @Override
      public int a(auv $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public ehw.c a() {
         return a;
      }
   }

   interface b {
      int a(auv var1, int var2, int var3);

      ehw.c a();
   }

   static record c(ahg a, Codec<? extends ehw.b> b) {
   }

   static record d() implements ehw.b {
      public static final Codec<ehw.d> a = Codec.unit(ehw.d::new);
      public static final ehw.c b = new ehw.c(new ahg("ore_drops"), a);

      @Override
      public int a(auv $$0, int $$1, int $$2) {
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
      public ehw.c a() {
         return b;
      }
   }

   static record e(int c) implements ehw.b {
      public static final Codec<ehw.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(ehw.e::b)).apply($$0, ehw.e::new)
      );
      public static final ehw.c b = new ehw.c(new ahg("uniform_bonus_count"), a);

      @Override
      public int a(auv $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public ehw.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
