import javax.annotation.Nullable;

public class adi implements zs<ace> {
   public static final zj<wl, adi> a = zs.a(adi::a, adi::new);
   private final int b;
   private final byte c;

   public adi(bsp $$0, byte $$1) {
      this.b = $$0.al();
      this.c = $$1;
   }

   private adi(wl $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readByte();
   }

   private void a(wl $$0) {
      $$0.p(this.b);
      $$0.k(this.c);
   }

   @Override
   public zu<adi> a() {
      return agq.D;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   @Nullable
   public bsp a(dbt $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
