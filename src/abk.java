import javax.annotation.Nullable;

public record abk(akh b, @Nullable byte[] c) implements zb<abj> {
   public static final ys<vu, abk> a = zb.a(abk::a, abk::new);

   private abk(vu $$0) {
      this($$0.q(), $$0.c(zo.b));
   }

   private void a(vu $$0) {
      $$0.a(this.b);
      $$0.a(this.c, zo.b);
   }

   @Override
   public zd<abk> a() {
      return abi.b;
   }

   public void a(abj $$0) {
      $$0.a(this);
   }

   @Nullable
   public byte[] e() {
      return this.c;
   }
}
