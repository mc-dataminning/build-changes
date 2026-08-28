import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.List;
import java.util.Set;

public class faz extends faa {
   private static final Codec<List<faz.b>> b = faz.b.a.listOf().validate($$0 -> {
      Set<je<bvc>> $$1 = new ObjectOpenHashSet();

      for (faz.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   });
   public static final MapCodec<faz> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(b.optionalFieldOf("effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, faz::new)
   );
   private final List<faz.b> c;

   faz(List<fbw> $$0, List<faz.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public fac<faz> b() {
      return fad.r;
   }

   @Override
   public Set<bav<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cys a(cys $$0, eyn $$1) {
      if ($$0.a(cyw.xa) && !this.c.isEmpty()) {
         faz.b $$2 = af.a(this.c, $$1.b());
         je<bvc> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         dbu.a $$5 = new dbu.a($$3, $$4);
         $$0.a(kj.T, dbu.a, $$5, dbu::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static faz.a c() {
      return new faz.a();
   }

   public static class a extends faa.a<faz.a> {
      private final Builder<faz.b> a = ImmutableList.builder();

      protected faz.a a() {
         return this;
      }

      public faz.a a(je<bvc> $$0, fcs $$1) {
         this.a.add(new faz.b($$0, $$1));
         return this;
      }

      @Override
      public fab b() {
         return new faz(this.g(), this.a.build());
      }
   }

   static record b(je<bvc> b, fcs c) {
      public static final Codec<faz.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bvc.a.fieldOf("type").forGetter(faz.b::a), fct.a.fieldOf("duration").forGetter(faz.b::b)).apply($$0, faz.b::new)
      );

      public je<bvc> a() {
         return this.b;
      }

      public fcs b() {
         return this.c;
      }
   }
}
