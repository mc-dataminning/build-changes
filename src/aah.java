import java.util.UUID;

public record aah(UUID b, aah.a c) implements zj<aac> {
   public static final za<vy, aah> a = zj.a(aah::a, aah::new);

   private aah(vy $$0) {
      this($$0.n(), $$0.b(aah.a.class));
   }

   private void a(vy $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zl<aah> a() {
      return aab.p;
   }

   public void a(aac $$0) {
      $$0.a(this);
   }

   public aah.a e() {
      return this.c;
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e,
      f,
      g,
      h;

      public boolean a() {
         return this != d && this != e;
      }
   }
}
