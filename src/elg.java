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

public class elg extends eko {
   private static final Codec<List<elg.b>> b = avq.a(elg.b.a.listOf(), (Function<List<elg.b>, DataResult<List<elg.b>>>)($$0 -> {
      Set<ij<bnb>> $$1 = new ObjectOpenHashSet();

      for (elg.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   }));
   public static final Codec<elg> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(avq.a(b, "effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, elg::new)
   );
   private final List<elg.b> c;

   elg(List<emb> $$0, List<elg.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public ekq b() {
      return ekr.n;
   }

   @Override
   public Set<elk<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cpd a(cpd $$0, ejc $$1) {
      if ($$0.a(cpg.vQ) && !this.c.isEmpty()) {
         elg.b $$2 = ac.a(this.c, $$1.b());
         ij<bnb> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         cqn.b($$0, List.of(new dgt.a($$3, $$4)));
         return $$0;
      } else {
         return $$0;
      }
   }

   public static elg.a c() {
      return new elg.a();
   }

   public static class a extends eko.a<elg.a> {
      private final Builder<elg.b> a = ImmutableList.builder();

      protected elg.a a() {
         return this;
      }

      public elg.a a(ij<bnb> $$0, emw $$1) {
         this.a.add(new elg.b($$0, $$1));
         return this;
      }

      @Override
      public ekp b() {
         return new elg(this.g(), this.a.build());
      }
   }

   static record b(ij<bnb> b, emw c) {
      public static final Codec<elg.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kf.d.r().fieldOf("type").forGetter(elg.b::a), emx.a.fieldOf("duration").forGetter(elg.b::b)).apply($$0, elg.b::new)
      );

      public ij<bnb> a() {
         return this.b;
      }

      public emw b() {
         return this.c;
      }
   }
}
