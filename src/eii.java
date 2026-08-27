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

public class eii extends ehq {
   private static final Codec<List<eii.b>> b = atg.a(eii.b.a.listOf(), (Function<List<eii.b>, DataResult<List<eii.b>>>)($$0 -> {
      Set<ie<bkq>> $$1 = new ObjectOpenHashSet();

      for (eii.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   }));
   public static final Codec<eii> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(atg.a(b, "effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, eii::new)
   );
   private final List<eii.b> c;

   eii(List<ejd> $$0, List<eii.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public ehs b() {
      return eht.n;
   }

   @Override
   public Set<eim<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cmh a(cmh $$0, ege $$1) {
      if ($$0.a(cmk.vN) && !this.c.isEmpty()) {
         eii.b $$2 = ac.a(this.c, $$1.b());
         bkq $$3 = $$2.a().a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a()) {
            $$4 *= 20;
         }

         cnr.b($$0, List.of(new dea.a($$3, $$4)));
         return $$0;
      } else {
         return $$0;
      }
   }

   public static eii.a c() {
      return new eii.a();
   }

   public static class a extends ehq.a<eii.a> {
      private final Builder<eii.b> a = ImmutableList.builder();

      protected eii.a a() {
         return this;
      }

      public eii.a a(bkq $$0, ejy $$1) {
         this.a.add(new eii.b($$0.j(), $$1));
         return this;
      }

      @Override
      public ehr b() {
         return new eii(this.g(), this.a.build());
      }
   }

   static record b(ie<bkq> b, ejy c) {
      public static final Codec<eii.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kb.d.r().fieldOf("type").forGetter(eii.b::a), ejz.a.fieldOf("duration").forGetter(eii.b::b)).apply($$0, eii.b::new)
      );

      public ie<bkq> a() {
         return this.b;
      }

      public ejy b() {
         return this.c;
      }
   }
}
