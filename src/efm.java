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

public class efm extends eeu {
   private static final Codec<List<efm.b>> b = asg.a(efm.b.a.listOf(), (Function<List<efm.b>, DataResult<List<efm.b>>>)($$0 -> {
      Set<ib<bje>> $$1 = new ObjectOpenHashSet();

      for (efm.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   }));
   public static final Codec<efm> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(asg.a(b, "effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, efm::new)
   );
   private final List<efm.b> c;

   efm(List<egh> $$0, List<efm.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public eew b() {
      return eex.n;
   }

   @Override
   public Set<efq<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public ckj a(ckj $$0, edi $$1) {
      if ($$0.a(ckm.va) && !this.c.isEmpty()) {
         efm.b $$2 = ac.a(this.c, $$1.b());
         bje $$3 = $$2.a().a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a()) {
            $$4 *= 20;
         }

         clt.b($$0, List.of(new dca.a($$3, $$4)));
         return $$0;
      } else {
         return $$0;
      }
   }

   public static efm.a c() {
      return new efm.a();
   }

   public static class a extends eeu.a<efm.a> {
      private final Builder<efm.b> a = ImmutableList.builder();

      protected efm.a a() {
         return this;
      }

      public efm.a a(bje $$0, ehc $$1) {
         this.a.add(new efm.b($$0.j(), $$1));
         return this;
      }

      @Override
      public eev b() {
         return new efm(this.g(), this.a.build());
      }
   }

   static record b(ib<bje> b, ehc c) {
      public static final Codec<efm.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(jy.e.r().fieldOf("type").forGetter(efm.b::a), ehd.a.fieldOf("duration").forGetter(efm.b::b)).apply($$0, efm.b::new)
      );

      public ib<bje> a() {
         return this.b;
      }

      public ehc b() {
         return this.c;
      }
   }
}
