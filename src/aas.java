import java.util.UUID;

public record aas(UUID b, aas.a c) implements zw<aan> {
   public static final zn<wm, aas> a = zw.a(aas::a, aas::new);

   private aas(wm $$0) {
      this($$0.n(), $$0.b(aas.a.class));
   }

   private void a(wm $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zy<aas> a() {
      return aam.n;
   }

   public void a(aan $$0) {
      $$0.a(this);
   }

   public aas.a e() {
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
