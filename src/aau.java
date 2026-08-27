public class aau implements uo<zb> {
   private static final int a = 384;
   private final gu b;
   private final String[] c;
   private final boolean d;

   public aau(gu $$0, boolean $$1, String $$2, String $$3, String $$4, String $$5) {
      this.b = $$0;
      this.d = $$1;
      this.c = new String[]{$$2, $$3, $$4, $$5};
   }

   public aau(sf $$0) {
      this.b = $$0.f();
      this.d = $$0.readBoolean();
      this.c = new String[4];

      for (int $$1 = 0; $$1 < 4; $$1++) {
         this.c[$$1] = $$0.e(384);
      }
   }

   @Override
   public void a(sf $$0) {
      $$0.a(this.b);
      $$0.writeBoolean(this.d);

      for (int $$1 = 0; $$1 < 4; $$1++) {
         $$0.a(this.c[$$1]);
      }
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public gu a() {
      return this.b;
   }

   public boolean c() {
      return this.d;
   }

   public String[] d() {
      return this.c;
   }
}
