import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class eyq extends eyc {
   public static final MapCodec<eyq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.unboundedMap(ddz.c, fav.a).optionalFieldOf("enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, eyq::new)
   );
   private final Map<jq<ddz>, fau> b;
   private final boolean c;

   eyq(List<ezy> $$0, Map<jq<ddz>, fau> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public eye<eyq> b() {
      return eyf.i;
   }

   @Override
   public Set<bbn<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cxp a(cxp $$0, ewp $$1) {
      if ($$0.a(cxt.rn)) {
         $$0 = $$0.a((dhh)cxt.vm);
      }

      deb.a($$0, $$1x -> {
         if (this.c) {
            this.b.forEach(($$2, $$3) -> $$1x.a((jq<ddz>)$$2, bae.a($$1x.a((jq<ddz>)$$2) + $$3.a($$1), 0, 255)));
         } else {
            this.b.forEach(($$2, $$3) -> $$1x.a((jq<ddz>)$$2, bae.a($$3.a($$1), 0, 255)));
         }
      });
      return $$0;
   }

   public static class a extends eyc.a<eyq.a> {
      private final Builder<jq<ddz>, fau> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected eyq.a a() {
         return this;
      }

      public eyq.a a(jq<ddz> $$0, fau $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public eyd b() {
         return new eyq(this.g(), this.a.build(), this.b);
      }
   }
}
