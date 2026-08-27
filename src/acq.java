import javax.annotation.Nullable;

public class acq implements zb<abm> {
   public static final ys<vu, acq> a = zb.a(acq::a, acq::new);
   private final int b;
   private final byte c;

   public acq(brh $$0, byte $$1) {
      this.b = $$0.aj();
      this.c = $$1;
   }

   private acq(vu $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readByte();
   }

   private void a(vu $$0) {
      $$0.p(this.b);
      $$0.k(this.c);
   }

   @Override
   public zd<acq> a() {
      return afx.D;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   @Nullable
   public brh a(dad $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
