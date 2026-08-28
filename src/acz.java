import javax.annotation.Nullable;

public class acz implements zh<abw> {
   public static final yy<vw, acz> a = zh.a(acz::a, acz::new);
   private final int b;
   private final byte c;

   public acz(bwt $$0, byte $$1) {
      this.b = $$0.ao();
      this.c = $$1;
   }

   private acz(vw $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readByte();
   }

   private void a(vw $$0) {
      $$0.q(this.b);
      $$0.l(this.c);
   }

   @Override
   public zj<acz> a() {
      return agp.C;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   @Nullable
   public bwt a(djx $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
