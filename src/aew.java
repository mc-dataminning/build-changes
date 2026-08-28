public class aew implements zv<ach> {
   public static final zm<wl, aew> a = zv.a(aew::a, aew::new);
   private final int b;
   private final byte c;

   public aew(bst $$0, byte $$1) {
      this.b = $$0.al();
      this.c = $$1;
   }

   private aew(wl $$0) {
      this.b = $$0.l();
      this.c = $$0.readByte();
   }

   private void a(wl $$0) {
      $$0.c(this.b);
      $$0.k(this.c);
   }

   @Override
   public zx<aew> a() {
      return agt.am;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public bst a(dbx $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
