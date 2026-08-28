import java.util.UUID;

public record aad(UUID b, aad.a c) implements zf<zy> {
   public static final yw<vv, aad> a = zf.a(aad::a, aad::new);

   private aad(vv $$0) {
      this($$0.n(), $$0.b(aad.a.class));
   }

   private void a(vv $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zh<aad> a() {
      return zx.p;
   }

   public void a(zy $$0) {
      $$0.a(this);
   }

   public aad.a e() {
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
