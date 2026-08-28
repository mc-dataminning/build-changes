import javax.annotation.Nullable;

public record afj(String b, @Nullable String c) implements aac<acr> {
   public static final zt<ws, afj> a = aac.a(afj::a, afj::new);

   private afj(ws $$0) {
      this($$0.p(), $$0.c(ws::p));
   }

   private void a(ws $$0) {
      $$0.a(this.b);
      $$0.a(this.c, ws::a);
   }

   @Override
   public aae<afj> a() {
      return ahk.cl;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   @Nullable
   public String e() {
      return this.c;
   }
}
