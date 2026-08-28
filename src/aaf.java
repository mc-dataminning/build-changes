import java.util.UUID;

public record aaf(aaf.a c) implements aag {
   public static final yu<vs, aaf> a = aag.a(aaf::a, aaf::new);
   public static final aag.b<aaf> b = aag.a("debug/breeze");

   private aaf(vs $$0) {
      this(new aaf.a($$0));
   }

   private void a(vs $$0) {
      this.c.a($$0);
   }

   @Override
   public aag.b<aaf> a() {
      return b;
   }

   public aaf.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, Integer c, iu d) {
      public a(vs $$0) {
         this($$0.n(), $$0.readInt(), $$0.c(vs::readInt), $$0.c(iu.b));
      }

      public void a(vs $$0) {
         $$0.a(this.a);
         $$0.q(this.b);
         $$0.a(this.c, vs::q);
         $$0.a(this.d, iu.b);
      }

      public String a() {
         return agj.a(this.a);
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

      public iu e() {
         return this.d;
      }
   }
}
