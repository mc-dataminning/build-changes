import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class ehc extends ego {
   public static final Codec<ehc> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.BOOL.fieldOf("replace").orElse(false).forGetter($$0x -> $$0x.b),
                  ux.a.listOf().fieldOf("lore").forGetter($$0x -> $$0x.c),
                  asy.a(efc.b.e, "entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, ehc::new)
   );
   private final boolean b;
   private final List<uv> c;
   private final Optional<efc.b> d;

   public ehc(List<eib> $$0, boolean $$1, List<uv> $$2, Optional<efc.b> $$3) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
      this.d = $$3;
   }

   @Override
   public egq b() {
      return egr.u;
   }

   @Override
   public Set<ehk<?>> a() {
      return this.d.<Set<ehk<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public clo a(clo $$0, efc $$1) {
      sj $$2 = this.a($$0, !this.c.isEmpty());
      if ($$2 != null) {
         if (this.b) {
            $$2.clear();
         }

         UnaryOperator<uv> $$3 = ehd.a($$1, this.d.orElse(null));
         this.c.stream().map($$3).map(uv.a::a).map(sy::a).forEach($$2::add);
      }

      return $$0;
   }

   @Nullable
   private sj a(clo $$0, boolean $$1) {
      sd $$2;
      if ($$0.u()) {
         $$2 = $$0.v();
      } else {
         if (!$$1) {
            return null;
         }

         $$2 = new sd();
         $$0.c($$2);
      }

      sd $$5;
      if ($$2.b("display", 10)) {
         $$5 = $$2.p("display");
      } else {
         if (!$$1) {
            return null;
         }

         $$5 = new sd();
         $$2.a("display", $$5);
      }

      if ($$5.b("Lore", 9)) {
         return $$5.c("Lore", 8);
      } else if ($$1) {
         sj $$8 = new sj();
         $$5.a("Lore", $$8);
         return $$8;
      } else {
         return null;
      }
   }

   public static ehc.a c() {
      return new ehc.a();
   }

   public static class a extends ego.a<ehc.a> {
      private boolean a;
      private Optional<efc.b> b = Optional.empty();
      private final Builder<uv> c = ImmutableList.builder();

      public ehc.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public ehc.a a(efc.b $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public ehc.a a(uv $$0) {
         this.c.add($$0);
         return this;
      }

      protected ehc.a a() {
         return this;
      }

      @Override
      public egp b() {
         return new ehc(this.g(), this.a, this.c.build(), this.b);
      }
   }
}
