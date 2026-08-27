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

public class eqs extends epw {
   private static final Codec<List<eqs.b>> b = axh.b(eqs.b.a.listOf(), (Function<List<eqs.b>, DataResult<List<eqs.b>>>)($$0 -> {
      Set<iw<bqr>> $$1 = new ObjectOpenHashSet();

      for (eqs.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   }));
   public static final Codec<eqs> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(axh.a(b, "effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, eqs::new)
   );
   private final List<eqs.b> c;

   eqs(List<erq> $$0, List<eqs.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public epy b() {
      return epz.q;
   }

   @Override
   public Set<eqz<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public csz a(csz $$0, eol $$1) {
      if ($$0.a(ctc.vU) && !this.c.isEmpty()) {
         eqs.b $$2 = ac.a(this.c, $$1.b());
         iw<bqr> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         cwb.a $$5 = new cwb.a($$3, $$4);
         $$0.a(ka.F, cwb.a, $$5, cwb::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static eqs.a c() {
      return new eqs.a();
   }

   public static class a extends epw.a<eqs.a> {
      private final Builder<eqs.b> a = ImmutableList.builder();

      protected eqs.a a() {
         return this;
      }

      public eqs.a a(iw<bqr> $$0, esl $$1) {
         this.a.add(new eqs.b($$0, $$1));
         return this;
      }

      @Override
      public epx b() {
         return new eqs(this.g(), this.a.build());
      }
   }

   static record b(iw<bqr> b, esl c) {
      public static final Codec<eqs.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ld.d.r().fieldOf("type").forGetter(eqs.b::a), esm.a.fieldOf("duration").forGetter(eqs.b::b)).apply($$0, eqs.b::new)
      );

      public iw<bqr> a() {
         return this.b;
      }

      public esl b() {
         return this.c;
      }
   }
}
