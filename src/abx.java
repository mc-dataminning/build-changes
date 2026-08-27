import java.util.List;

public record abx(abx.a b, List<String> c) implements yn<aay> {
   public static final ye<vg, abx> a = yn.a(abx::a, abx::new);

   private abx(vg $$0) {
      this($$0.b(abx.a.class), $$0.a(vg::p));
   }

   private void a(vg $$0) {
      $$0.a(this.b);
      $$0.a(this.c, vg::a);
   }

   @Override
   public yp<abx> a() {
      return afj.y;
   }

   public void a(aay $$0) {
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
