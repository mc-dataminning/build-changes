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

public class egp extends efx {
   private static final Codec<List<egp.b>> b = asq.a(egp.b.a.listOf(), (Function<List<egp.b>, DataResult<List<egp.b>>>)($$0 -> {
      Set<ib<bjt>> $$1 = new ObjectOpenHashSet();

      for (egp.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   }));
   public static final Codec<egp> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(asq.a(b, "effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, egp::new)
   );
   private final List<egp.b> c;

   egp(List<ehk> $$0, List<egp.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public efz b() {
      return ega.n;
   }

   @Override
   public Set<egt<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public clb a(clb $$0, eel $$1) {
      if ($$0.a(cle.vb) && !this.c.isEmpty()) {
         egp.b $$2 = ac.a(this.c, $$1.b());
         bjt $$3 = $$2.a().a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a()) {
            $$4 *= 20;
         }

         cml.b($$0, List.of(new dcu.a($$3, $$4)));
         return $$0;
      } else {
         return $$0;
      }
   }

   public static egp.a c() {
      return new egp.a();
   }

   public static class a extends efx.a<egp.a> {
      private final Builder<egp.b> a = ImmutableList.builder();

      protected egp.a a() {
         return this;
      }

      public egp.a a(bjt $$0, eif $$1) {
         this.a.add(new egp.b($$0.j(), $$1));
         return this;
      }

      @Override
      public efy b() {
         return new egp(this.g(), this.a.build());
      }
   }

   static record b(ib<bjt> b, eif c) {
      public static final Codec<egp.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(jy.e.r().fieldOf("type").forGetter(egp.b::a), eig.a.fieldOf("duration").forGetter(egp.b::b)).apply($$0, egp.b::new)
      );

      public ib<bjt> a() {
         return this.b;
      }

      public eif b() {
         return this.c;
      }
   }
}
