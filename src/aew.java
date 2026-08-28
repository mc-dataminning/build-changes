public record aew(agt e, byte f) implements zs<ach> {
   public static final zj<ww, aew> a = zs.a(aew::a, aew::new);
   public static final byte b = 1;
   public static final byte c = 2;
   public static final byte d = 3;

   private aew(ww $$0) {
      this(new agt($$0), $$0.readByte());
   }

   private void a(ww $$0) {
      this.e.a($$0);
      $$0.l(this.f);
   }

   @Override
   public zu<aew> a() {
      return agw.am;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.f & $$0) != 0;
   }

   public agt b() {
      return this.e;
   }

   public byte e() {
      return this.f;
   }
}
