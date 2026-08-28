import java.util.UUID;

public record aaw(aaw.a c) implements aax {
   public static final zn<wm, aaw> a = aax.a(aaw::a, aaw::new);
   public static final aax.b<aaw> b = aax.a("debug/breeze");

   private aaw(wm $$0) {
      this(new aaw.a($$0));
   }

   private void a(wm $$0) {
      this.c.a($$0);
   }

   @Override
   public aax.b<aaw> a() {
      return b;
   }

   public aaw.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, Integer c, iz d) {
      public a(wm $$0) {
         this($$0.n(), $$0.readInt(), $$0.c(wm::readInt), $$0.c(iz.b));
      }

      public void a(wm $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c, wm::p);
         $$0.a(this.d, iz.b);
      }

      public String a() {
         return ags.a(this.a);
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

      public iz e() {
         return this.d;
      }
   }
}
