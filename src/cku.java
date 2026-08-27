public class cku extends clj implements cni {
   public cku(clj.a $$0) {
      super($$0);
   }

   @Override
   public bjc<clo> a(csf $$0, cdz $$1, bja $$2) {
      clo $$3 = $$1.b($$2);
      if ($$1.ck != null) {
         if (!$$0.B) {
            int $$4 = $$1.ck.a($$3);
            $$3.a($$4, $$1, $$1x -> $$1x.d($$2));
         }

         $$0.a(null, $$1.ds(), $$1.du(), $$1.dy(), aqv.ij, aqw.g, 1.0F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
         $$1.a(dlx.C);
      } else {
         $$0.a(null, $$1.ds(), $$1.du(), $$1.dy(), aqv.il, aqw.g, 0.5F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
         if (!$$0.B) {
            int $$5 = cqb.c($$3);
            int $$6 = cqb.b($$3);
            $$0.b(new cen($$1, $$0, $$6, $$5));
         }

         $$1.b(arf.c.b(this));
         $$1.a(dlx.D);
      }

      return bjc.a($$3, $$0.y_());
   }

   @Override
   public int c() {
      return 1;
   }
}
