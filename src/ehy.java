import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class ehy extends eii {
   public static final Codec<ehy> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  kd.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dkk::f).toList())
               )
            )
            .apply($$0, ehy::new)
   );
   private final ih<cwq> b;
   private final Set<dkk<?>> c;

   ehy(List<ejv> $$0, ih<cwq> $$1, Set<dkk<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private ehy(List<ejv> $$0, ih<cwq> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().n()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public eik b() {
      return eil.x;
   }

   @Override
   public Set<eje<?>> a() {
      return ImmutableSet.of(ejh.g);
   }

   @Override
   protected cmy a(cmy $$0, egw $$1) {
      djh $$2 = $$1.c(ejh.g);
      if ($$2 != null) {
         sn $$3 = $$0.w();
         sn $$4;
         if ($$3.b("BlockStateTag", 10)) {
            $$4 = $$3.p("BlockStateTag");
         } else {
            $$4 = new sn();
            $$3.a("BlockStateTag", $$4);
         }

         for (dkk<?> $$6 : this.c) {
            if ($$2.b($$6)) {
               $$4.a($$6.f(), a($$2, $$6));
            }
         }
      }

      return $$0;
   }

   public static ehy.a a(cwq $$0) {
      return new ehy.a($$0);
   }

   private static <T extends Comparable<T>> String a(djh $$0, dkk<T> $$1) {
      T $$2 = $$0.c($$1);
      return $$1.a($$2);
   }

   public static class a extends eii.a<ehy.a> {
      private final ih<cwq> a;
      private final Builder<dkk<?>> b = ImmutableSet.builder();

      a(cwq $$0) {
         this.a = $$0.r();
      }

      public ehy.a a(dkk<?> $$0) {
         if (!this.a.a().n().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected ehy.a a() {
         return this;
      }

      @Override
      public eij b() {
         return new ehy(this.g(), this.a, this.b.build());
      }
   }
}
