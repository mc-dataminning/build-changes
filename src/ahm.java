public class ahm implements yz<afx> {
   public static final yq<wd, ahm> a = yz.a(ahm::a, ahm::new);
   private final int b;
   private final csd c;

   public ahm(int $$0, csd $$1) {
      this.b = $$0;
      this.c = $$1.r();
   }

   private ahm(wd $$0) {
      this.b = $$0.readShort();
      this.c = csd.e.decode($$0);
   }

   private void a(wd $$0) {
      $$0.l(this.b);
      csd.e.encode($$0, this.c);
   }

   @Override
   public zb<ahm> a() {
      return afv.bU;
   }

   public void a(afx $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public csd e() {
      return this.c;
   }
}
