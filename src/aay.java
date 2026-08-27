import javax.annotation.Nullable;

public record aay(ajv b, @Nullable byte[] c) implements yp<aax> {
   public static final yg<vi, aay> a = yp.a(aay::a, aay::new);

   private aay(vi $$0) {
      this($$0.q(), $$0.c(zc.b));
   }

   private void a(vi $$0) {
      $$0.a(this.b);
      $$0.a(this.c, zc.b);
   }

   @Override
   public yr<aay> a() {
      return aaw.b;
   }

   public void a(aax $$0) {
      $$0.a(this);
   }

   @Nullable
   public byte[] e() {
      return this.c;
   }
}
