import javax.annotation.Nullable;

public record acd(alj b, @Nullable byte[] c) implements zq<acc> {
   public static final zh<wg, acd> a = zq.a(acd::a, acd::new);

   private acd(wg $$0) {
      this($$0.q(), $$0.c(aaf.b));
   }

   private void a(wg $$0) {
      $$0.a(this.b);
      $$0.a(this.c, aaf.b);
   }

   @Override
   public zs<acd> a() {
      return acb.b;
   }

   public void a(acc $$0) {
      $$0.a(this);
   }

   @Nullable
   public byte[] e() {
      return this.c;
   }
}
