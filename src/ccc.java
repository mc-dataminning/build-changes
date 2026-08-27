import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class ccc extends cca {
   @Nullable
   private ccc b;
   private int c = 1;

   public ccc(bqb<? extends ccc> $$0, cyx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bR.a(5, new bxh(this));
   }

   @Override
   public int fO() {
      return this.gp();
   }

   public int gp() {
      return super.fO();
   }

   @Override
   protected boolean gn() {
      return !this.gq();
   }

   public boolean gq() {
      return this.b != null && this.b.bA();
   }

   public ccc a(ccc $$0) {
      this.b = $$0;
      $$0.gw();
      return $$0;
   }

   public void gr() {
      this.b.gx();
      this.b = null;
   }

   private void gw() {
      this.c++;
   }

   private void gx() {
      this.c--;
   }

   public boolean gs() {
      return this.gt() && this.c < this.gp();
   }

   @Override
   public void l() {
      super.l();
      if (this.gt() && this.dM().z.a(200) == 1) {
         List<? extends cca> $$0 = this.dM().a((Class<? extends cca>)this.getClass(), this.cH().c(8.0, 8.0, 8.0));
         if ($$0.size() <= 1) {
            this.c = 1;
         }
      }
   }

   public boolean gt() {
      return this.c > 1;
   }

   public boolean gu() {
      return this.g(this.b) <= 121.0;
   }

   public void gv() {
      if (this.gq()) {
         this.K().a(this.b, 1.0);
      }
   }

   public void a(Stream<? extends ccc> $$0) {
      $$0.limit((long)(this.gp() - this.c)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3 == null) {
         $$3 = new ccc.a(this);
      } else {
         this.a(((ccc.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements brg {
      public final ccc a;

      public a(ccc $$0) {
         this.a = $$0;
      }
   }
}
