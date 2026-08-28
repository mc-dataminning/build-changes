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

public class fbe extends fbu {
   private static final Map<ali, fbe.c> b = Stream.of(fbe.a.a, fbe.d.b, fbe.e.b).collect(Collectors.toMap(fbe.c::a, Function.identity()));
   private static final Codec<fbe.c> c = ali.a.comapFlatMap($$0 -> {
      fbe.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, fbe.c::a);
   private static final MapCodec<fbe.b> d = ayw.a("formula", "parameters", c, fbe.b::a, fbe.c::b);
   public static final MapCodec<fbe> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dgl.c.fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, fbe::new)
   );
   private final jf<dgl> e;
   private final fbe.b f;

   private fbe(List<fdq> $$0, jf<dgl> $$1, fbe.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public fbw<fbe> b() {
      return fbx.x;
   }

   @Override
   public Set<baz<?>> a() {
      return Set.of(fdb.i);
   }

   @Override
   public czy a(czy $$0, fah $$1) {
      czy $$2 = $$1.c(fdb.i);
      if ($$2 != null) {
         int $$3 = dgn.a(this.e, $$2);
         int $$4 = this.f.a($$1.b(), $$0.M(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static fbu.a<?> a(jf<dgl> $$0, float $$1, int $$2) {
      return a($$3 -> new fbe($$3, $$0, new fbe.a($$2, $$1)));
   }

   public static fbu.a<?> a(jf<dgl> $$0) {
      return a($$1 -> new fbe($$1, $$0, new fbe.d()));
   }

   public static fbu.a<?> b(jf<dgl> $$0) {
      return a($$1 -> new fbe($$1, $$0, new fbe.e(1)));
   }

   public static fbu.a<?> a(jf<dgl> $$0, int $$1) {
      return a($$2 -> new fbe($$2, $$0, new fbe.e($$1)));
   }

   static record a(int b, float c) implements fbe.b {
      private static final Codec<fbe.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(fbe.a::b), Codec.FLOAT.fieldOf("probability").forGetter(fbe.a::c)).apply($$0, fbe.a::new)
      );
      public static final fbe.c a = new fbe.c(ali.b("binomial_with_bonus_count"), d);

      @Override
      public int a(azx $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public fbe.c a() {
         return a;
      }
   }

   interface b {
      int a(azx var1, int var2, int var3);

      fbe.c a();
   }

   static record c(ali a, Codec<? extends fbe.b> b) {
   }

   static record d() implements fbe.b {
      public static final Codec<fbe.d> a = Codec.unit(fbe.d::new);
      public static final fbe.c b = new fbe.c(ali.b("ore_drops"), a);

      @Override
      public int a(azx $$0, int $$1, int $$2) {
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
      public fbe.c a() {
         return b;
      }
   }

   static record e(int c) implements fbe.b {
      public static final Codec<fbe.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(fbe.e::b)).apply($$0, fbe.e::new)
      );
      public static final fbe.c b = new fbe.c(ali.b("uniform_bonus_count"), a);

      @Override
      public int a(azx $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public fbe.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
