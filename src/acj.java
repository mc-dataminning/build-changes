import java.util.List;

public record acj(acj.a b, List<String> c) implements yz<abk> {
   public static final yq<vs, acj> a = yz.a(acj::a, acj::new);

   private acj(vs $$0) {
      this($$0.b(acj.a.class), $$0.a(vs::p));
   }

   private void a(vs $$0) {
      $$0.a(this.b);
      $$0.a(this.c, vs::a);
   }

   @Override
   public zb<acj> a() {
      return afv.y;
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
