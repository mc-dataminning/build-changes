import java.util.UUID;

public record aah(UUID b, aah.a c) implements zl<aac> {
   public static final zc<we, aah> a = zl.a(aah::a, aah::new);

   private aah(we $$0) {
      this($$0.n(), $$0.b(aah.a.class));
   }

   private void a(we $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zn<aah> a() {
      return aab.n;
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
