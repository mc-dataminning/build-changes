import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class ewr extends exf {
   public static final MapCodec<ewr> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  mb.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dya::f).toList())
               )
            )
            .apply($$0, ewr::new)
   );
   private final jr<djn> b;
   private final Set<dya<?>> c;

   ewr(List<ezb> $$0, jr<djn> $$1, Set<dya<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private ewr(List<ezb> $$0, jr<djn> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public exh<ewr> b() {
      return exi.D;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(eym.g);
   }

   @Override
   protected cwq a(cwq $$0, evs $$1) {
      dwy $$2 = $$1.c(eym.g);
      if ($$2 != null) {
         $$0.a(kv.am, cys.a, $$1x -> {
            for (dya<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static ewr.a a(djn $$0) {
      return new ewr.a($$0);
   }

   public static class a extends exf.a<ewr.a> {
      private final jr<djn> a;
      private final Builder<dya<?>> b = ImmutableSet.builder();

      a(djn $$0) {
         this.a = $$0.p();
      }

      public ewr.a a(dya<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected ewr.a a() {
         return this;
      }

      @Override
      public exg b() {
         return new ewr(this.g(), this.a, this.b.build());
      }
   }
}
