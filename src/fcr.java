import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class fcr extends fbw {
   public static final MapCodec<fcr> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xe.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  fbv.a(256).forGetter($$0x -> $$0x.c),
                  faj.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, fcr::new)
   );
   private final List<xc> b;
   private final fbv c;
   private final Optional<faj.b> d;

   public fcr(List<fds> $$0, List<xc> $$1, fbv $$2, Optional<faj.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public fby<fcr> b() {
      return fbz.A;
   }

   @Override
   public Set<bbb<?>> a() {
      return this.d.<Set<bbb<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public daa a(daa $$0, faj $$1) {
      $$0.a(kl.j, dct.a, $$1x -> new dct(this.a($$1x, $$1)));
      return $$0;
   }

   private List<xc> a(@Nullable dct $$0, faj $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<xc> $$2 = fcs.a($$1, this.d.orElse(null));
         List<xc> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static fcr.a c() {
      return new fcr.a();
   }

   public static class a extends fbw.a<fcr.a> {
      private Optional<faj.b> a = Optional.empty();
      private final Builder<xc> b = ImmutableList.builder();
      private fbv c = fbv.a.b;

      public fcr.a a(fbv $$0) {
         this.c = $$0;
         return this;
      }

      public fcr.a a(faj.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fcr.a a(xc $$0) {
         this.b.add($$0);
         return this;
      }

      protected fcr.a a() {
         return this;
      }

      @Override
      public fbx b() {
         return new fcr(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
