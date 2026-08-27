import javax.annotation.Nullable;

public record acr(String b, @Nullable String c) implements xx<aag> {
   public static final xo<uq, acr> a = xx.a(acr::a, acr::new);

   private acr(uq $$0) {
      this($$0.r(), $$0.c(uq::r));
   }

   private void a(uq $$0) {
      $$0.a(this.b);
      $$0.a(this.c, uq::a);
   }

   @Override
   public xz<acr> a() {
      return aeq.ca;
   }

   public void a(aag $$0) {
      $$0.a(this);
   }

   @Nullable
   public String e() {
      return this.c;
   }
}
