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

public class etw extends eta {
   private static final Codec<List<etw.b>> b = axu.b(etw.b.a.listOf(), (Function<List<etw.b>, DataResult<List<etw.b>>>)($$0 -> {
      Set<ja<brf>> $$1 = new ObjectOpenHashSet();

      for (etw.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   }));
   public static final Codec<etw> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(axu.a(b, "effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, etw::new)
   );
   private final List<etw.b> c;

   etw(List<euu> $$0, List<etw.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public etc b() {
      return etd.q;
   }

   @Override
   public Set<eud<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cuh a(cuh $$0, erp $$1) {
      if ($$0.a(cuk.xF) && !this.c.isEmpty()) {
         etw.b $$2 = ad.a(this.c, $$1.b());
         ja<brf> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         cxv.a $$5 = new cxv.a($$3, $$4);
         $$0.a(ke.F, cxv.a, $$5, cxv::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static etw.a c() {
      return new etw.a();
   }

   public static class a extends eta.a<etw.a> {
      private final Builder<etw.b> a = ImmutableList.builder();

      protected etw.a a() {
         return this;
      }

      public etw.a a(ja<brf> $$0, evq $$1) {
         this.a.add(new etw.b($$0, $$1));
         return this;
      }

      @Override
      public etb b() {
         return new etw(this.g(), this.a.build());
      }
   }

   static record b(ja<brf> b, evq c) {
      public static final Codec<etw.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(lh.d.r().fieldOf("type").forGetter(etw.b::a), evr.a.fieldOf("duration").forGetter(etw.b::b)).apply($$0, etw.b::new)
      );

      public ja<brf> a() {
         return this.b;
      }

      public evq b() {
         return this.c;
      }
   }
}
