import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class ewp extends exd {
   public static final MapCodec<ewp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  mb.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dxy::f).toList())
               )
            )
            .apply($$0, ewp::new)
   );
   private final jr<djl> b;
   private final Set<dxy<?>> c;

   ewp(List<eyz> $$0, jr<djl> $$1, Set<dxy<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private ewp(List<eyz> $$0, jr<djl> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public exf<ewp> b() {
      return exg.D;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(eyk.g);
   }

   @Override
   protected cwo a(cwo $$0, evq $$1) {
      dww $$2 = $$1.c(eyk.g);
      if ($$2 != null) {
         $$0.a(kv.am, cyq.a, $$1x -> {
            for (dxy<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static ewp.a a(djl $$0) {
      return new ewp.a($$0);
   }

   public static class a extends exd.a<ewp.a> {
      private final jr<djl> a;
      private final Builder<dxy<?>> b = ImmutableSet.builder();

      a(djl $$0) {
         this.a = $$0.p();
      }

      public ewp.a a(dxy<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected ewp.a a() {
         return this;
      }

      @Override
      public exe b() {
         return new ewp(this.g(), this.a, this.b.build());
      }
   }
}
