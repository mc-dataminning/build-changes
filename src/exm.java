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

public class exm extends eyc {
   private static final Map<alz, exm.c> b = Stream.of(exm.a.a, exm.d.b, exm.e.b).collect(Collectors.toMap(exm.c::a, Function.identity()));
   private static final Codec<exm.c> c = alz.a.comapFlatMap($$0 -> {
      exm.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, exm.c::a);
   private static final MapCodec<exm.b> d = azn.a("formula", "parameters", c, exm.b::a, exm.c::b);
   public static final MapCodec<exm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(ddz.c.fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, exm::new)
   );
   private final jq<ddz> e;
   private final exm.b f;

   private exm(List<ezy> $$0, jq<ddz> $$1, exm.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public eye<exm> b() {
      return eyf.x;
   }

   @Override
   public Set<bbn<?>> a() {
      return Set.of(ezj.i);
   }

   @Override
   public cxp a(cxp $$0, ewp $$1) {
      cxp $$2 = $$1.c(ezj.i);
      if ($$2 != null) {
         int $$3 = deb.a(this.e, $$2);
         int $$4 = this.f.a($$1.b(), $$0.L(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static eyc.a<?> a(jq<ddz> $$0, float $$1, int $$2) {
      return a($$3 -> new exm($$3, $$0, new exm.a($$2, $$1)));
   }

   public static eyc.a<?> a(jq<ddz> $$0) {
      return a($$1 -> new exm($$1, $$0, new exm.d()));
   }

   public static eyc.a<?> b(jq<ddz> $$0) {
      return a($$1 -> new exm($$1, $$0, new exm.e(1)));
   }

   public static eyc.a<?> a(jq<ddz> $$0, int $$1) {
      return a($$2 -> new exm($$2, $$0, new exm.e($$1)));
   }

   static record a(int b, float c) implements exm.b {
      private static final Codec<exm.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(exm.a::b), Codec.FLOAT.fieldOf("probability").forGetter(exm.a::c)).apply($$0, exm.a::new)
      );
      public static final exm.c a = new exm.c(alz.b("binomial_with_bonus_count"), d);

      @Override
      public int a(bam $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public exm.c a() {
         return a;
      }
   }

   interface b {
      int a(bam var1, int var2, int var3);

      exm.c a();
   }

   static record c(alz a, Codec<? extends exm.b> b) {
   }

   static record d() implements exm.b {
      public static final Codec<exm.d> a = Codec.unit(exm.d::new);
      public static final exm.c b = new exm.c(alz.b("ore_drops"), a);

      @Override
      public int a(bam $$0, int $$1, int $$2) {
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
      public exm.c a() {
         return b;
      }
   }

   static record e(int c) implements exm.b {
      public static final Codec<exm.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(exm.e::b)).apply($$0, exm.e::new)
      );
      public static final exm.c b = new exm.c(alz.b("uniform_bonus_count"), a);

      @Override
      public int a(bam $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public exm.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
