import java.util.List;

public record abf(abf.a b, List<String> c) implements xx<aag> {
   public static final xo<uq, abf> a = xx.a(abf::a, abf::new);

   private abf(uq $$0) {
      this($$0.b(abf.a.class), $$0.a(uq::r));
   }

   private void a(uq $$0) {
      $$0.a(this.b);
      $$0.a(this.c, uq::a);
   }

   @Override
   public xz<abf> a() {
      return aeq.y;
   }

   public void a(aag $$0) {
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
