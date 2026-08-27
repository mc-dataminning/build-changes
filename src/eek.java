import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class eek extends edw {
   public static final Codec<eek> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.BOOL.fieldOf("replace").orElse(false).forGetter($$0x -> $$0x.b),
                  tn.a.listOf().fieldOf("lore").forGetter($$0x -> $$0x.c),
                  arj.a(eck.b.e, "entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eek::new)
   );
   private final boolean b;
   private final List<tl> c;
   private final Optional<eck.b> d;

   public eek(List<efj> $$0, boolean $$1, List<tl> $$2, Optional<eck.b> $$3) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
      this.d = $$3;
   }

   @Override
   public edy b() {
      return edz.u;
   }

   @Override
   public Set<ees<?>> a() {
      return this.d.<Set<ees<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cjl a(cjl $$0, eck $$1) {
      rc $$2 = this.a($$0, !this.c.isEmpty());
      if ($$2 != null) {
         if (this.b) {
            $$2.clear();
         }

         UnaryOperator<tl> $$3 = eel.a($$1, this.d.orElse(null));
         this.c.stream().map($$3).map(tl.a::a).map(ro::a).forEach($$2::add);
      }

      return $$0;
   }

   @Nullable
   private rc a(cjl $$0, boolean $$1) {
      qw $$2;
      if ($$0.u()) {
         $$2 = $$0.v();
      } else {
         if (!$$1) {
            return null;
         }

         $$2 = new qw();
         $$0.c($$2);
      }

      qw $$5;
      if ($$2.b("display", 10)) {
         $$5 = $$2.p("display");
      } else {
         if (!$$1) {
            return null;
         }

         $$5 = new qw();
         $$2.a("display", $$5);
      }

      if ($$5.b("Lore", 9)) {
         return $$5.c("Lore", 8);
      } else if ($$1) {
         rc $$8 = new rc();
         $$5.a("Lore", $$8);
         return $$8;
      } else {
         return null;
      }
   }

   public static eek.a c() {
      return new eek.a();
   }

   public static class a extends edw.a<eek.a> {
      private boolean a;
      private Optional<eck.b> b = Optional.empty();
      private final Builder<tl> c = ImmutableList.builder();

      public eek.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public eek.a a(eck.b $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public eek.a a(tl $$0) {
         this.c.add($$0);
         return this;
      }

      protected eek.a a() {
         return this;
      }

      @Override
      public edx b() {
         return new eek(this.g(), this.a, this.c.build(), this.b);
      }
   }
}
