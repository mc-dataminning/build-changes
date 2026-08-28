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

public class ess extends ers {
   private static final Codec<List<ess.b>> b = ess.b.a.listOf().validate($$0 -> {
      Set<ji<bry>> $$1 = new ObjectOpenHashSet();

      for (ess.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   });
   public static final MapCodec<ess> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(b.optionalFieldOf("effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, ess::new)
   );
   private final List<ess.b> c;

   ess(List<etq> $$0, List<ess.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public eru<ess> b() {
      return erv.r;
   }

   @Override
   public Set<esz<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cun a(cun $$0, eqg $$1) {
      if ($$0.a(cuq.vU) && !this.c.isEmpty()) {
         ess.b $$2 = ac.a(this.c, $$1.b());
         ji<bry> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         cxr.a $$5 = new cxr.a($$3, $$4);
         $$0.a(km.G, cxr.a, $$5, cxr::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static ess.a c() {
      return new ess.a();
   }

   public static class a extends ers.a<ess.a> {
      private final Builder<ess.b> a = ImmutableList.builder();

      protected ess.a a() {
         return this;
      }

      public ess.a a(ji<bry> $$0, eul $$1) {
         this.a.add(new ess.b($$0, $$1));
         return this;
      }

      @Override
      public ert b() {
         return new ess(this.g(), this.a.build());
      }
   }

   static record b(ji<bry> b, eul c) {
      public static final Codec<ess.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(lp.d.r().fieldOf("type").forGetter(ess.b::a), eum.a.fieldOf("duration").forGetter(ess.b::b)).apply($$0, ess.b::new)
      );

      public ji<bry> a() {
         return this.b;
      }

      public eul b() {
         return this.c;
      }
   }
}
