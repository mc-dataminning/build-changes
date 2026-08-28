import java.util.UUID;

public record aao(UUID b, aao.a c) implements zo<aaj> {
   public static final ze<vy, aao> a = zo.a(aao::a, aao::new);

   private aao(vy $$0) {
      this($$0.n(), $$0.b(aao.a.class));
   }

   private void a(vy $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zq<aao> a() {
      return aai.p;
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
