import java.util.UUID;

public record aal(aal.a c) implements aam {
   public static final zc<we, aal> a = aam.a(aal::a, aal::new);
   public static final aam.b<aal> b = aam.a("debug/breeze");

   private aal(we $$0) {
      this(new aal.a($$0));
   }

   private void a(we $$0) {
      this.c.a($$0);
   }

   @Override
   public aam.b<aal> a() {
      return b;
   }

   public aal.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, Integer c, ir d) {
      public a(we $$0) {
         this($$0.n(), $$0.readInt(), $$0.c(we::readInt), $$0.c(ir.b));
      }

      public void a(we $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c, we::p);
         $$0.a(this.d, ir.b);
      }

      public String a() {
         return agh.a(this.a);
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

      public ir e() {
         return this.d;
      }
   }
}
