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

public class fdf extends fcg {
   private static final Codec<List<fdf.b>> b = fdf.b.a.listOf().validate($$0 -> {
      Set<jg<bwg>> $$1 = new ObjectOpenHashSet();

      for (fdf.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   });
   public static final MapCodec<fdf> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(b.optionalFieldOf("effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, fdf::new)
   );
   private final List<fdf.b> c;

   fdf(List<fec> $$0, List<fdf.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public fci<fdf> b() {
      return fcj.r;
   }

   @Override
   public Set<bbk<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public dak a(dak $$0, fat $$1) {
      if ($$0.a(dao.xh) && !this.c.isEmpty()) {
         fdf.b $$2 = ag.a(this.c, $$1.b());
         jg<bwg> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         ddm.a $$5 = new ddm.a($$3, $$4);
         $$0.a(kl.T, ddm.a, $$5, ddm::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static fdf.a c() {
      return new fdf.a();
   }

   public static class a extends fcg.a<fdf.a> {
      private final Builder<fdf.b> a = ImmutableList.builder();

      protected fdf.a a() {
         return this;
      }

      public fdf.a a(jg<bwg> $$0, fey $$1) {
         this.a.add(new fdf.b($$0, $$1));
         return this;
      }

      @Override
      public fch b() {
         return new fdf(this.g(), this.a.build());
      }
   }

   static record b(jg<bwg> b, fey c) {
      public static final Codec<fdf.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bwg.a.fieldOf("type").forGetter(fdf.b::a), fez.a.fieldOf("duration").forGetter(fdf.b::b)).apply($$0, fdf.b::new)
      );

      public jg<bwg> a() {
         return this.b;
      }

      public fey b() {
         return this.c;
      }
   }
}
