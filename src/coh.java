import javax.annotation.Nullable;

public abstract class coh extends cpa {
   public static final dcv a = ctg.aC;
   public static final dcs b = dcr.r;

   protected coh(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
      if ($$1.B) {
         return bdx.a;
      } else {
         this.a($$1, $$2, $$3);
         return bdx.b;
      }
   }

   protected abstract void a(cmm var1, gu var2, byo var3);

   @Override
   public dcb a(cih $$0) {
      return this.n().a(a, $$0.g().g());
   }

   @Override
   public void a(cmm $$0, gu $$1, dcb $$2, bfz $$3, cfz $$4) {
      if ($$4.A()) {
         czn $$5 = $$0.c_($$1);
         if ($$5 instanceof czc) {
            ((czc)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         czn $$5 = $$1.c_($$2);
         if ($$5 instanceof czc) {
            if ($$1 instanceof aif) {
               bdt.a($$1, $$2, (czc)$$5);
               ((czc)$$5).a((aif)$$1, eei.b($$2));
            }

            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean d_(dcb $$0) {
      return true;
   }

   @Override
   public int a(dcb $$0, cmm $$1, gu $$2) {
      return cbf.a($$1.c_($$2));
   }

   @Override
   public cvs b_(dcb $$0) {
      return cvs.c;
   }

   @Override
   public dcb a(dcb $$0, cvz $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dcb a(dcb $$0, cui $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends czn> czo<T> a(cmm $$0, czp<T> $$1, czp<? extends czc> $$2) {
      return $$0.B ? null : a($$1, $$2, czc::a);
   }
}
