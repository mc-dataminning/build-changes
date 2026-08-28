import java.util.UUID;

public record aba(UUID b, aba.a c) implements aac<aav> {
   public static final zt<ws, aba> a = aac.a(aba::a, aba::new);

   private aba(ws $$0) {
      this($$0.n(), $$0.b(aba.a.class));
   }

   private void a(ws $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public aae<aba> a() {
      return aau.p;
   }

   public void a(aav $$0) {
      $$0.a(this);
   }

   public aba.a e() {
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
