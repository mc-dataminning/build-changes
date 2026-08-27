public class adm implements yn<aay> {
   public static final ye<vg, adm> a = yn.a(adm::a, adm::new);
   private final int b;
   private final byte c;

   public adm(bpv $$0, byte $$1) {
      this.b = $$0.aj();
      this.c = $$1;
   }

   private adm(vg $$0) {
      this.b = $$0.l();
      this.c = $$0.readByte();
   }

   private void a(vg $$0) {
      $$0.c(this.b);
      $$0.k(this.c);
   }

   @Override
   public yp<adm> a() {
      return afj.am;
   }

   public void a(aay $$0) {
      $$0.a(this);
   }

   public bpv a(cyx $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
