import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class chu extends chs {
   @Nullable
   private chu a;
   private int b = 1;

   public chu(bvq<? extends chu> $$0, dhh $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(5, new ccz(this));
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

   public chu a(chu $$0) {
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
         List<? extends chs> $$0 = this.dW().a((Class<? extends chs>)this.getClass(), this.cR().c(8.0, 8.0, 8.0));
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

   public void a(Stream<? extends chu> $$0) {
      $$0.limit((long)(this.gp() - this.b)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3 == null) {
         $$3 = new chu.a(this);
      } else {
         this.a(((chu.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements bwy {
      public final chu a;

      public a(chu $$0) {
         this.a = $$0;
      }
   }
}
