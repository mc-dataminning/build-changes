import javax.annotation.Nullable;

public class aad implements xg<zb> {
   private final int a;
   private final byte b;

   public aad(blw $$0, byte $$1) {
      this.a = $$0.aj();
      this.b = $$1;
   }

   public aad(uj $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readByte();
   }

   @Override
   public void a(uj $$0) {
      $$0.p(this.a);
      $$0.k(this.b);
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   @Nullable
   public blw a(ctx $$0) {
      return $$0.a(this.a);
   }

   public byte a() {
      return this.b;
   }
}
