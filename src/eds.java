import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class eds extends eec {
   public static final Codec<eds> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  jd.f.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dgm::f).toList())
               )
            )
            .apply($$0, eds::new)
   );
   private final hg<csv> b;
   private final Set<dgm<?>> c;

   eds(List<efp> $$0, hg<csv> $$1, Set<dgm<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private eds(List<efp> $$0, hg<csv> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public eee b() {
      return eef.x;
   }

   @Override
   public Set<eey<?>> a() {
      return ImmutableSet.of(efb.g);
   }

   @Override
   protected cjf a(cjf $$0, ecq $$1) {
      dfj $$2 = $$1.c(efb.g);
      if ($$2 != null) {
         qx $$3 = $$0.w();
         qx $$4;
         if ($$3.b("BlockStateTag", 10)) {
            $$4 = $$3.p("BlockStateTag");
         } else {
            $$4 = new qx();
            $$3.a("BlockStateTag", $$4);
         }

         for (dgm<?> $$6 : this.c) {
            if ($$2.b($$6)) {
               $$4.a($$6.f(), a($$2, $$6));
            }
         }
      }

      return $$0;
   }

   public static eds.a a(csv $$0) {
      return new eds.a($$0);
   }

   private static <T extends Comparable<T>> String a(dfj $$0, dgm<T> $$1) {
      T $$2 = $$0.c($$1);
      return $$1.a($$2);
   }

   public static class a extends eec.a<eds.a> {
      private final hg<csv> a;
      private final Builder<dgm<?>> b = ImmutableSet.builder();

      a(csv $$0) {
         this.a = $$0.q();
      }

      public eds.a a(dgm<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected eds.a a() {
         return this;
      }

      @Override
      public eed b() {
         return new eds(this.g(), this.a, this.b.build());
      }
   }
}
