public class ael implements zb<abm> {
   public static final ys<vu, ael> a = zb.a(ael::a, ael::new);
   private final int b;

   public ael(int $$0) {
      this.b = $$0;
   }

   private ael(vu $$0) {
      this.b = $$0.readByte();
   }

   private void a(vu $$0) {
      $$0.k(this.b);
   }

   @Override
   public zd<ael> a() {
      return afx.ax;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }
}
