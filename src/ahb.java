public class ahb implements zb<agb> {
   public static final ys<vr, ahb> a = zb.a(ahb::a, ahb::new);
   private final boolean b;
   private final boolean c;

   public ahb(boolean $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private ahb(vr $$0) {
      this.b = $$0.readBoolean();
      this.c = $$0.readBoolean();
   }

   private void a(vr $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(agb $$0) {
      $$0.a(this);
   }

   @Override
   public zd<ahb> a() {
      return afz.bG;
   }

   public boolean b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
