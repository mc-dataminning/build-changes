import javax.annotation.Nullable;

public class adk implements zr<acg> {
   public static final zi<wh, adk> a = zr.a(adk::a, adk::new);
   private final int b;
   private final byte c;

   public adk(bvb $$0, byte $$1) {
      this.b = $$0.ar();
      this.c = $$1;
   }

   private adk(wh $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readByte();
   }

   private void a(wh $$0) {
      $$0.q(this.b);
      $$0.l(this.c);
   }

   @Override
   public zt<adk> a() {
      return agz.D;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }

   @Nullable
   public bvb a(dgz $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
