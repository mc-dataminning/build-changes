public class cyy<T extends bwi & bxg> extends czj {
   private final bwr<T> a;
   private final int b;

   public cyy(bwr<T> $$0, int $$1, czj.a $$2) {
      super($$2);
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bug a(djm $$0, crm $$1, buf $$2) {
      czn $$3 = $$1.b($$2);
      if ($$0.C) {
         return bug.e;
      } else {
         bwi $$4 = $$1.dk();
         if ($$1.bX() && $$4 instanceof bxg $$5 && $$4.an() == this.a && $$5.a()) {
            bws $$6 = bxj.d($$2);
            czn $$7 = $$3.a(this.b, czr.sd, $$1, $$6);
            return bug.b.a($$7);
         }

         $$1.b(awx.c.b(this));
         return bug.e;
      }
   }
}
