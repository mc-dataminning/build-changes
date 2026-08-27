import com.mojang.serialization.MapCodec;

public class daj extends cyf {
   public static final MapCodec<daj> i = b(daj::new);

   @Override
   public MapCodec<? extends daj> a() {
      return i;
   }

   protected daj(diz.d $$0) {
      super(1.0F, 1.0F, 16.0F, 16.0F, 16.0F, $$0);
      this.k(
         this.E
            .b()
            .a(a, Boolean.valueOf(false))
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
      );
   }

   @Override
   public dja a(cpa $$0) {
      cso $$1 = $$0.q();
      hx $$2 = $$0.a();
      eek $$3 = $$0.q().b_($$0.a());
      hx $$4 = $$2.e();
      hx $$5 = $$2.f();
      hx $$6 = $$2.g();
      hx $$7 = $$2.h();
      dja $$8 = $$1.a_($$4);
      dja $$9 = $$1.a_($$5);
      dja $$10 = $$1.a_($$6);
      dja $$11 = $$1.a_($$7);
      return this.o()
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, ic.d))))
         .a(c, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, ic.c))))
         .a(d, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, ic.f))))
         .a(b, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, ic.e))))
         .a(e, Boolean.valueOf($$3.a() == eel.c));
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eel.c, eel.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public emf c(dja $$0, cso $$1, hx $$2, elr $$3) {
      return emc.a();
   }

   @Override
   public boolean a(dja $$0, dja $$1, ic $$2) {
      if ($$1.a(this)) {
         if (!$$2.o().d()) {
            return true;
         }

         if ($$0.c(f.get($$2)) && $$1.c(f.get($$2.g()))) {
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   public final boolean a(dja $$0, boolean $$1) {
      return !j($$0) && $$1 || $$0.b() instanceof daj || $$0.a(asb.L);
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
