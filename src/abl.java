import java.util.List;

public record abl(abl.a b, List<String> c) implements yb<aam> {
   public static final xs<uu, abl> a = yb.a(abl::a, abl::new);

   private abl(uu $$0) {
      this($$0.b(abl.a.class), $$0.a(uu::p));
   }

   private void a(uu $$0) {
      $$0.a(this.b);
      $$0.a(this.c, uu::a);
   }

   @Override
   public yd<abl> a() {
      return aex.y;
   }

   public void a(aam $$0) {
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
