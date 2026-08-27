public class flm<T extends bzw> extends fmz<T> {
   private float q;
   private float r;
   private float s;

   public flm(fpc $$0) {
      super($$0);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.q = $$0.E($$3);
      this.r = $$0.F($$3);
      this.s = $$0.G($$3);
      if (this.q <= 0.0F) {
         this.n.e = 0.0F;
         this.n.g = 0.0F;
         this.j.e = 0.0F;
         this.j.g = 0.0F;
         this.k.e = 0.0F;
         this.k.g = 0.0F;
         this.k.b = -1.2F;
         this.h.e = 0.0F;
         this.i.e = 0.0F;
         this.i.g = 0.0F;
         this.i.b = -1.1F;
         this.i.c = 18.0F;
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$0.A()) {
         this.o.e = (float) (Math.PI / 4);
         this.o.c += -4.0F;
         this.o.d += 5.0F;
         this.n.c += -3.3F;
         this.n.d++;
         this.l.c += 8.0F;
         this.l.d += -2.0F;
         this.m.c += 2.0F;
         this.m.d += -0.8F;
         this.l.e = 1.7278761F;
         this.m.e = 2.670354F;
         this.j.e = (float) (-Math.PI / 20);
         this.j.c = 16.1F;
         this.j.d = -7.0F;
         this.k.e = (float) (-Math.PI / 20);
         this.k.c = 16.1F;
         this.k.d = -7.0F;
         this.h.e = (float) (-Math.PI / 2);
         this.h.c = 21.0F;
         this.h.d = 1.0F;
         this.i.e = (float) (-Math.PI / 2);
         this.i.c = 21.0F;
         this.i.d = 1.0F;
         this.p = 3;
      }
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (this.q > 0.0F) {
         this.n.g = fmy.a(this.n.g, -1.2707963F, this.q);
         this.n.f = fmy.a(this.n.f, 1.2707963F, this.q);
         this.j.e = -1.2707963F;
         this.k.e = -0.47079635F;
         this.k.g = -0.2F;
         this.k.b = -0.2F;
         this.h.e = -0.4F;
         this.i.e = 0.5F;
         this.i.g = -0.5F;
         this.i.b = -0.3F;
         this.i.c = 20.0F;
         this.l.e = fmy.a(this.l.e, 0.8F, this.r);
         this.m.e = fmy.a(this.m.e, -0.4F, this.r);
      }

      if (this.s > 0.0F) {
         this.n.e = fmy.a(this.n.e, -0.58177644F, this.s);
      }
   }
}
