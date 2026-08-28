import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class cjt extends cjr {
   @Nullable
   private cjt a;
   private int b = 1;

   public cjt(bxn<? extends cjt> $$0, dkj $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bF.a(5, new cex(this));
   }

   @Override
   public int fX() {
      return this.x();
   }

   public int x() {
      return super.fX();
   }

   @Override
   protected boolean q() {
      return !this.gu();
   }

   public boolean gu() {
      return this.a != null && this.a.bJ();
   }

   public cjt a(cjt $$0) {
      this.a = $$0;
      $$0.gA();
      return $$0;
   }

   public void gv() {
      this.a.gB();
      this.a = null;
   }

   private void gA() {
      this.b++;
   }

   private void gB() {
      this.b--;
   }

   public boolean gw() {
      return this.gx() && this.b < this.x();
   }

   @Override
   public void h() {
      super.h();
      if (this.gx() && this.dV().A.a(200) == 1) {
         List<? extends cjr> $$0 = this.dV().a((Class<? extends cjr>)this.getClass(), this.cR().c(8.0, 8.0, 8.0));
         if ($$0.size() <= 1) {
            this.b = 1;
         }
      }
   }

   public boolean gx() {
      return this.b > 1;
   }

   public boolean gy() {
      return this.g(this.a) <= 121.0;
   }

   public void gz() {
      if (this.gu()) {
         this.O().a(this.a, 1.0);
      }
   }

   public void a(Stream<? extends cjt> $$0) {
      $$0.limit((long)(this.x() - this.b)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3 == null) {
         $$3 = new cjt.a(this);
      } else {
         this.a(((cjt.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements byx {
      public final cjt a;

      public a(cjt $$0) {
         this.a = $$0;
      }
   }
}
