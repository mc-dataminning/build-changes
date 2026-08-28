import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class chn extends chl {
   @Nullable
   private chn a;
   private int b = 1;

   public chn(bvi<? extends chn> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bC.a(5, new ccs(this));
   }

   @Override
   public int ai() {
      return this.x();
   }

   public int x() {
      return super.ai();
   }

   @Override
   protected boolean q() {
      return !this.gs();
   }

   public boolean gs() {
      return this.a != null && this.a.bJ();
   }

   public chn a(chn $$0) {
      this.a = $$0;
      $$0.gy();
      return $$0;
   }

   public void gt() {
      this.a.gz();
      this.a = null;
   }

   private void gy() {
      this.b++;
   }

   private void gz() {
      this.b--;
   }

   public boolean gu() {
      return this.gv() && this.b < this.x();
   }

   @Override
   public void h() {
      super.h();
      if (this.gv() && this.dU().A.a(200) == 1) {
         List<? extends chl> $$0 = this.dU().a((Class<? extends chl>)this.getClass(), this.cQ().c(8.0, 8.0, 8.0));
         if ($$0.size() <= 1) {
            this.b = 1;
         }
      }
   }

   public boolean gv() {
      return this.b > 1;
   }

   public boolean gw() {
      return this.g(this.a) <= 121.0;
   }

   public void gx() {
      if (this.gs()) {
         this.O().a(this.a, 1.0);
      }
   }

   public void a(Stream<? extends chn> $$0) {
      $$0.limit((long)(this.x() - this.b)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3 == null) {
         $$3 = new chn.a(this);
      } else {
         this.a(((chn.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements bwr {
      public final chn a;

      public a(chn $$0) {
         this.a = $$0;
      }
   }
}
