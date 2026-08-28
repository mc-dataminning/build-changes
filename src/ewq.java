import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class ewq extends exe {
   public static final MapCodec<ewq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  mb.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dxz::f).toList())
               )
            )
            .apply($$0, ewq::new)
   );
   private final jr<djm> b;
   private final Set<dxz<?>> c;

   ewq(List<eza> $$0, jr<djm> $$1, Set<dxz<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private ewq(List<eza> $$0, jr<djm> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public exg<ewq> b() {
      return exh.D;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(eyl.g);
   }

   @Override
   protected cwp a(cwp $$0, evr $$1) {
      dwx $$2 = $$1.c(eyl.g);
      if ($$2 != null) {
         $$0.a(kv.am, cyr.a, $$1x -> {
            for (dxz<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static ewq.a a(djm $$0) {
      return new ewq.a($$0);
   }

   public static class a extends exe.a<ewq.a> {
      private final jr<djm> a;
      private final Builder<dxz<?>> b = ImmutableSet.builder();

      a(djm $$0) {
         this.a = $$0.p();
      }

      public ewq.a a(dxz<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected ewq.a a() {
         return this;
      }

      @Override
      public exf b() {
         return new ewq(this.g(), this.a, this.b.build());
      }
   }
}
