import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ewd extends evp {
   public static final MapCodec<ewd> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.unboundedMap(dbs.c, eyk.a).optionalFieldOf("enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, ewd::new)
   );
   private final Map<jq<dbs>, eyj> b;
   private final boolean c;

   ewd(List<exn> $$0, Map<jq<dbs>, eyj> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public evr<ewd> b() {
      return evs.i;
   }

   @Override
   public Set<ewv<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cwb a(cwb $$0, euc $$1) {
      if ($$0.a(cwf.qQ)) {
         $$0 = $$0.a((dfa)cwf.uy);
      }

      dbu.a($$0, $$1x -> {
         if (this.c) {
            this.b.forEach(($$2, $$3) -> $$1x.a((jq<dbs>)$$2, azk.a($$1x.a((jq<dbs>)$$2) + $$3.a($$1), 0, 255)));
         } else {
            this.b.forEach(($$2, $$3) -> $$1x.a((jq<dbs>)$$2, azk.a($$3.a($$1), 0, 255)));
         }
      });
      return $$0;
   }

   public static class a extends evp.a<ewd.a> {
      private final Builder<jq<dbs>, eyj> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected ewd.a a() {
         return this;
      }

      public ewd.a a(jq<dbs> $$0, eyj $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public evq b() {
         return new ewd(this.g(), this.a.build(), this.b);
      }
   }
}
