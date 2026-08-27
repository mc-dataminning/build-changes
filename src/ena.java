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

public class ena extends emi {
   private static final Codec<List<ena.b>> b = awe.b(ena.b.a.listOf(), (Function<List<ena.b>, DataResult<List<ena.b>>>)($$0 -> {
      Set<il<boi>> $$1 = new ObjectOpenHashSet();

      for (ena.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   }));
   public static final Codec<ena> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(awe.a(b, "effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, ena::new)
   );
   private final List<ena.b> c;

   ena(List<env> $$0, List<ena.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public emk b() {
      return eml.n;
   }

   @Override
   public Set<ene<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cqm a(cqm $$0, ekw $$1) {
      if ($$0.a(cqp.vS) && !this.c.isEmpty()) {
         ena.b $$2 = ac.a(this.c, $$1.b());
         il<boi> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         crw.b($$0, List.of(new did.a($$3, $$4)));
         return $$0;
      } else {
         return $$0;
      }
   }

   public static ena.a c() {
      return new ena.a();
   }

   public static class a extends emi.a<ena.a> {
      private final Builder<ena.b> a = ImmutableList.builder();

      protected ena.a a() {
         return this;
      }

      public ena.a a(il<boi> $$0, eoq $$1) {
         this.a.add(new ena.b($$0, $$1));
         return this;
      }

      @Override
      public emj b() {
         return new ena(this.g(), this.a.build());
      }
   }

   static record b(il<boi> b, eoq c) {
      public static final Codec<ena.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ki.d.r().fieldOf("type").forGetter(ena.b::a), eor.a.fieldOf("duration").forGetter(ena.b::b)).apply($$0, ena.b::new)
      );

      public il<boi> a() {
         return this.b;
      }

      public eoq b() {
         return this.c;
      }
   }
}
