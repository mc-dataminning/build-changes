import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class bzw extends bzu {
   @Nullable
   private bzw b;
   private int c = 1;

   public bzw(bnw<? extends bzw> $$0, cvr $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(5, new bvb(this));
   }

   @Override
   public int fK() {
      return this.gi();
   }

   public int gi() {
      return super.fK();
   }

   @Override
   protected boolean gg() {
      return !this.gj();
   }

   public boolean gj() {
      return this.b != null && this.b.bx();
   }

   public bzw a(bzw $$0) {
      this.b = $$0;
      $$0.gp();
      return $$0;
   }

   public void gk() {
      this.b.gq();
      this.b = null;
   }

   private void gp() {
      this.c++;
   }

   private void gq() {
      this.c--;
   }

   public boolean gl() {
      return this.gm() && this.c < this.gi();
   }

   @Override
   public void l() {
      super.l();
      if (this.gm() && this.dM().z.a(200) == 1) {
         List<? extends bzu> $$0 = this.dM().a((Class<? extends bzu>)this.getClass(), this.cH().c(8.0, 8.0, 8.0));
         if ($$0.size() <= 1) {
            this.c = 1;
         }
      }
   }

   public boolean gm() {
      return this.c > 1;
   }

   public boolean gn() {
      return this.f(this.b) <= 121.0;
   }

   public void go() {
      if (this.gj()) {
         this.N().a(this.b, 1.0);
      }
   }

   public void a(Stream<? extends bzw> $$0) {
      $$0.limit((long)(this.gi() - this.c)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public bpa a(cwg $$0, blu $$1, bom $$2, @Nullable bpa $$3, @Nullable sw $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$3 == null) {
         $$3 = new bzw.a(this);
      } else {
         this.a(((bzw.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements bpa {
      public final bzw a;

      public a(bzw $$0) {
         this.a = $$0;
      }
   }
}
