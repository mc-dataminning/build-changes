import java.util.UUID;

public record aar(UUID b, aar.a c) implements zv<aam> {
   public static final zm<wl, aar> a = zv.a(aar::a, aar::new);

   private aar(wl $$0) {
      this($$0.n(), $$0.b(aar.a.class));
   }

   private void a(wl $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zx<aar> a() {
      return aal.n;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public aar.a e() {
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
