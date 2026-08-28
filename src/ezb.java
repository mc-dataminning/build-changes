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

public class ezb extends eyc {
   private static final Codec<List<ezb.b>> b = ezb.b.a.listOf().validate($$0 -> {
      Set<jq<bun>> $$1 = new ObjectOpenHashSet();

      for (ezb.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   });
   public static final MapCodec<ezb> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(b.optionalFieldOf("effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, ezb::new)
   );
   private final List<ezb.b> c;

   ezb(List<ezy> $$0, List<ezb.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public eye<ezb> b() {
      return eyf.r;
   }

   @Override
   public Set<bbn<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cxp a(cxp $$0, ewp $$1) {
      if ($$0.a(cxt.wM) && !this.c.isEmpty()) {
         ezb.b $$2 = ae.a(this.c, $$1.b());
         jq<bun> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         daq.a $$5 = new daq.a($$3, $$4);
         $$0.a(ku.R, daq.a, $$5, daq::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static ezb.a c() {
      return new ezb.a();
   }

   public static class a extends eyc.a<ezb.a> {
      private final Builder<ezb.b> a = ImmutableList.builder();

      protected ezb.a a() {
         return this;
      }

      public ezb.a a(jq<bun> $$0, fau $$1) {
         this.a.add(new ezb.b($$0, $$1));
         return this;
      }

      @Override
      public eyd b() {
         return new ezb(this.g(), this.a.build());
      }
   }

   static record b(jq<bun> b, fau c) {
      public static final Codec<ezb.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bun.a.fieldOf("type").forGetter(ezb.b::a), fav.a.fieldOf("duration").forGetter(ezb.b::b)).apply($$0, ezb.b::new)
      );

      public jq<bun> a() {
         return this.b;
      }

      public fau b() {
         return this.c;
      }
   }
}
