import java.util.UUID;

public record ajm(String b, UUID c) implements zw<ajk> {
   public static final zn<wm, ajm> a = zw.a(ajm::a, ajm::new);

   private ajm(wm $$0) {
      this($$0.d(16), $$0.n());
   }

   private void a(wm $$0) {
      $$0.a(this.b, 16);
      $$0.a(this.c);
   }

   @Override
   public zy<ajm> a() {
      return aji.g;
   }

   public void a(ajk $$0) {
      $$0.a(this);
   }

   public UUID e() {
      return this.c;
   }
}
