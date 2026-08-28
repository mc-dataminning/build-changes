import java.util.UUID;

public record aaq(UUID b, aaq.a c) implements zs<aal> {
   public static final zj<wi, aaq> a = zs.a(aaq::a, aaq::new);

   private aaq(wi $$0) {
      this($$0.n(), $$0.b(aaq.a.class));
   }

   private void a(wi $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zu<aaq> a() {
      return aak.p;
   }

   public void a(aal $$0) {
      $$0.a(this);
   }

   public aaq.a e() {
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
