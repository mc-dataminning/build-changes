public class acg implements zf<abu> {
   public static final yw<vu, acg> a = zf.a(acg::a, acg::new);
   private final bty b;
   private final boolean c;

   public acg(bty $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private acg(vu $$0) {
      this.b = bty.a($$0.readUnsignedByte());
      this.c = $$0.readBoolean();
   }

   private void a(vu $$0) {
      $$0.l(this.b.a());
      $$0.a(this.c);
   }

   @Override
   public zh<acg> a() {
      return agn.l;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }

   public bty e() {
      return this.b;
   }
}
