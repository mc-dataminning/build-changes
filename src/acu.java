import javax.annotation.Nullable;

public class acu implements ze<abq> {
   public static final yv<vx, acu> a = ze.a(acu::a, acu::new);
   private final int b;
   private final byte c;

   public acu(bru $$0, byte $$1) {
      this.b = $$0.al();
      this.c = $$1;
   }

   private acu(vx $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readByte();
   }

   private void a(vx $$0) {
      $$0.p(this.b);
      $$0.k(this.c);
   }

   @Override
   public zg<acu> a() {
      return agb.D;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   @Nullable
   public bru a(dax $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
