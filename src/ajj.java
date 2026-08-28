import java.util.UUID;

public record ajj(String b, UUID c) implements zd<ajh> {
   public static final yu<vs, ajj> a = zd.a(ajj::a, ajj::new);

   private ajj(vs $$0) {
      this($$0.d(16), $$0.n());
   }

   private void a(vs $$0) {
      $$0.a(this.b, 16);
      $$0.a(this.c);
   }

   @Override
   public zf<ajj> a() {
      return ajf.g;
   }

   public void a(ajh $$0) {
      $$0.a(this);
   }

   public UUID e() {
      return this.c;
   }
}
