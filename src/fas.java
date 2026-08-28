import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class fas extends fbg {
   public static final MapCodec<fas> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  mg.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(ebw::f).toList())
               )
            )
            .apply($$0, fas::new)
   );
   private final jf<dmr> b;
   private final Set<ebw<?>> c;

   fas(List<fdc> $$0, jf<dmr> $$1, Set<ebw<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private fas(List<fdc> $$0, jf<dmr> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public fbi<fas> b() {
      return fbj.D;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fcn.g);
   }

   @Override
   protected czn a(czn $$0, ezt $$1) {
      eat $$2 = $$1.c(fcn.g);
      if ($$2 != null) {
         $$0.a(kk.aq, dbn.a, $$1x -> {
            for (ebw<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static fas.a a(dmr $$0) {
      return new fas.a($$0);
   }

   public static class a extends fbg.a<fas.a> {
      private final jf<dmr> a;
      private final Builder<ebw<?>> b = ImmutableSet.builder();

      a(dmr $$0) {
         this.a = $$0.p();
      }

      public fas.a a(ebw<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected fas.a a() {
         return this;
      }

      @Override
      public fbh b() {
         return new fas(this.g(), this.a, this.b.build());
      }
   }
}
