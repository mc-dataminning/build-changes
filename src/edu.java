import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class edu extends eee {
   public static final Codec<edu> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  jd.f.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dgo::f).toList())
               )
            )
            .apply($$0, edu::new)
   );
   private final hg<csx> b;
   private final Set<dgo<?>> c;

   edu(List<efr> $$0, hg<csx> $$1, Set<dgo<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private edu(List<efr> $$0, hg<csx> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public eeg b() {
      return eeh.x;
   }

   @Override
   public Set<efa<?>> a() {
      return ImmutableSet.of(efd.g);
   }

   @Override
   protected cjh a(cjh $$0, ecs $$1) {
      dfl $$2 = $$1.c(efd.g);
      if ($$2 != null) {
         qy $$3 = $$0.w();
         qy $$4;
         if ($$3.b("BlockStateTag", 10)) {
            $$4 = $$3.p("BlockStateTag");
         } else {
            $$4 = new qy();
            $$3.a("BlockStateTag", $$4);
         }

         for (dgo<?> $$6 : this.c) {
            if ($$2.b($$6)) {
               $$4.a($$6.f(), a($$2, $$6));
            }
         }
      }

      return $$0;
   }

   public static edu.a a(csx $$0) {
      return new edu.a($$0);
   }

   private static <T extends Comparable<T>> String a(dfl $$0, dgo<T> $$1) {
      T $$2 = $$0.c($$1);
      return $$1.a($$2);
   }

   public static class a extends eee.a<edu.a> {
      private final hg<csx> a;
      private final Builder<dgo<?>> b = ImmutableSet.builder();

      a(csx $$0) {
         this.a = $$0.q();
      }

      public edu.a a(dgo<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected edu.a a() {
         return this;
      }

      @Override
      public eef b() {
         return new edu(this.g(), this.a, this.b.build());
      }
   }
}
