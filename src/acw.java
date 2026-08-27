import java.util.List;

public record acw(acw.a b, List<String> c) implements zl<abw> {
   public static final zc<we, acw> a = zl.a(acw::a, acw::new);

   private acw(we $$0) {
      this($$0.b(acw.a.class), $$0.a(we::p));
   }

   private void a(we $$0) {
      $$0.a(this.b);
      $$0.a(this.c, we::a);
   }

   @Override
   public zn<acw> a() {
      return agj.z;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public List<String> e() {
      return this.c;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
