import java.util.UUID;

public record aaa(UUID b, aaa.a c) implements ze<zv> {
   public static final yv<vx, aaa> a = ze.a(aaa::a, aaa::new);

   private aaa(vx $$0) {
      this($$0.n(), $$0.b(aaa.a.class));
   }

   private void a(vx $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zg<aaa> a() {
      return zu.n;
   }

   public void a(zv $$0) {
      $$0.a(this);
   }

   public aaa.a e() {
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
