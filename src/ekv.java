import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class ekv extends ekh {
   public static final Codec<ekv> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.BOOL.fieldOf("replace").orElse(false).forGetter($$0x -> $$0x.b),
                  vs.a.listOf().fieldOf("lore").forGetter($$0x -> $$0x.c),
                  avp.a(eiv.b.e, "entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, ekv::new)
   );
   private final boolean b;
   private final List<vq> c;
   private final Optional<eiv.b> d;

   public ekv(List<elu> $$0, boolean $$1, List<vq> $$2, Optional<eiv.b> $$3) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
      this.d = $$3;
   }

   @Override
   public ekj b() {
      return ekk.u;
   }

   @Override
   public Set<eld<?>> a() {
      return this.d.<Set<eld<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public coz a(coz $$0, eiv $$1) {
      tc $$2 = this.a($$0, !this.c.isEmpty());
      if ($$2 != null) {
         if (this.b) {
            $$2.clear();
         }

         UnaryOperator<vq> $$3 = ekw.a($$1, this.d.orElse(null));
         this.c.stream().map($$3).map(vq.a::a).map(tr::a).forEach($$2::add);
      }

      return $$0;
   }

   @Nullable
   private tc a(coz $$0, boolean $$1) {
      sw $$2;
      if ($$0.v()) {
         $$2 = $$0.w();
      } else {
         if (!$$1) {
            return null;
         }

         $$2 = new sw();
         $$0.c($$2);
      }

      sw $$5;
      if ($$2.b("display", 10)) {
         $$5 = $$2.p("display");
      } else {
         if (!$$1) {
            return null;
         }

         $$5 = new sw();
         $$2.a("display", $$5);
      }

      if ($$5.b("Lore", 9)) {
         return $$5.c("Lore", 8);
      } else if ($$1) {
         tc $$8 = new tc();
         $$5.a("Lore", $$8);
         return $$8;
      } else {
         return null;
      }
   }

   public static ekv.a c() {
      return new ekv.a();
   }

   public static class a extends ekh.a<ekv.a> {
      private boolean a;
      private Optional<eiv.b> b = Optional.empty();
      private final Builder<vq> c = ImmutableList.builder();

      public ekv.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public ekv.a a(eiv.b $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public ekv.a a(vq $$0) {
         this.c.add($$0);
         return this;
      }

      protected ekv.a a() {
         return this;
      }

      @Override
      public eki b() {
         return new ekv(this.g(), this.a, this.c.build(), this.b);
      }
   }
}
