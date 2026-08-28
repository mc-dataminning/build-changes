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

public class evf extends eug {
   private static final Codec<List<evf.b>> b = evf.b.a.listOf().validate($$0 -> {
      Set<jn<bso>> $$1 = new ObjectOpenHashSet();

      for (evf.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   });
   public static final MapCodec<evf> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(b.optionalFieldOf("effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, evf::new)
   );
   private final List<evf.b> c;

   evf(List<ewe> $$0, List<evf.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public eui<evf> b() {
      return euj.r;
   }

   @Override
   public Set<evm<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cvl a(cvl $$0, est $$1) {
      if ($$0.a(cvo.vY) && !this.c.isEmpty()) {
         evf.b $$2 = ad.a(this.c, $$1.b());
         jn<bso> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         cyp.a $$5 = new cyp.a($$3, $$4);
         $$0.a(kr.J, cyp.a, $$5, cyp::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static evf.a c() {
      return new evf.a();
   }

   public static class a extends eug.a<evf.a> {
      private final Builder<evf.b> a = ImmutableList.builder();

      protected evf.a a() {
         return this;
      }

      public evf.a a(jn<bso> $$0, exa $$1) {
         this.a.add(new evf.b($$0, $$1));
         return this;
      }

      @Override
      public euh b() {
         return new evf(this.g(), this.a.build());
      }
   }

   static record b(jn<bso> b, exa c) {
      public static final Codec<evf.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bso.a.fieldOf("type").forGetter(evf.b::a), exb.a.fieldOf("duration").forGetter(evf.b::b)).apply($$0, evf.b::new)
      );

      public jn<bso> a() {
         return this.b;
      }

      public exa b() {
         return this.c;
      }
   }
}
