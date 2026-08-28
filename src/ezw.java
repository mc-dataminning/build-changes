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

public class ezw extends fam {
   private static final Map<alg, ezw.c> b = Stream.of(ezw.a.a, ezw.d.b, ezw.e.b).collect(Collectors.toMap(ezw.c::a, Function.identity()));
   private static final Codec<ezw.c> c = alg.a.comapFlatMap($$0 -> {
      ezw.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, ezw.c::a);
   private static final MapCodec<ezw.b> d = ayu.a("formula", "parameters", c, ezw.b::a, ezw.c::b);
   public static final MapCodec<ezw> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dfl.c.fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, ezw::new)
   );
   private final je<dfl> e;
   private final ezw.b f;

   private ezw(List<fci> $$0, je<dfl> $$1, ezw.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public fao<ezw> b() {
      return fap.x;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fbt.i);
   }

   @Override
   public cyy a(cyy $$0, eyz $$1) {
      cyy $$2 = $$1.c(fbt.i);
      if ($$2 != null) {
         int $$3 = dfn.a(this.e, $$2);
         int $$4 = this.f.a($$1.b(), $$0.M(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static fam.a<?> a(je<dfl> $$0, float $$1, int $$2) {
      return a($$3 -> new ezw($$3, $$0, new ezw.a($$2, $$1)));
   }

   public static fam.a<?> a(je<dfl> $$0) {
      return a($$1 -> new ezw($$1, $$0, new ezw.d()));
   }

   public static fam.a<?> b(je<dfl> $$0) {
      return a($$1 -> new ezw($$1, $$0, new ezw.e(1)));
   }

   public static fam.a<?> a(je<dfl> $$0, int $$1) {
      return a($$2 -> new ezw($$2, $$0, new ezw.e($$1)));
   }

   static record a(int b, float c) implements ezw.b {
      private static final Codec<ezw.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(ezw.a::b), Codec.FLOAT.fieldOf("probability").forGetter(ezw.a::c)).apply($$0, ezw.a::new)
      );
      public static final ezw.c a = new ezw.c(alg.b("binomial_with_bonus_count"), d);

      @Override
      public int a(azv $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public ezw.c a() {
         return a;
      }
   }

   interface b {
      int a(azv var1, int var2, int var3);

      ezw.c a();
   }

   static record c(alg a, Codec<? extends ezw.b> b) {
   }

   static record d() implements ezw.b {
      public static final Codec<ezw.d> a = Codec.unit(ezw.d::new);
      public static final ezw.c b = new ezw.c(alg.b("ore_drops"), a);

      @Override
      public int a(azv $$0, int $$1, int $$2) {
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
      public ezw.c a() {
         return b;
      }
   }

   static record e(int c) implements ezw.b {
      public static final Codec<ezw.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(ezw.e::b)).apply($$0, ezw.e::new)
      );
      public static final ezw.c b = new ezw.c(alg.b("uniform_bonus_count"), a);

      @Override
      public int a(azv $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public ezw.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
