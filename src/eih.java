import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class eih extends eir {
   public static final Codec<eih> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  kd.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dks::f).toList())
               )
            )
            .apply($$0, eih::new)
   );
   private final ih<cwy> b;
   private final Set<dks<?>> c;

   eih(List<eke> $$0, ih<cwy> $$1, Set<dks<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private eih(List<eke> $$0, ih<cwy> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().n()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public eit b() {
      return eiu.x;
   }

   @Override
   public Set<ejn<?>> a() {
      return ImmutableSet.of(ejq.g);
   }

   @Override
   protected cng a(cng $$0, ehf $$1) {
      djp $$2 = $$1.c(ejq.g);
      if ($$2 != null) {
         so $$3 = $$0.w();
         so $$4;
         if ($$3.b("BlockStateTag", 10)) {
            $$4 = $$3.p("BlockStateTag");
         } else {
            $$4 = new so();
            $$3.a("BlockStateTag", $$4);
         }

         for (dks<?> $$6 : this.c) {
            if ($$2.b($$6)) {
               $$4.a($$6.f(), a($$2, $$6));
            }
         }
      }

      return $$0;
   }

   public static eih.a a(cwy $$0) {
      return new eih.a($$0);
   }

   private static <T extends Comparable<T>> String a(djp $$0, dks<T> $$1) {
      T $$2 = $$0.c($$1);
      return $$1.a($$2);
   }

   public static class a extends eir.a<eih.a> {
      private final ih<cwy> a;
      private final Builder<dks<?>> b = ImmutableSet.builder();

      a(cwy $$0) {
         this.a = $$0.r();
      }

      public eih.a a(dks<?> $$0) {
         if (!this.a.a().n().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected eih.a a() {
         return this;
      }

      @Override
      public eis b() {
         return new eih(this.g(), this.a, this.b.build());
      }
   }
}
