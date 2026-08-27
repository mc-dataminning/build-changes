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

public class erp extends eqs {
   private static final Codec<List<erp.b>> b = erp.b.a.listOf().validate($$0 -> {
      Set<ix<brc>> $$1 = new ObjectOpenHashSet();

      for (erp.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   });
   public static final MapCodec<erp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(b.optionalFieldOf("effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, erp::new)
   );
   private final List<erp.b> c;

   erp(List<esn> $$0, List<erp.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public equ b() {
      return eqv.q;
   }

   @Override
   public Set<erw<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public ctq a(ctq $$0, eph $$1) {
      if ($$0.a(ctt.vU) && !this.c.isEmpty()) {
         erp.b $$2 = ac.a(this.c, $$1.b());
         ix<brc> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         cwu.a $$5 = new cwu.a($$3, $$4);
         $$0.a(kb.G, cwu.a, $$5, cwu::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static erp.a c() {
      return new erp.a();
   }

   public static class a extends eqs.a<erp.a> {
      private final Builder<erp.b> a = ImmutableList.builder();

      protected erp.a a() {
         return this;
      }

      public erp.a a(ix<brc> $$0, eti $$1) {
         this.a.add(new erp.b($$0, $$1));
         return this;
      }

      @Override
      public eqt b() {
         return new erp(this.g(), this.a.build());
      }
   }

   static record b(ix<brc> b, eti c) {
      public static final Codec<erp.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(le.d.r().fieldOf("type").forGetter(erp.b::a), etj.a.fieldOf("duration").forGetter(erp.b::b)).apply($$0, erp.b::new)
      );

      public ix<brc> a() {
         return this.b;
      }

      public eti b() {
         return this.c;
      }
   }
}
