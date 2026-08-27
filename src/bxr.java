import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class bxr extends bxp {
   @Nullable
   private bxr b;
   private int c = 1;

   public bxr(blt<? extends bxr> $$0, cti $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(5, new bsx(this));
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
      return this.b != null && this.b.bx();
   }

   public bxr a(bxr $$0) {
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
      if (this.gk() && this.dM().z.a(200) == 1) {
         List<? extends bxp> $$0 = this.dM().a((Class<? extends bxp>)this.getClass(), this.cH().c(8.0, 8.0, 8.0));
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
         this.N().a(this.b, 1.0);
      }
   }

   public void a(Stream<? extends bxr> $$0) {
      $$0.limit((long)(this.gg() - this.c)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public bmy a(ctx $$0, bjt $$1, bmj $$2, @Nullable bmy $$3, @Nullable sl $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$3 == null) {
         $$3 = new bxr.a(this);
      } else {
         this.a(((bxr.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements bmy {
      public final bxr a;

      public a(bxr $$0) {
         this.a = $$0;
      }
   }
}
