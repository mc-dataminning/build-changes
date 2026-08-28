import javax.annotation.Nullable;

public record aew(String b, @Nullable String c) implements zo<acf> {
   public static final ze<vy, aew> a = zo.a(aew::a, aew::new);

   private aew(vy $$0) {
      this($$0.p(), $$0.c(vy::p));
   }

   private void a(vy $$0) {
      $$0.a(this.b);
      $$0.a(this.c, vy::a);
   }

   @Override
   public zq<aew> a() {
      return agy.cp;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   @Nullable
   public String e() {
      return this.c;
   }
}
