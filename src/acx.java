import javax.annotation.Nullable;

public class acx implements zf<abt> {
   public static final yw<vv, acx> a = zf.a(acx::a, acx::new);
   private final int b;
   private final byte c;

   public acx(bsq $$0, byte $$1) {
      this.b = $$0.an();
      this.c = $$1;
   }

   private acx(vv $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readByte();
   }

   private void a(vv $$0) {
      $$0.p(this.b);
      $$0.k(this.c);
   }

   @Override
   public zh<acx> a() {
      return agf.D;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   @Nullable
   public bsq a(dcu $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
