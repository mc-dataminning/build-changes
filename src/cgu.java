import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class cgu extends cgs {
   @Nullable
   private cgu a;
   private int b = 1;

   public cgu(buq<? extends cgu> $$0, dgg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bS.a(5, new cbz(this));
   }

   @Override
   public int af() {
      return this.gq();
   }

   public int gq() {
      return super.af();
   }

   @Override
   protected boolean x() {
      return !this.gr();
   }

   public boolean gr() {
      return this.a != null && this.a.bL();
   }

   public cgu a(cgu $$0) {
      this.a = $$0;
      $$0.gx();
      return $$0;
   }

   public void gs() {
      this.a.gy();
      this.a = null;
   }

   private void gx() {
      this.b++;
   }

   private void gy() {
      this.b--;
   }

   public boolean gt() {
      return this.gu() && this.b < this.gq();
   }

   @Override
   public void h() {
      super.h();
      if (this.gu() && this.dW().A.a(200) == 1) {
         List<? extends cgs> $$0 = this.dW().a((Class<? extends cgs>)this.getClass(), this.cR().c(8.0, 8.0, 8.0));
         if ($$0.size() <= 1) {
            this.b = 1;
         }
      }
   }

   public boolean gu() {
      return this.b > 1;
   }

   public boolean gv() {
      return this.g(this.a) <= 121.0;
   }

   public void gw() {
      if (this.gr()) {
         this.L().a(this.a, 1.0);
      }
   }

   public void a(Stream<? extends cgu> $$0) {
      $$0.limit((long)(this.gq() - this.b)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3 == null) {
         $$3 = new cgu.a(this);
      } else {
         this.a(((cgu.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements bvy {
      public final cgu a;

      public a(cgu $$0) {
         this.a = $$0;
      }
   }
}
