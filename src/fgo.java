public class fgo<T extends bja & bze> extends ffg<T> {
   public fgo(fhs $$0) {
      super($$0);
   }

   public static fhy c() {
      fia $$0 = ffg.a(fhw.a, 0.0F);
      fib $$1 = $$0.a();
      $$1.a("right_arm", fhx.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fhu.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fhx.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fhu.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fhx.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fhu.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fhx.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fhu.a(2.0F, 12.0F, 0.0F));
      return fhy.a($$0, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = ffg.a.a;
      this.r = ffg.a.a;
      cix $$4 = $$0.b(bgp.a);
      if ($$4.a(cja.nG) && $$0.fS()) {
         if ($$0.fk() == bis.b) {
            this.s = ffg.a.d;
         } else {
            this.r = ffg.a.d;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      cix $$6 = $$0.eR();
      if ($$0.fS() && ($$6.b() || !$$6.a(cja.nG))) {
         float $$7 = arp.a(this.c * (float) Math.PI);
         float $$8 = arp.a((1.0F - (1.0F - this.c) * (1.0F - this.c)) * (float) Math.PI);
         this.n.g = 0.0F;
         this.o.g = 0.0F;
         this.n.f = -(0.1F - $$7 * 0.6F);
         this.o.f = 0.1F - $$7 * 0.6F;
         this.n.e = (float) (-Math.PI / 2);
         this.o.e = (float) (-Math.PI / 2);
         this.n.e -= $$7 * 1.2F - $$8 * 0.4F;
         this.o.e -= $$7 * 1.2F - $$8 * 0.4F;
         fdt.a(this.n, this.o, $$3);
      }
   }

   @Override
   public void a(bis $$0, elf $$1) {
      float $$2 = $$0 == bis.b ? 1.0F : -1.0F;
      fhs $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
