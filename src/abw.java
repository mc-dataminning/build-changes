import javax.annotation.Nullable;

public record abw(alk b, @Nullable byte[] c) implements zj<abv> {
   public static final za<vy, abw> a = zj.a(abw::a, abw::new);

   private abw(vy $$0) {
      this($$0.q(), $$0.c(zy.b));
   }

   private void a(vy $$0) {
      $$0.a(this.b);
      $$0.a(this.c, zy.b);
   }

   @Override
   public zl<abw> a() {
      return abu.b;
   }

   public void a(abv $$0) {
      $$0.a(this);
   }

   @Nullable
   public byte[] e() {
      return this.c;
   }
}
