import java.util.UUID;

public record ajj(String b, UUID c) implements zl<ajh> {
   public static final zc<wb, ajj> a = zl.a(ajj::a, ajj::new);

   private ajj(wb $$0) {
      this($$0.d(16), $$0.n());
   }

   private void a(wb $$0) {
      $$0.a(this.b, 16);
      $$0.a(this.c);
   }

   @Override
   public zn<ajj> a() {
      return ajf.g;
   }

   public void a(ajh $$0) {
      $$0.a(this);
   }

   public UUID e() {
      return this.c;
   }
}
