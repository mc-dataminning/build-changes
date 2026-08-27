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

public class eep extends edx {
   private static final Codec<List<eep.b>> b = arb.a(eep.b.a.listOf(), (Function<List<eep.b>, DataResult<List<eep.b>>>)($$0 -> {
      Set<hg<bhw>> $$1 = new ObjectOpenHashSet();

      for (eep.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   }));
   public static final Codec<eep> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(arb.a(b, "effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, eep::new)
   );
   private final List<eep.b> c;

   eep(List<efk> $$0, List<eep.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public edz b() {
      return eea.n;
   }

   @Override
   public Set<eet<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cja a(cja $$0, ecl $$1) {
      if ($$0.a(cjd.va) && !this.c.isEmpty()) {
         eep.b $$2 = ac.a(this.c, $$1.b());
         bhw $$3 = $$2.a().a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a()) {
            $$4 *= 20;
         }

         ckk.b($$0, List.of(new dat.a($$3, $$4)));
         return $$0;
      } else {
         return $$0;
      }
   }

   public static eep.a c() {
      return new eep.a();
   }

   public static class a extends edx.a<eep.a> {
      private final Builder<eep.b> a = ImmutableList.builder();

      protected eep.a a() {
         return this;
      }

      public eep.a a(bhw $$0, egf $$1) {
         this.a.add(new eep.b($$0.j(), $$1));
         return this;
      }

      @Override
      public edy b() {
         return new eep(this.g(), this.a.build());
      }
   }

   static record b(hg<bhw> b, egf c) {
      public static final Codec<eep.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(jd.e.r().fieldOf("type").forGetter(eep.b::a), egg.a.fieldOf("duration").forGetter(eep.b::b)).apply($$0, eep.b::new)
      );

      public hg<bhw> a() {
         return this.b;
      }

      public egf b() {
         return this.c;
      }
   }
}
