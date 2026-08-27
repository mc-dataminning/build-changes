import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class cef extends ced {
   @Nullable
   private cef b;
   private int c = 1;

   public cef(bsc<? extends cef> $$0, daz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(5, new bzk(this));
   }

   @Override
   public int ae() {
      return this.gr();
   }

   public int gr() {
      return super.ae();
   }

   @Override
   protected boolean gp() {
      return !this.gs();
   }

   public boolean gs() {
      return this.b != null && this.b.bD();
   }

   public cef a(cef $$0) {
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
      if (this.gv() && this.dP().z.a(200) == 1) {
         List<? extends ced> $$0 = this.dP().a((Class<? extends ced>)this.getClass(), this.cK().c(8.0, 8.0, 8.0));
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
         this.K().a(this.b, 1.0);
      }
   }

   public void a(Stream<? extends cef> $$0) {
      $$0.limit((long)(this.gr() - this.c)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3 == null) {
         $$3 = new cef.a(this);
      } else {
         this.a(((cef.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements btj {
      public final cef a;

      public a(cef $$0) {
         this.a = $$0;
      }
   }
}
