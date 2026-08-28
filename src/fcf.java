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

public class fcf extends fbg {
   private static final Codec<List<fcf.b>> b = fcf.b.a.listOf().validate($$0 -> {
      Set<jf<bvk>> $$1 = new ObjectOpenHashSet();

      for (fcf.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   });
   public static final MapCodec<fcf> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(b.optionalFieldOf("effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, fcf::new)
   );
   private final List<fcf.b> c;

   fcf(List<fdc> $$0, List<fcf.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public fbi<fcf> b() {
      return fbj.r;
   }

   @Override
   public Set<bax<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public czn a(czn $$0, ezt $$1) {
      if ($$0.a(czr.xh) && !this.c.isEmpty()) {
         fcf.b $$2 = ag.a(this.c, $$1.b());
         jf<bvk> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         dcp.a $$5 = new dcp.a($$3, $$4);
         $$0.a(kk.T, dcp.a, $$5, dcp::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static fcf.a c() {
      return new fcf.a();
   }

   public static class a extends fbg.a<fcf.a> {
      private final Builder<fcf.b> a = ImmutableList.builder();

      protected fcf.a a() {
         return this;
      }

      public fcf.a a(jf<bvk> $$0, fdy $$1) {
         this.a.add(new fcf.b($$0, $$1));
         return this;
      }

      @Override
      public fbh b() {
         return new fcf(this.g(), this.a.build());
      }
   }

   static record b(jf<bvk> b, fdy c) {
      public static final Codec<fcf.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bvk.a.fieldOf("type").forGetter(fcf.b::a), fdz.a.fieldOf("duration").forGetter(fcf.b::b)).apply($$0, fcf.b::new)
      );

      public jf<bvk> a() {
         return this.b;
      }

      public fdy b() {
         return this.c;
      }
   }
}
