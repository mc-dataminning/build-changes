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

public class ewz extends ewa {
   private static final Codec<List<ewz.b>> b = ewz.b.a.listOf().validate($$0 -> {
      Set<jq<bto>> $$1 = new ObjectOpenHashSet();

      for (ewz.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   });
   public static final MapCodec<ewz> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(b.optionalFieldOf("effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, ewz::new)
   );
   private final List<ewz.b> c;

   ewz(List<exy> $$0, List<ewz.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public ewc<ewz> b() {
      return ewd.r;
   }

   @Override
   public Set<exg<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cwm a(cwm $$0, eun $$1) {
      if ($$0.a(cwq.wo) && !this.c.isEmpty()) {
         ewz.b $$2 = ae.a(this.c, $$1.b());
         jq<bto> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         czn.a $$5 = new czn.a($$3, $$4);
         $$0.a(ku.R, czn.a, $$5, czn::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static ewz.a c() {
      return new ewz.a();
   }

   public static class a extends ewa.a<ewz.a> {
      private final Builder<ewz.b> a = ImmutableList.builder();

      protected ewz.a a() {
         return this;
      }

      public ewz.a a(jq<bto> $$0, eyu $$1) {
         this.a.add(new ewz.b($$0, $$1));
         return this;
      }

      @Override
      public ewb b() {
         return new ewz(this.g(), this.a.build());
      }
   }

   static record b(jq<bto> b, eyu c) {
      public static final Codec<ewz.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bto.a.fieldOf("type").forGetter(ewz.b::a), eyv.a.fieldOf("duration").forGetter(ewz.b::b)).apply($$0, ewz.b::new)
      );

      public jq<bto> a() {
         return this.b;
      }

      public eyu b() {
         return this.c;
      }
   }
}
