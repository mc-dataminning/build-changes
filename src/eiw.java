import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class eiw extends eii {
   public static final Codec<eiw> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.BOOL.fieldOf("replace").orElse(false).forGetter($$0x -> $$0x.b),
                  vh.a.listOf().fieldOf("lore").forGetter($$0x -> $$0x.c),
                  atw.a(egw.b.e, "entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eiw::new)
   );
   private final boolean b;
   private final List<vf> c;
   private final Optional<egw.b> d;

   public eiw(List<ejv> $$0, boolean $$1, List<vf> $$2, Optional<egw.b> $$3) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
      this.d = $$3;
   }

   @Override
   public eik b() {
      return eil.u;
   }

   @Override
   public Set<eje<?>> a() {
      return this.d.<Set<eje<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cmy a(cmy $$0, egw $$1) {
      st $$2 = this.a($$0, !this.c.isEmpty());
      if ($$2 != null) {
         if (this.b) {
            $$2.clear();
         }

         UnaryOperator<vf> $$3 = eix.a($$1, this.d.orElse(null));
         this.c.stream().map($$3).map(vf.a::a).map(ti::a).forEach($$2::add);
      }

      return $$0;
   }

   @Nullable
   private st a(cmy $$0, boolean $$1) {
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

   public static eiw.a c() {
      return new eiw.a();
   }

   public static class a extends eii.a<eiw.a> {
      private boolean a;
      private Optional<egw.b> b = Optional.empty();
      private final Builder<vf> c = ImmutableList.builder();

      public eiw.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public eiw.a a(egw.b $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public eiw.a a(vf $$0) {
         this.c.add($$0);
         return this;
      }

      protected eiw.a a() {
         return this;
      }

      @Override
      public eij b() {
         return new eiw(this.g(), this.a, this.c.build(), this.b);
      }
   }
}
