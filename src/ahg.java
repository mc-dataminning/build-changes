import java.util.UUID;

public record ahg(String b, UUID c) implements xx<ahe> {
   public static final xo<uq, ahg> a = xx.a(ahg::a, ahg::new);

   private ahg(uq $$0) {
      this($$0.d(16), $$0.p());
   }

   private void a(uq $$0) {
      $$0.a(this.b, 16);
      $$0.a(this.c);
   }

   @Override
   public xz<ahg> a() {
      return ahc.g;
   }

   public void a(ahe $$0) {
      $$0.a(this);
   }

   public UUID e() {
      return this.c;
   }
}
