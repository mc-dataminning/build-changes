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

public class eub extends etc {
   private static final Codec<List<eub.b>> b = eub.b.a.listOf().validate($$0 -> {
      Set<jm<brx>> $$1 = new ObjectOpenHashSet();

      for (eub.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   });
   public static final MapCodec<eub> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(b.optionalFieldOf("effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, eub::new)
   );
   private final List<eub.b> c;

   eub(List<eva> $$0, List<eub.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public ete<eub> b() {
      return etf.r;
   }

   @Override
   public Set<eui<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cuq a(cuq $$0, erp $$1) {
      if ($$0.a(cut.vX) && !this.c.isEmpty()) {
         eub.b $$2 = ad.a(this.c, $$1.b());
         jm<brx> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         cxw.a $$5 = new cxw.a($$3, $$4);
         $$0.a(kq.H, cxw.a, $$5, cxw::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static eub.a c() {
      return new eub.a();
   }

   public static class a extends etc.a<eub.a> {
      private final Builder<eub.b> a = ImmutableList.builder();

      protected eub.a a() {
         return this;
      }

      public eub.a a(jm<brx> $$0, evw $$1) {
         this.a.add(new eub.b($$0, $$1));
         return this;
      }

      @Override
      public etd b() {
         return new eub(this.g(), this.a.build());
      }
   }

   static record b(jm<brx> b, evw c) {
      public static final Codec<eub.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(brx.a.fieldOf("type").forGetter(eub.b::a), evx.a.fieldOf("duration").forGetter(eub.b::b)).apply($$0, eub.b::new)
      );

      public jm<brx> a() {
         return this.b;
      }

      public evw b() {
         return this.c;
      }
   }
}
