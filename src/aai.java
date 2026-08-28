import java.util.UUID;

public record aai(aai.a c) implements aaj {
   public static final yx<vw, aai> a = aaj.a(aai::a, aai::new);
   public static final aaj.b<aai> b = aaj.a("debug/breeze");

   private aai(vw $$0) {
      this(new aai.a($$0));
   }

   private void a(vw $$0) {
      this.c.a($$0);
   }

   @Override
   public aaj.b<aai> a() {
      return b;
   }

   public aai.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, Integer c, jd d) {
      public a(vw $$0) {
         this($$0.n(), $$0.readInt(), $$0.c(vw::readInt), $$0.c(jd.b));
      }

      public void a(vw $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c, vw::p);
         $$0.a(this.d, jd.b);
      }

      public String a() {
         return age.a(this.a);
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
