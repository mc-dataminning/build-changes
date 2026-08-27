import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class bwq extends bwo {
   @Nullable
   private bwq b;
   private int c = 1;

   public bwq(bku<? extends bwq> $$0, csa $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(5, new brx(this));
   }

   @Override
   public int fJ() {
      return this.gh();
   }

   public int gh() {
      return super.fJ();
   }

   @Override
   protected boolean gf() {
      return !this.gi();
   }

   public boolean gi() {
      return this.b != null && this.b.bx();
   }

   public bwq a(bwq $$0) {
      this.b = $$0;
      $$0.go();
      return $$0;
   }

   public void gj() {
      this.b.gp();
      this.b = null;
   }

   private void go() {
      this.c++;
   }

   private void gp() {
      this.c--;
   }

   public boolean gk() {
      return this.gl() && this.c < this.gh();
   }

   @Override
   public void l() {
      super.l();
      if (this.gl() && this.dN().z.a(200) == 1) {
         List<? extends bwo> $$0 = this.dN().a((Class<? extends bwo>)this.getClass(), this.cH().c(8.0, 8.0, 8.0));
         if ($$0.size() <= 1) {
            this.c = 1;
         }
      }
   }

   public boolean gl() {
      return this.c > 1;
   }

   public boolean gm() {
      return this.f(this.b) <= 121.0;
   }

   public void gn() {
      if (this.gi()) {
         this.N().a(this.b, 1.0);
      }
   }

   public void a(Stream<? extends bwq> $$0) {
      $$0.limit((long)(this.gh() - this.c)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$3 == null) {
         $$3 = new bwq.a(this);
      } else {
         this.a(((bwq.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements blz {
      public final bwq a;

      public a(bwq $$0) {
         this.a = $$0;
      }
   }
}
