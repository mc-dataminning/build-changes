import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class eel extends edx {
   public static final Codec<eel> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.BOOL.fieldOf("replace").orElse(false).forGetter($$0x -> $$0x.b),
                  arb.b.listOf().fieldOf("lore").forGetter($$0x -> $$0x.c),
                  arb.a(ecl.b.e, "entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eel::new)
   );
   private final boolean b;
   private final List<ti> c;
   private final Optional<ecl.b> d;

   public eel(List<efk> $$0, boolean $$1, List<ti> $$2, Optional<ecl.b> $$3) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
      this.d = $$3;
   }

   @Override
   public edz b() {
      return eea.u;
   }

   @Override
   public Set<eet<?>> a() {
      return this.d.<Set<eet<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cja a(cja $$0, ecl $$1) {
      ra $$2 = this.a($$0, !this.c.isEmpty());
      if ($$2 != null) {
         if (this.b) {
            $$2.clear();
         }

         UnaryOperator<ti> $$3 = eem.a($$1, this.d.orElse(null));
         this.c.stream().map($$3).map(ti.a::a).map(rl::a).forEach($$2::add);
      }

      return $$0;
   }

   @Nullable
   private ra a(cja $$0, boolean $$1) {
      qu $$2;
      if ($$0.u()) {
         $$2 = $$0.v();
      } else {
         if (!$$1) {
            return null;
         }

         $$2 = new qu();
         $$0.c($$2);
      }

      qu $$5;
      if ($$2.b("display", 10)) {
         $$5 = $$2.p("display");
      } else {
         if (!$$1) {
            return null;
         }

         $$5 = new qu();
         $$2.a("display", $$5);
      }

      if ($$5.b("Lore", 9)) {
         return $$5.c("Lore", 8);
      } else if ($$1) {
         ra $$8 = new ra();
         $$5.a("Lore", $$8);
         return $$8;
      } else {
         return null;
      }
   }

   public static eel.a c() {
      return new eel.a();
   }

   public static class a extends edx.a<eel.a> {
      private boolean a;
      private Optional<ecl.b> b = Optional.empty();
      private final Builder<ti> c = ImmutableList.builder();

      public eel.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public eel.a a(ecl.b $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public eel.a a(ti $$0) {
         this.c.add($$0);
         return this;
      }

      protected eel.a a() {
         return this;
      }

      @Override
      public edy b() {
         return new eel(this.g(), this.a, this.c.build(), this.b);
      }
   }
}
