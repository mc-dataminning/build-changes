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

public class eeu extends eec {
   private static final Codec<List<eeu.b>> b = arg.a(eeu.b.a.listOf(), (Function<List<eeu.b>, DataResult<List<eeu.b>>>)($$0 -> {
      Set<hg<bib>> $$1 = new ObjectOpenHashSet();

      for (eeu.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   }));
   public static final Codec<eeu> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(arg.a(b, "effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, eeu::new)
   );
   private final List<eeu.b> c;

   eeu(List<efp> $$0, List<eeu.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public eee b() {
      return eef.n;
   }

   @Override
   public Set<eey<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cjf a(cjf $$0, ecq $$1) {
      if ($$0.a(cji.va) && !this.c.isEmpty()) {
         eeu.b $$2 = ac.a(this.c, $$1.b());
         bib $$3 = $$2.a().a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a()) {
            $$4 *= 20;
         }

         ckp.b($$0, List.of(new day.a($$3, $$4)));
         return $$0;
      } else {
         return $$0;
      }
   }

   public static eeu.a c() {
      return new eeu.a();
   }

   public static class a extends eec.a<eeu.a> {
      private final Builder<eeu.b> a = ImmutableList.builder();

      protected eeu.a a() {
         return this;
      }

      public eeu.a a(bib $$0, egk $$1) {
         this.a.add(new eeu.b($$0.j(), $$1));
         return this;
      }

      @Override
      public eed b() {
         return new eeu(this.g(), this.a.build());
      }
   }

   static record b(hg<bib> b, egk c) {
      public static final Codec<eeu.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(jd.e.r().fieldOf("type").forGetter(eeu.b::a), egl.a.fieldOf("duration").forGetter(eeu.b::b)).apply($$0, eeu.b::new)
      );

      public hg<bib> a() {
         return this.b;
      }

      public egk b() {
         return this.c;
      }
   }
}
