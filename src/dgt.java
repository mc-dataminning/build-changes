import com.mojang.serialization.MapCodec;

public class dgt extends dff {
   public static final MapCodec<dgt> a = b(dgt::new);
   public static final dsy b = dsx.w;
   public static final dsy c = dsx.r;

   @Override
   protected MapCodec<? extends dgt> a() {
      return a;
   }

   public dgt(dsg.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof aqk $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dff $$3, ja $$4, boolean $$5) {
      if ($$1 instanceof aqk $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(dsh $$0, aqk $$1, ja $$2) {
      boolean $$3 = $$1.C($$2);
      if ($$3 != $$0.c(b)) {
         dsh $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? avf.fG : avf.fH, avg.e);
         }

         $$1.a($$2, $$4.a(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean c_(dsh $$0) {
      return true;
   }

   @Override
   protected int a(dsh $$0, dcd $$1, ja $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
