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

public class esv extends erv {
   private static final Codec<List<esv.b>> b = esv.b.a.listOf().validate($$0 -> {
      Set<ji<bsb>> $$1 = new ObjectOpenHashSet();

      for (esv.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   });
   public static final MapCodec<esv> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(b.optionalFieldOf("effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, esv::new)
   );
   private final List<esv.b> c;

   esv(List<ett> $$0, List<esv.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public erx<esv> b() {
      return ery.r;
   }

   @Override
   public Set<etc<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cuq a(cuq $$0, eqj $$1) {
      if ($$0.a(cut.vU) && !this.c.isEmpty()) {
         esv.b $$2 = ac.a(this.c, $$1.b());
         ji<bsb> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         cxu.a $$5 = new cxu.a($$3, $$4);
         $$0.a(km.H, cxu.a, $$5, cxu::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static esv.a c() {
      return new esv.a();
   }

   public static class a extends erv.a<esv.a> {
      private final Builder<esv.b> a = ImmutableList.builder();

      protected esv.a a() {
         return this;
      }

      public esv.a a(ji<bsb> $$0, euo $$1) {
         this.a.add(new esv.b($$0, $$1));
         return this;
      }

      @Override
      public erw b() {
         return new esv(this.g(), this.a.build());
      }
   }

   static record b(ji<bsb> b, euo c) {
      public static final Codec<esv.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(lp.d.r().fieldOf("type").forGetter(esv.b::a), eup.a.fieldOf("duration").forGetter(esv.b::b)).apply($$0, esv.b::new)
      );

      public ji<bsb> a() {
         return this.b;
      }

      public euo b() {
         return this.c;
      }
   }
}
