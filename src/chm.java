import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class chm extends chk {
   @Nullable
   private chm a;
   private int b = 1;

   public chm(bvi<? extends chm> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(5, new ccr(this));
   }

   @Override
   public int ad() {
      return this.gp();
   }

   public int gp() {
      return super.ad();
   }

   @Override
   protected boolean x() {
      return !this.gq();
   }

   public boolean gq() {
      return this.a != null && this.a.bL();
   }

   public chm a(chm $$0) {
      this.a = $$0;
      $$0.gw();
      return $$0;
   }

   public void gr() {
      this.a.gx();
      this.a = null;
   }

   private void gw() {
      this.b++;
   }

   private void gx() {
      this.b--;
   }

   public boolean gs() {
      return this.gt() && this.b < this.gp();
   }

   @Override
   public void h() {
      super.h();
      if (this.gt() && this.dW().A.a(200) == 1) {
         List<? extends chk> $$0 = this.dW().a((Class<? extends chk>)this.getClass(), this.cR().c(8.0, 8.0, 8.0));
         if ($$0.size() <= 1) {
            this.b = 1;
         }
      }
   }

   public boolean gt() {
      return this.b > 1;
   }

   public boolean gu() {
      return this.g(this.a) <= 121.0;
   }

   public void gv() {
      if (this.gq()) {
         this.L().a(this.a, 1.0);
      }
   }

   public void a(Stream<? extends chm> $$0) {
      $$0.limit((long)(this.gp() - this.b)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3 == null) {
         $$3 = new chm.a(this);
      } else {
         this.a(((chm.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements bwq {
      public final chm a;

      public a(chm $$0) {
         this.a = $$0;
      }
   }
}
