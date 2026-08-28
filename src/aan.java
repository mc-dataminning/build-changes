import java.util.UUID;

public record aan(aan.a c) implements aao {
   public static final zc<wb, aan> a = aao.a(aan::a, aan::new);
   public static final aao.b<aan> b = aao.a("debug/breeze");

   private aan(wb $$0) {
      this(new aan.a($$0));
   }

   private void a(wb $$0) {
      this.c.a($$0);
   }

   @Override
   public aao.b<aan> a() {
      return b;
   }

   public aan.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, Integer c, jf d) {
      public a(wb $$0) {
         this($$0.n(), $$0.readInt(), $$0.c(wb::readInt), $$0.c(jf.b));
      }

      public void a(wb $$0) {
         $$0.a(this.a);
         $$0.q(this.b);
         $$0.a(this.c, wb::q);
         $$0.a(this.d, jf.b);
      }

      public String a() {
         return agn.a(this.a);
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

      public jf e() {
         return this.d;
      }
   }
}
