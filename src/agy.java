public class agy implements zb<afz> {
   public static final ys<vu, agy> a = zb.a(agy::a, agy::new);
   private final boolean b;
   private final boolean c;

   public agy(boolean $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private agy(vu $$0) {
      this.b = $$0.readBoolean();
      this.c = $$0.readBoolean();
   }

   private void a(vu $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(afz $$0) {
      $$0.a(this);
   }

   @Override
   public zd<agy> a() {
      return afx.bE;
   }

   public boolean b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
