public class aec implements zb<abn> {
   public static final ys<vr, aec> a = zb.a(aec::a, aec::new);
   private final int b;
   private final byte c;

   public aec(bsd $$0, byte $$1) {
      this.b = $$0.al();
      this.c = $$1;
   }

   private aec(vr $$0) {
      this.b = $$0.l();
      this.c = $$0.readByte();
   }

   private void a(vr $$0) {
      $$0.c(this.b);
      $$0.k(this.c);
   }

   @Override
   public zd<aec> a() {
      return afz.am;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public bsd a(dcd $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
