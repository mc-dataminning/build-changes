import javax.annotation.Nullable;

public record abi(aku b, @Nullable byte[] c) implements yv<abh> {
   public static final ym<vl, abi> a = yv.a(abi::a, abi::new);

   private abi(vl $$0) {
      this($$0.q(), $$0.c(zk.b));
   }

   private void a(vl $$0) {
      $$0.a(this.b);
      $$0.a(this.c, zk.b);
   }

   @Override
   public yx<abi> a() {
      return abg.b;
   }

   public void a(abh $$0) {
      $$0.a(this);
   }

   @Nullable
   public byte[] e() {
      return this.c;
   }
}
