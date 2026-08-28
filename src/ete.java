import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class ete extends esj {
   public static final MapCodec<ete> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ww.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  esi.a(256).forGetter($$0x -> $$0x.c),
                  eqw.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, ete::new)
   );
   private final List<wu> b;
   private final esi c;
   private final Optional<eqw.b> d;

   public ete(List<euh> $$0, List<wu> $$1, esi $$2, Optional<eqw.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public esl<ete> b() {
      return esm.A;
   }

   @Override
   public Set<etp<?>> a() {
      return this.d.<Set<etp<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cud a(cud $$0, eqw $$1) {
      $$0.a(kn.i, cwz.a, $$1x -> new cwz(this.a($$1x, $$1)));
      return $$0;
   }

   private List<wu> a(@Nullable cwz $$0, eqw $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<wu> $$2 = etf.a($$1, this.d.orElse(null));
         List<wu> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static ete.a c() {
      return new ete.a();
   }

   public static class a extends esj.a<ete.a> {
      private Optional<eqw.b> a = Optional.empty();
      private final Builder<wu> b = ImmutableList.builder();
      private esi c = esi.a.b;

      public ete.a a(esi $$0) {
         this.c = $$0;
         return this;
      }

      public ete.a a(eqw.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ete.a a(wu $$0) {
         this.b.add($$0);
         return this;
      }

      protected ete.a a() {
         return this;
      }

      @Override
      public esk b() {
         return new ete(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
