import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class egx extends egj {
   public static final Codec<egx> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.BOOL.fieldOf("replace").orElse(false).forGetter($$0x -> $$0x.b),
                  ut.a.listOf().fieldOf("lore").forGetter($$0x -> $$0x.c),
                  asu.a(eex.b.e, "entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, egx::new)
   );
   private final boolean b;
   private final List<ur> c;
   private final Optional<eex.b> d;

   public egx(List<ehw> $$0, boolean $$1, List<ur> $$2, Optional<eex.b> $$3) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
      this.d = $$3;
   }

   @Override
   public egl b() {
      return egm.u;
   }

   @Override
   public Set<ehf<?>> a() {
      return this.d.<Set<ehf<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public clj a(clj $$0, eex $$1) {
      sf $$2 = this.a($$0, !this.c.isEmpty());
      if ($$2 != null) {
         if (this.b) {
            $$2.clear();
         }

         UnaryOperator<ur> $$3 = egy.a($$1, this.d.orElse(null));
         this.c.stream().map($$3).map(ur.a::a).map(su::a).forEach($$2::add);
      }

      return $$0;
   }

   @Nullable
   private sf a(clj $$0, boolean $$1) {
      rz $$2;
      if ($$0.u()) {
         $$2 = $$0.v();
      } else {
         if (!$$1) {
            return null;
         }

         $$2 = new rz();
         $$0.c($$2);
      }

      rz $$5;
      if ($$2.b("display", 10)) {
         $$5 = $$2.p("display");
      } else {
         if (!$$1) {
            return null;
         }

         $$5 = new rz();
         $$2.a("display", $$5);
      }

      if ($$5.b("Lore", 9)) {
         return $$5.c("Lore", 8);
      } else if ($$1) {
         sf $$8 = new sf();
         $$5.a("Lore", $$8);
         return $$8;
      } else {
         return null;
      }
   }

   public static egx.a c() {
      return new egx.a();
   }

   public static class a extends egj.a<egx.a> {
      private boolean a;
      private Optional<eex.b> b = Optional.empty();
      private final Builder<ur> c = ImmutableList.builder();

      public egx.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public egx.a a(eex.b $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public egx.a a(ur $$0) {
         this.c.add($$0);
         return this;
      }

      protected egx.a a() {
         return this;
      }

      @Override
      public egk b() {
         return new egx(this.g(), this.a, this.c.build(), this.b);
      }
   }
}
