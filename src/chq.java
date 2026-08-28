import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class chq extends cho {
   @Nullable
   private chq a;
   private int b = 1;

   public chq(bvm<? extends chq> $$0, dha $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(5, new ccv(this));
   }

   @Override
   public int ad() {
      return this.gn();
   }

   public int gn() {
      return super.ad();
   }

   @Override
   protected boolean x() {
      return !this.go();
   }

   public boolean go() {
      return this.a != null && this.a.bL();
   }

   public chq a(chq $$0) {
      this.a = $$0;
      $$0.gu();
      return $$0;
   }

   public void gp() {
      this.a.gv();
      this.a = null;
   }

   private void gu() {
      this.b++;
   }

   private void gv() {
      this.b--;
   }

   public boolean gq() {
      return this.gr() && this.b < this.gn();
   }

   @Override
   public void h() {
      super.h();
      if (this.gr() && this.dV().A.a(200) == 1) {
         List<? extends cho> $$0 = this.dV().a((Class<? extends cho>)this.getClass(), this.cR().c(8.0, 8.0, 8.0));
         if ($$0.size() <= 1) {
            this.b = 1;
         }
      }
   }

   public boolean gr() {
      return this.b > 1;
   }

   public boolean gs() {
      return this.g(this.a) <= 121.0;
   }

   public void gt() {
      if (this.go()) {
         this.L().a(this.a, 1.0);
      }
   }

   public void a(Stream<? extends chq> $$0) {
      $$0.limit((long)(this.gn() - this.b)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3 == null) {
         $$3 = new chq.a(this);
      } else {
         this.a(((chq.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements bwu {
      public final chq a;

      public a(chq $$0) {
         this.a = $$0;
      }
   }
}
