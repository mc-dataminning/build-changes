import com.mojang.serialization.MapCodec;

public class dgw extends dfi {
   public static final MapCodec<dgw> a = b(dgw::new);
   public static final dtc b = dtb.w;
   public static final dtc c = dtb.r;

   @Override
   protected MapCodec<? extends dgw> a() {
      return a;
   }

   public dgw(dsk.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof aqm $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dfi $$3, ja $$4, boolean $$5) {
      if ($$1 instanceof aqm $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(dsl $$0, aqm $$1, ja $$2) {
      boolean $$3 = $$1.C($$2);
      if ($$3 != $$0.c(b)) {
         dsl $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? avh.fG : avh.fH, avi.e);
         }

         $$1.a($$2, $$4.a(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean c_(dsl $$0) {
      return true;
   }

   @Override
   protected int a(dsl $$0, dcg $$1, ja $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
