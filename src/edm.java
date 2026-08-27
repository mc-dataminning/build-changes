import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class edm extends edw {
   public static final Codec<edm> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  jb.f.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dgg::f).toList())
               )
            )
            .apply($$0, edm::new)
   );
   private final he<ctc> b;
   private final Set<dgg<?>> c;

   edm(List<efj> $$0, he<ctc> $$1, Set<dgg<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private edm(List<efj> $$0, he<ctc> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().n()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public edy b() {
      return edz.x;
   }

   @Override
   public Set<ees<?>> a() {
      return ImmutableSet.of(eev.g);
   }

   @Override
   protected cjl a(cjl $$0, eck $$1) {
      dfd $$2 = $$1.c(eev.g);
      if ($$2 != null) {
         qw $$3 = $$0.w();
         qw $$4;
         if ($$3.b("BlockStateTag", 10)) {
            $$4 = $$3.p("BlockStateTag");
         } else {
            $$4 = new qw();
            $$3.a("BlockStateTag", $$4);
         }

         for (dgg<?> $$6 : this.c) {
            if ($$2.b($$6)) {
               $$4.a($$6.f(), a($$2, $$6));
            }
         }
      }

      return $$0;
   }

   public static edm.a a(ctc $$0) {
      return new edm.a($$0);
   }

   private static <T extends Comparable<T>> String a(dfd $$0, dgg<T> $$1) {
      T $$2 = $$0.c($$1);
      return $$1.a($$2);
   }

   public static class a extends edw.a<edm.a> {
      private final he<ctc> a;
      private final Builder<dgg<?>> b = ImmutableSet.builder();

      a(ctc $$0) {
         this.a = $$0.r();
      }

      public edm.a a(dgg<?> $$0) {
         if (!this.a.a().n().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected edm.a a() {
         return this;
      }

      @Override
      public edx b() {
         return new edm(this.g(), this.a, this.b.build());
      }
   }
}
