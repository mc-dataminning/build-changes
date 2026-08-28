public record aem(agk e, byte f) implements zf<abu> {
   public static final yw<wj, aem> a = zf.a(aem::a, aem::new);
   public static final byte b = 1;
   public static final byte c = 2;
   public static final byte d = 3;

   private aem(wj $$0) {
      this(new agk($$0), $$0.readByte());
   }

   private void a(wj $$0) {
      this.e.a($$0);
      $$0.l(this.f);
   }

   @Override
   public zh<aem> a() {
      return agn.ap;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.f & $$0) != 0;
   }

   public agk b() {
      return this.e;
   }

   public byte e() {
      return this.f;
   }
}
