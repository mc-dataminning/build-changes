public class ahz implements zf<agp> {
   public static final yw<vu, ahz> a = zf.a(ahz::a, ahz::new);
   private final cws b;
   private final boolean c;
   private final boolean d;

   public ahz(cws $$0, boolean $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ahz(vu $$0) {
      this.b = $$0.b(cws.class);
      this.c = $$0.readBoolean();
      this.d = $$0.readBoolean();
   }

   private void a(vu $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zh<ahz> a() {
      return agn.bW;
   }

   public void a(agp $$0) {
      $$0.a(this);
   }

   public cws b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
