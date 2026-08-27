import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class ely extends emi {
   public static final Codec<ely> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ki.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(doe::f).toList())
               )
            )
            .apply($$0, ely::new)
   );
   private final il<dac> b;
   private final Set<doe<?>> c;

   ely(List<env> $$0, il<dac> $$1, Set<doe<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private ely(List<env> $$0, il<dac> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().n()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public emk b() {
      return eml.x;
   }

   @Override
   public Set<ene<?>> a() {
      return ImmutableSet.of(enh.g);
   }

   @Override
   protected cqm a(cqm $$0, ekw $$1) {
      dnb $$2 = $$1.c(enh.g);
      if ($$2 != null) {
         ta $$3 = $$0.x();
         ta $$4;
         if ($$3.b("BlockStateTag", 10)) {
            $$4 = $$3.p("BlockStateTag");
         } else {
            $$4 = new ta();
            $$3.a("BlockStateTag", $$4);
         }

         for (doe<?> $$6 : this.c) {
            if ($$2.b($$6)) {
               $$4.a($$6.f(), a($$2, $$6));
            }
         }
      }

      return $$0;
   }

   public static ely.a a(dac $$0) {
      return new ely.a($$0);
   }

   private static <T extends Comparable<T>> String a(dnb $$0, doe<T> $$1) {
      T $$2 = $$0.c($$1);
      return $$1.a($$2);
   }

   public static class a extends emi.a<ely.a> {
      private final il<dac> a;
      private final Builder<doe<?>> b = ImmutableSet.builder();

      a(dac $$0) {
         this.a = $$0.r();
      }

      public ely.a a(doe<?> $$0) {
         if (!this.a.a().n().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected ely.a a() {
         return this;
      }

      @Override
      public emj b() {
         return new ely(this.g(), this.a, this.b.build());
      }
   }
}
