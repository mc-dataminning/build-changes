public class ahy implements zk<agq> {
   public static final zb<wa, ahy> a = zk.a(ahy::a, ahy::new);
   private final csm b;
   private final boolean c;
   private final boolean d;

   public ahy(csm $$0, boolean $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ahy(wa $$0) {
      this.b = $$0.b(csm.class);
      this.c = $$0.readBoolean();
      this.d = $$0.readBoolean();
   }

   private void a(wa $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zm<ahy> a() {
      return ago.bQ;
   }

   public void a(agq $$0) {
      $$0.a(this);
   }

   public csm b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
