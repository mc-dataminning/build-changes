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

public class fcv extends fbw {
   private static final Codec<List<fcv.b>> b = fcv.b.a.listOf().validate($$0 -> {
      Set<jg<bvx>> $$1 = new ObjectOpenHashSet();

      for (fcv.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   });
   public static final MapCodec<fcv> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(b.optionalFieldOf("effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, fcv::new)
   );
   private final List<fcv.b> c;

   fcv(List<fds> $$0, List<fcv.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public fby<fcv> b() {
      return fbz.r;
   }

   @Override
   public Set<bbb<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public daa a(daa $$0, faj $$1) {
      if ($$0.a(dae.xh) && !this.c.isEmpty()) {
         fcv.b $$2 = ag.a(this.c, $$1.b());
         jg<bvx> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         ddc.a $$5 = new ddc.a($$3, $$4);
         $$0.a(kl.T, ddc.a, $$5, ddc::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static fcv.a c() {
      return new fcv.a();
   }

   public static class a extends fbw.a<fcv.a> {
      private final Builder<fcv.b> a = ImmutableList.builder();

      protected fcv.a a() {
         return this;
      }

      public fcv.a a(jg<bvx> $$0, feo $$1) {
         this.a.add(new fcv.b($$0, $$1));
         return this;
      }

      @Override
      public fbx b() {
         return new fcv(this.g(), this.a.build());
      }
   }

   static record b(jg<bvx> b, feo c) {
      public static final Codec<fcv.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bvx.a.fieldOf("type").forGetter(fcv.b::a), fep.a.fieldOf("duration").forGetter(fcv.b::b)).apply($$0, fcv.b::new)
      );

      public jg<bvx> a() {
         return this.b;
      }

      public feo b() {
         return this.c;
      }
   }
}
