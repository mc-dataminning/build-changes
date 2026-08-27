import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class bwi extends bwg {
   @Nullable
   private bwi b;
   private int c = 1;

   public bwi(bkm<? extends bwi> $$0, crs $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(5, new brp(this));
   }

   @Override
   public int fI() {
      return this.gg();
   }

   public int gg() {
      return super.fI();
   }

   @Override
   protected boolean ge() {
      return !this.gh();
   }

   public boolean gh() {
      return this.b != null && this.b.bv();
   }

   public bwi a(bwi $$0) {
      this.b = $$0;
      $$0.gn();
      return $$0;
   }

   public void gi() {
      this.b.go();
      this.b = null;
   }

   private void gn() {
      this.c++;
   }

   private void go() {
      this.c--;
   }

   public boolean gj() {
      return this.gk() && this.c < this.gg();
   }

   @Override
   public void l() {
      super.l();
      if (this.gk() && this.dL().z.a(200) == 1) {
         List<? extends bwg> $$0 = this.dL().a((Class<? extends bwg>)this.getClass(), this.cG().c(8.0, 8.0, 8.0));
         if ($$0.size() <= 1) {
            this.c = 1;
         }
      }
   }

   public boolean gk() {
      return this.c > 1;
   }

   public boolean gl() {
      return this.f(this.b) <= 121.0;
   }

   public void gm() {
      if (this.gh()) {
         this.L().a(this.b, 1.0);
      }
   }

   public void a(Stream<? extends bwi> $$0) {
      $$0.limit((long)(this.gg() - this.c)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$3 == null) {
         $$3 = new bwi.a(this);
      } else {
         this.a(((bwi.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements blr {
      public final bwi a;

      public a(bwi $$0) {
         this.a = $$0;
      }
   }
}
