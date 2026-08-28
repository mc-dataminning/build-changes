import javax.annotation.Nullable;

public record abj(aku b, @Nullable byte[] c) implements yw<abi> {
   public static final yn<vl, abj> a = yw.a(abj::a, abj::new);

   private abj(vl $$0) {
      this($$0.q(), $$0.c(zl.b));
   }

   private void a(vl $$0) {
      $$0.a(this.b);
      $$0.a(this.c, zl.b);
   }

   @Override
   public yy<abj> a() {
      return abh.b;
   }

   public void a(abi $$0) {
      $$0.a(this);
   }

   @Nullable
   public byte[] e() {
      return this.c;
   }
}
