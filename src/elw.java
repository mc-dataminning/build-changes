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

public class elw extends emi {
   private static final Map<ajh, elw.c> b = Stream.of(elw.a.a, elw.d.b, elw.e.b).collect(Collectors.toMap(elw.c::a, Function.identity()));
   private static final Codec<elw.c> c = ajh.a.comapFlatMap($$0 -> {
      elw.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, elw.c::a);
   private static final MapCodec<elw.b> d = awe.a("formula", "parameters", c, elw.b::a, elw.c::b);
   public static final Codec<elw> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(ki.f.r().fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, elw::new)
   );
   private final il<cuw> e;
   private final elw.b f;

   private elw(List<env> $$0, il<cuw> $$1, elw.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public emk b() {
      return eml.r;
   }

   @Override
   public Set<ene<?>> a() {
      return ImmutableSet.of(enh.i);
   }

   @Override
   public cqm a(cqm $$0, ekw $$1) {
      cqm $$2 = $$1.c(enh.i);
      if ($$2 != null) {
         int $$3 = cux.a(this.e.a(), $$2);
         int $$4 = this.f.a($$1.b(), $$0.M(), $$3);
         $$0.f($$4);
      }

      return $$0;
   }

   public static emi.a<?> a(cuw $$0, float $$1, int $$2) {
      return a($$3 -> new elw($$3, $$0.k(), new elw.a($$2, $$1)));
   }

   public static emi.a<?> a(cuw $$0) {
      return a($$1 -> new elw($$1, $$0.k(), new elw.d()));
   }

   public static emi.a<?> b(cuw $$0) {
      return a($$1 -> new elw($$1, $$0.k(), new elw.e(1)));
   }

   public static emi.a<?> a(cuw $$0, int $$1) {
      return a($$2 -> new elw($$2, $$0.k(), new elw.e($$1)));
   }

   static record a(int b, float c) implements elw.b {
      private static final Codec<elw.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(elw.a::b), Codec.FLOAT.fieldOf("probability").forGetter(elw.a::c)).apply($$0, elw.a::new)
      );
      public static final elw.c a = new elw.c(new ajh("binomial_with_bonus_count"), d);

      @Override
      public int a(axd $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public elw.c a() {
         return a;
      }
   }

   interface b {
      int a(axd var1, int var2, int var3);

      elw.c a();
   }

   static record c(ajh a, Codec<? extends elw.b> b) {
   }

   static record d() implements elw.b {
      public static final Codec<elw.d> a = Codec.unit(elw.d::new);
      public static final elw.c b = new elw.c(new ajh("ore_drops"), a);

      @Override
      public int a(axd $$0, int $$1, int $$2) {
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
      public elw.c a() {
         return b;
      }
   }

   static record e(int c) implements elw.b {
      public static final Codec<elw.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(elw.e::b)).apply($$0, elw.e::new)
      );
      public static final elw.c b = new elw.c(new ajh("uniform_bonus_count"), a);

      @Override
      public int a(axd $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public elw.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
