import javax.annotation.Nullable;

public record abh(String a, @Nullable String b) implements xd<yx> {
   public abh(ug $$0) {
      this($$0.s(), $$0.c(ug::s));
   }

   @Override
   public void a(ug $$0) {
      $$0.a(this.a);
      $$0.a(this.b, ug::a);
   }

   public void a(yx $$0) {
      $$0.a(this);
   }

   @Nullable
   public String d() {
      return this.b;
   }
}
