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

public class ewp extends exf {
   private static final Map<akv, ewp.c> b = Stream.of(ewp.a.a, ewp.d.b, ewp.e.b).collect(Collectors.toMap(ewp.c::a, Function.identity()));
   private static final Codec<ewp.c> c = akv.a.comapFlatMap($$0 -> {
      ewp.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, ewp.c::a);
   private static final MapCodec<ewp.b> d = ayi.a("formula", "parameters", c, ewp.b::a, ewp.c::b);
   public static final MapCodec<ewp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dda.c.fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, ewp::new)
   );
   private final jr<dda> e;
   private final ewp.b f;

   private ewp(List<ezb> $$0, jr<dda> $$1, ewp.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public exh<ewp> b() {
      return exi.x;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(eym.i);
   }

   @Override
   public cwq a(cwq $$0, evs $$1) {
      cwq $$2 = $$1.c(eym.i);
      if ($$2 != null) {
         int $$3 = ddc.a(this.e, $$2);
         int $$4 = this.f.a($$1.b(), $$0.M(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static exf.a<?> a(jr<dda> $$0, float $$1, int $$2) {
      return a($$3 -> new ewp($$3, $$0, new ewp.a($$2, $$1)));
   }

   public static exf.a<?> a(jr<dda> $$0) {
      return a($$1 -> new ewp($$1, $$0, new ewp.d()));
   }

   public static exf.a<?> b(jr<dda> $$0) {
      return a($$1 -> new ewp($$1, $$0, new ewp.e(1)));
   }

   public static exf.a<?> a(jr<dda> $$0, int $$1) {
      return a($$2 -> new ewp($$2, $$0, new ewp.e($$1)));
   }

   static record a(int b, float c) implements ewp.b {
      private static final Codec<ewp.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(ewp.a::b), Codec.FLOAT.fieldOf("probability").forGetter(ewp.a::c)).apply($$0, ewp.a::new)
      );
      public static final ewp.c a = new ewp.c(akv.b("binomial_with_bonus_count"), d);

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
      public ewp.c a() {
         return a;
      }
   }

   interface b {
      int a(azh var1, int var2, int var3);

      ewp.c a();
   }

   static record c(akv a, Codec<? extends ewp.b> b) {
   }

   static record d() implements ewp.b {
      public static final Codec<ewp.d> a = Codec.unit(ewp.d::new);
      public static final ewp.c b = new ewp.c(akv.b("ore_drops"), a);

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
      public ewp.c a() {
         return b;
      }
   }

   static record e(int c) implements ewp.b {
      public static final Codec<ewp.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(ewp.e::b)).apply($$0, ewp.e::new)
      );
      public static final ewp.c b = new ewp.c(akv.b("uniform_bonus_count"), a);

      @Override
      public int a(azh $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public ewp.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
