import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class egl extends efx {
   public static final Codec<egl> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.BOOL.fieldOf("replace").orElse(false).forGetter($$0x -> $$0x.b),
                  ut.a.listOf().fieldOf("lore").forGetter($$0x -> $$0x.c),
                  asq.a(eel.b.e, "entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, egl::new)
   );
   private final boolean b;
   private final List<ur> c;
   private final Optional<eel.b> d;

   public egl(List<ehk> $$0, boolean $$1, List<ur> $$2, Optional<eel.b> $$3) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
      this.d = $$3;
   }

   @Override
   public efz b() {
      return ega.u;
   }

   @Override
   public Set<egt<?>> a() {
      return this.d.<Set<egt<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public clb a(clb $$0, eel $$1) {
      sf $$2 = this.a($$0, !this.c.isEmpty());
      if ($$2 != null) {
         if (this.b) {
            $$2.clear();
         }

         UnaryOperator<ur> $$3 = egm.a($$1, this.d.orElse(null));
         this.c.stream().map($$3).map(ur.a::a).map(su::a).forEach($$2::add);
      }

      return $$0;
   }

   @Nullable
   private sf a(clb $$0, boolean $$1) {
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

   public static egl.a c() {
      return new egl.a();
   }

   public static class a extends efx.a<egl.a> {
      private boolean a;
      private Optional<eel.b> b = Optional.empty();
      private final Builder<ur> c = ImmutableList.builder();

      public egl.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public egl.a a(eel.b $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public egl.a a(ur $$0) {
         this.c.add($$0);
         return this;
      }

      protected egl.a a() {
         return this;
      }

      @Override
      public efy b() {
         return new egl(this.g(), this.a, this.c.build(), this.b);
      }
   }
}
