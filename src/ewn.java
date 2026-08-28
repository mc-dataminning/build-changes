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

public class ewn extends exd {
   private static final Map<akv, ewn.c> b = Stream.of(ewn.a.a, ewn.d.b, ewn.e.b).collect(Collectors.toMap(ewn.c::a, Function.identity()));
   private static final Codec<ewn.c> c = akv.a.comapFlatMap($$0 -> {
      ewn.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, ewn.c::a);
   private static final MapCodec<ewn.b> d = ayi.a("formula", "parameters", c, ewn.b::a, ewn.c::b);
   public static final MapCodec<ewn> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dcy.c.fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, ewn::new)
   );
   private final jr<dcy> e;
   private final ewn.b f;

   private ewn(List<eyz> $$0, jr<dcy> $$1, ewn.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public exf<ewn> b() {
      return exg.x;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(eyk.i);
   }

   @Override
   public cwo a(cwo $$0, evq $$1) {
      cwo $$2 = $$1.c(eyk.i);
      if ($$2 != null) {
         int $$3 = dda.a(this.e, $$2);
         int $$4 = this.f.a($$1.b(), $$0.M(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static exd.a<?> a(jr<dcy> $$0, float $$1, int $$2) {
      return a($$3 -> new ewn($$3, $$0, new ewn.a($$2, $$1)));
   }

   public static exd.a<?> a(jr<dcy> $$0) {
      return a($$1 -> new ewn($$1, $$0, new ewn.d()));
   }

   public static exd.a<?> b(jr<dcy> $$0) {
      return a($$1 -> new ewn($$1, $$0, new ewn.e(1)));
   }

   public static exd.a<?> a(jr<dcy> $$0, int $$1) {
      return a($$2 -> new ewn($$2, $$0, new ewn.e($$1)));
   }

   static record a(int b, float c) implements ewn.b {
      private static final Codec<ewn.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(ewn.a::b), Codec.FLOAT.fieldOf("probability").forGetter(ewn.a::c)).apply($$0, ewn.a::new)
      );
      public static final ewn.c a = new ewn.c(akv.b("binomial_with_bonus_count"), d);

      @Override
      public int a(azh $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public ewn.c a() {
         return a;
      }
   }

   interface b {
      int a(azh var1, int var2, int var3);

      ewn.c a();
   }

   static record c(akv a, Codec<? extends ewn.b> b) {
   }

   static record d() implements ewn.b {
      public static final Codec<ewn.d> a = Codec.unit(ewn.d::new);
      public static final ewn.c b = new ewn.c(akv.b("ore_drops"), a);

      @Override
      public int a(azh $$0, int $$1, int $$2) {
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
      public ewn.c a() {
         return b;
      }
   }

   static record e(int c) implements ewn.b {
      public static final Codec<ewn.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(ewn.e::b)).apply($$0, ewn.e::new)
      );
      public static final ewn.c b = new ewn.c(akv.b("uniform_bonus_count"), a);

      @Override
      public int a(azh $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public ewn.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
