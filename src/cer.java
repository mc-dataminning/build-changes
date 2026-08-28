import javax.annotation.Nullable;

public class cer<T extends bvy> extends cep<T> {
   private static final int i = 200;
   private int j = 0;

   public cer(crf $$0, Class<T> $$1, boolean $$2, @Nullable cgp.a $$3) {
      super($$0, $$1, 500, $$2, false, $$3);
   }

   public int i() {
      return this.j;
   }

   public void k() {
      this.j--;
   }

   @Override
   public boolean b() {
      if (this.j > 0 || !this.e.dX().h()) {
         return false;
      } else if (!((crf)this.e).gG()) {
         return false;
      } else {
         this.h();
         return this.c != null;
      }
   }

   @Override
   public void d() {
      this.j = b(200);
      super.d();
   }
}
