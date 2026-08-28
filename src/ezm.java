import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class ezm extends faa {
   public static final MapCodec<ezm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  mf.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(ear::f).toList())
               )
            )
            .apply($$0, ezm::new)
   );
   private final je<dlu> b;
   private final Set<ear<?>> c;

   ezm(List<fbw> $$0, je<dlu> $$1, Set<ear<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private ezm(List<fbw> $$0, je<dlu> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public fac<ezm> b() {
      return fad.D;
   }

   @Override
   public Set<bav<?>> a() {
      return Set.of(fbh.g);
   }

   @Override
   protected cys a(cys $$0, eyn $$1) {
      dzo $$2 = $$1.c(fbh.g);
      if ($$2 != null) {
         $$0.a(kj.aq, das.a, $$1x -> {
            for (ear<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static ezm.a a(dlu $$0) {
      return new ezm.a($$0);
   }

   public static class a extends faa.a<ezm.a> {
      private final je<dlu> a;
      private final Builder<ear<?>> b = ImmutableSet.builder();

      a(dlu $$0) {
         this.a = $$0.p();
      }

      public ezm.a a(ear<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected ezm.a a() {
         return this;
      }

      @Override
      public fab b() {
         return new ezm(this.g(), this.a, this.b.build());
      }
   }
}
