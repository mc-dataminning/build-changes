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

public class emy extends emg {
   private static final Codec<List<emy.b>> b = awe.b(emy.b.a.listOf(), (Function<List<emy.b>, DataResult<List<emy.b>>>)($$0 -> {
      Set<il<boh>> $$1 = new ObjectOpenHashSet();

      for (emy.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   }));
   public static final Codec<emy> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(awe.a(b, "effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, emy::new)
   );
   private final List<emy.b> c;

   emy(List<ent> $$0, List<emy.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public emi b() {
      return emj.n;
   }

   @Override
   public Set<enc<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cqk a(cqk $$0, eku $$1) {
      if ($$0.a(cqn.vR) && !this.c.isEmpty()) {
         emy.b $$2 = ac.a(this.c, $$1.b());
         il<boh> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         cru.b($$0, List.of(new dib.a($$3, $$4)));
         return $$0;
      } else {
         return $$0;
      }
   }

   public static emy.a c() {
      return new emy.a();
   }

   public static class a extends emg.a<emy.a> {
      private final Builder<emy.b> a = ImmutableList.builder();

      protected emy.a a() {
         return this;
      }

      public emy.a a(il<boh> $$0, eoo $$1) {
         this.a.add(new emy.b($$0, $$1));
         return this;
      }

      @Override
      public emh b() {
         return new emy(this.g(), this.a.build());
      }
   }

   static record b(il<boh> b, eoo c) {
      public static final Codec<emy.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ki.d.r().fieldOf("type").forGetter(emy.b::a), eop.a.fieldOf("duration").forGetter(emy.b::b)).apply($$0, emy.b::new)
      );

      public il<boh> a() {
         return this.b;
      }

      public eoo b() {
         return this.c;
      }
   }
}
