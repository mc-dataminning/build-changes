import javax.annotation.Nullable;

public record ace(alp b, @Nullable byte[] c) implements zr<acd> {
   public static final zi<wh, ace> a = zr.a(ace::a, ace::new);

   private ace(wh $$0) {
      this($$0.q(), $$0.c(aag.b));
   }

   private void a(wh $$0) {
      $$0.a(this.b);
      $$0.a(this.c, aag.b);
   }

   @Override
   public zt<ace> a() {
      return acc.b;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   @Nullable
   public byte[] e() {
      return this.c;
   }
}
