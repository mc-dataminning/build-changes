import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class ejf extends eir {
   public static final Codec<ejf> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.BOOL.fieldOf("replace").orElse(false).forGetter($$0x -> $$0x.b),
                  vi.a.listOf().fieldOf("lore").forGetter($$0x -> $$0x.c),
                  atx.a(ehf.b.e, "entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, ejf::new)
   );
   private final boolean b;
   private final List<vg> c;
   private final Optional<ehf.b> d;

   public ejf(List<eke> $$0, boolean $$1, List<vg> $$2, Optional<ehf.b> $$3) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
      this.d = $$3;
   }

   @Override
   public eit b() {
      return eiu.u;
   }

   @Override
   public Set<ejn<?>> a() {
      return this.d.<Set<ejn<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cng a(cng $$0, ehf $$1) {
      su $$2 = this.a($$0, !this.c.isEmpty());
      if ($$2 != null) {
         if (this.b) {
            $$2.clear();
         }

         UnaryOperator<vg> $$3 = ejg.a($$1, this.d.orElse(null));
         this.c.stream().map($$3).map(vg.a::a).map(tj::a).forEach($$2::add);
      }

      return $$0;
   }

   @Nullable
   private su a(cng $$0, boolean $$1) {
      so $$2;
      if ($$0.u()) {
         $$2 = $$0.v();
      } else {
         if (!$$1) {
            return null;
         }

         $$2 = new so();
         $$0.c($$2);
      }

      so $$5;
      if ($$2.b("display", 10)) {
         $$5 = $$2.p("display");
      } else {
         if (!$$1) {
            return null;
         }

         $$5 = new so();
         $$2.a("display", $$5);
      }

      if ($$5.b("Lore", 9)) {
         return $$5.c("Lore", 8);
      } else if ($$1) {
         su $$8 = new su();
         $$5.a("Lore", $$8);
         return $$8;
      } else {
         return null;
      }
   }

   public static ejf.a c() {
      return new ejf.a();
   }

   public static class a extends eir.a<ejf.a> {
      private boolean a;
      private Optional<ehf.b> b = Optional.empty();
      private final Builder<vg> c = ImmutableList.builder();

      public ejf.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public ejf.a a(ehf.b $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public ejf.a a(vg $$0) {
         this.c.add($$0);
         return this;
      }

      protected ejf.a a() {
         return this;
      }

      @Override
      public eis b() {
         return new ejf(this.g(), this.a, this.c.build(), this.b);
      }
   }
}
