public class ahg implements yv<agf> {
   public static final ym<vl, ahg> a = yv.a(ahg::a, ahg::new);
   private final boolean b;
   private final boolean c;

   public ahg(boolean $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private ahg(vl $$0) {
      this.b = $$0.readBoolean();
      this.c = $$0.readBoolean();
   }

   private void a(vl $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(agf $$0) {
      $$0.a(this);
   }

   @Override
   public yx<ahg> a() {
      return agd.bN;
   }

   public boolean b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
