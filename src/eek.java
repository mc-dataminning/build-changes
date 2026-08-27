import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class eek extends eeu {
   public static final Codec<eek> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  jy.f.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dhe::f).toList())
               )
            )
            .apply($$0, eek::new)
   );
   private final ib<cua> b;
   private final Set<dhe<?>> c;

   eek(List<egh> $$0, ib<cua> $$1, Set<dhe<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private eek(List<egh> $$0, ib<cua> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().n()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public eew b() {
      return eex.x;
   }

   @Override
   public Set<efq<?>> a() {
      return ImmutableSet.of(eft.g);
   }

   @Override
   protected ckj a(ckj $$0, edi $$1) {
      dgb $$2 = $$1.c(eft.g);
      if ($$2 != null) {
         rt $$3 = $$0.w();
         rt $$4;
         if ($$3.b("BlockStateTag", 10)) {
            $$4 = $$3.p("BlockStateTag");
         } else {
            $$4 = new rt();
            $$3.a("BlockStateTag", $$4);
         }

         for (dhe<?> $$6 : this.c) {
            if ($$2.b($$6)) {
               $$4.a($$6.f(), a($$2, $$6));
            }
         }
      }

      return $$0;
   }

   public static eek.a a(cua $$0) {
      return new eek.a($$0);
   }

   private static <T extends Comparable<T>> String a(dgb $$0, dhe<T> $$1) {
      T $$2 = $$0.c($$1);
      return $$1.a($$2);
   }

   public static class a extends eeu.a<eek.a> {
      private final ib<cua> a;
      private final Builder<dhe<?>> b = ImmutableSet.builder();

      a(cua $$0) {
         this.a = $$0.r();
      }

      public eek.a a(dhe<?> $$0) {
         if (!this.a.a().n().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected eek.a a() {
         return this;
      }

      @Override
      public eev b() {
         return new eek(this.g(), this.a, this.b.build());
      }
   }
}
