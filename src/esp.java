import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class esp extends esb {
   public static final MapCodec<esp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.unboundedMap(czj.b, euw.a).optionalFieldOf("enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, esp::new)
   );
   private final Map<jj<czj>, euv> b;
   private final boolean c;

   esp(List<etz> $$0, Map<jj<czj>, euv> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public esd<esp> b() {
      return ese.i;
   }

   @Override
   public Set<eth<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cua a(cua $$0, eqo $$1) {
      if ($$0.a(cud.qP)) {
         $$0 = $$0.a(cud.uw, $$0.H());
         $$0.b(kn.y, $$0.c(kn.k));
      }

      czl.a($$0, $$1x -> {
         if (this.c) {
            this.b.forEach(($$2, $$3) -> $$1x.a((jj<czj>)$$2, aye.a($$1x.a((jj<czj>)$$2) + $$3.a($$1), 0, 255)));
         } else {
            this.b.forEach(($$2, $$3) -> $$1x.a((jj<czj>)$$2, aye.a($$3.a($$1), 0, 255)));
         }
      });
      return $$0;
   }

   public static class a extends esb.a<esp.a> {
      private final Builder<jj<czj>, euv> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected esp.a a() {
         return this;
      }

      public esp.a a(jj<czj> $$0, euv $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public esc b() {
         return new esp(this.g(), this.a.build(), this.b);
      }
   }
}
