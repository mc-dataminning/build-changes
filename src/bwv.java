import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class bwv extends bwt {
   @Nullable
   private bwv b;
   private int c = 1;

   public bwv(bkz<? extends bwv> $$0, csf $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(5, new bsc(this));
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

   public bwv a(bwv $$0) {
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
         List<? extends bwt> $$0 = this.dN().a((Class<? extends bwt>)this.getClass(), this.cH().c(8.0, 8.0, 8.0));
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

   public void a(Stream<? extends bwv> $$0) {
      $$0.limit((long)(this.gh() - this.c)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$3 == null) {
         $$3 = new bwv.a(this);
      } else {
         this.a(((bwv.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements bme {
      public final bwv a;

      public a(bwv $$0) {
         this.a = $$0;
      }
   }
}
