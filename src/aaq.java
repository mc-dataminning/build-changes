import java.util.UUID;

public record aaq(aaq.a c) implements aar {
   public static final zf<we, aaq> a = aar.a(aaq::a, aaq::new);
   public static final aar.b<aaq> b = aar.a("debug/breeze");

   private aaq(we $$0) {
      this(new aaq.a($$0));
   }

   private void a(we $$0) {
      this.c.a($$0);
   }

   @Override
   public aar.b<aaq> a() {
      return b;
   }

   public aaq.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, Integer c, jg d) {
      public a(we $$0) {
         this($$0.n(), $$0.readInt(), $$0.c(we::readInt), $$0.c(jg.b));
      }

      public void a(we $$0) {
         $$0.a(this.a);
         $$0.q(this.b);
         $$0.a(this.c, we::q);
         $$0.a(this.d, jg.b);
      }

      public String a() {
         return agq.a(this.a);
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

      public jg e() {
         return this.d;
      }
   }
}
