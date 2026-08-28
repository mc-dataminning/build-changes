public class adb implements zs<ace> {
   public static final zj<ww, adb> a = zs.a(adb::a, adb::new);
   public static final int b = -1;
   public static final int c = -2;
   private final int d;
   private final int e;
   private final int f;
   private final cuk g;

   public adb(int $$0, int $$1, int $$2, cuk $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3.s();
   }

   private adb(ww $$0) {
      this.d = $$0.readByte();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = cuk.h.decode($$0);
   }

   private void a(ww $$0) {
      $$0.k(this.d);
      $$0.c(this.e);
      $$0.l(this.f);
      cuk.h.encode($$0, this.g);
   }

   @Override
   public zu<adb> a() {
      return agq.w;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.d;
   }

   public int e() {
      return this.f;
   }

   public cuk f() {
      return this.g;
   }

   public int g() {
      return this.e;
   }
}
