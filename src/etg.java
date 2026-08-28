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

public class etg extends esh {
   private static final Codec<List<etg.b>> b = etg.b.a.listOf().validate($$0 -> {
      Set<jj<brm>> $$1 = new ObjectOpenHashSet();

      for (etg.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   });
   public static final MapCodec<etg> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(b.optionalFieldOf("effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, etg::new)
   );
   private final List<etg.b> c;

   etg(List<euf> $$0, List<etg.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public esj<etg> b() {
      return esk.r;
   }

   @Override
   public Set<etn<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cuc a(cuc $$0, equ $$1) {
      if ($$0.a(cuf.vX) && !this.c.isEmpty()) {
         etg.b $$2 = ac.a(this.c, $$1.b());
         jj<brm> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         cxf.a $$5 = new cxf.a($$3, $$4);
         $$0.a(kn.H, cxf.a, $$5, cxf::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static etg.a c() {
      return new etg.a();
   }

   public static class a extends esh.a<etg.a> {
      private final Builder<etg.b> a = ImmutableList.builder();

      protected etg.a a() {
         return this;
      }

      public etg.a a(jj<brm> $$0, evb $$1) {
         this.a.add(new etg.b($$0, $$1));
         return this;
      }

      @Override
      public esi b() {
         return new etg(this.g(), this.a.build());
      }
   }

   static record b(jj<brm> b, evb c) {
      public static final Codec<etg.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(lq.d.s().fieldOf("type").forGetter(etg.b::a), evc.a.fieldOf("duration").forGetter(etg.b::b)).apply($$0, etg.b::new)
      );

      public jj<brm> a() {
         return this.b;
      }

      public evb b() {
         return this.c;
      }
   }
}
