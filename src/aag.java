import javax.annotation.Nullable;

public record aag(ajc b, @Nullable byte[] c) implements xz<aaf> {
   public static final xq<us, aag> a = xz.a(aag::a, aag::new);

   private aag(us $$0) {
      this($$0.q(), $$0.c(ym.b));
   }

   private void a(us $$0) {
      $$0.a(this.b);
      $$0.a(this.c, ym.b);
   }

   @Override
   public yb<aag> a() {
      return aae.b;
   }

   public void a(aaf $$0) {
      $$0.a(this);
   }

   @Nullable
   public byte[] e() {
      return this.c;
   }
}
