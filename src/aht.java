public class aht implements zk<agq> {
   public static final zb<wa, aht> a = zk.a(aht::a, aht::new);
   private final int b;
   private final alb c;
   private final boolean d;

   public aht(int $$0, czv<?> $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1.a();
      this.d = $$2;
   }

   private aht(wa $$0) {
      this.b = $$0.x();
      this.c = $$0.q();
      this.d = $$0.readBoolean();
   }

   private void a(wa $$0) {
      $$0.f(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zm<aht> a() {
      return ago.bL;
   }

   public void a(agq $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public alb e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
