import java.util.UUID;

public record aah(aah.a c) implements aai {
   public static final yw<vv, aah> a = aai.a(aah::a, aah::new);
   public static final aai.b<aah> b = aai.a("debug/breeze");

   private aah(vv $$0) {
      this(new aah.a($$0));
   }

   private void a(vv $$0) {
      this.c.a($$0);
   }

   @Override
   public aai.b<aah> a() {
      return b;
   }

   public aah.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, Integer c, jd d) {
      public a(vv $$0) {
         this($$0.n(), $$0.readInt(), $$0.c(vv::readInt), $$0.c(jd.b));
      }

      public void a(vv $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c, vv::p);
         $$0.a(this.d, jd.b);
      }

      public String a() {
         return agd.a(this.a);
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

      public jd e() {
         return this.d;
      }
   }
}
