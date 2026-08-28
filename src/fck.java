import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class fck extends fbw {
   public static final MapCodec<fck> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.unboundedMap(dgn.c, fep.a).optionalFieldOf("enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, fck::new)
   );
   private final Map<jg<dgn>, feo> b;
   private final boolean c;

   fck(List<fds> $$0, Map<jg<dgn>, feo> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public fby<fck> b() {
      return fbz.i;
   }

   @Override
   public Set<bbb<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public daa a(daa $$0, faj $$1) {
      if ($$0.a(dae.rF)) {
         $$0 = $$0.a((djy)dae.vG);
      }

      dgp.a($$0, $$1x -> {
         if (this.c) {
            this.b.forEach(($$2, $$3) -> $$1x.a((jg<dgn>)$$2, azq.a($$1x.a((jg<dgn>)$$2) + $$3.a($$1), 0, 255)));
         } else {
            this.b.forEach(($$2, $$3) -> $$1x.a((jg<dgn>)$$2, azq.a($$3.a($$1), 0, 255)));
         }
      });
      return $$0;
   }

   public static class a extends fbw.a<fck.a> {
      private final Builder<jg<dgn>, feo> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected fck.a a() {
         return this;
      }

      public fck.a a(jg<dgn> $$0, feo $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public fbx b() {
         return new fck(this.g(), this.a.build(), this.b);
      }
   }
}
