import java.util.UUID;

public record aab(aab.a c) implements aac {
   public static final ys<vu, aab> a = aac.a(aab::a, aab::new);
   public static final aac.b<aab> b = aac.a("debug/breeze");

   private aab(vu $$0) {
      this(new aab.a($$0));
   }

   private void a(vu $$0) {
      this.c.a($$0);
   }

   @Override
   public aac.b<aab> a() {
      return b;
   }

   public aab.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, Integer c, in d) {
      public a(vu $$0) {
         this($$0.n(), $$0.readInt(), $$0.c(vu::readInt), $$0.c(in.b));
      }

      public void a(vu $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c, vu::p);
         $$0.a(this.d, in.b);
      }

      public String a() {
         return afv.a(this.a);
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

      public in e() {
         return this.d;
      }
   }
}
