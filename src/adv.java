import javax.annotation.Nullable;

public class adv implements aac<acr> {
   public static final zt<ws, adv> a = aac.a(adv::a, adv::new);
   private final int b;
   private final byte c;

   public adv(bvj $$0, byte $$1) {
      this.b = $$0.ar();
      this.c = $$1;
   }

   private adv(ws $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readByte();
   }

   private void a(ws $$0) {
      $$0.q(this.b);
      $$0.l(this.c);
   }

   @Override
   public aae<adv> a() {
      return ahk.D;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   @Nullable
   public bvj a(dhh $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
