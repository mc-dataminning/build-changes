import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class fan extends fbb {
   public static final MapCodec<fan> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  mg.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(ebr::f).toList())
               )
            )
            .apply($$0, fan::new)
   );
   private final jf<dmm> b;
   private final Set<ebr<?>> c;

   fan(List<fcx> $$0, jf<dmm> $$1, Set<ebr<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private fan(List<fcx> $$0, jf<dmm> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public fbd<fan> b() {
      return fbe.D;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fci.g);
   }

   @Override
   protected czk a(czk $$0, ezo $$1) {
      eao $$2 = $$1.c(fci.g);
      if ($$2 != null) {
         $$0.a(kk.aq, dbk.a, $$1x -> {
            for (ebr<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static fan.a a(dmm $$0) {
      return new fan.a($$0);
   }

   public static class a extends fbb.a<fan.a> {
      private final jf<dmm> a;
      private final Builder<ebr<?>> b = ImmutableSet.builder();

      a(dmm $$0) {
         this.a = $$0.p();
      }

      public fan.a a(ebr<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected fan.a a() {
         return this;
      }

      @Override
      public fbc b() {
         return new fan(this.g(), this.a, this.b.build());
      }
   }
}
