import java.util.List;

public record ade(ade.a b, List<String> c) implements zq<acf> {
   public static final zh<wg, ade> a = zq.a(ade::a, ade::new);

   private ade(wg $$0) {
      this($$0.b(ade.a.class), $$0.a(wg::p));
   }

   private void a(wg $$0) {
      $$0.a(this.b);
      $$0.a(this.c, wg::a);
   }

   @Override
   public zs<ade> a() {
      return agu.y;
   }

   public void a(acf $$0) {
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
