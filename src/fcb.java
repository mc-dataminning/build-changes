import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class fcb extends fbg {
   public static final MapCodec<fcb> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xa.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  fbf.a(256).forGetter($$0x -> $$0x.c),
                  ezt.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, fcb::new)
   );
   private final List<wy> b;
   private final fbf c;
   private final Optional<ezt.b> d;

   public fcb(List<fdc> $$0, List<wy> $$1, fbf $$2, Optional<ezt.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public fbi<fcb> b() {
      return fbj.A;
   }

   @Override
   public Set<bax<?>> a() {
      return this.d.<Set<bax<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public czn a(czn $$0, ezt $$1) {
      $$0.a(kk.j, dcg.a, $$1x -> new dcg(this.a($$1x, $$1)));
      return $$0;
   }

   private List<wy> a(@Nullable dcg $$0, ezt $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<wy> $$2 = fcc.a($$1, this.d.orElse(null));
         List<wy> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static fcb.a c() {
      return new fcb.a();
   }

   public static class a extends fbg.a<fcb.a> {
      private Optional<ezt.b> a = Optional.empty();
      private final Builder<wy> b = ImmutableList.builder();
      private fbf c = fbf.a.b;

      public fcb.a a(fbf $$0) {
         this.c = $$0;
         return this;
      }

      public fcb.a a(ezt.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fcb.a a(wy $$0) {
         this.b.add($$0);
         return this;
      }

      protected fcb.a a() {
         return this;
      }

      @Override
      public fbh b() {
         return new fcb(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
