import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class etm extends esy {
   public static final MapCodec<etm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.unboundedMap(daa.c, evt.a).optionalFieldOf("enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, etm::new)
   );
   private final Map<jm<daa>, evs> b;
   private final boolean c;

   etm(List<euw> $$0, Map<jm<daa>, evs> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public eta<etm> b() {
      return etb.i;
   }

   @Override
   public Set<eue<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cuo a(cuo $$0, erl $$1) {
      if ($$0.a(cur.qP)) {
         $$0 = $$0.a((dct)cur.uw);
         $$0.b(kq.y, $$0.c(kq.k));
      }

      dac.a($$0, $$1x -> {
         if (this.c) {
            this.b.forEach(($$2, $$3) -> $$1x.a((jm<daa>)$$2, ayn.a($$1x.a((jm<daa>)$$2) + $$3.a($$1), 0, 255)));
         } else {
            this.b.forEach(($$2, $$3) -> $$1x.a((jm<daa>)$$2, ayn.a($$3.a($$1), 0, 255)));
         }
      });
      return $$0;
   }

   public static class a extends esy.a<etm.a> {
      private final Builder<jm<daa>, evs> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected etm.a a() {
         return this;
      }

      public etm.a a(jm<daa> $$0, evs $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public esz b() {
         return new etm(this.g(), this.a.build(), this.b);
      }
   }
}
