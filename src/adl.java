public record adl(afg e, byte f) implements yn<aay> {
   public static final ye<vr, adl> a = yn.a(adl::a, adl::new);
   public static final byte b = 1;
   public static final byte c = 2;
   public static final byte d = 3;

   private adl(vr $$0) {
      this(new afg($$0), $$0.readByte());
   }

   private void a(vr $$0) {
      this.e.a($$0);
      $$0.k(this.f);
   }

   @Override
   public yp<adl> a() {
      return afj.al;
   }

   public void a(aay $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.f & $$0) != 0;
   }

   public afg b() {
      return this.e;
   }

   public byte e() {
      return this.f;
   }
}
