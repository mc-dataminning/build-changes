import com.mojang.serialization.MapCodec;

public class cwm extends ctm {
   public static final MapCodec<cwm> a = b(cwm::new);
   protected static final eiy b = cua.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<cwm> a() {
      return a;
   }

   protected cwm(dga.d $$0) {
      super($$0);
   }

   @Override
   public ddx a(ht $$0, dgb $$1) {
      return new dfm($$0, $$1);
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return b;
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, bjt $$3) {
      if ($$1 instanceof alq && $$3.cs() && eiv.c(eiv.a($$3.cG().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), eij.i)) {
         afv<cqz> $$4 = $$1.ac() == cqz.j ? cqz.h : cqz.j;
         alq $$5 = ((alq)$$1).n().a($$4);
         if ($$5 == null) {
            return;
         }

         $$3.b($$5);
      }
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, ate $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(js.Z, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public ckj a(crc $$0, ht $$1, dgb $$2) {
      return ckj.b;
   }

   @Override
   public boolean a(dgb $$0, ebd $$1) {
      return false;
   }
}
