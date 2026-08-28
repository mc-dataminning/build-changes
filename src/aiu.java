public class aiu implements aac<ahm> {
   public static final zt<ws, aiu> a = aac.a(aiu::a, aiu::new);
   private final cus b;
   private final boolean c;
   private final boolean d;

   public aiu(cus $$0, boolean $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aiu(ws $$0) {
      this.b = $$0.b(cus.class);
      this.c = $$0.readBoolean();
      this.d = $$0.readBoolean();
   }

   private void a(ws $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public aae<aiu> a() {
      return ahk.bU;
   }

   public void a(ahm $$0) {
      $$0.a(this);
   }

   public cus b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
