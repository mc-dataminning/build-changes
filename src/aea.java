public class aea implements zb<abm> {
   public static final ys<vu, aea> a = zb.a(aea::a, aea::new);
   private final int b;
   private final byte c;

   public aea(brh $$0, byte $$1) {
      this.b = $$0.aj();
      this.c = $$1;
   }

   private aea(vu $$0) {
      this.b = $$0.l();
      this.c = $$0.readByte();
   }

   private void a(vu $$0) {
      $$0.c(this.b);
      $$0.k(this.c);
   }

   @Override
   public zd<aea> a() {
      return afx.am;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public brh a(dad $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
