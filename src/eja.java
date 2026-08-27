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

public class eja extends eii {
   private static final Codec<List<eja.b>> b = atw.a(eja.b.a.listOf(), (Function<List<eja.b>, DataResult<List<eja.b>>>)($$0 -> {
      Set<ih<blg>> $$1 = new ObjectOpenHashSet();

      for (eja.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   }));
   public static final Codec<eja> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(atw.a(b, "effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, eja::new)
   );
   private final List<eja.b> c;

   eja(List<ejv> $$0, List<eja.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public eik b() {
      return eil.n;
   }

   @Override
   public Set<eje<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cmy a(cmy $$0, egw $$1) {
      if ($$0.a(cnb.vN) && !this.c.isEmpty()) {
         eja.b $$2 = ac.a(this.c, $$1.b());
         blg $$3 = $$2.a().a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a()) {
            $$4 *= 20;
         }

         coi.b($$0, List.of(new der.a($$3, $$4)));
         return $$0;
      } else {
         return $$0;
      }
   }

   public static eja.a c() {
      return new eja.a();
   }

   public static class a extends eii.a<eja.a> {
      private final Builder<eja.b> a = ImmutableList.builder();

      protected eja.a a() {
         return this;
      }

      public eja.a a(blg $$0, ekq $$1) {
         this.a.add(new eja.b($$0.j(), $$1));
         return this;
      }

      @Override
      public eij b() {
         return new eja(this.g(), this.a.build());
      }
   }

   static record b(ih<blg> b, ekq c) {
      public static final Codec<eja.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kd.d.r().fieldOf("type").forGetter(eja.b::a), ekr.a.fieldOf("duration").forGetter(eja.b::b)).apply($$0, eja.b::new)
      );

      public ih<blg> a() {
         return this.b;
      }

      public ekq b() {
         return this.c;
      }
   }
}
