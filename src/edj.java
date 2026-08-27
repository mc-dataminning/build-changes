import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class edj extends edt {
   public static final Codec<edj> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  jb.f.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dgd::f).toList())
               )
            )
            .apply($$0, edj::new)
   );
   private final he<csm> b;
   private final Set<dgd<?>> c;

   edj(List<efg> $$0, he<csm> $$1, Set<dgd<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private edj(List<efg> $$0, he<csm> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public edv b() {
      return edw.x;
   }

   @Override
   public Set<eep<?>> a() {
      return ImmutableSet.of(ees.g);
   }

   @Override
   protected ciy a(ciy $$0, ech $$1) {
      dfa $$2 = $$1.c(ees.g);
      if ($$2 != null) {
         qr $$3 = $$0.w();
         qr $$4;
         if ($$3.b("BlockStateTag", 10)) {
            $$4 = $$3.p("BlockStateTag");
         } else {
            $$4 = new qr();
            $$3.a("BlockStateTag", $$4);
         }

         for (dgd<?> $$6 : this.c) {
            if ($$2.b($$6)) {
               $$4.a($$6.f(), a($$2, $$6));
            }
         }
      }

      return $$0;
   }

   public static edj.a a(csm $$0) {
      return new edj.a($$0);
   }

   private static <T extends Comparable<T>> String a(dfa $$0, dgd<T> $$1) {
      T $$2 = $$0.c($$1);
      return $$1.a($$2);
   }

   public static class a extends edt.a<edj.a> {
      private final he<csm> a;
      private final Builder<dgd<?>> b = ImmutableSet.builder();

      a(csm $$0) {
         this.a = $$0.q();
      }

      public edj.a a(dgd<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected edj.a a() {
         return this;
      }

      @Override
      public edu b() {
         return new edj(this.g(), this.a, this.b.build());
      }
   }
}
