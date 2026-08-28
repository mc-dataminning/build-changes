import java.util.UUID;

public record aab(aab.a c) implements aac {
   public static final ys<vr, aab> a = aac.a(aab::a, aab::new);
   public static final aac.b<aab> b = aac.a("debug/breeze");

   private aab(vr $$0) {
      this(new aab.a($$0));
   }

   private void a(vr $$0) {
      this.c.a($$0);
   }

   @Override
   public aac.b<aab> a() {
      return b;
   }

   public aab.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, Integer c, ja d) {
      public a(vr $$0) {
         this($$0.n(), $$0.readInt(), $$0.c(vr::readInt), $$0.c(ja.b));
      }

      public void a(vr $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c, vr::p);
         $$0.a(this.d, ja.b);
      }

      public String a() {
         return afx.a(this.a);
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

      public ja e() {
         return this.d;
      }
   }
}
