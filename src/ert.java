import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class ert extends esh {
   public static final MapCodec<ert> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  lq.e.s().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dtn::f).toList())
               )
            )
            .apply($$0, ert::new)
   );
   private final jj<dfh> b;
   private final Set<dtn<?>> c;

   ert(List<euf> $$0, jj<dfh> $$1, Set<dtn<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private ert(List<euf> $$0, jj<dfh> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public esj<ert> b() {
      return esk.D;
   }

   @Override
   public Set<etn<?>> a() {
      return ImmutableSet.of(etq.g);
   }

   @Override
   protected cuc a(cuc $$0, equ $$1) {
      dsk $$2 = $$1.c(etq.g);
      if ($$2 != null) {
         $$0.a(kn.ab, cwm.a, $$1x -> {
            for (dtn<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static ert.a a(dfh $$0) {
      return new ert.a($$0);
   }

   public static class a extends esh.a<ert.a> {
      private final jj<dfh> a;
      private final Builder<dtn<?>> b = ImmutableSet.builder();

      a(dfh $$0) {
         this.a = $$0.s();
      }

      public ert.a a(dtn<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected ert.a a() {
         return this;
      }

      @Override
      public esi b() {
         return new ert(this.g(), this.a, this.b.build());
      }
   }
}
