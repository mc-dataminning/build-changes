import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class ely extends elk {
   public static final Codec<ely> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.BOOL.fieldOf("replace").orElse(false).forGetter($$0x -> $$0x.b),
                  vu.a.listOf().fieldOf("lore").forGetter($$0x -> $$0x.c),
                  avu.a(ejy.b.e, "entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, ely::new)
   );
   private final boolean b;
   private final List<vs> c;
   private final Optional<ejy.b> d;

   public ely(List<emx> $$0, boolean $$1, List<vs> $$2, Optional<ejy.b> $$3) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
      this.d = $$3;
   }

   @Override
   public elm b() {
      return eln.u;
   }

   @Override
   public Set<emg<?>> a() {
      return this.d.<Set<emg<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cpq a(cpq $$0, ejy $$1) {
      te $$2 = this.a($$0, !this.c.isEmpty());
      if ($$2 != null) {
         if (this.b) {
            $$2.clear();
         }

         UnaryOperator<vs> $$3 = elz.a($$1, this.d.orElse(null));
         this.c.stream().map($$3).map(vs.a::a).map(tt::a).forEach($$2::add);
      }

      return $$0;
   }

   @Nullable
   private te a(cpq $$0, boolean $$1) {
      sy $$2;
      if ($$0.v()) {
         $$2 = $$0.w();
      } else {
         if (!$$1) {
            return null;
         }

         $$2 = new sy();
         $$0.c($$2);
      }

      sy $$5;
      if ($$2.b("display", 10)) {
         $$5 = $$2.p("display");
      } else {
         if (!$$1) {
            return null;
         }

         $$5 = new sy();
         $$2.a("display", $$5);
      }

      if ($$5.b("Lore", 9)) {
         return $$5.c("Lore", 8);
      } else if ($$1) {
         te $$8 = new te();
         $$5.a("Lore", $$8);
         return $$8;
      } else {
         return null;
      }
   }

   public static ely.a c() {
      return new ely.a();
   }

   public static class a extends elk.a<ely.a> {
      private boolean a;
      private Optional<ejy.b> b = Optional.empty();
      private final Builder<vs> c = ImmutableList.builder();

      public ely.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public ely.a a(ejy.b $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public ely.a a(vs $$0) {
         this.c.add($$0);
         return this;
      }

      protected ely.a a() {
         return this;
      }

      @Override
      public ell b() {
         return new ely(this.g(), this.a, this.c.build(), this.b);
      }
   }
}
