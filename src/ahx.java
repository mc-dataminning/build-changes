public class ahx implements zv<agv> {
   public static final zm<wl, ahx> a = zv.a(ahx::a, ahx::new);
   private final int b;
   private final ale c;
   private final boolean d;

   public ahx(int $$0, cyw<?> $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1.a();
      this.d = $$2;
   }

   private ahx(wl $$0) {
      this.b = $$0.readByte();
      this.c = $$0.q();
      this.d = $$0.readBoolean();
   }

   private void a(wl $$0) {
      $$0.k(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zx<ahx> a() {
      return agt.bI;
   }

   public void a(agv $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public ale e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
