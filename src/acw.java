import java.util.List;

public record acw(acw.a b, List<String> c) implements zj<aby> {
   public static final za<vy, acw> a = zj.a(acw::a, acw::new);

   private acw(vy $$0) {
      this($$0.b(acw.a.class), $$0.a(vy::p));
   }

   private void a(vy $$0) {
      $$0.a(this.b);
      $$0.a(this.c, vy::a);
   }

   @Override
   public zl<acw> a() {
      return agr.x;
   }

   public void a(aby $$0) {
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
