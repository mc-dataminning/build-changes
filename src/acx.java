import javax.annotation.Nullable;

public class acx implements zf<abu> {
   public static final yw<vu, acx> a = zf.a(acx::a, acx::new);
   private final int b;
   private final byte c;

   public acx(bwi $$0, byte $$1) {
      this.b = $$0.ao();
      this.c = $$1;
   }

   private acx(vu $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readByte();
   }

   private void a(vu $$0) {
      $$0.q(this.b);
      $$0.l(this.c);
   }

   @Override
   public zh<acx> a() {
      return agn.C;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   @Nullable
   public bwi a(djm $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
