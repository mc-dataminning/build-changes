import org.joml.Vector2i;

public class fnm implements fns {
   private final fme a;
   private final fmn b;

   public fnm(fme $$0) {
      this.a = $$0;
      this.b = new fmn();
   }

   @Override
   public boolean a(cuy $$0) {
      return $$0.g().a(ayd.bT);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, cxo $$3) {
      int $$4 = cwb.j($$3);
      if ($$4 == 0) {
         return false;
      } else {
         Vector2i $$5 = this.b.a($$0, $$1);
         int $$6 = $$5.y == 0 ? -$$5.x : $$5.y;
         if ($$6 != 0) {
            int $$7 = cwb.h($$3);
            int $$8 = fmn.a((double)$$6, $$7, $$4);
            if ($$7 != $$8) {
               this.a($$3, $$2, $$8);
            }
         }

         return true;
      }
   }

   @Override
   public void b(cuy $$0) {
      this.a($$0.g(), $$0.d);
   }

   @Override
   public void a(cuy $$0, ctm $$1) {
      if ($$1 == ctm.b || $$1 == ctm.c) {
         this.a($$0.g(), $$0.d);
      }
   }

   private void a(cxo $$0, int $$1, int $$2) {
      if (this.a.L() != null && $$2 < cwb.j($$0)) {
         gfj $$3 = this.a.L();
         cwb.a($$0, $$2);
         $$3.b(new aiy($$1, $$2));
      }
   }

   public void a(cxo $$0, int $$1) {
      this.a($$0, $$1, -1);
   }
}
