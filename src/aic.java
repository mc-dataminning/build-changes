import java.util.UUID;

public record aic(String b, UUID c) implements yp<aia> {
   public static final yg<vi, aic> a = yp.a(aic::a, aic::new);

   private aic(vi $$0) {
      this($$0.d(16), $$0.n());
   }

   private void a(vi $$0) {
      $$0.a(this.b, 16);
      $$0.a(this.c);
   }

   @Override
   public yr<aic> a() {
      return ahy.g;
   }

   public void a(aia $$0) {
      $$0.a(this);
   }

   public UUID e() {
      return this.c;
   }
}
