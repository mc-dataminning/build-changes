public class aec implements zs<ace> {
   public static final zj<wl, aec> a = zs.a(aec::a, aec::new);
   private final iz b;
   private final boolean c;

   public aec(iz $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private aec(wl $$0) {
      this.b = $$0.e();
      this.c = $$0.readBoolean();
   }

   private void a(wl $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zu<aec> a() {
      return agq.X;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public iz b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
