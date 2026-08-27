import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class efn extends efx {
   public static final Codec<efn> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  jy.f.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dhz::f).toList())
               )
            )
            .apply($$0, efn::new)
   );
   private final ib<cut> b;
   private final Set<dhz<?>> c;

   efn(List<ehk> $$0, ib<cut> $$1, Set<dhz<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private efn(List<ehk> $$0, ib<cut> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().n()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public efz b() {
      return ega.x;
   }

   @Override
   public Set<egt<?>> a() {
      return ImmutableSet.of(egw.g);
   }

   @Override
   protected clb a(clb $$0, eel $$1) {
      dgw $$2 = $$1.c(egw.g);
      if ($$2 != null) {
         rz $$3 = $$0.w();
         rz $$4;
         if ($$3.b("BlockStateTag", 10)) {
            $$4 = $$3.p("BlockStateTag");
         } else {
            $$4 = new rz();
            $$3.a("BlockStateTag", $$4);
         }

         for (dhz<?> $$6 : this.c) {
            if ($$2.b($$6)) {
               $$4.a($$6.f(), a($$2, $$6));
            }
         }
      }

      return $$0;
   }

   public static efn.a a(cut $$0) {
      return new efn.a($$0);
   }

   private static <T extends Comparable<T>> String a(dgw $$0, dhz<T> $$1) {
      T $$2 = $$0.c($$1);
      return $$1.a($$2);
   }

   public static class a extends efx.a<efn.a> {
      private final ib<cut> a;
      private final Builder<dhz<?>> b = ImmutableSet.builder();

      a(cut $$0) {
         this.a = $$0.r();
      }

      public efn.a a(dhz<?> $$0) {
         if (!this.a.a().n().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected efn.a a() {
         return this;
      }

      @Override
      public efy b() {
         return new efn(this.g(), this.a, this.b.build());
      }
   }
}
