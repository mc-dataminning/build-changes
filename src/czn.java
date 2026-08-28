public class czn extends czm {
   private final jl b;

   public czn(dev $$0, jg $$1, jl $$2, cvx $$3, jl $$4) {
      super($$0, null, brx.a, $$3, new ezd(ezh.c($$1), $$4, $$1, false));
      this.b = $$2;
   }

   @Override
   public jg a() {
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
   public jl d() {
      return jl.a;
   }

   @Override
   public jl[] f() {
      switch (this.b) {
         case a:
         default:
            return new jl[]{jl.a, jl.c, jl.f, jl.d, jl.e, jl.b};
         case b:
            return new jl[]{jl.a, jl.b, jl.c, jl.f, jl.d, jl.e};
         case c:
            return new jl[]{jl.a, jl.c, jl.f, jl.e, jl.b, jl.d};
         case d:
            return new jl[]{jl.a, jl.d, jl.f, jl.e, jl.b, jl.c};
         case e:
            return new jl[]{jl.a, jl.e, jl.d, jl.b, jl.c, jl.f};
         case f:
            return new jl[]{jl.a, jl.f, jl.d, jl.b, jl.c, jl.e};
      }
   }

   @Override
   public jl g() {
      return this.b.o() == jl.a.b ? jl.c : this.b;
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
