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
   protected void C() {
      super.C();
      this.bF.a(5, new cex(this));
   }

   @Override
   public int fX() {
      return this.gw();
   }

   public int gw() {
      return super.fX();
   }

   @Override
   protected boolean gu() {
      return !this.gx();
   }

   public boolean gx() {
      return this.a != null && this.a.bJ();
   }

   public cjt a(cjt $$0) {
      this.a = $$0;
      $$0.gD();
      return $$0;
   }

   public void gy() {
      this.a.gE();
      this.a = null;
   }

   private void gD() {
      this.b++;
   }

   private void gE() {
      this.b--;
   }

   public boolean gz() {
      return this.gA() && this.b < this.gw();
   }

   @Override
   public void g() {
      super.g();
      if (this.gA() && this.dV().A.a(200) == 1) {
         List<? extends cjr> $$0 = this.dV().a((Class<? extends cjr>)this.getClass(), this.cR().c(8.0, 8.0, 8.0));
         if ($$0.size() <= 1) {
            this.b = 1;
         }
      }
   }

   public boolean gA() {
      return this.b > 1;
   }

   public boolean gB() {
      return this.g(this.a) <= 121.0;
   }

   public void gC() {
      if (this.gx()) {
         this.N().a(this.a, 1.0);
      }
   }

   public void a(Stream<? extends cjt> $$0) {
      $$0.limit((long)(this.gw() - this.b)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
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
