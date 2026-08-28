import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class esk extends esy {
   public static final MapCodec<esk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  lt.e.s().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dud::f).toList())
               )
            )
            .apply($$0, esk::new)
   );
   private final jm<dfw> b;
   private final Set<dud<?>> c;

   esk(List<euw> $$0, jm<dfw> $$1, Set<dud<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private esk(List<euw> $$0, jm<dfw> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public eta<esk> b() {
      return etb.D;
   }

   @Override
   public Set<eue<?>> a() {
      return ImmutableSet.of(euh.g);
   }

   @Override
   protected cuo a(cuo $$0, erl $$1) {
      dta $$2 = $$1.c(euh.g);
      if ($$2 != null) {
         $$0.a(kq.ac, cxb.a, $$1x -> {
            for (dud<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static esk.a a(dfw $$0) {
      return new esk.a($$0);
   }

   public static class a extends esy.a<esk.a> {
      private final jm<dfw> a;
      private final Builder<dud<?>> b = ImmutableSet.builder();

      a(dfw $$0) {
         this.a = $$0.s();
      }

      public esk.a a(dud<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected esk.a a() {
         return this;
      }

      @Override
      public esz b() {
         return new esk(this.g(), this.a, this.b.build());
      }
   }
}
