import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class ett extends eta {
   public static final Codec<ett> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axu.a(xg.a.listOf(), 256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  esz.a(256).forGetter($$0x -> $$0x.c),
                  axu.a(erp.b.e, "entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, ett::new)
   );
   private final List<xe> b;
   private final esz c;
   private final Optional<erp.b> d;

   public ett(List<euu> $$0, List<xe> $$1, esz $$2, Optional<erp.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public etc b() {
      return etd.x;
   }

   @Override
   public Set<eud<?>> a() {
      return this.d.<Set<eud<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cuh a(cuh $$0, erp $$1) {
      $$0.a(ke.g, cxn.a, $$1x -> new cxn(this.a($$1x, $$1)));
      return $$0;
   }

   private List<xe> a(@Nullable cxn $$0, erp $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<xe> $$2 = etu.a($$1, this.d.orElse(null));
         List<xe> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static ett.a c() {
      return new ett.a();
   }

   public static class a extends eta.a<ett.a> {
      private Optional<erp.b> a = Optional.empty();
      private final Builder<xe> b = ImmutableList.builder();
      private esz c = esz.a.a;

      public ett.a a(esz $$0) {
         this.c = $$0;
         return this;
      }

      public ett.a a(erp.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ett.a a(xe $$0) {
         this.b.add($$0);
         return this;
      }

      protected ett.a a() {
         return this;
      }

      @Override
      public etb b() {
         return new ett(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
