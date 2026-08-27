import javax.annotation.Nullable;

public record abi(akf b, @Nullable byte[] c) implements yz<abh> {
   public static final yq<vs, abi> a = yz.a(abi::a, abi::new);

   private abi(vs $$0) {
      this($$0.q(), $$0.c(zm.b));
   }

   private void a(vs $$0) {
      $$0.a(this.b);
      $$0.a(this.c, zm.b);
   }

   @Override
   public zb<abi> a() {
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
