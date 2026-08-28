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

public class eui extends euy {
   private static final Map<ale, eui.c> b = Stream.of(eui.a.a, eui.d.b, eui.e.b).collect(Collectors.toMap(eui.c::a, Function.identity()));
   private static final Codec<eui.c> c = ale.a.comapFlatMap($$0 -> {
      eui.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, eui.c::a);
   private static final MapCodec<eui.b> d = ayo.a("formula", "parameters", c, eui.b::a, eui.c::b);
   public static final MapCodec<eui> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dbn.c.fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, eui::new)
   );
   private final jo<dbn> e;
   private final eui.b f;

   private eui(List<eww> $$0, jo<dbn> $$1, eui.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public eva<eui> b() {
      return evb.x;
   }

   @Override
   public Set<ewe<?>> a() {
      return ImmutableSet.of(ewh.i);
   }

   @Override
   public cvs a(cvs $$0, etl $$1) {
      cvs $$2 = $$1.c(ewh.i);
      if ($$2 != null) {
         int $$3 = dbp.a(this.e, $$2);
         int $$4 = this.f.a($$1.b(), $$0.K(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static euy.a<?> a(jo<dbn> $$0, float $$1, int $$2) {
      return a($$3 -> new eui($$3, $$0, new eui.a($$2, $$1)));
   }

   public static euy.a<?> a(jo<dbn> $$0) {
      return a($$1 -> new eui($$1, $$0, new eui.d()));
   }

   public static euy.a<?> b(jo<dbn> $$0) {
      return a($$1 -> new eui($$1, $$0, new eui.e(1)));
   }

   public static euy.a<?> a(jo<dbn> $$0, int $$1) {
      return a($$2 -> new eui($$2, $$0, new eui.e($$1)));
   }

   static record a(int b, float c) implements eui.b {
      private static final Codec<eui.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(eui.a::b), Codec.FLOAT.fieldOf("probability").forGetter(eui.a::c)).apply($$0, eui.a::new)
      );
      public static final eui.c a = new eui.c(ale.b("binomial_with_bonus_count"), d);

      @Override
      public int a(azn $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public eui.c a() {
         return a;
      }
   }

   interface b {
      int a(azn var1, int var2, int var3);

      eui.c a();
   }

   static record c(ale a, Codec<? extends eui.b> b) {
   }

   static record d() implements eui.b {
      public static final Codec<eui.d> a = Codec.unit(eui.d::new);
      public static final eui.c b = new eui.c(ale.b("ore_drops"), a);

      @Override
      public int a(azn $$0, int $$1, int $$2) {
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
      public eui.c a() {
         return b;
      }
   }

   static record e(int c) implements eui.b {
      public static final Codec<eui.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(eui.e::b)).apply($$0, eui.e::new)
      );
      public static final eui.c b = new eui.c(ale.b("uniform_bonus_count"), a);

      @Override
      public int a(azn $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public eui.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
