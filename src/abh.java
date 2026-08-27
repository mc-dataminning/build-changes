import java.util.List;

public record abh(abh.a b, List<String> c) implements xz<aai> {
   public static final xq<us, abh> a = xz.a(abh::a, abh::new);

   private abh(us $$0) {
      this($$0.b(abh.a.class), $$0.a(us::p));
   }

   private void a(us $$0) {
      $$0.a(this.b);
      $$0.a(this.c, us::a);
   }

   @Override
   public yb<abh> a() {
      return aet.y;
   }

   public void a(aai $$0) {
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
