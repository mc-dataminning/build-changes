import javax.annotation.Nullable;

public record aej(String b, @Nullable String c) implements zd<abs> {
   public static final yu<vs, aej> a = zd.a(aej::a, aej::new);

   private aej(vs $$0) {
      this($$0.p(), $$0.c(vs::p));
   }

   private void a(vs $$0) {
      $$0.a(this.b);
      $$0.a(this.c, vs::a);
   }

   @Override
   public zf<aej> a() {
      return agl.cp;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   @Nullable
   public String e() {
      return this.c;
   }
}
