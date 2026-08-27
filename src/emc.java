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

public class emc extends elk {
   private static final Codec<List<emc.b>> b = avu.a(emc.b.a.listOf(), (Function<List<emc.b>, DataResult<List<emc.b>>>)($$0 -> {
      Set<il<bnq>> $$1 = new ObjectOpenHashSet();

      for (emc.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   }));
   public static final Codec<emc> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(avu.a(b, "effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, emc::new)
   );
   private final List<emc.b> c;

   emc(List<emx> $$0, List<emc.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public elm b() {
      return eln.n;
   }

   @Override
   public Set<emg<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cpq a(cpq $$0, ejy $$1) {
      if ($$0.a(cpt.vQ) && !this.c.isEmpty()) {
         emc.b $$2 = ac.a(this.c, $$1.b());
         il<bnq> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         cra.b($$0, List.of(new dhg.a($$3, $$4)));
         return $$0;
      } else {
         return $$0;
      }
   }

   public static emc.a c() {
      return new emc.a();
   }

   public static class a extends elk.a<emc.a> {
      private final Builder<emc.b> a = ImmutableList.builder();

      protected emc.a a() {
         return this;
      }

      public emc.a a(il<bnq> $$0, ens $$1) {
         this.a.add(new emc.b($$0, $$1));
         return this;
      }

      @Override
      public ell b() {
         return new emc(this.g(), this.a.build());
      }
   }

   static record b(il<bnq> b, ens c) {
      public static final Codec<emc.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kh.d.r().fieldOf("type").forGetter(emc.b::a), ent.a.fieldOf("duration").forGetter(emc.b::b)).apply($$0, emc.b::new)
      );

      public il<bnq> a() {
         return this.b;
      }

      public ens b() {
         return this.c;
      }
   }
}
