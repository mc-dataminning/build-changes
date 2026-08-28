import javax.annotation.Nullable;

public record abs(alg b, @Nullable byte[] c) implements zf<abr> {
   public static final yw<vu, abs> a = zf.a(abs::a, abs::new);

   private abs(vu $$0) {
      this($$0.q(), $$0.c(zu.b));
   }

   private void a(vu $$0) {
      $$0.a(this.b);
      $$0.a(this.c, zu.b);
   }

   @Override
   public zh<abs> a() {
      return abq.b;
   }

   public void a(abr $$0) {
      $$0.a(this);
   }

   @Nullable
   public byte[] e() {
      return this.c;
   }
}
