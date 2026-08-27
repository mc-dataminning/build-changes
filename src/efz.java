import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class efz extends egj {
   public static final Codec<efz> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  jy.f.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dil::f).toList())
               )
            )
            .apply($$0, efz::new)
   );
   private final ib<cva> b;
   private final Set<dil<?>> c;

   efz(List<ehw> $$0, ib<cva> $$1, Set<dil<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private efz(List<ehw> $$0, ib<cva> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().n()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public egl b() {
      return egm.x;
   }

   @Override
   public Set<ehf<?>> a() {
      return ImmutableSet.of(ehi.g);
   }

   @Override
   protected clj a(clj $$0, eex $$1) {
      dhi $$2 = $$1.c(ehi.g);
      if ($$2 != null) {
         rz $$3 = $$0.w();
         rz $$4;
         if ($$3.b("BlockStateTag", 10)) {
            $$4 = $$3.p("BlockStateTag");
         } else {
            $$4 = new rz();
            $$3.a("BlockStateTag", $$4);
         }

         for (dil<?> $$6 : this.c) {
            if ($$2.b($$6)) {
               $$4.a($$6.f(), a($$2, $$6));
            }
         }
      }

      return $$0;
   }

   public static efz.a a(cva $$0) {
      return new efz.a($$0);
   }

   private static <T extends Comparable<T>> String a(dhi $$0, dil<T> $$1) {
      T $$2 = $$0.c($$1);
      return $$1.a($$2);
   }

   public static class a extends egj.a<efz.a> {
      private final ib<cva> a;
      private final Builder<dil<?>> b = ImmutableSet.builder();

      a(cva $$0) {
         this.a = $$0.r();
      }

      public efz.a a(dil<?> $$0) {
         if (!this.a.a().n().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected efz.a a() {
         return this;
      }

      @Override
      public egk b() {
         return new efz(this.g(), this.a, this.b.build());
      }
   }
}
