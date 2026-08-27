import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class eeq extends eec {
   public static final Codec<eeq> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.BOOL.fieldOf("replace").orElse(false).forGetter($$0x -> $$0x.b),
                  arg.b.listOf().fieldOf("lore").forGetter($$0x -> $$0x.c),
                  arg.a(ecq.b.e, "entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eeq::new)
   );
   private final boolean b;
   private final List<tl> c;
   private final Optional<ecq.b> d;

   public eeq(List<efp> $$0, boolean $$1, List<tl> $$2, Optional<ecq.b> $$3) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
      this.d = $$3;
   }

   @Override
   public eee b() {
      return eef.u;
   }

   @Override
   public Set<eey<?>> a() {
      return this.d.<Set<eey<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cjf a(cjf $$0, ecq $$1) {
      rd $$2 = this.a($$0, !this.c.isEmpty());
      if ($$2 != null) {
         if (this.b) {
            $$2.clear();
         }

         UnaryOperator<tl> $$3 = eer.a($$1, this.d.orElse(null));
         this.c.stream().map($$3).map(tl.a::a).map(ro::a).forEach($$2::add);
      }

      return $$0;
   }

   @Nullable
   private rd a(cjf $$0, boolean $$1) {
      qx $$2;
      if ($$0.u()) {
         $$2 = $$0.v();
      } else {
         if (!$$1) {
            return null;
         }

         $$2 = new qx();
         $$0.c($$2);
      }

      qx $$5;
      if ($$2.b("display", 10)) {
         $$5 = $$2.p("display");
      } else {
         if (!$$1) {
            return null;
         }

         $$5 = new qx();
         $$2.a("display", $$5);
      }

      if ($$5.b("Lore", 9)) {
         return $$5.c("Lore", 8);
      } else if ($$1) {
         rd $$8 = new rd();
         $$5.a("Lore", $$8);
         return $$8;
      } else {
         return null;
      }
   }

   public static eeq.a c() {
      return new eeq.a();
   }

   public static class a extends eec.a<eeq.a> {
      private boolean a;
      private Optional<ecq.b> b = Optional.empty();
      private final Builder<tl> c = ImmutableList.builder();

      public eeq.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public eeq.a a(ecq.b $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public eeq.a a(tl $$0) {
         this.c.add($$0);
         return this;
      }

      protected eeq.a a() {
         return this;
      }

      @Override
      public eed b() {
         return new eeq(this.g(), this.a, this.c.build(), this.b);
      }
   }
}
