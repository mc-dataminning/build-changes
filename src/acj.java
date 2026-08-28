import java.util.List;

public record acj(acj.a b, List<String> c) implements yv<abk> {
   public static final ym<vl, acj> a = yv.a(acj::a, acj::new);

   private acj(vl $$0) {
      this($$0.b(acj.a.class), $$0.a(vl::p));
   }

   private void a(vl $$0) {
      $$0.a(this.b);
      $$0.a(this.c, vl::a);
   }

   @Override
   public yx<acj> a() {
      return agd.y;
   }

   public void a(abk $$0) {
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
