import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class cen extends cel {
   @Nullable
   private cen b;
   private int c = 1;

   public cen(bsj<? extends cen> $$0, dcd $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(5, new bzs(this));
   }

   @Override
   public int fM() {
      return this.gp();
   }

   public int gp() {
      return super.fM();
   }

   @Override
   protected boolean gn() {
      return !this.gq();
   }

   public boolean gq() {
      return this.b != null && this.b.bD();
   }

   public cen a(cen $$0) {
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
      if (this.gt() && this.dP().z.a(200) == 1) {
         List<? extends cel> $$0 = this.dP().a((Class<? extends cel>)this.getClass(), this.cK().c(8.0, 8.0, 8.0));
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

   public void a(Stream<? extends cen> $$0) {
      $$0.limit((long)(this.gp() - this.c)).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3 == null) {
         $$3 = new cen.a(this);
      } else {
         this.a(((cen.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements btr {
      public final cen a;

      public a(cen $$0) {
         this.a = $$0;
      }
   }
}
