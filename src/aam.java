import java.util.UUID;

public record aam(aam.a c) implements aan {
   public static final zb<wa, aam> a = aan.a(aam::a, aam::new);
   public static final aan.b<aam> b = aan.a("debug/breeze");

   private aam(wa $$0) {
      this(new aam.a($$0));
   }

   private void a(wa $$0) {
      this.c.a($$0);
   }

   @Override
   public aan.b<aam> a() {
      return b;
   }

   public aam.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, Integer c, je d) {
      public a(wa $$0) {
         this($$0.n(), $$0.readInt(), $$0.c(wa::readInt), $$0.c(je.b));
      }

      public void a(wa $$0) {
         $$0.a(this.a);
         $$0.q(this.b);
         $$0.a(this.c, wa::q);
         $$0.a(this.d, je.b);
      }

      public String a() {
         return agm.a(this.a);
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

      public je e() {
         return this.d;
      }
   }
}
