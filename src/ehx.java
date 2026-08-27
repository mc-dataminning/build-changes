import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class ehx extends eih {
   public static final Codec<ehx> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  kd.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dkj::f).toList())
               )
            )
            .apply($$0, ehx::new)
   );
   private final ih<cwp> b;
   private final Set<dkj<?>> c;

   ehx(List<eju> $$0, ih<cwp> $$1, Set<dkj<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private ehx(List<eju> $$0, ih<cwp> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().n()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public eij b() {
      return eik.x;
   }

   @Override
   public Set<ejd<?>> a() {
      return ImmutableSet.of(ejg.g);
   }

   @Override
   protected cmx a(cmx $$0, egv $$1) {
      djg $$2 = $$1.c(ejg.g);
      if ($$2 != null) {
         sn $$3 = $$0.w();
         sn $$4;
         if ($$3.b("BlockStateTag", 10)) {
            $$4 = $$3.p("BlockStateTag");
         } else {
            $$4 = new sn();
            $$3.a("BlockStateTag", $$4);
         }

         for (dkj<?> $$6 : this.c) {
            if ($$2.b($$6)) {
               $$4.a($$6.f(), a($$2, $$6));
            }
         }
      }

      return $$0;
   }

   public static ehx.a a(cwp $$0) {
      return new ehx.a($$0);
   }

   private static <T extends Comparable<T>> String a(djg $$0, dkj<T> $$1) {
      T $$2 = $$0.c($$1);
      return $$1.a($$2);
   }

   public static class a extends eih.a<ehx.a> {
      private final ih<cwp> a;
      private final Builder<dkj<?>> b = ImmutableSet.builder();

      a(cwp $$0) {
         this.a = $$0.r();
      }

      public ehx.a a(dkj<?> $$0) {
         if (!this.a.a().n().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected ehx.a a() {
         return this;
      }

      @Override
      public eii b() {
         return new ehx(this.g(), this.a, this.b.build());
      }
   }
}
