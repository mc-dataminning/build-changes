import java.util.UUID;

public record aab(UUID b, aab.a c) implements zd<zw> {
   public static final yu<vs, aab> a = zd.a(aab::a, aab::new);

   private aab(vs $$0) {
      this($$0.n(), $$0.b(aab.a.class));
   }

   private void a(vs $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zf<aab> a() {
      return zv.p;
   }

   public void a(zw $$0) {
      $$0.a(this);
   }

   public aab.a e() {
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
