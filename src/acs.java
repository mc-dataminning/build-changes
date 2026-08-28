public class acs implements zh<abw> {
   public static final yy<wl, acs> a = zh.a(acs::a, acs::new);
   private final int b;
   private final int c;
   private final int d;
   private final czy e;

   public acs(int $$0, int $$1, int $$2, czy $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3.v();
   }

   private acs(wl $$0) {
      this.b = $$0.x();
      this.c = $$0.l();
      this.d = $$0.readShort();
      this.e = czy.h.decode($$0);
   }

   private void a(wl $$0) {
      $$0.f(this.b);
      $$0.c(this.c);
      $$0.m(this.d);
      czy.h.encode($$0, this.e);
   }

   @Override
   public zj<acs> a() {
      return agp.v;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.d;
   }

   public czy f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
