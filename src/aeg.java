public class aeg implements zw<aci> {
   public static final zn<wm, aeg> a = zw.a(aeg::a, aeg::new);
   private final iz b;
   private final boolean c;

   public aeg(iz $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private aeg(wm $$0) {
      this.b = $$0.e();
      this.c = $$0.readBoolean();
   }

   private void a(wm $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zy<aeg> a() {
      return agu.X;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public iz b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
