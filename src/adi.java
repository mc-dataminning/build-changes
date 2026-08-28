import javax.annotation.Nullable;

public class adi implements zo<acf> {
   public static final ze<vy, adi> a = zo.a(adi::a, adi::new);
   private final int b;
   private final byte c;

   public adi(bxe $$0, byte $$1) {
      this.b = $$0.ao();
      this.c = $$1;
   }

   private adi(vy $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readByte();
   }

   private void a(vy $$0) {
      $$0.q(this.b);
      $$0.l(this.c);
   }

   @Override
   public zq<adi> a() {
      return agy.C;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   @Nullable
   public bxe a(dkj $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
