import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class eom extends eox {
   public static final Codec<eom> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  kt.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dql::f).toList())
               )
            )
            .apply($$0, eom::new)
   );
   private final in<dch> b;
   private final Set<dql<?>> c;

   eom(List<eql> $$0, in<dch> $$1, Set<dql<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private eom(List<eql> $$0, in<dch> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public eoz b() {
      return epa.y;
   }

   @Override
   public Set<epu<?>> a() {
      return ImmutableSet.of(epx.g);
   }

   @Override
   protected crs a(crs $$0, enk $$1) {
      dpi $$2 = $$1.c(epx.g);
      if ($$2 != null) {
         $$0.a(jr.R, ctz.a, $$1x -> {
            for (dql<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static eom.a a(dch $$0) {
      return new eom.a($$0);
   }

   public static class a extends eox.a<eom.a> {
      private final in<dch> a;
      private final Builder<dql<?>> b = ImmutableSet.builder();

      a(dch $$0) {
         this.a = $$0.r();
      }

      public eom.a a(dql<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected eom.a a() {
         return this;
      }

      @Override
      public eoy b() {
         return new eom(this.g(), this.a, this.b.build());
      }
   }
}
