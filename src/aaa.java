import java.util.UUID;

public record aaa(UUID b, aaa.a c) implements zc<zv> {
   public static final yt<vr, aaa> a = zc.a(aaa::a, aaa::new);

   private aaa(vr $$0) {
      this($$0.n(), $$0.b(aaa.a.class));
   }

   private void a(vr $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public ze<aaa> a() {
      return zu.p;
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
