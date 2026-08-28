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

public class ews extends evt {
   private static final Codec<List<ews.b>> b = ews.b.a.listOf().validate($$0 -> {
      Set<jq<btl>> $$1 = new ObjectOpenHashSet();

      for (ews.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   });
   public static final MapCodec<ews> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(b.optionalFieldOf("effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, ews::new)
   );
   private final List<ews.b> c;

   ews(List<exr> $$0, List<ews.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public evv<ews> b() {
      return evw.r;
   }

   @Override
   public Set<ewz<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cwf a(cwf $$0, eug $$1) {
      if ($$0.a(cwj.wo) && !this.c.isEmpty()) {
         ews.b $$2 = ae.a(this.c, $$1.b());
         jq<btl> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         czg.a $$5 = new czg.a($$3, $$4);
         $$0.a(ku.R, czg.a, $$5, czg::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static ews.a c() {
      return new ews.a();
   }

   public static class a extends evt.a<ews.a> {
      private final Builder<ews.b> a = ImmutableList.builder();

      protected ews.a a() {
         return this;
      }

      public ews.a a(jq<btl> $$0, eyn $$1) {
         this.a.add(new ews.b($$0, $$1));
         return this;
      }

      @Override
      public evu b() {
         return new ews(this.g(), this.a.build());
      }
   }

   static record b(jq<btl> b, eyn c) {
      public static final Codec<ews.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(btl.a.fieldOf("type").forGetter(ews.b::a), eyo.a.fieldOf("duration").forGetter(ews.b::b)).apply($$0, ews.b::new)
      );

      public jq<btl> a() {
         return this.b;
      }

      public eyn b() {
         return this.c;
      }
   }
}
