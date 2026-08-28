import java.util.UUID;

public record aah(aah.a c) implements aai {
   public static final yw<vu, aah> a = aai.a(aah::a, aah::new);
   public static final aai.b<aah> b = aai.a("debug/breeze");

   private aah(vu $$0) {
      this(new aah.a($$0));
   }

   private void a(vu $$0) {
      this.c.a($$0);
   }

   @Override
   public aai.b<aah> a() {
      return b;
   }

   public aah.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, Integer c, iv d) {
      public a(vu $$0) {
         this($$0.n(), $$0.readInt(), $$0.c(vu::readInt), $$0.c(iv.b));
      }

      public void a(vu $$0) {
         $$0.a(this.a);
         $$0.q(this.b);
         $$0.a(this.c, vu::q);
         $$0.a(this.d, iv.b);
      }

      public String a() {
         return agl.a(this.a);
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

      public iv e() {
         return this.d;
      }
   }
}
