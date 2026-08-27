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

public class eeo extends edw {
   private static final Codec<List<eeo.b>> b = arj.a(eeo.b.a.listOf(), (Function<List<eeo.b>, DataResult<List<eeo.b>>>)($$0 -> {
      Set<he<bih>> $$1 = new ObjectOpenHashSet();

      for (eeo.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   }));
   public static final Codec<eeo> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(arj.a(b, "effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, eeo::new)
   );
   private final List<eeo.b> c;

   eeo(List<efj> $$0, List<eeo.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public edy b() {
      return edz.n;
   }

   @Override
   public Set<ees<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cjl a(cjl $$0, eck $$1) {
      if ($$0.a(cjo.va) && !this.c.isEmpty()) {
         eeo.b $$2 = ac.a(this.c, $$1.b());
         bih $$3 = $$2.a().a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a()) {
            $$4 *= 20;
         }

         ckv.b($$0, List.of(new dbc.a($$3, $$4)));
         return $$0;
      } else {
         return $$0;
      }
   }

   public static eeo.a c() {
      return new eeo.a();
   }

   public static class a extends edw.a<eeo.a> {
      private final Builder<eeo.b> a = ImmutableList.builder();

      protected eeo.a a() {
         return this;
      }

      public eeo.a a(bih $$0, ege $$1) {
         this.a.add(new eeo.b($$0.j(), $$1));
         return this;
      }

      @Override
      public edx b() {
         return new eeo(this.g(), this.a.build());
      }
   }

   static record b(he<bih> b, ege c) {
      public static final Codec<eeo.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(jb.e.r().fieldOf("type").forGetter(eeo.b::a), egf.a.fieldOf("duration").forGetter(eeo.b::b)).apply($$0, eeo.b::new)
      );

      public he<bih> a() {
         return this.b;
      }

      public ege b() {
         return this.c;
      }
   }
}
