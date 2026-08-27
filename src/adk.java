public class adk implements zb<abm> {
   public static final ys<vu, adk> a = zb.a(adk::a, adk::new);
   private final in b;
   private final boolean c;

   public adk(in $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private adk(vu $$0) {
      this.b = $$0.e();
      this.c = $$0.readBoolean();
   }

   private void a(vu $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zd<adk> a() {
      return afx.X;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public in b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
