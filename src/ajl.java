import java.util.UUID;

public record ajl(String b, UUID c) implements zv<ajj> {
   public static final zm<wl, ajl> a = zv.a(ajl::a, ajl::new);

   private ajl(wl $$0) {
      this($$0.d(16), $$0.n());
   }

   private void a(wl $$0) {
      $$0.a(this.b, 16);
      $$0.a(this.c);
   }

   @Override
   public zx<ajl> a() {
      return ajh.g;
   }

   public void a(ajj $$0) {
      $$0.a(this);
   }

   public UUID e() {
      return this.c;
   }
}
