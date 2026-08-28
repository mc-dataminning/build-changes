import java.util.UUID;

public record ajn(String b, UUID c) implements zh<ajl> {
   public static final yy<vw, ajn> a = zh.a(ajn::a, ajn::new);

   private ajn(vw $$0) {
      this($$0.d(16), $$0.n());
   }

   private void a(vw $$0) {
      $$0.a(this.b, 16);
      $$0.a(this.c);
   }

   @Override
   public zj<ajn> a() {
      return ajj.g;
   }

   public void a(ajl $$0) {
      $$0.a(this);
   }

   public UUID e() {
      return this.c;
   }
}
