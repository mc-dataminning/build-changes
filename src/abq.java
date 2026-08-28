import javax.annotation.Nullable;

public record abq(ale b, @Nullable byte[] c) implements zd<abp> {
   public static final yu<vs, abq> a = zd.a(abq::a, abq::new);

   private abq(vs $$0) {
      this($$0.q(), $$0.c(zs.b));
   }

   private void a(vs $$0) {
      $$0.a(this.b);
      $$0.a(this.c, zs.b);
   }

   @Override
   public zf<abq> a() {
      return abo.b;
   }

   public void a(abp $$0) {
      $$0.a(this);
   }

   @Nullable
   public byte[] e() {
      return this.c;
   }
}
