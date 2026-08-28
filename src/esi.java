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

public class esi extends esy {
   private static final Map<akq, esi.c> b = Stream.of(esi.a.a, esi.d.b, esi.e.b).collect(Collectors.toMap(esi.c::a, Function.identity()));
   private static final Codec<esi.c> c = akq.a.comapFlatMap($$0 -> {
      esi.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, esi.c::a);
   private static final MapCodec<esi.b> d = axv.a("formula", "parameters", c, esi.b::a, esi.c::b);
   public static final MapCodec<esi> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(daa.c.fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, esi::new)
   );
   private final jm<daa> e;
   private final esi.b f;

   private esi(List<euw> $$0, jm<daa> $$1, esi.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public eta<esi> b() {
      return etb.x;
   }

   @Override
   public Set<eue<?>> a() {
      return ImmutableSet.of(euh.i);
   }

   @Override
   public cuo a(cuo $$0, erl $$1) {
      cuo $$2 = $$1.c(euh.i);
      if ($$2 != null) {
         int $$3 = dac.a(this.e, $$2);
         int $$4 = this.f.a($$1.b(), $$0.H(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static esy.a<?> a(jm<daa> $$0, float $$1, int $$2) {
      return a($$3 -> new esi($$3, $$0, new esi.a($$2, $$1)));
   }

   public static esy.a<?> a(jm<daa> $$0) {
      return a($$1 -> new esi($$1, $$0, new esi.d()));
   }

   public static esy.a<?> b(jm<daa> $$0) {
      return a($$1 -> new esi($$1, $$0, new esi.e(1)));
   }

   public static esy.a<?> a(jm<daa> $$0, int $$1) {
      return a($$2 -> new esi($$2, $$0, new esi.e($$1)));
   }

   static record a(int b, float c) implements esi.b {
      private static final Codec<esi.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(esi.a::b), Codec.FLOAT.fieldOf("probability").forGetter(esi.a::c)).apply($$0, esi.a::new)
      );
      public static final esi.c a = new esi.c(akq.b("binomial_with_bonus_count"), d);

      @Override
      public int a(ayv $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public esi.c a() {
         return a;
      }
   }

   interface b {
      int a(ayv var1, int var2, int var3);

      esi.c a();
   }

   static record c(akq a, Codec<? extends esi.b> b) {
   }

   static record d() implements esi.b {
      public static final Codec<esi.d> a = Codec.unit(esi.d::new);
      public static final esi.c b = new esi.c(akq.b("ore_drops"), a);

      @Override
      public int a(ayv $$0, int $$1, int $$2) {
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
      public esi.c a() {
         return b;
      }
   }

   static record e(int c) implements esi.b {
      public static final Codec<esi.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(esi.e::b)).apply($$0, esi.e::new)
      );
      public static final esi.c b = new esi.c(akq.b("uniform_bonus_count"), a);

      @Override
      public int a(ayv $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public esi.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
