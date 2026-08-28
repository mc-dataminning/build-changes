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

public class fbg extends fbw {
   private static final Map<alk, fbg.c> b = Stream.of(fbg.a.a, fbg.d.b, fbg.e.b).collect(Collectors.toMap(fbg.c::a, Function.identity()));
   private static final Codec<fbg.c> c = alk.a.comapFlatMap($$0 -> {
      fbg.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, fbg.c::a);
   private static final MapCodec<fbg.b> d = ayy.a("formula", "parameters", c, fbg.b::a, fbg.c::b);
   public static final MapCodec<fbg> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dgn.c.fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, fbg::new)
   );
   private final jg<dgn> e;
   private final fbg.b f;

   private fbg(List<fds> $$0, jg<dgn> $$1, fbg.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public fby<fbg> b() {
      return fbz.x;
   }

   @Override
   public Set<bbb<?>> a() {
      return Set.of(fdd.i);
   }

   @Override
   public daa a(daa $$0, faj $$1) {
      daa $$2 = $$1.c(fdd.i);
      if ($$2 != null) {
         int $$3 = dgp.a(this.e, $$2);
         int $$4 = this.f.a($$1.b(), $$0.M(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static fbw.a<?> a(jg<dgn> $$0, float $$1, int $$2) {
      return a($$3 -> new fbg($$3, $$0, new fbg.a($$2, $$1)));
   }

   public static fbw.a<?> a(jg<dgn> $$0) {
      return a($$1 -> new fbg($$1, $$0, new fbg.d()));
   }

   public static fbw.a<?> b(jg<dgn> $$0) {
      return a($$1 -> new fbg($$1, $$0, new fbg.e(1)));
   }

   public static fbw.a<?> a(jg<dgn> $$0, int $$1) {
      return a($$2 -> new fbg($$2, $$0, new fbg.e($$1)));
   }

   static record a(int b, float c) implements fbg.b {
      private static final Codec<fbg.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(fbg.a::b), Codec.FLOAT.fieldOf("probability").forGetter(fbg.a::c)).apply($$0, fbg.a::new)
      );
      public static final fbg.c a = new fbg.c(alk.b("binomial_with_bonus_count"), d);

      @Override
      public int a(azz $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public fbg.c a() {
         return a;
      }
   }

   interface b {
      int a(azz var1, int var2, int var3);

      fbg.c a();
   }

   static record c(alk a, Codec<? extends fbg.b> b) {
   }

   static record d() implements fbg.b {
      public static final Codec<fbg.d> a = Codec.unit(fbg.d::new);
      public static final fbg.c b = new fbg.c(alk.b("ore_drops"), a);

      @Override
      public int a(azz $$0, int $$1, int $$2) {
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
      public fbg.c a() {
         return b;
      }
   }

   static record e(int c) implements fbg.b {
      public static final Codec<fbg.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(fbg.e::b)).apply($$0, fbg.e::new)
      );
      public static final fbg.c b = new fbg.c(alk.b("uniform_bonus_count"), a);

      @Override
      public int a(azz $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public fbg.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
