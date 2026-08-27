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

public class eel extends edt {
   private static final Codec<List<eel.b>> b = aqy.a(eel.b.a.listOf(), (Function<List<eel.b>, DataResult<List<eel.b>>>)($$0 -> {
      Set<he<bht>> $$1 = new ObjectOpenHashSet();

      for (eel.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   }));
   public static final Codec<eel> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(aqy.a(b, "effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, eel::new)
   );
   private final List<eel.b> c;

   eel(List<efg> $$0, List<eel.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public edv b() {
      return edw.n;
   }

   @Override
   public Set<eep<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public ciy a(ciy $$0, ech $$1) {
      if ($$0.a(cjb.va) && !this.c.isEmpty()) {
         eel.b $$2 = ac.a(this.c, $$1.b());
         bht $$3 = $$2.a().a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a()) {
            $$4 *= 20;
         }

         cki.b($$0, List.of(new dap.a($$3, $$4)));
         return $$0;
      } else {
         return $$0;
      }
   }

   public static eel.a c() {
      return new eel.a();
   }

   public static class a extends edt.a<eel.a> {
      private final Builder<eel.b> a = ImmutableList.builder();

      protected eel.a a() {
         return this;
      }

      public eel.a a(bht $$0, egb $$1) {
         this.a.add(new eel.b($$0.j(), $$1));
         return this;
      }

      @Override
      public edu b() {
         return new eel(this.g(), this.a.build());
      }
   }

   static record b(he<bht> b, egb c) {
      public static final Codec<eel.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(jb.e.r().fieldOf("type").forGetter(eel.b::a), egc.a.fieldOf("duration").forGetter(eel.b::b)).apply($$0, eel.b::new)
      );

      public he<bht> a() {
         return this.b;
      }

      public egb b() {
         return this.c;
      }
   }
}
