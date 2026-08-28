import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class fbu extends fbg {
   public static final MapCodec<fbu> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.unboundedMap(dga.c, fdz.a).optionalFieldOf("enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, fbu::new)
   );
   private final Map<jf<dga>, fdy> b;
   private final boolean c;

   fbu(List<fdc> $$0, Map<jf<dga>, fdy> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public fbi<fbu> b() {
      return fbj.i;
   }

   @Override
   public Set<bax<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public czn a(czn $$0, ezt $$1) {
      if ($$0.a(czr.rF)) {
         $$0 = $$0.a((djl)czr.vG);
      }

      dgc.a($$0, $$1x -> {
         if (this.c) {
            this.b.forEach(($$2, $$3) -> $$1x.a((jf<dga>)$$2, azm.a($$1x.a((jf<dga>)$$2) + $$3.a($$1), 0, 255)));
         } else {
            this.b.forEach(($$2, $$3) -> $$1x.a((jf<dga>)$$2, azm.a($$3.a($$1), 0, 255)));
         }
      });
      return $$0;
   }

   public static class a extends fbg.a<fbu.a> {
      private final Builder<jf<dga>, fdy> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected fbu.a a() {
         return this;
      }

      public fbu.a a(jf<dga> $$0, fdy $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public fbh b() {
         return new fbu(this.g(), this.a.build(), this.b);
      }
   }
}
