public class ahw implements zw<agw> {
   public static final zn<wm, ahw> a = zw.a(ahw::a, ahw::new);
   private final boolean b;
   private final boolean c;

   public ahw(boolean $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private ahw(wm $$0) {
      this.b = $$0.readBoolean();
      this.c = $$0.readBoolean();
   }

   private void a(wm $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(agw $$0) {
      $$0.a(this);
   }

   @Override
   public zy<ahw> a() {
      return agu.bG;
   }

   public boolean b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
