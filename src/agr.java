public class agr implements yn<afl> {
   public static final ye<vg, agr> a = yn.a(agr::a, agr::new);
   private final cod b;
   private final boolean c;
   private final boolean d;

   public agr(cod $$0, boolean $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private agr(vg $$0) {
      this.b = $$0.b(cod.class);
      this.c = $$0.readBoolean();
      this.d = $$0.readBoolean();
   }

   private void a(vg $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public yp<agr> a() {
      return afj.bL;
   }

   public void a(afl $$0) {
      $$0.a(this);
   }

   public cod b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
