import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class bxw extends bxu {
   @Nullable
   private bxw b;
   private int c = 1;

   public bxw(bly<? extends bxw> $$0, cto $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(5, new btc(this));
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

   public bxw a(bxw $$0) {
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
         List<? extends bxu> $$0 = this.dM().a((Class<? extends bxu>)this.getClass(), this.cH().c(8.0, 8.0, 8.0));
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

   public void a(Stream<? extends bxw> $$0) {
      $$0.limit((long)(this.gg() - this.c)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public bnd a(cud $$0, bjy $$1, bmo $$2, @Nullable bnd $$3, @Nullable sn $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$3 == null) {
         $$3 = new bxw.a(this);
      } else {
         this.a(((bxw.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements bnd {
      public final bxw a;

      public a(bxw $$0) {
         this.a = $$0;
      }
   }
}
