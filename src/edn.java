import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class edn extends edx {
   public static final Codec<edn> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  jd.f.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dgh::f).toList())
               )
            )
            .apply($$0, edn::new)
   );
   private final hg<csq> b;
   private final Set<dgh<?>> c;

   edn(List<efk> $$0, hg<csq> $$1, Set<dgh<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private edn(List<efk> $$0, hg<csq> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public edz b() {
      return eea.x;
   }

   @Override
   public Set<eet<?>> a() {
      return ImmutableSet.of(eew.g);
   }

   @Override
   protected cja a(cja $$0, ecl $$1) {
      dfe $$2 = $$1.c(eew.g);
      if ($$2 != null) {
         qu $$3 = $$0.w();
         qu $$4;
         if ($$3.b("BlockStateTag", 10)) {
            $$4 = $$3.p("BlockStateTag");
         } else {
            $$4 = new qu();
            $$3.a("BlockStateTag", $$4);
         }

         for (dgh<?> $$6 : this.c) {
            if ($$2.b($$6)) {
               $$4.a($$6.f(), a($$2, $$6));
            }
         }
      }

      return $$0;
   }

   public static edn.a a(csq $$0) {
      return new edn.a($$0);
   }

   private static <T extends Comparable<T>> String a(dfe $$0, dgh<T> $$1) {
      T $$2 = $$0.c($$1);
      return $$1.a($$2);
   }

   public static class a extends edx.a<edn.a> {
      private final hg<csq> a;
      private final Builder<dgh<?>> b = ImmutableSet.builder();

      a(csq $$0) {
         this.a = $$0.q();
      }

      public edn.a a(dgh<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected edn.a a() {
         return this;
      }

      @Override
      public edy b() {
         return new edn(this.g(), this.a, this.b.build());
      }
   }
}
