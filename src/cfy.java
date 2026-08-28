import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class cfy extends cfw {
   @Nullable
   private cfy b;
   private int c = 1;

   public cfy(btv<? extends cfy> $$0, deg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(5, new cbd(this));
   }

   @Override
   public int fS() {
      return this.gr();
   }

   public int gr() {
      return super.fS();
   }

   @Override
   protected boolean gp() {
      return !this.gs();
   }

   public boolean gs() {
      return this.b != null && this.b.bI();
   }

   public cfy a(cfy $$0) {
      this.b = $$0;
      $$0.gy();
      return $$0;
   }

   public void gt() {
      this.b.gz();
      this.b = null;
   }

   private void gy() {
      this.c++;
   }

   private void gz() {
      this.c--;
   }

   public boolean gu() {
      return this.gv() && this.c < this.gr();
   }

   @Override
   public void l() {
      super.l();
      if (this.gv() && this.dS().z.a(200) == 1) {
         List<? extends cfw> $$0 = this.dS().a((Class<? extends cfw>)this.getClass(), this.cO().c(8.0, 8.0, 8.0));
         if ($$0.size() <= 1) {
            this.c = 1;
         }
      }
   }

   public boolean gv() {
      return this.c > 1;
   }

   public boolean gw() {
      return this.g(this.b) <= 121.0;
   }

   public void gx() {
      if (this.gs()) {
         this.P().a(this.b, 1.0);
      }
   }

   public void a(Stream<? extends cfy> $$0) {
      $$0.limit((long)(this.gr() - this.c)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3 == null) {
         $$3 = new cfy.a(this);
      } else {
         this.a(((cfy.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements bvc {
      public final cfy a;

      public a(cfy $$0) {
         this.a = $$0;
      }
   }
}
