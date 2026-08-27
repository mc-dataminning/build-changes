import com.mojang.serialization.MapCodec;

public class dea extends dbw {
   public static final MapCodec<dea> i = b(dea::new);

   @Override
   public MapCodec<? extends dea> a() {
      return i;
   }

   protected dea(dmy.d $$0) {
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
   public dmz a(css $$0) {
      cwf $$1 = $$0.q();
      ib $$2 = $$0.a();
      ein $$3 = $$0.q().b_($$0.a());
      ib $$4 = $$2.e();
      ib $$5 = $$2.f();
      ib $$6 = $$2.g();
      ib $$7 = $$2.h();
      dmz $$8 = $$1.a_($$4);
      dmz $$9 = $$1.a_($$5);
      dmz $$10 = $$1.a_($$6);
      dmz $$11 = $$1.a_($$7);
      return this.o()
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, ih.d))))
         .a(c, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, ih.c))))
         .a(d, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, ih.f))))
         .a(b, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, ih.e))))
         .a(e, Boolean.valueOf($$3.a() == eio.c));
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eio.c, eio.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eqk c(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return eqh.a();
   }

   @Override
   protected boolean a(dmz $$0, dmz $$1, ih $$2) {
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

   public final boolean a(dmz $$0, boolean $$1) {
      return !j($$0) && $$1 || $$0.b() instanceof dea || $$0.a(aun.L);
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
