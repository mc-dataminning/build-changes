import com.mojang.serialization.MapCodec;

public class dgm extends dey {
   public static final MapCodec<dgm> a = b(dgm::new);
   public static final dss b = dsr.w;
   public static final dss c = dsr.r;

   @Override
   protected MapCodec<? extends dgm> a() {
      return a;
   }

   public dgm(dsa.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof are $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dey $$3, iz $$4, boolean $$5) {
      if ($$1 instanceof are $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(dsb $$0, are $$1, iz $$2) {
      boolean $$3 = $$1.C($$2);
      if ($$3 != $$0.c(b)) {
         dsb $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? avz.fG : avz.fH, awa.e);
         }

         $$1.a($$2, $$4.a(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean c_(dsb $$0) {
      return true;
   }

   @Override
   protected int a(dsb $$0, dbx $$1, iz $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
