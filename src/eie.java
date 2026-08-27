import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class eie extends ehq {
   public static final Codec<eie> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.BOOL.fieldOf("replace").orElse(false).forGetter($$0x -> $$0x.b),
                  vd.a.listOf().fieldOf("lore").forGetter($$0x -> $$0x.c),
                  atg.a(ege.b.e, "entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eie::new)
   );
   private final boolean b;
   private final List<vb> c;
   private final Optional<ege.b> d;

   public eie(List<ejd> $$0, boolean $$1, List<vb> $$2, Optional<ege.b> $$3) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
      this.d = $$3;
   }

   @Override
   public ehs b() {
      return eht.u;
   }

   @Override
   public Set<eim<?>> a() {
      return this.d.<Set<eim<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cmh a(cmh $$0, ege $$1) {
      sp $$2 = this.a($$0, !this.c.isEmpty());
      if ($$2 != null) {
         if (this.b) {
            $$2.clear();
         }

         UnaryOperator<vb> $$3 = eif.a($$1, this.d.orElse(null));
         this.c.stream().map($$3).map(vb.a::a).map(te::a).forEach($$2::add);
      }

      return $$0;
   }

   @Nullable
   private sp a(cmh $$0, boolean $$1) {
      sj $$2;
      if ($$0.u()) {
         $$2 = $$0.v();
      } else {
         if (!$$1) {
            return null;
         }

         $$2 = new sj();
         $$0.c($$2);
      }

      sj $$5;
      if ($$2.b("display", 10)) {
         $$5 = $$2.p("display");
      } else {
         if (!$$1) {
            return null;
         }

         $$5 = new sj();
         $$2.a("display", $$5);
      }

      if ($$5.b("Lore", 9)) {
         return $$5.c("Lore", 8);
      } else if ($$1) {
         sp $$8 = new sp();
         $$5.a("Lore", $$8);
         return $$8;
      } else {
         return null;
      }
   }

   public static eie.a c() {
      return new eie.a();
   }

   public static class a extends ehq.a<eie.a> {
      private boolean a;
      private Optional<ege.b> b = Optional.empty();
      private final Builder<vb> c = ImmutableList.builder();

      public eie.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public eie.a a(ege.b $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public eie.a a(vb $$0) {
         this.c.add($$0);
         return this;
      }

      protected eie.a a() {
         return this;
      }

      @Override
      public ehr b() {
         return new eie(this.g(), this.a, this.c.build(), this.b);
      }
   }
}
