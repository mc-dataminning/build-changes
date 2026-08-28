public class ahs implements zs<ags> {
   public static final zj<wl, ahs> a = zs.a(ahs::a, ahs::new);
   private final boolean b;
   private final boolean c;

   public ahs(boolean $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private ahs(wl $$0) {
      this.b = $$0.readBoolean();
      this.c = $$0.readBoolean();
   }

   private void a(wl $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(ags $$0) {
      $$0.a(this);
   }

   @Override
   public zu<ahs> a() {
      return agq.bG;
   }

   public boolean b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
