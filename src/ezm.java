import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ezm extends eyy {
   public static final MapCodec<ezm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.unboundedMap(deh.c, fbr.a).optionalFieldOf("enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, ezm::new)
   );
   private final Map<js<deh>, fbq> b;
   private final boolean c;

   ezm(List<fau> $$0, Map<js<deh>, fbq> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public eza<ezm> b() {
      return ezb.i;
   }

   @Override
   public Set<bat<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cxy a(cxy $$0, exl $$1) {
      if ($$0.a(cyc.rA)) {
         $$0 = $$0.a((dho)cyc.vz);
      }

      dej.a($$0, $$1x -> {
         if (this.c) {
            this.b.forEach(($$2, $$3) -> $$1x.a((js<deh>)$$2, azk.a($$1x.a((js<deh>)$$2) + $$3.a($$1), 0, 255)));
         } else {
            this.b.forEach(($$2, $$3) -> $$1x.a((js<deh>)$$2, azk.a($$3.a($$1), 0, 255)));
         }
      });
      return $$0;
   }

   public static class a extends eyy.a<ezm.a> {
      private final Builder<js<deh>, fbq> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected ezm.a a() {
         return this;
      }

      public ezm.a a(js<deh> $$0, fbq $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public eyz b() {
         return new ezm(this.g(), this.a.build(), this.b);
      }
   }
}
