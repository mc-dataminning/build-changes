import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class eod extends eoo {
   public static final Codec<eod> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  kr.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dqc::f).toList())
               )
            )
            .apply($$0, eod::new)
   );
   private final il<dby> b;
   private final Set<dqc<?>> c;

   eod(List<eqc> $$0, il<dby> $$1, Set<dqc<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private eod(List<eqc> $$0, il<dby> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public eoq b() {
      return eor.y;
   }

   @Override
   public Set<epl<?>> a() {
      return ImmutableSet.of(epo.g);
   }

   @Override
   protected crj a(crj $$0, enb $$1) {
      doz $$2 = $$1.c(epo.g);
      if ($$2 != null) {
         $$0.a(jp.R, ctq.a, $$1x -> {
            for (dqc<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static eod.a a(dby $$0) {
      return new eod.a($$0);
   }

   public static class a extends eoo.a<eod.a> {
      private final il<dby> a;
      private final Builder<dqc<?>> b = ImmutableSet.builder();

      a(dby $$0) {
         this.a = $$0.r();
      }

      public eod.a a(dqc<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected eod.a a() {
         return this;
      }

      @Override
      public eop b() {
         return new eod(this.g(), this.a, this.b.build());
      }
   }
}
