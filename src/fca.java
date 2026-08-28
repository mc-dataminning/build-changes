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

public class fca extends fbb {
   private static final Codec<List<fca.b>> b = fca.b.a.listOf().validate($$0 -> {
      Set<jf<bvk>> $$1 = new ObjectOpenHashSet();

      for (fca.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   });
   public static final MapCodec<fca> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(b.optionalFieldOf("effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, fca::new)
   );
   private final List<fca.b> c;

   fca(List<fcx> $$0, List<fca.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public fbd<fca> b() {
      return fbe.r;
   }

   @Override
   public Set<bax<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public czk a(czk $$0, ezo $$1) {
      if ($$0.a(czo.xh) && !this.c.isEmpty()) {
         fca.b $$2 = ag.a(this.c, $$1.b());
         jf<bvk> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         dcm.a $$5 = new dcm.a($$3, $$4);
         $$0.a(kk.T, dcm.a, $$5, dcm::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static fca.a c() {
      return new fca.a();
   }

   public static class a extends fbb.a<fca.a> {
      private final Builder<fca.b> a = ImmutableList.builder();

      protected fca.a a() {
         return this;
      }

      public fca.a a(jf<bvk> $$0, fdt $$1) {
         this.a.add(new fca.b($$0, $$1));
         return this;
      }

      @Override
      public fbc b() {
         return new fca(this.g(), this.a.build());
      }
   }

   static record b(jf<bvk> b, fdt c) {
      public static final Codec<fca.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bvk.a.fieldOf("type").forGetter(fca.b::a), fdu.a.fieldOf("duration").forGetter(fca.b::b)).apply($$0, fca.b::new)
      );

      public jf<bvk> a() {
         return this.b;
      }

      public fdt b() {
         return this.c;
      }
   }
}
