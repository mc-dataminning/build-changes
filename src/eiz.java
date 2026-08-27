import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class eiz extends eih {
   private static final Codec<List<eiz.b>> b = atv.a(eiz.b.a.listOf(), (Function<List<eiz.b>, DataResult<List<eiz.b>>>)($$0 -> {
      Set<ih<blf>> $$1 = new ObjectOpenHashSet();

      for (eiz.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   }));
   public static final Codec<eiz> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(atv.a(b, "effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, eiz::new)
   );
   private final List<eiz.b> c;

   eiz(List<eju> $$0, List<eiz.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public eij b() {
      return eik.n;
   }

   @Override
   public Set<ejd<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cmx a(cmx $$0, egv $$1) {
      if ($$0.a(cna.vN) && !this.c.isEmpty()) {
         eiz.b $$2 = ac.a(this.c, $$1.b());
         blf $$3 = $$2.a().a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a()) {
            $$4 *= 20;
         }

         coh.b($$0, List.of(new deq.a($$3, $$4)));
         return $$0;
      } else {
         return $$0;
      }
   }

   public static eiz.a c() {
      return new eiz.a();
   }

   public static class a extends eih.a<eiz.a> {
      private final Builder<eiz.b> a = ImmutableList.builder();

      protected eiz.a a() {
         return this;
      }

      public eiz.a a(blf $$0, ekp $$1) {
         this.a.add(new eiz.b($$0.j(), $$1));
         return this;
      }

      @Override
      public eii b() {
         return new eiz(this.g(), this.a.build());
      }
   }

   static record b(ih<blf> b, ekp c) {
      public static final Codec<eiz.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kd.d.r().fieldOf("type").forGetter(eiz.b::a), ekq.a.fieldOf("duration").forGetter(eiz.b::b)).apply($$0, eiz.b::new)
      );

      public ih<blf> a() {
         return this.b;
      }

      public ekp b() {
         return this.c;
      }
   }
}
