public class ahx implements yv<agf> {
   public static final ym<vl, ahx> a = yv.a(ahx::a, ahx::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final ji e;
   private final String f;
   private final boolean g;
   private final boolean h;
   private final boolean i;
   private final duh.a j;

   public ahx(ji $$0, String $$1, duh.a $$2, boolean $$3, boolean $$4, boolean $$5) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$2;
   }

   private ahx(vl $$0) {
      this.e = $$0.e();
      this.f = $$0.p();
      this.j = $$0.b(duh.a.class);
      int $$1 = $$0.readByte();
      this.g = ($$1 & 1) != 0;
      this.h = ($$1 & 2) != 0;
      this.i = ($$1 & 4) != 0;
   }

   private void a(vl $$0) {
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.j);
      int $$1 = 0;
      if (this.g) {
         $$1 |= 1;
      }

      if (this.h) {
         $$1 |= 2;
      }

      if (this.i) {
         $$1 |= 4;
      }

      $$0.l($$1);
   }

   @Override
   public yx<ahx> a() {
      return agd.cd;
   }

   public void a(agf $$0) {
      $$0.a(this);
   }

   public ji b() {
      return this.e;
   }

   public String e() {
      return this.f;
   }

   public boolean f() {
      return this.g;
   }

   public boolean g() {
      return this.h;
   }

   public boolean h() {
      return this.i;
   }

   public duh.a i() {
      return this.j;
   }
}
