import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class esv extends esh {
   public static final MapCodec<esv> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.unboundedMap(czl.b, evc.a).optionalFieldOf("enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, esv::new)
   );
   private final Map<jj<czl>, evb> b;
   private final boolean c;

   esv(List<euf> $$0, Map<jj<czl>, evb> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public esj<esv> b() {
      return esk.i;
   }

   @Override
   public Set<etn<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cuc a(cuc $$0, equ $$1) {
      if ($$0.a(cuf.qP)) {
         $$0 = $$0.a((dce)cuf.uw);
         $$0.b(kn.y, $$0.c(kn.k));
      }

      czn.a($$0, $$1x -> {
         if (this.c) {
            this.b.forEach(($$2, $$3) -> $$1x.a((jj<czl>)$$2, ayg.a($$1x.a((jj<czl>)$$2) + $$3.a($$1), 0, 255)));
         } else {
            this.b.forEach(($$2, $$3) -> $$1x.a((jj<czl>)$$2, ayg.a($$3.a($$1), 0, 255)));
         }
      });
      return $$0;
   }

   public static class a extends esh.a<esv.a> {
      private final Builder<jj<czl>, evb> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected esv.a a() {
         return this;
      }

      public esv.a a(jj<czl> $$0, evb $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public esi b() {
         return new esv(this.g(), this.a.build(), this.b);
      }
   }
}
