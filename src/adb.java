import javax.annotation.Nullable;

public class adb implements zl<abw> {
   public static final zc<we, adb> a = zl.a(adb::a, adb::new);
   private final int b;
   private final byte c;

   public adb(brv $$0, byte $$1) {
      this.b = $$0.al();
      this.c = $$1;
   }

   private adb(we $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readByte();
   }

   private void a(we $$0) {
      $$0.p(this.b);
      $$0.k(this.c);
   }

   @Override
   public zn<adb> a() {
      return agj.E;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   @Nullable
   public brv a(dca $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
