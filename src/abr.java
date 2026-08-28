import javax.annotation.Nullable;

public record abr(akq b, @Nullable byte[] c) implements zf<abq> {
   public static final yw<vv, abr> a = zf.a(abr::a, abr::new);

   private abr(vv $$0) {
      this($$0.q(), $$0.c(zu.b));
   }

   private void a(vv $$0) {
      $$0.a(this.b);
      $$0.a(this.c, zu.b);
   }

   @Override
   public zh<abr> a() {
      return abp.b;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   @Nullable
   public byte[] e() {
      return this.c;
   }
}
