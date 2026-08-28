import java.util.UUID;

public record aaj(UUID b, aaj.a c) implements zl<aae> {
   public static final zc<wb, aaj> a = zl.a(aaj::a, aaj::new);

   private aaj(wb $$0) {
      this($$0.n(), $$0.b(aaj.a.class));
   }

   private void a(wb $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zn<aaj> a() {
      return aad.p;
   }

   public void a(aae $$0) {
      $$0.a(this);
   }

   public aaj.a e() {
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
