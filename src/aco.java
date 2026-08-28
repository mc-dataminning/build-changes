import javax.annotation.Nullable;

public class aco implements yw<abl> {
   public static final yn<vl, aco> a = yw.a(aco::a, aco::new);
   private final int b;
   private final byte c;

   public aco(bva $$0, byte $$1) {
      this.b = $$0.ar();
      this.c = $$1;
   }

   private aco(vl $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readByte();
   }

   private void a(vl $$0) {
      $$0.q(this.b);
      $$0.l(this.c);
   }

   @Override
   public yy<aco> a() {
      return agd.C;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   @Nullable
   public bva a(dgz $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
