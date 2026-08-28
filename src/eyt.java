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

public class eyt extends exu {
   private static final Codec<List<eyt.b>> b = eyt.b.a.listOf().validate($$0 -> {
      Set<jq<bui>> $$1 = new ObjectOpenHashSet();

      for (eyt.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   });
   public static final MapCodec<eyt> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(b.optionalFieldOf("effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, eyt::new)
   );
   private final List<eyt.b> c;

   eyt(List<ezs> $$0, List<eyt.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public exw<eyt> b() {
      return exx.r;
   }

   @Override
   public Set<eza<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cxk a(cxk $$0, ewh $$1) {
      if ($$0.a(cxo.wM) && !this.c.isEmpty()) {
         eyt.b $$2 = ae.a(this.c, $$1.b());
         jq<bui> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         dal.a $$5 = new dal.a($$3, $$4);
         $$0.a(ku.R, dal.a, $$5, dal::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static eyt.a c() {
      return new eyt.a();
   }

   public static class a extends exu.a<eyt.a> {
      private final Builder<eyt.b> a = ImmutableList.builder();

      protected eyt.a a() {
         return this;
      }

      public eyt.a a(jq<bui> $$0, fao $$1) {
         this.a.add(new eyt.b($$0, $$1));
         return this;
      }

      @Override
      public exv b() {
         return new eyt(this.g(), this.a.build());
      }
   }

   static record b(jq<bui> b, fao c) {
      public static final Codec<eyt.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bui.a.fieldOf("type").forGetter(eyt.b::a), fap.a.fieldOf("duration").forGetter(eyt.b::b)).apply($$0, eyt.b::new)
      );

      public jq<bui> a() {
         return this.b;
      }

      public fao b() {
         return this.c;
      }
   }
}
