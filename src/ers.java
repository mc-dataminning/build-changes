import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ers extends esb {
   public static final MapCodec<ers> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(euw.a.fieldOf("levels").forGetter($$0x -> $$0x.b), jy.a(lr.aK).optionalFieldOf("options").forGetter($$0x -> $$0x.c)))
            .apply($$0, ers::new)
   );
   private final euv b;
   private final Optional<jn<czj>> c;

   ers(List<etz> $$0, euv $$1, Optional<jn<czj>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public esd<ers> b() {
      return ese.g;
   }

   @Override
   public Set<eth<?>> a() {
      return this.b.a();
   }

   @Override
   public cua a(cua $$0, eqo $$1) {
      aym $$2 = $$1.b();
      jx $$3 = $$1.d().H_();
      return czl.a($$2, $$0, this.b.a($$1), $$3, this.c);
   }

   public static ers.a a(jl.a $$0, euv $$1) {
      return new ers.a($$1).a($$0.b(lr.aK).b(avx.n));
   }

   public static class a extends esb.a<ers.a> {
      private final euv a;
      private Optional<jn<czj>> b = Optional.empty();

      public a(euv $$0) {
         this.a = $$0;
      }

      protected ers.a a() {
         return this;
      }

      public ers.a a(jn<czj> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      @Override
      public esc b() {
         return new ers(this.g(), this.a, this.b);
      }
   }
}
