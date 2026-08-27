import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class ees extends eee {
   public static final Codec<ees> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.BOOL.fieldOf("replace").orElse(false).forGetter($$0x -> $$0x.b),
                  arh.b.listOf().fieldOf("lore").forGetter($$0x -> $$0x.c),
                  arh.a(ecs.b.e, "entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, ees::new)
   );
   private final boolean b;
   private final List<tn> c;
   private final Optional<ecs.b> d;

   public ees(List<efr> $$0, boolean $$1, List<tn> $$2, Optional<ecs.b> $$3) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
      this.d = $$3;
   }

   @Override
   public eeg b() {
      return eeh.u;
   }

   @Override
   public Set<efa<?>> a() {
      return this.d.<Set<efa<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cjh a(cjh $$0, ecs $$1) {
      re $$2 = this.a($$0, !this.c.isEmpty());
      if ($$2 != null) {
         if (this.b) {
            $$2.clear();
         }

         UnaryOperator<tn> $$3 = eet.a($$1, this.d.orElse(null));
         this.c.stream().map($$3).map(tn.a::a).map(rq::a).forEach($$2::add);
      }

      return $$0;
   }

   @Nullable
   private re a(cjh $$0, boolean $$1) {
      qy $$2;
      if ($$0.u()) {
         $$2 = $$0.v();
      } else {
         if (!$$1) {
            return null;
         }

         $$2 = new qy();
         $$0.c($$2);
      }

      qy $$5;
      if ($$2.b("display", 10)) {
         $$5 = $$2.p("display");
      } else {
         if (!$$1) {
            return null;
         }

         $$5 = new qy();
         $$2.a("display", $$5);
      }

      if ($$5.b("Lore", 9)) {
         return $$5.c("Lore", 8);
      } else if ($$1) {
         re $$8 = new re();
         $$5.a("Lore", $$8);
         return $$8;
      } else {
         return null;
      }
   }

   public static ees.a c() {
      return new ees.a();
   }

   public static class a extends eee.a<ees.a> {
      private boolean a;
      private Optional<ecs.b> b = Optional.empty();
      private final Builder<tn> c = ImmutableList.builder();

      public ees.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public ees.a a(ecs.b $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public ees.a a(tn $$0) {
         this.c.add($$0);
         return this;
      }

      protected ees.a a() {
         return this;
      }

      @Override
      public eef b() {
         return new ees(this.g(), this.a, this.c.build(), this.b);
      }
   }
}
