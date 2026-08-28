import javax.annotation.Nullable;

public class aco implements yv<abk> {
   public static final ym<vl, aco> a = yv.a(aco::a, aco::new);
   private final int b;
   private final byte c;

   public aco(buj $$0, byte $$1) {
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
   public yx<aco> a() {
      return agd.D;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   @Nullable
   public buj a(dgg $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
