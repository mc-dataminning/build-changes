public class ahg implements zs<ags> {
   public static final zj<wl, ahg> a = zs.a(ahg::a, ahg::new);
   private final int b;
   private final int c;

   public ahg(int $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private ahg(wl $$0) {
      this.b = $$0.readByte();
      this.c = $$0.readByte();
   }

   private void a(wl $$0) {
      $$0.k(this.b);
      $$0.k(this.c);
   }

   @Override
   public zu<ahg> a() {
      return agq.br;
   }

   public void a(ags $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
