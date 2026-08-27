import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class ela extends elk {
   public static final Codec<ela> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  kh.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dnh::f).toList())
               )
            )
            .apply($$0, ela::new)
   );
   private final il<czf> b;
   private final Set<dnh<?>> c;

   ela(List<emx> $$0, il<czf> $$1, Set<dnh<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private ela(List<emx> $$0, il<czf> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().n()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public elm b() {
      return eln.x;
   }

   @Override
   public Set<emg<?>> a() {
      return ImmutableSet.of(emj.g);
   }

   @Override
   protected cpq a(cpq $$0, ejy $$1) {
      dme $$2 = $$1.c(emj.g);
      if ($$2 != null) {
         sy $$3 = $$0.x();
         sy $$4;
         if ($$3.b("BlockStateTag", 10)) {
            $$4 = $$3.p("BlockStateTag");
         } else {
            $$4 = new sy();
            $$3.a("BlockStateTag", $$4);
         }

         for (dnh<?> $$6 : this.c) {
            if ($$2.b($$6)) {
               $$4.a($$6.f(), a($$2, $$6));
            }
         }
      }

      return $$0;
   }

   public static ela.a a(czf $$0) {
      return new ela.a($$0);
   }

   private static <T extends Comparable<T>> String a(dme $$0, dnh<T> $$1) {
      T $$2 = $$0.c($$1);
      return $$1.a($$2);
   }

   public static class a extends elk.a<ela.a> {
      private final il<czf> a;
      private final Builder<dnh<?>> b = ImmutableSet.builder();

      a(czf $$0) {
         this.a = $$0.r();
      }

      public ela.a a(dnh<?> $$0) {
         if (!this.a.a().n().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected ela.a a() {
         return this;
      }

      @Override
      public ell b() {
         return new ela(this.g(), this.a, this.b.build());
      }
   }
}
