import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class edi extends eds {
   public static final Codec<edi> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  jb.f.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dgc::f).toList())
               )
            )
            .apply($$0, edi::new)
   );
   private final he<csl> b;
   private final Set<dgc<?>> c;

   edi(List<eff> $$0, he<csl> $$1, Set<dgc<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private edi(List<eff> $$0, he<csl> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public edu b() {
      return edv.x;
   }

   @Override
   public Set<eeo<?>> a() {
      return ImmutableSet.of(eer.g);
   }

   @Override
   protected cix a(cix $$0, ecg $$1) {
      dez $$2 = $$1.c(eer.g);
      if ($$2 != null) {
         qr $$3 = $$0.w();
         qr $$4;
         if ($$3.b("BlockStateTag", 10)) {
            $$4 = $$3.p("BlockStateTag");
         } else {
            $$4 = new qr();
            $$3.a("BlockStateTag", $$4);
         }

         for (dgc<?> $$6 : this.c) {
            if ($$2.b($$6)) {
               $$4.a($$6.f(), a($$2, $$6));
            }
         }
      }

      return $$0;
   }

   public static edi.a a(csl $$0) {
      return new edi.a($$0);
   }

   private static <T extends Comparable<T>> String a(dez $$0, dgc<T> $$1) {
      T $$2 = $$0.c($$1);
      return $$1.a($$2);
   }

   public static class a extends eds.a<edi.a> {
      private final he<csl> a;
      private final Builder<dgc<?>> b = ImmutableSet.builder();

      a(csl $$0) {
         this.a = $$0.q();
      }

      public edi.a a(dgc<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected edi.a a() {
         return this;
      }

      @Override
      public edt b() {
         return new edi(this.g(), this.a, this.b.build());
      }
   }
}
