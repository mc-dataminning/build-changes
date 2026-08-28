import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class esx extends esj {
   public static final MapCodec<esx> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.unboundedMap(czm.c, eve.a).optionalFieldOf("enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, esx::new)
   );
   private final Map<jj<czm>, evd> b;
   private final boolean c;

   esx(List<euh> $$0, Map<jj<czm>, evd> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public esl<esx> b() {
      return esm.i;
   }

   @Override
   public Set<etp<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cud a(cud $$0, eqw $$1) {
      if ($$0.a(cug.qP)) {
         $$0 = $$0.a((dcf)cug.uw);
         $$0.b(kn.y, $$0.c(kn.k));
      }

      czo.a($$0, $$1x -> {
         if (this.c) {
            this.b.forEach(($$2, $$3) -> $$1x.a((jj<czm>)$$2, ayg.a($$1x.a((jj<czm>)$$2) + $$3.a($$1), 0, 255)));
         } else {
            this.b.forEach(($$2, $$3) -> $$1x.a((jj<czm>)$$2, ayg.a($$3.a($$1), 0, 255)));
         }
      });
      return $$0;
   }

   public static class a extends esj.a<esx.a> {
      private final Builder<jj<czm>, evd> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected esx.a a() {
         return this;
      }

      public esx.a a(jj<czm> $$0, evd $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public esk b() {
         return new esx(this.g(), this.a.build(), this.b);
      }
   }
}
