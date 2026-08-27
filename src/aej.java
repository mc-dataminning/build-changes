import javax.annotation.Nullable;

public record aej(String b, @Nullable String c) implements zl<abw> {
   public static final zc<we, aej> a = zl.a(aej::a, aej::new);

   private aej(we $$0) {
      this($$0.p(), $$0.c(we::p));
   }

   private void a(we $$0) {
      $$0.a(this.b);
      $$0.a(this.c, we::a);
   }

   @Override
   public zn<aej> a() {
      return agj.ce;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   @Nullable
   public String e() {
      return this.c;
   }
}
