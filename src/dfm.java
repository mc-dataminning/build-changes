import com.mojang.serialization.MapCodec;

public class dfm extends ddy {
   public static final MapCodec<dfm> a = b(dfm::new);
   public static final drs b = drr.w;
   public static final drs c = drr.r;

   @Override
   protected MapCodec<? extends dfm> a() {
      return a;
   }

   public dfm(dra.d $$0) {
      super($$0);
      this.k(this.n().a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof aqm $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, ddy $$3, io $$4, boolean $$5) {
      if ($$1 instanceof aqm $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(drb $$0, aqm $$1, io $$2) {
      boolean $$3 = $$1.C($$2);
      if ($$3 != $$0.c(b)) {
         drb $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? avh.fG : avh.fH, avi.e);
         }

         $$1.a($$2, $$4.a(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean c_(drb $$0) {
      return true;
   }

   @Override
   protected int a(drb $$0, dax $$1, io $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
