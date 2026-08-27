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

public class eit extends eib {
   private static final Codec<List<eit.b>> b = atq.a(eit.b.a.listOf(), (Function<List<eit.b>, DataResult<List<eit.b>>>)($$0 -> {
      Set<ih<bla>> $$1 = new ObjectOpenHashSet();

      for (eit.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   }));
   public static final Codec<eit> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(atq.a(b, "effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, eit::new)
   );
   private final List<eit.b> c;

   eit(List<ejo> $$0, List<eit.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public eid b() {
      return eie.n;
   }

   @Override
   public Set<eix<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cmr a(cmr $$0, egp $$1) {
      if ($$0.a(cmu.vN) && !this.c.isEmpty()) {
         eit.b $$2 = ac.a(this.c, $$1.b());
         bla $$3 = $$2.a().a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a()) {
            $$4 *= 20;
         }

         cob.b($$0, List.of(new dek.a($$3, $$4)));
         return $$0;
      } else {
         return $$0;
      }
   }

   public static eit.a c() {
      return new eit.a();
   }

   public static class a extends eib.a<eit.a> {
      private final Builder<eit.b> a = ImmutableList.builder();

      protected eit.a a() {
         return this;
      }

      public eit.a a(bla $$0, ekj $$1) {
         this.a.add(new eit.b($$0.j(), $$1));
         return this;
      }

      @Override
      public eic b() {
         return new eit(this.g(), this.a.build());
      }
   }

   static record b(ih<bla> b, ekj c) {
      public static final Codec<eit.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kd.d.r().fieldOf("type").forGetter(eit.b::a), ekk.a.fieldOf("duration").forGetter(eit.b::b)).apply($$0, eit.b::new)
      );

      public ih<bla> a() {
         return this.b;
      }

      public ekj b() {
         return this.c;
      }
   }
}
