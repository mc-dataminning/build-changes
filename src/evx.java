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

public class evx extends euy {
   private static final Codec<List<evx.b>> b = evx.b.a.listOf().validate($$0 -> {
      Set<jo<bsw>> $$1 = new ObjectOpenHashSet();

      for (evx.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   });
   public static final MapCodec<evx> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(b.optionalFieldOf("effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, evx::new)
   );
   private final List<evx.b> c;

   evx(List<eww> $$0, List<evx.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public eva<evx> b() {
      return evb.r;
   }

   @Override
   public Set<ewe<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cvs a(cvs $$0, etl $$1) {
      if ($$0.a(cvw.vY) && !this.c.isEmpty()) {
         evx.b $$2 = ad.a(this.c, $$1.b());
         jo<bsw> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         cyx.a $$5 = new cyx.a($$3, $$4);
         $$0.a(ks.M, cyx.a, $$5, cyx::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static evx.a c() {
      return new evx.a();
   }

   public static class a extends euy.a<evx.a> {
      private final Builder<evx.b> a = ImmutableList.builder();

      protected evx.a a() {
         return this;
      }

      public evx.a a(jo<bsw> $$0, exs $$1) {
         this.a.add(new evx.b($$0, $$1));
         return this;
      }

      @Override
      public euz b() {
         return new evx(this.g(), this.a.build());
      }
   }

   static record b(jo<bsw> b, exs c) {
      public static final Codec<evx.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bsw.a.fieldOf("type").forGetter(evx.b::a), ext.a.fieldOf("duration").forGetter(evx.b::b)).apply($$0, evx.b::new)
      );

      public jo<bsw> a() {
         return this.b;
      }

      public exs b() {
         return this.c;
      }
   }
}
