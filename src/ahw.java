public class ahw implements zp<agv> {
   public static final zg<wf, ahw> a = zp.a(ahw::a, ahw::new);
   private final boolean b;
   private final boolean c;

   public ahw(boolean $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private ahw(wf $$0) {
      this.b = $$0.readBoolean();
      this.c = $$0.readBoolean();
   }

   private void a(wf $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(agv $$0) {
      $$0.a(this);
   }

   @Override
   public zr<ahw> a() {
      return agt.bJ;
   }

   public boolean b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
