import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class epk extends epw {
   public static final Codec<epk> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ld.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(drk::f).toList())
               )
            )
            .apply($$0, epk::new)
   );
   private final iw<dde> b;
   private final Set<drk<?>> c;

   epk(List<erq> $$0, iw<dde> $$1, Set<drk<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private epk(List<erq> $$0, iw<dde> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public epy b() {
      return epz.A;
   }

   @Override
   public Set<eqz<?>> a() {
      return ImmutableSet.of(erc.g);
   }

   @Override
   protected csz a(csz $$0, eol $$1) {
      dqh $$2 = $$1.c(erc.g);
      if ($$2 != null) {
         $$0.a(ka.Y, cvi.a, $$1x -> {
            for (drk<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static epk.a a(dde $$0) {
      return new epk.a($$0);
   }

   public static class a extends epw.a<epk.a> {
      private final iw<dde> a;
      private final Builder<drk<?>> b = ImmutableSet.builder();

      a(dde $$0) {
         this.a = $$0.r();
      }

      public epk.a a(drk<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected epk.a a() {
         return this;
      }

      @Override
      public epx b() {
         return new epk(this.g(), this.a, this.b.build());
      }
   }
}
