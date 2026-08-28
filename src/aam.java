import java.util.UUID;

public record aam(UUID b, aam.a c) implements zo<aah> {
   public static final zf<we, aam> a = zo.a(aam::a, aam::new);

   private aam(we $$0) {
      this($$0.n(), $$0.b(aam.a.class));
   }

   private void a(we $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zq<aam> a() {
      return aag.p;
   }

   public void a(aah $$0) {
      $$0.a(this);
   }

   public aam.a e() {
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
