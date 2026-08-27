import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class ehr extends eib {
   public static final Codec<ehr> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  kd.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dkd::f).toList())
               )
            )
            .apply($$0, ehr::new)
   );
   private final ih<cwj> b;
   private final Set<dkd<?>> c;

   ehr(List<ejo> $$0, ih<cwj> $$1, Set<dkd<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private ehr(List<ejo> $$0, ih<cwj> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().n()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public eid b() {
      return eie.x;
   }

   @Override
   public Set<eix<?>> a() {
      return ImmutableSet.of(eja.g);
   }

   @Override
   protected cmr a(cmr $$0, egp $$1) {
      dja $$2 = $$1.c(eja.g);
      if ($$2 != null) {
         sl $$3 = $$0.w();
         sl $$4;
         if ($$3.b("BlockStateTag", 10)) {
            $$4 = $$3.p("BlockStateTag");
         } else {
            $$4 = new sl();
            $$3.a("BlockStateTag", $$4);
         }

         for (dkd<?> $$6 : this.c) {
            if ($$2.b($$6)) {
               $$4.a($$6.f(), a($$2, $$6));
            }
         }
      }

      return $$0;
   }

   public static ehr.a a(cwj $$0) {
      return new ehr.a($$0);
   }

   private static <T extends Comparable<T>> String a(dja $$0, dkd<T> $$1) {
      T $$2 = $$0.c($$1);
      return $$1.a($$2);
   }

   public static class a extends eib.a<ehr.a> {
      private final ih<cwj> a;
      private final Builder<dkd<?>> b = ImmutableSet.builder();

      a(cwj $$0) {
         this.a = $$0.r();
      }

      public ehr.a a(dkd<?> $$0) {
         if (!this.a.a().n().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected ehr.a a() {
         return this;
      }

      @Override
      public eic b() {
         return new ehr(this.g(), this.a, this.b.build());
      }
   }
}
