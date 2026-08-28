import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class fcu extends fcg {
   public static final MapCodec<fcu> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.unboundedMap(dgx.c, fez.a).optionalFieldOf("enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, fcu::new)
   );
   private final Map<jg<dgx>, fey> b;
   private final boolean c;

   fcu(List<fec> $$0, Map<jg<dgx>, fey> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public fci<fcu> b() {
      return fcj.i;
   }

   @Override
   public Set<bbk<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public dak a(dak $$0, fat $$1) {
      if ($$0.a(dao.rF)) {
         $$0 = $$0.a((dki)dao.vG);
      }

      dgz.a($$0, $$1x -> {
         if (this.c) {
            this.b.forEach(($$2, $$3) -> $$1x.a((jg<dgx>)$$2, azz.a($$1x.a((jg<dgx>)$$2) + $$3.a($$1), 0, 255)));
         } else {
            this.b.forEach(($$2, $$3) -> $$1x.a((jg<dgx>)$$2, azz.a($$3.a($$1), 0, 255)));
         }
      });
      return $$0;
   }

   public static class a extends fcg.a<fcu.a> {
      private final Builder<jg<dgx>, fey> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected fcu.a a() {
         return this;
      }

      public fcu.a a(jg<dgx> $$0, fey $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public fch b() {
         return new fcu(this.g(), this.a.build(), this.b);
      }
   }
}
