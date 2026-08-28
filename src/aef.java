public class aef implements zv<ach> {
   public static final zm<wl, aef> a = zv.a(aef::a, aef::new);
   private final iz b;
   private final boolean c;

   public aef(iz $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private aef(wl $$0) {
      this.b = $$0.e();
      this.c = $$0.readBoolean();
   }

   private void a(wl $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zx<aef> a() {
      return agt.X;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public iz b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
