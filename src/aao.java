import java.util.UUID;

public record aao(UUID b, aao.a c) implements zs<aaj> {
   public static final zj<wl, aao> a = zs.a(aao::a, aao::new);

   private aao(wl $$0) {
      this($$0.n(), $$0.b(aao.a.class));
   }

   private void a(wl $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zu<aao> a() {
      return aai.n;
   }

   public void a(aaj $$0) {
      $$0.a(this);
   }

   public aao.a e() {
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
