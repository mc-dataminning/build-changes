import java.util.UUID;

public record ahk(String b, UUID c) implements xz<ahi> {
   public static final xq<us, ahk> a = xz.a(ahk::a, ahk::new);

   private ahk(us $$0) {
      this($$0.d(16), $$0.n());
   }

   private void a(us $$0) {
      $$0.a(this.b, 16);
      $$0.a(this.c);
   }

   @Override
   public yb<ahk> a() {
      return ahg.g;
   }

   public void a(ahi $$0) {
      $$0.a(this);
   }

   public UUID e() {
      return this.c;
   }
}
