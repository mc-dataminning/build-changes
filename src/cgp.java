import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class cgp extends cgn {
   @Nullable
   private cgp b;
   private int c = 1;

   public cgp(bul<? extends cgp> $$0, dfb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(5, new cbu(this));
   }

   @Override
   public int aj() {
      return this.gw();
   }

   public int gw() {
      return super.aj();
   }

   @Override
   protected boolean gu() {
      return !this.gx();
   }

   public boolean gx() {
      return this.b != null && this.b.bM();
   }

   public cgp a(cgp $$0) {
      this.b = $$0;
      $$0.gD();
      return $$0;
   }

   public void gy() {
      this.b.gE();
      this.b = null;
   }

   private void gD() {
      this.c++;
   }

   private void gE() {
      this.c--;
   }

   public boolean gz() {
      return this.gA() && this.c < this.gw();
   }

   @Override
   public void l() {
      super.l();
      if (this.gA() && this.dX().A.a(200) == 1) {
         List<? extends cgn> $$0 = this.dX().a((Class<? extends cgn>)this.getClass(), this.cS().c(8.0, 8.0, 8.0));
         if ($$0.size() <= 1) {
            this.c = 1;
         }
      }
   }

   public boolean gA() {
      return this.c > 1;
   }

   public boolean gB() {
      return this.g(this.b) <= 121.0;
   }

   public void gC() {
      if (this.gx()) {
         this.P().a(this.b, 1.0);
      }
   }

   public void a(Stream<? extends cgp> $$0) {
      $$0.limit((long)(this.gw() - this.c)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3 == null) {
         $$3 = new cgp.a(this);
      } else {
         this.a(((cgp.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements bvt {
      public final cgp a;

      public a(cgp $$0) {
         this.a = $$0;
      }
   }
}
