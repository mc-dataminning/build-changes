import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class fag extends fau {
   public static final MapCodec<fag> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  mf.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(ebk::f).toList())
               )
            )
            .apply($$0, fag::new)
   );
   private final je<dmf> b;
   private final Set<ebk<?>> c;

   fag(List<fcq> $$0, je<dmf> $$1, Set<ebk<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private fag(List<fcq> $$0, je<dmf> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public faw<fag> b() {
      return fax.D;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fcb.g);
   }

   @Override
   protected czd a(czd $$0, ezh $$1) {
      eah $$2 = $$1.c(fcb.g);
      if ($$2 != null) {
         $$0.a(kj.aq, dbd.a, $$1x -> {
            for (ebk<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static fag.a a(dmf $$0) {
      return new fag.a($$0);
   }

   public static class a extends fau.a<fag.a> {
      private final je<dmf> a;
      private final Builder<ebk<?>> b = ImmutableSet.builder();

      a(dmf $$0) {
         this.a = $$0.p();
      }

      public fag.a a(ebk<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected fag.a a() {
         return this;
      }

      @Override
      public fav b() {
         return new fag(this.g(), this.a, this.b.build());
      }
   }
}
