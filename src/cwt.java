import com.mojang.serialization.MapCodec;

public class cwt extends cvf {
   public static final MapCodec<cwt> a = b(cwt::new);
   public static final die b = did.w;
   public static final die c = did.r;

   @Override
   protected MapCodec<? extends cwt> a() {
      return a;
   }

   public cwt(dhm.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   public void b(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      if ($$3.b() != $$0.b()) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, cvf $$3, hx $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2);
      if ($$6 != $$0.c(b)) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      boolean $$4 = $$1.B($$2);
      if ($$4 != $$0.c(b)) {
         dhn $$5 = $$0;
         if (!$$0.c(b)) {
            $$5 = $$0.a(c);
            $$1.a(null, $$2, $$5.c(c) ? aqv.eU : aqv.eV, aqw.e);
         }

         $$1.a($$2, $$5.a(b, Boolean.valueOf($$4)), 3);
      }
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(c, b);
   }

   @Override
   public boolean d_(dhn $$0) {
      return true;
   }

   @Override
   public int a(dhn $$0, csf $$1, hx $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
