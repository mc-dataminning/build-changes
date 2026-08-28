import java.util.UUID;

public record abe(abe.a c) implements abf {
   public static final zt<ws, abe> a = abf.a(abe::a, abe::new);
   public static final abf.b<abe> b = abf.a("debug/breeze");

   private abe(ws $$0) {
      this(new abe.a($$0));
   }

   private void a(ws $$0) {
      this.c.a($$0);
   }

   @Override
   public abf.b<abe> a() {
      return b;
   }

   public abe.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, Integer c, jh d) {
      public a(ws $$0) {
         this($$0.n(), $$0.readInt(), $$0.c(ws::readInt), $$0.c(jh.b));
      }

      public void a(ws $$0) {
         $$0.a(this.a);
         $$0.q(this.b);
         $$0.a(this.c, ws::q);
         $$0.a(this.d, jh.b);
      }

      public String a() {
         return ahi.a(this.a);
      }

      @Override
      public String toString() {
         return this.a();
      }

      public UUID b() {
         return this.a;
      }

      public int c() {
         return this.b;
      }

      public Integer d() {
         return this.c;
      }

      public jh e() {
         return this.d;
      }
   }
}
