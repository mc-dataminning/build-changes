import java.util.List;

public record abs(List<jh> c) implements abf {
   public static final zt<ws, abs> a = abf.a(abs::a, abs::new);
   public static final abf.b<abs> b = abf.a("debug/raids");

   private abs(ws $$0) {
      this($$0.a(jh.b));
   }

   private void a(ws $$0) {
      $$0.a(this.c, jh.b);
   }

   @Override
   public abf.b<abs> a() {
      return b;
   }

   public List<jh> b() {
      return this.c;
   }
}
