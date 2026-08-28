import java.util.UUID;

public record aau(aau.a c) implements aav {
   public static final zj<wi, aau> a = aav.a(aau::a, aau::new);
   public static final aav.b<aau> b = aav.a("debug/breeze");

   private aau(wi $$0) {
      this(new aau.a($$0));
   }

   private void a(wi $$0) {
      this.c.a($$0);
   }

   @Override
   public aav.b<aau> a() {
      return b;
   }

   public aau.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, Integer c, jh d) {
      public a(wi $$0) {
         this($$0.n(), $$0.readInt(), $$0.c(wi::readInt), $$0.c(jh.b));
      }

      public void a(wi $$0) {
         $$0.a(this.a);
         $$0.q(this.b);
         $$0.a(this.c, wi::q);
         $$0.a(this.d, jh.b);
      }

      public String a() {
         return agu.a(this.a);
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
