import java.util.UUID;

public record aal(aal.a c) implements aam {
   public static final za<vy, aal> a = aam.a(aal::a, aal::new);
   public static final aam.b<aal> b = aam.a("debug/breeze");

   private aal(vy $$0) {
      this(new aal.a($$0));
   }

   private void a(vy $$0) {
      this.c.a($$0);
   }

   @Override
   public aam.b<aal> a() {
      return b;
   }

   public aal.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, Integer c, iw d) {
      public a(vy $$0) {
         this($$0.n(), $$0.readInt(), $$0.c(vy::readInt), $$0.c(iw.b));
      }

      public void a(vy $$0) {
         $$0.a(this.a);
         $$0.q(this.b);
         $$0.a(this.c, vy::q);
         $$0.a(this.d, iw.b);
      }

      public String a() {
         return agp.a(this.a);
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

      public iw e() {
         return this.d;
      }
   }
}
