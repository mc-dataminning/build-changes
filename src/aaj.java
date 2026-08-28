import java.util.UUID;

public record aaj(aaj.a c) implements aak {
   public static final yy<vw, aaj> a = aak.a(aaj::a, aaj::new);
   public static final aak.b<aaj> b = aak.a("debug/breeze");

   private aaj(vw $$0) {
      this(new aaj.a($$0));
   }

   private void a(vw $$0) {
      this.c.a($$0);
   }

   @Override
   public aak.b<aaj> a() {
      return b;
   }

   public aaj.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, Integer c, iv d) {
      public a(vw $$0) {
         this($$0.n(), $$0.readInt(), $$0.c(vw::readInt), $$0.c(iv.b));
      }

      public void a(vw $$0) {
         $$0.a(this.a);
         $$0.q(this.b);
         $$0.a(this.c, vw::q);
         $$0.a(this.d, iv.b);
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

      public iv e() {
         return this.d;
      }
   }
}
