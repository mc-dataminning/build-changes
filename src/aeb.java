public record aeb(afw e, byte f) implements zb<abn> {
   public static final ys<wf, aeb> a = zb.a(aeb::a, aeb::new);
   public static final byte b = 1;
   public static final byte c = 2;
   public static final byte d = 3;

   private aeb(wf $$0) {
      this(new afw($$0), $$0.readByte());
   }

   private void a(wf $$0) {
      this.e.a($$0);
      $$0.k(this.f);
   }

   @Override
   public zd<aeb> a() {
      return afz.al;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.f & $$0) != 0;
   }

   public afw b() {
      return this.e;
   }

   public byte e() {
      return this.f;
   }
}
