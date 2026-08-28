import javax.annotation.Nullable;

public class aic implements zf<agp> {
   public static final yw<vu, aic> a = zf.a(aic::a, aic::new);
   private final aic.a b;
   @Nullable
   private final alg c;

   public aic(aic.a $$0, @Nullable alg $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static aic a(aj $$0) {
      return new aic(aic.a.a, $$0.a());
   }

   public static aic b() {
      return new aic(aic.a.b, null);
   }

   private aic(vu $$0) {
      this.b = $$0.b(aic.a.class);
      if (this.b == aic.a.a) {
         this.c = $$0.q();
      } else {
         this.c = null;
      }
   }

   private void a(vu $$0) {
      $$0.a(this.b);
      if (this.b == aic.a.a) {
         $$0.a(this.c);
      }
   }

   @Override
   public zh<aic> a() {
      return agn.bZ;
   }

   public void a(agp $$0) {
      $$0.a(this);
   }

   public aic.a e() {
      return this.b;
   }

   @Nullable
   public alg f() {
      return this.c;
   }

   public static enum a {
      a,
      b;
   }
}
