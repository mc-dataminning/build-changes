import javax.annotation.Nullable;

public class acu implements zc<abr> {
   public static final yt<vr, acu> a = zc.a(acu::a, acu::new);
   private final int b;
   private final byte c;

   public acu(bvs $$0, byte $$1) {
      this.b = $$0.ar();
      this.c = $$1;
   }

   private acu(vr $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readByte();
   }

   private void a(vr $$0) {
      $$0.q(this.b);
      $$0.l(this.c);
   }

   @Override
   public ze<acu> a() {
      return agk.C;
   }

   public void a(abr $$0) {
      $$0.a(this);
   }

   @Nullable
   public bvs a(dhp $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
