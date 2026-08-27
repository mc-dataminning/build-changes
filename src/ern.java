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

public class ern extends eqq {
   private static final Codec<List<ern.b>> b = ern.b.a.listOf().validate($$0 -> {
      Set<ix<bra>> $$1 = new ObjectOpenHashSet();

      for (ern.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   });
   public static final MapCodec<ern> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(b.optionalFieldOf("effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, ern::new)
   );
   private final List<ern.b> c;

   ern(List<esl> $$0, List<ern.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public eqs b() {
      return eqt.q;
   }

   @Override
   public Set<eru<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cto a(cto $$0, epf $$1) {
      if ($$0.a(ctr.vU) && !this.c.isEmpty()) {
         ern.b $$2 = ac.a(this.c, $$1.b());
         ix<bra> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         cws.a $$5 = new cws.a($$3, $$4);
         $$0.a(kb.G, cws.a, $$5, cws::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static ern.a c() {
      return new ern.a();
   }

   public static class a extends eqq.a<ern.a> {
      private final Builder<ern.b> a = ImmutableList.builder();

      protected ern.a a() {
         return this;
      }

      public ern.a a(ix<bra> $$0, etg $$1) {
         this.a.add(new ern.b($$0, $$1));
         return this;
      }

      @Override
      public eqr b() {
         return new ern(this.g(), this.a.build());
      }
   }

   static record b(ix<bra> b, etg c) {
      public static final Codec<ern.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(le.d.r().fieldOf("type").forGetter(ern.b::a), eth.a.fieldOf("duration").forGetter(ern.b::b)).apply($$0, ern.b::new)
      );

      public ix<bra> a() {
         return this.b;
      }

      public etg b() {
         return this.c;
      }
   }
}
