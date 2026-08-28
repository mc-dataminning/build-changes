import javax.annotation.Nullable;

public record acd(alr b, @Nullable byte[] c) implements zo<acc> {
   public static final ze<vy, acd> a = zo.a(acd::a, acd::new);

   private acd(vy $$0) {
      this($$0.q(), $$0.c(aaf.b));
   }

   private void a(vy $$0) {
      $$0.a(this.b);
      $$0.a(this.c, aaf.b);
   }

   @Override
   public zq<acd> a() {
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
