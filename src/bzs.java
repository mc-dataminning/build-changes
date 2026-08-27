import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class bzs extends bzq {
   @Nullable
   private bzs b;
   private int c = 1;

   public bzs(bnu<? extends bzs> $$0, cvn $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(5, new bux(this));
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

   public bzs a(bzs $$0) {
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
         List<? extends bzq> $$0 = this.dM().a((Class<? extends bzq>)this.getClass(), this.cH().c(8.0, 8.0, 8.0));
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

   public void a(Stream<? extends bzs> $$0) {
      $$0.limit((long)(this.gi() - this.c)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$3 == null) {
         $$3 = new bzs.a(this);
      } else {
         this.a(((bzs.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements boy {
      public final bzs a;

      public a(bzs $$0) {
         this.a = $$0;
      }
   }
}
