public class aeg implements zs<ach> {
   public static final zj<wi, aeg> a = zs.a(aeg::a, aeg::new);
   private final jh b;
   private final boolean c;

   public aeg(jh $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private aeg(wi $$0) {
      this.b = $$0.e();
      this.c = $$0.readBoolean();
   }

   private void a(wi $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zu<aeg> a() {
      return agw.Y;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public jh b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
