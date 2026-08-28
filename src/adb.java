import javax.annotation.Nullable;

public class adb implements zj<aby> {
   public static final za<vy, adb> a = zj.a(adb::a, adb::new);
   private final int b;
   private final byte c;

   public adb(bwv $$0, byte $$1) {
      this.b = $$0.ao();
      this.c = $$1;
   }

   private adb(vy $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readByte();
   }

   private void a(vy $$0) {
      $$0.q(this.b);
      $$0.l(this.c);
   }

   @Override
   public zl<adb> a() {
      return agr.C;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   @Nullable
   public bwv a(djz $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
