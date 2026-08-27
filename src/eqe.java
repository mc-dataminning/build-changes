import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class eqe extends eqq {
   public static final MapCodec<eqe> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  le.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dse::f).toList())
               )
            )
            .apply($$0, eqe::new)
   );
   private final ix<ddy> b;
   private final Set<dse<?>> c;

   eqe(List<esl> $$0, ix<ddy> $$1, Set<dse<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private eqe(List<esl> $$0, ix<ddy> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().m()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public eqs b() {
      return eqt.A;
   }

   @Override
   public Set<eru<?>> a() {
      return ImmutableSet.of(erx.g);
   }

   @Override
   protected cto a(cto $$0, epf $$1) {
      drb $$2 = $$1.c(erx.g);
      if ($$2 != null) {
         $$0.a(kb.aa, cvz.a, $$1x -> {
            for (dse<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static eqe.a a(ddy $$0) {
      return new eqe.a($$0);
   }

   public static class a extends eqq.a<eqe.a> {
      private final ix<ddy> a;
      private final Builder<dse<?>> b = ImmutableSet.builder();

      a(ddy $$0) {
         this.a = $$0.r();
      }

      public eqe.a a(dse<?> $$0) {
         if (!this.a.a().m().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected eqe.a a() {
         return this;
      }

      @Override
      public eqr b() {
         return new eqe(this.g(), this.a, this.b.build());
      }
   }
}
