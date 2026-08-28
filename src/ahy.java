public class ahy implements zw<agw> {
   public static final zn<wm, ahy> a = zw.a(ahy::a, ahy::new);
   private final int b;
   private final alf c;
   private final boolean d;

   public ahy(int $$0, cyy<?> $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1.a();
      this.d = $$2;
   }

   private ahy(wm $$0) {
      this.b = $$0.readByte();
      this.c = $$0.q();
      this.d = $$0.readBoolean();
   }

   private void a(wm $$0) {
      $$0.k(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zy<ahy> a() {
      return agu.bI;
   }

   public void a(agw $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public alf e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
