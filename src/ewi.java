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

public class ewi extends evj {
   private static final Codec<List<ewi.b>> b = ewi.b.a.listOf().validate($$0 -> {
      Set<jp<btc>> $$1 = new ObjectOpenHashSet();

      for (ewi.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   });
   public static final MapCodec<ewi> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(b.optionalFieldOf("effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, ewi::new)
   );
   private final List<ewi.b> c;

   ewi(List<exh> $$0, List<ewi.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public evl<ewi> b() {
      return evm.r;
   }

   @Override
   public Set<ewp<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cvx a(cvx $$0, etw $$1) {
      if ($$0.a(cwb.vY) && !this.c.isEmpty()) {
         ewi.b $$2 = ad.a(this.c, $$1.b());
         jp<btc> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         cyw.a $$5 = new cyw.a($$3, $$4);
         $$0.a(kt.Q, cyw.a, $$5, cyw::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static ewi.a c() {
      return new ewi.a();
   }

   public static class a extends evj.a<ewi.a> {
      private final Builder<ewi.b> a = ImmutableList.builder();

      protected ewi.a a() {
         return this;
      }

      public ewi.a a(jp<btc> $$0, eyd $$1) {
         this.a.add(new ewi.b($$0, $$1));
         return this;
      }

      @Override
      public evk b() {
         return new ewi(this.g(), this.a.build());
      }
   }

   static record b(jp<btc> b, eyd c) {
      public static final Codec<ewi.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(btc.a.fieldOf("type").forGetter(ewi.b::a), eye.a.fieldOf("duration").forGetter(ewi.b::b)).apply($$0, ewi.b::new)
      );

      public jp<btc> a() {
         return this.b;
      }

      public eyd b() {
         return this.c;
      }
   }
}
