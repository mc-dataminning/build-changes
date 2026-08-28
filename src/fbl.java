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

public class fbl extends fam {
   private static final Codec<List<fbl.b>> b = fbl.b.a.listOf().validate($$0 -> {
      Set<je<bvf>> $$1 = new ObjectOpenHashSet();

      for (fbl.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   });
   public static final MapCodec<fbl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(b.optionalFieldOf("effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, fbl::new)
   );
   private final List<fbl.b> c;

   fbl(List<fci> $$0, List<fbl.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public fao<fbl> b() {
      return fap.r;
   }

   @Override
   public Set<bax<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cyy a(cyy $$0, eyz $$1) {
      if ($$0.a(czc.xc) && !this.c.isEmpty()) {
         fbl.b $$2 = af.a(this.c, $$1.b());
         je<bvf> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         dca.a $$5 = new dca.a($$3, $$4);
         $$0.a(kj.T, dca.a, $$5, dca::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static fbl.a c() {
      return new fbl.a();
   }

   public static class a extends fam.a<fbl.a> {
      private final Builder<fbl.b> a = ImmutableList.builder();

      protected fbl.a a() {
         return this;
      }

      public fbl.a a(je<bvf> $$0, fde $$1) {
         this.a.add(new fbl.b($$0, $$1));
         return this;
      }

      @Override
      public fan b() {
         return new fbl(this.g(), this.a.build());
      }
   }

   static record b(je<bvf> b, fde c) {
      public static final Codec<fbl.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bvf.a.fieldOf("type").forGetter(fbl.b::a), fdf.a.fieldOf("duration").forGetter(fbl.b::b)).apply($$0, fbl.b::new)
      );

      public je<bvf> a() {
         return this.b;
      }

      public fde b() {
         return this.c;
      }
   }
}
