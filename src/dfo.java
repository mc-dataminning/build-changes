import com.mojang.serialization.MapCodec;

public class dfo extends dea {
   public static final MapCodec<dfo> a = b(dfo::new);
   public static final dru b = drt.w;
   public static final dru c = drt.r;

   @Override
   protected MapCodec<? extends dfo> a() {
      return a;
   }

   public dfo(drc.d $$0) {
      super($$0);
      this.k(this.n().a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof aqn $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, dea $$3, io $$4, boolean $$5) {
      if ($$1 instanceof aqn $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(drd $$0, aqn $$1, io $$2) {
      boolean $$3 = $$1.C($$2);
      if ($$3 != $$0.c(b)) {
         drd $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? avi.fG : avi.fH, avj.e);
         }

         $$1.a($$2, $$4.a(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean c_(drd $$0) {
      return true;
   }

   @Override
   protected int a(drd $$0, daz $$1, io $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
