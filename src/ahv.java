public class ahv implements zv<agv> {
   public static final zm<wl, ahv> a = zv.a(ahv::a, ahv::new);
   private final boolean b;
   private final boolean c;

   public ahv(boolean $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private ahv(wl $$0) {
      this.b = $$0.readBoolean();
      this.c = $$0.readBoolean();
   }

   private void a(wl $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(agv $$0) {
      $$0.a(this);
   }

   @Override
   public zx<ahv> a() {
      return agt.bG;
   }

   public boolean b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
