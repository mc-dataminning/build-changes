public record adz(afu e, byte f) implements zb<abm> {
   public static final ys<wf, adz> a = zb.a(adz::a, adz::new);
   public static final byte b = 1;
   public static final byte c = 2;
   public static final byte d = 3;

   private adz(wf $$0) {
      this(new afu($$0), $$0.readByte());
   }

   private void a(wf $$0) {
      this.e.a($$0);
      $$0.k(this.f);
   }

   @Override
   public zd<adz> a() {
      return afx.al;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.f & $$0) != 0;
   }

   public afu b() {
      return this.e;
   }

   public byte e() {
      return this.f;
   }
}
