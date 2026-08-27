import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class eiv extends eih {
   public static final Codec<eiv> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.BOOL.fieldOf("replace").orElse(false).forGetter($$0x -> $$0x.b),
                  vh.a.listOf().fieldOf("lore").forGetter($$0x -> $$0x.c),
                  atv.a(egv.b.e, "entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eiv::new)
   );
   private final boolean b;
   private final List<vf> c;
   private final Optional<egv.b> d;

   public eiv(List<eju> $$0, boolean $$1, List<vf> $$2, Optional<egv.b> $$3) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
      this.d = $$3;
   }

   @Override
   public eij b() {
      return eik.u;
   }

   @Override
   public Set<ejd<?>> a() {
      return this.d.<Set<ejd<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cmx a(cmx $$0, egv $$1) {
      st $$2 = this.a($$0, !this.c.isEmpty());
      if ($$2 != null) {
         if (this.b) {
            $$2.clear();
         }

         UnaryOperator<vf> $$3 = eiw.a($$1, this.d.orElse(null));
         this.c.stream().map($$3).map(vf.a::a).map(ti::a).forEach($$2::add);
      }

      return $$0;
   }

   @Nullable
   private st a(cmx $$0, boolean $$1) {
      sn $$2;
      if ($$0.u()) {
         $$2 = $$0.v();
      } else {
         if (!$$1) {
            return null;
         }

         $$2 = new sn();
         $$0.c($$2);
      }

      sn $$5;
      if ($$2.b("display", 10)) {
         $$5 = $$2.p("display");
      } else {
         if (!$$1) {
            return null;
         }

         $$5 = new sn();
         $$2.a("display", $$5);
      }

      if ($$5.b("Lore", 9)) {
         return $$5.c("Lore", 8);
      } else if ($$1) {
         st $$8 = new st();
         $$5.a("Lore", $$8);
         return $$8;
      } else {
         return null;
      }
   }

   public static eiv.a c() {
      return new eiv.a();
   }

   public static class a extends eih.a<eiv.a> {
      private boolean a;
      private Optional<egv.b> b = Optional.empty();
      private final Builder<vf> c = ImmutableList.builder();

      public eiv.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public eiv.a a(egv.b $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public eiv.a a(vf $$0) {
         this.c.add($$0);
         return this;
      }

      protected eiv.a a() {
         return this;
      }

      @Override
      public eii b() {
         return new eiv(this.g(), this.a, this.c.build(), this.b);
      }
   }
}
