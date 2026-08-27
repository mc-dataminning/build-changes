import javax.annotation.Nullable;

public record abk(String a, @Nullable String b) implements xf<za> {
   public abk(ui $$0) {
      this($$0.s(), $$0.c(ui::s));
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.a);
      $$0.a(this.b, ui::a);
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   @Nullable
   public String d() {
      return this.b;
   }
}
