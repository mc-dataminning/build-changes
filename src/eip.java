import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class eip extends eib {
   public static final Codec<eip> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.BOOL.fieldOf("replace").orElse(false).forGetter($$0x -> $$0x.b),
                  vf.a.listOf().fieldOf("lore").forGetter($$0x -> $$0x.c),
                  atq.a(egp.b.e, "entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eip::new)
   );
   private final boolean b;
   private final List<vd> c;
   private final Optional<egp.b> d;

   public eip(List<ejo> $$0, boolean $$1, List<vd> $$2, Optional<egp.b> $$3) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
      this.d = $$3;
   }

   @Override
   public eid b() {
      return eie.u;
   }

   @Override
   public Set<eix<?>> a() {
      return this.d.<Set<eix<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cmr a(cmr $$0, egp $$1) {
      sr $$2 = this.a($$0, !this.c.isEmpty());
      if ($$2 != null) {
         if (this.b) {
            $$2.clear();
         }

         UnaryOperator<vd> $$3 = eiq.a($$1, this.d.orElse(null));
         this.c.stream().map($$3).map(vd.a::a).map(tg::a).forEach($$2::add);
      }

      return $$0;
   }

   @Nullable
   private sr a(cmr $$0, boolean $$1) {
      sl $$2;
      if ($$0.u()) {
         $$2 = $$0.v();
      } else {
         if (!$$1) {
            return null;
         }

         $$2 = new sl();
         $$0.c($$2);
      }

      sl $$5;
      if ($$2.b("display", 10)) {
         $$5 = $$2.p("display");
      } else {
         if (!$$1) {
            return null;
         }

         $$5 = new sl();
         $$2.a("display", $$5);
      }

      if ($$5.b("Lore", 9)) {
         return $$5.c("Lore", 8);
      } else if ($$1) {
         sr $$8 = new sr();
         $$5.a("Lore", $$8);
         return $$8;
      } else {
         return null;
      }
   }

   public static eip.a c() {
      return new eip.a();
   }

   public static class a extends eib.a<eip.a> {
      private boolean a;
      private Optional<egp.b> b = Optional.empty();
      private final Builder<vd> c = ImmutableList.builder();

      public eip.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public eip.a a(egp.b $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public eip.a a(vd $$0) {
         this.c.add($$0);
         return this;
      }

      protected eip.a a() {
         return this;
      }

      @Override
      public eic b() {
         return new eip(this.g(), this.a, this.c.build(), this.b);
      }
   }
}
