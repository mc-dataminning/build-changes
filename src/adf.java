import java.util.List;

public record adf(adf.a b, List<String> c) implements zr<acg> {
   public static final zi<wh, adf> a = zr.a(adf::a, adf::new);

   private adf(wh $$0) {
      this($$0.b(adf.a.class), $$0.a(wh::p));
   }

   private void a(wh $$0) {
      $$0.a(this.b);
      $$0.a(this.c, wh::a);
   }

   @Override
   public zt<adf> a() {
      return agz.y;
   }

   public void a(acg $$0) {
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
