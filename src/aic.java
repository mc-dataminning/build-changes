import javax.annotation.Nullable;

public class aic implements zl<agr> {
   public static final zc<wb, aic> a = zl.a(aic::a, aic::new);
   private final aic.a b;
   @Nullable
   private final ale c;

   public aic(aic.a $$0, @Nullable ale $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static aic a(ag $$0) {
      return new aic(aic.a.a, $$0.a());
   }

   public static aic b() {
      return new aic(aic.a.b, null);
   }

   private aic(wb $$0) {
      this.b = $$0.b(aic.a.class);
      if (this.b == aic.a.a) {
         this.c = $$0.q();
      } else {
         this.c = null;
      }
   }

   private void a(wb $$0) {
      $$0.a(this.b);
      if (this.b == aic.a.a) {
         $$0.a(this.c);
      }
   }

   @Override
   public zn<aic> a() {
      return agp.bT;
   }

   public void a(agr $$0) {
      $$0.a(this);
   }

   public aic.a e() {
      return this.b;
   }

   @Nullable
   public ale f() {
      return this.c;
   }

   public static enum a {
      a,
      b;
   }
}
