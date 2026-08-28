import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class erh extends eru {
   public static final MapCodec<erh> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  lp.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dtf::f).toList())
               )
            )
            .apply($$0, erh::new)
   );
   private final ji<dez> b;
   private final Set<dtf<?>> c;

   erh(List<ets> $$0, ji<dez> $$1, Set<dtf<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private erh(List<ets> $$0, ji<dez> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public erw<erh> b() {
      return erx.D;
   }

   @Override
   public Set<etb<?>> a() {
      return ImmutableSet.of(ete.g);
   }

   @Override
   protected cup a(cup $$0, eqi $$1) {
      dsc $$2 = $$1.c(ete.g);
      if ($$2 != null) {
         $$0.a(km.ab, cxa.a, $$1x -> {
            for (dtf<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static erh.a a(dez $$0) {
      return new erh.a($$0);
   }

   public static class a extends eru.a<erh.a> {
      private final ji<dez> a;
      private final Builder<dtf<?>> b = ImmutableSet.builder();

      a(dez $$0) {
         this.a = $$0.s();
      }

      public erh.a a(dtf<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected erh.a a() {
         return this;
      }

      @Override
      public erv b() {
         return new erh(this.g(), this.a, this.b.build());
      }
   }
}
