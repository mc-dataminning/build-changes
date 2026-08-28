import javax.annotation.Nullable;

public class adi implements zp<ace> {
   public static final zg<wf, adi> a = zp.a(adi::a, adi::new);
   private final int b;
   private final byte c;

   public adi(bue $$0, byte $$1) {
      this.b = $$0.as();
      this.c = $$1;
   }

   private adi(wf $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readByte();
   }

   private void a(wf $$0) {
      $$0.q(this.b);
      $$0.l(this.c);
   }

   @Override
   public zr<adi> a() {
      return agt.D;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   @Nullable
   public bue a(dfb $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
