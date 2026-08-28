import java.util.List;

public record acj(acj.a b, List<String> c) implements yw<abl> {
   public static final yn<vl, acj> a = yw.a(acj::a, acj::new);

   private acj(vl $$0) {
      this($$0.b(acj.a.class), $$0.a(vl::p));
   }

   private void a(vl $$0) {
      $$0.a(this.b);
      $$0.a(this.c, vl::a);
   }

   @Override
   public yy<acj> a() {
      return agd.x;
   }

   public void a(abl $$0) {
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
