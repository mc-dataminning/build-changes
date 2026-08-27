import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class ege extends ego {
   public static final Codec<ege> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  kc.f.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(diq::f).toList())
               )
            )
            .apply($$0, ege::new)
   );
   private final ig<cvf> b;
   private final Set<diq<?>> c;

   ege(List<eib> $$0, ig<cvf> $$1, Set<diq<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private ege(List<eib> $$0, ig<cvf> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().n()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public egq b() {
      return egr.x;
   }

   @Override
   public Set<ehk<?>> a() {
      return ImmutableSet.of(ehn.g);
   }

   @Override
   protected clo a(clo $$0, efc $$1) {
      dhn $$2 = $$1.c(ehn.g);
      if ($$2 != null) {
         sd $$3 = $$0.w();
         sd $$4;
         if ($$3.b("BlockStateTag", 10)) {
            $$4 = $$3.p("BlockStateTag");
         } else {
            $$4 = new sd();
            $$3.a("BlockStateTag", $$4);
         }

         for (diq<?> $$6 : this.c) {
            if ($$2.b($$6)) {
               $$4.a($$6.f(), a($$2, $$6));
            }
         }
      }

      return $$0;
   }

   public static ege.a a(cvf $$0) {
      return new ege.a($$0);
   }

   private static <T extends Comparable<T>> String a(dhn $$0, diq<T> $$1) {
      T $$2 = $$0.c($$1);
      return $$1.a($$2);
   }

   public static class a extends ego.a<ege.a> {
      private final ig<cvf> a;
      private final Builder<diq<?>> b = ImmutableSet.builder();

      a(cvf $$0) {
         this.a = $$0.r();
      }

      public ege.a a(diq<?> $$0) {
         if (!this.a.a().n().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected ege.a a() {
         return this;
      }

      @Override
      public egp b() {
         return new ege(this.g(), this.a, this.b.build());
      }
   }
}
