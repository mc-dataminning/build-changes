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

public class faq extends fbg {
   private static final Map<alg, faq.c> b = Stream.of(faq.a.a, faq.d.b, faq.e.b).collect(Collectors.toMap(faq.c::a, Function.identity()));
   private static final Codec<faq.c> c = alg.a.comapFlatMap($$0 -> {
      faq.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, faq.c::a);
   private static final MapCodec<faq.b> d = ayu.a("formula", "parameters", c, faq.b::a, faq.c::b);
   public static final MapCodec<faq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dga.c.fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, faq::new)
   );
   private final jf<dga> e;
   private final faq.b f;

   private faq(List<fdc> $$0, jf<dga> $$1, faq.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public fbi<faq> b() {
      return fbj.x;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fcn.i);
   }

   @Override
   public czn a(czn $$0, ezt $$1) {
      czn $$2 = $$1.c(fcn.i);
      if ($$2 != null) {
         int $$3 = dgc.a(this.e, $$2);
         int $$4 = this.f.a($$1.b(), $$0.M(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static fbg.a<?> a(jf<dga> $$0, float $$1, int $$2) {
      return a($$3 -> new faq($$3, $$0, new faq.a($$2, $$1)));
   }

   public static fbg.a<?> a(jf<dga> $$0) {
      return a($$1 -> new faq($$1, $$0, new faq.d()));
   }

   public static fbg.a<?> b(jf<dga> $$0) {
      return a($$1 -> new faq($$1, $$0, new faq.e(1)));
   }

   public static fbg.a<?> a(jf<dga> $$0, int $$1) {
      return a($$2 -> new faq($$2, $$0, new faq.e($$1)));
   }

   static record a(int b, float c) implements faq.b {
      private static final Codec<faq.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(faq.a::b), Codec.FLOAT.fieldOf("probability").forGetter(faq.a::c)).apply($$0, faq.a::new)
      );
      public static final faq.c a = new faq.c(alg.b("binomial_with_bonus_count"), d);

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
      public faq.c a() {
         return a;
      }
   }

   interface b {
      int a(azv var1, int var2, int var3);

      faq.c a();
   }

   static record c(alg a, Codec<? extends faq.b> b) {
   }

   static record d() implements faq.b {
      public static final Codec<faq.d> a = Codec.unit(faq.d::new);
      public static final faq.c b = new faq.c(alg.b("ore_drops"), a);

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
      public faq.c a() {
         return b;
      }
   }

   static record e(int c) implements faq.b {
      public static final Codec<faq.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(faq.e::b)).apply($$0, faq.e::new)
      );
      public static final faq.c b = new faq.c(alg.b("uniform_bonus_count"), a);

      @Override
      public int a(azv $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public faq.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
