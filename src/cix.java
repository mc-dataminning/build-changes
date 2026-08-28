import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class cix extends civ {
   @Nullable
   private cix a;
   private int b = 1;

   public cix(bwr<? extends cix> $$0, djh $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bD.a(5, new ceb(this));
   }

   @Override
   public int fW() {
      return this.x();
   }

   public int x() {
      return super.fW();
   }

   @Override
   protected boolean q() {
      return !this.gt();
   }

   public boolean gt() {
      return this.a != null && this.a.bI();
   }

   public cix a(cix $$0) {
      this.a = $$0;
      $$0.gz();
      return $$0;
   }

   public void gu() {
      this.a.gA();
      this.a = null;
   }

   private void gz() {
      this.b++;
   }

   private void gA() {
      this.b--;
   }

   public boolean gv() {
      return this.gw() && this.b < this.x();
   }

   @Override
   public void h() {
      super.h();
      if (this.gw() && this.dU().A.a(200) == 1) {
         List<? extends civ> $$0 = this.dU().a((Class<? extends civ>)this.getClass(), this.cQ().c(8.0, 8.0, 8.0));
         if ($$0.size() <= 1) {
            this.b = 1;
         }
      }
   }

   public boolean gw() {
      return this.b > 1;
   }

   public boolean gx() {
      return this.g(this.a) <= 121.0;
   }

   public void gy() {
      if (this.gt()) {
         this.O().a(this.a, 1.0);
      }
   }

   public void a(Stream<? extends cix> $$0) {
      $$0.limit((long)(this.x() - this.b)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public byb a(djy $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3 == null) {
         $$3 = new cix.a(this);
      } else {
         this.a(((cix.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements byb {
      public final cix a;

      public a(cix $$0) {
         this.a = $$0;
      }
   }
}
