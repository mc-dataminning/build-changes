import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class fcp extends fbu {
   public static final MapCodec<fcp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xc.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  fbt.a(256).forGetter($$0x -> $$0x.c),
                  fah.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, fcp::new)
   );
   private final List<xa> b;
   private final fbt c;
   private final Optional<fah.b> d;

   public fcp(List<fdq> $$0, List<xa> $$1, fbt $$2, Optional<fah.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public fbw<fcp> b() {
      return fbx.A;
   }

   @Override
   public Set<baz<?>> a() {
      return this.d.<Set<baz<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public czy a(czy $$0, fah $$1) {
      $$0.a(kk.j, dcr.a, $$1x -> new dcr(this.a($$1x, $$1)));
      return $$0;
   }

   private List<xa> a(@Nullable dcr $$0, fah $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<xa> $$2 = fcq.a($$1, this.d.orElse(null));
         List<xa> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static fcp.a c() {
      return new fcp.a();
   }

   public static class a extends fbu.a<fcp.a> {
      private Optional<fah.b> a = Optional.empty();
      private final Builder<xa> b = ImmutableList.builder();
      private fbt c = fbt.a.b;

      public fcp.a a(fbt $$0) {
         this.c = $$0;
         return this;
      }

      public fcp.a a(fah.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fcp.a a(xa $$0) {
         this.b.add($$0);
         return this;
      }

      protected fcp.a a() {
         return this;
      }

      @Override
      public fbv b() {
         return new fcp(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
