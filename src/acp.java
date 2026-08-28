import javax.annotation.Nullable;

public class acp implements yw<abl> {
   public static final yn<vl, acp> a = yw.a(acp::a, acp::new);
   private final int b;
   private final byte c;

   public acp(bum $$0, byte $$1) {
      this.b = $$0.ar();
      this.c = $$1;
   }

   private acp(vl $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readByte();
   }

   private void a(vl $$0) {
      $$0.q(this.b);
      $$0.l(this.c);
   }

   @Override
   public yy<acp> a() {
      return age.D;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   @Nullable
   public bum a(dgj $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
