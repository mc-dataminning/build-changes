import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class erv extends esj {
   public static final MapCodec<erv> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  lq.e.s().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dto::f).toList())
               )
            )
            .apply($$0, erv::new)
   );
   private final jj<dfi> b;
   private final Set<dto<?>> c;

   erv(List<euh> $$0, jj<dfi> $$1, Set<dto<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private erv(List<euh> $$0, jj<dfi> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public esl<erv> b() {
      return esm.D;
   }

   @Override
   public Set<etp<?>> a() {
      return ImmutableSet.of(ets.g);
   }

   @Override
   protected cud a(cud $$0, eqw $$1) {
      dsl $$2 = $$1.c(ets.g);
      if ($$2 != null) {
         $$0.a(kn.ab, cwn.a, $$1x -> {
            for (dto<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static erv.a a(dfi $$0) {
      return new erv.a($$0);
   }

   public static class a extends esj.a<erv.a> {
      private final jj<dfi> a;
      private final Builder<dto<?>> b = ImmutableSet.builder();

      a(dfi $$0) {
         this.a = $$0.s();
      }

      public erv.a a(dto<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected erv.a a() {
         return this;
      }

      @Override
      public esk b() {
         return new erv(this.g(), this.a, this.b.build());
      }
   }
}
