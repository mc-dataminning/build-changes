import java.util.List;

public record adq(adq.a b, List<String> c) implements aac<acr> {
   public static final zt<ws, adq> a = aac.a(adq::a, adq::new);

   private adq(ws $$0) {
      this($$0.b(adq.a.class), $$0.a(ws::p));
   }

   private void a(ws $$0) {
      $$0.a(this.b);
      $$0.a(this.c, ws::a);
   }

   @Override
   public aae<adq> a() {
      return ahk.y;
   }

   public void a(acr $$0) {
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
