import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class bvt extends bvr {
   @Nullable
   private bvt b;
   private int c = 1;

   public bvt(bjx<? extends bvt> $$0, cqz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(5, new bra(this));
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

   public bvt a(bvt $$0) {
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
         List<? extends bvr> $$0 = this.dL().a((Class<? extends bvr>)this.getClass(), this.cG().c(8.0, 8.0, 8.0));
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

   public void a(Stream<? extends bvt> $$0) {
      $$0.limit((long)(this.gg() - this.c)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public blc a(cro $$0, bhz $$1, bkn $$2, @Nullable blc $$3, @Nullable rt $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$3 == null) {
         $$3 = new bvt.a(this);
      } else {
         this.a(((bvt.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements blc {
      public final bvt a;

      public a(bvt $$0) {
         this.a = $$0;
      }
   }
}
