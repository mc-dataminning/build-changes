public class dds extends ddr {
   private final jb b;

   public dds(djx $$0, iv $$1, jb $$2, czy $$3, jb $$4) {
      super($$0, null, buq.a, $$3, new ffm(ffq.c($$1), $$4, $$1, false));
      this.b = $$2;
   }

   @Override
   public iv a() {
      return this.j().b();
   }

   @Override
   public boolean b() {
      return this.q().a_(this.j().b()).a(this);
   }

   @Override
   public boolean c() {
      return this.b();
   }

   @Override
   public jb d() {
      return jb.a;
   }

   @Override
   public jb[] f() {
      switch (this.b) {
         case a:
         default:
            return new jb[]{jb.a, jb.c, jb.f, jb.d, jb.e, jb.b};
         case b:
            return new jb[]{jb.a, jb.b, jb.c, jb.f, jb.d, jb.e};
         case c:
            return new jb[]{jb.a, jb.c, jb.f, jb.e, jb.b, jb.d};
         case d:
            return new jb[]{jb.a, jb.d, jb.f, jb.e, jb.b, jb.c};
         case e:
            return new jb[]{jb.a, jb.e, jb.d, jb.b, jb.c, jb.f};
         case f:
            return new jb[]{jb.a, jb.f, jb.d, jb.b, jb.c, jb.e};
      }
   }

   @Override
   public jb g() {
      return this.b.o() == jb.a.b ? jb.c : this.b;
   }

   @Override
   public boolean h() {
      return false;
   }

   @Override
   public float i() {
      return (float)(this.b.e() * 90);
   }
}
