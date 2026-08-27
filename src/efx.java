import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record efx(Optional<Long> b, ecp c) implements efp {
   public static final Codec<efx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(arf.a(Codec.LONG, "period").forGetter(efx::c), ecp.a.fieldOf("value").forGetter(efx::d)).apply($$0, efx::new)
   );

   @Override
   public efq b() {
      return efr.r;
   }

   @Override
   public Set<eey<?>> a() {
      return this.c.a();
   }

   public boolean a(ecq $$0) {
      akq $$1 = $$0.d();
      long $$2 = $$1.W();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static efx.a a(ecp $$0) {
      return new efx.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public ecp d() {
      return this.c;
   }

   public static class a implements efp.a {
      private Optional<Long> a = Optional.empty();
      private final ecp b;

      public a(ecp $$0) {
         this.b = $$0;
      }

      public efx.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public efx a() {
         return new efx(this.a, this.b);
      }
   }
}
