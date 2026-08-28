import java.util.UUID;

public record aae(UUID b, aae.a c) implements zg<zz> {
   public static final yx<vw, aae> a = zg.a(aae::a, aae::new);

   private aae(vw $$0) {
      this($$0.n(), $$0.b(aae.a.class));
   }

   private void a(vw $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zi<aae> a() {
      return zy.p;
   }

   public void a(zz $$0) {
      $$0.a(this);
   }

   public aae.a e() {
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
