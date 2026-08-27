import java.util.UUID;

public record aae(aae.a c) implements aaf {
   public static final yv<vx, aae> a = aaf.a(aae::a, aae::new);
   public static final aaf.b<aae> b = aaf.a("debug/breeze");

   private aae(vx $$0) {
      this(new aae.a($$0));
   }

   private void a(vx $$0) {
      this.c.a($$0);
   }

   @Override
   public aaf.b<aae> a() {
      return b;
   }

   public aae.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, Integer c, io d) {
      public a(vx $$0) {
         this($$0.n(), $$0.readInt(), $$0.c(vx::readInt), $$0.c(io.b));
      }

      public void a(vx $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c, vx::p);
         $$0.a(this.d, io.b);
      }

      public String a() {
         return aga.a(this.a);
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

      public io e() {
         return this.d;
      }
   }
}
