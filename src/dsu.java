import com.mojang.serialization.MapCodec;

public class dsu extends dpg {
   public static final MapCodec<dsu> b = b(dsu::new);
   public static final ebv c = ebu.A;

   @Override
   public MapCodec<dsu> a() {
      return b;
   }

   public dsu(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(a, jb.d).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if ($$0.c(c)) {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$0.c(a) == $$4 && !$$0.c(c)) {
         this.a($$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private void a(dka $$0, dkm $$1, iv $$2) {
      if (!$$0.A_() && !$$1.U().a($$2, this)) {
         $$1.a($$2, this, 2);
      }
   }

   protected void a(djx $$0, iv $$1, ebe $$2) {
      jb $$3 = $$2.c(a);
      iv $$4 = $$1.a($$3.g());
      eyw $$5 = eys.a($$0, $$3.g(), null);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   @Override
   protected boolean f_(ebe $$0) {
      return true;
   }

   @Override
   protected int b(ebe $$0, djb $$1, iv $$2, jb $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(ebe $$0, djb $$1, iv $$2, jb $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, ebe $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.A_() && $$0.c(c) && !$$1.U().a($$2, this)) {
            ebe $$5 = $$0.b(c, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, boolean $$3) {
      if ($$0.c(c) && $$1.n().a($$2, this)) {
         this.a($$1, $$2, $$0.b(c, Boolean.valueOf(false)));
      }
   }

   @Override
   public ebe a(ddr $$0) {
      return this.m().b(a, $$0.d().g().g());
   }
}
