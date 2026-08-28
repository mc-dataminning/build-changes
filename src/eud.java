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

public class eud extends ete {
   private static final Codec<List<eud.b>> b = eud.b.a.listOf().validate($$0 -> {
      Set<jm<brx>> $$1 = new ObjectOpenHashSet();

      for (eud.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   });
   public static final MapCodec<eud> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(b.optionalFieldOf("effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, eud::new)
   );
   private final List<eud.b> c;

   eud(List<evc> $$0, List<eud.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public etg<eud> b() {
      return eth.r;
   }

   @Override
   public Set<euk<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cuq a(cuq $$0, err $$1) {
      if ($$0.a(cut.vX) && !this.c.isEmpty()) {
         eud.b $$2 = ad.a(this.c, $$1.b());
         jm<brx> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         cxw.a $$5 = new cxw.a($$3, $$4);
         $$0.a(kq.H, cxw.a, $$5, cxw::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static eud.a c() {
      return new eud.a();
   }

   public static class a extends ete.a<eud.a> {
      private final Builder<eud.b> a = ImmutableList.builder();

      protected eud.a a() {
         return this;
      }

      public eud.a a(jm<brx> $$0, evy $$1) {
         this.a.add(new eud.b($$0, $$1));
         return this;
      }

      @Override
      public etf b() {
         return new eud(this.g(), this.a.build());
      }
   }

   static record b(jm<brx> b, evy c) {
      public static final Codec<eud.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(brx.a.fieldOf("type").forGetter(eud.b::a), evz.a.fieldOf("duration").forGetter(eud.b::b)).apply($$0, eud.b::new)
      );

      public jm<brx> a() {
         return this.b;
      }

      public evy b() {
         return this.c;
      }
   }
}
