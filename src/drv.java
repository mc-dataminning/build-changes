import com.mojang.serialization.MapCodec;

public class drv extends dno implements dqi, dra {
   public static final MapCodec<drv> a = b(drv::new);
   public static final eco<je> b = ecg.W;

   @Override
   public MapCodec<drv> a() {
      return a;
   }

   protected drv(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, je.k));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b);
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public ebq a(ded $$0) {
      jc $$1 = $$0.k();
      jc $$2;
      if ($$1.o() == jc.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = jc.b;
      }

      return this.m().b(b, je.a($$1, $$2));
   }

   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new dzs($$0, $$1);
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      dyo $$5 = $$1.c_($$2);
      if ($$5 instanceof dzs && $$3.gH()) {
         $$3.a((dzs)$$5);
         return bvc.a;
      } else {
         return bvc.e;
      }
   }

   public static boolean a(ewp.a $$0, ewp.a $$1) {
      jc $$2 = o($$0.a().b());
      jc $$3 = o($$1.a().b());
      jc $$4 = p($$0.a().b());
      jc $$5 = p($$1.a().b());
      dzs.a $$6 = $$0.b();
      boolean $$7 = $$6 == dzs.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.e().equals($$1.c());
   }

   public static jc o(ebq $$0) {
      return $$0.c(b).a();
   }

   public static jc p(ebq $$0) {
      return $$0.c(b).b();
   }
}
