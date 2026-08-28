import java.util.List;

public record act(act.a b, List<String> c) implements zg<abu> {
   public static final yx<vw, act> a = zg.a(act::a, act::new);

   private act(vw $$0) {
      this($$0.b(act.a.class), $$0.a(vw::p));
   }

   private void a(vw $$0) {
      $$0.a(this.b);
      $$0.a(this.c, vw::a);
   }

   @Override
   public zi<act> a() {
      return agg.y;
   }

   public void a(abu $$0) {
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
