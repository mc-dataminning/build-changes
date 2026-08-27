import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class byb extends bxz {
   @Nullable
   private byb b;
   private int c = 1;

   public byb(bmc<? extends byb> $$0, ctx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bP.a(5, new btg(this));
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

   public byb a(byb $$0) {
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
      if (this.gl() && this.dL().z.a(200) == 1) {
         List<? extends bxz> $$0 = this.dL().a((Class<? extends bxz>)this.getClass(), this.cH().c(8.0, 8.0, 8.0));
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

   public void a(Stream<? extends byb> $$0) {
      $$0.limit((long)(this.gh() - this.c)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$3 == null) {
         $$3 = new byb.a(this);
      } else {
         this.a(((byb.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements bnh {
      public final byb a;

      public a(byb $$0) {
         this.a = $$0;
      }
   }
}
