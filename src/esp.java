import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.List;
import java.util.Set;

public class esp extends erp {
   private static final Codec<List<esp.b>> b = esp.b.a.listOf().validate($$0 -> {
      Set<ji<brv>> $$1 = new ObjectOpenHashSet();

      for (esp.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   });
   public static final MapCodec<esp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(b.optionalFieldOf("effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, esp::new)
   );
   private final List<esp.b> c;

   esp(List<etn> $$0, List<esp.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public err<esp> b() {
      return ers.r;
   }

   @Override
   public Set<esw<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cuk a(cuk $$0, eqd $$1) {
      if ($$0.a(cun.vU) && !this.c.isEmpty()) {
         esp.b $$2 = ac.a(this.c, $$1.b());
         ji<brv> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         cxo.a $$5 = new cxo.a($$3, $$4);
         $$0.a(km.G, cxo.a, $$5, cxo::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static esp.a c() {
      return new esp.a();
   }

   public static class a extends erp.a<esp.a> {
      private final Builder<esp.b> a = ImmutableList.builder();

      protected esp.a a() {
         return this;
      }

      public esp.a a(ji<brv> $$0, eui $$1) {
         this.a.add(new esp.b($$0, $$1));
         return this;
      }

      @Override
      public erq b() {
         return new esp(this.g(), this.a.build());
      }
   }

   static record b(ji<brv> b, eui c) {
      public static final Codec<esp.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(lp.d.r().fieldOf("type").forGetter(esp.b::a), euj.a.fieldOf("duration").forGetter(esp.b::b)).apply($$0, esp.b::new)
      );

      public ji<brv> a() {
         return this.b;
      }

      public eui b() {
         return this.c;
      }
   }
}
