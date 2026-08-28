public class ach implements zb<abn> {
   public static final ys<vr, ach> a = zb.a(ach::a, ach::new);
   private final int b;

   public ach(int $$0) {
      this.b = $$0;
   }

   private ach(vr $$0) {
      this.b = $$0.readUnsignedByte();
   }

   private void a(vr $$0) {
      $$0.k(this.b);
   }

   @Override
   public zd<ach> a() {
      return afz.t;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }
}
