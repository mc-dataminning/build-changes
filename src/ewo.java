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

public class ewo extends evp {
   private static final Codec<List<ewo.b>> b = ewo.b.a.listOf().validate($$0 -> {
      Set<jq<bth>> $$1 = new ObjectOpenHashSet();

      for (ewo.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   });
   public static final MapCodec<ewo> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(b.optionalFieldOf("effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, ewo::new)
   );
   private final List<ewo.b> c;

   ewo(List<exn> $$0, List<ewo.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public evr<ewo> b() {
      return evs.r;
   }

   @Override
   public Set<ewv<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cwb a(cwb $$0, euc $$1) {
      if ($$0.a(cwf.vY) && !this.c.isEmpty()) {
         ewo.b $$2 = ae.a(this.c, $$1.b());
         jq<bth> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         czc.a $$5 = new czc.a($$3, $$4);
         $$0.a(ku.R, czc.a, $$5, czc::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static ewo.a c() {
      return new ewo.a();
   }

   public static class a extends evp.a<ewo.a> {
      private final Builder<ewo.b> a = ImmutableList.builder();

      protected ewo.a a() {
         return this;
      }

      public ewo.a a(jq<bth> $$0, eyj $$1) {
         this.a.add(new ewo.b($$0, $$1));
         return this;
      }

      @Override
      public evq b() {
         return new ewo(this.g(), this.a.build());
      }
   }

   static record b(jq<bth> b, eyj c) {
      public static final Codec<ewo.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bth.a.fieldOf("type").forGetter(ewo.b::a), eyk.a.fieldOf("duration").forGetter(ewo.b::b)).apply($$0, ewo.b::new)
      );

      public jq<bth> a() {
         return this.b;
      }

      public eyj b() {
         return this.c;
      }
   }
}
