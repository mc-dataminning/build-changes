public record aej(agh e, byte f) implements zc<abr> {
   public static final yt<wg, aej> a = zc.a(aej::a, aej::new);
   public static final byte b = 1;
   public static final byte c = 2;
   public static final byte d = 3;

   private aej(wg $$0) {
      this(new agh($$0), $$0.readByte());
   }

   private void a(wg $$0) {
      this.e.a($$0);
      $$0.l(this.f);
   }

   @Override
   public ze<aej> a() {
      return agk.ap;
   }

   public void a(abr $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.f & $$0) != 0;
   }

   public agh b() {
      return this.e;
   }

   public byte e() {
      return this.f;
   }
}
