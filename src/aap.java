import java.util.UUID;

public record aap(UUID b, aap.a c) implements zr<aak> {
   public static final zi<wh, aap> a = zr.a(aap::a, aap::new);

   private aap(wh $$0) {
      this($$0.n(), $$0.b(aap.a.class));
   }

   private void a(wh $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zt<aap> a() {
      return aaj.p;
   }

   public void a(aak $$0) {
      $$0.a(this);
   }

   public aap.a e() {
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
