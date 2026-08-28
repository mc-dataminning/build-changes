import java.util.UUID;

public record aav(aav.a c) implements aaw {
   public static final zm<wl, aav> a = aaw.a(aav::a, aav::new);
   public static final aaw.b<aav> b = aaw.a("debug/breeze");

   private aav(wl $$0) {
      this(new aav.a($$0));
   }

   private void a(wl $$0) {
      this.c.a($$0);
   }

   @Override
   public aaw.b<aav> a() {
      return b;
   }

   public aav.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, Integer c, iz d) {
      public a(wl $$0) {
         this($$0.n(), $$0.readInt(), $$0.c(wl::readInt), $$0.c(iz.b));
      }

      public void a(wl $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c, wl::p);
         $$0.a(this.d, iz.b);
      }

      public String a() {
         return agr.a(this.a);
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
