import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record erp(Optional<Long> b, enz c) implements erh {
   public static final Codec<erp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axe.a(Codec.LONG, "period").forGetter(erp::c), enz.a.fieldOf("value").forGetter(erp::d)).apply($$0, erp::new)
   );

   @Override
   public eri b() {
      return erj.r;
   }

   @Override
   public Set<eqq<?>> a() {
      return this.c.a();
   }

   public boolean a(eoa $$0) {
      aqe $$1 = $$0.d();
      long $$2 = $$1.Z();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static erp.a a(enz $$0) {
      return new erp.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public enz d() {
      return this.c;
   }

   public static class a implements erh.a {
      private Optional<Long> a = Optional.empty();
      private final enz b;

      public a(enz $$0) {
         this.b = $$0;
      }

      public erp.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public erp a() {
         return new erp(this.a, this.b);
      }
   }
}
