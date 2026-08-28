public class aie implements zq<agw> {
   public static final zh<wg, aie> a = zq.a(aie::a, aie::new);
   private final ctp b;
   private final boolean c;
   private final boolean d;

   public aie(ctp $$0, boolean $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aie(wg $$0) {
      this.b = $$0.b(ctp.class);
      this.c = $$0.readBoolean();
      this.d = $$0.readBoolean();
   }

   private void a(wg $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zs<aie> a() {
      return agu.bQ;
   }

   public void a(agw $$0) {
      $$0.a(this);
   }

   public ctp b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
