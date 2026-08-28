import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class fbs extends fcg {
   public static final MapCodec<fbs> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  mh.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(ect::f).toList())
               )
            )
            .apply($$0, fbs::new)
   );
   private final jg<dno> b;
   private final Set<ect<?>> c;

   fbs(List<fec> $$0, jg<dno> $$1, Set<ect<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private fbs(List<fec> $$0, jg<dno> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public fci<fbs> b() {
      return fcj.D;
   }

   @Override
   public Set<bbk<?>> a() {
      return Set.of(fdn.g);
   }

   @Override
   protected dak a(dak $$0, fat $$1) {
      ebq $$2 = $$1.c(fdn.g);
      if ($$2 != null) {
         $$0.a(kl.aq, dck.a, $$1x -> {
            for (ect<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static fbs.a a(dno $$0) {
      return new fbs.a($$0);
   }

   public static class a extends fcg.a<fbs.a> {
      private final jg<dno> a;
      private final Builder<ect<?>> b = ImmutableSet.builder();

      a(dno $$0) {
         this.a = $$0.p();
      }

      public fbs.a a(ect<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected fbs.a a() {
         return this;
      }

      @Override
      public fch b() {
         return new fbs(this.g(), this.a, this.b.build());
      }
   }
}
