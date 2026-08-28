import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class cji extends cjg {
   @Nullable
   private cji a;
   private int b = 1;

   public cji(bxc<? extends cji> $$0, djx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bF.a(5, new cem(this));
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

   public cji a(cji $$0) {
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
         List<? extends cjg> $$0 = this.dV().a((Class<? extends cjg>)this.getClass(), this.cR().c(8.0, 8.0, 8.0));
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

   public void a(Stream<? extends cji> $$0) {
      $$0.limit((long)(this.x() - this.b)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3 == null) {
         $$3 = new cji.a(this);
      } else {
         this.a(((cji.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements bym {
      public final cji a;

      public a(cji $$0) {
         this.a = $$0;
      }
   }
}
