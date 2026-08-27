import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class eke extends eko {
   public static final Codec<eke> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  kf.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dmm::f).toList())
               )
            )
            .apply($$0, eke::new)
   );
   private final ij<cys> b;
   private final Set<dmm<?>> c;

   eke(List<emb> $$0, ij<cys> $$1, Set<dmm<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private eke(List<emb> $$0, ij<cys> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().n()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public ekq b() {
      return ekr.x;
   }

   @Override
   public Set<elk<?>> a() {
      return ImmutableSet.of(eln.g);
   }

   @Override
   protected cpd a(cpd $$0, ejc $$1) {
      dlj $$2 = $$1.c(eln.g);
      if ($$2 != null) {
         sw $$3 = $$0.x();
         sw $$4;
         if ($$3.b("BlockStateTag", 10)) {
            $$4 = $$3.p("BlockStateTag");
         } else {
            $$4 = new sw();
            $$3.a("BlockStateTag", $$4);
         }

         for (dmm<?> $$6 : this.c) {
            if ($$2.b($$6)) {
               $$4.a($$6.f(), a($$2, $$6));
            }
         }
      }

      return $$0;
   }

   public static eke.a a(cys $$0) {
      return new eke.a($$0);
   }

   private static <T extends Comparable<T>> String a(dlj $$0, dmm<T> $$1) {
      T $$2 = $$0.c($$1);
      return $$1.a($$2);
   }

   public static class a extends eko.a<eke.a> {
      private final ij<cys> a;
      private final Builder<dmm<?>> b = ImmutableSet.builder();

      a(cys $$0) {
         this.a = $$0.r();
      }

      public eke.a a(dmm<?> $$0) {
         if (!this.a.a().n().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected eke.a a() {
         return this;
      }

      @Override
      public ekp b() {
         return new eke(this.g(), this.a, this.b.build());
      }
   }
}
